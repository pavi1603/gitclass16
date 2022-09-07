package org.utilies;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo2  extends BaseClass{
	//1.non para constructor
		public LoginPojo2() {
			PageFactory.initElements(driver,this);
		}
		@FindBy(id="header_sign_in")
		private WebElement sign;
		
		@FindBy(id="createAccount")
		private WebElement account;
		
		
		
	     @FindBy(id="email")
	     private WebElement address;

	      @FindBy(id="newPassword")
	      private WebElement newPass;
	      
	      @FindBy(id="reenterPassword")
	      private WebElement rePass;
	      
	      @FindBy(id="membershipNumber")
	      private WebElement member;

		public WebElement getSign() {
			return sign;
		}

		public WebElement getAccount() {
			return account;
		}

		public WebElement getAddress() {
			return address;
		}

		public WebElement getNewPass() {
			return newPass;
		}

		public WebElement getRePass() {
			return rePass;
		}

		public WebElement getMember() {
			return member;
		}

		
}
