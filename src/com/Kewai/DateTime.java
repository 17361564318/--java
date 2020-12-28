package com.Kewai;

import java.time.LocalDateTime;
import java.util.Calendar;

public class DateTime {

	public static void main(String[] args) throws Exception {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(calendar.YEAR));
		System.out.println(calendar.get(calendar.MONTH)+1);
		System.out.println(calendar.get(calendar.DATE));
		System.out.println(calendar.get(calendar.HOUR_OF_DAY));
		System.out.println(calendar.get(calendar.MINUTE));
		System.out.println(calendar.get(calendar.SECOND));
		
		
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.getYear());
		System.out.println(now.getMonth());
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getSecond());
	}
}
