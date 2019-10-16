/*----------------------------------------------------------------------------*/
/* msjcTBMSM02VO		DAOTool Ver 10.0112 (INPUT FILE VERSION:2.0)  $Id: bc49e1178d18ce225764167fa459cdc70ad28eb1 $
/*----------------------------------------------------------------------------*/
/* author : 
/* system : 
/* target : 供應商停權資料檔
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
 * 供應商停權資料檔 Value Object.
 * <pre>
 * Table Name        : MS.TBMSM02
 * Table Description : 供應商停權資料檔
 * Data Access Object: msjcTBMSM02DAO
 * </pre>
 * @version 
 * @since msjcTBMSM02VO - 103/06/25
 * @author 
 */
public class msjcTBMSM02VO extends dejcCommonVO implements Serializable {
	public final static String AppId = "MSJCTBMSM02VO" ;
	public final static String CLASS_VERSION = "$Revision: 1.3 $ $Date: 2014/06/26 01:14:08 $";
	public final static String ATTRIB_DESC="msM02Uid=uid,msM00Uid=msM00Uid,compId=公司別,vendorNo=供應商編號,startDate=停權起始日,endDate=停權結束日,rejCode=停權狀態,rejReason=停權說明,rejPoNo=違約案號,rejDept=停權建議部門,attachment=附件,appId=APPID,createDate=建檔日期,createTime=建檔時間,createEmplComp=建檔人員公司別,createEmpl=建檔人員,updateDate=修改日期,updateTime=修改時間,updateEmplComp=修改人員公司別,updateEmpl=修改人員," ; 

	/**
	 * uid 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int MSM02UID_LEN = 9 ;
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
	 * 停權起始日 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int STARTDATE_LEN = 8 ;
	/**
	 * 停權結束日 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int ENDDATE_LEN = 8 ;
	/**
	 * 停權狀態 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int REJCODE_LEN = 2 ;
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
	 * 停權建議部門 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int REJDEPT_LEN = 6 ;
	/**
	 * 附件 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int ATTACHMENT_LEN = 20 ;
	/**
	 * APPID 輸入欄位長度
	 * @since 103/06/25
	 */
	public final static int APPID_LEN = 20 ;
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
/* MS.TBMSM02 column Name
/*----------------------------------------------------------------------------*/

	/**
	 * uid
	 * @since 103/06/25
	 */
	private int msM02Uid;
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
	 * 停權起始日
	 * @since 103/06/25
	 */
	private String startDate;
	/**
	 * 停權結束日
	 * @since 103/06/25
	 */
	private String endDate;
	/**
	 * 停權狀態
	 * @since 103/06/25
	 */
	private String rejCode;
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
	 * 停權建議部門
	 * @since 103/06/25
	 */
	private String rejDept;
	/**
	 * 附件
	 * @since 103/06/25
	 */
	private String attachment;
	/**
	 * APPID
	 * @since 103/06/25
	 */
	private String appId;
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
/* Creates new msjcTBMSM02VO
/*----------------------------------------------------------------------------*/

	/**
	 * 建構子
	 * @since 103/06/25
	 */
	public msjcTBMSM02VO() {
		clear() ;
		super.setChild(this) ;
	}
	/**
	 * 主要鍵建構子
	 * @since 103/06/25
	 */
	public msjcTBMSM02VO(int msM02Uid,int msM00Uid) {
		this() ;
		this.msM02Uid = msM02Uid ;	// uid
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
		this.msM02Uid = 0 ;	// uid
		this.msM00Uid = 0 ;	// msM00Uid
		this.compId = "" ;	// 公司別
		this.vendorNo = "" ;	// 供應商編號
		this.startDate = "" ;	// 停權起始日
		this.endDate = "" ;	// 停權結束日
		this.rejCode = "" ;	// 停權狀態
		this.rejReason = "" ;	// 停權說明
		this.rejPoNo = "" ;	// 違約案號
		this.rejDept = "" ;	// 停權建議部門
		this.attachment = "" ;	// 附件
		this.appId = "" ;	// APPID
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
	public msjcTBMSM02VO myClone() {
		msjcTBMSM02VO mstBMSM02VO = new msjcTBMSM02VO() ;
		mstBMSM02VO.setMsM02Uid(this.msM02Uid);
		mstBMSM02VO.setMsM00Uid(this.msM00Uid);
		mstBMSM02VO.setCompId(this.compId);
		mstBMSM02VO.setVendorNo(this.vendorNo);
		mstBMSM02VO.setStartDate(this.startDate);
		mstBMSM02VO.setEndDate(this.endDate);
		mstBMSM02VO.setRejCode(this.rejCode);
		mstBMSM02VO.setRejReason(this.rejReason);
		mstBMSM02VO.setRejPoNo(this.rejPoNo);
		mstBMSM02VO.setRejDept(this.rejDept);
		mstBMSM02VO.setAttachment(this.attachment);
		mstBMSM02VO.setAppId(this.appId);
		mstBMSM02VO.setCreateDate(this.createDate);
		mstBMSM02VO.setCreateTime(this.createTime);
		mstBMSM02VO.setCreateEmplComp(this.createEmplComp);
		mstBMSM02VO.setCreateEmpl(this.createEmpl);
		mstBMSM02VO.setUpdateDate(this.updateDate);
		mstBMSM02VO.setUpdateTime(this.updateTime);
		mstBMSM02VO.setUpdateEmplComp(this.updateEmplComp);
		mstBMSM02VO.setUpdateEmpl(this.updateEmpl);
		return mstBMSM02VO ;
	}

/**
  * toJSON 方法
  * <p>
  * @return JSON String
  * @since 103/06/25
  */
 public String toJSON() {
  StringBuffer sb = new StringBuffer() ;
  sb.append("msM02Uid :\""+dejcUtility.parseToJSON(getMsM02Uid()+"")+"\"") ;
  sb.append(",");
  sb.append("msM00Uid :\""+dejcUtility.parseToJSON(getMsM00Uid()+"")+"\"") ;
  sb.append(",");
  sb.append("compId :\""+dejcUtility.parseToJSON(getCompId()+"")+"\"") ;
  sb.append(",");
  sb.append("vendorNo :\""+dejcUtility.parseToJSON(getVendorNo()+"")+"\"") ;
  sb.append(",");
  sb.append("startDate :\""+dejcUtility.parseToJSON(getStartDate()+"")+"\"") ;
  sb.append(",");
  sb.append("endDate :\""+dejcUtility.parseToJSON(getEndDate()+"")+"\"") ;
  sb.append(",");
  sb.append("rejCode :\""+dejcUtility.parseToJSON(getRejCode()+"")+"\"") ;
  sb.append(",");
  sb.append("rejReason :\""+dejcUtility.parseToJSON(getRejReason()+"")+"\"") ;
  sb.append(",");
  sb.append("rejPoNo :\""+dejcUtility.parseToJSON(getRejPoNo()+"")+"\"") ;
  sb.append(",");
  sb.append("rejDept :\""+dejcUtility.parseToJSON(getRejDept()+"")+"\"") ;
  sb.append(",");
  sb.append("attachment :\""+dejcUtility.parseToJSON(getAttachment()+"")+"\"") ;
  sb.append(",");
  sb.append("appId :\""+dejcUtility.parseToJSON(getAppId()+"")+"\"") ;
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
	 * @return msjcTBMSM02VO - 產生 Value Object
	 * @exception SQLException - DB SQLException
	 * @since 103/06/25
	 */
	public static msjcTBMSM02VO getInstance(ResultSet rs) throws SQLException,Exception {
		msjcTBMSM02VO mstBMSM02VO = new msjcTBMSM02VO() ;

  		mstBMSM02VO.setMsM02Uid(rs.getInt(1));
  		mstBMSM02VO.setMsM00Uid(rs.getInt(2));
  		mstBMSM02VO.setCompId(rs.getString(3));
  		mstBMSM02VO.setVendorNo(rs.getString(4));
  		mstBMSM02VO.setStartDate(rs.getString(5));
  		mstBMSM02VO.setEndDate(rs.getString(6));
  		mstBMSM02VO.setRejCode(rs.getString(7));
  		mstBMSM02VO.setRejReason(rs.getString(8));
  		mstBMSM02VO.setRejPoNo(rs.getString(9));
  		mstBMSM02VO.setRejDept(rs.getString(10));
  		mstBMSM02VO.setAttachment(rs.getString(11));
  		mstBMSM02VO.setAppId(rs.getString(12));
  		mstBMSM02VO.setCreateDate(rs.getString(13));
  		mstBMSM02VO.setCreateTime(rs.getString(14));
  		mstBMSM02VO.setCreateEmplComp(rs.getString(15));
  		mstBMSM02VO.setCreateEmpl(rs.getString(16));
  		mstBMSM02VO.setUpdateDate(rs.getString(17));
  		mstBMSM02VO.setUpdateTime(rs.getString(18));
  		mstBMSM02VO.setUpdateEmplComp(rs.getString(19));
  		mstBMSM02VO.setUpdateEmpl(rs.getString(20));
  		return mstBMSM02VO ;
	}

	/**
	 * 以 ResultSet 來作物件
	 * <p>
	 * @param rs - 單一 ResultSet
	 * @return msjcTBMSM02VO - 產生 Value Object
	 * @exception SQLException - DB SQLException
	 * @since 103/06/25
	 */
	public static msjcTBMSM02VO getInstanceByName(ResultSet rs) throws SQLException,Exception {
		return getInstanceByName(new msjcTBMSM02VO(), rs) ;
	}

	/**
	 * 以 ResultSet 來作物件, 使用由 user 傳進來的物件
	 * <p>
	 * @param rs - 單一 ResultSet
	 * @return msjcTBMSM02VO - 產生 Value Object
	 * @exception SQLException - DB SQLException
	 * @since 103/06/25
	 */
	public static msjcTBMSM02VO getInstanceByName(Object obj, ResultSet rs) throws SQLException {
		msjcTBMSM02VO mstBMSM02VO = (msjcTBMSM02VO)obj ;
  		mstBMSM02VO.setMsM02Uid(rs.getInt("msM02Uid_MSM02"));
  		mstBMSM02VO.setMsM00Uid(rs.getInt("msM00Uid_MSM02"));
  		mstBMSM02VO.setCompId(rs.getString("compId_MSM02"));
  		mstBMSM02VO.setVendorNo(rs.getString("vendorNo_MSM02"));
  		mstBMSM02VO.setStartDate(rs.getString("startDate_MSM02"));
  		mstBMSM02VO.setEndDate(rs.getString("endDate_MSM02"));
  		mstBMSM02VO.setRejCode(rs.getString("rejCode_MSM02"));
  		mstBMSM02VO.setRejReason(rs.getString("rejReason_MSM02"));
  		mstBMSM02VO.setRejPoNo(rs.getString("rejPoNo_MSM02"));
  		mstBMSM02VO.setRejDept(rs.getString("rejDept_MSM02"));
  		mstBMSM02VO.setAttachment(rs.getString("attachment_MSM02"));
  		mstBMSM02VO.setAppId(rs.getString("appId_MSM02"));
  		mstBMSM02VO.setCreateDate(rs.getString("createDate_MSM02"));
  		mstBMSM02VO.setCreateTime(rs.getString("createTime_MSM02"));
  		mstBMSM02VO.setCreateEmplComp(rs.getString("createEmplComp_MSM02"));
  		mstBMSM02VO.setCreateEmpl(rs.getString("createEmpl_MSM02"));
  		mstBMSM02VO.setUpdateDate(rs.getString("updateDate_MSM02"));
  		mstBMSM02VO.setUpdateTime(rs.getString("updateTime_MSM02"));
  		mstBMSM02VO.setUpdateEmplComp(rs.getString("updateEmplComp_MSM02"));
  		mstBMSM02VO.setUpdateEmpl(rs.getString("updateEmpl_MSM02"));
  		return mstBMSM02VO ;
	}

	/**
	 * 以 Request 來作物件
	 * <p>
	 * @param request - 網頁要求物件
	 * @return msjcTBMSM02VO - 產生 Value Object
	 * @since 103/06/25
	 */
	public static msjcTBMSM02VO getInstance(HttpServletRequest request) {
		return getFromReq(request, -1) ;
	}
	/**
	 * 以 Request 來作物件 (遇到多筆資料時)
	 * <p>
	 * @param request - 網頁要求物件
	 * @param index - 參數流水序號
	 * @return msjcTBMSM02VO - 產生 Value Object
	 * @since 103/06/25
	 */
	public static msjcTBMSM02VO getInstance(HttpServletRequest request, int index) {
		return getFromReq(request, index) ;
	}
	/**
	 * 以 Request 來作物件
	 * <p>
	 * @param req - 網頁要求物件
	 * @param index - 參數流水序號
	 * @return msjcTBMSM02VO - 產生 Value Object
	 * @since 103/06/25
	 */
	private static msjcTBMSM02VO getFromReq(HttpServletRequest req, int index) {
		String seq = (index >= 0) ? String.valueOf(index) : "" ;
		msjcTBMSM02VO mstBMSM02VO = new msjcTBMSM02VO() ;

		mstBMSM02VO.setMsM02Uid(req.getParameter("msM02Uid"+seq)) ;
		mstBMSM02VO.setMsM00Uid(req.getParameter("msM00Uid"+seq)) ;
		mstBMSM02VO.setCompId(req.getParameter("compId"+seq)) ;
		mstBMSM02VO.setVendorNo(req.getParameter("vendorNo"+seq)) ;
		mstBMSM02VO.setStartDate(req.getParameter("startDate"+seq)) ;
		mstBMSM02VO.setEndDate(req.getParameter("endDate"+seq)) ;
		mstBMSM02VO.setRejCode(req.getParameter("rejCode"+seq)) ;
		mstBMSM02VO.setRejReason(req.getParameter("rejReason"+seq)) ;
		mstBMSM02VO.setRejPoNo(req.getParameter("rejPoNo"+seq)) ;
		mstBMSM02VO.setRejDept(req.getParameter("rejDept"+seq)) ;
		mstBMSM02VO.setAttachment(req.getParameter("attachment"+seq)) ;
		mstBMSM02VO.setAppId(req.getParameter("appId"+seq)) ;
		mstBMSM02VO.setCreateDate(req.getParameter("createDate"+seq)) ;
		mstBMSM02VO.setCreateTime(req.getParameter("createTime"+seq)) ;
		mstBMSM02VO.setCreateEmplComp(req.getParameter("createEmplComp"+seq)) ;
		mstBMSM02VO.setCreateEmpl(req.getParameter("createEmpl"+seq)) ;
		mstBMSM02VO.setUpdateDate(req.getParameter("updateDate"+seq)) ;
		mstBMSM02VO.setUpdateTime(req.getParameter("updateTime"+seq)) ;
		mstBMSM02VO.setUpdateEmplComp(req.getParameter("updateEmplComp"+seq)) ;
		mstBMSM02VO.setUpdateEmpl(req.getParameter("updateEmpl"+seq)) ;

		return mstBMSM02VO ;
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

		sb.append("<msjcTBMSM02VO>");
		sb.append(super.toString());
		sb.append("\r\n\tmsM02Uid = " + getMsM02Uid()) ;
		sb.append("\r\n\tmsM00Uid = " + getMsM00Uid()) ;
		sb.append("\r\n\tcompId = " + getCompId()) ;
		sb.append("\r\n\tvendorNo = " + getVendorNo()) ;
		sb.append("\r\n\tstartDate = " + getStartDate()) ;
		sb.append("\r\n\tendDate = " + getEndDate()) ;
		sb.append("\r\n\trejCode = " + getRejCode()) ;
		sb.append("\r\n\trejReason = " + getRejReason()) ;
		sb.append("\r\n\trejPoNo = " + getRejPoNo()) ;
		sb.append("\r\n\trejDept = " + getRejDept()) ;
		sb.append("\r\n\tattachment = " + getAttachment()) ;
		sb.append("\r\n\tappId = " + getAppId()) ;
		sb.append("\r\n\tcreateDate = " + getCreateDate()) ;
		sb.append("\r\n\tcreateTime = " + getCreateTime()) ;
		sb.append("\r\n\tcreateEmplComp = " + getCreateEmplComp()) ;
		sb.append("\r\n\tcreateEmpl = " + getCreateEmpl()) ;
		sb.append("\r\n\tupdateDate = " + getUpdateDate()) ;
		sb.append("\r\n\tupdateTime = " + getUpdateTime()) ;
		sb.append("\r\n\tupdateEmplComp = " + getUpdateEmplComp()) ;
		sb.append("\r\n\tupdateEmpl = " + getUpdateEmpl()) ;
		sb.append("\r\n</msjcTBMSM02VO>");

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
		if (object instanceof msjcTBMSM02VO == false) {
			return false ;
		}

		msjcTBMSM02VO mstBMSM02VO = (msjcTBMSM02VO) object ;
		if (this.msM02Uid == mstBMSM02VO.getMsM02Uid() == false) {
			return false ;
		}
		if (this.msM00Uid != (mstBMSM02VO.getMsM00Uid())) {
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
		if (dejcUtility.isNull(this.msM02Uid)) {
			return hasErr("msM02Uid") ;
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
		if (startDate!=null) { 
			if (startDate.length()>STARTDATE_LEN) {
				return hasErr("停權起始日的資料長度["+startDate.length()+"]不得超過["+STARTDATE_LEN+"]") ; 
			}
		}
		if (endDate!=null) { 
			if (endDate.length()>ENDDATE_LEN) {
				return hasErr("停權結束日的資料長度["+endDate.length()+"]不得超過["+ENDDATE_LEN+"]") ; 
			}
		}
		if (rejCode!=null) { 
			if (rejCode.getBytes().length>REJCODE_LEN) {
				return hasErr("停權狀態的資料長度["+rejCode.getBytes().length+"]不得超過["+REJCODE_LEN+"]") ; 
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
		if (rejDept!=null) { 
			if (rejDept.getBytes().length>REJDEPT_LEN) {
				return hasErr("停權建議部門的資料長度["+rejDept.getBytes().length+"]不得超過["+REJDEPT_LEN+"]") ; 
			}
		}
		if (attachment!=null) { 
			if (attachment.getBytes().length>ATTACHMENT_LEN) {
				return hasErr("附件的資料長度["+attachment.getBytes().length+"]不得超過["+ATTACHMENT_LEN+"]") ; 
			}
		}
		if (appId!=null) { 
			if (appId.getBytes().length>APPID_LEN) {
				return hasErr("APPID的資料長度["+appId.getBytes().length+"]不得超過["+APPID_LEN+"]") ; 
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
	public void setMsM02Uid(String msM02Uid)  { 
		if ( !dejcUtility.isNull(msM02Uid) ) {
			String s = msM02Uid.trim() ;  
			if (!dejcUtility.isNaN(s)) {  
			    setMsM02Uid(Integer.parseInt(s)) ; 
			    return ; 
         } 
	    }
	}
	public void setMsM02Uid(int msM02Uid)  {
		onSetField("msM02Uid","msM02Uid_MSM02",new Integer(this.msM02Uid));
		this.msM02Uid =  msM02Uid ;   
	}

	/** 
	 * 取得uid
	 */ 
	public int getMsM02Uid()  { 
		return this.msM02Uid ; 
	}
	/** 
	 * 取得 uid Insert SQL 特殊系統關鍵字 DEFAULT 
	 */ 
	public String getMsM02UidDEF()  { 
		return "DEFAULT" ; 
	}

	/** 
	 * 設定msM00Uid
	 */ 
	public void setMsM00Uid(int msM00Uid)  {
		onSetField("msM00Uid","msM00Uid_MSM02",new Integer(this.msM00Uid));
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
		onSetField("compId","compId_MSM02",compId);
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
		onSetField("vendorNo","vendorNo_MSM02",vendorNo);
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
	 * 設定停權起始日
	 */ 
	public void setStartDate(String startDate)  {
		onSetField("startDate","startDate_MSM02",startDate);
		this.startDate=startDate==null?"":dejcUtility.getWFmt1(startDate) ; 
	}

	/** 
	 * 取得停權起始日
	 */ 
	public String getStartDate()  { 
		return this.startDate ; 
	}
	/** 
	 * 取得停權起始日的中式日期
	 */ 
	public String getStartDateCF()  { 
		return dejcUtility.getDateF(this.startDate,"c") ; 
	}
	/** 
	 * 取得停權起始日的西式日期
	 */ 
	public String getStartDateWF()  { 
		return dejcUtility.getDateF(this.startDate,"w2") ; 
	}
	/** 
	 * 取得停權起始日 ( 處理單引號的問題 )
	 */ 
	public String getStartDateS()  { 
		return dejcUtility.replaceS(this.startDate) ; 
	}

	/** 
	 * 設定停權結束日
	 */ 
	public void setEndDate(String endDate)  {
		onSetField("endDate","endDate_MSM02",endDate);
		this.endDate=endDate==null?"":dejcUtility.getWFmt1(endDate) ; 
	}

	/** 
	 * 取得停權結束日
	 */ 
	public String getEndDate()  { 
		return this.endDate ; 
	}
	/** 
	 * 取得停權結束日的中式日期
	 */ 
	public String getEndDateCF()  { 
		return dejcUtility.getDateF(this.endDate,"c") ; 
	}
	/** 
	 * 取得停權結束日的西式日期
	 */ 
	public String getEndDateWF()  { 
		return dejcUtility.getDateF(this.endDate,"w2") ; 
	}
	/** 
	 * 取得停權結束日 ( 處理單引號的問題 )
	 */ 
	public String getEndDateS()  { 
		return dejcUtility.replaceS(this.endDate) ; 
	}

	/** 
	 * 設定停權狀態
	 */ 
	public void setRejCode(String rejCode)  {
		onSetField("rejCode","rejCode_MSM02",rejCode);
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
	 * 設定停權說明
	 */ 
	public void setRejReason(String rejReason)  {
		onSetField("rejReason","rejReason_MSM02",rejReason);
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
		onSetField("rejPoNo","rejPoNo_MSM02",rejPoNo);
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
	 * 設定停權建議部門
	 */ 
	public void setRejDept(String rejDept)  {
		onSetField("rejDept","rejDept_MSM02",rejDept);
		this.rejDept = (rejDept == null || rejDept.length() == 0) ? "" : rejDept; 
	}

	/** 
	 * 取得停權建議部門
	 */ 
	public String getRejDept()  { 
		return this.rejDept ; 
	}
	/** 
	 * 取得停權建議部門 ( 處理單引號的問題 )
	 */ 
	public String getRejDeptS()  { 
		return dejcUtility.replaceS(this.rejDept) ; 
	}

	/** 
	 * 設定附件
	 */ 
	public void setAttachment(String attachment)  {
		onSetField("attachment","attachment_MSM02",attachment);
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
	 * 設定APPID
	 */ 
	public void setAppId(String appId)  {
		onSetField("appId","appId_MSM02",appId);
		this.appId = (appId == null || appId.length() == 0) ? "" : appId; 
	}

	/** 
	 * 取得APPID
	 */ 
	public String getAppId()  { 
		return this.appId ; 
	}
	/** 
	 * 取得APPID ( 處理單引號的問題 )
	 */ 
	public String getAppIdS()  { 
		return dejcUtility.replaceS(this.appId) ; 
	}

	/** 
	 * 設定建檔日期
	 */ 
	public void setCreateDate(String createDate)  {
		onSetField("createDate","createDate_MSM02",createDate);
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
		onSetField("createTime","createTime_MSM02",createTime);
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
		onSetField("createEmplComp","createEmplComp_MSM02",createEmplComp);
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
		onSetField("createEmpl","createEmpl_MSM02",createEmpl);
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
		onSetField("updateDate","updateDate_MSM02",updateDate);
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
		onSetField("updateTime","updateTime_MSM02",updateTime);
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
		onSetField("updateEmplComp","updateEmplComp_MSM02",updateEmplComp);
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
		onSetField("updateEmpl","updateEmpl_MSM02",updateEmpl);
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

} // end of Class msjcTBMSM02DAO