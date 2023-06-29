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

public class TC3_GetParticularRecord 
{
	@Test
	public void testcase3() throws IOException
	{
		System.out.println("*******TC3 GET_Particular Request********");
		Properties probj = PropertiesRead.readPropertiesData("../Framework_API/URI.properties");
		
		HttpMethods ht = new HttpMethods(probj);
		
	 ht.getParticularRequest("JAVA_URI",TC_1a_Postrequest_Random.responseidValue);
	}

}
