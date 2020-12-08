package commonmethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

import bsh.StringUtil;

public class Propfile {
	
	static Properties prop = new Properties();
	
	public static String  getprovalue(String key) throws Exception {
		String pfpath=System.getProperty("user.dir")+"\\src\\test\\resources\\conf.properties";
		FileInputStream fis = new FileInputStream(pfpath);
		prop.load(fis);
		
		// read file
		String value=prop.get(key).toString();
		
		if(StringUtils.isEmpty(value)) {
			
			throw new Exception ("value is not aviable");
			
		}
		
		return value;
	}

}
