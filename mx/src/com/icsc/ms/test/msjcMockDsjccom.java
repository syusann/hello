package com.icsc.ms.test;

import static org.junit.Assert.fail;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;

import com.icsc.dpms.ds.dsjccom;

/**
* Add one sentence class summary here.
* Add class description here.
*
* @author I21239
* @version $Id$
*/
public class msjcMockDsjccom {
	public final static String CLASS_VERSION = "$Revision: 1.4 $ $Date: 2014/01/02 08:42:49 $";

	private String url="csc";
	private String appId="TEST";
	private String userId="ICSC01";
	private String db_Url = url="jdbc:db2://XXXXXX:50000/DBCSCA";
		
	private String db_userId = "XXX";
	private String db_passwd = "XXX"; 


	public dsjccom getMockDsjccom() throws Exception{
		@SuppressWarnings("deprecation")
		dsjccom dsCom = new dsjccom();
		dsCom.setDsjccom("url", appId, userId);
		dsCom.db.userId = db_userId;
		dsCom.db.passwd = db_passwd;
		dsCom.db.url = db_Url;
		dsCom.db.driver="com.ibm.db2.jcc.DB2Driver" ;
		dsCom.ver = "1";
		dsCom.linkType = 1;
		dsCom.db.linkFlag = true;
		dsCom.companyId="0000";
		
		dsCom.dateType = 0;
		dsCom.debugFlag = 17;
		dsCom.language = "UTF-8";
		return dsCom;
	}
	public dsjccom getMockDsjccomDB2() throws Exception{
		@SuppressWarnings("deprecation")
		dsjccom dsCom = new dsjccom();
		dsCom.setDsjccom("url", appId, userId);
		dsCom.db.userId = "XXX";
		dsCom.db.passwd = "XXXXXX";
		dsCom.db.url = "jdbc:db2://XXXXXX:50000/DB2T";
		dsCom.db.driver="com.ibm.db2.jcc.DB2Driver" ;
		dsCom.ver = "1";
		dsCom.linkType = 1;
		dsCom.db.linkFlag = true;
		dsCom.companyId="0000";
		
		dsCom.dateType = 0;
		dsCom.debugFlag = 17;
		dsCom.language = "UTF-8";
		return dsCom;
	}		
	
	public dsjccom getMockDsjccomWithJndi() throws Exception{
		try {
			Class.forName("com.ibm.db2.jcc.DB2Driver");
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
			ds.setUrl("jdbc:db2://XXXXXX:50000/DBCSCA");
			ds.setUsername("XXX");
			ds.setPassword("XXX");

			ic.bind("java:/comp/env/jdbc/dscsc", ds);
			
			// for de300 use
			System.setProperty("com.icsc.dpms.de.dejc300.j2ee", "true");
			
		} catch (NamingException ex) {
			ex.printStackTrace();
			fail("ffff");
		}

		
		@SuppressWarnings("deprecation")
		dsjccom dsCom = new dsjccom();
		dsCom.setDsjccom("url", appId, userId);
		dsCom.db.userId = db_userId;
		dsCom.db.passwd = db_passwd;
		dsCom.db.url = db_Url;
		dsCom.db.driver="com.ibm.db2.jcc.DB2Driver" ;
		dsCom.ver = "1";
		//dsCom.linkType = 1;
		dsCom.db.linkFlag = true;
		dsCom.companyId="0000";
		
		dsCom.dateType = 0;
		dsCom.debugFlag = 17;
		dsCom.language = "UTF-8";
		return dsCom;
	}

	public dsjccom getMockDsjccomWithJndiDB2() throws Exception{
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
			ds.setUrl("jdbc:db2://XXXXXX:50000/DB2T");
			ds.setUsername("XXX");
			ds.setPassword("XXXXXX");

			ic.bind("java:comp/env/jdbc/dsdb2P", ds);
			
			// for de300 use
			System.setProperty("com.icsc.dpms.de.dejc300.j2ee", "true");
			
		} catch (NamingException ex) {
			ex.printStackTrace();
			fail("ffff");
		}

		
		@SuppressWarnings("deprecation")
		dsjccom dsCom = new dsjccom();
		dsCom.setDsjccom("url", appId, userId);
		dsCom.db.userId = db_userId;
		dsCom.db.passwd = db_passwd;
		dsCom.db.url = db_Url;
		dsCom.db.driver="com.ibm.db2.jcc.DB2Driver" ;
		dsCom.ver = "1";
		
		//dsCom.linkType = 1;	// 1:for jdbc
		dsCom.db.linkFlag = false;	// for jndi only
		//dsCom.db.dataSource="jdbc/dsdb2P"; // for jndi only 可以設定
		
		dsCom.companyId="0000";
		
		dsCom.dateType = 0;
		dsCom.debugFlag = 17;
		dsCom.language = "UTF-8";
		return dsCom;
	}

	/**
	 * @return
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * @return
	 */
	public String getDb_passwd() {
		return db_passwd;
	}

	/**
	 * @return
	 */
	public String getDb_Url() {
		return db_Url;
	}

	/**
	 * @return
	 */
	public String getDb_userId() {
		return db_userId;
	}

	/**
	 * @return
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @return
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param string
	 */
	public void setAppId(String string) {
		appId = string;
	}

	/**
	 * @param string
	 */
	public void setDb_passwd(String string) {
		db_passwd = string;
	}

	/**
	 * @param string
	 */
	public void setDb_Url(String string) {
		db_Url = string;
	}

	/**
	 * @param string
	 */
	public void setDb_userId(String string) {
		db_userId = string;
	}

	/**
	 * @param string
	 */
	public void setUrl(String string) {
		url = string;
	}

	/**
	 * @param string
	 */
	public void setUserId(String string) {
		userId = string;
	}
}
