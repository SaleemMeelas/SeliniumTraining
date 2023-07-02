package org.stepdefinition;

import org.sam.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {
	
	@Before(order = 1)
	//precondition
	private void precondition2() {
		launchBrowser();
		System.out.println("Launch the Browser");
	}
	
	@Before(order = 2)
	//precondition
	private void precondition1() {
		WindowMaximixe();
		System.out.println("Maximized the Window");
	}
	
	@Before(order = 3, value = "@Login2")
	//precondition
	private void precondition3() {
		System.out.println("Precondition 3");
	}
	
	@After(order = 2, value = "@Login2")
	//postcondition
	private void postcondition2() {
		System.out.println("Take Screenshot of Scrnarios");
	}
	
	@After(order = 1)
	//postcondition
	private void postcondition1() {
		closeEntireBrowser();
		System.out.println("Close Entire Browser");
	}

}
