package org.springframework.cloud.openfeign.test;

import org.junit.Test;

import java.util.Enumeration;
import java.util.Properties;

public class GeneralTest {
	@Test
	public void testSystemProperty(){
		Properties properties = System.getProperties();
		Enumeration<?> enumeration = properties.propertyNames();
		while (enumeration.hasMoreElements()){
			String s = enumeration.nextElement().toString();
			System.out.println(String.format("%s----->%s",s,properties.getProperty(s)));
		}
	}
}
