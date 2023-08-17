package com.ofos.Generics;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	/**
	 * This method is used to getRandom number
	 * @return
	 */
	public int getRandom() {
	    Random r = new Random();
		int random = r.nextInt(500);
		return random;
	}
	/**
	 * This method is used to getSystemDate
	 * @return
	 */
	public String getSystemDate() {
		Date d =new Date();
		String date = d.toString();
		return date;
	}
	/**
	 * This method is used to getSystemDateFormat
	 * @return
	 */
	public String getSystemDateFormat() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy hh-MM-ss");
		Date d =new Date();
		String systemDateFormat = dateFormat.format(d);
		return systemDateFormat;			
	}
}
