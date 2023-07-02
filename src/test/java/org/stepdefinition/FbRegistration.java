package org.stepdefinition;

import io.cucumber.datatable.*;

import java.util.List;
import java.util.Map;

import org.POJO.FbSignINPojo;
import org.sam.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbRegistration extends BaseClass {
	
	FbSignINPojo s;
	@Given("To launch the browser and to maximize the window")
	public void to_launch_the_browser_and_to_maximize_the_window() {
	    launchBrowser();
	    WindowMaximixe();
	}

	@When("To launch the url of the facebook application")
	public void to_launch_the_url_of_the_facebook_application() {
	    launchUrl("https://en-gb.facebook.com/");
	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() {
		s = new FbSignINPojo();
		clickBtn(s.getCreatenewaccnt());
	}

	@When("To pass firstname in firstname text box")
	public void to_pass_firstname_in_firstname_text_box(DataTable d) throws InterruptedException {
		Thread.sleep(5000);
		Map<String, String> m = d.asMap(String.class, String.class);
		
		s = new FbSignINPojo();
		passText(m.get("firstname3"), s.getFirstname());
	}

	@When("To pass secondname in secondname text box")
	public void to_pass_secondname_in_secondname_text_box() {
		s = new FbSignINPojo();
		passText("Saleem", s.getLastname());
	}

	@When("To pass mobileno or email in email text box")
	public void to_pass_mobileno_or_email_in_email_text_box(DataTable d) {
		s = new FbSignINPojo();
		List<Map<String, String>> m = d.asMaps();
		
		passText(m.get(0).get("password2"), s.getMobileoremail());
	}

	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box() {
		s = new FbSignINPojo();
		passText("12345678", s.getNewpassword());
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	    closeEntireBrowser();
	}
}
