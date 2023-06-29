package org.testing.utilities;

import java.util.Random;

public class RandomDataGenerate 
{
	public static String generateData()
	
	{
		Random ran = new Random();
		Integer randomValue = ran.nextInt(1000);
		return randomValue.toString();
	}

}
