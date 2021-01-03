package org.training.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class Utility {

	public static Object fetchPropertyValue(String Key) throws Exception {
		FileInputStream file = new FileInputStream("./Config/config.properties");
		Properties property = new Properties();
		return property.get(Key);
	}

	public static String fetchlocaterValue1(String Key) throws Exception {
		FileInputStream file = new FileInputStream("./Config/Elements.properties");
		Properties property = new Properties();
		return property.get(Key).toString();
	}

}
