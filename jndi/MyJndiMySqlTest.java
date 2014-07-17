package ccm.jndi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.sql.PreparedStatement;

import static org.junit.Assert.fail;

public class MyJndiMySqlTest {
	@BeforeClass
	public static void setUpClass() throws Exception {
		// rcarver - setup the jndi context and the datasource
		try {
			// Create initial context
			System.setProperty(Context.INITIAL_CONTEXT_FACTORY,
					"org.apache.naming.java.javaURLContextFactory");
			System.setProperty(Context.URL_PKG_PREFIXES, "org.apache.naming");
			InitialContext ic = new InitialContext();

			ic.createSubcontext("java:");
			ic.createSubcontext("java:/comp");
			ic.createSubcontext("java:/comp/env");
			ic.createSubcontext("java:/comp/env/jdbc");

			// Construct DataSource
			BasicDataSource ds = new BasicDataSource();
			ds.setUrl("jdbc:mysql://localhost:3306/ms");
			ds.setUsername("sa");
			ds.setPassword("1234");

			ic.bind("java:/comp/env/jdbc/mysql", ds);
			ic.bind("java:/comp/env/jdbc/abc", ds);
		} catch (NamingException ex) {
			ex.printStackTrace();
			fail("ffff");
		}

	}

	@Test
	public void testCopyM00ToM01() {
		try {

			Context ctx = new InitialContext();
			Context cx = (Context) ctx.lookup("java:/comp/env");
			DataSource ds = (DataSource) cx.lookup("jdbc/mysql");

			Connection conn = ds.getConnection();
			System.out.println("conn name="+ conn.getClass().getName());
			System.out.println(conn.getMetaData().getDatabaseProductName());
			Statement stmt1 = conn.createStatement();
			Statement stmt2 = conn.createStatement();

			ResultSet rset = stmt1.executeQuery("SELECT * FROM MS.TBMSM00 limit 10");
			while (rset.next()) {
				System.out.println("<<<\t" + rset.getObject(1).toString());
				StringBuffer insertSql=new StringBuffer();
				insertSql.append("insert into ms.tbmsm01 ");
				insertSql.append("(COMPID_MSM01, VENDORNO_MSM01,COUNTRYID_MSM01, CVENDORNAME_MSM01) value ('");
				insertSql.append(rset.getString(2)).append("','").append(rset.getString(3)).append("','").append(rset.getString(4)).append("','").append(rset.getString(5)).append("')");
				System.out.println("insertSql=" + insertSql);
				stmt2.executeUpdate(insertSql.toString());
			}
			rset.close();
			stmt1.close();
			stmt2.close();
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			fail("ttt");
		}

	}

	@Test
	public void testCopyM00ToM01Prepared() {
		try {

			Context ctx = new InitialContext();
			Context cx = (Context) ctx.lookup("java:/comp/env");
			DataSource ds = (DataSource) cx.lookup("jdbc/mysql");

			Connection conn = ds.getConnection();
			PreparedStatement stmt1 = conn.prepareStatement("SELECT * FROM MS.TBMSM00 limit 10");
			PreparedStatement stmt2 = conn.prepareStatement("insert into ms.tbmsm01 (COMPID_MSM01, VENDORNO_MSM01,COUNTRYID_MSM01, CVENDORNAME_MSM01) value (?,?,?,?)" );

			stmt1.execute();
			ResultSet rset = stmt1.getResultSet();
			while (rset.next()) {
				System.out.println("<<<\t" + rset.getObject(1).toString());
				stmt2.setString(1,rset.getString(2));
				stmt2.setString(2,rset.getString(3));
				stmt2.setString(3, rset.getString(4));
				stmt2.setString(4, rset.getString(5));
				System.out.println("insertSql=" + rset.getString(2));
				stmt2.execute();
			}
			rset.close();
			stmt1.close();
			stmt2.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("ttt");
		}

	}

	@Ignore
	public void testCopyM01ToM00() {
		try {

			Context ctx = new InitialContext();
			Context cx = (Context) ctx.lookup("java:/comp/env");
			DataSource ds = (DataSource) cx.lookup("jdbc/mysql");

			Connection conn = ds.getConnection();
			Statement stmt1 = conn.createStatement();
			Statement stmt2 = conn.createStatement();

			ResultSet rset = stmt1.executeQuery("SELECT * FROM MS.TBMSM01");
			
			while (rset.next()) {
				System.out.println("<<<\t" + rset.getObject(1).toString());
				StringBuffer insertSql = new StringBuffer();
				insertSql.append("insert into ms.tbmsm00 ");
				insertSql.append("(COMPID_MSM00, VENDORNO_MSM00,COUNTRYID_MSM00, CVENDORNAME_MSM00) value ('");
				insertSql.append(rset.getString(2)).append("','").append(rset.getString(3)).append("','").append(rset.getString(4)).append("','").append(rset.getString(5)).append("')");
				System.out.println("insertSql=" + insertSql);
				stmt2.executeUpdate(insertSql.toString());
			}
			rset.close();
			stmt1.close();
			stmt2.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("uuu");
		}

	}

	
}
