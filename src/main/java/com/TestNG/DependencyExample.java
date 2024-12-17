package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {

	
	@Test(priority = 0)
	public void Login() {
		System.out.println("--------Login test executed--------");
		Assert.fail("Login Test Failed");
	}
	
	
	@Test(priority=1, dependsOnMethods= {"Login"})
	public void AccessDashboard() {
		System.out.println("--------Access Dashboard test executed--------");
	}
	
	@Test(priority=2, dependsOnMethods= {"Login","AccessDashboard"})
	public void AddToCart() {
		System.out.println("--------AddToCart test executed--------");
	}
	
	@Test(priority=3, dependsOnMethods= {"Login","AccessDashboard"})
	public void AccessCart() {
		System.out.println("--------Access Cart test executed--------");
	}

	@Test(priority=4, dependsOnMethods= {"Login"})
	public void Payment() {
		System.out.println("--------Payment test executed--------");
	}
	
	@Test(priority=5, dependsOnMethods= {"AccessDashboard"})
	public void Logout() {
		System.out.println("--------Logout test executed--------");
	}
	
}
