package velocity.testng.test;

import org.testng.annotations.Test;

import java.util.ArrayList;

import velocity.DaoFieldBean;
import velocity.DaoMetaBean;

public class DaoTest {
	
	@Test
	public void testDao() {
		DaoMetaBean dmb = new DaoMetaBean();
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
		
		
	}

}
