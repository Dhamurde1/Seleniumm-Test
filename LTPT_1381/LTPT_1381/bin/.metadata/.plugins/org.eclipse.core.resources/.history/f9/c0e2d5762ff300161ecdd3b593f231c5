package com.orangehrm.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	static Properties prop;
	static FileInputStream fis;
	static File file;
	
	public static void setPropertyFile() throws IOException
	{
		file=new File("..\\OrangeHRM\\resources\\OrangeHRM.properties");
		fis=new FileInputStream(file);
		prop=new Properties();
		prop.load(fis);
	}
	
	public static String getPropertyValue(String propertyname)
	{
		
		return prop.getProperty(propertyname);	
		
	}
}
