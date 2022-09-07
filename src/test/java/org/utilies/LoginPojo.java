package org.utilies;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	
	//1.non para constructor
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	   
	//2.private webelemnt
	@FindBy(id="header_sign_in")
	private WebElement sign;
	
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement txtUser;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement txtPass;

	public WebElement getSign() {
		return sign;
	}

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}
	
	
}
