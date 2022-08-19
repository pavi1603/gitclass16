   package org.cts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilies.BaseClass;
import org.utilies.LoginPojo;

public class LaunchBrowser extends BaseClass {
	public static void main(String[] args) throws InterruptedException, IOException  {
		
		launchChrome();
		winMax();
		loadUrl("https://www.costco.com/");
		printTitle();
		printCurrentUrl();
		
		LoginPojo l=new LoginPojo();
		WebElement s = l.getSign();
		s.click();
		Thread.sleep(2000);
		fill(l.getTxtUser(),getData(1,2));
		Thread.sleep(2000);
		fill(l.getTxtPass(),getData(1,4));
		Thread.sleep(2000);
	
		
		/*
		WebElement shopgrocery = driver.findElement(By.id("Home_Ancillary_0"));
		gro(shopgrocery);
		WebElement requirments = driver.findElement(By.id("Home_Ancillary_0"));
		house(requirments);
		WebElement signbtn = driver.findElement(By.id("header_sign_in"));
		sign(signbtn);
		Thread.sleep(2000);
		WebElement txtuser = driver.findElement(By.xpath("//input[@type='email']"));
		fill(txtuser,getData(1,2));
		Thread.sleep(2000);
		rightClick(txtuser);
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		fill(pass,getData(1,1));  
		Thread.sleep(2000);
		dClick(pass);
	    closeBrowser();
	   
	    launchChrome();
		winMax();
		loadUrl("https://www.naukri.com/registration/createAccount");
		printTitle();
		printCurrentUrl();
				WebElement txtuser = driver.findElement(By.id("name"));
		fill(txtuser,getData(1,0));
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("email"));
		fill(email,getData(1,1));  
		Thread.sleep(2000);
		
		WebElement pass = driver.findElement(By.id("password"));
		fill(pass,getData(1,2));
		Thread.sleep(2000);
		
		WebElement mble = driver.findElement(By.id("mobile"));
		fill(mble,getData(1,3));  
		Thread.sleep(2000);*/
		
		
		
		
		
	}
	

}
