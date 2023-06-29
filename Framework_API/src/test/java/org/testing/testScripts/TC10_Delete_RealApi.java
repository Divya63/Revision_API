package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.PropertiesRead;
import org.testng.annotations.Test;

public class TC10_Delete_RealApi 
{
	@Test
	public void testCase10() throws IOException
	{
		System.out.println("*******TC10 Delete Request Real Api********");
		Properties probj = PropertiesRead.readPropertiesData("../Framework_API/URI.properties");
		
		HttpMethods ht = new HttpMethods(probj);
		
		ht.deleteRequest1("Delete_Real_Api");
	}

}
