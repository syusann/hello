package com.icsc.ms.util;

import com.icsc.dpms.de.dejc308;
import com.icsc.dpms.de.dejc309;

public class msjcUtility {
	public final static String CLASS_VERSION = "$Id: ee6853909d9b2b3a9fa75f81f43c33c3f6ef41e3 $";

	/** 取得目前日期(當地格式YYYYMMDD) * */
	public static String currentDate() {
		dejc308 de308 = new dejc308();
		return de308.getCrntDateWFmt1() ;
	}
	/** 取得當天日期(當地格式HHMMSS) * */
	public static String currentTime() {
		dejc308 de308 = new dejc308();
		return de308.getCrntTimeFmt1() ;
	}
	/** 轉換日期格式(日期格式YYYYMMDD) * */
	public static String toDBDate(String date) {
		dejc309 de309 = new dejc309();
		String errCode = de309.checkDate(date);
		if(errCode.equals("*"))
			return "*";
		else
			return de309.getDateWFmt1();
	}	
	/** 轉換日期格式(日期格式YYY/MM/DD) * */
	public static String toLocalDate(String date) {
		dejc309 de309 = new dejc309();
		String errCode = de309.checkDate(date);
		if(errCode.equals("*"))
			return "*";
		else
			return de309.getDateLFmt2();
	}		
}
