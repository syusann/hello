/*----------------------------------------------------------------------------*/
/* msjcTBMSM01VO		DAOTool Ver 10.0112 (INPUT FILE VERSION:2.0)  $Id: ef8df0f16226a997830ff414f827195ab9bbdc24 $
/*----------------------------------------------------------------------------*/
/* author : 
/* system : 
/* target : 供應商部門資料檔
/* create : 103/06/25
/* update : 103/06/25
/*----------------------------------------------------------------------------*/
package com.icsc.ms.dao ;

import java.io.Serializable ;
import java.math.*;
import java.sql.*;
import java.text.DecimalFormat ;
import java.util.*;
import java.util.regex.*;
import javax.servlet.http.HttpServletRequest ;

import com.icsc.dpms.de.*;
import com.icsc.dpms.de.dez.utils.*;
import com.icsc.ms.dao.*  ;


/**
 * 供應商部門資料檔 Value Object.
 * <pre>
 * Table Name        : MS.TBMSM01
 * Table Description : 供應商部門資料檔
 * Data Access Object: msjcTBMSM01DAO
 * </pre>
 * @version 
 * @since msjcTBMSM01VO - 103/06/25
 * @author 
 */
public class msjcTBMSM01VO extends dejcCommonVO implements Serializable {
	public final static String AppId = "MSJCTBMSM01VO" ;
	public final static String CLASS_VERSION = "$Revision: 1.3 $ $Date: 2014/06/26 01:14:08 $";
	public final static String ATTRIB_DESC="msM01Uid=uid,msM00Uid=msM00Uid,compId=公司別,vendorNo=供應商編號,adty=編碼,isDefault=是否預設選項,areaId=部門名稱,postCode=郵遞區號,addr=地址,addrAll=地址(含縣市區),tel=電話,fax=傳真,telex=電傳號碼,contact=聯絡人,mobile=聯絡人手機,email=聯絡人電子信箱,web=網路位置,publicClass=公開招標類別,vendorType=供應商屬性,crcy=幣別,paidType=付款方式,bankCode=受款銀行代碼,accountNo=受款銀行帳戶,bankName=受款銀行名稱,bankAddr=受款銀行地址,createDate=建檔日期,createTime=建檔時間,createEmplComp=建檔人員公司別,createEmpl=建檔人員,updateDate=修改日期,updateTime=修改時間,updateEmplComp=修改人員公司別,updateEmpl=修改人員," ; 

	/**
	 * uid 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int MSM01UID_LEN = 9 ;
	/**
	 * msM00Uid 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int MSM00UID_LEN = 9 ;
	/**
	 * 公司別 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int COMPID_LEN = 4 ;
	/**
	 * 供應商編號 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int VENDORNO_LEN = 10 ;
	/**
	 * 編碼 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int ADTY_LEN = 2 ;
	/**
	 * 是否預設選項 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int ISDEFAULT_LEN = 1 ;
	/**
	 * 部門名稱 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int AREAID_LEN = 50 ;
	/**
	 * 郵遞區號 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int POSTCODE_LEN = 5 ;
	/**
	 * 地址 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int ADDR_LEN = 200 ;
	/**
	 * 地址(含縣市區) 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int ADDRALL_LEN = 200 ;
	/**
	 * 電話 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int TEL_LEN = 20 ;
	/**
	 * 傳真 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int FAX_LEN = 20 ;
	/**
	 * 電傳號碼 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int TELEX_LEN = 20 ;
	/**
	 * 聯絡人 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int CONTACT_LEN = 50 ;
	/**
	 * 聯絡人手機 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int MOBILE_LEN = 20 ;
	/**
	 * 聯絡人電子信箱 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int EMAIL_LEN = 200 ;
	/**
	 * 網路位置 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int WEB_LEN = 200 ;
	/**
	 * 公開招標類別 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int PUBLICCLASS_LEN = 20 ;
	/**
	 * 供應商屬性 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int VENDORTYPE_LEN = 2 ;
	/**
	 * 幣別 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int CRCY_LEN = 5 ;
	/**
	 * 付款方式 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int PAIDTYPE_LEN = 2 ;
	/**
	 * 受款銀行代碼 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int BANKCODE_LEN = 20 ;
	/**
	 * 受款銀行帳戶 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int ACCOUNTNO_LEN = 100 ;
	/**
	 * 受款銀行名稱 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int BANKNAME_LEN = 200 ;
	/**
	 * 受款銀行地址 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int BANKADDR_LEN = 200 ;
	/**
	 * 建檔日期 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int CREATEDATE_LEN = 8 ;
	/**
	 * 建檔時間 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int CREATETIME_LEN = 6 ;
	/**
	 * 建檔人員公司別 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int CREATEEMPLCOMP_LEN = 4 ;
	/**
	 * 建檔人員 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int CREATEEMPL_LEN = 10 ;
	/**
	 * 修改日期 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int UPDATEDATE_LEN = 8 ;
	/**
	 * 修改時間 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int UPDATETIME_LEN = 6 ;
	/**
	 * 修改人員公司別 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int UPDATEEMPLCOMP_LEN = 4 ;
	/**
	 * 修改人員 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int UPDATEEMPL_LEN = 10 ;
	


/*----------------------------------------------------------------------------*/
/* MS.TBMSM01 column Name
/*----------------------------------------------------------------------------*/

	/**
	 * uid
	 * @since 103/06/25
	 */
	private int msM01Uid;
	/**
	 * msM00Uid
	 * @since 103/06/25
	 */
	private int msM00Uid;
	/**
	 * 公司別
	 * @since 103/06/25
	 */
	private String compId;
	/**
	 * 供應商編號
	 * @since 103/06/25
	 */
	private String vendorNo;
	/**
	 * 編碼
	 * @since 103/06/25
	 */
	private String adty;
	/**
	 * 是否預設選項
	 * @since 103/06/25
	 */
	private String isDefault;
	/**
	 * 部門名稱
	 * @since 103/06/25
	 */
	private String areaId;
	/**
	 * 郵遞區號
	 * @since 103/06/25
	 */
	private String postCode;
	/**
	 * 地址
	 * @since 103/06/25
	 */
	private String addr;
	/**
	 * 地址(含縣市區)
	 * @since 103/06/25
	 */
	private String addrAll;
	/**
	 * 電話
	 * @since 103/06/25
	 */
	private String tel;
	/**
	 * 傳真
	 * @since 103/06/25
	 */
	private String fax;
	/**
	 * 電傳號碼
	 * @since 103/06/25
	 */
	private String telex;
	/**
	 * 聯絡人
	 * @since 103/06/25
	 */
	private String contact;
	/**
	 * 聯絡人手機
	 * @since 103/06/25
	 */
	private String mobile;
	/**
	 * 聯絡人電子信箱
	 * @since 103/06/25
	 */
	private String email;
	/**
	 * 網路位置
	 * @since 103/06/25
	 */
	private String web;
	/**
	 * 公開招標類別
	 * @since 103/06/25
	 */
	private String publicClass;
	/**
	 * 供應商屬性
	 * @since 103/06/25
	 */
	private String vendorType;
	/**
	 * 幣別
	 * @since 103/06/25
	 */
	private String crcy;
	/**
	 * 付款方式
	 * @since 103/06/25
	 */
	private String paidType;
	/**
	 * 受款銀行代碼
	 * @since 103/06/25
	 */
	private String bankCode;
	/**
	 * 受款銀行帳戶
	 * @since 103/06/25
	 */
	private String accountNo;
	/**
	 * 受款銀行名稱
	 * @since 103/06/25
	 */
	private String bankName;
	/**
	 * 受款銀行地址
	 * @since 103/06/25
	 */
	private String bankAddr;
	/**
	 * 建檔日期
	 * @since 103/06/25
	 */
	private String createDate;
	/**
	 * 建檔時間
	 * @since 103/06/25
	 */
	private String createTime;
	/**
	 * 建檔人員公司別
	 * @since 103/06/25
	 */
	private String createEmplComp;
	/**
	 * 建檔人員
	 * @since 103/06/25
	 */
	private String createEmpl;
	/**
	 * 修改日期
	 * @since 103/06/25
	 */
	private String updateDate;
	/**
	 * 修改時間
	 * @since 103/06/25
	 */
	private String updateTime;
	/**
	 * 修改人員公司別
	 * @since 103/06/25
	 */
	private String updateEmplComp;
	/**
	 * 修改人員
	 * @since 103/06/25
	 */
	private String updateEmpl;
	/**
	 * 執行訊息
	 * @since 103/06/25
	 */
	private String message ;

/*----------------------------------------------------------------------------*/
/* Creates new msjcTBMSM01VO
/*----------------------------------------------------------------------------*/

	/**
	 * 建構子
	 * @since 103/06/25
	 */
	public msjcTBMSM01VO() {
		clear() ;
		super.setChild(this) ;
	}
	/**
	 * 主要鍵建構子
	 * @since 103/06/25
	 */
	public msjcTBMSM01VO(int msM01Uid,int msM00Uid) {
		this() ;
		this.msM01Uid = msM01Uid ;	// uid
		this.msM00Uid = msM00Uid ;	// msM00Uid
	}
	
	/**
	 * 將所有的欄位 reset 成預設值.
	 * <pre>
	 * 當物件資料不需再被使用時(例如物件被 delete 後仍需放一個空物件到畫面上)
	 * 可以使用此方法，好處是可以重覆使用此物件，不需再 new 一個新的
	 *</pre>
	 */
	public void clear() {
		this.msM01Uid = 0 ;	// uid
		this.msM00Uid = 0 ;	// msM00Uid
		this.compId = "" ;	// 公司別
		this.vendorNo = "" ;	// 供應商編號
		this.adty = "" ;	// 編碼
		this.isDefault = "" ;	// 是否預設選項
		this.areaId = "" ;	// 部門名稱
		this.postCode = "" ;	// 郵遞區號
		this.addr = "" ;	// 地址
		this.addrAll = "" ;	// 地址(含縣市區)
		this.tel = "" ;	// 電話
		this.fax = "" ;	// 傳真
		this.telex = "" ;	// 電傳號碼
		this.contact = "" ;	// 聯絡人
		this.mobile = "" ;	// 聯絡人手機
		this.email = "" ;	// 聯絡人電子信箱
		this.web = "" ;	// 網路位置
		this.publicClass = "" ;	// 公開招標類別
		this.vendorType = "" ;	// 供應商屬性
		this.crcy = "" ;	// 幣別
		this.paidType = "" ;	// 付款方式
		this.bankCode = "" ;	// 受款銀行代碼
		this.accountNo = "" ;	// 受款銀行帳戶
		this.bankName = "" ;	// 受款銀行名稱
		this.bankAddr = "" ;	// 受款銀行地址
		this.createDate = "" ;	// 建檔日期
		this.createTime = "" ;	// 建檔時間
		this.createEmplComp = "" ;	// 建檔人員公司別
		this.createEmpl = "" ;	// 建檔人員
		this.updateDate = "" ;	// 修改日期
		this.updateTime = "" ;	// 修改時間
		this.updateEmplComp = "" ;	// 修改人員公司別
		this.updateEmpl = "" ;	// 修改人員
		this.message = "";
	}
	/**
	 * 將自己複製一份出來
	 */
	public msjcTBMSM01VO myClone() {
		msjcTBMSM01VO mstBMSM01VO = new msjcTBMSM01VO() ;
		mstBMSM01VO.setMsM01Uid(this.msM01Uid);
		mstBMSM01VO.setMsM00Uid(this.msM00Uid);
		mstBMSM01VO.setCompId(this.compId);
		mstBMSM01VO.setVendorNo(this.vendorNo);
		mstBMSM01VO.setAdty(this.adty);
		mstBMSM01VO.setIsDefault(this.isDefault);
		mstBMSM01VO.setAreaId(this.areaId);
		mstBMSM01VO.setPostCode(this.postCode);
		mstBMSM01VO.setAddr(this.addr);
		mstBMSM01VO.setAddrAll(this.addrAll);
		mstBMSM01VO.setTel(this.tel);
		mstBMSM01VO.setFax(this.fax);
		mstBMSM01VO.setTelex(this.telex);
		mstBMSM01VO.setContact(this.contact);
		mstBMSM01VO.setMobile(this.mobile);
		mstBMSM01VO.setEmail(this.email);
		mstBMSM01VO.setWeb(this.web);
		mstBMSM01VO.setPublicClass(this.publicClass);
		mstBMSM01VO.setVendorType(this.vendorType);
		mstBMSM01VO.setCrcy(this.crcy);
		mstBMSM01VO.setPaidType(this.paidType);
		mstBMSM01VO.setBankCode(this.bankCode);
		mstBMSM01VO.setAccountNo(this.accountNo);
		mstBMSM01VO.setBankName(this.bankName);
		mstBMSM01VO.setBankAddr(this.bankAddr);
		mstBMSM01VO.setCreateDate(this.createDate);
		mstBMSM01VO.setCreateTime(this.createTime);
		mstBMSM01VO.setCreateEmplComp(this.createEmplComp);
		mstBMSM01VO.setCreateEmpl(this.createEmpl);
		mstBMSM01VO.setUpdateDate(this.updateDate);
		mstBMSM01VO.setUpdateTime(this.updateTime);
		mstBMSM01VO.setUpdateEmplComp(this.updateEmplComp);
		mstBMSM01VO.setUpdateEmpl(this.updateEmpl);
		return mstBMSM01VO ;
	}

/**
  * toJSON 方法
  * <p>
  * @return JSON String
  * @since 103/06/25
  */
 public String toJSON() {
  StringBuffer sb = new StringBuffer() ;
  sb.append("msM01Uid :\""+dejcUtility.parseToJSON(getMsM01Uid()+"")+"\"") ;
  sb.append(",");
  sb.append("msM00Uid :\""+dejcUtility.parseToJSON(getMsM00Uid()+"")+"\"") ;
  sb.append(",");
  sb.append("compId :\""+dejcUtility.parseToJSON(getCompId()+"")+"\"") ;
  sb.append(",");
  sb.append("vendorNo :\""+dejcUtility.parseToJSON(getVendorNo()+"")+"\"") ;
  sb.append(",");
  sb.append("adty :\""+dejcUtility.parseToJSON(getAdty()+"")+"\"") ;
  sb.append(",");
  sb.append("isDefault :\""+dejcUtility.parseToJSON(getIsDefault()+"")+"\"") ;
  sb.append(",");
  sb.append("areaId :\""+dejcUtility.parseToJSON(getAreaId()+"")+"\"") ;
  sb.append(",");
  sb.append("postCode :\""+dejcUtility.parseToJSON(getPostCode()+"")+"\"") ;
  sb.append(",");
  sb.append("addr :\""+dejcUtility.parseToJSON(getAddr()+"")+"\"") ;
  sb.append(",");
  sb.append("addrAll :\""+dejcUtility.parseToJSON(getAddrAll()+"")+"\"") ;
  sb.append(",");
  sb.append("tel :\""+dejcUtility.parseToJSON(getTel()+"")+"\"") ;
  sb.append(",");
  sb.append("fax :\""+dejcUtility.parseToJSON(getFax()+"")+"\"") ;
  sb.append(",");
  sb.append("telex :\""+dejcUtility.parseToJSON(getTelex()+"")+"\"") ;
  sb.append(",");
  sb.append("contact :\""+dejcUtility.parseToJSON(getContact()+"")+"\"") ;
  sb.append(",");
  sb.append("mobile :\""+dejcUtility.parseToJSON(getMobile()+"")+"\"") ;
  sb.append(",");
  sb.append("email :\""+dejcUtility.parseToJSON(getEmail()+"")+"\"") ;
  sb.append(",");
  sb.append("web :\""+dejcUtility.parseToJSON(getWeb()+"")+"\"") ;
  sb.append(",");
  sb.append("publicClass :\""+dejcUtility.parseToJSON(getPublicClass()+"")+"\"") ;
  sb.append(",");
  sb.append("vendorType :\""+dejcUtility.parseToJSON(getVendorType()+"")+"\"") ;
  sb.append(",");
  sb.append("crcy :\""+dejcUtility.parseToJSON(getCrcy()+"")+"\"") ;
  sb.append(",");
  sb.append("paidType :\""+dejcUtility.parseToJSON(getPaidType()+"")+"\"") ;
  sb.append(",");
  sb.append("bankCode :\""+dejcUtility.parseToJSON(getBankCode()+"")+"\"") ;
  sb.append(",");
  sb.append("accountNo :\""+dejcUtility.parseToJSON(getAccountNo()+"")+"\"") ;
  sb.append(",");
  sb.append("bankName :\""+dejcUtility.parseToJSON(getBankName()+"")+"\"") ;
  sb.append(",");
  sb.append("bankAddr :\""+dejcUtility.parseToJSON(getBankAddr()+"")+"\"") ;
  sb.append(",");
  sb.append("createDate :\""+dejcUtility.parseToJSON(getCreateDate()+"")+"\"") ;
  sb.append(",");
  sb.append("createTime :\""+dejcUtility.parseToJSON(getCreateTime()+"")+"\"") ;
  sb.append(",");
  sb.append("createEmplComp :\""+dejcUtility.parseToJSON(getCreateEmplComp()+"")+"\"") ;
  sb.append(",");
  sb.append("createEmpl :\""+dejcUtility.parseToJSON(getCreateEmpl()+"")+"\"") ;
  sb.append(",");
  sb.append("updateDate :\""+dejcUtility.parseToJSON(getUpdateDate()+"")+"\"") ;
  sb.append(",");
  sb.append("updateTime :\""+dejcUtility.parseToJSON(getUpdateTime()+"")+"\"") ;
  sb.append(",");
  sb.append("updateEmplComp :\""+dejcUtility.parseToJSON(getUpdateEmplComp()+"")+"\"") ;
  sb.append(",");
  sb.append("updateEmpl :\""+dejcUtility.parseToJSON(getUpdateEmpl()+"")+"\"") ;
  return "{"+sb.toString()+"}";
 }



/*----------------------------------------------------------------------------*/
/* function methods
/*----------------------------------------------------------------------------*/

	/**
	 * 以 ResultSet 來作物件
	 * <p>
	 * @param rs - 單一 ResultSet
	 * @return msjcTBMSM01VO - 產生 Value Object
	 * @exception SQLException - DB SQLException
	 * @since 103/06/25
	 */
	public static msjcTBMSM01VO getInstance(ResultSet rs) throws SQLException,Exception {
		msjcTBMSM01VO mstBMSM01VO = new msjcTBMSM01VO() ;

  		mstBMSM01VO.setMsM01Uid(rs.getInt(1));
  		mstBMSM01VO.setMsM00Uid(rs.getInt(2));
  		mstBMSM01VO.setCompId(rs.getString(3));
  		mstBMSM01VO.setVendorNo(rs.getString(4));
  		mstBMSM01VO.setAdty(rs.getString(5));
  		mstBMSM01VO.setIsDefault(rs.getString(6));
  		mstBMSM01VO.setAreaId(rs.getString(7));
  		mstBMSM01VO.setPostCode(rs.getString(8));
  		mstBMSM01VO.setAddr(rs.getString(9));
  		mstBMSM01VO.setAddrAll(rs.getString(10));
  		mstBMSM01VO.setTel(rs.getString(11));
  		mstBMSM01VO.setFax(rs.getString(12));
  		mstBMSM01VO.setTelex(rs.getString(13));
  		mstBMSM01VO.setContact(rs.getString(14));
  		mstBMSM01VO.setMobile(rs.getString(15));
  		mstBMSM01VO.setEmail(rs.getString(16));
  		mstBMSM01VO.setWeb(rs.getString(17));
  		mstBMSM01VO.setPublicClass(rs.getString(18));
  		mstBMSM01VO.setVendorType(rs.getString(19));
  		mstBMSM01VO.setCrcy(rs.getString(20));
  		mstBMSM01VO.setPaidType(rs.getString(21));
  		mstBMSM01VO.setBankCode(rs.getString(22));
  		mstBMSM01VO.setAccountNo(rs.getString(23));
  		mstBMSM01VO.setBankName(rs.getString(24));
  		mstBMSM01VO.setBankAddr(rs.getString(25));
  		mstBMSM01VO.setCreateDate(rs.getString(26));
  		mstBMSM01VO.setCreateTime(rs.getString(27));
  		mstBMSM01VO.setCreateEmplComp(rs.getString(28));
  		mstBMSM01VO.setCreateEmpl(rs.getString(29));
  		mstBMSM01VO.setUpdateDate(rs.getString(30));
  		mstBMSM01VO.setUpdateTime(rs.getString(31));
  		mstBMSM01VO.setUpdateEmplComp(rs.getString(32));
  		mstBMSM01VO.setUpdateEmpl(rs.getString(33));
  		return mstBMSM01VO ;
	}

	/**
	 * 以 ResultSet 來作物件
	 * <p>
	 * @param rs - 單一 ResultSet
	 * @return msjcTBMSM01VO - 產生 Value Object
	 * @exception SQLException - DB SQLException
	 * @since 103/06/25
	 */
	public static msjcTBMSM01VO getInstanceByName(ResultSet rs) throws SQLException,Exception {
		return getInstanceByName(new msjcTBMSM01VO(), rs) ;
	}

	/**
	 * 以 ResultSet 來作物件, 使用由 user 傳進來的物件
	 * <p>
	 * @param rs - 單一 ResultSet
	 * @return msjcTBMSM01VO - 產生 Value Object
	 * @exception SQLException - DB SQLException
	 * @since 103/06/25
	 */
	public static msjcTBMSM01VO getInstanceByName(Object obj, ResultSet rs) throws SQLException {
		msjcTBMSM01VO mstBMSM01VO = (msjcTBMSM01VO)obj ;
  		mstBMSM01VO.setMsM01Uid(rs.getInt("msM01Uid_MSM01"));
  		mstBMSM01VO.setMsM00Uid(rs.getInt("msM00Uid_MSM01"));
  		mstBMSM01VO.setCompId(rs.getString("compId_MSM01"));
  		mstBMSM01VO.setVendorNo(rs.getString("vendorNo_MSM01"));
  		mstBMSM01VO.setAdty(rs.getString("adty_MSM01"));
  		mstBMSM01VO.setIsDefault(rs.getString("isDefault_MSM01"));
  		mstBMSM01VO.setAreaId(rs.getString("areaId_MSM01"));
  		mstBMSM01VO.setPostCode(rs.getString("postCode_MSM01"));
  		mstBMSM01VO.setAddr(rs.getString("addr_MSM01"));
  		mstBMSM01VO.setAddrAll(rs.getString("addrAll_MSM01"));
  		mstBMSM01VO.setTel(rs.getString("tel_MSM01"));
  		mstBMSM01VO.setFax(rs.getString("fax_MSM01"));
  		mstBMSM01VO.setTelex(rs.getString("telex_MSM01"));
  		mstBMSM01VO.setContact(rs.getString("contact_MSM01"));
  		mstBMSM01VO.setMobile(rs.getString("mobile_MSM01"));
  		mstBMSM01VO.setEmail(rs.getString("email_MSM01"));
  		mstBMSM01VO.setWeb(rs.getString("web_MSM01"));
  		mstBMSM01VO.setPublicClass(rs.getString("publicClass_MSM01"));
  		mstBMSM01VO.setVendorType(rs.getString("vendorType_MSM01"));
  		mstBMSM01VO.setCrcy(rs.getString("crcy_MSM01"));
  		mstBMSM01VO.setPaidType(rs.getString("paidType_MSM01"));
  		mstBMSM01VO.setBankCode(rs.getString("bankCode_MSM01"));
  		mstBMSM01VO.setAccountNo(rs.getString("accountNo_MSM01"));
  		mstBMSM01VO.setBankName(rs.getString("bankName_MSM01"));
  		mstBMSM01VO.setBankAddr(rs.getString("bankAddr_MSM01"));
  		mstBMSM01VO.setCreateDate(rs.getString("createDate_MSM01"));
  		mstBMSM01VO.setCreateTime(rs.getString("createTime_MSM01"));
  		mstBMSM01VO.setCreateEmplComp(rs.getString("createEmplComp_MSM01"));
  		mstBMSM01VO.setCreateEmpl(rs.getString("createEmpl_MSM01"));
  		mstBMSM01VO.setUpdateDate(rs.getString("updateDate_MSM01"));
  		mstBMSM01VO.setUpdateTime(rs.getString("updateTime_MSM01"));
  		mstBMSM01VO.setUpdateEmplComp(rs.getString("updateEmplComp_MSM01"));
  		mstBMSM01VO.setUpdateEmpl(rs.getString("updateEmpl_MSM01"));
  		return mstBMSM01VO ;
	}

	/**
	 * 以 Request 來作物件
	 * <p>
	 * @param request - 網頁要求物件
	 * @return msjcTBMSM01VO - 產生 Value Object
	 * @since 103/06/25
	 */
	public static msjcTBMSM01VO getInstance(HttpServletRequest request) {
		return getFromReq(request, -1) ;
	}
	/**
	 * 以 Request 來作物件 (遇到多筆資料時)
	 * <p>
	 * @param request - 網頁要求物件
	 * @param index - 參數流水序號
	 * @return msjcTBMSM01VO - 產生 Value Object
	 * @since 103/06/25
	 */
	public static msjcTBMSM01VO getInstance(HttpServletRequest request, int index) {
		return getFromReq(request, index) ;
	}
	/**
	 * 以 Request 來作物件
	 * <p>
	 * @param req - 網頁要求物件
	 * @param index - 參數流水序號
	 * @return msjcTBMSM01VO - 產生 Value Object
	 * @since 103/06/25
	 */
	private static msjcTBMSM01VO getFromReq(HttpServletRequest req, int index) {
		String seq = (index >= 0) ? String.valueOf(index) : "" ;
		msjcTBMSM01VO mstBMSM01VO = new msjcTBMSM01VO() ;

		mstBMSM01VO.setMsM01Uid(req.getParameter("msM01Uid"+seq)) ;
		mstBMSM01VO.setMsM00Uid(req.getParameter("msM00Uid"+seq)) ;
		mstBMSM01VO.setCompId(req.getParameter("compId"+seq)) ;
		mstBMSM01VO.setVendorNo(req.getParameter("vendorNo"+seq)) ;
		mstBMSM01VO.setAdty(req.getParameter("adty"+seq)) ;
		mstBMSM01VO.setIsDefault(req.getParameter("isDefault"+seq)) ;
		mstBMSM01VO.setAreaId(req.getParameter("areaId"+seq)) ;
		mstBMSM01VO.setPostCode(req.getParameter("postCode"+seq)) ;
		mstBMSM01VO.setAddr(req.getParameter("addr"+seq)) ;
		mstBMSM01VO.setAddrAll(req.getParameter("addrAll"+seq)) ;
		mstBMSM01VO.setTel(req.getParameter("tel"+seq)) ;
		mstBMSM01VO.setFax(req.getParameter("fax"+seq)) ;
		mstBMSM01VO.setTelex(req.getParameter("telex"+seq)) ;
		mstBMSM01VO.setContact(req.getParameter("contact"+seq)) ;
		mstBMSM01VO.setMobile(req.getParameter("mobile"+seq)) ;
		mstBMSM01VO.setEmail(req.getParameter("email"+seq)) ;
		mstBMSM01VO.setWeb(req.getParameter("web"+seq)) ;
		mstBMSM01VO.setPublicClass(req.getParameter("publicClass"+seq)) ;
		mstBMSM01VO.setVendorType(req.getParameter("vendorType"+seq)) ;
		mstBMSM01VO.setCrcy(req.getParameter("crcy"+seq)) ;
		mstBMSM01VO.setPaidType(req.getParameter("paidType"+seq)) ;
		mstBMSM01VO.setBankCode(req.getParameter("bankCode"+seq)) ;
		mstBMSM01VO.setAccountNo(req.getParameter("accountNo"+seq)) ;
		mstBMSM01VO.setBankName(req.getParameter("bankName"+seq)) ;
		mstBMSM01VO.setBankAddr(req.getParameter("bankAddr"+seq)) ;
		mstBMSM01VO.setCreateDate(req.getParameter("createDate"+seq)) ;
		mstBMSM01VO.setCreateTime(req.getParameter("createTime"+seq)) ;
		mstBMSM01VO.setCreateEmplComp(req.getParameter("createEmplComp"+seq)) ;
		mstBMSM01VO.setCreateEmpl(req.getParameter("createEmpl"+seq)) ;
		mstBMSM01VO.setUpdateDate(req.getParameter("updateDate"+seq)) ;
		mstBMSM01VO.setUpdateTime(req.getParameter("updateTime"+seq)) ;
		mstBMSM01VO.setUpdateEmplComp(req.getParameter("updateEmplComp"+seq)) ;
		mstBMSM01VO.setUpdateEmpl(req.getParameter("updateEmpl"+seq)) ;

		return mstBMSM01VO ;
	}

/*----------------------------------------------------------------------------*/
/* public methods
/*----------------------------------------------------------------------------*/

	/**
	 * 覆寫 toString , 以利 Debug
	 * <p>
	 * @return 物件內容值
	 * @since 103/06/25
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer() ;

		sb.append("<msjcTBMSM01VO>");
		sb.append(super.toString());
		sb.append("\r\n\tmsM01Uid = " + getMsM01Uid()) ;
		sb.append("\r\n\tmsM00Uid = " + getMsM00Uid()) ;
		sb.append("\r\n\tcompId = " + getCompId()) ;
		sb.append("\r\n\tvendorNo = " + getVendorNo()) ;
		sb.append("\r\n\tadty = " + getAdty()) ;
		sb.append("\r\n\tisDefault = " + getIsDefault()) ;
		sb.append("\r\n\tareaId = " + getAreaId()) ;
		sb.append("\r\n\tpostCode = " + getPostCode()) ;
		sb.append("\r\n\taddr = " + getAddr()) ;
		sb.append("\r\n\taddrAll = " + getAddrAll()) ;
		sb.append("\r\n\ttel = " + getTel()) ;
		sb.append("\r\n\tfax = " + getFax()) ;
		sb.append("\r\n\ttelex = " + getTelex()) ;
		sb.append("\r\n\tcontact = " + getContact()) ;
		sb.append("\r\n\tmobile = " + getMobile()) ;
		sb.append("\r\n\temail = " + getEmail()) ;
		sb.append("\r\n\tweb = " + getWeb()) ;
		sb.append("\r\n\tpublicClass = " + getPublicClass()) ;
		sb.append("\r\n\tvendorType = " + getVendorType()) ;
		sb.append("\r\n\tcrcy = " + getCrcy()) ;
		sb.append("\r\n\tpaidType = " + getPaidType()) ;
		sb.append("\r\n\tbankCode = " + getBankCode()) ;
		sb.append("\r\n\taccountNo = " + getAccountNo()) ;
		sb.append("\r\n\tbankName = " + getBankName()) ;
		sb.append("\r\n\tbankAddr = " + getBankAddr()) ;
		sb.append("\r\n\tcreateDate = " + getCreateDate()) ;
		sb.append("\r\n\tcreateTime = " + getCreateTime()) ;
		sb.append("\r\n\tcreateEmplComp = " + getCreateEmplComp()) ;
		sb.append("\r\n\tcreateEmpl = " + getCreateEmpl()) ;
		sb.append("\r\n\tupdateDate = " + getUpdateDate()) ;
		sb.append("\r\n\tupdateTime = " + getUpdateTime()) ;
		sb.append("\r\n\tupdateEmplComp = " + getUpdateEmplComp()) ;
		sb.append("\r\n\tupdateEmpl = " + getUpdateEmpl()) ;
		sb.append("\r\n</msjcTBMSM01VO>");

		return sb.toString();
	}
	/**
	 * 比較兩個物件的 Key 屬性
	 * <pre>
	 * 只比較 Key 部分，有一項 Key 不同，則 return false
	 * 並非全部的屬性都比較
	 * </pre>
	 * @param object - 欲比較之物件
	 * @return true - the same; false - diff
	 * @since 103/06/25
	 */
	public boolean keyEquals(Object object) {
		if (object instanceof msjcTBMSM01VO == false) {
			return false ;
		}

		msjcTBMSM01VO mstBMSM01VO = (msjcTBMSM01VO) object ;
		if (this.msM01Uid == mstBMSM01VO.getMsM01Uid() == false) {
			return false ;
		}
		if (this.msM00Uid != (mstBMSM01VO.getMsM00Uid())) {
			return false ;
		}
		return true ;
	}
	/**
	 * 檢查 key 值是否不等於 null 或 空字串
	 * @return true - ok; false - hasErr
	 * @since 103/06/25
	 */
	public boolean isKeyOk() {
		if (dejcUtility.isNull(this.msM01Uid)) {
			return hasErr("msM01Uid") ;
		}
		return true ;
	}
	/**
	 * 檢查資料的正確性 (包括長度，型態)
	 * @return true - ok; false - hasErr
	 * @since 103/06/25
	 */
	public boolean verify() {

		if (msM00Uid>2147483647) { 
			return hasErr("msM00Uid的資料["+msM00Uid+"]不得超過2147483647") ; 
		}
		if (compId!=null) { 
			if (compId.getBytes().length>COMPID_LEN) {
				return hasErr("公司別的資料長度["+compId.getBytes().length+"]不得超過["+COMPID_LEN+"]") ; 
			}
		}
		if (vendorNo!=null) { 
			if (vendorNo.getBytes().length>VENDORNO_LEN) {
				return hasErr("供應商編號的資料長度["+vendorNo.getBytes().length+"]不得超過["+VENDORNO_LEN+"]") ; 
			}
		}
		if (adty!=null) { 
			if (adty.getBytes().length>ADTY_LEN) {
				return hasErr("編碼的資料長度["+adty.getBytes().length+"]不得超過["+ADTY_LEN+"]") ; 
			}
		}
		if (isDefault!=null) { 
			if (isDefault.getBytes().length>ISDEFAULT_LEN) {
				return hasErr("是否預設選項的資料長度["+isDefault.getBytes().length+"]不得超過["+ISDEFAULT_LEN+"]") ; 
			}
		}
		if (areaId!=null) { 
			if (areaId.getBytes().length>AREAID_LEN) {
				return hasErr("部門名稱的資料長度["+areaId.getBytes().length+"]不得超過["+AREAID_LEN+"]") ; 
			}
		}
		if (postCode!=null) { 
			if (postCode.getBytes().length>POSTCODE_LEN) {
				return hasErr("郵遞區號的資料長度["+postCode.getBytes().length+"]不得超過["+POSTCODE_LEN+"]") ; 
			}
		}
		if (addr!=null) { 
			if (addr.getBytes().length>ADDR_LEN) {
				return hasErr("地址的資料長度["+addr.getBytes().length+"]不得超過["+ADDR_LEN+"]") ; 
			}
		}
		if (addrAll!=null) { 
			if (addrAll.getBytes().length>ADDRALL_LEN) {
				return hasErr("地址(含縣市區)的資料長度["+addrAll.getBytes().length+"]不得超過["+ADDRALL_LEN+"]") ; 
			}
		}
		if (tel!=null) { 
			if (tel.getBytes().length>TEL_LEN) {
				return hasErr("電話的資料長度["+tel.getBytes().length+"]不得超過["+TEL_LEN+"]") ; 
			}
		}
		if (fax!=null) { 
			if (fax.getBytes().length>FAX_LEN) {
				return hasErr("傳真的資料長度["+fax.getBytes().length+"]不得超過["+FAX_LEN+"]") ; 
			}
		}
		if (telex!=null) { 
			if (telex.getBytes().length>TELEX_LEN) {
				return hasErr("電傳號碼的資料長度["+telex.getBytes().length+"]不得超過["+TELEX_LEN+"]") ; 
			}
		}
		if (contact!=null) { 
			if (contact.getBytes().length>CONTACT_LEN) {
				return hasErr("聯絡人的資料長度["+contact.getBytes().length+"]不得超過["+CONTACT_LEN+"]") ; 
			}
		}
		if (mobile!=null) { 
			if (mobile.getBytes().length>MOBILE_LEN) {
				return hasErr("聯絡人手機的資料長度["+mobile.getBytes().length+"]不得超過["+MOBILE_LEN+"]") ; 
			}
		}
		if (email!=null) { 
			if (email.getBytes().length>EMAIL_LEN) {
				return hasErr("聯絡人電子信箱的資料長度["+email.getBytes().length+"]不得超過["+EMAIL_LEN+"]") ; 
			}
		}
		if (web!=null) { 
			if (web.getBytes().length>WEB_LEN) {
				return hasErr("網路位置的資料長度["+web.getBytes().length+"]不得超過["+WEB_LEN+"]") ; 
			}
		}
		if (publicClass!=null) { 
			if (publicClass.getBytes().length>PUBLICCLASS_LEN) {
				return hasErr("公開招標類別的資料長度["+publicClass.getBytes().length+"]不得超過["+PUBLICCLASS_LEN+"]") ; 
			}
		}
		if (vendorType!=null) { 
			if (vendorType.getBytes().length>VENDORTYPE_LEN) {
				return hasErr("供應商屬性的資料長度["+vendorType.getBytes().length+"]不得超過["+VENDORTYPE_LEN+"]") ; 
			}
		}
		if (crcy!=null) { 
			if (crcy.getBytes().length>CRCY_LEN) {
				return hasErr("幣別的資料長度["+crcy.getBytes().length+"]不得超過["+CRCY_LEN+"]") ; 
			}
		}
		if (paidType!=null) { 
			if (paidType.getBytes().length>PAIDTYPE_LEN) {
				return hasErr("付款方式的資料長度["+paidType.getBytes().length+"]不得超過["+PAIDTYPE_LEN+"]") ; 
			}
		}
		if (bankCode!=null) { 
			if (bankCode.getBytes().length>BANKCODE_LEN) {
				return hasErr("受款銀行代碼的資料長度["+bankCode.getBytes().length+"]不得超過["+BANKCODE_LEN+"]") ; 
			}
		}
		if (accountNo!=null) { 
			if (accountNo.getBytes().length>ACCOUNTNO_LEN) {
				return hasErr("受款銀行帳戶的資料長度["+accountNo.getBytes().length+"]不得超過["+ACCOUNTNO_LEN+"]") ; 
			}
		}
		if (bankName!=null) { 
			if (bankName.getBytes().length>BANKNAME_LEN) {
				return hasErr("受款銀行名稱的資料長度["+bankName.getBytes().length+"]不得超過["+BANKNAME_LEN+"]") ; 
			}
		}
		if (bankAddr!=null) { 
			if (bankAddr.getBytes().length>BANKADDR_LEN) {
				return hasErr("受款銀行地址的資料長度["+bankAddr.getBytes().length+"]不得超過["+BANKADDR_LEN+"]") ; 
			}
		}
		if (createDate!=null) { 
			if (createDate.length()>CREATEDATE_LEN) {
				return hasErr("建檔日期的資料長度["+createDate.length()+"]不得超過["+CREATEDATE_LEN+"]") ; 
			}
		}
		if ( !dejcUtility.isNull(createTime) )  { 
			if (!dejcUtility.checkTime(createTime))   { 
				return hasErr("建檔時間格式有誤:"+createTime) ; 
		    } 
		    if (createTime.length()>6) { 
			    return hasErr("建檔時間的資料過長") ; 
		    } 
		} 

		if (createEmplComp!=null) { 
			if (createEmplComp.getBytes().length>CREATEEMPLCOMP_LEN) {
				return hasErr("建檔人員公司別的資料長度["+createEmplComp.getBytes().length+"]不得超過["+CREATEEMPLCOMP_LEN+"]") ; 
			}
		}
		if (createEmpl!=null) { 
			if (createEmpl.getBytes().length>CREATEEMPL_LEN) {
				return hasErr("建檔人員的資料長度["+createEmpl.getBytes().length+"]不得超過["+CREATEEMPL_LEN+"]") ; 
			}
		}
		if (updateDate!=null) { 
			if (updateDate.length()>UPDATEDATE_LEN) {
				return hasErr("修改日期的資料長度["+updateDate.length()+"]不得超過["+UPDATEDATE_LEN+"]") ; 
			}
		}
		if ( !dejcUtility.isNull(updateTime) )  { 
			if (!dejcUtility.checkTime(updateTime))   { 
				return hasErr("修改時間格式有誤:"+updateTime) ; 
		    } 
		    if (updateTime.length()>6) { 
			    return hasErr("修改時間的資料過長") ; 
		    } 
		} 

		if (updateEmplComp!=null) { 
			if (updateEmplComp.getBytes().length>UPDATEEMPLCOMP_LEN) {
				return hasErr("修改人員公司別的資料長度["+updateEmplComp.getBytes().length+"]不得超過["+UPDATEEMPLCOMP_LEN+"]") ; 
			}
		}
		if (updateEmpl!=null) { 
			if (updateEmpl.getBytes().length>UPDATEEMPL_LEN) {
				return hasErr("修改人員的資料長度["+updateEmpl.getBytes().length+"]不得超過["+UPDATEEMPL_LEN+"]") ; 
			}
		}
		return true ;
	}	

/*----------------------------------------------------------------------------*/
/* private methods
/*----------------------------------------------------------------------------*/

	/**
	 * 設定執行訊息
	 * @param msg - 訊息
	 * @return false - always false
	 */
	private boolean hasErr(String msg) {
		this.message = msg;
		return false ;
	}

	/**
	 * 以欄位名稱取出資料(像 Map 一樣，
	 * @throws RuntimeException thrown when the field not exists
	 */
	public Object get(String field) {
	    return super.get(field) ;
	}


/*----------------------------------------------------------------------------*/
/* get and set methods for the instance variables
/*----------------------------------------------------------------------------*/

	/**
	 * 回傳執行訊息
	 * @return message - 取得執行訊息
	 * @since 103/06/25
     */
	public String getMessage() {
		return this.message ;
	}
	/**
	  *側錄flag，為true時才開始側錄
	  */
	private boolean monitoring ;
	/**
	 * 編輯欄位名稱
	 */
	private Map editFields;
	/**
	 * 屬性與table欄名對照
	 */
	private Map fieldColumnMapping ;
	/**
	 * 欄位舊資料名稱
	 */
	private Map oldFieldValues;

	/**
	  * 取得修改欄位資料
	  * @return null if no editFields
	  */
	public Map getEditFields() {
		return this.editFields;
	}
	/**
		* 取得修改的table column 欄位資料
		* @return null if no editFields
		*/
	public Map getEditColumns() {
        if (this.getEditFields()==null) {
            return null ;
        }
        Iterator it = this.getEditFields().entrySet().iterator();
        HashMap editColumns = new HashMap();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String column = (String) fieldColumnMapping.get( entry.getKey() );
            editColumns.put(column, entry.getValue()) ;
        }
        return editColumns ;
  }
		
	/**
	  *開始側錄 set進來的 fieldName,fieldValue
	  */
	public void monitor(){
		this.monitoring=true;
		this.editFields=new HashMap();
		this.fieldColumnMapping=new HashMap();
		this.oldFieldValues=new HashMap();
	}
	/**
	  *取消側錄
	  */
	public void stopMonitor(){
		this.monitoring=false;
	}
	/**
	  * 每個 set method 被呼叫時都會呼叫此方法
	  */
	public void onSetField(String field,String columnName,Object value){
		if(this.monitoring){
			oldFieldValues.put(field, get(field));
			fieldColumnMapping.put(field,columnName);
			editFields.put(field,value);
		}
	}
	
	/** 
	 * 設定uid
	 */ 
	public void setMsM01Uid(String msM01Uid)  { 
		if ( !dejcUtility.isNull(msM01Uid) ) {
			String s = msM01Uid.trim() ;  
			if (!dejcUtility.isNaN(s)) {  
			    setMsM01Uid(Integer.parseInt(s)) ; 
			    return ; 
         } 
	    }
	}
	public void setMsM01Uid(int msM01Uid)  {
		onSetField("msM01Uid","msM01Uid_MSM01",new Integer(this.msM01Uid));
		this.msM01Uid =  msM01Uid ;   
	}

	/** 
	 * 取得uid
	 */ 
	public int getMsM01Uid()  { 
		return this.msM01Uid ; 
	}
	/** 
	 * 取得 uid Insert SQL 特殊系統關鍵字 DEFAULT 
	 */ 
	public String getMsM01UidDEF()  { 
		return "DEFAULT" ; 
	}

	/** 
	 * 設定msM00Uid
	 */ 
	public void setMsM00Uid(int msM00Uid)  {
		onSetField("msM00Uid","msM00Uid_MSM01",new Integer(this.msM00Uid));
		this.msM00Uid=msM00Uid; 
	}
	/** 
	 * 設定msM00Uid
	 */ 
	public void setMsM00Uid(String msM00Uid)  { 
        if ( !dejcUtility.isNull(msM00Uid) ) {  
				String s = dejcUtility.removeComma(msM00Uid.trim()) ;  
            if ( !dejcUtility.isNaN(s)) { 
                setMsM00Uid (Integer.parseInt(s)); 
                return ; 
            }		    
         }               
         setMsM00Uid(0) ;  
	}

	/** 
	 * 取得msM00Uid
	 */ 
	public int getMsM00Uid()  { 
		return this.msM00Uid ; 
	}
	public String getMsM00UidMF()  { 
		DecimalFormat fmt=new DecimalFormat("#,###,##0");
		return fmt.format(this.msM00Uid) ; 
	}

	/** 
	 * 設定公司別
	 */ 
	public void setCompId(String compId)  {
		onSetField("compId","compId_MSM01",compId);
		this.compId = (compId == null || compId.length() == 0) ? "" : compId; 
	}

	/** 
	 * 取得公司別
	 */ 
	public String getCompId()  { 
		return this.compId ; 
	}
	/** 
	 * 取得公司別 ( 處理單引號的問題 )
	 */ 
	public String getCompIdS()  { 
		return dejcUtility.replaceS(this.compId) ; 
	}

	/** 
	 * 設定供應商編號
	 */ 
	public void setVendorNo(String vendorNo)  {
		onSetField("vendorNo","vendorNo_MSM01",vendorNo);
		this.vendorNo = (vendorNo == null || vendorNo.length() == 0) ? "" : vendorNo; 
	}

	/** 
	 * 取得供應商編號
	 */ 
	public String getVendorNo()  { 
		return this.vendorNo ; 
	}
	/** 
	 * 取得供應商編號 ( 處理單引號的問題 )
	 */ 
	public String getVendorNoS()  { 
		return dejcUtility.replaceS(this.vendorNo) ; 
	}

	/** 
	 * 設定編碼
	 */ 
	public void setAdty(String adty)  {
		onSetField("adty","adty_MSM01",adty);
		this.adty = (adty == null || adty.length() == 0) ? "" : adty; 
	}

	/** 
	 * 取得編碼
	 */ 
	public String getAdty()  { 
		return this.adty ; 
	}
	/** 
	 * 取得編碼 ( 處理單引號的問題 )
	 */ 
	public String getAdtyS()  { 
		return dejcUtility.replaceS(this.adty) ; 
	}

	/** 
	 * 設定是否預設選項
	 */ 
	public void setIsDefault(String isDefault)  {
		onSetField("isDefault","isDefault_MSM01",isDefault);
		this.isDefault = (isDefault == null || isDefault.length() == 0) ? "" : isDefault; 
	}

	/** 
	 * 取得是否預設選項
	 */ 
	public String getIsDefault()  { 
		return this.isDefault ; 
	}
	/** 
	 * 取得是否預設選項 ( 處理單引號的問題 )
	 */ 
	public String getIsDefaultS()  { 
		return dejcUtility.replaceS(this.isDefault) ; 
	}

	/** 
	 * 設定部門名稱
	 */ 
	public void setAreaId(String areaId)  {
		onSetField("areaId","areaId_MSM01",areaId);
		this.areaId = (areaId == null || areaId.length() == 0) ? "" : areaId; 
	}

	/** 
	 * 取得部門名稱
	 */ 
	public String getAreaId()  { 
		return this.areaId ; 
	}
	/** 
	 * 取得部門名稱 ( 處理單引號的問題 )
	 */ 
	public String getAreaIdS()  { 
		return dejcUtility.replaceS(this.areaId) ; 
	}

	/** 
	 * 設定郵遞區號
	 */ 
	public void setPostCode(String postCode)  {
		onSetField("postCode","postCode_MSM01",postCode);
		this.postCode = (postCode == null || postCode.length() == 0) ? "" : postCode; 
	}

	/** 
	 * 取得郵遞區號
	 */ 
	public String getPostCode()  { 
		return this.postCode ; 
	}
	/** 
	 * 取得郵遞區號 ( 處理單引號的問題 )
	 */ 
	public String getPostCodeS()  { 
		return dejcUtility.replaceS(this.postCode) ; 
	}

	/** 
	 * 設定地址
	 */ 
	public void setAddr(String addr)  {
		onSetField("addr","addr_MSM01",addr);
		this.addr = (addr == null || addr.length() == 0) ? "" : addr; 
	}

	/** 
	 * 取得地址
	 */ 
	public String getAddr()  { 
		return this.addr ; 
	}
	/** 
	 * 取得地址 ( 處理單引號的問題 )
	 */ 
	public String getAddrS()  { 
		return dejcUtility.replaceS(this.addr) ; 
	}

	/** 
	 * 設定地址(含縣市區)
	 */ 
	public void setAddrAll(String addrAll)  {
		onSetField("addrAll","addrAll_MSM01",addrAll);
		this.addrAll = (addrAll == null || addrAll.length() == 0) ? "" : addrAll; 
	}

	/** 
	 * 取得地址(含縣市區)
	 */ 
	public String getAddrAll()  { 
		return this.addrAll ; 
	}
	/** 
	 * 取得地址(含縣市區) ( 處理單引號的問題 )
	 */ 
	public String getAddrAllS()  { 
		return dejcUtility.replaceS(this.addrAll) ; 
	}

	/** 
	 * 設定電話
	 */ 
	public void setTel(String tel)  {
		onSetField("tel","tel_MSM01",tel);
		this.tel = (tel == null || tel.length() == 0) ? "" : tel; 
	}

	/** 
	 * 取得電話
	 */ 
	public String getTel()  { 
		return this.tel ; 
	}
	/** 
	 * 取得電話 ( 處理單引號的問題 )
	 */ 
	public String getTelS()  { 
		return dejcUtility.replaceS(this.tel) ; 
	}

	/** 
	 * 設定傳真
	 */ 
	public void setFax(String fax)  {
		onSetField("fax","fax_MSM01",fax);
		this.fax = (fax == null || fax.length() == 0) ? "" : fax; 
	}

	/** 
	 * 取得傳真
	 */ 
	public String getFax()  { 
		return this.fax ; 
	}
	/** 
	 * 取得傳真 ( 處理單引號的問題 )
	 */ 
	public String getFaxS()  { 
		return dejcUtility.replaceS(this.fax) ; 
	}

	/** 
	 * 設定電傳號碼
	 */ 
	public void setTelex(String telex)  {
		onSetField("telex","telex_MSM01",telex);
		this.telex = (telex == null || telex.length() == 0) ? "" : telex; 
	}

	/** 
	 * 取得電傳號碼
	 */ 
	public String getTelex()  { 
		return this.telex ; 
	}
	/** 
	 * 取得電傳號碼 ( 處理單引號的問題 )
	 */ 
	public String getTelexS()  { 
		return dejcUtility.replaceS(this.telex) ; 
	}

	/** 
	 * 設定聯絡人
	 */ 
	public void setContact(String contact)  {
		onSetField("contact","contact_MSM01",contact);
		this.contact = (contact == null || contact.length() == 0) ? "" : contact; 
	}

	/** 
	 * 取得聯絡人
	 */ 
	public String getContact()  { 
		return this.contact ; 
	}
	/** 
	 * 取得聯絡人 ( 處理單引號的問題 )
	 */ 
	public String getContactS()  { 
		return dejcUtility.replaceS(this.contact) ; 
	}

	/** 
	 * 設定聯絡人手機
	 */ 
	public void setMobile(String mobile)  {
		onSetField("mobile","mobile_MSM01",mobile);
		this.mobile = (mobile == null || mobile.length() == 0) ? "" : mobile; 
	}

	/** 
	 * 取得聯絡人手機
	 */ 
	public String getMobile()  { 
		return this.mobile ; 
	}
	/** 
	 * 取得聯絡人手機 ( 處理單引號的問題 )
	 */ 
	public String getMobileS()  { 
		return dejcUtility.replaceS(this.mobile) ; 
	}

	/** 
	 * 設定聯絡人電子信箱
	 */ 
	public void setEmail(String email)  {
		onSetField("email","email_MSM01",email);
		this.email = (email == null || email.length() == 0) ? "" : email; 
	}

	/** 
	 * 取得聯絡人電子信箱
	 */ 
	public String getEmail()  { 
		return this.email ; 
	}
	/** 
	 * 取得聯絡人電子信箱 ( 處理單引號的問題 )
	 */ 
	public String getEmailS()  { 
		return dejcUtility.replaceS(this.email) ; 
	}

	/** 
	 * 設定網路位置
	 */ 
	public void setWeb(String web)  {
		onSetField("web","web_MSM01",web);
		this.web = (web == null || web.length() == 0) ? "" : web; 
	}

	/** 
	 * 取得網路位置
	 */ 
	public String getWeb()  { 
		return this.web ; 
	}
	/** 
	 * 取得網路位置 ( 處理單引號的問題 )
	 */ 
	public String getWebS()  { 
		return dejcUtility.replaceS(this.web) ; 
	}

	/** 
	 * 設定公開招標類別
	 */ 
	public void setPublicClass(String publicClass)  {
		onSetField("publicClass","publicClass_MSM01",publicClass);
		this.publicClass = (publicClass == null || publicClass.length() == 0) ? "" : publicClass; 
	}

	/** 
	 * 取得公開招標類別
	 */ 
	public String getPublicClass()  { 
		return this.publicClass ; 
	}
	/** 
	 * 取得公開招標類別 ( 處理單引號的問題 )
	 */ 
	public String getPublicClassS()  { 
		return dejcUtility.replaceS(this.publicClass) ; 
	}

	/** 
	 * 設定供應商屬性
	 */ 
	public void setVendorType(String vendorType)  {
		onSetField("vendorType","vendorType_MSM01",vendorType);
		this.vendorType = (vendorType == null || vendorType.length() == 0) ? "" : vendorType; 
	}

	/** 
	 * 取得供應商屬性
	 */ 
	public String getVendorType()  { 
		return this.vendorType ; 
	}
	/** 
	 * 取得供應商屬性 ( 處理單引號的問題 )
	 */ 
	public String getVendorTypeS()  { 
		return dejcUtility.replaceS(this.vendorType) ; 
	}

	/** 
	 * 設定幣別
	 */ 
	public void setCrcy(String crcy)  {
		onSetField("crcy","crcy_MSM01",crcy);
		this.crcy = (crcy == null || crcy.length() == 0) ? "" : crcy; 
	}

	/** 
	 * 取得幣別
	 */ 
	public String getCrcy()  { 
		return this.crcy ; 
	}
	/** 
	 * 取得幣別 ( 處理單引號的問題 )
	 */ 
	public String getCrcyS()  { 
		return dejcUtility.replaceS(this.crcy) ; 
	}

	/** 
	 * 設定付款方式
	 */ 
	public void setPaidType(String paidType)  {
		onSetField("paidType","paidType_MSM01",paidType);
		this.paidType = (paidType == null || paidType.length() == 0) ? "" : paidType; 
	}

	/** 
	 * 取得付款方式
	 */ 
	public String getPaidType()  { 
		return this.paidType ; 
	}
	/** 
	 * 取得付款方式 ( 處理單引號的問題 )
	 */ 
	public String getPaidTypeS()  { 
		return dejcUtility.replaceS(this.paidType) ; 
	}

	/** 
	 * 設定受款銀行代碼
	 */ 
	public void setBankCode(String bankCode)  {
		onSetField("bankCode","bankCode_MSM01",bankCode);
		this.bankCode = (bankCode == null || bankCode.length() == 0) ? "" : bankCode; 
	}

	/** 
	 * 取得受款銀行代碼
	 */ 
	public String getBankCode()  { 
		return this.bankCode ; 
	}
	/** 
	 * 取得受款銀行代碼 ( 處理單引號的問題 )
	 */ 
	public String getBankCodeS()  { 
		return dejcUtility.replaceS(this.bankCode) ; 
	}

	/** 
	 * 設定受款銀行帳戶
	 */ 
	public void setAccountNo(String accountNo)  {
		onSetField("accountNo","accountNo_MSM01",accountNo);
		this.accountNo = (accountNo == null || accountNo.length() == 0) ? "" : accountNo; 
	}

	/** 
	 * 取得受款銀行帳戶
	 */ 
	public String getAccountNo()  { 
		return this.accountNo ; 
	}
	/** 
	 * 取得受款銀行帳戶 ( 處理單引號的問題 )
	 */ 
	public String getAccountNoS()  { 
		return dejcUtility.replaceS(this.accountNo) ; 
	}

	/** 
	 * 設定受款銀行名稱
	 */ 
	public void setBankName(String bankName)  {
		onSetField("bankName","bankName_MSM01",bankName);
		this.bankName = (bankName == null || bankName.length() == 0) ? "" : bankName; 
	}

	/** 
	 * 取得受款銀行名稱
	 */ 
	public String getBankName()  { 
		return this.bankName ; 
	}
	/** 
	 * 取得受款銀行名稱 ( 處理單引號的問題 )
	 */ 
	public String getBankNameS()  { 
		return dejcUtility.replaceS(this.bankName) ; 
	}

	/** 
	 * 設定受款銀行地址
	 */ 
	public void setBankAddr(String bankAddr)  {
		onSetField("bankAddr","bankAddr_MSM01",bankAddr);
		this.bankAddr = (bankAddr == null || bankAddr.length() == 0) ? "" : bankAddr; 
	}

	/** 
	 * 取得受款銀行地址
	 */ 
	public String getBankAddr()  { 
		return this.bankAddr ; 
	}
	/** 
	 * 取得受款銀行地址 ( 處理單引號的問題 )
	 */ 
	public String getBankAddrS()  { 
		return dejcUtility.replaceS(this.bankAddr) ; 
	}

	/** 
	 * 設定建檔日期
	 */ 
	public void setCreateDate(String createDate)  {
		onSetField("createDate","createDate_MSM01",createDate);
		this.createDate=createDate==null?"":dejcUtility.getWFmt1(createDate) ; 
	}

	/** 
	 * 取得建檔日期
	 */ 
	public String getCreateDate()  { 
		return this.createDate ; 
	}
	/** 
	 * 取得建檔日期的中式日期
	 */ 
	public String getCreateDateCF()  { 
		return dejcUtility.getDateF(this.createDate,"c") ; 
	}
	/** 
	 * 取得建檔日期的西式日期
	 */ 
	public String getCreateDateWF()  { 
		return dejcUtility.getDateF(this.createDate,"w2") ; 
	}
	/** 
	 * 取得建檔日期 ( 處理單引號的問題 )
	 */ 
	public String getCreateDateS()  { 
		return dejcUtility.replaceS(this.createDate) ; 
	}

	/** 
	 * 設定建檔時間
	 */ 
	public void setCreateTime(String createTime)  {
		onSetField("createTime","createTime_MSM01",createTime);
		this.createTime=createTime==null?"":dejcUtility.removeColon(createTime)  ; 
	}

	/** 
	 * 取得建檔時間
	 */ 
	public String getCreateTime()  { 
		return this.createTime ; 
	}
	/** 
	 * 取得建檔時間的 HH:MM 時間格式
	 */ 
	public String getCreateTimeHMF()  { 
		return dejcUtility.getHMF(this.createTime) ;
	}
	/** 
	 * 取得建檔時間的 HH:MM:SS 時間格式
	 */ 
	public String getCreateTimeHMSF()  { 
		return dejcUtility.getHMSF(this.createTime) ;
	}
	/** 
	 * 取得建檔時間 ( 處理單引號的問題 )
	 */ 
	public String getCreateTimeS()  { 
		return dejcUtility.replaceS(this.createTime) ; 
	}

	/** 
	 * 設定建檔人員公司別
	 */ 
	public void setCreateEmplComp(String createEmplComp)  {
		onSetField("createEmplComp","createEmplComp_MSM01",createEmplComp);
		this.createEmplComp = (createEmplComp == null || createEmplComp.length() == 0) ? "" : createEmplComp; 
	}

	/** 
	 * 取得建檔人員公司別
	 */ 
	public String getCreateEmplComp()  { 
		return this.createEmplComp ; 
	}
	/** 
	 * 取得建檔人員公司別 ( 處理單引號的問題 )
	 */ 
	public String getCreateEmplCompS()  { 
		return dejcUtility.replaceS(this.createEmplComp) ; 
	}

	/** 
	 * 設定建檔人員
	 */ 
	public void setCreateEmpl(String createEmpl)  {
		onSetField("createEmpl","createEmpl_MSM01",createEmpl);
		this.createEmpl = (createEmpl == null || createEmpl.length() == 0) ? "" : createEmpl; 
	}

	/** 
	 * 取得建檔人員
	 */ 
	public String getCreateEmpl()  { 
		return this.createEmpl ; 
	}
	/** 
	 * 取得建檔人員 ( 處理單引號的問題 )
	 */ 
	public String getCreateEmplS()  { 
		return dejcUtility.replaceS(this.createEmpl) ; 
	}

	/** 
	 * 設定修改日期
	 */ 
	public void setUpdateDate(String updateDate)  {
		onSetField("updateDate","updateDate_MSM01",updateDate);
		this.updateDate=updateDate==null?"":dejcUtility.getWFmt1(updateDate) ; 
	}

	/** 
	 * 取得修改日期
	 */ 
	public String getUpdateDate()  { 
		return this.updateDate ; 
	}
	/** 
	 * 取得修改日期的中式日期
	 */ 
	public String getUpdateDateCF()  { 
		return dejcUtility.getDateF(this.updateDate,"c") ; 
	}
	/** 
	 * 取得修改日期的西式日期
	 */ 
	public String getUpdateDateWF()  { 
		return dejcUtility.getDateF(this.updateDate,"w2") ; 
	}
	/** 
	 * 取得修改日期 ( 處理單引號的問題 )
	 */ 
	public String getUpdateDateS()  { 
		return dejcUtility.replaceS(this.updateDate) ; 
	}

	/** 
	 * 設定修改時間
	 */ 
	public void setUpdateTime(String updateTime)  {
		onSetField("updateTime","updateTime_MSM01",updateTime);
		this.updateTime=updateTime==null?"":dejcUtility.removeColon(updateTime)  ; 
	}

	/** 
	 * 取得修改時間
	 */ 
	public String getUpdateTime()  { 
		return this.updateTime ; 
	}
	/** 
	 * 取得修改時間的 HH:MM 時間格式
	 */ 
	public String getUpdateTimeHMF()  { 
		return dejcUtility.getHMF(this.updateTime) ;
	}
	/** 
	 * 取得修改時間的 HH:MM:SS 時間格式
	 */ 
	public String getUpdateTimeHMSF()  { 
		return dejcUtility.getHMSF(this.updateTime) ;
	}
	/** 
	 * 取得修改時間 ( 處理單引號的問題 )
	 */ 
	public String getUpdateTimeS()  { 
		return dejcUtility.replaceS(this.updateTime) ; 
	}

	/** 
	 * 設定修改人員公司別
	 */ 
	public void setUpdateEmplComp(String updateEmplComp)  {
		onSetField("updateEmplComp","updateEmplComp_MSM01",updateEmplComp);
		this.updateEmplComp = (updateEmplComp == null || updateEmplComp.length() == 0) ? "" : updateEmplComp; 
	}

	/** 
	 * 取得修改人員公司別
	 */ 
	public String getUpdateEmplComp()  { 
		return this.updateEmplComp ; 
	}
	/** 
	 * 取得修改人員公司別 ( 處理單引號的問題 )
	 */ 
	public String getUpdateEmplCompS()  { 
		return dejcUtility.replaceS(this.updateEmplComp) ; 
	}

	/** 
	 * 設定修改人員
	 */ 
	public void setUpdateEmpl(String updateEmpl)  {
		onSetField("updateEmpl","updateEmpl_MSM01",updateEmpl);
		this.updateEmpl = (updateEmpl == null || updateEmpl.length() == 0) ? "" : updateEmpl; 
	}

	/** 
	 * 取得修改人員
	 */ 
	public String getUpdateEmpl()  { 
		return this.updateEmpl ; 
	}
	/** 
	 * 取得修改人員 ( 處理單引號的問題 )
	 */ 
	public String getUpdateEmplS()  { 
		return dejcUtility.replaceS(this.updateEmpl) ; 
	}

	/**
	  *以欄位英文名稱取出中文名稱
	  */	
	public String getFieldDesc(String fieldName){
		Matcher matcher = Pattern.compile(fieldName+"=[^,]+").matcher(ATTRIB_DESC);
		if(matcher.find()){
			return matcher.group().replaceAll(fieldName+"=", "");
		}
		return null;
	}
	public String[] getAllFieldNames(){
		return ATTRIB_DESC.split("=[^,]+,");
	}
	/**
	 *是否有編輯過的欄位
	 */
	public boolean hasEditFields() {
		return getEditFields()!=null && !getEditFields().isEmpty();
	}
  	/**
	 * 列出所有被修改過的欄位名稱
	 * @return
	 */
	public String[] listEditFieldNames() {
		if(!hasEditFields()) {
			return new String[0];
		}
		Set keySet = getEditFields().keySet();
		String[] fieldNames=new String[keySet.size()];
		keySet.toArray(fieldNames);
		return fieldNames;
	}
	/**
	 * 取出修改前的資料
	 * @param field
	 * @return
	 */
	public Object getOldFieldValue(String field) {
		if(oldFieldValues==null) {
			return null ;
		}
		return oldFieldValues.get(field);
	}

/*----------------------------------------------------------------------------*/
/* Customize methods
/*----------------------------------------------------------------------------*/

//==^_^== ======= Don't Extend Your Code above , or All changes will lose after next Generating Code ===========  ==^_^== //
	/** 
	 * validate every attribute (ex. empty, date format...)
	 * method need to be implemented..
	 */ 
	public dejcVoValidater validate() { 
		dejcVoValidater v = null ; 
		 // v = new dejcVoValidater(this); 
		 // validating logic here...
		return v ; 
	} ; 

} // end of Class msjcTBMSM01DAO