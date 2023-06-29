package org.testing.testSteps;

import static io.restassured.RestAssured.*;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HttpMethods 
{
	
	//post method
	//input method ----  Request body data n URI key name
	
	Properties pr;
	public HttpMethods(Properties pr1)
	{
		this.pr = pr1;
	}
	
	public Response postRequest(String uriKeyName, String requestBodyData)
	{
		
		String uriValue = pr.getProperty(uriKeyName);
		
		Response res = 
		given().contentType(ContentType.JSON)
		.body(requestBodyData)
		.when()
		.post(uriValue);
		
		System.out.println("Status Code: " + res.statusCode());
		System.out.println("Response Data: ");
		System.out.println(res.asString());
		
		return res;
		
	}
	public Response getAlltRequest(String uriKeyName)
	{
		
		String uriValue = pr.getProperty(uriKeyName);
		
		Response res = 
		given().contentType(ContentType.JSON)
		.when()
		.get(uriValue);
		
		System.out.println("Status Code: " + res.statusCode());
		System.out.println("Response Data: ");
		System.out.println(res.asString());
		
		return res;
	}
	
	public Response getParticularRequest(String uriKeyName, String endpoint)
	{
		
		String uriValue = pr.getProperty(uriKeyName)+ "/" + endpoint;
		
		Response res = 
		given().contentType(ContentType.JSON)
		.when()
		.get(uriValue);
		
		System.out.println("Status Code: " + res.statusCode());
		System.out.println("Response Data: ");
		System.out.println(res.asString());
		
		return res;
	}
	public Response getParticularRequest1(String uriKeyName)
	{
		
		String uriValue = pr.getProperty(uriKeyName);
		
		Response res = 
		given().contentType(ContentType.JSON)
		.when()
		.get(uriValue);
		
		System.out.println("Status Code: " + res.statusCode());
		System.out.println("Response Data: ");
		System.out.println(res.asString());
		
		return res;
	}
	public Response putRequest(String uriKeyName, String endpoint, String requestBodyData)
	{
		
		String uriValue = pr.getProperty(uriKeyName)+ "/" + endpoint;
		
		Response res = 
		given().contentType(ContentType.JSON)
		.body(requestBodyData)
		.when()
		.put(uriValue);
		
		System.out.println("Status Code: " + res.statusCode());
		System.out.println("Response Data: ");
		System.out.println(res.asString());
		
		return res;
		
	}
	
	public Response putRequest1(String uriKeyName, String requestBodyData)
	{
		
		String uriValue = pr.getProperty(uriKeyName);
		
		Response res = 
		given().contentType(ContentType.JSON)
		.body(requestBodyData)
		.when()
		.put(uriValue);
		
		System.out.println("Status Code: " + res.statusCode());
		System.out.println("Response Data: ");
		System.out.println(res.asString());
		
		return res;
		
	}
	
	public Response deleteRequest(String uriKeyName, String endpoint)
	{
		
		String uriValue = pr.getProperty(uriKeyName)+ "/" + endpoint;
		
		Response res = 
		given().contentType(ContentType.JSON)
		.when()
		.delete(uriValue);
		
		System.out.println("Status Code: " + res.statusCode());
		System.out.println("Response Data: ");
		System.out.println(res.asString());
		
		return res;
	}
	
	public Response deleteRequest1(String uriKeyName)
	{
		
		String uriValue = pr.getProperty(uriKeyName);
		
		Response res = 
		given().contentType(ContentType.JSON)
		.when()
		.delete(uriValue);
		
		System.out.println("Status Code: " + res.statusCode());
		System.out.println("Response Data: ");
		System.out.println(res.asString());
		
		return res;
	}
}
