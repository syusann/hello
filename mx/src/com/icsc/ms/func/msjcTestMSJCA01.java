package com.icsc.ms.func;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingEnumeration;

import org.apache.commons.lang.StringUtils;

import com.icsc.dpms.de.dez.structs.func.dezcFunctionalController;
import com.icsc.dpms.de.dez.structs.func.dezcTransactionPool;
import com.icsc.dpms.dq.pool.threadPool.util.dqjcPoolUtils;
import com.icsc.ms.api.msjcApiA01;

public class msjcTestMSJCA01 extends dezcFunctionalController {
	public final static String CLASS_VERSION = "$Revision: 1.7 $ $Date: 2014/06/27 07:42:10 $";
	public final static String AppId = "msjcCMX".toUpperCase();
	
	public void init(String method) {
		
	}
	 
	protected void validateAction(String method) {

	}
	
	/**
	 *  執行 welcome
	 * @throws Exception
	 */
	public void welcome() throws Exception {
		
		setMsg("歡迎使用");
	}
	
	public void excuteM01() throws Exception {
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

			InitialContext ctx = new InitialContext();
			NamingEnumeration<NameClassPair> list = ctx.list("");
			while (list.hasMore()) {
				System.out.println(list.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		String compId = (String) infoIn.getComponentValue("compId");
		String vendorNo = (String) infoIn.getComponentValue("vendorNo");
		String adty = (String) infoIn.getComponentValue("adty");
		String option = (String) infoIn.getParameter("form1.opt");
		msjcApiA01 m01 = new msjcApiA01(dsCom);
		String msg = "";
		switch(Integer.parseInt(option)){
			case 0:
				//msg = msjcApiA01.getVendorName(dsCom, compId, vendorNo);
				try {

					dezcTransactionPool transactionPool = new dezcTransactionPool(
							dsCom, dsCom.appId);
					Connection con = null;
					try {
						con = transactionPool.getConnection("ms", "MS.TBMSM00");
					} catch (Exception e) {
					}

					Statement stmt = null;
					ResultSet rs = null;
					stmt = con.createStatement();
					stmt.execute("SELECT * FROM MS.TBMSM00 fetch first 10 rows only");
					rs = stmt.getResultSet();

					while (rs.next()) {
						msg = msg+vendorNo+":"+rs.getString(2).trim() + "/"
								+ rs.getString(3).trim() + "/"
						+ rs.getString(3).trim();
					}

					rs.close();
					stmt.close();
					con.close();
				} catch (Exception ex) {
					System.out.println("連線不OK !");
					ex.printStackTrace();
				} finally {
				}

				break;
			case 1:
				msg = msjcApiA01.getVendorName(dsCom, compId, vendorNo);
				break;
			case 2:
				msg = msjcApiA01.getVendorNameExp(dsCom, compId, vendorNo);
				break;
			case 3:
				msg = msjcApiA01.getVendorAbbrevName(dsCom, compId, vendorNo);
				break;
			case 4:
				msg = msjcApiA01.getVendorAbbrevNameExp(dsCom, compId, vendorNo);
				break;
			case 5:
				msg = msjcApiA01.getVendoContryId(dsCom, compId, vendorNo);
				break;
			case 6:
				msg = msjcApiA01.getVendoContryIdExp(dsCom, compId, vendorNo);
				break;
			case 7:
				msg = msjcApiA01.isVendorExist(dsCom, compId, vendorNo)+"";
				break;
			case 8:
				msg = msjcApiA01.isVendorReject(dsCom, compId, vendorNo)+"";
				break;
			case 9:
				msg = m01.getVendoBean(compId, vendorNo).toString();
				break;
			case 10:
				msg = m01.getVendoBeanExp(compId, vendorNo).toString();
				break;
			case 11:
				msg = m01.getVendoBean(compId, vendorNo,adty).toString();
				break;
			case 12:
				msg = m01.getVendoBeanExp(compId, vendorNo,adty).toString();
				break;
			case 13:
				msg = m01.getVendoPayBean(compId, vendorNo).toString();
				break;
			case 14:
				msg = m01.getVendoPayBeanExp(compId, vendorNo,adty).toString();
				break;
			case 15:
				msg = m01.getVendoPayBeans(compId, vendorNo).toString();
				break;
			case 16:
				msg = m01.getVendoPayBeansExp(compId, vendorNo).toString();
				break;
			case 17:
				msg = msjcApiA01.getVendorDataType(dsCom,compId, vendorNo);
				break;
			default:
				break;
		}
		if(StringUtils.isBlank(msg)){
			msg = "查無相符合資料";
		}
		setMsg(msg);
	}
	
	protected void handleException(Exception e, String method) {
		 
	}
	 
	public void finallyCall(String method) {
		
	}
 
	public void end(String method) {
		
	}
}
