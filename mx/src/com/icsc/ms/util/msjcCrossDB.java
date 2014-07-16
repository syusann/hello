package com.icsc.ms.util;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.icsc.dpms.de.dejc318;
import com.icsc.dpms.de.dejcQueryDAO;
import com.icsc.dpms.de.dez.sql.dezcCriteria;
import com.icsc.dpms.de.dez.structs.func.dezcTransactionPool;
import com.icsc.dpms.ds.dsjccom;

public class msjcCrossDB {
	public final static String CLASS_VERSION = "$Id: msjcCrossDB.java,v 1.4 2014/06/26 06:50:40 I26998 Exp $";
	public final static String AppId = "msjcCrossDB";
	
	public static List<Map> doQurery(dsjccom dsCom,dezcCriteria criteria,String tableName,String orderStr,int pageNum,int count) throws Exception {
        //取得連接資料庫的Connection con：
        dezcTransactionPool transactionPool = new dezcTransactionPool(dsCom, AppId);
        List<Map> msData = new ArrayList<Map>();
        try{
            Connection con = transactionPool.getConnection("ms", tableName);
            StringBuffer sql = new StringBuffer();
            sql.append(String.format("SELECT * FROM %s ", tableName));
            if(criteria != null){
            	sql.append(criteria.toSqlWithWhereIfExists());
            }
            if(StringUtils.isNotBlank(orderStr)){
            	sql.append(" ORDER BY "+orderStr);
            }
            StringBuffer sb = new StringBuffer();
    		sb.append("SELECT * FROM (SELECT ROW_NUMBER() ");
    		sb.append("OVER() AS ROWNUM,SOURCE.* FROM ( ");
    		sb.append(sql.toString());
    		sb.append(")SOURCE) a ");
    		sb.append(String.format("WHERE rownum > ( ( %d - 1 ) * %d ) ",pageNum,count));
    		sb.append(String.format("AND rownum <= ( %d * %d ) ",pageNum,count));
            dejcQueryDAO deQueryDAO = new dejcQueryDAO(dsCom,con);
            Map[] clData=deQueryDAO.getDatas(sb.toString());
            if(clData.length > 0){
                msData = Arrays.asList(clData);
            }
        }catch(Exception e) {
            dejc318 de318 = new dejc318(dsCom, AppId);
            de318.logs(e.getMessage(), e.getMessage(), e);
            throw e;
        }finally{
            transactionPool.closeAll();
        }
        return msData;
    }
	
	public static Connection getConn(dsjccom dsCom,String tableName) throws Exception {
		dezcTransactionPool transactionPool = new dezcTransactionPool(dsCom, AppId);
		Connection con = null;
		try {
			con = transactionPool.getConnection("ms", tableName);
		} catch (Exception e) {
			dejc318 de318 = new dejc318(dsCom, AppId);
            de318.logs(e.getMessage(), e.getMessage(), e);
            throw e;
		}
		return con;
	}
}
