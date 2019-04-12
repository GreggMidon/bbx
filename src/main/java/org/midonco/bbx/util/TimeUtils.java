package org.midonco.bbx.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;

public class TimeUtils {

	/* 
	 * Convert SQL Timestamp to LocalDate
	 */
	public static LocalDate convertSqlTimestampToLocalDate(java.sql.Timestamp ts) {
		
		if(ts == null) return null;
		
		LocalDateTime ldt = LocalDateTime.ofInstant(ts.toInstant(), ZoneOffset.ofHours(0));
		return ldt.toLocalDate();
	}
	
	/* 
	 * Convert SQL Timestamp to LocalDateTime
	 */
	public static LocalDateTime convertSqlTimestampToLocalDateTime(java.sql.Timestamp ts) {
		
		if(ts == null) return null;
		
		return LocalDateTime.ofInstant(ts.toInstant(), ZoneOffset.ofHours(0));
	}

	/*
	 *  Convert from LocalDate to java.util.Date
	 */
	public static Date convertLocalDateToDate(LocalDate ld) {
		
		return Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
		
	}
	
	/*
	 *  Increment date by specified number of days
	 */
	public static LocalDate incrementBy(LocalDate ld, int days) {
		
		return ld.plusDays(days);
	}
	
	
}
