package org.stepdefinition;

import org.POJO.FbLoginPOJO;
import org.sam.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Fblogin extends BaseClass {

	FbLoginPOJO f;
	@Given("To launch the chrome browser and maximize window")
	public void to_launch_the_chrome_browser_and_maximize_window() {
	    launchBrowser();
	    WindowMaximixe();
	}

	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field() {
	    f = new FbLoginPOJO();
	    passText("salshi1926@gmail.com", f.getEmail());
	}

	@When("To pass invalid password in password field")
	public void to_pass_invalid_password_in_password_field() {
		f = new FbLoginPOJO();
		passText("meelas67", f.getPassword());
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		f = new FbLoginPOJO();
		clickBtn(f.getLoginbtn());
	}

	@When("To check weather navigate to homepage or not")
	public void to_check_weather_navigate_to_homepage_or_not() {
	    System.out.println("Check dteails entered by User");
	}
}
