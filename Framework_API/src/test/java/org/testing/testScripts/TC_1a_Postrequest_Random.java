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

public class TC_1a_Postrequest_Random {

	static String responseidValue;
	@Test
	public static void testCase1() throws IOException {
		System.out.println("*******TC1 POST Request********");
		
		//reading properties
		Properties probj = PropertiesRead.readPropertiesData("../Framework_API/URI.properties");
		
		//reading json data
		String reqBodyData = JsonRead.readData("../Framework_API/src/test/java/org/testing/resources/randomBodyData.json");
				
		//Calling generate id method
		String randomIdValue = RandomDataGenerate.generateData();
		
		reqBodyData = JsonVariableReplacement.replaceValue(reqBodyData, "id", randomIdValue);
		
		HttpMethods ht = new HttpMethods(probj);
		
	 Response resp = ht.postRequest("JAVA_URI", reqBodyData);
		
		responseidValue = JsonParsingUsingorgJson.parseReponseValue(resp.asString(), "id");
	}
}
