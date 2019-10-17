/*----------------------------------------------------------------------------*/
/* msjcTBMSM02DAO		DAOTool Ver 10.0112 (INPUT FILE VERSION:2.0)
/*----------------------------------------------------------------------------*/
/* author : 
/* system : 
/* target : 供應商停權資料檔
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
 * 供應商停權資料檔 DAO.
 * <pre>
 * Table Name        : MS.TBMSM02
 * Table Description : 供應商停權資料檔
 * Value Object Name : msjcTBMSM02VO
 * </pre>
 * @version $Id$
 * @since msjcTBMSM02VO - 103/06/25
 * @author 
 */
public class msjcTBMSM02DAO extends dejcCommonDAO {
	public final static String AppId = "MSJCTBMSM02DAO" ;
	public final static String CLASS_VERSION = "$Revision: 1.4 $ $Date: 2014/06/25 03:30:06 $";

/*----------------------------------------------------------------------------*/
/* Creates new msjcTBMSM02DAO
/*----------------------------------------------------------------------------*/

	/**
	 * 建構子
	 * @param dsCom - 共用元件
	 * @since 103/06/25
	 */
	public msjcTBMSM02DAO(dsjccom dsCom) {
		super(dsCom, AppId);
	}
	/**
	 * 建構子
	 * @param dsCom - 共用元件
	 * @param con - 交易連接緒
	 * @since 103/06/25
	 */
	public msjcTBMSM02DAO(dsjccom dsCom, Connection con) {
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
	private String getFindByPKSql(int msM02Uid,int msM00Uid) {
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append("SELECT * FROM MS.TBMSM02");
		sqlStr.append(" WHERE  msM02Uid_MSM02="+msM02Uid+" and msM00Uid_MSM02="+msM00Uid+" ");
		return sqlStr.toString();
	}
	/**
	 * 以主鍵來查詢資料
	 * <p>
	 * @return mstBMSM02VO - 單筆資料
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public msjcTBMSM02VO findByPK(int msM02Uid,int msM00Uid)
			throws SQLException, Exception {
		this.sql = getFindByPKSql(msM02Uid,msM00Uid) ;
		return (msjcTBMSM02VO) this.eQuery(this.sql) ;
	}

	/**
	 * 以主鍵來查詢資料
	 * <p>
	 * @return mstBMSM02VO - 單筆資料
	 * @exception dejcNotFoundException - 若查不到資料時
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public msjcTBMSM02VO findByPKExp(int msM02Uid,int msM00Uid)
			throws dejcNotFoundException, SQLException, Exception {
		msjcTBMSM02VO mstBMSM02VO = findByPK(msM02Uid,msM00Uid) ;
		if (mstBMSM02VO == null) {
			throw new dejcNotFoundException(this.sql) ;
		}
		return mstBMSM02VO ;
	}

	/**
	 * 以主鍵來查詢資料
	 * <p>
	 * @param mstBMSM02VO - 由使用者所提供的 object, DAO 不另行 new
	 * @return mstBMSM02VO - 單筆資料
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public msjcTBMSM02VO findByPK(msjcTBMSM02VO mstBMSM02VO, int msM02Uid,int msM00Uid)
			throws SQLException,Exception {
		this.sql = getFindByPKSql(msM02Uid,msM00Uid) ;
		return (msjcTBMSM02VO) this.eQuery(mstBMSM02VO, this.sql) ;
	}

	/**
	 * 以主鍵來查詢資料
	 * <p>
	 * @param mstBMSM02VO - 由使用者所提供的 object, DAO 不另行 new
	 * @return mstBMSM02VO - 單筆資料
	 * @exception dejcNotFoundException - 若查不到資料時
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public msjcTBMSM02VO findByPKExp(msjcTBMSM02VO mstBMSM02VO, int msM02Uid,int msM00Uid)
			throws dejcNotFoundException, SQLException, Exception {
		mstBMSM02VO = findByPK(mstBMSM02VO, msM02Uid,msM00Uid) ;
		if (mstBMSM02VO == null) {
			throw new dejcNotFoundException(this.sql) ;
		}
		return mstBMSM02VO ;
	}

	/**
	 * 複合查詢資料
	 * <p>
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public Vector findByMasterKey(int msM02Uid)
			throws dejcNotFoundException, SQLException, Exception {
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append("SELECT * FROM MS.TBMSM02");
		sqlStr.append(" WHERE msM02Uid_MSM02="+msM02Uid+" ");
		sqlStr.append(" order by  ");
		this.sql = sqlStr.toString();
	  	return this.eQueryAll(this.sql) ;
	}
	/**
	 * 新增一筆資料 throws
	 * <p>
	 * @param mstBMSM02VO - Value Object
	 * @return int - 交易筆數
	 * @exception dejcEditException - Value Object 資料有誤
	 * @exception dejcNoUpdateException - 無任何資料新增
	 * @exception dejcDupException - 重複鍵值
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public int create(msjcTBMSM02VO mstBMSM02VO)
			throws dejcEditException, dejcNoUpdateException, dejcDupException, SQLException, Exception {
		if (mstBMSM02VO.verify() == false) {
			throw new dejcEditException(mstBMSM02VO.getMessage()) ;
		}
		if (mstBMSM02VO.isKeyOk() == false) {
			throw new dejcEditException("Value of key["+AppId+"].["+mstBMSM02VO.getMessage()+"] is null or empty!") ;
		}

		onBeforeCreate(mstBMSM02VO);
		this.sql = getCreateSql(mstBMSM02VO) ;

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
	
	private void onBeforeCreate(msjcTBMSM02VO mstBMSM02VO) {
		
	}
	
	public String getCreateSql(msjcTBMSM02VO mstBMSM02VO) {
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append("INSERT INTO MS.TBMSM02 (");
		sqlStr.append("msM02Uid_MSM02,msM00Uid_MSM02,compId_MSM02,vendorNo_MSM02,startDate_MSM02,")
           .append("endDate_MSM02,rejCode_MSM02,rejReason_MSM02,rejPoNo_MSM02,rejDept_MSM02,")
           .append("attachment_MSM02,appId_MSM02,createDate_MSM02,createTime_MSM02,createEmplComp_MSM02,")
           .append("createEmpl_MSM02,updateDate_MSM02,updateTime_MSM02,updateEmplComp_MSM02,updateEmpl_MSM02");
		sqlStr.append(") VALUES (");
		sqlStr.append("").append(mstBMSM02VO.getMsM02UidDEF()).append(",").append(mstBMSM02VO.getMsM00Uid()).append(",'").append(mstBMSM02VO.getCompIdS()).append("','").append(mstBMSM02VO.getVendorNoS());
		sqlStr.append("','").append(mstBMSM02VO.getStartDateS()).append("','").append(mstBMSM02VO.getEndDateS()).append("','").append(mstBMSM02VO.getRejCodeS());
		sqlStr.append("','").append(mstBMSM02VO.getRejReasonS()).append("','").append(mstBMSM02VO.getRejPoNoS()).append("','").append(mstBMSM02VO.getRejDeptS());
		sqlStr.append("','").append(mstBMSM02VO.getAttachmentS()).append("','").append(mstBMSM02VO.getAppIdS()).append("','").append(mstBMSM02VO.getCreateDateS());
		sqlStr.append("','").append(mstBMSM02VO.getCreateTimeS()).append("','").append(mstBMSM02VO.getCreateEmplCompS()).append("','").append(mstBMSM02VO.getCreateEmplS());
		sqlStr.append("','").append(mstBMSM02VO.getUpdateDateS()).append("','").append(mstBMSM02VO.getUpdateTimeS()).append("','").append(mstBMSM02VO.getUpdateEmplCompS());
		sqlStr.append("','").append(mstBMSM02VO.getUpdateEmplS()).append("'");
		sqlStr.append(")");	
		this.sql = sqlStr.toString() ;
		return this.sql;
	}

	/**
	 * 新增多筆資料 throws
	 * <p>
	 * @param mstBMSM02VOList - Value Object
	 * @return int - 交易筆數
	 * @exception dejcEditException - Value Object 資料有誤
	 * @exception dejcNoUpdateException - 無任何資料新增
	 * @exception dejcDupException - 重複鍵值
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public int createList(List mstBMSM02VOList)
			throws dejcEditException, dejcNoUpdateException, dejcDupException, SQLException, Exception {
		int count = 0 ;
		for (int i=0; i<mstBMSM02VOList.size(); i++) {
			msjcTBMSM02VO mstBMSM02VO = (msjcTBMSM02VO)mstBMSM02VOList.get(i) ;
			count = count+this.create(mstBMSM02VO) ;
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
	public int remove(int msM02Uid,int msM00Uid)
			throws SQLException, Exception {		
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append("DELETE FROM MS.TBMSM02");
		sqlStr.append(" WHERE  msM02Uid_MSM02="+msM02Uid+" and msM00Uid_MSM02="+msM00Uid+" " );
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
	public int removeExp(int msM02Uid,int msM00Uid)
			throws dejcNoUpdateException, SQLException, Exception {
		int rslt = remove(msM02Uid,msM00Uid) ;
		if (rslt == 0) {
			throw new dejcNoUpdateException(this.sql) ;
		}
		return rslt ;
	}

	/**
	 * 刪除資料 throws
	 * <p>
	 * @param mstBMSM02VO 欲刪除的資料物件
	 * @return int - 交易筆數
	 * @exception dejcNoUpdateException - 無任何資料被刪除
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public int removeExp(msjcTBMSM02VO mstBMSM02VO)
			throws dejcNoUpdateException, SQLException, Exception {
		return removeExp(mstBMSM02VO.getMsM02Uid(), mstBMSM02VO.getMsM00Uid()) ;
	}

	/**
	 * 刪除多筆資料 throws
	 * <p>
	 * @param mstBMSM02VOList 欲刪除的資料物件
	 * @return int - 交易筆數
	 * @exception dejcNoUpdateException - 無任何資料被刪除
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public int removeList(List mstBMSM02VOList)
			throws dejcNoUpdateException, SQLException, Exception {
		int count = 0 ;
		for (int i=0; i<mstBMSM02VOList.size(); i++) {
			msjcTBMSM02VO mstBMSM02VO = (msjcTBMSM02VO)mstBMSM02VOList.get(i) ;
			count = count+this.remove(mstBMSM02VO.getMsM02Uid(), mstBMSM02VO.getMsM00Uid()) ;
		}
		return count ;
	}

	/**
	 * 刪除資料 throws
	 * <p>
	 * @param mstBMSM02VO 欲刪除的資料物件
	 * @return int - 交易筆數
	 * @exception dejcNoUpdateException - 無任何資料被刪除
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public int remove(msjcTBMSM02VO mstBMSM02VO)
			throws SQLException, Exception {
		return remove(mstBMSM02VO.getMsM02Uid(), mstBMSM02VO.getMsM00Uid()) ;
	}

	/**
	 * 修改資料
	 * <p>
	 * @return int - 交易筆數
	 * @exception dejcEditException - Value Object 資料有誤
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public int update(msjcTBMSM02VO mstBMSM02VO)
			throws dejcEditException, SQLException, Exception {
		if (mstBMSM02VO.verify() == false) {
			throw new dejcEditException(mstBMSM02VO.getMessage()) ;
		}
		if(mstBMSM02VO.hasEditFields()) {
			return updateEditFields(mstBMSM02VO);
		} else {
			return this.executeUpdate(getUpdateSql(mstBMSM02VO) ) ;
		}
	}

	public String getUpdateSql(msjcTBMSM02VO mstBMSM02VO) {
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append("UPDATE MS.TBMSM02");
		sqlStr.append(" SET compId_MSM02='").append(mstBMSM02VO.getCompIdS()).append("',vendorNo_MSM02='").append(mstBMSM02VO.getVendorNoS()).append("',startDate_MSM02='").append(mstBMSM02VO.getStartDateS()).append("',endDate_MSM02='").append(mstBMSM02VO.getEndDateS()).append("',rejCode_MSM02='").append(mstBMSM02VO.getRejCodeS()).append("',");
		sqlStr.append("rejReason_MSM02='").append(mstBMSM02VO.getRejReasonS()).append("',rejPoNo_MSM02='").append(mstBMSM02VO.getRejPoNoS()).append("',rejDept_MSM02='").append(mstBMSM02VO.getRejDeptS()).append("',attachment_MSM02='").append(mstBMSM02VO.getAttachmentS()).append("',appId_MSM02='").append(mstBMSM02VO.getAppIdS()).append("',");
		sqlStr.append("createDate_MSM02='").append(mstBMSM02VO.getCreateDateS()).append("',createTime_MSM02='").append(mstBMSM02VO.getCreateTimeS()).append("',createEmplComp_MSM02='").append(mstBMSM02VO.getCreateEmplCompS()).append("',createEmpl_MSM02='").append(mstBMSM02VO.getCreateEmplS()).append("',updateDate_MSM02='").append(mstBMSM02VO.getUpdateDateS()).append("',");
		sqlStr.append("updateTime_MSM02='").append(mstBMSM02VO.getUpdateTimeS()).append("',updateEmplComp_MSM02='").append(mstBMSM02VO.getUpdateEmplCompS()).append("',updateEmpl_MSM02='").append(mstBMSM02VO.getUpdateEmplS()).append("' ");
		sqlStr.append(" WHERE  msM02Uid_MSM02=" + mstBMSM02VO.getMsM02Uid() + " and msM00Uid_MSM02=" + mstBMSM02VO.getMsM00Uid() + " ");
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
	public int updateFldsNotDef(msjcTBMSM02VO mstBMSM02VO)
			throws dejcEditException, SQLException, Exception {
		if (mstBMSM02VO.verify() == false) {
			throw new dejcEditException(mstBMSM02VO.getMessage()) ;
		}
		if (mstBMSM02VO.isKeyOk() == false) {
			throw new dejcEditException("primary key["+mstBMSM02VO.getMessage()+"] of ["+AppId+"] is empty!") ;
		}		
		StringBuffer updateFlds = new StringBuffer();
		if (mstBMSM02VO.getCompId() !=null  && !mstBMSM02VO.getCompId().equals("") ) {
			updateFlds.append("compId_MSM02='").append( mstBMSM02VO.getCompIdS() ).append("'").append(',') ;
		} 
		if (mstBMSM02VO.getVendorNo() !=null  && !mstBMSM02VO.getVendorNo().equals("") ) {
			updateFlds.append("vendorNo_MSM02='").append( mstBMSM02VO.getVendorNoS() ).append("'").append(',') ;
		} 
		if (mstBMSM02VO.getStartDate() !=null  && !mstBMSM02VO.getStartDate().equals("") ) {
			updateFlds.append("startDate_MSM02='").append( mstBMSM02VO.getStartDateS() ).append("'").append(',') ;
		} 
		if (mstBMSM02VO.getEndDate() !=null  && !mstBMSM02VO.getEndDate().equals("") ) {
			updateFlds.append("endDate_MSM02='").append( mstBMSM02VO.getEndDateS() ).append("'").append(',') ;
		} 
		if (mstBMSM02VO.getRejCode() !=null  && !mstBMSM02VO.getRejCode().equals("") ) {
			updateFlds.append("rejCode_MSM02='").append( mstBMSM02VO.getRejCodeS() ).append("'").append(',') ;
		} 
		if (mstBMSM02VO.getRejReason() !=null  && !mstBMSM02VO.getRejReason().equals("") ) {
			updateFlds.append("rejReason_MSM02='").append( mstBMSM02VO.getRejReasonS() ).append("'").append(',') ;
		} 
		if (mstBMSM02VO.getRejPoNo() !=null  && !mstBMSM02VO.getRejPoNo().equals("") ) {
			updateFlds.append("rejPoNo_MSM02='").append( mstBMSM02VO.getRejPoNoS() ).append("'").append(',') ;
		} 
		if (mstBMSM02VO.getRejDept() !=null  && !mstBMSM02VO.getRejDept().equals("") ) {
			updateFlds.append("rejDept_MSM02='").append( mstBMSM02VO.getRejDeptS() ).append("'").append(',') ;
		} 
		if (mstBMSM02VO.getAttachment() !=null  && !mstBMSM02VO.getAttachment().equals("") ) {
			updateFlds.append("attachment_MSM02='").append( mstBMSM02VO.getAttachmentS() ).append("'").append(',') ;
		} 
		if (mstBMSM02VO.getAppId() !=null  && !mstBMSM02VO.getAppId().equals("") ) {
			updateFlds.append("appId_MSM02='").append( mstBMSM02VO.getAppIdS() ).append("'").append(',') ;
		} 
		if (mstBMSM02VO.getCreateDate() !=null  && !mstBMSM02VO.getCreateDate().equals("") ) {
			updateFlds.append("createDate_MSM02='").append( mstBMSM02VO.getCreateDateS() ).append("'").append(',') ;
		} 
		if (mstBMSM02VO.getCreateTime() !=null  && !mstBMSM02VO.getCreateTime().equals("") ) {
			updateFlds.append("createTime_MSM02='").append( mstBMSM02VO.getCreateTimeS() ).append("'").append(',') ;
		} 
		if (mstBMSM02VO.getCreateEmplComp() !=null  && !mstBMSM02VO.getCreateEmplComp().equals("") ) {
			updateFlds.append("createEmplComp_MSM02='").append( mstBMSM02VO.getCreateEmplCompS() ).append("'").append(',') ;
		} 
		if (mstBMSM02VO.getCreateEmpl() !=null  && !mstBMSM02VO.getCreateEmpl().equals("") ) {
			updateFlds.append("createEmpl_MSM02='").append( mstBMSM02VO.getCreateEmplS() ).append("'").append(',') ;
		} 
		if (mstBMSM02VO.getUpdateDate() !=null  && !mstBMSM02VO.getUpdateDate().equals("") ) {
			updateFlds.append("updateDate_MSM02='").append( mstBMSM02VO.getUpdateDateS() ).append("'").append(',') ;
		} 
		if (mstBMSM02VO.getUpdateTime() !=null  && !mstBMSM02VO.getUpdateTime().equals("") ) {
			updateFlds.append("updateTime_MSM02='").append( mstBMSM02VO.getUpdateTimeS() ).append("'").append(',') ;
		} 
		if (mstBMSM02VO.getUpdateEmplComp() !=null  && !mstBMSM02VO.getUpdateEmplComp().equals("") ) {
			updateFlds.append("updateEmplComp_MSM02='").append( mstBMSM02VO.getUpdateEmplCompS() ).append("'").append(',') ;
		} 
		if (mstBMSM02VO.getUpdateEmpl() !=null  && !mstBMSM02VO.getUpdateEmpl().equals("") ) {
			updateFlds.append("updateEmpl_MSM02='").append( mstBMSM02VO.getUpdateEmplS() ).append("'").append(',') ;
		} 
		if(updateFlds.length()==0) {
			return 0;
		}	
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append("UPDATE MS.TBMSM02");
		sqlStr.append(" SET ").append( updateFlds.substring(0, updateFlds.length()-1) );
		sqlStr.append(" WHERE  msM02Uid_MSM02=" + mstBMSM02VO.getMsM02Uid() + " and msM00Uid_MSM02=" + mstBMSM02VO.getMsM00Uid() + " ");
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
	public int updateExp(msjcTBMSM02VO mstBMSM02VO)
			throws dejcEditException, dejcNoUpdateException, SQLException, Exception {
		int rslt = update(mstBMSM02VO) ;
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
	public int updateCreateList(List mstBMSM02VOList)
			throws dejcEditException, dejcNoUpdateException, SQLException, Exception {
		int count = 0 ;
		for (int i=0; i<mstBMSM02VOList.size(); i++) {
			msjcTBMSM02VO mstBMSM02VO = (msjcTBMSM02VO)mstBMSM02VOList.get(i) ;
			int updateCount = update(mstBMSM02VO) ;
			if ( updateCount==0 ) {
				count += create(mstBMSM02VO) ;
			} else {
				count += updateCount ;
			}
		}
		return count ;
	}

	/**
	 * 修改多筆資料 throws
	 * <p>
	 * @param mstBMSM02VOList 欲修改的資料物件
	 * @return int - 交易筆數
	 * @exception dejcNoUpdateException - 無任何資料被修改
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public int updateList(List mstBMSM02VOList)
			throws dejcNoUpdateException, SQLException, Exception {
		int count = 0 ;
		for (int i=0; i<mstBMSM02VOList.size(); i++) {
			msjcTBMSM02VO mstBMSM02VO = (msjcTBMSM02VO)mstBMSM02VOList.get(i) ;
			count = count+this.updateExp(mstBMSM02VO) ;
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
		sqlStr.append("INSERT INTO MS.TBMSM02  (");
		sqlStr.append("msM02Uid_MSM02,msM00Uid_MSM02,compId_MSM02,vendorNo_MSM02,startDate_MSM02,")
           .append("endDate_MSM02,rejCode_MSM02,rejReason_MSM02,rejPoNo_MSM02,rejDept_MSM02,")
           .append("attachment_MSM02,appId_MSM02,createDate_MSM02,createTime_MSM02,createEmplComp_MSM02,")
           .append("createEmpl_MSM02,updateDate_MSM02,updateTime_MSM02,updateEmplComp_MSM02,updateEmpl_MSM02");
		sqlStr.append(") VALUES (");
		sqlStr.append("?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,")
           .append("?,?,?,?,?");
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
		sqlStr.append("UPDATE MS.TBMSM02");
		sqlStr.append(" SET compId_MSM02=?,vendorNo_MSM02=?,startDate_MSM02=?,endDate_MSM02=?,rejCode_MSM02=?,")
           .append("rejReason_MSM02=?,rejPoNo_MSM02=?,rejDept_MSM02=?,attachment_MSM02=?,appId_MSM02=?,")
           .append("createDate_MSM02=?,createTime_MSM02=?,createEmplComp_MSM02=?,createEmpl_MSM02=?,updateDate_MSM02=?,")
           .append("updateTime_MSM02=?,updateEmplComp_MSM02=?,updateEmpl_MSM02=? ");
		sqlStr.append(" WHERE  msM02Uid_MSM02=? and msM00Uid_MSM02=? ");
		return sqlStr.toString();
    }

	/**
	 * 執行 addDeleteBatch(Object obj) 時需要用到的 sql
	 * 刪除資料的 prepareStatement sql<br>
	 * 此方法是覆寫 commonDAO 的方法
	 */
    protected String getDeletePreSql() throws SQLException {
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append("DELETE FROM MS.TBMSM02");
		sqlStr.append(" WHERE  msM02Uid_MSM02=? and msM00Uid_MSM02=? " );
		return sqlStr.toString();
    }

	/**
	 * 執行 addCreateBatch(Object obj) 時需要呼叫的方法
	 */
    protected void prepareCreate(Object obj) throws SQLException {
    	msjcTBMSM02VO mstBMSM02VO = (msjcTBMSM02VO)obj ;
		pstmt.setInt(1, mstBMSM02VO.getMsM02Uid()) ;
		pstmt.setInt(2, mstBMSM02VO.getMsM00Uid()) ;
		pstmt.setString(3, mstBMSM02VO.getCompId()) ;
		pstmt.setString(4, mstBMSM02VO.getVendorNo()) ;
		pstmt.setString(5, mstBMSM02VO.getStartDate()) ;
		pstmt.setString(6, mstBMSM02VO.getEndDate()) ;
		pstmt.setString(7, mstBMSM02VO.getRejCode()) ;
		pstmt.setString(8, mstBMSM02VO.getRejReason()) ;
		pstmt.setString(9, mstBMSM02VO.getRejPoNo()) ;
		pstmt.setString(10, mstBMSM02VO.getRejDept()) ;
		pstmt.setString(11, mstBMSM02VO.getAttachment()) ;
		pstmt.setString(12, mstBMSM02VO.getAppId()) ;
		pstmt.setString(13, mstBMSM02VO.getCreateDate()) ;
		pstmt.setString(14, mstBMSM02VO.getCreateTime()) ;
		pstmt.setString(15, mstBMSM02VO.getCreateEmplComp()) ;
		pstmt.setString(16, mstBMSM02VO.getCreateEmpl()) ;
		pstmt.setString(17, mstBMSM02VO.getUpdateDate()) ;
		pstmt.setString(18, mstBMSM02VO.getUpdateTime()) ;
		pstmt.setString(19, mstBMSM02VO.getUpdateEmplComp()) ;
		pstmt.setString(20, mstBMSM02VO.getUpdateEmpl()) ;
    }

	/**
	 * 執行 addUpdateBatch(Object obj) 時需要呼叫的方法
	 */
    protected void prepareUpdate(Object obj) throws SQLException {
    	msjcTBMSM02VO mstBMSM02VO = (msjcTBMSM02VO)obj ;
		pstmt.setString(1, mstBMSM02VO.getCompId()) ;
		pstmt.setString(2, mstBMSM02VO.getVendorNo()) ;
		pstmt.setString(3, mstBMSM02VO.getStartDate()) ;
		pstmt.setString(4, mstBMSM02VO.getEndDate()) ;
		pstmt.setString(5, mstBMSM02VO.getRejCode()) ;
		pstmt.setString(6, mstBMSM02VO.getRejReason()) ;
		pstmt.setString(7, mstBMSM02VO.getRejPoNo()) ;
		pstmt.setString(8, mstBMSM02VO.getRejDept()) ;
		pstmt.setString(9, mstBMSM02VO.getAttachment()) ;
		pstmt.setString(10, mstBMSM02VO.getAppId()) ;
		pstmt.setString(11, mstBMSM02VO.getCreateDate()) ;
		pstmt.setString(12, mstBMSM02VO.getCreateTime()) ;
		pstmt.setString(13, mstBMSM02VO.getCreateEmplComp()) ;
		pstmt.setString(14, mstBMSM02VO.getCreateEmpl()) ;
		pstmt.setString(15, mstBMSM02VO.getUpdateDate()) ;
		pstmt.setString(16, mstBMSM02VO.getUpdateTime()) ;
		pstmt.setString(17, mstBMSM02VO.getUpdateEmplComp()) ;
		pstmt.setString(18, mstBMSM02VO.getUpdateEmpl()) ;
		pstmt.setInt(19, mstBMSM02VO.getMsM02Uid()) ;
		pstmt.setInt(20, mstBMSM02VO.getMsM00Uid()) ;
    }

	/**
	 * 執行 addDeleteBatch(Object obj) 時需要呼叫的方法
	 */
    protected void prepareDelete(Object obj) throws SQLException {
    	msjcTBMSM02VO mstBMSM02VO = (msjcTBMSM02VO)obj ;
		pstmt.setInt(1, mstBMSM02VO.getMsM02Uid()) ;
		pstmt.setInt(2, mstBMSM02VO.getMsM00Uid()) ;
    }

	/**
	 * 實作父類別
	 * <p>
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	protected Object getObjFromRS(ResultSet rs) throws SQLException,Exception {
		return msjcTBMSM02VO.getInstanceByName(rs) ;
	}

	/**
	 * 實作父類別, 使用 user 傳進來的 object, 不另行 new , 以節省執行時間及記憶體<br>
	 * 適合臨時性的資料運算(通常在運算大量資料時，一些欄位需要暫存在 value object)<br>
	 * 此方法只會在執行 findByPK(Object obj,int msM02Uid,int msM00Uid) 時才被呼叫。
	 * <p>
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	protected Object getObjFromRS(Object obj, ResultSet rs) throws SQLException,Exception {
		return msjcTBMSM02VO.getInstanceByName(obj, rs) ;
	}
	
	/**
	  * 備份方法 2009.03.26 新增
	  */
	public int backup(String tableName, msjcTBMSM02VO mstBMSM02VO) throws SQLException, Exception {
		this.sql = getCreateSql(mstBMSM02VO).replaceFirst(" MS.TBMSM02 "," "+tableName+" "); 
		return this.executeUpdate(this.sql) ;
	} 
	public int backup(String tableName, ResultSet rs) throws SQLException, Exception {
		return backup(tableName, msjcTBMSM02VO.getInstanceByName(rs) ) ;
	} 

	public String getUpdateEditFieldsPartialSql(msjcTBMSM02VO mstBMSM02VO)  {
		if( mstBMSM02VO.getEditColumns()==null ) {
			return "";
		}
		return dezcSqlUtils.genUpdateFields(  mstBMSM02VO.getEditColumns() );		
	}
	/**
	  * 修改有動過的欄位，此方法要有效請確保有先執行  msjcTBMSM02VO.monitor() 
	  */
	public String getUpdateEditFieldsSql(msjcTBMSM02VO mstBMSM02VO) throws SQLException, Exception {
		String updSql =getUpdateEditFieldsPartialSql(mstBMSM02VO) ;
		if(updSql.equals("")){
			return "";
		}
		return "update MS.TBMSM02 set "+updSql+" where   msM02Uid_MSM02=" + mstBMSM02VO.getMsM02Uid() + " and msM00Uid_MSM02=" + mstBMSM02VO.getMsM00Uid() + " ";
	}
	/**
	  * 修改有動過的欄位，此方法要有效請確保有先執行  msjcTBMSM02VO.monitor() 
	  */
	public int updateEditFields(msjcTBMSM02VO mstBMSM02VO) throws SQLException, Exception {
		this.sql=getUpdateEditFieldsSql(mstBMSM02VO);
		if(this.sql.equals("")){
			// 2010.03.02 從0改為-1，以識別是否有執行
			return -1;
		}
		return this.executeUpdate(getUpdateEditFieldsSql(mstBMSM02VO)) ;
	}
	/**
	 * 假update的sql，找最後一個欄位來假update
	 */	
	private String getLockSqlPrefix() {
		return "update MS.TBMSM02 set updateEmpl_MSM02=updateEmpl_MSM02 ";
	}

	/**
	 * 查詢、鎖定、監控資料
	 */	
	public msjcTBMSM02VO loadByPK4Update(int msM02Uid,int msM00Uid) throws SQLException, Exception {
		List aList = loadList4Update("WHERE   msM02Uid_MSM02="+msM02Uid+" and msM00Uid_MSM02="+msM00Uid+" ");
		if(aList.size()>0) {
			return (msjcTBMSM02VO)aList.get(0);
		}else {
			throw new dejcNotFoundException(this.sql) ;	
		}	
	}
	
	private String getSelectSqlPrefix() {
		return "select * from MS.TBMSM02 ";
	}
	
	private List loadList4Update(String conditionSql) throws SQLException, Exception {
		this.executeUpdate(getLockSqlPrefix()+conditionSql) ;
		this.sql=getSelectSqlPrefix()+conditionSql ;
		return monitor(this.eQueryAll( this.sql ));
	}
	/**
	  *監控資料
	  */
	private List monitor(List mstBMSM02VOList){
		for (int i=0; i<mstBMSM02VOList.size(); i++) {
			msjcTBMSM02VO mstBMSM02VO = (msjcTBMSM02VO)mstBMSM02VOList.get(i) ;
			mstBMSM02VO.monitor();
		}	
		return mstBMSM02VOList;
	}
	/**
	 * 以 VO 撈出 DB 資料，撈資料同時會鎖定
	 */
	public msjcTBMSM02VO loadByVO(msjcTBMSM02VO mstBMSM02VO) throws SQLException, Exception {
		return loadByPK4Update(mstBMSM02VO.getMsM02Uid(), mstBMSM02VO.getMsM00Uid());
	}
	/**
	 * 以 VO List 撈出 DB 資料，撈資料同時會鎖定
	 */
	public List loadByList(List mstBMSM02VOList) throws SQLException, Exception {
		List rsltList= new ArrayList(mstBMSM02VOList.size());
		for (Iterator iterator = mstBMSM02VOList.iterator(); iterator.hasNext();) {
			msjcTBMSM02VO mstBMSM02VO = (msjcTBMSM02VO) iterator.next();
			rsltList.add( loadByVO(mstBMSM02VO) ) ;
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
    public msjcTBMSM02VO getOneNotNull(dezcCriteria criteria) throws SQLException, Exception {
    	List voList = this.findByCriteria(criteria);
    	if (voList.size()==0) {
    		return new msjcTBMSM02VO();
    	}
    	return (msjcTBMSM02VO) voList.get(0);
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
     * @return mstBMSM02VO - 單筆資料
     * @exception SQLException - 資料庫錯誤
     * @since 103/06/25
     */
    public msjcTBMSM02VO findNextRcd(int msM02Uid,int msM00Uid)
            throws SQLException, Exception {
        String[] name = {"msM02Uid_MSM02, msM00Uid_MSM02"};
        Object[] value = {msM02Uid, msM00Uid+""};
        this.sql = dezcSqlUtils.getNextRcdSql(getTableName(), name ,value) ;
        return (msjcTBMSM02VO) this.eQuery(this.sql) ;
    } 
	
	/**
     * 以主鍵來查詢前筆資料
     * <p>
     * @return mstBMSM02VO - 單筆資料
     * @exception SQLException - 資料庫錯誤
     * @since 103/06/25
     */
    public msjcTBMSM02VO findPrevRcd(int msM02Uid,int msM00Uid)
            throws SQLException, Exception {
        String[] name = {"msM02Uid_MSM02, msM00Uid_MSM02"};
        Object[] value = {msM02Uid, msM00Uid+""};
        this.sql = dezcSqlUtils.getPrevRcdSql(getTableName(), name ,value) ;
        return (msjcTBMSM02VO) this.eQuery(this.sql) ;
    } 
    
    /** 取得 table name
     * <p>
     * @since 103/06/25
     */
    public final static String getTableName() {
        return "MS.TBMSM02" ;
    } 
    
//==^_^== ======= Don't Extend Your Code above , or All changes will lose after next Generating Code ===========  ==^_^== //
    public int removeAll() throws SQLException, Exception{
    	StringBuffer sql = new StringBuffer();
    	sql.append("delete from MS.TBMSM02");
    	int cnt = this.executeUpdate(sql.toString());
    	sql.setLength(0);
    	sql.append("ALTER TABLE MS.TBMSM02 ALTER COLUMN MSM02UID_MSM02 RESTART WITH 1");
    	cnt += this.executeUpdate(sql.toString());
    	return cnt;
    }
    public Map[] queryGroupByVendorNo() throws SQLException, Exception{
    	StringBuffer sql = new StringBuffer();
    	sql.append("select vendorNo_MSM02 from ms.tbmsm02 group by vendorNo_MSM02");
    	Map[] maps = super.myQueryAll(sql.toString());
    	return maps;
    }
} // end of Class msjcTBMSM02DAO