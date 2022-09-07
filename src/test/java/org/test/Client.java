 package org.test;

import org.testng.annotations.Test;

public class Client {

	@Test(groups= "regression")
	private void tc44() {
		System.out.println("Test 44");

	}
	
	@Test(groups= "smoke")
	private void tc22() {
		System.out.println("Test 22");

	}
	
	@Test(groups= "sanity")
	private void tc11() {
		System.out.println("Test 11");

	}
	
	@Test(groups= {"sanity","cricket"})
	private void tc33() {
		System.out.println("Test 33");

	}
}
