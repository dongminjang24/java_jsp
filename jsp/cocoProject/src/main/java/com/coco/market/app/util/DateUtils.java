package com.coco.market.app.util;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateUtils {

    public static String getDifferenceDescription(LocalDateTime dateTime) {
    	 LocalDate today = LocalDate.now();
	    LocalDate inputDate = dateTime.toLocalDate();
	    
	    long days = ChronoUnit.DAYS.between(inputDate, today);
    	    
	    if (days == 0) {
	        return "오늘";
	    } else if (days == 1) {
	        return "어제";
	    } else {
	        return days + "일 전";
	    }
    }
}
