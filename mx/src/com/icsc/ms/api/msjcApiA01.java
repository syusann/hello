package com.icsc.ms.api;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

import org.apache.commons.lang.StringUtils;

import com.icsc.dpms.de.dejc312;
import com.icsc.dpms.de.dejcMyException;
import com.icsc.dpms.de.dao.dejcNotFoundException;
import com.icsc.dpms.de.dez.sql.dezcCriteria;
import com.icsc.dpms.de.dez.structs.func.dezcTransactionPool;
import com.icsc.dpms.ds.dsjccom;
import com.icsc.ms.bean.msjcVendorBean;
import com.icsc.ms.bean.msjcVendorPayBean;
import com.icsc.ms.dao.msjcTBMSM00DAO;
import com.icsc.ms.dao.msjcTBMSM00VO;
import com.icsc.ms.dao.msjcTBMSM01DAO;
import com.icsc.ms.dao.msjcTBMSM01VO;
import com.icsc.ms.util.msjcUtility;

public class msjcApiA01 {
	public static String AppId = "msjcApiA01".toUpperCase();
	public dsjccom dsCom;
//	public Connection con;
	private static Connection conn;
	private static String sql;
	public msjcApiA01(dsjccom dsCom){
		this.dsCom = dsCom;
	}
	public msjcApiA01(dsjccom dsCom,Connection con){
		this.dsCom = dsCom;
//		this.con = con;
		conn = con;
	}
	/**
	 * 取得供應商名稱
	 * @param dsCom
	 * @param compId
	 * @param vendorNo
	 * @return
	 * @throws Exception
	 */
	public static String getVendorName(dsjccom dsCom,String compId,String vendorNo) throws  Exception {
		if (conn==null) {
			System.out.println("@@begin: conn=null");
		}
		if (conn!=null) {
			if (conn.isClosed())
			System.out.println("@@begin: conn=closed");
		}
		
		msjcTBMSM00VO vo = getMs00vo(dsCom,conn,compId,vendorNo);
		if(vo.isKeyOk()){
			if (conn==null) {
				System.out.println("@@end1: conn=null");
			}
			if (conn!=null) {
				if (conn.isClosed())
				System.out.println("@@end1: conn=closed");
			}
			return getVendorName(vo);
		}
		if (conn==null) {
			System.out.println("@@end2: conn=null");
		}
		if (conn!=null) {
			if (conn.isClosed())
			System.out.println("@@end2: conn=closed");
		}
		return "";
	}
	/**
	 * 取得供應商名稱
	 * @param dsCom
	 * @param compId
	 * @param vendorNo
	 * @return
	 * @throws dejcNotFoundException
	 * @throws SQLException
	 * @throws Exception
	 */
    public static String getVendorNameExp(dsjccom dsCom,String compId,String vendorNo)  throws dejcNotFoundException,SQLException, Exception {
    	msjcTBMSM00VO vo = getMs00vo(dsCom,conn,compId,vendorNo);
		if(vo.isKeyOk()){
			return getVendorName(vo);
		}else{
			throw new dejcNotFoundException(getSql());
		}
	}
    
	/**
	 * 取得供應商簡稱
	 * @param dsCom
	 * @param compId
	 * @param vendorNo
	 * @return
	 * @throws Exception
	 */
	public static String getVendorAbbrevName(dsjccom dsCom,String compId,String vendorNo) throws  Exception {
		msjcTBMSM00VO vo = getMs00vo(dsCom,conn,compId,vendorNo);
		if(vo.isKeyOk()){
			return getVendorAbbrevName(vo);
		}
		return "";
	}
	/**
	 * 取得供應商簡稱
	 * @param dsCom
	 * @param compId
	 * @param vendorNo
	 * @return
	 * @throws dejcNotFoundException
	 * @throws SQLException
	 * @throws Exception
	 */
    public static String getVendorAbbrevNameExp(dsjccom dsCom,String compId,String vendorNo)  throws dejcNotFoundException,SQLException, Exception {
    	msjcTBMSM00VO vo = getMs00vo(dsCom,conn,compId,vendorNo);
		if(vo.isKeyOk()){
			return getVendorAbbrevName(vo);
		}else{
			throw new dejcNotFoundException(getSql());
		}
	}
	/**
	 * 取得供應商國別
	 * @param dsCom
	 * @param compId
	 * @param vendorNo
	 * @return
	 * @throws Exception
	 */
	public static String getVendoContryId(dsjccom dsCom,String compId,String vendorNo) throws  Exception {
		msjcTBMSM00VO vo = getMs00vo(dsCom,conn,compId,vendorNo);
		if(vo.isKeyOk()){
			return vo.getCountryId();
		}
		return "";
	}
	/**
	 * 取得供應商國別
	 * @param dsCom
	 * @param compId
	 * @param vendorNo
	 * @return
	 * @throws dejcNotFoundException
	 * @throws SQLException
	 * @throws Exception
	 */
    public static String getVendoContryIdExp(dsjccom dsCom,String compId,String vendorNo)  throws dejcNotFoundException,SQLException, Exception {
    	msjcTBMSM00VO vo = getMs00vo(dsCom,conn,compId,vendorNo);
		if(vo.isKeyOk()){
			return vo.getCountryId();
		}else{
			throw new dejcNotFoundException(getSql());
		}
	}
    /**
     * 取得供應商是否存在
     * @param dsCom
     * @param compId
     * @param vendorNo
     * @return
     * @throws Exception
     */
    public static boolean  isVendorExist(dsjccom dsCom,String compId,String vendorNo) throws  Exception {
    	msjcTBMSM00VO vo = getMs00vo(dsCom,conn,compId,vendorNo);
		return vo.isKeyOk();
	}
    /**
     * 取得供應商是否停權
     * @param dsCom
     * @param compId
     * @param vendorNo
     * @return
     * @throws Exception
     */
    public static boolean  isVendorReject(dsjccom dsCom,String compId,String vendorNo) throws  Exception {
    	msjcTBMSM00VO vo = getMs00vo(dsCom,conn,compId,vendorNo);
    	if(StringUtils.isNotBlank(vo.getRejCode()) && vo.getRejCode().length() == 1){
    		switch(vo.getRejCode().charAt(0)){
    			case 'A':
    			case 'C':
    				return true;
    			case 'B':
    				String currentDate = msjcUtility.currentDate();
    				dejc312 de312 = new dejc312();
    				int sdate = de312.compareDate(currentDate,vo.getRejStartDate());
					int edate = de312.compareDate(vo.getRejEndDate(), currentDate);
    				if(sdate < 2 && edate < 2){
    					return true;
    				}
    			case 'D':
    				if(StringUtils.isBlank(vo.getRejStartDate()) && StringUtils.isBlank(vo.getRejEndDate())){
    					return true;
    				}
    		}
    	}
		return false;
	}    
	/**
	 * 取得供應商資料
	 * @param compId
	 * @param vendorNo
	 * @return
	 * @throws Exception
	 */
	public msjcVendorBean getVendoBean(String compId,String vendorNo) throws  Exception {
		return getVendoBean(compId, vendorNo, "");
	}
	/**
	 * 取得供應商資料
	 * @param compId
	 * @param vendorNo
	 * @return
	 * @throws dejcNotFoundException
	 * @throws SQLException
	 * @throws Exception
	 */
	public msjcVendorBean getVendoBeanExp(String compId,String vendorNo) throws dejcNotFoundException,SQLException, Exception {
		return getVendoBeanExp(compId, vendorNo, "");
	}    
	/**
	 * 取得供應商資料
	 * @param compId
	 * @param vendorNo
	 * @param adty
	 * @return
	 * @throws Exception
	 */
	public msjcVendorBean getVendoBean(String compId,String vendorNo,String adty) throws  Exception {
		chkParameter(compId, vendorNo);
		msjcVendorBean bean = new msjcVendorBean();
		dezcCriteria criteria = new dezcCriteria();
		criteria.eq("compId_MSM00", compId);
		criteria.eq("vendorNo_MSM00", vendorNo);
		dezcTransactionPool pool = getConn(dsCom, conn);
		msjcTBMSM00DAO dao00= new msjcTBMSM00DAO(dsCom,conn);
		msjcTBMSM00VO ms00VO = dao00.getOneNotNull(criteria);
		criteria = new dezcCriteria();
		criteria.eq("compId_MSM01", compId);
		criteria.eq("vendorNo_MSM01", vendorNo);
		if(StringUtils.isBlank(adty)){
			criteria.eq("isDefault_MSM01", "Y");
		}else{
			criteria.eq("adty_MSM01", adty);
		}
		msjcTBMSM01DAO dao01 = new msjcTBMSM01DAO(dsCom,conn);
		msjcTBMSM01VO ms01VO = dao01.getOneNotNull(criteria);
		releaseConn(pool);
		if(ms00VO.isKeyOk() && ms01VO.isKeyOk()){
			bean = setVendorBean(ms00VO,ms01VO);
		}
		return bean;
	}
	/**
	 * 取得供應商資料
	 * @param compId
	 * @param vendorNo
	 * @param adty
	 * @return
	 * @throws dejcNotFoundException
	 * @throws SQLException
	 * @throws Exception
	 */
	public msjcVendorBean getVendoBeanExp(String compId,String vendorNo,String adty) throws dejcNotFoundException,SQLException, Exception {
		chkParameter(compId, vendorNo);
		dezcTransactionPool pool = getConn(dsCom, conn);
		msjcVendorBean bean = new msjcVendorBean();
		dezcCriteria criteria = new dezcCriteria();
		criteria.eq("compId_MSM00", compId);
		criteria.eq("vendorNo_MSM00", vendorNo);
		msjcTBMSM00DAO dao00= new msjcTBMSM00DAO(dsCom,conn);
		msjcTBMSM00VO ms00VO = dao00.getOneNotNull(criteria);
		criteria = new dezcCriteria();
		criteria.eq("compId_MSM01", compId);
		criteria.eq("vendorNo_MSM01", vendorNo);
		if(StringUtils.isBlank(adty)){
			criteria.eq("isDefault_MSM01", "Y");
		}else{
			criteria.eq("adty_MSM01", adty);
		}
		msjcTBMSM01DAO dao01 = new msjcTBMSM01DAO(dsCom,conn);
		msjcTBMSM01VO ms01VO = dao01.getOneNotNull(criteria);
		releaseConn(pool);
		if(ms00VO.isKeyOk() && ms01VO.isKeyOk()){
			bean = setVendorBean(ms00VO,ms01VO);
		}else{
			throw new dejcNotFoundException(dao00.getSql()+";"+dao01.getSql());
		}
		return bean;
	}  	
	/**
	 * 取得供應商付款資料
	 * @param compId
	 * @param vendorNo
	 * @param adty
	 * @return
	 * @throws Exception
	 */
	public msjcVendorPayBean getVendoPayBean(String compId,String vendorNo) throws  Exception {
		return getVendoPayBeanExp(compId, vendorNo, "");
	}
	/**
	 * 取得供應商付款資料
	 * @param compId
	 * @param vendorNo
	 * @param adty
	 * @return
	 * @throws dejcNotFoundException
	 * @throws SQLException
	 * @throws Exception
	 */
	public msjcVendorPayBean getVendoPayBeanExp(String compId,String vendorNo,String adty) throws dejcNotFoundException,SQLException, Exception {
		chkParameter(compId, vendorNo);
		msjcVendorPayBean bean = new msjcVendorPayBean();
		dezcCriteria criteria = new dezcCriteria();
		criteria.eq("compId_MSM01", compId);
		criteria.eq("vendorNo_MSM01", vendorNo);
		if(StringUtils.isBlank(adty)){
			criteria.eq("isDefault_MSM01", "Y");
		}else{
			criteria.eq("adty_MSM01", adty);
		}
		dezcTransactionPool pool = getConn(dsCom, conn);
		msjcTBMSM01DAO dao01 = new msjcTBMSM01DAO(dsCom,conn);
		msjcTBMSM01VO ms01VO = dao01.getOneNotNull(criteria);
		releaseConn(pool);
		if(ms01VO.isKeyOk()){
			bean = setVendorPayBean(ms01VO);
		}else{
			throw new dejcNotFoundException(dao01.getSql());
		}
		return bean;
	}    
	/**
	 * 取得供應商付款資料
	 * @param compId
	 * @param vendorNo
	 * @return
	 * @throws Exception
	 */
	public Vector getVendoPayBeans(String compId,String vendorNo) throws  Exception {
		chkParameter(compId, vendorNo);
		msjcVendorPayBean bean = new msjcVendorPayBean();
		dezcCriteria criteria = new dezcCriteria();
		criteria.eq("compId_MSM01", compId);
		criteria.eq("vendorNo_MSM01", vendorNo);
		dezcTransactionPool pool = getConn(dsCom, conn);
		msjcTBMSM01DAO dao01 = new msjcTBMSM01DAO(dsCom,conn);
		Vector<msjcTBMSM01VO> ms01VOs = dao01.findByCriteria(criteria);
		Vector<msjcVendorPayBean> dataList = new Vector<msjcVendorPayBean>();
		releaseConn(pool);
		if(ms01VOs != null && ms01VOs.size() > 0){
			for(msjcTBMSM01VO ms01VO:ms01VOs){
				bean = setVendorPayBean(ms01VO);
				dataList.add(bean);
			}
		}
		return dataList;
	}
	/**
	 * 取得供應商付款資料
	 * @param compId
	 * @param vendorNo
	 * @return
	 * @throws dejcNotFoundException
	 * @throws SQLException
	 * @throws Exception
	 */
	public Vector getVendoPayBeansExp(String compId,String vendorNo) throws dejcNotFoundException,SQLException, Exception {
		chkParameter(compId, vendorNo);
		msjcVendorPayBean bean = new msjcVendorPayBean();
		dezcCriteria criteria = new dezcCriteria();
		criteria.eq("compId_MSM01", compId);
		criteria.eq("vendorNo_MSM01", vendorNo);
		dezcTransactionPool pool = getConn(dsCom, conn);
		msjcTBMSM01DAO dao01 = new msjcTBMSM01DAO(dsCom,conn);
		Vector<msjcTBMSM01VO> ms01VOs = dao01.findByCriteria(criteria);
		Vector<msjcVendorPayBean> dataList = new Vector<msjcVendorPayBean>();
		releaseConn(pool);
		if(ms01VOs != null && ms01VOs.size() > 0){
			for(msjcTBMSM01VO ms01VO:ms01VOs){
				bean = setVendorPayBean(ms01VO);
				dataList.add(bean);
			}
		}else{
			throw new dejcNotFoundException(dao01.getSql());
		}
		return dataList;
	}  	
	/**
	 * 取得供應商資料型態
	 * @param dsCom
	 * @param compId
	 * @param vendorNo
	 * @return
	 * @throws Exception
	 */
	public static String getVendorDataType(dsjccom dsCom,String compId,String vendorNo) throws Exception {
		chkParameter(compId, vendorNo);
		msjcTBMSM00VO vo = getMs00vo(dsCom,conn,compId,vendorNo);
		return vo.getDataType();
	}
	/*-------------------------------------------private method---------------------------------------*///TODO
	/**
	 * 檢查參數輸入是否正確
	 * @param compId
	 * @param vendorNo
	 * @throws Exception
	 */
	private static void chkParameter(String compId,String vendorNo) throws Exception {
		if(StringUtils.isBlank(compId)){
			throw new dejcMyException("參數有誤:compId=" + compId);
		}
		if(StringUtils.isBlank(vendorNo)){
			throw new dejcMyException("參數有誤:vendorNo=" + vendorNo);
		}
	}
	
	private static msjcTBMSM00VO getMs00vo(dsjccom dsCom,Connection con,String compId,String vendorNo) throws Exception{
		chkParameter(compId, vendorNo);
		dezcCriteria criteria = new dezcCriteria();
		criteria.eq("compId_MSM00", compId);
		criteria.eq("vendorNo_MSM00", vendorNo);
		dezcTransactionPool pool = getConn(dsCom, con);
		msjcTBMSM00DAO dao = new msjcTBMSM00DAO(dsCom,conn);
		msjcTBMSM00VO vo = dao.getOneNotNull(criteria);
		setSql(dao.getSql());
		releaseConn(pool);
		return vo;
	}
	
	/**
	 * 取得供應商名稱邏輯
	 * @param vo
	 * @return
	 */
	private static String getVendorName(msjcTBMSM00VO vo){
		if("ROC".equalsIgnoreCase(vo.getCountryId())){
			if(StringUtils.isNotBlank(vo.getCVendorName())){
				return vo.getCVendorName();
			}else if(StringUtils.isNotBlank(vo.getEVendorName())){
				return vo.getEVendorName();
			}else if(StringUtils.isNotBlank(vo.getAbbrevName())){
				return vo.getAbbrevName();
			}
		}else{
			if(StringUtils.isNotBlank(vo.getCVendorName())){
				return vo.getCVendorName();
			}else if(StringUtils.isNotBlank(vo.getEVendorName())){
				return vo.getEVendorName();
			}else if(StringUtils.isNotBlank(vo.getAbbrevName())){
				return vo.getAbbrevName();
			}
		}
		return "";
	}
	
	private static String getVendorAbbrevName(msjcTBMSM00VO vo){
		if(StringUtils.isNotBlank(vo.getAbbrevName())){
			return vo.getAbbrevName();
		}else{
			if(StringUtils.equalsIgnoreCase("ROC", vo.getCountryId())){
				return vo.getCVendorName();
			}else{
				return vo.getEVendorName();
			}
		}
	}
	private static String getSql() {
		return sql;
	}
	private static void setSql(String sql) {
		msjcApiA01.sql = sql;
	}
	
	private msjcVendorBean setVendorBean(msjcTBMSM00VO ms00VO,msjcTBMSM01VO ms01VO){
		msjcVendorBean bean = new msjcVendorBean();
		bean.setMsm00Uid(ms00VO.getMsM00Uid());
		bean.setCompId(ms00VO.getCompId());
		bean.setVendorNo(ms00VO.getVendorNo());
		bean.setCountryId(ms00VO.getCountryId());
		bean.setChnName(ms00VO.getCVendorName());
		bean.setEngName(ms00VO.getEVendorName());
		bean.setAbbrevName(ms00VO.getAbbrevName());
		bean.setInvoiceType(ms00VO.getInvoiceType());
		bean.setStatus(ms00VO.getStatus());
		bean.setDataType(ms00VO.getDataType());
		bean.setNewVendorNo(ms00VO.getNewVendorNo());
		bean.setRespDept(ms00VO.getRespDept());
		bean.setMailId(ms00VO.getMailId());
		boolean isReject = false;
		char rejCode = 0;
		if(ms00VO.getRejCode().length() != 1){
			rejCode = ' ';
		}else{
			rejCode = ms00VO.getRejCode().charAt(0);
		}
		switch(rejCode){
			case 'A':
			case 'C':
				isReject = true;
			case 'B':
				String currentDate = msjcUtility.currentDate();
				dejc312 de312 = new dejc312();
				int sdate = de312.compareDate(currentDate,ms00VO.getRejStartDate());
				int edate = de312.compareDate(ms00VO.getRejEndDate(), currentDate);
				if(sdate < 2 && edate < 2){
					isReject = true;
				}
			case 'D':
				if(StringUtils.isBlank(ms00VO.getRejStartDate()) && StringUtils.isBlank(ms00VO.getRejEndDate())){
					isReject = true;
				}
		}
		bean.setReject(isReject);
		bean.setRejUpdDate(ms00VO.getRejUpdDate());
		bean.setRejCode(ms00VO.getRejCode());
		bean.setRejStartDate(ms00VO.getRejStartDate());
		bean.setRejEndDate(ms00VO.getRejEndDate());
		bean.setRejReason(ms00VO.getRejReason());
		bean.setRejPoNo(ms00VO.getRejPoNo());
		bean.setPostNo(ms01VO.getPostCode());
		bean.setAddr(ms01VO.getAddr());
		bean.setAddrAll(ms01VO.getAddrAll());
		bean.setTel(ms01VO.getTel());
		bean.setFax(ms01VO.getFax());
		bean.setVendorEmail(ms01VO.getEmail());
		bean.setContact(ms01VO.getContact());
		bean.setCrcy(ms01VO.getCrcy());
		bean.setPaidType(ms01VO.getPaidType());
		bean.setBankCode(ms01VO.getBankCode());
		bean.setAccountNo(ms01VO.getAccountNo());
		return bean;
	}
	
	private msjcVendorPayBean setVendorPayBean(msjcTBMSM01VO ms01VO){
		msjcVendorPayBean bean = new msjcVendorPayBean();
		bean.setMsm01Uid(ms01VO.getMsM01Uid());
		bean.setMsm00Uid(ms01VO.getMsM00Uid());
		bean.setCompId(ms01VO.getCompId());
		bean.setVendorNo(ms01VO.getVendorNo());
		bean.setAdty(ms01VO.getAdty());
		bean.setAreaId(ms01VO.getAreaId());
		bean.setPostNo(ms01VO.getPostCode());
		bean.setAddr(ms01VO.getAddr());
		bean.setAddrAll(ms01VO.getAddrAll());
		bean.setTel(ms01VO.getTel());
		bean.setFax(ms01VO.getFax());
		bean.setVendorEmail(ms01VO.getEmail());
		bean.setMobile(ms01VO.getMobile());
		bean.setContact(ms01VO.getContact());
		bean.setPublictType(ms01VO.getPublicClass());
		bean.setVendorType(ms01VO.getVendorType());
		bean.setCrcy(ms01VO.getCrcy());
		bean.setPaidType(ms01VO.getPaidType());
		bean.setBankCode(ms01VO.getBankCode());
		bean.setAccountNo(ms01VO.getAccountNo());
		bean.setBankName(ms01VO.getBankName());
		bean.setBankAddr(ms01VO.getBankAddr());
		return bean;
	}
	
	private static dezcTransactionPool getConn(dsjccom dsCom,Connection con) throws Exception{
		dezcTransactionPool transactionPool = null;
		System.out.println("dsCom.companyId=" + dsCom.companyId);
		System.out.println("dsCom.linkType=" + dsCom.linkType);
		System.out.println("dsCom.appId=" + dsCom.appId);
		System.out.println("dsCom.db.dataSource=" + dsCom.db.dataSource);
		System.out.println("dsCom.db.linkFlag=" + dsCom.db.linkFlag);
		System.out.println("dsCom.db.userId=" + dsCom.db.userId);
		System.out.println("dsCom.db.passwd=" + dsCom.db.passwd);
		System.out.println("dsCom.db.driver=" + dsCom.db.driver);
		System.out.println("dsCom.db.url=" + dsCom.db.url);
		if(con == null){
			System.out.println("get new conn"); 
			transactionPool = new dezcTransactionPool(dsCom, AppId);
			conn = transactionPool.getConnection("ms", "MS.TBMSM00");
			if (conn==null) {
				System.out.println("null conn");
				System.out.println("conn="+conn);
				
			}
		}
		if (con.isClosed()) {
			System.out.println("con is closed"); 
		} else {
			System.out.println("con ok="+con.getCatalog());
			System.out.println("con ok="+con.toString());
			
		}

		return transactionPool;
	}
	
	private static void releaseConn(dezcTransactionPool transactionPool) throws SQLException{
		if(transactionPool != null){
			transactionPool.closeAll();
			transactionPool = null;
		}
	}
}
