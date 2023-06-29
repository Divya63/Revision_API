package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.PropertiesRead;
import org.testng.annotations.Test;

public class TC8_Get_Particular_RealApi 
{
	
	@Test
	public void testCase8() throws IOException
	{
		System.out.println("*******TC8 GET_Particular Request Real Api********");
		Properties probj = PropertiesRead.readPropertiesData("../Framework_API/URI.properties");
		
		HttpMethods ht = new HttpMethods(probj);
		
	 ht.getParticularRequest1("Get_Particular_Real_Api");
	}


}
