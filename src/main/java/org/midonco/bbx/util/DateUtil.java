package org.midonco.bbx.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	public static final String DATE_FORMAT_TIMESTAMP = "yyyy-MM-dd HH:mm:ss";
	public static final String DATE_FORMAT_yyyyMMddhhmmss = "yyyyMMddHHmmss";
	public static final String DATE_FORMAT_yyyyMMdd = "yyyyMMdd";
	public static final String DATE_FORMAT_ISO = "yyyy-MM-dd";
	public static final String DATE_FORMAT_hhmmss = "HHmmss";
	public static final String DATE_FORMAT_hhmm = "HHmm";
	public static final String DATE_FORMAT_HOUR = "HH";
	public static final String DATE_FORMAT_MINUTES = "mm";
	
	public static String now(String format) {
		Calendar cal = Calendar.getInstance();
		return new SimpleDateFormat(format).format(cal.getTime());
	}

	public static String dateToString(Date d, String format) {
		return new SimpleDateFormat(format).format(d);
	}
	
	public static Date stringToDate(String d, String format) {
		DateFormat df = new SimpleDateFormat(format);
		
        try {
        	return df.parse(d);
        } 
        catch (ParseException e) {}
        return null;
	}

}
