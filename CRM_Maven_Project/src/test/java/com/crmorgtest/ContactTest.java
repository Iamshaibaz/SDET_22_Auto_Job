package com.crmorgtest;

import org.testng.annotations.Test;

public class ContactTest {

	@Test()
	public void createContactTest() {
		System.out.println("Execute create ContactTest");
		
	}

@Test
public void editContactTest() {
	

	String URL = System.getProperty("url");
	
System.out.println("Execute editContact Test");	
System.out.println(URL);
	
	

}
@Test
public void DeleteContactTest()
{
	System.out.println("hello this is deleteing contact test");
}
}