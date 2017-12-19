package com.rudysorto.patrones;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDateExample1 {

	public static void main(String[] argv) {

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dateInString = "07/06/2013";
		String dateInString2 = "Tue Dec 05 00:00:00 CST 2017";

		DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);

		try {

			Date date2 = dateFormat.parse(dateInString2);

			Date date = formatter.parse(dateInString);
			//System.out.println(date);
			System.out.println(date2);
		//	System.out.println(formatter.format(date));
			System.out.println(dateFormat.format(date2));
			System.out.println(formatter.format(date2));

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}