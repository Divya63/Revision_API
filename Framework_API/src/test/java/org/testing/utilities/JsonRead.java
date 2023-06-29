package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonRead {
	//input parameter ------ file path
	//purpose of the method ----- read json file data
	//output ------- data which is read by json file
 
	public static String readData(String filePath) throws FileNotFoundException {
	
		File f = new File(filePath);
		FileInputStream fi = new FileInputStream(f);
		JSONTokener jt = new JSONTokener(fi);
		JSONObject jo = new JSONObject(jt);
		
		return jo.toString();
	}
}
