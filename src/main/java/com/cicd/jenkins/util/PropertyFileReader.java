package com.cicd.jenkins.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileReader {

	private Properties prop;
	
	public PropertyFileReader(String filename) throws FileNotFoundException{
		prop=new Properties();
		
		FileReader reader=new FileReader("./resources/"+filename); 
		/*InputStream is;
		is = this.getClass().getResourceAsStream("./"+filename);*/
	
		try {
			prop.load(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getValue(String key){
		return prop.getProperty(key);
	}
	
	
}
