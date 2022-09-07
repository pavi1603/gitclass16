package org.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Emp {
	@Test
	private void tc4() {
		long id=Thread.currentThread().getId();
		System.out.println("Test: 4"+id);

	}
	@Test
	private void tc2() {
		System.out.println("Test 2:"+Thread.currentThread().getId());
		
	} 

	@Test
	private void tc1() {
		System.out.println("Test 1:"+Thread.currentThread().getId());

	}
	
	@Test
	private void tc3() {
		System.out.println("Test 3:"+Thread.currentThread().getId());

	}

}
