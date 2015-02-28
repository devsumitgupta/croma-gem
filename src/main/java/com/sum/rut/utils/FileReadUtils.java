/**
 * 
 */
package com.sum.rut.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

/**
 * @author sumitgup
 *
 */
public abstract class FileReadUtils {

	public static Properties readProperty(String configfile) {
		Properties prop = new Properties();
		File configFile = new File(configfile);
		if(configFile.exists()){
			try {
			FileInputStream fs = new FileInputStream(configFile);
				prop.load(fs);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return prop;
/*		for(Entry<Object, Object> e : prop.entrySet()) {
			e.getKey()
		}*/
		
	}
	
	public static boolean doesFileExist(String fileName) {
		File file = new File(fileName);
		return file.exists();
		
	}

}
