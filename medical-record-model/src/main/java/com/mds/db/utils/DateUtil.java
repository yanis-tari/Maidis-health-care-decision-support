package com.mds.db.utils;

import java.util.Date;

import com.maidis.mdskernel.MdsDate;
import com.maidis.mdskernel.MdsDateTime;

public class DateUtil {

	public static boolean isDateNull(MdsDate date){	if(date == null || date.getYear()<3){return true;}else{return false;	}}
	public static boolean isDateNull(MdsDateTime date){if(date == null || date.getYear()<3){	return true;}else{return false;	}}
	public static Date dateFromMdsDate(MdsDate mdsDate)
	{
		if(!isDateNull(mdsDate)){
			return mdsDate.getDate();
		}else{
			return null;
		}				
	}
	public static Date dateFromMdsDate(MdsDateTime mdsDateTime)
	{
		if(!isDateNull(mdsDateTime)){
			return mdsDateTime.getDate();
		}else{
			return null;
		}				
	}		
}
