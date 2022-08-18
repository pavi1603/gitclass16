   package org.cts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilies.BaseClass;

public class LaunchBrowser extends BaseClass {
	public static void main(String[] args) throws InterruptedException, IOException  {
		
		launchChrome();
		winMax();
		loadUrl("https://www.costco.com/");
		printTitle();
		printCurrentUrl();
		
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
		
	}
	

}
