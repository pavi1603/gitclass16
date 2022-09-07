package org.test;

import java.io.IOException;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilies.BaseClass;
import org.utilies.LoginPojo;

public class ParameterConcept extends BaseClass {
	
	@BeforeClass
	private void browser() {
		launchChrome();
		winMax();
	}
	@AfterClass
	private void browserClose() {
		closeBrowser();
	}
	@BeforeMethod
	   public void startTime() throws InterruptedException {
		   loadUrl("https://signin.costco.com/e0714dd4-784d-46d6-a278-3e29553483eb/B2C_1A_SSO_WCS_signup_signin_500/oauth2/v2.0/authorize?ClientName=USBC&ui_locales=en-US&scope=openid&response_type=id_token&redirect_uri=https%3A%2F%2Fwww.costco.com%2FOAuthLogonCmd&state=URL%3D%5BSSO%5D%2F%5BSSO%5D&nonce=Ohk14lGWCzAKKyql&client_id=4900eb1f-0c10-4bd9-99c3-c59e6c1ecebf&TC=0&response_mode=form_post");
		   Thread.sleep(2000);
		   Date d = new Date();
		   System.out.println(d);
	}
	   @AfterMethod
	   public void endTime() {
		   Date d = new Date();
		   System.out.println(d);
	}
	@Parameters({"ThrowBall","vegetables"})
	@Test
	private void tc1(String s1,String s2) throws IOException, InterruptedException { 
		LoginPojo l = new LoginPojo();
		fill(l.getTxtUser(),s1);
		Thread.sleep(1000);
		fill(l.getTxtPass(),s2);
		Thread.sleep(1000);
	} 
	@Test
	 
	private void tc2() throws IOException, InterruptedException { 
		LoginPojo l = new LoginPojo();
		fill(l.getTxtUser(),getData(1,0));
		Thread.sleep(1000);
		fill(l.getTxtPass(),getData(1,1));
		Thread.sleep(1000);
	} 

}
