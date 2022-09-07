package org.test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failed implements IRetryAnalyzer{
	//3
	int min=0; int max=3; 

	public boolean retry(ITestResult arg0) {
		if(min<max) {
			min++;
		return true;
	}
		
		return false;
	

}
}