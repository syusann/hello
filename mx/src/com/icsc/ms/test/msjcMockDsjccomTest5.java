package com.icsc.ms.test;

import java.nio.file.Files;
import java.io.File;
import org.apache.commons.io.FileUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.icsc.dpms.de.dejc301;
import com.icsc.dpms.de.dejc318;
import com.icsc.dpms.de.dejcCommonDAO;
import com.icsc.dpms.de.dez.structs.func.dezcTransactionPool;
import com.icsc.dpms.ds.dsjccom;
import com.icsc.ms.dao.msjcTBMSM00DAO;
import com.icsc.ms.util.msjcCrossDB;

public class msjcMockDsjccomTest5 {

	private String appId = "mpjcMockDsjccomTest".toUpperCase();
	private static dsjccom dsCom;

	@BeforeClass
	public static void setUpDsCom() throws Exception {
		FileUtils.copyFile(new File("..\\erp.ini"),
				new File("erp.ini"));
		FileUtils.copyDirectory(new File("..\\config\\csc\\de"),
				new File("config\\csc\\de"));
		dsCom = new msjcMockDsjccom().getMockDsjccomWithJndiDB2();

	}

	@AfterClass
	public static void tearDownDsCom() throws Exception {
		Files.delete(new File("erp.ini").toPath());

	}

	@Test
	public void testMock() throws Exception {

		String result = "";

		System.out.println("dsCom.companyId=" + dsCom.companyId);
		System.out.println("dsCom.linkType=" + dsCom.linkType);
		System.out.println("dsCom.appId=" + dsCom.appId);
		System.out.println("dsCom.db.dataSource=" + dsCom.db.dataSource);
		System.out.println("dsCom.db.linkFlag=" + dsCom.db.linkFlag);
		System.out.println("dsCom.db.userId=" + dsCom.db.userId);
		System.out.println("dsCom.db.passwd=" + dsCom.db.passwd);
		System.out.println("dsCom.db.driver=" + dsCom.db.driver);
		System.out.println("dsCom.db.url=" + dsCom.db.url);

		try {

			dezcTransactionPool transactionPool = new dezcTransactionPool(
					dsCom, dsCom.appId);
			Connection con = null;
			try {
				con = transactionPool.getConnection("ms", "MS.TBMSM0");
			} catch (Exception e) {
			}

			Statement stmt = null;
			ResultSet rs = null;
			stmt = con.createStatement();
			stmt.execute("SELECT * FROM MS.TBMSM0 fetch first 10 rows only");
			rs = stmt.getResultSet();

			while (rs.next()) {
				result = rs.getString(1).trim() + " ; "
						+ rs.getString(2).trim();
				// out.print("result = "+rs.getString(1)+"<br>");
				System.out.println(result);
			}

			// System.out.print("連線OK !");

			con.close();
		} catch (Exception ex) {
			System.out.println("連線不OK !");
			ex.printStackTrace();
		} finally {
		}

	}

	@Ignore
	public void testMockDB2() throws Exception {
		// 取得某個dataSource的Connection :
		msjcMockDsjccom dsComObj = new msjcMockDsjccom();
		dsjccom dsCom = dsComObj.getMockDsjccomDB2();

		String result = "";
		dejc301 de301 = null;

		try {
			de301 = new dejc301();
			Connection con = de301.getConnection(dsCom, appId);

			de301.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
			de301.setAutoCommit(true);

			String sql = "select * from ms.tbmsm0 fetch first 10 rows only";

			ResultSet rs = de301.query(con, sql);
			while (rs.next()) {
				result = rs.getString(1).trim() + " ; "
						+ rs.getString(2).trim();
				// out.print("result = "+rs.getString(1)+"<br>");
				System.out.println(result);
			}

			// System.out.print("連線OK !");

			de301.sqlClose();
		} catch (Exception ex) {
			System.out.println("連線不OK !");
			ex.printStackTrace();
		} finally {
			de301.close();
			de301 = null;
		}

	}

	@Ignore
	public void testMockCrossDB() throws Exception {
		// 取得某個dataSource的Connection :
		msjcMockDsjccom dsComObj = new msjcMockDsjccom();
		dsjccom dsCom = dsComObj.getMockDsjccomDB2();

		String result = "";
		Connection con = null;
		try {
			con = msjcCrossDB.getConn(dsCom, "MS.TBMSM00");
			String sql = "select * from ms.tbmsm00 fetch first 10 rows only";
			msjcTBMSM00DAO dao = new msjcTBMSM00DAO(dsCom, con);
			List<Map> msDataList = msjcCrossDB.doQurery(dsCom, null,
					"MS.TBMSM0", " 1 ", 1, 100);
			for (Map dataMap : msDataList) {
				result = dataMap.toString();
				System.out.println(result);
			}

			// System.out.print("連線OK !");

		} catch (Exception ex) {
			System.out.println("連線不OK !");
			ex.printStackTrace();
		} finally {
			con.close();
		}

	}
}
