package edu.springboot.a2z.emporg.util;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class OrgUtil {
	
	public static ZonedDateTime getDateFromString(String dateStr) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
		return ZonedDateTime.parse(dateStr, formatter);
	}

}
