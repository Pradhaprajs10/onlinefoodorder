package com.ofos.Generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtility {
	/**
	 * This method is used to fetch the data from property file
	 * @return
	 * @throws Throwable
	 */
	public String getPropertyData(String key) throws Throwable {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\commondata.properties");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		
		
	}

}
