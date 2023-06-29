package org.testing.utilities;

import java.util.regex.Pattern;

//input parameter ---- complete body that is containing variable, variable name and variable value
//purpose  ---  assign value to variable
//output ----- after replacement it will return the data


public class JsonVariableReplacement 
{
	public  static String replaceValue(String bodyData, String variableName, String variableValue)
	{
		bodyData = bodyData.replaceAll(Pattern.quote("{{"+variableName+"}}"), variableValue);
		
		return bodyData;
		
	}

}
