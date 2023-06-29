package org.testing.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRead {
	//input parameter -------- properties file path
	// purpose of mthd -------- read the properties 
	// output parameter   ------ return object of properties
	
public static Properties readPropertiesData(String filepath) throws IOException {
		
		File f = new File(filepath);
		FileReader fr = new FileReader(f);
		Properties pr = new Properties();
		pr.load(fr);
		
		return pr;
	}
}
