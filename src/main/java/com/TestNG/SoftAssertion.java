package com.TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test
	public void SoftAssertionExample() {
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals("test", "test", "String comparison failed!");
	     softAssert.assertTrue(5 > 10, "5 is not greater than 10!");
	     softAssert.assertTrue(100 > 10, "100 is not greater than 10!");

	     System.out.println("Completed assertions. Now checking results...");
	        
	     softAssert.assertAll();
	}
}
