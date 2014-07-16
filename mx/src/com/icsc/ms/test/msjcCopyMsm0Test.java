package com.icsc.ms.test;

import static org.junit.Assert.*;

import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class msjcCopyMsm0Test {

	@BeforeClass
	public static void setUpJndi() {
		try {
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			System.setProperty(Context.INITIAL_CONTEXT_FACTORY,
					"org.apache.naming.java.javaURLContextFactory");
			System.setProperty(Context.URL_PKG_PREFIXES, "org.apache.naming");
			InitialContext ic = new InitialContext();

			ic.createSubcontext("java:");
			ic.createSubcontext("java:comp");
			ic.createSubcontext("java:comp/env");
			ic.createSubcontext("java:comp/env/jdbc");

			// Construct DataSource
			BasicDataSource ds = new BasicDataSource();
			ds.setUrl("jdbc:db2://XXX.XXX.251.179:50000/DB2T");
			ds.setUsername("XXX");
			ds.setPassword("XXX");

			ic.bind("java:comp/env/jdbc/dsdb2P", ds);

		} catch (Exception ex) {
			ex.printStackTrace();
			fail("set up jndi error");
		}

	}

	@Before
	public void clearTBMSM00() {
		Connection conn1 = null;
		Statement stmt1 = null;
		StringBuffer sqlStr1 = null;
		try {
			Context ctx = new InitialContext();
			Context cx = (Context) ctx.lookup("java:comp/env");
			DataSource ds = (DataSource) cx.lookup("jdbc/dsdb2P");

			conn1 = ds.getConnection();
			stmt1 = conn1.createStatement();

			sqlStr1 = new StringBuffer();
			sqlStr1.append("DELETE FROM MS.TBMSM00");

			try {
				stmt1.execute(sqlStr1.toString());
				conn1.commit();
			} catch (SQLException sqlex) {
				System.out.println(sqlex.getMessage());
				System.out.println(sqlex.getErrorCode());
			}

		} catch (Exception ex) {
			// handle any errors
			ex.printStackTrace();
			Assert.fail("有問題!!!" + ex.getMessage());
		} finally {

			if (stmt1 != null) {
				try {
					stmt1.close();
				} catch (SQLException sqlEx) {
				} // ignore

				stmt1 = null;
			}
			try {
				conn1.close();
				conn1 = null;
			} catch (Exception e) {
				fail("conn1.close err");
			}
		}
	}

	@Ignore
	@Test(expected = SQLException.class)
	public void testReadFromTBMSM0AndWriteTBMSM00PreparedStatementCharErr()
			throws SQLException {
		// 8sec
		Connection conn1 = null, conn2 = null;
		Statement stmt1 = null;
		PreparedStatement pstmt2 = null;
		StringBuffer sqlStr1 = null, sqlStr2 = null;
		ResultSet rs = null;
		try {
			Context ctx = new InitialContext();
			Context cx = (Context) ctx.lookup("java:comp/env");
			DataSource ds = (DataSource) cx.lookup("jdbc/dsdb2P");

			conn1 = ds.getConnection();
			stmt1 = conn1.createStatement();

			sqlStr1 = new StringBuffer();
			sqlStr1.append("SELECT * FROM MS.TBMSM0 where VENDOR_CD_MSM0='76368765'");
			stmt1.execute(sqlStr1.toString());

			conn2 = ds.getConnection();
			sqlStr2 = new StringBuffer();
			sqlStr2.append("INSERT INTO MS.TBMSM00 (");
			sqlStr2.append("compId_MSM00,vendorNo_MSM00,cVendorName_MSM00");
			sqlStr2.append(") VALUES (");
			sqlStr2.append("?,?,?");
			sqlStr2.append(")");
			pstmt2 = conn2.prepareStatement(sqlStr2.toString());

			rs = stmt1.getResultSet();
			while (rs.next()) {
				System.out.print("vendorcd: " + rs.getString(1));
				System.out.print("\t");
				System.out.print("vendorname: " + rs.getString(3));
				System.out.println();

				pstmt2.setString(1, "0000");
				pstmt2.setString(2, rs.getString(1));
				pstmt2.setString(3, rs.getString(3));
				try {
					pstmt2.addBatch();
				} catch (SQLException sqlex) {
					System.out.println(sqlex.getMessage());
					System.out.println(sqlex.getErrorCode());
				}
			}
			pstmt2.executeBatch();
			conn2.commit();
		} catch (SQLException ex) {
			// handle any errors
			ex.printStackTrace();
			throw ex;
		} catch (Exception ex) {
			// handle any errors
			ex.printStackTrace();
			Assert.fail("有問題!!!" + ex.getMessage());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) {
				} // ignore

				rs = null;
			}

			if (stmt1 != null) {
				try {
					stmt1.close();
				} catch (SQLException sqlEx) {
				} // ignore

				stmt1 = null;
			}
			if (pstmt2 != null) {
				try {
					pstmt2.close();
				} catch (SQLException sqlEx) {
				} // ignore

				pstmt2 = null;
			}
			try {
				conn1.close();
				conn1 = null;
			} catch (Exception e) {
				fail("conn1.close err");
			}
			try {
				conn2.close();
				conn2 = null;
			} catch (Exception e) {
				fail("conn2.close err");
			}
		}
	}

	@Test
	public void testReadFromTBMSM0AndWriteTBMSM00PreparedStatementBatch() {
		// 8sec
		Connection conn1 = null, conn2 = null;
		Statement stmt1 = null;
		PreparedStatement pstmt2 = null;
		StringBuffer sqlStr1 = null, sqlStr2 = null;
		ResultSet rs = null;
		try {
			Context ctx = new InitialContext();
			Context cx = (Context) ctx.lookup("java:comp/env");
			DataSource ds = (DataSource) cx.lookup("jdbc/dsdb2P");

			conn1 = ds.getConnection();
			stmt1 = conn1.createStatement();

			sqlStr1 = new StringBuffer();
			sqlStr1.append("SELECT * FROM MS.TBMSM0 where vendor_cd_msm0 not in ('76368765') fetch first 50000 rows only");
			stmt1.execute(sqlStr1.toString());

			conn2 = ds.getConnection();
			sqlStr2 = new StringBuffer();
			sqlStr2.append("INSERT INTO MS.TBMSM00 (");
			sqlStr2.append("compId_MSM00,vendorNo_MSM00,cVendorName_MSM00");
			sqlStr2.append(") VALUES (");
			sqlStr2.append("?,?,?");
			sqlStr2.append(")");
			pstmt2 = conn2.prepareStatement(sqlStr2.toString());

			rs = stmt1.getResultSet();
			while (rs.next()) {
				// System.out.print("vendorcd: " + rs.getString(1));
				// System.out.print("\t");
				// System.out.print("vendorname: " + rs.getString(3));
				// System.out.println();

				pstmt2.setString(1, "0000");
				pstmt2.setString(2, rs.getString(1));
				pstmt2.setString(3, rs.getString(3));
				try {
					pstmt2.addBatch();
				} catch (SQLException sqlex) {
					System.out.println(sqlex.getMessage());
					System.out.println(sqlex.getErrorCode());
				}
			}
			try {
				int[] updateCounts = pstmt2.executeBatch();
				
				for (int i = 0; i < updateCounts.length; i++) {
				      if (updateCounts[i] >= 0) {
				        // Successfully executed; the number represents number of affected rows
				        System.out.println(i+",OK: updateCount=" + updateCounts[i]);
				      } else if (updateCounts[i] == Statement.SUCCESS_NO_INFO) {
				        // Successfully executed; number of affected rows not available
				        System.out.println(i+",OK: updateCount=Statement.SUCCESS_NO_INFO");
				      } else if (updateCounts[i] == Statement.EXECUTE_FAILED) {
				        System.out.println(i+",updateCount=Statement.EXECUTE_FAILED");
				      }
				}
				
			} catch (BatchUpdateException ex) {
				System.out.println("err=" + ex.getMessage());
				int[] updateCounts = ex.getUpdateCounts();
				
				for (int i = 0; i < updateCounts.length; i++) {
				      if (updateCounts[i] >= 0) {
				        // Successfully executed; the number represents number of affected rows
				        System.out.println(i+",ex,OK: updateCount=" + updateCounts[i]);
				      } else if (updateCounts[i] == Statement.SUCCESS_NO_INFO) {
				        // Successfully executed; number of affected rows not available
				        System.out.println(i+",ex,OK: updateCount=Statement.SUCCESS_NO_INFO");
				      } else if (updateCounts[i] == Statement.EXECUTE_FAILED) {
				        System.out.println(i+",ex,updateCount=Statement.EXECUTE_FAILED");
				      }
				}

			}
			conn2.commit();
		} catch (Exception ex) {
			// handle any errors
			ex.printStackTrace();
			Assert.fail("有問題!!!" + ex.getMessage());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) {
				} // ignore

				rs = null;
			}

			if (stmt1 != null) {
				try {
					stmt1.close();
				} catch (SQLException sqlEx) {
				} // ignore

				stmt1 = null;
			}
			if (pstmt2 != null) {
				try {
					pstmt2.close();
				} catch (SQLException sqlEx) {
				} // ignore

				pstmt2 = null;
			}
			try {
				conn1.close();
				conn1 = null;
			} catch (Exception e) {
				fail("conn1.close err");
			}
			try {
				conn2.close();
				conn2 = null;
			} catch (Exception e) {
				fail("conn2.close err");
			}
		}
	}

	@Ignore
	public void testReadFromTBMSM0AndWriteTBMSM00PreparedStatement() {
		// 63sec with commit, 66sec no commit
		Connection conn1 = null, conn2 = null;
		Statement stmt1 = null;
		PreparedStatement pstmt2 = null;
		StringBuffer sqlStr1 = null, sqlStr2 = null;
		ResultSet rs = null;
		try {
			Context ctx = new InitialContext();
			Context cx = (Context) ctx.lookup("java:comp/env");
			DataSource ds = (DataSource) cx.lookup("jdbc/dsdb2P");

			conn1 = ds.getConnection();
			stmt1 = conn1.createStatement();

			sqlStr1 = new StringBuffer();
			sqlStr1.append("SELECT * FROM MS.TBMSM0 fetch first 1000 rows only");
			stmt1.execute(sqlStr1.toString());

			conn2 = ds.getConnection();
			sqlStr2 = new StringBuffer();
			sqlStr2.append("INSERT INTO MS.TBMSM00 (");
			sqlStr2.append("compId_MSM00,vendorNo_MSM00,cVendorName_MSM00");
			sqlStr2.append(") VALUES (");
			sqlStr2.append("?,?,?");
			sqlStr2.append(")");
			pstmt2 = conn2.prepareStatement(sqlStr2.toString());

			rs = stmt1.getResultSet();
			while (rs.next()) {
				System.out.print("vendorcd: " + rs.getString(1));
				System.out.print("\t");
				System.out.print("vendorname: " + rs.getString(3));
				System.out.println();

				pstmt2.setString(1, "0000");
				pstmt2.setString(2, rs.getString(1));
				pstmt2.setString(3, rs.getString(3));
				try {
					pstmt2.execute();
					conn2.commit();
				} catch (SQLException sqlex) {
					System.out.println(sqlex.getMessage());
					System.out.println(sqlex.getErrorCode());
				}
			}

		} catch (Exception ex) {
			// handle any errors
			ex.printStackTrace();
			Assert.fail("有問題!!!" + ex.getMessage());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) {
				} // ignore

				rs = null;
			}

			if (stmt1 != null) {
				try {
					stmt1.close();
				} catch (SQLException sqlEx) {
				} // ignore

				stmt1 = null;
			}
			if (pstmt2 != null) {
				try {
					pstmt2.close();
				} catch (SQLException sqlEx) {
				} // ignore

				pstmt2 = null;
			}
			try {
				conn1.close();
				conn1 = null;
			} catch (Exception e) {
				fail("conn1.close err");
			}
			try {
				conn2.close();
				conn2 = null;
			} catch (Exception e) {
				fail("conn2.close err");
			}
		}
	}

	@Ignore("68sec with commit, 234sec no commit")
	public void testReadFromTBMSM0AndWriteTBMSM00() {
		Connection conn1 = null, conn2 = null;
		Statement stmt1 = null, stmt2 = null;
		StringBuffer sqlStr1 = null, sqlStr2 = null;
		ResultSet rs = null;
		try {
			Context ctx = new InitialContext();
			Context cx = (Context) ctx.lookup("java:comp/env");
			DataSource ds = (DataSource) cx.lookup("jdbc/dsdb2P");

			conn1 = ds.getConnection();
			stmt1 = conn1.createStatement();

			sqlStr1 = new StringBuffer();
			sqlStr1.append("SELECT * FROM MS.TBMSM0 fetch first 1000 rows only");
			stmt1.execute(sqlStr1.toString());

			conn2 = ds.getConnection();
			stmt2 = conn2.createStatement();

			rs = stmt1.getResultSet();
			while (rs.next()) {
				System.out.print("vendorcd: " + rs.getString(1));
				System.out.print("\t");
				System.out.print("vendorname: " + rs.getString(3));
				System.out.println();

				sqlStr2 = new StringBuffer();
				sqlStr2.append("INSERT INTO MS.TBMSM00 (");
				sqlStr2.append("compId_MSM00,vendorNo_MSM00,cVendorName_MSM00");
				sqlStr2.append(") VALUES (");
				sqlStr2.append("'").append("0000").append("'");
				sqlStr2.append(",");
				sqlStr2.append("'").append(rs.getString(1)).append("'");
				sqlStr2.append(",");
				sqlStr2.append("'").append(rs.getString(3)).append("'");
				sqlStr2.append(")");
				// System.out.println("sqlStr2=" + sqlStr2.toString());
				conn2.commit();
				try {
					stmt2.execute(sqlStr2.toString());
				} catch (SQLException sqlex) {
					System.out.println(sqlex.getMessage());
					System.out.println(sqlex.getErrorCode());
				}
			}

		} catch (Exception ex) {
			// handle any errors
			ex.printStackTrace();
			Assert.fail("有問題!!!" + ex.getMessage());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) {
				} // ignore

				rs = null;
			}

			if (stmt1 != null) {
				try {
					stmt1.close();
				} catch (SQLException sqlEx) {
				} // ignore

				stmt1 = null;
			}
			if (stmt2 != null) {
				try {
					stmt2.close();
				} catch (SQLException sqlEx) {
				} // ignore

				stmt2 = null;
			}
			try {
				conn1.close();
				conn1 = null;
			} catch (Exception e) {
				fail("conn1.close err");
			}
			try {
				conn2.close();
				conn2 = null;
			} catch (Exception e) {
				fail("conn2.close err");
			}
		}
	}

	@Ignore("Test ok!")
	public void testReadFromTBMSM0() {
		Connection conn1 = null;
		Statement stmt1 = null;
		ResultSet rs = null;
		try {
			Context ctx = new InitialContext();
			Context cx = (Context) ctx.lookup("java:comp/env");
			DataSource ds = (DataSource) cx.lookup("jdbc/dsdb2P");

			conn1 = ds.getConnection();
			stmt1 = conn1.createStatement();
			stmt1.execute("SELECT * FROM MS.TBMSM0 fetch first 10 rows only");
			rs = stmt1.getResultSet();
			while (rs.next()) {
				System.out.print("vendorcd: " + rs.getString(1));
				System.out.print("\t");
				System.out.print("vendorname: " + rs.getString(3));
				System.out.println();
			}

		} catch (Exception ex) {
			// handle any errors
			ex.printStackTrace();
			Assert.fail("有問題!!!" + ex.getMessage());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) {
				} // ignore

				rs = null;
			}

			if (stmt1 != null) {
				try {
					stmt1.close();
				} catch (SQLException sqlEx) {
				} // ignore

				stmt1 = null;
			}
			try {
				conn1.close();
				conn1 = null;
			} catch (Exception e) {
				fail("conn1.close err");
			}
		}
	}

}
