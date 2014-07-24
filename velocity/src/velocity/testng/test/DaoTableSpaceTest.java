package velocity.testng.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.ArrayList;

import velocity.DaoFieldBean;
import velocity.DaoMetaBean;

import java.io.StringWriter;

import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;

public class DaoTableSpaceTest {
	DaoMetaBean dmb = new DaoMetaBean();
	
	
	@BeforeMethod
	public void setUp() {
		dmb.setMyTable("MS.TBMSM00");
		dmb.setMyPackage("com.icsc.ms.dao");
		dmb.setMyEntity("msjcTBMSM00VO");
		dmb.setMyDescript("供應商基本資料檔");
		dmb.setMyDatabase("CSC");
		
		ArrayList<DaoFieldBean> dfbs = new ArrayList();
		DaoFieldBean dfb = null;
		
		dfb=new DaoFieldBean();
		dfb.setMyName("msM00Uid");
		dfb.setMyDataType("int");
		dfb.setMyIsKey("y");
		dfb.setMyDescription("uid");
		dfb.setMyFieldWidth("9");
		dfb.setMyFormat("identity");
		dfb.setMyDefault("0");
		dfbs.add(dfb);
		
		dfb=new DaoFieldBean();
		dfb.setMyName("vendorNo");
		dfb.setMyDataType("CHAR");
		dfb.setMyIsKey("n");
		dfb.setMyDescription("供應商編號");
		dfb.setMyFieldWidth("10");
		dfb.setMyFormat("String");
		dfb.setMyDefault("");
		dfbs.add(dfb);
		
		dfb=new DaoFieldBean();
		dfb.setMyName("cVendorName");
		dfb.setMyDataType("VARCHAR");
		dfb.setMyIsKey("n");
		dfb.setMyDescription("中文供應商名稱");
		dfb.setMyFieldWidth("100");
		dfb.setMyFormat("String");
		dfb.setMyDefault("");
		dfbs.add(dfb);
		
		dmb.setDaoFieldBeans(dfbs);
	}

	@Test(enabled = false)
	public void testTableSpace() {
		/* first, get and initialize an engine */
		VelocityEngine ve = new VelocityEngine();
		ve.init();
		/* next, get the Template */
		Template t = ve.getTemplate("tablespace.vm");
		/* create a context and add data */
		VelocityContext context = new VelocityContext();
		context.put("sysId", dmb.getMyTable().substring(0, 2));
		context.put("tableName", dmb.getMyTable().substring(3, 10));
		context.put("tablePostfix", dmb.getMyTable().substring(5, 10));
		context.put("tableDesc", dmb.getMyDescript());
		/* now render the template into a StringWriter */
		StringWriter writer = new StringWriter();
		t.merge(context, writer);
		/* show the World */
		System.out.println(writer.toString());
	}
	
	@Test
	public void testTable() {
		/* first, get and initialize an engine */
		VelocityEngine ve = new VelocityEngine();
		ve.init();
		/* next, get the Template */
		Template t = ve.getTemplate("table.vm");
		/* create a context and add data */
		VelocityContext context = new VelocityContext();
		context.put("sysId", dmb.getMyTable().substring(0, 2));
		context.put("tableName", dmb.getMyTable().substring(3, 10));
		context.put("tablePostfix", dmb.getMyTable().substring(5, 10));
		context.put("tableDesc", dmb.getMyDescript());
		context.put("fieldList", dmb.getDaoFieldBeans());
		/* now render the template into a StringWriter */
		StringWriter writer = new StringWriter();
		t.merge(context, writer);
		/* show the World */
		System.out.println(writer.toString());
	}
	
}
