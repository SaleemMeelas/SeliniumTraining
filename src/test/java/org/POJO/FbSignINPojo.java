package org.POJO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sam.BaseClass;

public class FbSignINPojo extends BaseClass {
	
	public FbSignINPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement createnewaccnt;
	
	@FindBy(name = "firstname")
	private WebElement firstname;
	
	@FindBy(name = "lastname")
	private WebElement lastname;
	
	@FindBy(name = "reg_email__")
	private WebElement mobileoremail;
	
	@FindBy(id = "password_step_input")
	private WebElement newpassword;

	public WebElement getCreatenewaccnt() {
		return createnewaccnt;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getMobileoremail() {
		return mobileoremail;
	}

	public WebElement getNewpassword() {
		return newpassword;
	}
}
