package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.JsonParsingUsingorgJson;
import org.testing.utilities.PropertiesRead;

import io.restassured.response.Response;


public class TC2_GetAllRequest 
{
	public void testCase2() throws IOException
	{
		
		System.out.println("*******TC2 Delete Request Real Api********");
		
		//reading properties
				Properties probj = PropertiesRead.readPropertiesData("../Framework_API/URI.properties");
				
				HttpMethods ht = new HttpMethods(probj);
				
				Response respobj =ht.getAlltRequest("JAVA_URI");			
				JsonParsingUsingorgJson.parseReponse(respobj.asString(), "id");
	}

}
