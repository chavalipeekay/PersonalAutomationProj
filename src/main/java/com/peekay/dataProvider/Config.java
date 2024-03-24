package com.peekay.dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {
	public static String getConfigProperties(String key) {
		Properties property=new Properties();
		String homeDir=System.getProperty("user.dir");
		try {
			property.load(new FileInputStream(new File(homeDir+"/src/main/resources/config.properties")));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return property.getProperty(key);
		
	}
	
}
