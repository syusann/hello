/*----------------------------------------------------------------------------*/
/* msjcTBMSM00DAO		DAOTool Ver 10.0112 (INPUT FILE VERSION:2.0)
/*----------------------------------------------------------------------------*/
/* author : 
/* system : 
/* target : 供應商基本資料檔
/* create : 103/06/25
/* update : 103/06/25
/*----------------------------------------------------------------------------*/
package com.icsc.ms.dao;

import java.sql.*;
import java.text.*;
import java.util.*;
import java.math.* ;
import com.icsc.dpms.de.*;
import com.icsc.dpms.de.dao.*;
import com.icsc.dpms.ds.*;
import com.icsc.dpms.de.dez.sql.*;
import com.icsc.ms.dao.*  ;

/**
 * 供應商基本資料檔 DAO.
 * <pre>
 * Table Name        : MS.TBMSM00
 * Table Description : 供應商基本資料檔
 * Value Object Name : msjcTBMSM00VO
 * </pre>
 * @version $Id$
 * @since msjcTBMSM00VO - 103/06/25
 * @author 
 */
public class msjcTBMSM00DAO extends dejcCommonDAO {
	public final static String AppId = "MSJCTBMSM00DAO" ;
	public final static String CLASS_VERSION = "$Revision: 1.3 $ $Date: 2014/06/25 03:30:06 $";

/*----------------------------------------------------------------------------*/
/* Creates new msjcTBMSM00DAO
/*----------------------------------------------------------------------------*/

	/**
	 * 建構子
	 * @param dsCom - 共用元件
	 * @since 103/06/25
	 */
	public msjcTBMSM00DAO(dsjccom dsCom) {
		super(dsCom, AppId);
	}
	/**
	 * 建構子
	 * @param dsCom - 共用元件
	 * @param con - 交易連接緒
	 * @since 103/06/25
	 */
	public msjcTBMSM00DAO(dsjccom dsCom, Connection con) {
		super(dsCom, con) ;
		super.appId = this.AppId;
	}

/*----------------------------------------------------------------------------*/
/* public methods
/*----------------------------------------------------------------------------*/
	/**
	 * 組合以主鍵查詢的 sql
	 * @since 103/06/25
	 */
	private String getFindByPKSql(int msM00Uid) {
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append("SELECT * FROM MS.TBMSM00");
		sqlStr.append(" WHERE  msM00Uid_MSM00="+msM00Uid+" ");
		return sqlStr.toString();
	}
	/**
	 * 以主鍵來查詢資料
	 * <p>
	 * @return mstBMSM00VO - 單筆資料
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public msjcTBMSM00VO findByPK(int msM00Uid)
			throws SQLException, Exception {
		this.sql = getFindByPKSql(msM00Uid) ;
		return (msjcTBMSM00VO) this.eQuery(this.sql) ;
	}

	/**
	 * 以主鍵來查詢資料
	 * <p>
	 * @return mstBMSM00VO - 單筆資料
	 * @exception dejcNotFoundException - 若查不到資料時
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public msjcTBMSM00VO findByPKExp(int msM00Uid)
			throws dejcNotFoundException, SQLException, Exception {
		msjcTBMSM00VO mstBMSM00VO = findByPK(msM00Uid) ;
		if (mstBMSM00VO == null) {
			throw new dejcNotFoundException(this.sql) ;
		}
		return mstBMSM00VO ;
	}

	/**
	 * 以主鍵來查詢資料
	 * <p>
	 * @param mstBMSM00VO - 由使用者所提供的 object, DAO 不另行 new
	 * @return mstBMSM00VO - 單筆資料
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public msjcTBMSM00VO findByPK(msjcTBMSM00VO mstBMSM00VO, int msM00Uid)
			throws SQLException,Exception {
		this.sql = getFindByPKSql(msM00Uid) ;
		return (msjcTBMSM00VO) this.eQuery(mstBMSM00VO, this.sql) ;
	}

	/**
	 * 以主鍵來查詢資料
	 * <p>
	 * @param mstBMSM00VO - 由使用者所提供的 object, DAO 不另行 new
	 * @return mstBMSM00VO - 單筆資料
	 * @exception dejcNotFoundException - 若查不到資料時
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public msjcTBMSM00VO findByPKExp(msjcTBMSM00VO mstBMSM00VO, int msM00Uid)
			throws dejcNotFoundException, SQLException, Exception {
		mstBMSM00VO = findByPK(mstBMSM00VO, msM00Uid) ;
		if (mstBMSM00VO == null) {
			throw new dejcNotFoundException(this.sql) ;
		}
		return mstBMSM00VO ;
	}
	/**
	 * 新增一筆資料 throws
	 * <p>
	 * @param mstBMSM00VO - Value Object
	 * @return int - 交易筆數
	 * @exception dejcEditException - Value Object 資料有誤
	 * @exception dejcNoUpdateException - 無任何資料新增
	 * @exception dejcDupException - 重複鍵值
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public int create(msjcTBMSM00VO mstBMSM00VO)
			throws dejcEditException, dejcNoUpdateException, dejcDupException, SQLException, Exception {
		if (mstBMSM00VO.verify() == false) {
			throw new dejcEditException(mstBMSM00VO.getMessage()) ;
		}
		if (mstBMSM00VO.isKeyOk() == false) {
			throw new dejcEditException("Value of key["+AppId+"].["+mstBMSM00VO.getMessage()+"] is null or empty!") ;
		}

		onBeforeCreate(mstBMSM00VO);
		this.sql = getCreateSql(mstBMSM00VO) ;

		try {
			int rslt = this.executeUpdate(this.sql) ;

			if (rslt == 0) {
				throw new dejcNoUpdateException(this.sql) ;
			}
			return rslt;
		} catch (SQLException sqle) {
            handleDupException(sqle);
            return -1;
		}
	}
	
	private void onBeforeCreate(msjcTBMSM00VO mstBMSM00VO) {
		
	}
	
	public String getCreateSql(msjcTBMSM00VO mstBMSM00VO) {
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append("INSERT INTO MS.TBMSM00 (");
		sqlStr.append("msM00Uid_MSM00,compId_MSM00,vendorNo_MSM00,countryId_MSM00,cVendorName_MSM00,")
           .append("eVendorName_MSM00,abbrevName_MSM00,capital_MSM00,capitalCrcy_MSM00,owner_MSM00,")
           .append("oldVendorNo_MSM00,newVendorNo_MSM00,invoiceType_MSM00,respDept_MSM00,rejUpdDate_MSM00,")
           .append("rejCode_MSM00,rejStartDate_MSM00,rejEndDate_MSM00,rejReason_MSM00,rejPoNo_MSM00,")
           .append("reqDate_MSM00,reqTimes_MSM00,poDate_MSM00,poTimes_MSM00,attachment_MSM00,")
           .append("status_MSM00,isIssue_MSM00,isQuote_MSM00,isPO_MSM00,dataType_MSM00,")
           .append("mailId_MSM00,createMailDate_MSM00,confirmMailDate_MSM00,createDate_MSM00,createTime_MSM00,")
           .append("createEmplComp_MSM00,createEmpl_MSM00,updateDate_MSM00,updateTime_MSM00,updateEmplComp_MSM00,")
           .append("updateEmpl_MSM00");
		sqlStr.append(") VALUES (");
		sqlStr.append("").append(mstBMSM00VO.getMsM00UidDEF()).append(",'").append(mstBMSM00VO.getCompIdS()).append("','").append(mstBMSM00VO.getVendorNoS()).append("','").append(mstBMSM00VO.getCountryIdS());
		sqlStr.append("','").append(mstBMSM00VO.getCVendorNameS()).append("','").append(mstBMSM00VO.getEVendorNameS()).append("','").append(mstBMSM00VO.getAbbrevNameS());
		sqlStr.append("',").append(mstBMSM00VO.getCapital()).append(",'").append(mstBMSM00VO.getCapitalCrcyS()).append("','").append(mstBMSM00VO.getOwnerS());
		sqlStr.append("','").append(mstBMSM00VO.getOldVendorNoS()).append("','").append(mstBMSM00VO.getNewVendorNoS()).append("','").append(mstBMSM00VO.getInvoiceTypeS());
		sqlStr.append("','").append(mstBMSM00VO.getRespDeptS()).append("','").append(mstBMSM00VO.getRejUpdDateS()).append("','").append(mstBMSM00VO.getRejCodeS());
		sqlStr.append("','").append(mstBMSM00VO.getRejStartDateS()).append("','").append(mstBMSM00VO.getRejEndDateS()).append("','").append(mstBMSM00VO.getRejReasonS());
		sqlStr.append("','").append(mstBMSM00VO.getRejPoNoS()).append("','").append(mstBMSM00VO.getReqDateS()).append("',").append(mstBMSM00VO.getReqTimes());
		sqlStr.append(",'").append(mstBMSM00VO.getPoDateS()).append("',").append(mstBMSM00VO.getPoTimes()).append(",'").append(mstBMSM00VO.getAttachmentS());
		sqlStr.append("','").append(mstBMSM00VO.getStatusS()).append("','").append(mstBMSM00VO.getIsIssueS()).append("','").append(mstBMSM00VO.getIsQuoteS());
		sqlStr.append("','").append(mstBMSM00VO.getIsPOS()).append("','").append(mstBMSM00VO.getDataTypeS()).append("','").append(mstBMSM00VO.getMailIdS());
		sqlStr.append("','").append(mstBMSM00VO.getCreateMailDateS()).append("','").append(mstBMSM00VO.getConfirmMailDateS()).append("','").append(mstBMSM00VO.getCreateDateS());
		sqlStr.append("','").append(mstBMSM00VO.getCreateTimeS()).append("','").append(mstBMSM00VO.getCreateEmplCompS()).append("','").append(mstBMSM00VO.getCreateEmplS());
		sqlStr.append("','").append(mstBMSM00VO.getUpdateDateS()).append("','").append(mstBMSM00VO.getUpdateTimeS()).append("','").append(mstBMSM00VO.getUpdateEmplCompS());
		sqlStr.append("','").append(mstBMSM00VO.getUpdateEmplS()).append("'");
		sqlStr.append(")");	
		this.sql = sqlStr.toString() ;
		return this.sql;
	}

	/**
	 * 新增多筆資料 throws
	 * <p>
	 * @param mstBMSM00VOList - Value Object
	 * @return int - 交易筆數
	 * @exception dejcEditException - Value Object 資料有誤
	 * @exception dejcNoUpdateException - 無任何資料新增
	 * @exception dejcDupException - 重複鍵值
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public int createList(List mstBMSM00VOList)
			throws dejcEditException, dejcNoUpdateException, dejcDupException, SQLException, Exception {
		int count = 0 ;
		for (int i=0; i<mstBMSM00VOList.size(); i++) {
			msjcTBMSM00VO mstBMSM00VO = (msjcTBMSM00VO)mstBMSM00VOList.get(i) ;
			count = count+this.create(mstBMSM00VO) ;
		}
		return count ;
	}

  	/**
	 * 刪除資料
	 * <p>
	 * @return int - 交易筆數
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public int remove(int msM00Uid)
			throws SQLException, Exception {		
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append("DELETE FROM MS.TBMSM00");
		sqlStr.append(" WHERE  msM00Uid_MSM00="+msM00Uid+" " );
		this.sql = sqlStr.toString();						
		return this.executeUpdate(this.sql) ;
	}
	

	/**
	 * 刪除資料 throws
	 * <p>
	 * @return int - 交易筆數
	 * @exception dejcNoUpdateException - 無任何資料被刪除
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public int removeExp(int msM00Uid)
			throws dejcNoUpdateException, SQLException, Exception {
		int rslt = remove(msM00Uid) ;
		if (rslt == 0) {
			throw new dejcNoUpdateException(this.sql) ;
		}
		return rslt ;
	}

	/**
	 * 刪除資料 throws
	 * <p>
	 * @param mstBMSM00VO 欲刪除的資料物件
	 * @return int - 交易筆數
	 * @exception dejcNoUpdateException - 無任何資料被刪除
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public int removeExp(msjcTBMSM00VO mstBMSM00VO)
			throws dejcNoUpdateException, SQLException, Exception {
		return removeExp(mstBMSM00VO.getMsM00Uid()) ;
	}

	/**
	 * 刪除多筆資料 throws
	 * <p>
	 * @param mstBMSM00VOList 欲刪除的資料物件
	 * @return int - 交易筆數
	 * @exception dejcNoUpdateException - 無任何資料被刪除
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public int removeList(List mstBMSM00VOList)
			throws dejcNoUpdateException, SQLException, Exception {
		int count = 0 ;
		for (int i=0; i<mstBMSM00VOList.size(); i++) {
			msjcTBMSM00VO mstBMSM00VO = (msjcTBMSM00VO)mstBMSM00VOList.get(i) ;
			count = count+this.remove(mstBMSM00VO.getMsM00Uid()) ;
		}
		return count ;
	}

	/**
	 * 刪除資料 throws
	 * <p>
	 * @param mstBMSM00VO 欲刪除的資料物件
	 * @return int - 交易筆數
	 * @exception dejcNoUpdateException - 無任何資料被刪除
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public int remove(msjcTBMSM00VO mstBMSM00VO)
			throws SQLException, Exception {
		return remove(mstBMSM00VO.getMsM00Uid()) ;
	}

	/**
	 * 修改資料
	 * <p>
	 * @return int - 交易筆數
	 * @exception dejcEditException - Value Object 資料有誤
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public int update(msjcTBMSM00VO mstBMSM00VO)
			throws dejcEditException, SQLException, Exception {
		if (mstBMSM00VO.verify() == false) {
			throw new dejcEditException(mstBMSM00VO.getMessage()) ;
		}
		if(mstBMSM00VO.hasEditFields()) {
			return updateEditFields(mstBMSM00VO);
		} else {
			return this.executeUpdate(getUpdateSql(mstBMSM00VO) ) ;
		}
	}

	public String getUpdateSql(msjcTBMSM00VO mstBMSM00VO) {
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append("UPDATE MS.TBMSM00");
		sqlStr.append(" SET compId_MSM00='").append(mstBMSM00VO.getCompIdS()).append("',vendorNo_MSM00='").append(mstBMSM00VO.getVendorNoS()).append("',countryId_MSM00='").append(mstBMSM00VO.getCountryIdS()).append("',cVendorName_MSM00='").append(mstBMSM00VO.getCVendorNameS()).append("',eVendorName_MSM00='").append(mstBMSM00VO.getEVendorNameS()).append("',");
		sqlStr.append("abbrevName_MSM00='").append(mstBMSM00VO.getAbbrevNameS()).append("',capital_MSM00=").append(mstBMSM00VO.getCapital()).append(",capitalCrcy_MSM00='").append(mstBMSM00VO.getCapitalCrcyS()).append("',owner_MSM00='").append(mstBMSM00VO.getOwnerS()).append("',oldVendorNo_MSM00='").append(mstBMSM00VO.getOldVendorNoS()).append("',");
		sqlStr.append("newVendorNo_MSM00='").append(mstBMSM00VO.getNewVendorNoS()).append("',invoiceType_MSM00='").append(mstBMSM00VO.getInvoiceTypeS()).append("',respDept_MSM00='").append(mstBMSM00VO.getRespDeptS()).append("',rejUpdDate_MSM00='").append(mstBMSM00VO.getRejUpdDateS()).append("',rejCode_MSM00='").append(mstBMSM00VO.getRejCodeS()).append("',");
		sqlStr.append("rejStartDate_MSM00='").append(mstBMSM00VO.getRejStartDateS()).append("',rejEndDate_MSM00='").append(mstBMSM00VO.getRejEndDateS()).append("',rejReason_MSM00='").append(mstBMSM00VO.getRejReasonS()).append("',rejPoNo_MSM00='").append(mstBMSM00VO.getRejPoNoS()).append("',reqDate_MSM00='").append(mstBMSM00VO.getReqDateS()).append("',");
		sqlStr.append("reqTimes_MSM00=").append(mstBMSM00VO.getReqTimes()).append(",poDate_MSM00='").append(mstBMSM00VO.getPoDateS()).append("',poTimes_MSM00=").append(mstBMSM00VO.getPoTimes()).append(",attachment_MSM00='").append(mstBMSM00VO.getAttachmentS()).append("',status_MSM00='").append(mstBMSM00VO.getStatusS()).append("',");
		sqlStr.append("isIssue_MSM00='").append(mstBMSM00VO.getIsIssueS()).append("',isQuote_MSM00='").append(mstBMSM00VO.getIsQuoteS()).append("',isPO_MSM00='").append(mstBMSM00VO.getIsPOS()).append("',dataType_MSM00='").append(mstBMSM00VO.getDataTypeS()).append("',mailId_MSM00='").append(mstBMSM00VO.getMailIdS()).append("',");
		sqlStr.append("createMailDate_MSM00='").append(mstBMSM00VO.getCreateMailDateS()).append("',confirmMailDate_MSM00='").append(mstBMSM00VO.getConfirmMailDateS()).append("',createDate_MSM00='").append(mstBMSM00VO.getCreateDateS()).append("',createTime_MSM00='").append(mstBMSM00VO.getCreateTimeS()).append("',createEmplComp_MSM00='").append(mstBMSM00VO.getCreateEmplCompS()).append("',");
		sqlStr.append("createEmpl_MSM00='").append(mstBMSM00VO.getCreateEmplS()).append("',updateDate_MSM00='").append(mstBMSM00VO.getUpdateDateS()).append("',updateTime_MSM00='").append(mstBMSM00VO.getUpdateTimeS()).append("',updateEmplComp_MSM00='").append(mstBMSM00VO.getUpdateEmplCompS()).append("',updateEmpl_MSM00='").append(mstBMSM00VO.getUpdateEmplS()).append("' ");
		sqlStr.append(" WHERE  msM00Uid_MSM00=" + mstBMSM00VO.getMsM00Uid() + " ");
		this.sql = sqlStr.toString();
		return this.sql ;	
	}
	
	/**
	 * 若資料與預設值不同，才要修改該欄位
	 * <p>
	 * @return int - 交易筆數
	 * @exception dejcEditException - Value Object 資料有誤
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public int updateFldsNotDef(msjcTBMSM00VO mstBMSM00VO)
			throws dejcEditException, SQLException, Exception {
		if (mstBMSM00VO.verify() == false) {
			throw new dejcEditException(mstBMSM00VO.getMessage()) ;
		}
		if (mstBMSM00VO.isKeyOk() == false) {
			throw new dejcEditException("primary key["+mstBMSM00VO.getMessage()+"] of ["+AppId+"] is empty!") ;
		}		
		StringBuffer updateFlds = new StringBuffer();
		if (mstBMSM00VO.getCompId() !=null  && !mstBMSM00VO.getCompId().equals("") ) {
			updateFlds.append("compId_MSM00='").append( mstBMSM00VO.getCompIdS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getVendorNo() !=null  && !mstBMSM00VO.getVendorNo().equals("") ) {
			updateFlds.append("vendorNo_MSM00='").append( mstBMSM00VO.getVendorNoS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getCountryId() !=null  && !mstBMSM00VO.getCountryId().equals("") ) {
			updateFlds.append("countryId_MSM00='").append( mstBMSM00VO.getCountryIdS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getCVendorName() !=null  && !mstBMSM00VO.getCVendorName().equals("") ) {
			updateFlds.append("cVendorName_MSM00='").append( mstBMSM00VO.getCVendorNameS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getEVendorName() !=null  && !mstBMSM00VO.getEVendorName().equals("") ) {
			updateFlds.append("eVendorName_MSM00='").append( mstBMSM00VO.getEVendorNameS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getAbbrevName() !=null  && !mstBMSM00VO.getAbbrevName().equals("") ) {
			updateFlds.append("abbrevName_MSM00='").append( mstBMSM00VO.getAbbrevNameS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getCapital() !=null  && !mstBMSM00VO.getCapital().equals(new BigDecimal("0")) ) {
			updateFlds.append("capital_MSM00=").append( mstBMSM00VO.getCapital() ).append("").append(',') ;
		} 
		if (mstBMSM00VO.getCapitalCrcy() !=null  && !mstBMSM00VO.getCapitalCrcy().equals("") ) {
			updateFlds.append("capitalCrcy_MSM00='").append( mstBMSM00VO.getCapitalCrcyS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getOwner() !=null  && !mstBMSM00VO.getOwner().equals("") ) {
			updateFlds.append("owner_MSM00='").append( mstBMSM00VO.getOwnerS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getOldVendorNo() !=null  && !mstBMSM00VO.getOldVendorNo().equals("") ) {
			updateFlds.append("oldVendorNo_MSM00='").append( mstBMSM00VO.getOldVendorNoS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getNewVendorNo() !=null  && !mstBMSM00VO.getNewVendorNo().equals("") ) {
			updateFlds.append("newVendorNo_MSM00='").append( mstBMSM00VO.getNewVendorNoS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getInvoiceType() !=null  && !mstBMSM00VO.getInvoiceType().equals("") ) {
			updateFlds.append("invoiceType_MSM00='").append( mstBMSM00VO.getInvoiceTypeS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getRespDept() !=null  && !mstBMSM00VO.getRespDept().equals("") ) {
			updateFlds.append("respDept_MSM00='").append( mstBMSM00VO.getRespDeptS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getRejUpdDate() !=null  && !mstBMSM00VO.getRejUpdDate().equals("") ) {
			updateFlds.append("rejUpdDate_MSM00='").append( mstBMSM00VO.getRejUpdDateS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getRejCode() !=null  && !mstBMSM00VO.getRejCode().equals("") ) {
			updateFlds.append("rejCode_MSM00='").append( mstBMSM00VO.getRejCodeS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getRejStartDate() !=null  && !mstBMSM00VO.getRejStartDate().equals("") ) {
			updateFlds.append("rejStartDate_MSM00='").append( mstBMSM00VO.getRejStartDateS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getRejEndDate() !=null  && !mstBMSM00VO.getRejEndDate().equals("") ) {
			updateFlds.append("rejEndDate_MSM00='").append( mstBMSM00VO.getRejEndDateS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getRejReason() !=null  && !mstBMSM00VO.getRejReason().equals("") ) {
			updateFlds.append("rejReason_MSM00='").append( mstBMSM00VO.getRejReasonS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getRejPoNo() !=null  && !mstBMSM00VO.getRejPoNo().equals("") ) {
			updateFlds.append("rejPoNo_MSM00='").append( mstBMSM00VO.getRejPoNoS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getReqDate() !=null  && !mstBMSM00VO.getReqDate().equals("") ) {
			updateFlds.append("reqDate_MSM00='").append( mstBMSM00VO.getReqDateS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getReqTimes()!=0 ) {
			updateFlds.append("reqTimes_MSM00=").append( mstBMSM00VO.getReqTimes() ).append("").append(',') ;
		} 
		if (mstBMSM00VO.getPoDate() !=null  && !mstBMSM00VO.getPoDate().equals("") ) {
			updateFlds.append("poDate_MSM00='").append( mstBMSM00VO.getPoDateS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getPoTimes()!=0 ) {
			updateFlds.append("poTimes_MSM00=").append( mstBMSM00VO.getPoTimes() ).append("").append(',') ;
		} 
		if (mstBMSM00VO.getAttachment() !=null  && !mstBMSM00VO.getAttachment().equals("") ) {
			updateFlds.append("attachment_MSM00='").append( mstBMSM00VO.getAttachmentS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getStatus() !=null  && !mstBMSM00VO.getStatus().equals("") ) {
			updateFlds.append("status_MSM00='").append( mstBMSM00VO.getStatusS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getIsIssue() !=null  && !mstBMSM00VO.getIsIssue().equals("") ) {
			updateFlds.append("isIssue_MSM00='").append( mstBMSM00VO.getIsIssueS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getIsQuote() !=null  && !mstBMSM00VO.getIsQuote().equals("") ) {
			updateFlds.append("isQuote_MSM00='").append( mstBMSM00VO.getIsQuoteS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getIsPO() !=null  && !mstBMSM00VO.getIsPO().equals("") ) {
			updateFlds.append("isPO_MSM00='").append( mstBMSM00VO.getIsPOS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getDataType() !=null  && !mstBMSM00VO.getDataType().equals("") ) {
			updateFlds.append("dataType_MSM00='").append( mstBMSM00VO.getDataTypeS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getMailId() !=null  && !mstBMSM00VO.getMailId().equals("") ) {
			updateFlds.append("mailId_MSM00='").append( mstBMSM00VO.getMailIdS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getCreateMailDate() !=null  && !mstBMSM00VO.getCreateMailDate().equals("") ) {
			updateFlds.append("createMailDate_MSM00='").append( mstBMSM00VO.getCreateMailDateS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getConfirmMailDate() !=null  && !mstBMSM00VO.getConfirmMailDate().equals("") ) {
			updateFlds.append("confirmMailDate_MSM00='").append( mstBMSM00VO.getConfirmMailDateS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getCreateDate() !=null  && !mstBMSM00VO.getCreateDate().equals("") ) {
			updateFlds.append("createDate_MSM00='").append( mstBMSM00VO.getCreateDateS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getCreateTime() !=null  && !mstBMSM00VO.getCreateTime().equals("") ) {
			updateFlds.append("createTime_MSM00='").append( mstBMSM00VO.getCreateTimeS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getCreateEmplComp() !=null  && !mstBMSM00VO.getCreateEmplComp().equals("") ) {
			updateFlds.append("createEmplComp_MSM00='").append( mstBMSM00VO.getCreateEmplCompS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getCreateEmpl() !=null  && !mstBMSM00VO.getCreateEmpl().equals("") ) {
			updateFlds.append("createEmpl_MSM00='").append( mstBMSM00VO.getCreateEmplS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getUpdateDate() !=null  && !mstBMSM00VO.getUpdateDate().equals("") ) {
			updateFlds.append("updateDate_MSM00='").append( mstBMSM00VO.getUpdateDateS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getUpdateTime() !=null  && !mstBMSM00VO.getUpdateTime().equals("") ) {
			updateFlds.append("updateTime_MSM00='").append( mstBMSM00VO.getUpdateTimeS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getUpdateEmplComp() !=null  && !mstBMSM00VO.getUpdateEmplComp().equals("") ) {
			updateFlds.append("updateEmplComp_MSM00='").append( mstBMSM00VO.getUpdateEmplCompS() ).append("'").append(',') ;
		} 
		if (mstBMSM00VO.getUpdateEmpl() !=null  && !mstBMSM00VO.getUpdateEmpl().equals("") ) {
			updateFlds.append("updateEmpl_MSM00='").append( mstBMSM00VO.getUpdateEmplS() ).append("'").append(',') ;
		} 
		if(updateFlds.length()==0) {
			return 0;
		}	
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append("UPDATE MS.TBMSM00");
		sqlStr.append(" SET ").append( updateFlds.substring(0, updateFlds.length()-1) );
		sqlStr.append(" WHERE  msM00Uid_MSM00=" + mstBMSM00VO.getMsM00Uid() + " ");
		this.sql = sqlStr.toString();
		return this.executeUpdate(this.sql) ;
	}


	/**
	 * 修改資料 throws
	 * <p>
	 * @return int - 交易筆數
	 * @exception dejcEditException - Value Object 資料有誤
	 * @exception dejcNoUpdateException - 無任何資料修改
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public int updateExp(msjcTBMSM00VO mstBMSM00VO)
			throws dejcEditException, dejcNoUpdateException, SQLException, Exception {
		int rslt = update(mstBMSM00VO) ;
		if (rslt == 0) {
			throw new dejcNoUpdateException(sql) ;
		}
		return rslt ;
	}

	/**
	 * 修改-新增多筆資料, 如果修改 0 筆的話，即新增該筆資料
	 * <p>
	 * @return int - 交易筆數
	 * @exception dejcEditException - Value Object 資料有誤
	 * @exception dejcNoUpdateException - 無任何資料修改
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public int updateCreateList(List mstBMSM00VOList)
			throws dejcEditException, dejcNoUpdateException, SQLException, Exception {
		int count = 0 ;
		for (int i=0; i<mstBMSM00VOList.size(); i++) {
			msjcTBMSM00VO mstBMSM00VO = (msjcTBMSM00VO)mstBMSM00VOList.get(i) ;
			int updateCount = update(mstBMSM00VO) ;
			if ( updateCount==0 ) {
				count += create(mstBMSM00VO) ;
			} else {
				count += updateCount ;
			}
		}
		return count ;
	}

	/**
	 * 修改多筆資料 throws
	 * <p>
	 * @param mstBMSM00VOList 欲修改的資料物件
	 * @return int - 交易筆數
	 * @exception dejcNoUpdateException - 無任何資料被修改
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public int updateList(List mstBMSM00VOList)
			throws dejcNoUpdateException, SQLException, Exception {
		int count = 0 ;
		for (int i=0; i<mstBMSM00VOList.size(); i++) {
			msjcTBMSM00VO mstBMSM00VO = (msjcTBMSM00VO)mstBMSM00VOList.get(i) ;
			count = count+this.updateExp(mstBMSM00VO) ;
		}
		return count ;
	}

	/**
	 * 執行 addCreateBatch(Object obj) 時需要用到的 sql
	 * 新增資料的 prepareStatement sql<br>
	 * 此方法是覆寫 commonDAO 的方法
	 */
    protected String getCreatePreSql() throws SQLException {
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append("INSERT INTO MS.TBMSM00  (");
		sqlStr.append("msM00Uid_MSM00,compId_MSM00,vendorNo_MSM00,countryId_MSM00,cVendorName_MSM00,")
           .append("eVendorName_MSM00,abbrevName_MSM00,capital_MSM00,capitalCrcy_MSM00,owner_MSM00,")
           .append("oldVendorNo_MSM00,newVendorNo_MSM00,invoiceType_MSM00,respDept_MSM00,rejUpdDate_MSM00,")
           .append("rejCode_MSM00,rejStartDate_MSM00,rejEndDate_MSM00,rejReason_MSM00,rejPoNo_MSM00,")
           .append("reqDate_MSM00,reqTimes_MSM00,poDate_MSM00,poTimes_MSM00,attachment_MSM00,")
           .append("status_MSM00,isIssue_MSM00,isQuote_MSM00,isPO_MSM00,dataType_MSM00,")
           .append("mailId_MSM00,createMailDate_MSM00,confirmMailDate_MSM00,createDate_MSM00,createTime_MSM00,")
           .append("createEmplComp_MSM00,createEmpl_MSM00,updateDate_MSM00,updateTime_MSM00,updateEmplComp_MSM00,")
           .append("updateEmpl_MSM00");
		sqlStr.append(") VALUES (");
		sqlStr.append("?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,")
           .append("?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,")
           .append("?,?,?,?,?,?,?,?,?,?,?");
		sqlStr.append(")");		    
		return sqlStr.toString();
    }

	/**
	 * 執行 addupdateBatch(Object obj) 時需要用到的 sql
	 * 修改資料的 prepareStatement sql<br>
	 * 此方法是覆寫 commonDAO 的方法
	 */
    protected String getUpdatePreSql() throws SQLException {
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append("UPDATE MS.TBMSM00");
		sqlStr.append(" SET compId_MSM00=?,vendorNo_MSM00=?,countryId_MSM00=?,cVendorName_MSM00=?,eVendorName_MSM00=?,")
           .append("abbrevName_MSM00=?,capital_MSM00=?,capitalCrcy_MSM00=?,owner_MSM00=?,oldVendorNo_MSM00=?,")
           .append("newVendorNo_MSM00=?,invoiceType_MSM00=?,respDept_MSM00=?,rejUpdDate_MSM00=?,rejCode_MSM00=?,")
           .append("rejStartDate_MSM00=?,rejEndDate_MSM00=?,rejReason_MSM00=?,rejPoNo_MSM00=?,reqDate_MSM00=?,")
           .append("reqTimes_MSM00=?,poDate_MSM00=?,poTimes_MSM00=?,attachment_MSM00=?,status_MSM00=?,")
           .append("isIssue_MSM00=?,isQuote_MSM00=?,isPO_MSM00=?,dataType_MSM00=?,mailId_MSM00=?,")
           .append("createMailDate_MSM00=?,confirmMailDate_MSM00=?,createDate_MSM00=?,createTime_MSM00=?,createEmplComp_MSM00=?,")
           .append("createEmpl_MSM00=?,updateDate_MSM00=?,updateTime_MSM00=?,updateEmplComp_MSM00=?,updateEmpl_MSM00=? ");
		sqlStr.append(" WHERE  msM00Uid_MSM00=? ");
		return sqlStr.toString();
    }

	/**
	 * 執行 addDeleteBatch(Object obj) 時需要用到的 sql
	 * 刪除資料的 prepareStatement sql<br>
	 * 此方法是覆寫 commonDAO 的方法
	 */
    protected String getDeletePreSql() throws SQLException {
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append("DELETE FROM MS.TBMSM00");
		sqlStr.append(" WHERE  msM00Uid_MSM00=? " );
		return sqlStr.toString();
    }

	/**
	 * 執行 addCreateBatch(Object obj) 時需要呼叫的方法
	 */
    protected void prepareCreate(Object obj) throws SQLException {
    	msjcTBMSM00VO mstBMSM00VO = (msjcTBMSM00VO)obj ;
		pstmt.setInt(1, mstBMSM00VO.getMsM00Uid()) ;
		pstmt.setString(2, mstBMSM00VO.getCompId()) ;
		pstmt.setString(3, mstBMSM00VO.getVendorNo()) ;
		pstmt.setString(4, mstBMSM00VO.getCountryId()) ;
		pstmt.setString(5, mstBMSM00VO.getCVendorName()) ;
		pstmt.setString(6, mstBMSM00VO.getEVendorName()) ;
		pstmt.setString(7, mstBMSM00VO.getAbbrevName()) ;
		pstmt.setBigDecimal(8, mstBMSM00VO.getCapital()) ;
		pstmt.setString(9, mstBMSM00VO.getCapitalCrcy()) ;
		pstmt.setString(10, mstBMSM00VO.getOwner()) ;
		pstmt.setString(11, mstBMSM00VO.getOldVendorNo()) ;
		pstmt.setString(12, mstBMSM00VO.getNewVendorNo()) ;
		pstmt.setString(13, mstBMSM00VO.getInvoiceType()) ;
		pstmt.setString(14, mstBMSM00VO.getRespDept()) ;
		pstmt.setString(15, mstBMSM00VO.getRejUpdDate()) ;
		pstmt.setString(16, mstBMSM00VO.getRejCode()) ;
		pstmt.setString(17, mstBMSM00VO.getRejStartDate()) ;
		pstmt.setString(18, mstBMSM00VO.getRejEndDate()) ;
		pstmt.setString(19, mstBMSM00VO.getRejReason()) ;
		pstmt.setString(20, mstBMSM00VO.getRejPoNo()) ;
		pstmt.setString(21, mstBMSM00VO.getReqDate()) ;
		pstmt.setInt(22, mstBMSM00VO.getReqTimes()) ;
		pstmt.setString(23, mstBMSM00VO.getPoDate()) ;
		pstmt.setInt(24, mstBMSM00VO.getPoTimes()) ;
		pstmt.setString(25, mstBMSM00VO.getAttachment()) ;
		pstmt.setString(26, mstBMSM00VO.getStatus()) ;
		pstmt.setString(27, mstBMSM00VO.getIsIssue()) ;
		pstmt.setString(28, mstBMSM00VO.getIsQuote()) ;
		pstmt.setString(29, mstBMSM00VO.getIsPO()) ;
		pstmt.setString(30, mstBMSM00VO.getDataType()) ;
		pstmt.setString(31, mstBMSM00VO.getMailId()) ;
		pstmt.setString(32, mstBMSM00VO.getCreateMailDate()) ;
		pstmt.setString(33, mstBMSM00VO.getConfirmMailDate()) ;
		pstmt.setString(34, mstBMSM00VO.getCreateDate()) ;
		pstmt.setString(35, mstBMSM00VO.getCreateTime()) ;
		pstmt.setString(36, mstBMSM00VO.getCreateEmplComp()) ;
		pstmt.setString(37, mstBMSM00VO.getCreateEmpl()) ;
		pstmt.setString(38, mstBMSM00VO.getUpdateDate()) ;
		pstmt.setString(39, mstBMSM00VO.getUpdateTime()) ;
		pstmt.setString(40, mstBMSM00VO.getUpdateEmplComp()) ;
		pstmt.setString(41, mstBMSM00VO.getUpdateEmpl()) ;
    }

	/**
	 * 執行 addUpdateBatch(Object obj) 時需要呼叫的方法
	 */
    protected void prepareUpdate(Object obj) throws SQLException {
    	msjcTBMSM00VO mstBMSM00VO = (msjcTBMSM00VO)obj ;
		pstmt.setString(1, mstBMSM00VO.getCompId()) ;
		pstmt.setString(2, mstBMSM00VO.getVendorNo()) ;
		pstmt.setString(3, mstBMSM00VO.getCountryId()) ;
		pstmt.setString(4, mstBMSM00VO.getCVendorName()) ;
		pstmt.setString(5, mstBMSM00VO.getEVendorName()) ;
		pstmt.setString(6, mstBMSM00VO.getAbbrevName()) ;
		pstmt.setBigDecimal(7, mstBMSM00VO.getCapital()) ;
		pstmt.setString(8, mstBMSM00VO.getCapitalCrcy()) ;
		pstmt.setString(9, mstBMSM00VO.getOwner()) ;
		pstmt.setString(10, mstBMSM00VO.getOldVendorNo()) ;
		pstmt.setString(11, mstBMSM00VO.getNewVendorNo()) ;
		pstmt.setString(12, mstBMSM00VO.getInvoiceType()) ;
		pstmt.setString(13, mstBMSM00VO.getRespDept()) ;
		pstmt.setString(14, mstBMSM00VO.getRejUpdDate()) ;
		pstmt.setString(15, mstBMSM00VO.getRejCode()) ;
		pstmt.setString(16, mstBMSM00VO.getRejStartDate()) ;
		pstmt.setString(17, mstBMSM00VO.getRejEndDate()) ;
		pstmt.setString(18, mstBMSM00VO.getRejReason()) ;
		pstmt.setString(19, mstBMSM00VO.getRejPoNo()) ;
		pstmt.setString(20, mstBMSM00VO.getReqDate()) ;
		pstmt.setInt(21, mstBMSM00VO.getReqTimes()) ;
		pstmt.setString(22, mstBMSM00VO.getPoDate()) ;
		pstmt.setInt(23, mstBMSM00VO.getPoTimes()) ;
		pstmt.setString(24, mstBMSM00VO.getAttachment()) ;
		pstmt.setString(25, mstBMSM00VO.getStatus()) ;
		pstmt.setString(26, mstBMSM00VO.getIsIssue()) ;
		pstmt.setString(27, mstBMSM00VO.getIsQuote()) ;
		pstmt.setString(28, mstBMSM00VO.getIsPO()) ;
		pstmt.setString(29, mstBMSM00VO.getDataType()) ;
		pstmt.setString(30, mstBMSM00VO.getMailId()) ;
		pstmt.setString(31, mstBMSM00VO.getCreateMailDate()) ;
		pstmt.setString(32, mstBMSM00VO.getConfirmMailDate()) ;
		pstmt.setString(33, mstBMSM00VO.getCreateDate()) ;
		pstmt.setString(34, mstBMSM00VO.getCreateTime()) ;
		pstmt.setString(35, mstBMSM00VO.getCreateEmplComp()) ;
		pstmt.setString(36, mstBMSM00VO.getCreateEmpl()) ;
		pstmt.setString(37, mstBMSM00VO.getUpdateDate()) ;
		pstmt.setString(38, mstBMSM00VO.getUpdateTime()) ;
		pstmt.setString(39, mstBMSM00VO.getUpdateEmplComp()) ;
		pstmt.setString(40, mstBMSM00VO.getUpdateEmpl()) ;
		pstmt.setInt(41, mstBMSM00VO.getMsM00Uid()) ;
    }

	/**
	 * 執行 addDeleteBatch(Object obj) 時需要呼叫的方法
	 */
    protected void prepareDelete(Object obj) throws SQLException {
    	msjcTBMSM00VO mstBMSM00VO = (msjcTBMSM00VO)obj ;
		pstmt.setInt(1, mstBMSM00VO.getMsM00Uid()) ;
    }

	/**
	 * 實作父類別
	 * <p>
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	protected Object getObjFromRS(ResultSet rs) throws SQLException,Exception {
		return msjcTBMSM00VO.getInstanceByName(rs) ;
	}

	/**
	 * 實作父類別, 使用 user 傳進來的 object, 不另行 new , 以節省執行時間及記憶體<br>
	 * 適合臨時性的資料運算(通常在運算大量資料時，一些欄位需要暫存在 value object)<br>
	 * 此方法只會在執行 findByPK(Object obj,int msM00Uid) 時才被呼叫。
	 * <p>
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	protected Object getObjFromRS(Object obj, ResultSet rs) throws SQLException,Exception {
		return msjcTBMSM00VO.getInstanceByName(obj, rs) ;
	}
	
	/**
	  * 備份方法 2009.03.26 新增
	  */
	public int backup(String tableName, msjcTBMSM00VO mstBMSM00VO) throws SQLException, Exception {
		this.sql = getCreateSql(mstBMSM00VO).replaceFirst(" MS.TBMSM00 "," "+tableName+" "); 
		return this.executeUpdate(this.sql) ;
	} 
	public int backup(String tableName, ResultSet rs) throws SQLException, Exception {
		return backup(tableName, msjcTBMSM00VO.getInstanceByName(rs) ) ;
	} 

	public String getUpdateEditFieldsPartialSql(msjcTBMSM00VO mstBMSM00VO)  {
		if( mstBMSM00VO.getEditColumns()==null ) {
			return "";
		}
		return dezcSqlUtils.genUpdateFields(  mstBMSM00VO.getEditColumns() );		
	}
	/**
	  * 修改有動過的欄位，此方法要有效請確保有先執行  msjcTBMSM00VO.monitor() 
	  */
	public String getUpdateEditFieldsSql(msjcTBMSM00VO mstBMSM00VO) throws SQLException, Exception {
		String updSql =getUpdateEditFieldsPartialSql(mstBMSM00VO) ;
		if(updSql.equals("")){
			return "";
		}
		return "update MS.TBMSM00 set "+updSql+" where   msM00Uid_MSM00=" + mstBMSM00VO.getMsM00Uid() + " ";
	}
	/**
	  * 修改有動過的欄位，此方法要有效請確保有先執行  msjcTBMSM00VO.monitor() 
	  */
	public int updateEditFields(msjcTBMSM00VO mstBMSM00VO) throws SQLException, Exception {
		this.sql=getUpdateEditFieldsSql(mstBMSM00VO);
		if(this.sql.equals("")){
			// 2010.03.02 從0改為-1，以識別是否有執行
			return -1;
		}
		return this.executeUpdate(getUpdateEditFieldsSql(mstBMSM00VO)) ;
	}
	/**
	 * 假update的sql，找最後一個欄位來假update
	 */	
	private String getLockSqlPrefix() {
		return "update MS.TBMSM00 set updateEmpl_MSM00=updateEmpl_MSM00 ";
	}

	/**
	 * 查詢、鎖定、監控資料
	 */	
	public msjcTBMSM00VO loadByPK4Update(int msM00Uid) throws SQLException, Exception {
		List aList = loadList4Update("WHERE   msM00Uid_MSM00="+msM00Uid+" ");
		if(aList.size()>0) {
			return (msjcTBMSM00VO)aList.get(0);
		}else {
			throw new dejcNotFoundException(this.sql) ;	
		}	
	}
	
	private String getSelectSqlPrefix() {
		return "select * from MS.TBMSM00 ";
	}
	
	private List loadList4Update(String conditionSql) throws SQLException, Exception {
		this.executeUpdate(getLockSqlPrefix()+conditionSql) ;
		this.sql=getSelectSqlPrefix()+conditionSql ;
		return monitor(this.eQueryAll( this.sql ));
	}
	/**
	  *監控資料
	  */
	private List monitor(List mstBMSM00VOList){
		for (int i=0; i<mstBMSM00VOList.size(); i++) {
			msjcTBMSM00VO mstBMSM00VO = (msjcTBMSM00VO)mstBMSM00VOList.get(i) ;
			mstBMSM00VO.monitor();
		}	
		return mstBMSM00VOList;
	}
	/**
	 * 以 VO 撈出 DB 資料，撈資料同時會鎖定
	 */
	public msjcTBMSM00VO loadByVO(msjcTBMSM00VO mstBMSM00VO) throws SQLException, Exception {
		return loadByPK4Update(mstBMSM00VO.getMsM00Uid());
	}
	/**
	 * 以 VO List 撈出 DB 資料，撈資料同時會鎖定
	 */
	public List loadByList(List mstBMSM00VOList) throws SQLException, Exception {
		List rsltList= new ArrayList(mstBMSM00VOList.size());
		for (Iterator iterator = mstBMSM00VOList.iterator(); iterator.hasNext();) {
			msjcTBMSM00VO mstBMSM00VO = (msjcTBMSM00VO) iterator.next();
			rsltList.add( loadByVO(mstBMSM00VO) ) ;
		}
		return rsltList;
	}
	/**
	 * 以動態查詢條件查詢
	 */
	public Vector findByCriteria(dezcCriteria criteria)throws dejcNotFoundException, SQLException, Exception{
		return findByCriteria(criteria,"");
	}
	/**
	 * 以動態查詢條件查詢單筆資料
	 */
    public msjcTBMSM00VO getOneNotNull(dezcCriteria criteria) throws SQLException, Exception {
    	List voList = this.findByCriteria(criteria);
    	if (voList.size()==0) {
    		return new msjcTBMSM00VO();
    	}
    	return (msjcTBMSM00VO) voList.get(0);
    }
	/**
	 * 以動態查詢條件查詢
	 */
	public Vector findByCriteria(dezcCriteria criteria,String orderby)throws dejcNotFoundException, SQLException, Exception{
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append(getSelectSqlPrefix());
		if(!dejcUtility.isNull(orderby)) {
			orderby="order by "+orderby;
		}
		sqlStr.append(criteria.toSqlWithWhereIfExists()).append(orderby);  
		this.sql = sqlStr.toString();
		return this.eQueryAll(this.sql) ;
	}
	
	/**
     * 以主鍵來查詢次筆資料
     * <p>
     * @return mstBMSM00VO - 單筆資料
     * @exception SQLException - 資料庫錯誤
     * @since 103/06/25
     */
    public msjcTBMSM00VO findNextRcd(int msM00Uid)
            throws SQLException, Exception {
        String[] name = {"msM00Uid_MSM00"};
        Object[] value = {msM00Uid};
        this.sql = dezcSqlUtils.getNextRcdSql(getTableName(), name ,value) ;
        return (msjcTBMSM00VO) this.eQuery(this.sql) ;
    } 
	
	/**
     * 以主鍵來查詢前筆資料
     * <p>
     * @return mstBMSM00VO - 單筆資料
     * @exception SQLException - 資料庫錯誤
     * @since 103/06/25
     */
    public msjcTBMSM00VO findPrevRcd(int msM00Uid)
            throws SQLException, Exception {
        String[] name = {"msM00Uid_MSM00"};
        Object[] value = {msM00Uid};
        this.sql = dezcSqlUtils.getPrevRcdSql(getTableName(), name ,value) ;
        return (msjcTBMSM00VO) this.eQuery(this.sql) ;
    } 
    
    /** 取得 table name
     * <p>
     * @since 103/06/25
     */
    public final static String getTableName() {
        return "MS.TBMSM00" ;
    } 
    
//==^_^== ======= Don't Extend Your Code above , or All changes will lose after next Generating Code ===========  ==^_^== //
    public Integer getUidByKey(String compId,String vendorNo) throws SQLException, Exception{
    	dezcCriteria criteria = new dezcCriteria();
    	criteria.eq("compId_MSM00", compId);
    	criteria.eq("vendorNo_MSM00", vendorNo);
    	msjcTBMSM00VO vo = getOneNotNull(criteria);
    	return vo.getMsM00Uid();
    }
    
    public int removeAll() throws SQLException, Exception{
    	StringBuffer sql = new StringBuffer();
    	sql.append("delete from MS.TBMSM00 ");
    	int cnt = this.executeUpdate(sql.toString());
    	sql.setLength(0);
    	sql.append("ALTER TABLE MS.TBMSM00 ALTER COLUMN MSM00UID_MSM00 RESTART WITH 1");
    	cnt += this.executeUpdate(sql.toString());
    	return cnt;
    }
} // end of Class msjcTBMSM00DAO