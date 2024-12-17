package com.TestNG;

import org.testng.annotations.Test;

public class PriorityExample {

	@Test(priority = 1)
	public void testA1() {
        System.out.println("a");
    }
	
	@Test(priority = 4)
	public void testK() {
        System.out.println("k");
    }
	
	@Test(priority = 3)
	public void testA2() {
        System.out.println("a");
    }
	
	@Test(priority = 0)
	public void testP() {
        System.out.println("P");
    }
	
	@Test(priority = 2)
	public void testN() {
        System.out.println("n");
    }
	
	@Test(priority = 5)
	public void testJ() {
        System.out.println("j");
    }
	
	@Test
	public void defaultPriorityTest() {
	    System.out.println("Executing Default Priority Test : ");
	}
	
	@Test(priority = -1)
	public void highPriorityTest1() {
	    System.out.println("Executing High Priority Test1");
	}
	
	@Test(priority = -2)
	public void highPriorityTest2() {
	    System.out.println("Executing High Priority Test2");
	}
	
}
