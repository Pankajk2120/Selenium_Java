package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testHardAssertion {

	 @Test
	    public void testHardAssertion() {
	        // Hard Assertion
	        Assert.assertTrue(5 > 10, "Condition failed: 5 is not greater than 10");
	        System.out.println("This line will not be executed.");
	    }
}
