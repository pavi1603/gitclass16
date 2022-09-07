   package org.cts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilies.BaseClass;
import org.utilies.LoginPojo;
import org.utilies.LoginPojo1;
import org.utilies.LoginPojo2;

public class LaunchBrowser extends BaseClass {
	public static void main(String[] args) throws InterruptedException, IOException  {
	
		launchChrome();
		winMax();
		loadUrl("https://www.costco.com/");
		printTitle();
		printCurrentUrl();
		
		
		LoginPojo2 l=new LoginPojo2();
		WebElement s = l.getSign();
		s.click();
		Thread.sleep(2000);
		WebElement a = l.getAccount();
		a.click();
		Thread.sleep(2000);
		fill(l.getAddress(),getData(1,3));
		Thread.sleep(2000);
		fill(l.getNewPass(),getData(1,1));
		Thread.sleep(2000);
		fill(l.getRePass(),getData(1,5));
		Thread.sleep(2000);
		fill(l.getMember(),getData(1,6));
		Thread.sleep(2000);

		
		LoginPojo1 l1 = new LoginPojo1();
		gro(l1.getShopgro());
		WebElement w=l1.getReq();
	w.click();  
		
		
		LoginPojo l2=new LoginPojo();
		WebElement s1 = l2.getSign();
		s1.click();
		Thread.sleep(2000);
		fill(l2.getTxtUser(),getData(1,1));
		Thread.sleep(2000);
		fill(l2.getTxtPass(),getData(1,2));
		Thread.sleep(2000);
	
		
		
		WebElement shopgrocery = driver.findElement(By.id("Home_Ancillary_0"));
		gro(shopgrocery);
		WebElement requirments = driver.findElement(By.id("Home_Ancillary_0"));
		house(requirments);
		WebElement signbtn = driver.findElement(By.id("header_sign_in"));
		sign(signbtn);
		Thread.sleep(2000);
		WebElement txtuser = driver.findElement(By.xpath("//input[@type='email']"));
		fill(txtuser,getData(1,0));
		Thread.sleep(3000);
		rightClick(txtuser);
		WebElement txtpass = driver.findElement(By.xpath("//input[@type='password']"));
		fill(txtpass,getData(1,1));  
		Thread.sleep(3000);
		
	   
	    launchChrome();
		winMax();
		loadUrl("https://www.naukri.com/registration/createAccount");
		printTitle();
		printCurrentUrl();
		WebElement txtuser1 = driver.findElement(By.id("name"));
		fill(txtuser1,getData(1,0));
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("email"));
		fill(email,getData(1,1));  
		Thread.sleep(2000);
		
		WebElement pass = driver.findElement(By.id("password"));
		fill(pass,getData(1,2));
		Thread.sleep(2000);
		
		WebElement mble = driver.findElement(By.id("mobile"));
		fill(mble,getData(1,3));  
		Thread.sleep(2000);
		
		
		
		
		
	}
	

}
