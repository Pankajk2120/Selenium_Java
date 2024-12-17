package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	
	@Test
	public void testArrayEquality() {
		int[] actualArray = {1, 2, 3, 4};
        int[] expectedArray = {1, 2,3,4};
        Assert.assertEquals(actualArray, expectedArray);
	}
	
	@Test
	public void ConditionalTest() {
		int Age = 16;
		Assert.assertTrue(Age >= 18, "Age is less than 18, access denied!");
	}

}
