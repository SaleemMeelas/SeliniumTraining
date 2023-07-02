package org.POJO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sam.BaseClass;

public class FbLoginPOJO extends BaseClass {
	
	//1. Non Parameterized Constructor
	public FbLoginPOJO() {
		PageFactory.initElements(driver, this);
	}

	//2. Private WebElement
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(xpath = "//input[@aria-label='Password']")
	private WebElement password;
	
	@FindBy(name = "login")
	private WebElement loginbtn;
	
	//3. Getters to access WebElements Outside the Class
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
}
