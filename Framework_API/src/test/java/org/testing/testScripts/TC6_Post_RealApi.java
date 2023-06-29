package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.JsonParsingUsingorgJson;
import org.testing.utilities.JsonRead;
import org.testing.utilities.JsonVariableReplacement;
import org.testing.utilities.PropertiesRead;
import org.testing.utilities.RandomDataGenerate;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC6_Post_RealApi {

	static String responseidValue;
	
	@Test
	public static void testCase6() throws IOException 
	{
		System.out.println("*******TC6 POST Request Real Api********");
		
		//reading properties
		Properties probj = PropertiesRead.readPropertiesData("../Framework_API/URI.properties");
		
		//reading json data
		String reqBodyData = JsonRead.readData("../Framework_API/src/test/java/org/testing/resources/bodyDataRealApi.json");
				
		//Calling generate id method
		String randomIdValue = RandomDataGenerate.generateData();
		
		reqBodyData = JsonVariableReplacement.replaceValue(reqBodyData, "id", randomIdValue);
		
		HttpMethods ht = new HttpMethods(probj);
		
	 Response resp = ht.postRequest("Post_Real_Api", reqBodyData);
		
		//responseidValue = JsonParsingUsingorgJson.parseReponseValue(resp.asString(), "id");
	}

}
