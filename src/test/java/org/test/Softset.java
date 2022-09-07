package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softset {
	@Test
	private void tc4() {
		System.out.println("Test 4");

	}
	
	@Test
	private void tc2() {
		SoftAssert s = new SoftAssert();  
		s.assertTrue(true, "Testing");
		System.out.println("Test 2");
		System.out.println("Green Technologies");
		s.assertAll();
		System.out.println("success");

	}
	
	@Test
	private void tc1() {
		System.out.println("Test 1");

	}
	
	@Test
	private void tc3() {
		System.out.println("Test 3");

	}

}
