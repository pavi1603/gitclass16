package org.utilies;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo1 extends BaseClass {
	//1.non para constructor
	public LoginPojo1() {
		PageFactory.initElements(driver,this);
	}
     @FindBy(id="Home_Ancillary_0")
     private WebElement shopgro;

      @FindBy(id="Home_Ancillary_0")
      private WebElement req;

	public WebElement getShopgro() {
		return shopgro;
	}

	public WebElement getReq() {
		return req;
	}
      
      
}