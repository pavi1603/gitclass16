package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Empp {
	@Test
	private void tc4() {
		System.out.println("Test 4");

	}
	@Test
	private void tc5() {
		Assert.assertTrue(false, "checking");
		System.out.println("Test 5");

	}
	/*
	
	@Test(retryAnalyzer=Failed.class)
	private void tc2() {
		Assert.assertTrue(false, "checking");
		System.out.println("Test 2");

	}
	*/
	@Test
	private void tc1() {
		System.out.println("Test 1");

	}
	
	@Test
	private void tc3() {
		System.out.println("Test 3");

	}

}
