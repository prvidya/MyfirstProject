package com.practice.stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepDefinition {
	
	@Before
	public void setUp(){
		System.out.println("Launnch FF browser");
		System.out.println("Enter freeCRM url");
	}
	
	@After
	public void tearDown(){
		System.out.println("Close the browser");
	}
	
	@Given("^user is on deal page$")
	public void user_is_on_deal_page() throws Throwable {
	    System.out.println("user is on deal page");
	}

	@When("^user fills the deal form$")
	public void user_fills_the_deal_form() throws Throwable {
	   System.out.println("user fills the deal form");
	}

	@Then("^deal is created$")
	public void deal_is_created() throws Throwable {
	  System.out.println("deal created");  
	}

	@Given("^user is on contact page$")
	public void user_is_on_contact_page() throws Throwable {
		System.out.println("user is on contact page");
	    	}

	@When("^user fills the contact form$")
	public void user_fills_the_contact_form() throws Throwable {
	    System.out.println("fills the contact form");
	}

	@Then("^contact is created$")
	public void contact_is_created() throws Throwable {
		System.out.println("create contact");  
	}

	@Given("^user is on mail page$")
	public void user_is_on_mail_page() throws Throwable {
		System.out.println("on mail page"); 
	}

	@When("^user fills the mail form$")
	public void user_fills_the_mail_form() throws Throwable {
		System.out.println("fills the mail form");
	}

	@Then("^mail is created$")
	public void mail_is_created() throws Throwable {
		System.out.println("mail created");
	}

}
