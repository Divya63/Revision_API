package org.testing.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonParsingUsingorgJson 
{
	//input parameter ----  response data + keyname(id)
	// purpose----  to parse using orgjson library:   To fetch all the id values
   
	public static void parseReponse(String reponseBodyData, String keyName)
	{
		JSONArray arr = new JSONArray(reponseBodyData);
		int length = arr.length();
		
		for (int i = 0; i < length; i++)
		{
			JSONObject jobj = arr.getJSONObject(i);
			System.out.println(jobj.get(keyName));
		}
	}
	
	public static void realparseReponse(String reponseBodyData, String keyName) throws FileNotFoundException
	{
		JSONObject job = new JSONObject(reponseBodyData);
		
		JSONArray arr = new JSONArray(job.get("data").toString());
			
		int len = arr.length();
		for (int i = 0; i < arr.length(); i++) {
			
		JSONObject jobj = arr.getJSONObject(i);
			System.out.println(jobj.get(keyName));
		}
	}
	
	public static String parseReponseValue(String reponseBodyData, String keyName)
	{
		JSONObject jo = new JSONObject(reponseBodyData);
		String idValue = jo.getString(keyName);
		
		return idValue;
	}
}
