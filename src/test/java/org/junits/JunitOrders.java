package org.junits;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.utilies.BaseClass;
import org.utilies.LoginPojo;
import org.junit.Assert;

public class JunitOrders extends BaseClass  {
	@BeforeClass
	public static void browserLaunch() {
		launchChrome();
		winMax();
	}
   @AfterClass
   public static void browserClose() {
	closeBrowser();
}
   @Before
   public void startTime() {
	   loadUrl("https://signin.costco.com/e0714dd4-784d-46d6-a278-3e29553483eb/B2C_1A_SSO_WCS_signup_signin_500/oauth2/v2.0/authorize?ClientName=USBC&ui_locales=en-US&scope=openid&response_type=id_token&redirect_uri=https%3A%2F%2Fwww.costco.com%2FOAuthLogonCmd&state=URL%3D%5BSSO%5D%2F%5BSSO%5D&nonce=Ohk14lGWCzAKKyql&client_id=4900eb1f-0c10-4bd9-99c3-c59e6c1ecebf&TC=0&response_mode=form_post");
	   Date d = new Date();
	   System.out.println(d);
}
   @After
   public void endTime() {
	   Date d = new Date();
	   System.out.println(d);
}
   //invalid UserName and valid password
   @Test
   public void tc1() throws IOException, InterruptedException {
	LoginPojo l = new LoginPojo();
	fill(l.getTxtUser(),getData(1,0));
	Thread.sleep(2000);
	fill(l.getTxtPass(),getData(1,1));
	Thread.sleep(2000);
}
   @Test
   public void tc2() throws IOException, InterruptedException {
	   LoginPojo l = new LoginPojo();
		fill(l.getTxtUser(),getData(1,0));
		Thread.sleep(2000);
		fill(l.getTxtPass(),getData(1,1));
		Thread.sleep(2000);
}
   @Test
   public void tc3() throws IOException, InterruptedException {
	   String expect="Sign In | Costco";
	   LoginPojo l = new LoginPojo();
		fill(l.getTxtUser(),getData(1,0));
		Thread.sleep(2000);
		fill(l.getTxtPass(),getData(1,1));
		Thread.sleep(2000);
		String act=driver.getTitle(); 
		Assert.assertEquals("check title", expect, act);
		System.out.println("Test3 is Passed");
}
   
   
}
