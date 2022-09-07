package org.junits;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.utilies.BaseClass;

public class Employee extends BaseClass {
	
	@DataProvider(name="login")
	private Object[][] greens() throws IOException {
		return new Object [][] {
			
			{getData(0,0),getData(0, 1)},
			{getData(1,0),getData(1,1)}
			
			
			
		};
		
		
	}

}
