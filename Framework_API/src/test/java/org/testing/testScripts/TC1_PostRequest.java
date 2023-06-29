package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.JsonRead;
import org.testing.utilities.PropertiesRead;

public class TC1_PostRequest 
{
	public static void main(String[] args) throws IOException {
		//reading properties
		Properties probj = PropertiesRead.readPropertiesData("../Framework_API/URI.properties");
		
		//reading json data
		String reqBodyData = JsonRead.readData("../Framework_API/src/test/java/org/testing/resources/bodyData.json");
				
		HttpMethods ht = new HttpMethods(probj);
		
		ht.postRequest("API_URI", reqBodyData);
	}

}
