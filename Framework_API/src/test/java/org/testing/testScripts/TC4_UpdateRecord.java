package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.JsonRead;
import org.testing.utilities.JsonVariableReplacement;
import org.testing.utilities.PropertiesRead;
import org.testing.utilities.RandomDataGenerate;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4_UpdateRecord 
{
	@Test
	public void testcase4() throws IOException
	{
		System.out.println("*******TC4 UPDATE Request********");
		
		//reading properties
				Properties probj = PropertiesRead.readPropertiesData("../Framework_API/URI.properties");
				
				//reading json data
				String reqBodyData = JsonRead.readData("../Framework_API/src/test/java/org/testing/resources/updateBodyData.json");
						
				//Calling generate id method
				String randomIdValue = RandomDataGenerate.generateData();
				
				reqBodyData = JsonVariableReplacement.replaceValue(reqBodyData, "id", TC_1a_Postrequest_Random.responseidValue);
				
				HttpMethods ht = new HttpMethods(probj);
				
			 Response resp = ht.putRequest("JAVA_URI",TC_1a_Postrequest_Random.responseidValue, reqBodyData);
	}

}
