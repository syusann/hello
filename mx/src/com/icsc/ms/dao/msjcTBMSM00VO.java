/*----------------------------------------------------------------------------*/
/* msjcTBMSM00VO		DAOTool Ver 10.0112 (INPUT FILE VERSION:2.0)  $Id: 12dbf84387b3435e988c31b2473af09c30e95aa1 $
/*----------------------------------------------------------------------------*/
/* author : 
/* system : 
/* target : 供應商基本資料檔
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
 * 供應商基本資料檔 Value Object.
 * <pre>
 * Table Name        : MS.TBMSM00
 * Table Description : 供應商基本資料檔
 * Data Access Object: msjcTBMSM00DAO
 * </pre>
 * @version 
 * @since msjcTBMSM00VO - 103/06/25
 * @author 
 */
public class msjcTBMSM00VO extends dejcCommonVO implements Serializable {
	public final static String AppId = "MSJCTBMSM00VO" ;
	public final static String CLASS_VERSION = "$Revision: 1.3 $ $Date: 2014/06/26 06:50:40 $";
	public final static String ATTRIB_DESC="msM00Uid=uid,compId=公司別,vendorNo=供應商編號,countryId=國別,cVendorName=中文供應商名稱,eVendorName=英文供應商名稱,abbrevName=公司簡稱,capital=登記資本額,capitalCrcy=登記資本額幣別,owner=公司負責人,oldVendorNo=原供應商編號,newVendorNo=轉供應商編號,invoiceType=開發票通知方式,respDept=承辦部門,rejUpdDate=停權更新日,rejCode=停權狀態,rejStartDate=停權起始日,rejEndDate=停權結束日,rejReason=停權說明,rejPoNo=違約案號,reqDate=最近詢價日期,reqTimes=詢價次數,poDate=最近交易日期,poTimes=總交易次數,attachment=附件,status=供應商狀態,isIssue=是否可詢,isQuote=是否可報,isPO=是否可訂購,dataType=廠商資料區,mailId=mpmail帳號,createMailDate=C1建立mpmail日期,confirmMailDate=供應商mpmail確認日期,createDate=建檔日期,createTime=建檔時間,createEmplComp=建檔人員公司別,createEmpl=建檔人員,updateDate=修改日期,updateTime=修改時間,updateEmplComp=修改人員公司別,updateEmpl=修改人員," ; 

	/**
	 * uid 輸入欄位長度
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
	 * 國別 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int COUNTRYID_LEN = 10 ;
	/**
	 * 中文供應商名稱 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int CVENDORNAME_LEN = 100 ;
	/**
	 * 英文供應商名稱 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int EVENDORNAME_LEN = 100 ;
	/**
	 * 公司簡稱 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int ABBREVNAME_LEN = 50 ;
	/**
	 * 登記資本額 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int CAPITAL_LEN = 13 ;
	/**
	 * 登記資本額幣別 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int CAPITALCRCY_LEN = 5 ;
	/**
	 * 公司負責人 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int OWNER_LEN = 50 ;
	/**
	 * 原供應商編號 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int OLDVENDORNO_LEN = 10 ;
	/**
	 * 轉供應商編號 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int NEWVENDORNO_LEN = 10 ;
	/**
	 * 開發票通知方式 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int INVOICETYPE_LEN = 2 ;
	/**
	 * 承辦部門 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int RESPDEPT_LEN = 6 ;
	/**
	 * 停權更新日 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int REJUPDDATE_LEN = 8 ;
	/**
	 * 停權狀態 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int REJCODE_LEN = 2 ;
	/**
	 * 停權起始日 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int REJSTARTDATE_LEN = 8 ;
	/**
	 * 停權結束日 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int REJENDDATE_LEN = 8 ;
	/**
	 * 停權說明 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int REJREASON_LEN = 500 ;
	/**
	 * 違約案號 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int REJPONO_LEN = 20 ;
	/**
	 * 最近詢價日期 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int REQDATE_LEN = 8 ;
	/**
	 * 詢價次數 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int REQTIMES_LEN = 6 ;
	/**
	 * 最近交易日期 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int PODATE_LEN = 8 ;
	/**
	 * 總交易次數 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int POTIMES_LEN = 6 ;
	/**
	 * 附件 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int ATTACHMENT_LEN = 20 ;
	/**
	 * 供應商狀態 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int STATUS_LEN = 2 ;
	/**
	 * 是否可詢 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int ISISSUE_LEN = 1 ;
	/**
	 * 是否可報 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int ISQUOTE_LEN = 1 ;
	/**
	 * 是否可訂購 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int ISPO_LEN = 1 ;
	/**
	 * 廠商資料區 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int DATATYPE_LEN = 2 ;
	/**
	 * mpmail帳號 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int MAILID_LEN = 10 ;
	/**
	 * C1建立mpmail日期 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int CREATEMAILDATE_LEN = 8 ;
	/**
	 * 供應商mpmail確認日期 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int CONFIRMMAILDATE_LEN = 8 ;
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
/* MS.TBMSM00 column Name
/*----------------------------------------------------------------------------*/

	/**
	 * uid
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
	 * 國別
	 * @since 103/06/25
	 */
	private String countryId;
	/**
	 * 中文供應商名稱
	 * @since 103/06/25
	 */
	private String cVendorName;
	/**
	 * 英文供應商名稱
	 * @since 103/06/25
	 */
	private String eVendorName;
	/**
	 * 公司簡稱
	 * @since 103/06/25
	 */
	private String abbrevName;
	/**
	 * 登記資本額
	 * @since 103/06/25
	 */
	private BigDecimal capital;
	/**
	 * 登記資本額幣別
	 * @since 103/06/25
	 */
	private String capitalCrcy;
	/**
	 * 公司負責人
	 * @since 103/06/25
	 */
	private String owner;
	/**
	 * 原供應商編號
	 * @since 103/06/25
	 */
	private String oldVendorNo;
	/**
	 * 轉供應商編號
	 * @since 103/06/25
	 */
	private String newVendorNo;
	/**
	 * 開發票通知方式
	 * @since 103/06/25
	 */
	private String invoiceType;
	/**
	 * 承辦部門
	 * @since 103/06/25
	 */
	private String respDept;
	/**
	 * 停權更新日
	 * @since 103/06/25
	 */
	private String rejUpdDate;
	/**
	 * 停權狀態
	 * @since 103/06/25
	 */
	private String rejCode;
	/**
	 * 停權起始日
	 * @since 103/06/25
	 */
	private String rejStartDate;
	/**
	 * 停權結束日
	 * @since 103/06/25
	 */
	private String rejEndDate;
	/**
	 * 停權說明
	 * @since 103/06/25
	 */
	private String rejReason;
	/**
	 * 違約案號
	 * @since 103/06/25
	 */
	private String rejPoNo;
	/**
	 * 最近詢價日期
	 * @since 103/06/25
	 */
	private String reqDate;
	/**
	 * 詢價次數
	 * @since 103/06/25
	 */
	private int reqTimes;
	/**
	 * 最近交易日期
	 * @since 103/06/25
	 */
	private String poDate;
	/**
	 * 總交易次數
	 * @since 103/06/25
	 */
	private int poTimes;
	/**
	 * 附件
	 * @since 103/06/25
	 */
	private String attachment;
	/**
	 * 供應商狀態
	 * @since 103/06/25
	 */
	private String status;
	/**
	 * 是否可詢
	 * @since 103/06/25
	 */
	private String isIssue;
	/**
	 * 是否可報
	 * @since 103/06/25
	 */
	private String isQuote;
	/**
	 * 是否可訂購
	 * @since 103/06/25
	 */
	private String isPO;
	/**
	 * 廠商資料區
	 * @since 103/06/25
	 */
	private String dataType;
	/**
	 * mpmail帳號
	 * @since 103/06/25
	 */
	private String mailId;
	/**
	 * C1建立mpmail日期
	 * @since 103/06/25
	 */
	private String createMailDate;
	/**
	 * 供應商mpmail確認日期
	 * @since 103/06/25
	 */
	private String confirmMailDate;
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
/* Creates new msjcTBMSM00VO
/*----------------------------------------------------------------------------*/

	/**
	 * 建構子
	 * @since 103/06/25
	 */
	public msjcTBMSM00VO() {
		clear() ;
		super.setChild(this) ;
	}
	/**
	 * 主要鍵建構子
	 * @since 103/06/25
	 */
	public msjcTBMSM00VO(int msM00Uid) {
		this() ;
		this.msM00Uid = msM00Uid ;	// uid
	}
	
	/**
	 * 將所有的欄位 reset 成預設值.
	 * <pre>
	 * 當物件資料不需再被使用時(例如物件被 delete 後仍需放一個空物件到畫面上)
	 * 可以使用此方法，好處是可以重覆使用此物件，不需再 new 一個新的
	 *</pre>
	 */
	public void clear() {
		this.msM00Uid = 0 ;	// uid
		this.compId = "" ;	// 公司別
		this.vendorNo = "" ;	// 供應商編號
		this.countryId = "" ;	// 國別
		this.cVendorName = "" ;	// 中文供應商名稱
		this.eVendorName = "" ;	// 英文供應商名稱
		this.abbrevName = "" ;	// 公司簡稱
		this.capital = new BigDecimal("0") ;	// 登記資本額
		this.capitalCrcy = "" ;	// 登記資本額幣別
		this.owner = "" ;	// 公司負責人
		this.oldVendorNo = "" ;	// 原供應商編號
		this.newVendorNo = "" ;	// 轉供應商編號
		this.invoiceType = "" ;	// 開發票通知方式
		this.respDept = "" ;	// 承辦部門
		this.rejUpdDate = "" ;	// 停權更新日
		this.rejCode = "" ;	// 停權狀態
		this.rejStartDate = "" ;	// 停權起始日
		this.rejEndDate = "" ;	// 停權結束日
		this.rejReason = "" ;	// 停權說明
		this.rejPoNo = "" ;	// 違約案號
		this.reqDate = "" ;	// 最近詢價日期
		this.reqTimes = 0 ;	// 詢價次數
		this.poDate = "" ;	// 最近交易日期
		this.poTimes = 0 ;	// 總交易次數
		this.attachment = "" ;	// 附件
		this.status = "" ;	// 供應商狀態
		this.isIssue = "" ;	// 是否可詢
		this.isQuote = "" ;	// 是否可報
		this.isPO = "" ;	// 是否可訂購
		this.dataType = "" ;	// 廠商資料區
		this.mailId = "" ;	// mpmail帳號
		this.createMailDate = "" ;	// C1建立mpmail日期
		this.confirmMailDate = "" ;	// 供應商mpmail確認日期
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
	public msjcTBMSM00VO myClone() {
		msjcTBMSM00VO mstBMSM00VO = new msjcTBMSM00VO() ;
		mstBMSM00VO.setMsM00Uid(this.msM00Uid);
		mstBMSM00VO.setCompId(this.compId);
		mstBMSM00VO.setVendorNo(this.vendorNo);
		mstBMSM00VO.setCountryId(this.countryId);
		mstBMSM00VO.setCVendorName(this.cVendorName);
		mstBMSM00VO.setEVendorName(this.eVendorName);
		mstBMSM00VO.setAbbrevName(this.abbrevName);
		mstBMSM00VO.setCapital(this.capital);
		mstBMSM00VO.setCapitalCrcy(this.capitalCrcy);
		mstBMSM00VO.setOwner(this.owner);
		mstBMSM00VO.setOldVendorNo(this.oldVendorNo);
		mstBMSM00VO.setNewVendorNo(this.newVendorNo);
		mstBMSM00VO.setInvoiceType(this.invoiceType);
		mstBMSM00VO.setRespDept(this.respDept);
		mstBMSM00VO.setRejUpdDate(this.rejUpdDate);
		mstBMSM00VO.setRejCode(this.rejCode);
		mstBMSM00VO.setRejStartDate(this.rejStartDate);
		mstBMSM00VO.setRejEndDate(this.rejEndDate);
		mstBMSM00VO.setRejReason(this.rejReason);
		mstBMSM00VO.setRejPoNo(this.rejPoNo);
		mstBMSM00VO.setReqDate(this.reqDate);
		mstBMSM00VO.setReqTimes(this.reqTimes);
		mstBMSM00VO.setPoDate(this.poDate);
		mstBMSM00VO.setPoTimes(this.poTimes);
		mstBMSM00VO.setAttachment(this.attachment);
		mstBMSM00VO.setStatus(this.status);
		mstBMSM00VO.setIsIssue(this.isIssue);
		mstBMSM00VO.setIsQuote(this.isQuote);
		mstBMSM00VO.setIsPO(this.isPO);
		mstBMSM00VO.setDataType(this.dataType);
		mstBMSM00VO.setMailId(this.mailId);
		mstBMSM00VO.setCreateMailDate(this.createMailDate);
		mstBMSM00VO.setConfirmMailDate(this.confirmMailDate);
		mstBMSM00VO.setCreateDate(this.createDate);
		mstBMSM00VO.setCreateTime(this.createTime);
		mstBMSM00VO.setCreateEmplComp(this.createEmplComp);
		mstBMSM00VO.setCreateEmpl(this.createEmpl);
		mstBMSM00VO.setUpdateDate(this.updateDate);
		mstBMSM00VO.setUpdateTime(this.updateTime);
		mstBMSM00VO.setUpdateEmplComp(this.updateEmplComp);
		mstBMSM00VO.setUpdateEmpl(this.updateEmpl);
		return mstBMSM00VO ;
	}

/**
  * toJSON 方法
  * <p>
  * @return JSON String
  * @since 103/06/25
  */
 public String toJSON() {
  StringBuffer sb = new StringBuffer() ;
  sb.append("msM00Uid :\""+dejcUtility.parseToJSON(getMsM00Uid()+"")+"\"") ;
  sb.append(",");
  sb.append("compId :\""+dejcUtility.parseToJSON(getCompId()+"")+"\"") ;
  sb.append(",");
  sb.append("vendorNo :\""+dejcUtility.parseToJSON(getVendorNo()+"")+"\"") ;
  sb.append(",");
  sb.append("countryId :\""+dejcUtility.parseToJSON(getCountryId()+"")+"\"") ;
  sb.append(",");
  sb.append("cVendorName :\""+dejcUtility.parseToJSON(getCVendorName()+"")+"\"") ;
  sb.append(",");
  sb.append("eVendorName :\""+dejcUtility.parseToJSON(getEVendorName()+"")+"\"") ;
  sb.append(",");
  sb.append("abbrevName :\""+dejcUtility.parseToJSON(getAbbrevName()+"")+"\"") ;
  sb.append(",");
  sb.append("capital :\""+dejcUtility.parseToJSON(getCapital()+"")+"\"") ;
  sb.append(",");
  sb.append("capitalCrcy :\""+dejcUtility.parseToJSON(getCapitalCrcy()+"")+"\"") ;
  sb.append(",");
  sb.append("owner :\""+dejcUtility.parseToJSON(getOwner()+"")+"\"") ;
  sb.append(",");
  sb.append("oldVendorNo :\""+dejcUtility.parseToJSON(getOldVendorNo()+"")+"\"") ;
  sb.append(",");
  sb.append("newVendorNo :\""+dejcUtility.parseToJSON(getNewVendorNo()+"")+"\"") ;
  sb.append(",");
  sb.append("invoiceType :\""+dejcUtility.parseToJSON(getInvoiceType()+"")+"\"") ;
  sb.append(",");
  sb.append("respDept :\""+dejcUtility.parseToJSON(getRespDept()+"")+"\"") ;
  sb.append(",");
  sb.append("rejUpdDate :\""+dejcUtility.parseToJSON(getRejUpdDate()+"")+"\"") ;
  sb.append(",");
  sb.append("rejCode :\""+dejcUtility.parseToJSON(getRejCode()+"")+"\"") ;
  sb.append(",");
  sb.append("rejStartDate :\""+dejcUtility.parseToJSON(getRejStartDate()+"")+"\"") ;
  sb.append(",");
  sb.append("rejEndDate :\""+dejcUtility.parseToJSON(getRejEndDate()+"")+"\"") ;
  sb.append(",");
  sb.append("rejReason :\""+dejcUtility.parseToJSON(getRejReason()+"")+"\"") ;
  sb.append(",");
  sb.append("rejPoNo :\""+dejcUtility.parseToJSON(getRejPoNo()+"")+"\"") ;
  sb.append(",");
  sb.append("reqDate :\""+dejcUtility.parseToJSON(getReqDate()+"")+"\"") ;
  sb.append(",");
  sb.append("reqTimes :\""+dejcUtility.parseToJSON(getReqTimes()+"")+"\"") ;
  sb.append(",");
  sb.append("poDate :\""+dejcUtility.parseToJSON(getPoDate()+"")+"\"") ;
  sb.append(",");
  sb.append("poTimes :\""+dejcUtility.parseToJSON(getPoTimes()+"")+"\"") ;
  sb.append(",");
  sb.append("attachment :\""+dejcUtility.parseToJSON(getAttachment()+"")+"\"") ;
  sb.append(",");
  sb.append("status :\""+dejcUtility.parseToJSON(getStatus()+"")+"\"") ;
  sb.append(",");
  sb.append("isIssue :\""+dejcUtility.parseToJSON(getIsIssue()+"")+"\"") ;
  sb.append(",");
  sb.append("isQuote :\""+dejcUtility.parseToJSON(getIsQuote()+"")+"\"") ;
  sb.append(",");
  sb.append("isPO :\""+dejcUtility.parseToJSON(getIsPO()+"")+"\"") ;
  sb.append(",");
  sb.append("dataType :\""+dejcUtility.parseToJSON(getDataType()+"")+"\"") ;
  sb.append(",");
  sb.append("mailId :\""+dejcUtility.parseToJSON(getMailId()+"")+"\"") ;
  sb.append(",");
  sb.append("createMailDate :\""+dejcUtility.parseToJSON(getCreateMailDate()+"")+"\"") ;
  sb.append(",");
  sb.append("confirmMailDate :\""+dejcUtility.parseToJSON(getConfirmMailDate()+"")+"\"") ;
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
	 * @return msjcTBMSM00VO - 產生 Value Object
	 * @exception SQLException - DB SQLException
	 * @since 103/06/25
	 */
	public static msjcTBMSM00VO getInstance(ResultSet rs) throws SQLException,Exception {
		msjcTBMSM00VO mstBMSM00VO = new msjcTBMSM00VO() ;

  		mstBMSM00VO.setMsM00Uid(rs.getInt(1));
  		mstBMSM00VO.setCompId(rs.getString(2));
  		mstBMSM00VO.setVendorNo(rs.getString(3));
  		mstBMSM00VO.setCountryId(rs.getString(4));
  		mstBMSM00VO.setCVendorName(rs.getString(5));
  		mstBMSM00VO.setEVendorName(rs.getString(6));
  		mstBMSM00VO.setAbbrevName(rs.getString(7));
  		mstBMSM00VO.setCapital(rs.getBigDecimal(8));
  		mstBMSM00VO.setCapitalCrcy(rs.getString(9));
  		mstBMSM00VO.setOwner(rs.getString(10));
  		mstBMSM00VO.setOldVendorNo(rs.getString(11));
  		mstBMSM00VO.setNewVendorNo(rs.getString(12));
  		mstBMSM00VO.setInvoiceType(rs.getString(13));
  		mstBMSM00VO.setRespDept(rs.getString(14));
  		mstBMSM00VO.setRejUpdDate(rs.getString(15));
  		mstBMSM00VO.setRejCode(rs.getString(16));
  		mstBMSM00VO.setRejStartDate(rs.getString(17));
  		mstBMSM00VO.setRejEndDate(rs.getString(18));
  		mstBMSM00VO.setRejReason(rs.getString(19));
  		mstBMSM00VO.setRejPoNo(rs.getString(20));
  		mstBMSM00VO.setReqDate(rs.getString(21));
  		mstBMSM00VO.setReqTimes(rs.getInt(22));
  		mstBMSM00VO.setPoDate(rs.getString(23));
  		mstBMSM00VO.setPoTimes(rs.getInt(24));
  		mstBMSM00VO.setAttachment(rs.getString(25));
  		mstBMSM00VO.setStatus(rs.getString(26));
  		mstBMSM00VO.setIsIssue(rs.getString(27));
  		mstBMSM00VO.setIsQuote(rs.getString(28));
  		mstBMSM00VO.setIsPO(rs.getString(29));
  		mstBMSM00VO.setDataType(rs.getString(30));
  		mstBMSM00VO.setMailId(rs.getString(31));
  		mstBMSM00VO.setCreateMailDate(rs.getString(32));
  		mstBMSM00VO.setConfirmMailDate(rs.getString(33));
  		mstBMSM00VO.setCreateDate(rs.getString(34));
  		mstBMSM00VO.setCreateTime(rs.getString(35));
  		mstBMSM00VO.setCreateEmplComp(rs.getString(36));
  		mstBMSM00VO.setCreateEmpl(rs.getString(37));
  		mstBMSM00VO.setUpdateDate(rs.getString(38));
  		mstBMSM00VO.setUpdateTime(rs.getString(39));
  		mstBMSM00VO.setUpdateEmplComp(rs.getString(40));
  		mstBMSM00VO.setUpdateEmpl(rs.getString(41));
  		return mstBMSM00VO ;
	}

	/**
	 * 以 ResultSet 來作物件
	 * <p>
	 * @param rs - 單一 ResultSet
	 * @return msjcTBMSM00VO - 產生 Value Object
	 * @exception SQLException - DB SQLException
	 * @since 103/06/25
	 */
	public static msjcTBMSM00VO getInstanceByName(ResultSet rs) throws SQLException,Exception {
		return getInstanceByName(new msjcTBMSM00VO(), rs) ;
	}

	/**
	 * 以 ResultSet 來作物件, 使用由 user 傳進來的物件
	 * <p>
	 * @param rs - 單一 ResultSet
	 * @return msjcTBMSM00VO - 產生 Value Object
	 * @exception SQLException - DB SQLException
	 * @since 103/06/25
	 */
	public static msjcTBMSM00VO getInstanceByName(Object obj, ResultSet rs) throws SQLException {
		msjcTBMSM00VO mstBMSM00VO = (msjcTBMSM00VO)obj ;
  		mstBMSM00VO.setMsM00Uid(rs.getInt("msM00Uid_MSM00"));
  		mstBMSM00VO.setCompId(rs.getString("compId_MSM00"));
  		mstBMSM00VO.setVendorNo(rs.getString("vendorNo_MSM00"));
  		mstBMSM00VO.setCountryId(rs.getString("countryId_MSM00"));
  		mstBMSM00VO.setCVendorName(rs.getString("cVendorName_MSM00"));
  		mstBMSM00VO.setEVendorName(rs.getString("eVendorName_MSM00"));
  		mstBMSM00VO.setAbbrevName(rs.getString("abbrevName_MSM00"));
  		mstBMSM00VO.setCapital(rs.getBigDecimal("capital_MSM00"));
  		mstBMSM00VO.setCapitalCrcy(rs.getString("capitalCrcy_MSM00"));
  		mstBMSM00VO.setOwner(rs.getString("owner_MSM00"));
  		mstBMSM00VO.setOldVendorNo(rs.getString("oldVendorNo_MSM00"));
  		mstBMSM00VO.setNewVendorNo(rs.getString("newVendorNo_MSM00"));
  		mstBMSM00VO.setInvoiceType(rs.getString("invoiceType_MSM00"));
  		mstBMSM00VO.setRespDept(rs.getString("respDept_MSM00"));
  		mstBMSM00VO.setRejUpdDate(rs.getString("rejUpdDate_MSM00"));
  		mstBMSM00VO.setRejCode(rs.getString("rejCode_MSM00"));
  		mstBMSM00VO.setRejStartDate(rs.getString("rejStartDate_MSM00"));
  		mstBMSM00VO.setRejEndDate(rs.getString("rejEndDate_MSM00"));
  		mstBMSM00VO.setRejReason(rs.getString("rejReason_MSM00"));
  		mstBMSM00VO.setRejPoNo(rs.getString("rejPoNo_MSM00"));
  		mstBMSM00VO.setReqDate(rs.getString("reqDate_MSM00"));
  		mstBMSM00VO.setReqTimes(rs.getInt("reqTimes_MSM00"));
  		mstBMSM00VO.setPoDate(rs.getString("poDate_MSM00"));
  		mstBMSM00VO.setPoTimes(rs.getInt("poTimes_MSM00"));
  		mstBMSM00VO.setAttachment(rs.getString("attachment_MSM00"));
  		mstBMSM00VO.setStatus(rs.getString("status_MSM00"));
  		mstBMSM00VO.setIsIssue(rs.getString("isIssue_MSM00"));
  		mstBMSM00VO.setIsQuote(rs.getString("isQuote_MSM00"));
  		mstBMSM00VO.setIsPO(rs.getString("isPO_MSM00"));
  		mstBMSM00VO.setDataType(rs.getString("dataType_MSM00"));
  		mstBMSM00VO.setMailId(rs.getString("mailId_MSM00"));
  		mstBMSM00VO.setCreateMailDate(rs.getString("createMailDate_MSM00"));
  		mstBMSM00VO.setConfirmMailDate(rs.getString("confirmMailDate_MSM00"));
  		mstBMSM00VO.setCreateDate(rs.getString("createDate_MSM00"));
  		mstBMSM00VO.setCreateTime(rs.getString("createTime_MSM00"));
  		mstBMSM00VO.setCreateEmplComp(rs.getString("createEmplComp_MSM00"));
  		mstBMSM00VO.setCreateEmpl(rs.getString("createEmpl_MSM00"));
  		mstBMSM00VO.setUpdateDate(rs.getString("updateDate_MSM00"));
  		mstBMSM00VO.setUpdateTime(rs.getString("updateTime_MSM00"));
  		mstBMSM00VO.setUpdateEmplComp(rs.getString("updateEmplComp_MSM00"));
  		mstBMSM00VO.setUpdateEmpl(rs.getString("updateEmpl_MSM00"));
  		return mstBMSM00VO ;
	}

	/**
	 * 以 Request 來作物件
	 * <p>
	 * @param request - 網頁要求物件
	 * @return msjcTBMSM00VO - 產生 Value Object
	 * @since 103/06/25
	 */
	public static msjcTBMSM00VO getInstance(HttpServletRequest request) {
		return getFromReq(request, -1) ;
	}
	/**
	 * 以 Request 來作物件 (遇到多筆資料時)
	 * <p>
	 * @param request - 網頁要求物件
	 * @param index - 參數流水序號
	 * @return msjcTBMSM00VO - 產生 Value Object
	 * @since 103/06/25
	 */
	public static msjcTBMSM00VO getInstance(HttpServletRequest request, int index) {
		return getFromReq(request, index) ;
	}
	/**
	 * 以 Request 來作物件
	 * <p>
	 * @param req - 網頁要求物件
	 * @param index - 參數流水序號
	 * @return msjcTBMSM00VO - 產生 Value Object
	 * @since 103/06/25
	 */
	private static msjcTBMSM00VO getFromReq(HttpServletRequest req, int index) {
		String seq = (index >= 0) ? String.valueOf(index) : "" ;
		msjcTBMSM00VO mstBMSM00VO = new msjcTBMSM00VO() ;

		mstBMSM00VO.setMsM00Uid(req.getParameter("msM00Uid"+seq)) ;
		mstBMSM00VO.setCompId(req.getParameter("compId"+seq)) ;
		mstBMSM00VO.setVendorNo(req.getParameter("vendorNo"+seq)) ;
		mstBMSM00VO.setCountryId(req.getParameter("countryId"+seq)) ;
		mstBMSM00VO.setCVendorName(req.getParameter("cVendorName"+seq)) ;
		mstBMSM00VO.setEVendorName(req.getParameter("eVendorName"+seq)) ;
		mstBMSM00VO.setAbbrevName(req.getParameter("abbrevName"+seq)) ;
		mstBMSM00VO.setCapital(req.getParameter("capital"+seq)) ;
		mstBMSM00VO.setCapitalCrcy(req.getParameter("capitalCrcy"+seq)) ;
		mstBMSM00VO.setOwner(req.getParameter("owner"+seq)) ;
		mstBMSM00VO.setOldVendorNo(req.getParameter("oldVendorNo"+seq)) ;
		mstBMSM00VO.setNewVendorNo(req.getParameter("newVendorNo"+seq)) ;
		mstBMSM00VO.setInvoiceType(req.getParameter("invoiceType"+seq)) ;
		mstBMSM00VO.setRespDept(req.getParameter("respDept"+seq)) ;
		mstBMSM00VO.setRejUpdDate(req.getParameter("rejUpdDate"+seq)) ;
		mstBMSM00VO.setRejCode(req.getParameter("rejCode"+seq)) ;
		mstBMSM00VO.setRejStartDate(req.getParameter("rejStartDate"+seq)) ;
		mstBMSM00VO.setRejEndDate(req.getParameter("rejEndDate"+seq)) ;
		mstBMSM00VO.setRejReason(req.getParameter("rejReason"+seq)) ;
		mstBMSM00VO.setRejPoNo(req.getParameter("rejPoNo"+seq)) ;
		mstBMSM00VO.setReqDate(req.getParameter("reqDate"+seq)) ;
		mstBMSM00VO.setReqTimes(req.getParameter("reqTimes"+seq)) ;
		mstBMSM00VO.setPoDate(req.getParameter("poDate"+seq)) ;
		mstBMSM00VO.setPoTimes(req.getParameter("poTimes"+seq)) ;
		mstBMSM00VO.setAttachment(req.getParameter("attachment"+seq)) ;
		mstBMSM00VO.setStatus(req.getParameter("status"+seq)) ;
		mstBMSM00VO.setIsIssue(req.getParameter("isIssue"+seq)) ;
		mstBMSM00VO.setIsQuote(req.getParameter("isQuote"+seq)) ;
		mstBMSM00VO.setIsPO(req.getParameter("isPO"+seq)) ;
		mstBMSM00VO.setDataType(req.getParameter("dataType"+seq)) ;
		mstBMSM00VO.setMailId(req.getParameter("mailId"+seq)) ;
		mstBMSM00VO.setCreateMailDate(req.getParameter("createMailDate"+seq)) ;
		mstBMSM00VO.setConfirmMailDate(req.getParameter("confirmMailDate"+seq)) ;
		mstBMSM00VO.setCreateDate(req.getParameter("createDate"+seq)) ;
		mstBMSM00VO.setCreateTime(req.getParameter("createTime"+seq)) ;
		mstBMSM00VO.setCreateEmplComp(req.getParameter("createEmplComp"+seq)) ;
		mstBMSM00VO.setCreateEmpl(req.getParameter("createEmpl"+seq)) ;
		mstBMSM00VO.setUpdateDate(req.getParameter("updateDate"+seq)) ;
		mstBMSM00VO.setUpdateTime(req.getParameter("updateTime"+seq)) ;
		mstBMSM00VO.setUpdateEmplComp(req.getParameter("updateEmplComp"+seq)) ;
		mstBMSM00VO.setUpdateEmpl(req.getParameter("updateEmpl"+seq)) ;

		return mstBMSM00VO ;
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

		sb.append("<msjcTBMSM00VO>");
		sb.append(super.toString());
		sb.append("\r\n\tmsM00Uid = " + getMsM00Uid()) ;
		sb.append("\r\n\tcompId = " + getCompId()) ;
		sb.append("\r\n\tvendorNo = " + getVendorNo()) ;
		sb.append("\r\n\tcountryId = " + getCountryId()) ;
		sb.append("\r\n\tcVendorName = " + getCVendorName()) ;
		sb.append("\r\n\teVendorName = " + getEVendorName()) ;
		sb.append("\r\n\tabbrevName = " + getAbbrevName()) ;
		sb.append("\r\n\tcapital = " + getCapital()) ;
		sb.append("\r\n\tcapitalCrcy = " + getCapitalCrcy()) ;
		sb.append("\r\n\towner = " + getOwner()) ;
		sb.append("\r\n\toldVendorNo = " + getOldVendorNo()) ;
		sb.append("\r\n\tnewVendorNo = " + getNewVendorNo()) ;
		sb.append("\r\n\tinvoiceType = " + getInvoiceType()) ;
		sb.append("\r\n\trespDept = " + getRespDept()) ;
		sb.append("\r\n\trejUpdDate = " + getRejUpdDate()) ;
		sb.append("\r\n\trejCode = " + getRejCode()) ;
		sb.append("\r\n\trejStartDate = " + getRejStartDate()) ;
		sb.append("\r\n\trejEndDate = " + getRejEndDate()) ;
		sb.append("\r\n\trejReason = " + getRejReason()) ;
		sb.append("\r\n\trejPoNo = " + getRejPoNo()) ;
		sb.append("\r\n\treqDate = " + getReqDate()) ;
		sb.append("\r\n\treqTimes = " + getReqTimes()) ;
		sb.append("\r\n\tpoDate = " + getPoDate()) ;
		sb.append("\r\n\tpoTimes = " + getPoTimes()) ;
		sb.append("\r\n\tattachment = " + getAttachment()) ;
		sb.append("\r\n\tstatus = " + getStatus()) ;
		sb.append("\r\n\tisIssue = " + getIsIssue()) ;
		sb.append("\r\n\tisQuote = " + getIsQuote()) ;
		sb.append("\r\n\tisPO = " + getIsPO()) ;
		sb.append("\r\n\tdataType = " + getDataType()) ;
		sb.append("\r\n\tmailId = " + getMailId()) ;
		sb.append("\r\n\tcreateMailDate = " + getCreateMailDate()) ;
		sb.append("\r\n\tconfirmMailDate = " + getConfirmMailDate()) ;
		sb.append("\r\n\tcreateDate = " + getCreateDate()) ;
		sb.append("\r\n\tcreateTime = " + getCreateTime()) ;
		sb.append("\r\n\tcreateEmplComp = " + getCreateEmplComp()) ;
		sb.append("\r\n\tcreateEmpl = " + getCreateEmpl()) ;
		sb.append("\r\n\tupdateDate = " + getUpdateDate()) ;
		sb.append("\r\n\tupdateTime = " + getUpdateTime()) ;
		sb.append("\r\n\tupdateEmplComp = " + getUpdateEmplComp()) ;
		sb.append("\r\n\tupdateEmpl = " + getUpdateEmpl()) ;
		sb.append("\r\n</msjcTBMSM00VO>");

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
		if (object instanceof msjcTBMSM00VO == false) {
			return false ;
		}

		msjcTBMSM00VO mstBMSM00VO = (msjcTBMSM00VO) object ;
		if (this.msM00Uid == mstBMSM00VO.getMsM00Uid() == false) {
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
		if (dejcUtility.isNull(this.msM00Uid)) {
			return hasErr("msM00Uid") ;
		}
		return true ;
	}
	/**
	 * 檢查資料的正確性 (包括長度，型態)
	 * @return true - ok; false - hasErr
	 * @since 103/06/25
	 */
	public boolean verify() {

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
		if (countryId!=null) { 
			if (countryId.getBytes().length>COUNTRYID_LEN) {
				return hasErr("國別的資料長度["+countryId.getBytes().length+"]不得超過["+COUNTRYID_LEN+"]") ; 
			}
		}
		if (cVendorName!=null) { 
			if (cVendorName.getBytes().length>CVENDORNAME_LEN) {
				return hasErr("中文供應商名稱的資料長度["+cVendorName.getBytes().length+"]不得超過["+CVENDORNAME_LEN+"]") ; 
			}
		}
		if (eVendorName!=null) { 
			if (eVendorName.getBytes().length>EVENDORNAME_LEN) {
				return hasErr("英文供應商名稱的資料長度["+eVendorName.getBytes().length+"]不得超過["+EVENDORNAME_LEN+"]") ; 
			}
		}
		if (abbrevName!=null) { 
			if (abbrevName.getBytes().length>ABBREVNAME_LEN) {
				return hasErr("公司簡稱的資料長度["+abbrevName.getBytes().length+"]不得超過["+ABBREVNAME_LEN+"]") ; 
			}
		}
		if (capital!=null) { 
			if (capital.compareTo(new BigDecimal("10000000000000"))>=0)  {
				return hasErr("登記資本額的總額["+capital.toString()+"]不得超過 10000000000000 ") ;
			}
		}

		if (capitalCrcy!=null) { 
			if (capitalCrcy.getBytes().length>CAPITALCRCY_LEN) {
				return hasErr("登記資本額幣別的資料長度["+capitalCrcy.getBytes().length+"]不得超過["+CAPITALCRCY_LEN+"]") ; 
			}
		}
		if (owner!=null) { 
			if (owner.getBytes().length>OWNER_LEN) {
				return hasErr("公司負責人的資料長度["+owner.getBytes().length+"]不得超過["+OWNER_LEN+"]") ; 
			}
		}
		if (oldVendorNo!=null) { 
			if (oldVendorNo.getBytes().length>OLDVENDORNO_LEN) {
				return hasErr("原供應商編號的資料長度["+oldVendorNo.getBytes().length+"]不得超過["+OLDVENDORNO_LEN+"]") ; 
			}
		}
		if (newVendorNo!=null) { 
			if (newVendorNo.getBytes().length>NEWVENDORNO_LEN) {
				return hasErr("轉供應商編號的資料長度["+newVendorNo.getBytes().length+"]不得超過["+NEWVENDORNO_LEN+"]") ; 
			}
		}
		if (invoiceType!=null) { 
			if (invoiceType.getBytes().length>INVOICETYPE_LEN) {
				return hasErr("開發票通知方式的資料長度["+invoiceType.getBytes().length+"]不得超過["+INVOICETYPE_LEN+"]") ; 
			}
		}
		if (respDept!=null) { 
			if (respDept.getBytes().length>RESPDEPT_LEN) {
				return hasErr("承辦部門的資料長度["+respDept.getBytes().length+"]不得超過["+RESPDEPT_LEN+"]") ; 
			}
		}
		if (rejUpdDate!=null) { 
			if (rejUpdDate.length()>REJUPDDATE_LEN) {
				return hasErr("停權更新日的資料長度["+rejUpdDate.length()+"]不得超過["+REJUPDDATE_LEN+"]") ; 
			}
		}
		if (rejCode!=null) { 
			if (rejCode.getBytes().length>REJCODE_LEN) {
				return hasErr("停權狀態的資料長度["+rejCode.getBytes().length+"]不得超過["+REJCODE_LEN+"]") ; 
			}
		}
		if (rejStartDate!=null) { 
			if (rejStartDate.length()>REJSTARTDATE_LEN) {
				return hasErr("停權起始日的資料長度["+rejStartDate.length()+"]不得超過["+REJSTARTDATE_LEN+"]") ; 
			}
		}
		if (rejEndDate!=null) { 
			if (rejEndDate.length()>REJENDDATE_LEN) {
				return hasErr("停權結束日的資料長度["+rejEndDate.length()+"]不得超過["+REJENDDATE_LEN+"]") ; 
			}
		}
		if (rejReason!=null) { 
			if (rejReason.getBytes().length>REJREASON_LEN) {
				return hasErr("停權說明的資料長度["+rejReason.getBytes().length+"]不得超過["+REJREASON_LEN+"]") ; 
			}
		}
		if (rejPoNo!=null) { 
			if (rejPoNo.getBytes().length>REJPONO_LEN) {
				return hasErr("違約案號的資料長度["+rejPoNo.getBytes().length+"]不得超過["+REJPONO_LEN+"]") ; 
			}
		}
		if (reqDate!=null) { 
			if (reqDate.length()>REQDATE_LEN) {
				return hasErr("最近詢價日期的資料長度["+reqDate.length()+"]不得超過["+REQDATE_LEN+"]") ; 
			}
		}
		if (reqTimes>2147483647) { 
			return hasErr("詢價次數的資料["+reqTimes+"]不得超過2147483647") ; 
		}
		if (poDate!=null) { 
			if (poDate.length()>PODATE_LEN) {
				return hasErr("最近交易日期的資料長度["+poDate.length()+"]不得超過["+PODATE_LEN+"]") ; 
			}
		}
		if (poTimes>2147483647) { 
			return hasErr("總交易次數的資料["+poTimes+"]不得超過2147483647") ; 
		}
		if (attachment!=null) { 
			if (attachment.getBytes().length>ATTACHMENT_LEN) {
				return hasErr("附件的資料長度["+attachment.getBytes().length+"]不得超過["+ATTACHMENT_LEN+"]") ; 
			}
		}
		if (status!=null) { 
			if (status.getBytes().length>STATUS_LEN) {
				return hasErr("供應商狀態的資料長度["+status.getBytes().length+"]不得超過["+STATUS_LEN+"]") ; 
			}
		}
		if (isIssue!=null) { 
			if (isIssue.getBytes().length>ISISSUE_LEN) {
				return hasErr("是否可詢的資料長度["+isIssue.getBytes().length+"]不得超過["+ISISSUE_LEN+"]") ; 
			}
		}
		if (isQuote!=null) { 
			if (isQuote.getBytes().length>ISQUOTE_LEN) {
				return hasErr("是否可報的資料長度["+isQuote.getBytes().length+"]不得超過["+ISQUOTE_LEN+"]") ; 
			}
		}
		if (isPO!=null) { 
			if (isPO.getBytes().length>ISPO_LEN) {
				return hasErr("是否可訂購的資料長度["+isPO.getBytes().length+"]不得超過["+ISPO_LEN+"]") ; 
			}
		}
		if (dataType!=null) { 
			if (dataType.getBytes().length>DATATYPE_LEN) {
				return hasErr("廠商資料區的資料長度["+dataType.getBytes().length+"]不得超過["+DATATYPE_LEN+"]") ; 
			}
		}
		if (mailId!=null) { 
			if (mailId.getBytes().length>MAILID_LEN) {
				return hasErr("mpmail帳號的資料長度["+mailId.getBytes().length+"]不得超過["+MAILID_LEN+"]") ; 
			}
		}
		if (createMailDate!=null) { 
			if (createMailDate.length()>CREATEMAILDATE_LEN) {
				return hasErr("C1建立mpmail日期的資料長度["+createMailDate.length()+"]不得超過["+CREATEMAILDATE_LEN+"]") ; 
			}
		}
		if (confirmMailDate!=null) { 
			if (confirmMailDate.length()>CONFIRMMAILDATE_LEN) {
				return hasErr("供應商mpmail確認日期的資料長度["+confirmMailDate.length()+"]不得超過["+CONFIRMMAILDATE_LEN+"]") ; 
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
	public void setMsM00Uid(String msM00Uid)  { 
		if ( !dejcUtility.isNull(msM00Uid) ) {
			String s = msM00Uid.trim() ;  
			if (!dejcUtility.isNaN(s)) {  
			    setMsM00Uid(Integer.parseInt(s)) ; 
			    return ; 
         } 
	    }
	}
	public void setMsM00Uid(int msM00Uid)  {
		onSetField("msM00Uid","msM00Uid_MSM00",new Integer(this.msM00Uid));
		this.msM00Uid =  msM00Uid ;   
	}

	/** 
	 * 取得uid
	 */ 
	public int getMsM00Uid()  { 
		return this.msM00Uid ; 
	}
	/** 
	 * 取得 uid Insert SQL 特殊系統關鍵字 DEFAULT 
	 */ 
	public String getMsM00UidDEF()  { 
		return "DEFAULT" ; 
	}

	/** 
	 * 設定公司別
	 */ 
	public void setCompId(String compId)  {
		onSetField("compId","compId_MSM00",compId);
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
		onSetField("vendorNo","vendorNo_MSM00",vendorNo);
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
	 * 設定國別
	 */ 
	public void setCountryId(String countryId)  {
		onSetField("countryId","countryId_MSM00",countryId);
		this.countryId = (countryId == null || countryId.length() == 0) ? "" : countryId; 
	}

	/** 
	 * 取得國別
	 */ 
	public String getCountryId()  { 
		return this.countryId ; 
	}
	/** 
	 * 取得國別 ( 處理單引號的問題 )
	 */ 
	public String getCountryIdS()  { 
		return dejcUtility.replaceS(this.countryId) ; 
	}

	/** 
	 * 設定中文供應商名稱
	 */ 
	public void setCVendorName(String cVendorName)  {
		onSetField("cVendorName","cVendorName_MSM00",cVendorName);
		this.cVendorName = (cVendorName == null || cVendorName.length() == 0) ? "" : cVendorName; 
	}

	/** 
	 * 取得中文供應商名稱
	 */ 
	public String getCVendorName()  { 
		return this.cVendorName ; 
	}
	/** 
	 * 取得中文供應商名稱 ( 處理單引號的問題 )
	 */ 
	public String getCVendorNameS()  { 
		return dejcUtility.replaceS(this.cVendorName) ; 
	}

	/** 
	 * 設定英文供應商名稱
	 */ 
	public void setEVendorName(String eVendorName)  {
		onSetField("eVendorName","eVendorName_MSM00",eVendorName);
		this.eVendorName = (eVendorName == null || eVendorName.length() == 0) ? "" : eVendorName; 
	}

	/** 
	 * 取得英文供應商名稱
	 */ 
	public String getEVendorName()  { 
		return this.eVendorName ; 
	}
	/** 
	 * 取得英文供應商名稱 ( 處理單引號的問題 )
	 */ 
	public String getEVendorNameS()  { 
		return dejcUtility.replaceS(this.eVendorName) ; 
	}

	/** 
	 * 設定公司簡稱
	 */ 
	public void setAbbrevName(String abbrevName)  {
		onSetField("abbrevName","abbrevName_MSM00",abbrevName);
		this.abbrevName = (abbrevName == null || abbrevName.length() == 0) ? "" : abbrevName; 
	}

	/** 
	 * 取得公司簡稱
	 */ 
	public String getAbbrevName()  { 
		return this.abbrevName ; 
	}
	/** 
	 * 取得公司簡稱 ( 處理單引號的問題 )
	 */ 
	public String getAbbrevNameS()  { 
		return dejcUtility.replaceS(this.abbrevName) ; 
	}

	/** 
	 * 設定登記資本額金額(拿掉逗點)
	 */ 
	public void setCapital(String capital)  { 
		if ( !dejcUtility.isNull(capital) ) {
			String s = dejcUtility.removeComma(capital.trim()) ;  
			if (!dejcUtility.isNaN(s)) {  
			    setCapital(new BigDecimal(s)) ; 
			    return ; 
         } 
	    }
     setCapital( new BigDecimal("0")) ; 
	}
	public void setCapital(BigDecimal capital)  {
		onSetField("capital","capital_MSM00",capital);
		this.capital = (capital==null)?new BigDecimal("0"):capital ;   
	}

	/** 
	 * 取得登記資本額金額
	 */ 
	public BigDecimal getCapital()  { 
		return this.capital ; 
	}
	public String getCapitalMF()  { 
		if (this.capital==null) return null ;
		DecimalFormat fmt=new DecimalFormat("#,###,##0");
		return fmt.format(this.capital) ; 
	}
	public String getCapitalMF(int decimal)  { 
		if (this.capital==null) return null ;
     StringBuffer tmp = new StringBuffer(".") ; 
     for(int i=0; i<decimal; i++)  {
         tmp.append( "0") ;
     } 
 		DecimalFormat fmt=new DecimalFormat("#,###,##0"+tmp.toString()) ;
		return fmt.format(this.capital) ; 
	}

	/** 
	 * 設定登記資本額幣別
	 */ 
	public void setCapitalCrcy(String capitalCrcy)  {
		onSetField("capitalCrcy","capitalCrcy_MSM00",capitalCrcy);
		this.capitalCrcy = (capitalCrcy == null || capitalCrcy.length() == 0) ? "" : capitalCrcy; 
	}

	/** 
	 * 取得登記資本額幣別
	 */ 
	public String getCapitalCrcy()  { 
		return this.capitalCrcy ; 
	}
	/** 
	 * 取得登記資本額幣別 ( 處理單引號的問題 )
	 */ 
	public String getCapitalCrcyS()  { 
		return dejcUtility.replaceS(this.capitalCrcy) ; 
	}

	/** 
	 * 設定公司負責人
	 */ 
	public void setOwner(String owner)  {
		onSetField("owner","owner_MSM00",owner);
		this.owner = (owner == null || owner.length() == 0) ? "" : owner; 
	}

	/** 
	 * 取得公司負責人
	 */ 
	public String getOwner()  { 
		return this.owner ; 
	}
	/** 
	 * 取得公司負責人 ( 處理單引號的問題 )
	 */ 
	public String getOwnerS()  { 
		return dejcUtility.replaceS(this.owner) ; 
	}

	/** 
	 * 設定原供應商編號
	 */ 
	public void setOldVendorNo(String oldVendorNo)  {
		onSetField("oldVendorNo","oldVendorNo_MSM00",oldVendorNo);
		this.oldVendorNo = (oldVendorNo == null || oldVendorNo.length() == 0) ? "" : oldVendorNo; 
	}

	/** 
	 * 取得原供應商編號
	 */ 
	public String getOldVendorNo()  { 
		return this.oldVendorNo ; 
	}
	/** 
	 * 取得原供應商編號 ( 處理單引號的問題 )
	 */ 
	public String getOldVendorNoS()  { 
		return dejcUtility.replaceS(this.oldVendorNo) ; 
	}

	/** 
	 * 設定轉供應商編號
	 */ 
	public void setNewVendorNo(String newVendorNo)  {
		onSetField("newVendorNo","newVendorNo_MSM00",newVendorNo);
		this.newVendorNo = (newVendorNo == null || newVendorNo.length() == 0) ? "" : newVendorNo; 
	}

	/** 
	 * 取得轉供應商編號
	 */ 
	public String getNewVendorNo()  { 
		return this.newVendorNo ; 
	}
	/** 
	 * 取得轉供應商編號 ( 處理單引號的問題 )
	 */ 
	public String getNewVendorNoS()  { 
		return dejcUtility.replaceS(this.newVendorNo) ; 
	}

	/** 
	 * 設定開發票通知方式
	 */ 
	public void setInvoiceType(String invoiceType)  {
		onSetField("invoiceType","invoiceType_MSM00",invoiceType);
		this.invoiceType = (invoiceType == null || invoiceType.length() == 0) ? "" : invoiceType; 
	}

	/** 
	 * 取得開發票通知方式
	 */ 
	public String getInvoiceType()  { 
		return this.invoiceType ; 
	}
	/** 
	 * 取得開發票通知方式 ( 處理單引號的問題 )
	 */ 
	public String getInvoiceTypeS()  { 
		return dejcUtility.replaceS(this.invoiceType) ; 
	}

	/** 
	 * 設定承辦部門
	 */ 
	public void setRespDept(String respDept)  {
		onSetField("respDept","respDept_MSM00",respDept);
		this.respDept = (respDept == null || respDept.length() == 0) ? "" : respDept; 
	}

	/** 
	 * 取得承辦部門
	 */ 
	public String getRespDept()  { 
		return this.respDept ; 
	}
	/** 
	 * 取得承辦部門 ( 處理單引號的問題 )
	 */ 
	public String getRespDeptS()  { 
		return dejcUtility.replaceS(this.respDept) ; 
	}

	/** 
	 * 設定停權更新日
	 */ 
	public void setRejUpdDate(String rejUpdDate)  {
		onSetField("rejUpdDate","rejUpdDate_MSM00",rejUpdDate);
		this.rejUpdDate=rejUpdDate==null?"":dejcUtility.getWFmt1(rejUpdDate) ; 
	}

	/** 
	 * 取得停權更新日
	 */ 
	public String getRejUpdDate()  { 
		return this.rejUpdDate ; 
	}
	/** 
	 * 取得停權更新日的中式日期
	 */ 
	public String getRejUpdDateCF()  { 
		return dejcUtility.getDateF(this.rejUpdDate,"c") ; 
	}
	/** 
	 * 取得停權更新日的西式日期
	 */ 
	public String getRejUpdDateWF()  { 
		return dejcUtility.getDateF(this.rejUpdDate,"w2") ; 
	}
	/** 
	 * 取得停權更新日 ( 處理單引號的問題 )
	 */ 
	public String getRejUpdDateS()  { 
		return dejcUtility.replaceS(this.rejUpdDate) ; 
	}

	/** 
	 * 設定停權狀態
	 */ 
	public void setRejCode(String rejCode)  {
		onSetField("rejCode","rejCode_MSM00",rejCode);
		this.rejCode = (rejCode == null || rejCode.length() == 0) ? "" : rejCode; 
	}

	/** 
	 * 取得停權狀態
	 */ 
	public String getRejCode()  { 
		return this.rejCode ; 
	}
	/** 
	 * 取得停權狀態 ( 處理單引號的問題 )
	 */ 
	public String getRejCodeS()  { 
		return dejcUtility.replaceS(this.rejCode) ; 
	}

	/** 
	 * 設定停權起始日
	 */ 
	public void setRejStartDate(String rejStartDate)  {
		onSetField("rejStartDate","rejStartDate_MSM00",rejStartDate);
		this.rejStartDate=rejStartDate==null?"":dejcUtility.getWFmt1(rejStartDate) ; 
	}

	/** 
	 * 取得停權起始日
	 */ 
	public String getRejStartDate()  { 
		return this.rejStartDate ; 
	}
	/** 
	 * 取得停權起始日的中式日期
	 */ 
	public String getRejStartDateCF()  { 
		return dejcUtility.getDateF(this.rejStartDate,"c") ; 
	}
	/** 
	 * 取得停權起始日的西式日期
	 */ 
	public String getRejStartDateWF()  { 
		return dejcUtility.getDateF(this.rejStartDate,"w2") ; 
	}
	/** 
	 * 取得停權起始日 ( 處理單引號的問題 )
	 */ 
	public String getRejStartDateS()  { 
		return dejcUtility.replaceS(this.rejStartDate) ; 
	}

	/** 
	 * 設定停權結束日
	 */ 
	public void setRejEndDate(String rejEndDate)  {
		onSetField("rejEndDate","rejEndDate_MSM00",rejEndDate);
		this.rejEndDate=rejEndDate==null?"":dejcUtility.getWFmt1(rejEndDate) ; 
	}

	/** 
	 * 取得停權結束日
	 */ 
	public String getRejEndDate()  { 
		return this.rejEndDate ; 
	}
	/** 
	 * 取得停權結束日的中式日期
	 */ 
	public String getRejEndDateCF()  { 
		return dejcUtility.getDateF(this.rejEndDate,"c") ; 
	}
	/** 
	 * 取得停權結束日的西式日期
	 */ 
	public String getRejEndDateWF()  { 
		return dejcUtility.getDateF(this.rejEndDate,"w2") ; 
	}
	/** 
	 * 取得停權結束日 ( 處理單引號的問題 )
	 */ 
	public String getRejEndDateS()  { 
		return dejcUtility.replaceS(this.rejEndDate) ; 
	}

	/** 
	 * 設定停權說明
	 */ 
	public void setRejReason(String rejReason)  {
		onSetField("rejReason","rejReason_MSM00",rejReason);
		this.rejReason = (rejReason == null || rejReason.length() == 0) ? "" : rejReason; 
	}

	/** 
	 * 取得停權說明
	 */ 
	public String getRejReason()  { 
		return this.rejReason ; 
	}
	/** 
	 * 取得停權說明 ( 處理單引號的問題 )
	 */ 
	public String getRejReasonS()  { 
		return dejcUtility.replaceS(this.rejReason) ; 
	}

	/** 
	 * 設定違約案號
	 */ 
	public void setRejPoNo(String rejPoNo)  {
		onSetField("rejPoNo","rejPoNo_MSM00",rejPoNo);
		this.rejPoNo = (rejPoNo == null || rejPoNo.length() == 0) ? "" : rejPoNo; 
	}

	/** 
	 * 取得違約案號
	 */ 
	public String getRejPoNo()  { 
		return this.rejPoNo ; 
	}
	/** 
	 * 取得違約案號 ( 處理單引號的問題 )
	 */ 
	public String getRejPoNoS()  { 
		return dejcUtility.replaceS(this.rejPoNo) ; 
	}

	/** 
	 * 設定最近詢價日期
	 */ 
	public void setReqDate(String reqDate)  {
		onSetField("reqDate","reqDate_MSM00",reqDate);
		this.reqDate=reqDate==null?"":dejcUtility.getWFmt1(reqDate) ; 
	}

	/** 
	 * 取得最近詢價日期
	 */ 
	public String getReqDate()  { 
		return this.reqDate ; 
	}
	/** 
	 * 取得最近詢價日期的中式日期
	 */ 
	public String getReqDateCF()  { 
		return dejcUtility.getDateF(this.reqDate,"c") ; 
	}
	/** 
	 * 取得最近詢價日期的西式日期
	 */ 
	public String getReqDateWF()  { 
		return dejcUtility.getDateF(this.reqDate,"w2") ; 
	}
	/** 
	 * 取得最近詢價日期 ( 處理單引號的問題 )
	 */ 
	public String getReqDateS()  { 
		return dejcUtility.replaceS(this.reqDate) ; 
	}

	/** 
	 * 設定詢價次數
	 */ 
	public void setReqTimes(int reqTimes)  {
		onSetField("reqTimes","reqTimes_MSM00",new Integer(this.reqTimes));
		this.reqTimes=reqTimes; 
	}
	/** 
	 * 設定詢價次數
	 */ 
	public void setReqTimes(String reqTimes)  { 
        if ( !dejcUtility.isNull(reqTimes) ) {  
				String s = dejcUtility.removeComma(reqTimes.trim()) ;  
            if ( !dejcUtility.isNaN(s)) { 
                setReqTimes (Integer.parseInt(s)); 
                return ; 
            }		    
         }               
         setReqTimes(0) ;  
	}

	/** 
	 * 取得詢價次數
	 */ 
	public int getReqTimes()  { 
		return this.reqTimes ; 
	}
	public String getReqTimesMF()  { 
		DecimalFormat fmt=new DecimalFormat("#,###,##0");
		return fmt.format(this.reqTimes) ; 
	}

	/** 
	 * 設定最近交易日期
	 */ 
	public void setPoDate(String poDate)  {
		onSetField("poDate","poDate_MSM00",poDate);
		this.poDate=poDate==null?"":dejcUtility.getWFmt1(poDate) ; 
	}

	/** 
	 * 取得最近交易日期
	 */ 
	public String getPoDate()  { 
		return this.poDate ; 
	}
	/** 
	 * 取得最近交易日期的中式日期
	 */ 
	public String getPoDateCF()  { 
		return dejcUtility.getDateF(this.poDate,"c") ; 
	}
	/** 
	 * 取得最近交易日期的西式日期
	 */ 
	public String getPoDateWF()  { 
		return dejcUtility.getDateF(this.poDate,"w2") ; 
	}
	/** 
	 * 取得最近交易日期 ( 處理單引號的問題 )
	 */ 
	public String getPoDateS()  { 
		return dejcUtility.replaceS(this.poDate) ; 
	}

	/** 
	 * 設定總交易次數
	 */ 
	public void setPoTimes(int poTimes)  {
		onSetField("poTimes","poTimes_MSM00",new Integer(this.poTimes));
		this.poTimes=poTimes; 
	}
	/** 
	 * 設定總交易次數
	 */ 
	public void setPoTimes(String poTimes)  { 
        if ( !dejcUtility.isNull(poTimes) ) {  
				String s = dejcUtility.removeComma(poTimes.trim()) ;  
            if ( !dejcUtility.isNaN(s)) { 
                setPoTimes (Integer.parseInt(s)); 
                return ; 
            }		    
         }               
         setPoTimes(0) ;  
	}

	/** 
	 * 取得總交易次數
	 */ 
	public int getPoTimes()  { 
		return this.poTimes ; 
	}
	public String getPoTimesMF()  { 
		DecimalFormat fmt=new DecimalFormat("#,###,##0");
		return fmt.format(this.poTimes) ; 
	}

	/** 
	 * 設定附件
	 */ 
	public void setAttachment(String attachment)  {
		onSetField("attachment","attachment_MSM00",attachment);
		this.attachment = (attachment == null || attachment.length() == 0) ? "" : attachment; 
	}

	/** 
	 * 取得附件
	 */ 
	public String getAttachment()  { 
		return this.attachment ; 
	}
	/** 
	 * 取得附件 ( 處理單引號的問題 )
	 */ 
	public String getAttachmentS()  { 
		return dejcUtility.replaceS(this.attachment) ; 
	}

	/** 
	 * 設定供應商狀態
	 */ 
	public void setStatus(String status)  {
		onSetField("status","status_MSM00",status);
		this.status = (status == null || status.length() == 0) ? "" : status; 
	}

	/** 
	 * 取得供應商狀態
	 */ 
	public String getStatus()  { 
		return this.status ; 
	}
	/** 
	 * 取得供應商狀態 ( 處理單引號的問題 )
	 */ 
	public String getStatusS()  { 
		return dejcUtility.replaceS(this.status) ; 
	}

	/** 
	 * 設定是否可詢
	 */ 
	public void setIsIssue(String isIssue)  {
		onSetField("isIssue","isIssue_MSM00",isIssue);
		this.isIssue = (isIssue == null || isIssue.length() == 0) ? "" : isIssue; 
	}

	/** 
	 * 取得是否可詢
	 */ 
	public String getIsIssue()  { 
		return this.isIssue ; 
	}
	/** 
	 * 取得是否可詢 ( 處理單引號的問題 )
	 */ 
	public String getIsIssueS()  { 
		return dejcUtility.replaceS(this.isIssue) ; 
	}

	/** 
	 * 設定是否可報
	 */ 
	public void setIsQuote(String isQuote)  {
		onSetField("isQuote","isQuote_MSM00",isQuote);
		this.isQuote = (isQuote == null || isQuote.length() == 0) ? "" : isQuote; 
	}

	/** 
	 * 取得是否可報
	 */ 
	public String getIsQuote()  { 
		return this.isQuote ; 
	}
	/** 
	 * 取得是否可報 ( 處理單引號的問題 )
	 */ 
	public String getIsQuoteS()  { 
		return dejcUtility.replaceS(this.isQuote) ; 
	}

	/** 
	 * 設定是否可訂購
	 */ 
	public void setIsPO(String isPO)  {
		onSetField("isPO","isPO_MSM00",isPO);
		this.isPO = (isPO == null || isPO.length() == 0) ? "" : isPO; 
	}

	/** 
	 * 取得是否可訂購
	 */ 
	public String getIsPO()  { 
		return this.isPO ; 
	}
	/** 
	 * 取得是否可訂購 ( 處理單引號的問題 )
	 */ 
	public String getIsPOS()  { 
		return dejcUtility.replaceS(this.isPO) ; 
	}

	/** 
	 * 設定廠商資料區
	 */ 
	public void setDataType(String dataType)  {
		onSetField("dataType","dataType_MSM00",dataType);
		this.dataType = (dataType == null || dataType.length() == 0) ? "" : dataType; 
	}

	/** 
	 * 取得廠商資料區
	 */ 
	public String getDataType()  { 
		return this.dataType ; 
	}
	/** 
	 * 取得廠商資料區 ( 處理單引號的問題 )
	 */ 
	public String getDataTypeS()  { 
		return dejcUtility.replaceS(this.dataType) ; 
	}

	/** 
	 * 設定mpmail帳號
	 */ 
	public void setMailId(String mailId)  {
		onSetField("mailId","mailId_MSM00",mailId);
		this.mailId = (mailId == null || mailId.length() == 0) ? "" : mailId; 
	}

	/** 
	 * 取得mpmail帳號
	 */ 
	public String getMailId()  { 
		return this.mailId ; 
	}
	/** 
	 * 取得mpmail帳號 ( 處理單引號的問題 )
	 */ 
	public String getMailIdS()  { 
		return dejcUtility.replaceS(this.mailId) ; 
	}

	/** 
	 * 設定C1建立mpmail日期
	 */ 
	public void setCreateMailDate(String createMailDate)  {
		onSetField("createMailDate","createMailDate_MSM00",createMailDate);
		this.createMailDate=createMailDate==null?"":dejcUtility.getWFmt1(createMailDate) ; 
	}

	/** 
	 * 取得C1建立mpmail日期
	 */ 
	public String getCreateMailDate()  { 
		return this.createMailDate ; 
	}
	/** 
	 * 取得C1建立mpmail日期的中式日期
	 */ 
	public String getCreateMailDateCF()  { 
		return dejcUtility.getDateF(this.createMailDate,"c") ; 
	}
	/** 
	 * 取得C1建立mpmail日期的西式日期
	 */ 
	public String getCreateMailDateWF()  { 
		return dejcUtility.getDateF(this.createMailDate,"w2") ; 
	}
	/** 
	 * 取得C1建立mpmail日期 ( 處理單引號的問題 )
	 */ 
	public String getCreateMailDateS()  { 
		return dejcUtility.replaceS(this.createMailDate) ; 
	}

	/** 
	 * 設定供應商mpmail確認日期
	 */ 
	public void setConfirmMailDate(String confirmMailDate)  {
		onSetField("confirmMailDate","confirmMailDate_MSM00",confirmMailDate);
		this.confirmMailDate=confirmMailDate==null?"":dejcUtility.getWFmt1(confirmMailDate) ; 
	}

	/** 
	 * 取得供應商mpmail確認日期
	 */ 
	public String getConfirmMailDate()  { 
		return this.confirmMailDate ; 
	}
	/** 
	 * 取得供應商mpmail確認日期的中式日期
	 */ 
	public String getConfirmMailDateCF()  { 
		return dejcUtility.getDateF(this.confirmMailDate,"c") ; 
	}
	/** 
	 * 取得供應商mpmail確認日期的西式日期
	 */ 
	public String getConfirmMailDateWF()  { 
		return dejcUtility.getDateF(this.confirmMailDate,"w2") ; 
	}
	/** 
	 * 取得供應商mpmail確認日期 ( 處理單引號的問題 )
	 */ 
	public String getConfirmMailDateS()  { 
		return dejcUtility.replaceS(this.confirmMailDate) ; 
	}

	/** 
	 * 設定建檔日期
	 */ 
	public void setCreateDate(String createDate)  {
		onSetField("createDate","createDate_MSM00",createDate);
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
		onSetField("createTime","createTime_MSM00",createTime);
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
		onSetField("createEmplComp","createEmplComp_MSM00",createEmplComp);
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
		onSetField("createEmpl","createEmpl_MSM00",createEmpl);
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
		onSetField("updateDate","updateDate_MSM00",updateDate);
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
		onSetField("updateTime","updateTime_MSM00",updateTime);
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
		onSetField("updateEmplComp","updateEmplComp_MSM00",updateEmplComp);
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
		onSetField("updateEmpl","updateEmpl_MSM00",updateEmpl);
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

} // end of Class msjcTBMSM00DAO