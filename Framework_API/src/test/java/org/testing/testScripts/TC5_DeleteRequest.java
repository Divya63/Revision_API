package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.PropertiesRead;
import org.testng.annotations.Test;

public class TC5_DeleteRequest
{
	@Test
	public void testcase5() throws IOException
	{
		System.out.println("*******TC5 Delete Request********");
		Properties probj = PropertiesRead.readPropertiesData("../Framework_API/URI.properties");
		
		HttpMethods ht = new HttpMethods(probj);
		
		ht.deleteRequest("JAVA_URI",TC_1a_Postrequest_Random.responseidValue);
	}

}
