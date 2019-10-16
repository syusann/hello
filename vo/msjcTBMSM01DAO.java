/*----------------------------------------------------------------------------*/
/* msjcTBMSM01DAO		DAOTool Ver 10.0112 (INPUT FILE VERSION:2.0)
/*----------------------------------------------------------------------------*/
/* author : 
/* system : 
/* target : 供應商部門資料檔
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
 * 供應商部門資料檔 DAO.
 * <pre>
 * Table Name        : MS.TBMSM01
 * Table Description : 供應商部門資料檔
 * Value Object Name : msjcTBMSM01VO
 * </pre>
 * @version $Id$
 * @since msjcTBMSM01VO - 103/06/25
 * @author 
 */
public class msjcTBMSM01DAO extends dejcCommonDAO {
	public final static String AppId = "MSJCTBMSM01DAO" ;
	public final static String CLASS_VERSION = "$Revision: 1.3 $ $Date: 2014/06/25 03:30:06 $";

/*----------------------------------------------------------------------------*/
/* Creates new msjcTBMSM01DAO
/*----------------------------------------------------------------------------*/

	/**
	 * 建構子
	 * @param dsCom - 共用元件
	 * @since 103/06/25
	 */
	public msjcTBMSM01DAO(dsjccom dsCom) {
		super(dsCom, AppId);
	}
	/**
	 * 建構子
	 * @param dsCom - 共用元件
	 * @param con - 交易連接緒
	 * @since 103/06/25
	 */
	public msjcTBMSM01DAO(dsjccom dsCom, Connection con) {
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
	private String getFindByPKSql(int msM01Uid,int msM00Uid) {
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append("SELECT * FROM MS.TBMSM01");
		sqlStr.append(" WHERE  msM01Uid_MSM01="+msM01Uid+" and msM00Uid_MSM01="+msM00Uid+" ");
		return sqlStr.toString();
	}
	/**
	 * 以主鍵來查詢資料
	 * <p>
	 * @return mstBMSM01VO - 單筆資料
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public msjcTBMSM01VO findByPK(int msM01Uid,int msM00Uid)
			throws SQLException, Exception {
		this.sql = getFindByPKSql(msM01Uid,msM00Uid) ;
		return (msjcTBMSM01VO) this.eQuery(this.sql) ;
	}

	/**
	 * 以主鍵來查詢資料
	 * <p>
	 * @return mstBMSM01VO - 單筆資料
	 * @exception dejcNotFoundException - 若查不到資料時
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public msjcTBMSM01VO findByPKExp(int msM01Uid,int msM00Uid)
			throws dejcNotFoundException, SQLException, Exception {
		msjcTBMSM01VO mstBMSM01VO = findByPK(msM01Uid,msM00Uid) ;
		if (mstBMSM01VO == null) {
			throw new dejcNotFoundException(this.sql) ;
		}
		return mstBMSM01VO ;
	}

	/**
	 * 以主鍵來查詢資料
	 * <p>
	 * @param mstBMSM01VO - 由使用者所提供的 object, DAO 不另行 new
	 * @return mstBMSM01VO - 單筆資料
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public msjcTBMSM01VO findByPK(msjcTBMSM01VO mstBMSM01VO, int msM01Uid,int msM00Uid)
			throws SQLException,Exception {
		this.sql = getFindByPKSql(msM01Uid,msM00Uid) ;
		return (msjcTBMSM01VO) this.eQuery(mstBMSM01VO, this.sql) ;
	}

	/**
	 * 以主鍵來查詢資料
	 * <p>
	 * @param mstBMSM01VO - 由使用者所提供的 object, DAO 不另行 new
	 * @return mstBMSM01VO - 單筆資料
	 * @exception dejcNotFoundException - 若查不到資料時
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public msjcTBMSM01VO findByPKExp(msjcTBMSM01VO mstBMSM01VO, int msM01Uid,int msM00Uid)
			throws dejcNotFoundException, SQLException, Exception {
		mstBMSM01VO = findByPK(mstBMSM01VO, msM01Uid,msM00Uid) ;
		if (mstBMSM01VO == null) {
			throw new dejcNotFoundException(this.sql) ;
		}
		return mstBMSM01VO ;
	}

	/**
	 * 複合查詢資料
	 * <p>
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public Vector findByMasterKey(int msM01Uid)
			throws dejcNotFoundException, SQLException, Exception {
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append("SELECT * FROM MS.TBMSM01");
		sqlStr.append(" WHERE msM01Uid_MSM01="+msM01Uid+" ");
		sqlStr.append(" order by  ");
		this.sql = sqlStr.toString();
	  	return this.eQueryAll(this.sql) ;
	}
	/**
	 * 新增一筆資料 throws
	 * <p>
	 * @param mstBMSM01VO - Value Object
	 * @return int - 交易筆數
	 * @exception dejcEditException - Value Object 資料有誤
	 * @exception dejcNoUpdateException - 無任何資料新增
	 * @exception dejcDupException - 重複鍵值
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public int create(msjcTBMSM01VO mstBMSM01VO)
			throws dejcEditException, dejcNoUpdateException, dejcDupException, SQLException, Exception {
		if (mstBMSM01VO.verify() == false) {
			throw new dejcEditException(mstBMSM01VO.getMessage()) ;
		}
		if (mstBMSM01VO.isKeyOk() == false) {
			throw new dejcEditException("Value of key["+AppId+"].["+mstBMSM01VO.getMessage()+"] is null or empty!") ;
		}

		onBeforeCreate(mstBMSM01VO);
		this.sql = getCreateSql(mstBMSM01VO) ;

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
	
	private void onBeforeCreate(msjcTBMSM01VO mstBMSM01VO) {
		
	}
	
	public String getCreateSql(msjcTBMSM01VO mstBMSM01VO) {
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append("INSERT INTO MS.TBMSM01 (");
		sqlStr.append("msM01Uid_MSM01,msM00Uid_MSM01,compId_MSM01,vendorNo_MSM01,adty_MSM01,")
           .append("isDefault_MSM01,areaId_MSM01,postCode_MSM01,addr_MSM01,addrAll_MSM01,")
           .append("tel_MSM01,fax_MSM01,telex_MSM01,contact_MSM01,mobile_MSM01,")
           .append("email_MSM01,web_MSM01,publicClass_MSM01,vendorType_MSM01,crcy_MSM01,")
           .append("paidType_MSM01,bankCode_MSM01,accountNo_MSM01,bankName_MSM01,bankAddr_MSM01,")
           .append("createDate_MSM01,createTime_MSM01,createEmplComp_MSM01,createEmpl_MSM01,updateDate_MSM01,")
           .append("updateTime_MSM01,updateEmplComp_MSM01,updateEmpl_MSM01");
		sqlStr.append(") VALUES (");
		sqlStr.append("").append(mstBMSM01VO.getMsM01UidDEF()).append(",").append(mstBMSM01VO.getMsM00Uid()).append(",'").append(mstBMSM01VO.getCompIdS()).append("','").append(mstBMSM01VO.getVendorNoS());
		sqlStr.append("','").append(mstBMSM01VO.getAdtyS()).append("','").append(mstBMSM01VO.getIsDefaultS()).append("','").append(mstBMSM01VO.getAreaIdS());
		sqlStr.append("','").append(mstBMSM01VO.getPostCodeS()).append("','").append(mstBMSM01VO.getAddrS()).append("','").append(mstBMSM01VO.getAddrAllS());
		sqlStr.append("','").append(mstBMSM01VO.getTelS()).append("','").append(mstBMSM01VO.getFaxS()).append("','").append(mstBMSM01VO.getTelexS());
		sqlStr.append("','").append(mstBMSM01VO.getContactS()).append("','").append(mstBMSM01VO.getMobileS()).append("','").append(mstBMSM01VO.getEmailS());
		sqlStr.append("','").append(mstBMSM01VO.getWebS()).append("','").append(mstBMSM01VO.getPublicClassS()).append("','").append(mstBMSM01VO.getVendorTypeS());
		sqlStr.append("','").append(mstBMSM01VO.getCrcyS()).append("','").append(mstBMSM01VO.getPaidTypeS()).append("','").append(mstBMSM01VO.getBankCodeS());
		sqlStr.append("','").append(mstBMSM01VO.getAccountNoS()).append("','").append(mstBMSM01VO.getBankNameS()).append("','").append(mstBMSM01VO.getBankAddrS());
		sqlStr.append("','").append(mstBMSM01VO.getCreateDateS()).append("','").append(mstBMSM01VO.getCreateTimeS()).append("','").append(mstBMSM01VO.getCreateEmplCompS());
		sqlStr.append("','").append(mstBMSM01VO.getCreateEmplS()).append("','").append(mstBMSM01VO.getUpdateDateS()).append("','").append(mstBMSM01VO.getUpdateTimeS());
		sqlStr.append("','").append(mstBMSM01VO.getUpdateEmplCompS()).append("','").append(mstBMSM01VO.getUpdateEmplS()).append("'");
		sqlStr.append(")");	
		this.sql = sqlStr.toString() ;
		return this.sql;
	}

	/**
	 * 新增多筆資料 throws
	 * <p>
	 * @param mstBMSM01VOList - Value Object
	 * @return int - 交易筆數
	 * @exception dejcEditException - Value Object 資料有誤
	 * @exception dejcNoUpdateException - 無任何資料新增
	 * @exception dejcDupException - 重複鍵值
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public int createList(List mstBMSM01VOList)
			throws dejcEditException, dejcNoUpdateException, dejcDupException, SQLException, Exception {
		int count = 0 ;
		for (int i=0; i<mstBMSM01VOList.size(); i++) {
			msjcTBMSM01VO mstBMSM01VO = (msjcTBMSM01VO)mstBMSM01VOList.get(i) ;
			count = count+this.create(mstBMSM01VO) ;
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
	public int remove(int msM01Uid,int msM00Uid)
			throws SQLException, Exception {		
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append("DELETE FROM MS.TBMSM01");
		sqlStr.append(" WHERE  msM01Uid_MSM01="+msM01Uid+" and msM00Uid_MSM01="+msM00Uid+" " );
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
	public int removeExp(int msM01Uid,int msM00Uid)
			throws dejcNoUpdateException, SQLException, Exception {
		int rslt = remove(msM01Uid,msM00Uid) ;
		if (rslt == 0) {
			throw new dejcNoUpdateException(this.sql) ;
		}
		return rslt ;
	}

	/**
	 * 刪除資料 throws
	 * <p>
	 * @param mstBMSM01VO 欲刪除的資料物件
	 * @return int - 交易筆數
	 * @exception dejcNoUpdateException - 無任何資料被刪除
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public int removeExp(msjcTBMSM01VO mstBMSM01VO)
			throws dejcNoUpdateException, SQLException, Exception {
		return removeExp(mstBMSM01VO.getMsM01Uid(), mstBMSM01VO.getMsM00Uid()) ;
	}

	/**
	 * 刪除多筆資料 throws
	 * <p>
	 * @param mstBMSM01VOList 欲刪除的資料物件
	 * @return int - 交易筆數
	 * @exception dejcNoUpdateException - 無任何資料被刪除
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public int removeList(List mstBMSM01VOList)
			throws dejcNoUpdateException, SQLException, Exception {
		int count = 0 ;
		for (int i=0; i<mstBMSM01VOList.size(); i++) {
			msjcTBMSM01VO mstBMSM01VO = (msjcTBMSM01VO)mstBMSM01VOList.get(i) ;
			count = count+this.remove(mstBMSM01VO.getMsM01Uid(), mstBMSM01VO.getMsM00Uid()) ;
		}
		return count ;
	}

	/**
	 * 刪除資料 throws
	 * <p>
	 * @param mstBMSM01VO 欲刪除的資料物件
	 * @return int - 交易筆數
	 * @exception dejcNoUpdateException - 無任何資料被刪除
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public int remove(msjcTBMSM01VO mstBMSM01VO)
			throws SQLException, Exception {
		return remove(mstBMSM01VO.getMsM01Uid(), mstBMSM01VO.getMsM00Uid()) ;
	}

	/**
	 * 修改資料
	 * <p>
	 * @return int - 交易筆數
	 * @exception dejcEditException - Value Object 資料有誤
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public int update(msjcTBMSM01VO mstBMSM01VO)
			throws dejcEditException, SQLException, Exception {
		if (mstBMSM01VO.verify() == false) {
			throw new dejcEditException(mstBMSM01VO.getMessage()) ;
		}
		if(mstBMSM01VO.hasEditFields()) {
			return updateEditFields(mstBMSM01VO);
		} else {
			return this.executeUpdate(getUpdateSql(mstBMSM01VO) ) ;
		}
	}

	public String getUpdateSql(msjcTBMSM01VO mstBMSM01VO) {
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append("UPDATE MS.TBMSM01");
		sqlStr.append(" SET compId_MSM01='").append(mstBMSM01VO.getCompIdS()).append("',vendorNo_MSM01='").append(mstBMSM01VO.getVendorNoS()).append("',adty_MSM01='").append(mstBMSM01VO.getAdtyS()).append("',isDefault_MSM01='").append(mstBMSM01VO.getIsDefaultS()).append("',areaId_MSM01='").append(mstBMSM01VO.getAreaIdS()).append("',");
		sqlStr.append("postCode_MSM01='").append(mstBMSM01VO.getPostCodeS()).append("',addr_MSM01='").append(mstBMSM01VO.getAddrS()).append("',addrAll_MSM01='").append(mstBMSM01VO.getAddrAllS()).append("',tel_MSM01='").append(mstBMSM01VO.getTelS()).append("',fax_MSM01='").append(mstBMSM01VO.getFaxS()).append("',");
		sqlStr.append("telex_MSM01='").append(mstBMSM01VO.getTelexS()).append("',contact_MSM01='").append(mstBMSM01VO.getContactS()).append("',mobile_MSM01='").append(mstBMSM01VO.getMobileS()).append("',email_MSM01='").append(mstBMSM01VO.getEmailS()).append("',web_MSM01='").append(mstBMSM01VO.getWebS()).append("',");
		sqlStr.append("publicClass_MSM01='").append(mstBMSM01VO.getPublicClassS()).append("',vendorType_MSM01='").append(mstBMSM01VO.getVendorTypeS()).append("',crcy_MSM01='").append(mstBMSM01VO.getCrcyS()).append("',paidType_MSM01='").append(mstBMSM01VO.getPaidTypeS()).append("',bankCode_MSM01='").append(mstBMSM01VO.getBankCodeS()).append("',");
		sqlStr.append("accountNo_MSM01='").append(mstBMSM01VO.getAccountNoS()).append("',bankName_MSM01='").append(mstBMSM01VO.getBankNameS()).append("',bankAddr_MSM01='").append(mstBMSM01VO.getBankAddrS()).append("',createDate_MSM01='").append(mstBMSM01VO.getCreateDateS()).append("',createTime_MSM01='").append(mstBMSM01VO.getCreateTimeS()).append("',");
		sqlStr.append("createEmplComp_MSM01='").append(mstBMSM01VO.getCreateEmplCompS()).append("',createEmpl_MSM01='").append(mstBMSM01VO.getCreateEmplS()).append("',updateDate_MSM01='").append(mstBMSM01VO.getUpdateDateS()).append("',updateTime_MSM01='").append(mstBMSM01VO.getUpdateTimeS()).append("',updateEmplComp_MSM01='").append(mstBMSM01VO.getUpdateEmplCompS()).append("',");
		sqlStr.append("updateEmpl_MSM01='").append(mstBMSM01VO.getUpdateEmplS()).append("' ");
		sqlStr.append(" WHERE  msM01Uid_MSM01=" + mstBMSM01VO.getMsM01Uid() + " and msM00Uid_MSM01=" + mstBMSM01VO.getMsM00Uid() + " ");
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
	public int updateFldsNotDef(msjcTBMSM01VO mstBMSM01VO)
			throws dejcEditException, SQLException, Exception {
		if (mstBMSM01VO.verify() == false) {
			throw new dejcEditException(mstBMSM01VO.getMessage()) ;
		}
		if (mstBMSM01VO.isKeyOk() == false) {
			throw new dejcEditException("primary key["+mstBMSM01VO.getMessage()+"] of ["+AppId+"] is empty!") ;
		}		
		StringBuffer updateFlds = new StringBuffer();
		if (mstBMSM01VO.getCompId() !=null  && !mstBMSM01VO.getCompId().equals("") ) {
			updateFlds.append("compId_MSM01='").append( mstBMSM01VO.getCompIdS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getVendorNo() !=null  && !mstBMSM01VO.getVendorNo().equals("") ) {
			updateFlds.append("vendorNo_MSM01='").append( mstBMSM01VO.getVendorNoS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getAdty() !=null  && !mstBMSM01VO.getAdty().equals("") ) {
			updateFlds.append("adty_MSM01='").append( mstBMSM01VO.getAdtyS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getIsDefault() !=null  && !mstBMSM01VO.getIsDefault().equals("") ) {
			updateFlds.append("isDefault_MSM01='").append( mstBMSM01VO.getIsDefaultS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getAreaId() !=null  && !mstBMSM01VO.getAreaId().equals("") ) {
			updateFlds.append("areaId_MSM01='").append( mstBMSM01VO.getAreaIdS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getPostCode() !=null  && !mstBMSM01VO.getPostCode().equals("") ) {
			updateFlds.append("postCode_MSM01='").append( mstBMSM01VO.getPostCodeS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getAddr() !=null  && !mstBMSM01VO.getAddr().equals("") ) {
			updateFlds.append("addr_MSM01='").append( mstBMSM01VO.getAddrS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getAddrAll() !=null  && !mstBMSM01VO.getAddrAll().equals("") ) {
			updateFlds.append("addrAll_MSM01='").append( mstBMSM01VO.getAddrAllS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getTel() !=null  && !mstBMSM01VO.getTel().equals("") ) {
			updateFlds.append("tel_MSM01='").append( mstBMSM01VO.getTelS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getFax() !=null  && !mstBMSM01VO.getFax().equals("") ) {
			updateFlds.append("fax_MSM01='").append( mstBMSM01VO.getFaxS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getTelex() !=null  && !mstBMSM01VO.getTelex().equals("") ) {
			updateFlds.append("telex_MSM01='").append( mstBMSM01VO.getTelexS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getContact() !=null  && !mstBMSM01VO.getContact().equals("") ) {
			updateFlds.append("contact_MSM01='").append( mstBMSM01VO.getContactS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getMobile() !=null  && !mstBMSM01VO.getMobile().equals("") ) {
			updateFlds.append("mobile_MSM01='").append( mstBMSM01VO.getMobileS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getEmail() !=null  && !mstBMSM01VO.getEmail().equals("") ) {
			updateFlds.append("email_MSM01='").append( mstBMSM01VO.getEmailS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getWeb() !=null  && !mstBMSM01VO.getWeb().equals("") ) {
			updateFlds.append("web_MSM01='").append( mstBMSM01VO.getWebS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getPublicClass() !=null  && !mstBMSM01VO.getPublicClass().equals("") ) {
			updateFlds.append("publicClass_MSM01='").append( mstBMSM01VO.getPublicClassS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getVendorType() !=null  && !mstBMSM01VO.getVendorType().equals("") ) {
			updateFlds.append("vendorType_MSM01='").append( mstBMSM01VO.getVendorTypeS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getCrcy() !=null  && !mstBMSM01VO.getCrcy().equals("") ) {
			updateFlds.append("crcy_MSM01='").append( mstBMSM01VO.getCrcyS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getPaidType() !=null  && !mstBMSM01VO.getPaidType().equals("") ) {
			updateFlds.append("paidType_MSM01='").append( mstBMSM01VO.getPaidTypeS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getBankCode() !=null  && !mstBMSM01VO.getBankCode().equals("") ) {
			updateFlds.append("bankCode_MSM01='").append( mstBMSM01VO.getBankCodeS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getAccountNo() !=null  && !mstBMSM01VO.getAccountNo().equals("") ) {
			updateFlds.append("accountNo_MSM01='").append( mstBMSM01VO.getAccountNoS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getBankName() !=null  && !mstBMSM01VO.getBankName().equals("") ) {
			updateFlds.append("bankName_MSM01='").append( mstBMSM01VO.getBankNameS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getBankAddr() !=null  && !mstBMSM01VO.getBankAddr().equals("") ) {
			updateFlds.append("bankAddr_MSM01='").append( mstBMSM01VO.getBankAddrS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getCreateDate() !=null  && !mstBMSM01VO.getCreateDate().equals("") ) {
			updateFlds.append("createDate_MSM01='").append( mstBMSM01VO.getCreateDateS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getCreateTime() !=null  && !mstBMSM01VO.getCreateTime().equals("") ) {
			updateFlds.append("createTime_MSM01='").append( mstBMSM01VO.getCreateTimeS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getCreateEmplComp() !=null  && !mstBMSM01VO.getCreateEmplComp().equals("") ) {
			updateFlds.append("createEmplComp_MSM01='").append( mstBMSM01VO.getCreateEmplCompS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getCreateEmpl() !=null  && !mstBMSM01VO.getCreateEmpl().equals("") ) {
			updateFlds.append("createEmpl_MSM01='").append( mstBMSM01VO.getCreateEmplS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getUpdateDate() !=null  && !mstBMSM01VO.getUpdateDate().equals("") ) {
			updateFlds.append("updateDate_MSM01='").append( mstBMSM01VO.getUpdateDateS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getUpdateTime() !=null  && !mstBMSM01VO.getUpdateTime().equals("") ) {
			updateFlds.append("updateTime_MSM01='").append( mstBMSM01VO.getUpdateTimeS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getUpdateEmplComp() !=null  && !mstBMSM01VO.getUpdateEmplComp().equals("") ) {
			updateFlds.append("updateEmplComp_MSM01='").append( mstBMSM01VO.getUpdateEmplCompS() ).append("'").append(',') ;
		} 
		if (mstBMSM01VO.getUpdateEmpl() !=null  && !mstBMSM01VO.getUpdateEmpl().equals("") ) {
			updateFlds.append("updateEmpl_MSM01='").append( mstBMSM01VO.getUpdateEmplS() ).append("'").append(',') ;
		} 
		if(updateFlds.length()==0) {
			return 0;
		}	
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append("UPDATE MS.TBMSM01");
		sqlStr.append(" SET ").append( updateFlds.substring(0, updateFlds.length()-1) );
		sqlStr.append(" WHERE  msM01Uid_MSM01=" + mstBMSM01VO.getMsM01Uid() + " and msM00Uid_MSM01=" + mstBMSM01VO.getMsM00Uid() + " ");
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
	public int updateExp(msjcTBMSM01VO mstBMSM01VO)
			throws dejcEditException, dejcNoUpdateException, SQLException, Exception {
		int rslt = update(mstBMSM01VO) ;
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
	public int updateCreateList(List mstBMSM01VOList)
			throws dejcEditException, dejcNoUpdateException, SQLException, Exception {
		int count = 0 ;
		for (int i=0; i<mstBMSM01VOList.size(); i++) {
			msjcTBMSM01VO mstBMSM01VO = (msjcTBMSM01VO)mstBMSM01VOList.get(i) ;
			int updateCount = update(mstBMSM01VO) ;
			if ( updateCount==0 ) {
				count += create(mstBMSM01VO) ;
			} else {
				count += updateCount ;
			}
		}
		return count ;
	}

	/**
	 * 修改多筆資料 throws
	 * <p>
	 * @param mstBMSM01VOList 欲修改的資料物件
	 * @return int - 交易筆數
	 * @exception dejcNoUpdateException - 無任何資料被修改
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	public int updateList(List mstBMSM01VOList)
			throws dejcNoUpdateException, SQLException, Exception {
		int count = 0 ;
		for (int i=0; i<mstBMSM01VOList.size(); i++) {
			msjcTBMSM01VO mstBMSM01VO = (msjcTBMSM01VO)mstBMSM01VOList.get(i) ;
			count = count+this.updateExp(mstBMSM01VO) ;
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
		sqlStr.append("INSERT INTO MS.TBMSM01  (");
		sqlStr.append("msM01Uid_MSM01,msM00Uid_MSM01,compId_MSM01,vendorNo_MSM01,adty_MSM01,")
           .append("isDefault_MSM01,areaId_MSM01,postCode_MSM01,addr_MSM01,addrAll_MSM01,")
           .append("tel_MSM01,fax_MSM01,telex_MSM01,contact_MSM01,mobile_MSM01,")
           .append("email_MSM01,web_MSM01,publicClass_MSM01,vendorType_MSM01,crcy_MSM01,")
           .append("paidType_MSM01,bankCode_MSM01,accountNo_MSM01,bankName_MSM01,bankAddr_MSM01,")
           .append("createDate_MSM01,createTime_MSM01,createEmplComp_MSM01,createEmpl_MSM01,updateDate_MSM01,")
           .append("updateTime_MSM01,updateEmplComp_MSM01,updateEmpl_MSM01");
		sqlStr.append(") VALUES (");
		sqlStr.append("?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,")
           .append("?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,")
           .append("?,?,?");
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
		sqlStr.append("UPDATE MS.TBMSM01");
		sqlStr.append(" SET compId_MSM01=?,vendorNo_MSM01=?,adty_MSM01=?,isDefault_MSM01=?,areaId_MSM01=?,")
           .append("postCode_MSM01=?,addr_MSM01=?,addrAll_MSM01=?,tel_MSM01=?,fax_MSM01=?,")
           .append("telex_MSM01=?,contact_MSM01=?,mobile_MSM01=?,email_MSM01=?,web_MSM01=?,")
           .append("publicClass_MSM01=?,vendorType_MSM01=?,crcy_MSM01=?,paidType_MSM01=?,bankCode_MSM01=?,")
           .append("accountNo_MSM01=?,bankName_MSM01=?,bankAddr_MSM01=?,createDate_MSM01=?,createTime_MSM01=?,")
           .append("createEmplComp_MSM01=?,createEmpl_MSM01=?,updateDate_MSM01=?,updateTime_MSM01=?,updateEmplComp_MSM01=?,")
           .append("updateEmpl_MSM01=? ");
		sqlStr.append(" WHERE  msM01Uid_MSM01=? and msM00Uid_MSM01=? ");
		return sqlStr.toString();
    }

	/**
	 * 執行 addDeleteBatch(Object obj) 時需要用到的 sql
	 * 刪除資料的 prepareStatement sql<br>
	 * 此方法是覆寫 commonDAO 的方法
	 */
    protected String getDeletePreSql() throws SQLException {
		StringBuffer sqlStr = new StringBuffer();
		sqlStr.append("DELETE FROM MS.TBMSM01");
		sqlStr.append(" WHERE  msM01Uid_MSM01=? and msM00Uid_MSM01=? " );
		return sqlStr.toString();
    }

	/**
	 * 執行 addCreateBatch(Object obj) 時需要呼叫的方法
	 */
    protected void prepareCreate(Object obj) throws SQLException {
    	msjcTBMSM01VO mstBMSM01VO = (msjcTBMSM01VO)obj ;
		pstmt.setInt(1, mstBMSM01VO.getMsM01Uid()) ;
		pstmt.setInt(2, mstBMSM01VO.getMsM00Uid()) ;
		pstmt.setString(3, mstBMSM01VO.getCompId()) ;
		pstmt.setString(4, mstBMSM01VO.getVendorNo()) ;
		pstmt.setString(5, mstBMSM01VO.getAdty()) ;
		pstmt.setString(6, mstBMSM01VO.getIsDefault()) ;
		pstmt.setString(7, mstBMSM01VO.getAreaId()) ;
		pstmt.setString(8, mstBMSM01VO.getPostCode()) ;
		pstmt.setString(9, mstBMSM01VO.getAddr()) ;
		pstmt.setString(10, mstBMSM01VO.getAddrAll()) ;
		pstmt.setString(11, mstBMSM01VO.getTel()) ;
		pstmt.setString(12, mstBMSM01VO.getFax()) ;
		pstmt.setString(13, mstBMSM01VO.getTelex()) ;
		pstmt.setString(14, mstBMSM01VO.getContact()) ;
		pstmt.setString(15, mstBMSM01VO.getMobile()) ;
		pstmt.setString(16, mstBMSM01VO.getEmail()) ;
		pstmt.setString(17, mstBMSM01VO.getWeb()) ;
		pstmt.setString(18, mstBMSM01VO.getPublicClass()) ;
		pstmt.setString(19, mstBMSM01VO.getVendorType()) ;
		pstmt.setString(20, mstBMSM01VO.getCrcy()) ;
		pstmt.setString(21, mstBMSM01VO.getPaidType()) ;
		pstmt.setString(22, mstBMSM01VO.getBankCode()) ;
		pstmt.setString(23, mstBMSM01VO.getAccountNo()) ;
		pstmt.setString(24, mstBMSM01VO.getBankName()) ;
		pstmt.setString(25, mstBMSM01VO.getBankAddr()) ;
		pstmt.setString(26, mstBMSM01VO.getCreateDate()) ;
		pstmt.setString(27, mstBMSM01VO.getCreateTime()) ;
		pstmt.setString(28, mstBMSM01VO.getCreateEmplComp()) ;
		pstmt.setString(29, mstBMSM01VO.getCreateEmpl()) ;
		pstmt.setString(30, mstBMSM01VO.getUpdateDate()) ;
		pstmt.setString(31, mstBMSM01VO.getUpdateTime()) ;
		pstmt.setString(32, mstBMSM01VO.getUpdateEmplComp()) ;
		pstmt.setString(33, mstBMSM01VO.getUpdateEmpl()) ;
    }

	/**
	 * 執行 addUpdateBatch(Object obj) 時需要呼叫的方法
	 */
    protected void prepareUpdate(Object obj) throws SQLException {
    	msjcTBMSM01VO mstBMSM01VO = (msjcTBMSM01VO)obj ;
		pstmt.setString(1, mstBMSM01VO.getCompId()) ;
		pstmt.setString(2, mstBMSM01VO.getVendorNo()) ;
		pstmt.setString(3, mstBMSM01VO.getAdty()) ;
		pstmt.setString(4, mstBMSM01VO.getIsDefault()) ;
		pstmt.setString(5, mstBMSM01VO.getAreaId()) ;
		pstmt.setString(6, mstBMSM01VO.getPostCode()) ;
		pstmt.setString(7, mstBMSM01VO.getAddr()) ;
		pstmt.setString(8, mstBMSM01VO.getAddrAll()) ;
		pstmt.setString(9, mstBMSM01VO.getTel()) ;
		pstmt.setString(10, mstBMSM01VO.getFax()) ;
		pstmt.setString(11, mstBMSM01VO.getTelex()) ;
		pstmt.setString(12, mstBMSM01VO.getContact()) ;
		pstmt.setString(13, mstBMSM01VO.getMobile()) ;
		pstmt.setString(14, mstBMSM01VO.getEmail()) ;
		pstmt.setString(15, mstBMSM01VO.getWeb()) ;
		pstmt.setString(16, mstBMSM01VO.getPublicClass()) ;
		pstmt.setString(17, mstBMSM01VO.getVendorType()) ;
		pstmt.setString(18, mstBMSM01VO.getCrcy()) ;
		pstmt.setString(19, mstBMSM01VO.getPaidType()) ;
		pstmt.setString(20, mstBMSM01VO.getBankCode()) ;
		pstmt.setString(21, mstBMSM01VO.getAccountNo()) ;
		pstmt.setString(22, mstBMSM01VO.getBankName()) ;
		pstmt.setString(23, mstBMSM01VO.getBankAddr()) ;
		pstmt.setString(24, mstBMSM01VO.getCreateDate()) ;
		pstmt.setString(25, mstBMSM01VO.getCreateTime()) ;
		pstmt.setString(26, mstBMSM01VO.getCreateEmplComp()) ;
		pstmt.setString(27, mstBMSM01VO.getCreateEmpl()) ;
		pstmt.setString(28, mstBMSM01VO.getUpdateDate()) ;
		pstmt.setString(29, mstBMSM01VO.getUpdateTime()) ;
		pstmt.setString(30, mstBMSM01VO.getUpdateEmplComp()) ;
		pstmt.setString(31, mstBMSM01VO.getUpdateEmpl()) ;
		pstmt.setInt(32, mstBMSM01VO.getMsM01Uid()) ;
		pstmt.setInt(33, mstBMSM01VO.getMsM00Uid()) ;
    }

	/**
	 * 執行 addDeleteBatch(Object obj) 時需要呼叫的方法
	 */
    protected void prepareDelete(Object obj) throws SQLException {
    	msjcTBMSM01VO mstBMSM01VO = (msjcTBMSM01VO)obj ;
		pstmt.setInt(1, mstBMSM01VO.getMsM01Uid()) ;
		pstmt.setInt(2, mstBMSM01VO.getMsM00Uid()) ;
    }

	/**
	 * 實作父類別
	 * <p>
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	protected Object getObjFromRS(ResultSet rs) throws SQLException,Exception {
		return msjcTBMSM01VO.getInstanceByName(rs) ;
	}

	/**
	 * 實作父類別, 使用 user 傳進來的 object, 不另行 new , 以節省執行時間及記憶體<br>
	 * 適合臨時性的資料運算(通常在運算大量資料時，一些欄位需要暫存在 value object)<br>
	 * 此方法只會在執行 findByPK(Object obj,int msM01Uid,int msM00Uid) 時才被呼叫。
	 * <p>
	 * @exception SQLException - 資料庫錯誤
	 * @since 103/06/25
	 */
	protected Object getObjFromRS(Object obj, ResultSet rs) throws SQLException,Exception {
		return msjcTBMSM01VO.getInstanceByName(obj, rs) ;
	}
	
	/**
	  * 備份方法 2009.03.26 新增
	  */
	public int backup(String tableName, msjcTBMSM01VO mstBMSM01VO) throws SQLException, Exception {
		this.sql = getCreateSql(mstBMSM01VO).replaceFirst(" MS.TBMSM01 "," "+tableName+" "); 
		return this.executeUpdate(this.sql) ;
	} 
	public int backup(String tableName, ResultSet rs) throws SQLException, Exception {
		return backup(tableName, msjcTBMSM01VO.getInstanceByName(rs) ) ;
	} 

	public String getUpdateEditFieldsPartialSql(msjcTBMSM01VO mstBMSM01VO)  {
		if( mstBMSM01VO.getEditColumns()==null ) {
			return "";
		}
		return dezcSqlUtils.genUpdateFields(  mstBMSM01VO.getEditColumns() );		
	}
	/**
	  * 修改有動過的欄位，此方法要有效請確保有先執行  msjcTBMSM01VO.monitor() 
	  */
	public String getUpdateEditFieldsSql(msjcTBMSM01VO mstBMSM01VO) throws SQLException, Exception {
		String updSql =getUpdateEditFieldsPartialSql(mstBMSM01VO) ;
		if(updSql.equals("")){
			return "";
		}
		return "update MS.TBMSM01 set "+updSql+" where   msM01Uid_MSM01=" + mstBMSM01VO.getMsM01Uid() + " and msM00Uid_MSM01=" + mstBMSM01VO.getMsM00Uid() + " ";
	}
	/**
	  * 修改有動過的欄位，此方法要有效請確保有先執行  msjcTBMSM01VO.monitor() 
	  */
	public int updateEditFields(msjcTBMSM01VO mstBMSM01VO) throws SQLException, Exception {
		this.sql=getUpdateEditFieldsSql(mstBMSM01VO);
		if(this.sql.equals("")){
			// 2010.03.02 從0改為-1，以識別是否有執行
			return -1;
		}
		return this.executeUpdate(getUpdateEditFieldsSql(mstBMSM01VO)) ;
	}
	/**
	 * 假update的sql，找最後一個欄位來假update
	 */	
	private String getLockSqlPrefix() {
		return "update MS.TBMSM01 set updateEmpl_MSM01=updateEmpl_MSM01 ";
	}

	/**
	 * 查詢、鎖定、監控資料
	 */	
	public msjcTBMSM01VO loadByPK4Update(int msM01Uid,int msM00Uid) throws SQLException, Exception {
		List aList = loadList4Update("WHERE   msM01Uid_MSM01="+msM01Uid+" and msM00Uid_MSM01="+msM00Uid+" ");
		if(aList.size()>0) {
			return (msjcTBMSM01VO)aList.get(0);
		}else {
			throw new dejcNotFoundException(this.sql) ;	
		}	
	}
	
	private String getSelectSqlPrefix() {
		return "select * from MS.TBMSM01 ";
	}
	
	private List loadList4Update(String conditionSql) throws SQLException, Exception {
		this.executeUpdate(getLockSqlPrefix()+conditionSql) ;
		this.sql=getSelectSqlPrefix()+conditionSql ;
		return monitor(this.eQueryAll( this.sql ));
	}
	/**
	  *監控資料
	  */
	private List monitor(List mstBMSM01VOList){
		for (int i=0; i<mstBMSM01VOList.size(); i++) {
			msjcTBMSM01VO mstBMSM01VO = (msjcTBMSM01VO)mstBMSM01VOList.get(i) ;
			mstBMSM01VO.monitor();
		}	
		return mstBMSM01VOList;
	}
	/**
	 * 以 VO 撈出 DB 資料，撈資料同時會鎖定
	 */
	public msjcTBMSM01VO loadByVO(msjcTBMSM01VO mstBMSM01VO) throws SQLException, Exception {
		return loadByPK4Update(mstBMSM01VO.getMsM01Uid(), mstBMSM01VO.getMsM00Uid());
	}
	/**
	 * 以 VO List 撈出 DB 資料，撈資料同時會鎖定
	 */
	public List loadByList(List mstBMSM01VOList) throws SQLException, Exception {
		List rsltList= new ArrayList(mstBMSM01VOList.size());
		for (Iterator iterator = mstBMSM01VOList.iterator(); iterator.hasNext();) {
			msjcTBMSM01VO mstBMSM01VO = (msjcTBMSM01VO) iterator.next();
			rsltList.add( loadByVO(mstBMSM01VO) ) ;
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
    public msjcTBMSM01VO getOneNotNull(dezcCriteria criteria) throws SQLException, Exception {
    	List voList = this.findByCriteria(criteria);
    	if (voList.size()==0) {
    		return new msjcTBMSM01VO();
    	}
    	return (msjcTBMSM01VO) voList.get(0);
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
     * @return mstBMSM01VO - 單筆資料
     * @exception SQLException - 資料庫錯誤
     * @since 103/06/25
     */
    public msjcTBMSM01VO findNextRcd(int msM01Uid,int msM00Uid)
            throws SQLException, Exception {
        String[] name = {"msM01Uid_MSM01, msM00Uid_MSM01"};
        Object[] value = {msM01Uid, msM00Uid+""};
        this.sql = dezcSqlUtils.getNextRcdSql(getTableName(), name ,value) ;
        return (msjcTBMSM01VO) this.eQuery(this.sql) ;
    } 
	
	/**
     * 以主鍵來查詢前筆資料
     * <p>
     * @return mstBMSM01VO - 單筆資料
     * @exception SQLException - 資料庫錯誤
     * @since 103/06/25
     */
    public msjcTBMSM01VO findPrevRcd(int msM01Uid,int msM00Uid)
            throws SQLException, Exception {
        String[] name = {"msM01Uid_MSM01, msM00Uid_MSM01"};
        Object[] value = {msM01Uid, msM00Uid+""};
        this.sql = dezcSqlUtils.getPrevRcdSql(getTableName(), name ,value) ;
        return (msjcTBMSM01VO) this.eQuery(this.sql) ;
    } 
    
    /** 取得 table name
     * <p>
     * @since 103/06/25
     */
    public final static String getTableName() {
        return "MS.TBMSM01" ;
    } 
    
//==^_^== ======= Don't Extend Your Code above , or All changes will lose after next Generating Code ===========  ==^_^== //
    public int removeAll() throws SQLException, Exception{
    	StringBuffer sql = new StringBuffer();
    	sql.append("delete from MS.TBMSM01");
    	int cnt = this.executeUpdate(sql.toString());
    	sql.setLength(0);
    	sql.append("ALTER TABLE MS.TBMSM01 ALTER COLUMN MSM01UID_MSM01 RESTART WITH 1");
    	cnt += this.executeUpdate(sql.toString());
    	return cnt;
    }
} // end of Class msjcTBMSM01DAO