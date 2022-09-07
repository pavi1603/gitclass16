package org.test;

import org.testng.annotations.Test;

public class Employe {
	@Test(groups= {"smoke,cricket"})//AND
	private void tc4() {
		System.out.println("Test 4");

	}
	
	@Test(groups= "smoke")//OR
	private void tc2() {
		System.out.println("Test 2");

	}
	
	@Test(groups= {"regression","cricket"})//OR
	private void tc1() {
		System.out.println("Test 1");

	}
	
	@Test(groups= "regression")//OR
	private void tc3() {
		System.out.println("Test 3");

	}

}
