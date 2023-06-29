package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.PropertiesRead;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC7_Get_ALL_RealApi 
{
	@Test
	public void testCase7() throws IOException
	{
		System.out.println("*******TC7 GET_ALL Request Real Api********");
		//reading properties
				Properties probj = PropertiesRead.readPropertiesData("../Framework_API/URI.properties");
				
				HttpMethods ht = new HttpMethods(probj);
				
				Response respobj =ht.getAlltRequest("Get_All_Real_Api");	
				System.out.println("**********");
				//JsonParsingUsingorgJson.realparseReponse(respobj.asString(), "id");
				
				//System.out.println("**********");
	}

}
