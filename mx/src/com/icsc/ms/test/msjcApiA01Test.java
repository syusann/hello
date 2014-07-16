package com.icsc.ms.test;
import org.junit.Assert;
import org.junit.Test;
import org.junit.BeforeClass;

import com.icsc.dpms.ds.dsjccom;
import com.icsc.ms.api.msjcApiA01;
/*************************************/
/**測試msjcApiA01                    **/
/**可修改以下區段資料,測試某廠商資料的正確性    **/
/*************************************/
public class msjcApiA01Test {
	private static  dsjccom dsCom = null;
	/**********若要測試某廠商,請修以下資料**********/
	//compId
	private static String testCompId="0000";	
	//供應商編號
	private static String testVendorNo="A0001AST";
	//供應商名稱
	private static String testVendorName="ALLIED BELLAMBI COLLIERIES  PTY LIMITED";
	//供應商簡稱
	private static String testAbbrevName="ALLIED BEL";
	//供應商國別
	private static String testCountryId="AST";
	//供應商是否存在
	private static boolean testIsVendorExist=true;
	//供應商是否停權
	private boolean testIsVendorReject=false;
	/**********若要測試某廠商,請修改以上資料**********/
	@BeforeClass
	public static void init() throws Exception{
		msjcMockDsjccom dsComObj = new msjcMockDsjccom();
		dsCom = dsComObj.getMockDsjccomDB2();	
		testIsVendorExist = msjcApiA01.isVendorExist(dsCom, testCompId, testVendorNo);		
	}
	@Test
	public void testIsVendorExist() {
		try {
			boolean str = msjcApiA01.isVendorExist(dsCom, testCompId, testVendorNo);
			System.out.print("IsVendorExist: " + str + "\n");
			if(str==testIsVendorExist)
				Assert.assertTrue(true);
			else
				Assert.assertFalse(true);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("test fail.."+e.getMessage());
		}		
	}	
	@Test
	public void testIsVendorReject() {
		try {
			if(testIsVendorExist){
				boolean str = msjcApiA01.isVendorReject(dsCom, testCompId, testVendorNo);
				System.out.print("IsVendorReject: " + str + "\n");
				if(str==testIsVendorReject)
					Assert.assertTrue(true);
				else
					Assert.assertFalse(true);				
			}
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("test fail.."+e.getMessage());
		}		
	}	
	@Test
	public void testGetVendorName() {
		try {
			if(testIsVendorExist){
				String str = msjcApiA01.getVendorName(dsCom, testCompId, testVendorNo);
				System.out.print("VendorName: " + str + "\n");
				if(str.equals(testVendorName))
					Assert.assertTrue(true);
				else
					Assert.assertFalse(true);				
			}

			
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("test fail.."+e.getMessage());
		}		
	}
	@Test
	public void testGetVendorAbbrevName() {
		try {
			if(testIsVendorExist){
				String str = msjcApiA01.getVendorAbbrevName(dsCom, testCompId, testVendorNo);
				System.out.print("AbbrevName: " + str + "\n");
				if(str.equals(testAbbrevName))
					Assert.assertTrue(true);
				else
					Assert.assertFalse(true);				
			}

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("test fail.."+e.getMessage());
		}		
	}	
	@Test
	public void testGetVendoContryId() {
		try {
			if(testIsVendorExist){
				String str = msjcApiA01.getVendoContryId(dsCom, testCompId, testVendorNo);
				System.out.print("CountryId: " + str + "\n");
				if(str.equals(testCountryId))
					Assert.assertTrue(true);
				else
					Assert.assertFalse(true);			}

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("test fail.."+e.getMessage());
		}		
	}		
}

