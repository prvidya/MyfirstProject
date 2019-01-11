package com.practice.stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

// Data table with maps : for parameterization of test cases

public class DealsStepWithMapDefinition {
	
WebDriver driver;
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Jar_Files\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com");
		driver.manage().window().maximize();
	}
	
	@SuppressWarnings("deprecation")
	@When("^title of login page is free CRM$")
	public void title_of_login_page_is_free_CRM() throws Throwable {
		String name = driver.getTitle();
		System.out.println("Login page title is: " + name);
		Assert.assertEquals(
				"#1 Free CRM software in the cloud for sales and service", name);

	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) {
		for(Map<String, String> data : credentials.asMaps(String.class, String.class)) {
		driver.findElement(By.name("username")).sendKeys(data.get("username"));
		driver.findElement(By.name("password")).sendKeys(data.get("password"));
	}
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//div[@class='input-group-btn']/input"))
				.click();
	}
	
	@SuppressWarnings("deprecation")
	@Given("^get the title of home page$")
	public void get_the_title_of_home_page() throws Throwable {
		String title = driver.getTitle();
		System.out.println("Home page title is: " + title);
		Assert.assertEquals("CRMPRO", title);
	}
	
	
	@Then("^user moves to new deal page$")
	public void user_moves_to_new_contact_page() throws Throwable {
		driver.switchTo().frame("mainpanel");
		Actions hover = new Actions(driver);
		hover.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	   }
	
	@Then("^user enters deal details$")
	public void user_enters_contact_details(DataTable dealData) throws Throwable {
		 for(Map<String, String> dealValues : dealData.asMaps(String.class, String.class)){

			 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		driver.findElement(By.xpath("//input[@id='title']")).sendKeys(dealValues.get("title"));
	    driver.findElement(By.xpath("//input[@id='amount']")).sendKeys(dealValues.get("amount"));
	    driver.findElement(By.xpath("//input[@id='probability']")).sendKeys(dealValues.get("probability"));
	    driver.findElement(By.xpath("//input[@id='commission']")).sendKeys(dealValues.get("commission"));
	    driver.findElement(By.className("button")).click();
	    
	    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	    
	    // move to new deal page
	    
	    Actions hover = new Actions(driver);
		hover.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
		
		
	    
	}
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    driver.quit();
	}

	

}
