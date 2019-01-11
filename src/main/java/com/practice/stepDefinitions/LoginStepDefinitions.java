//package com.practice.stepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import junit.framework.Assert;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class LoginStepDefinitions {
//	
////	Selenium +Java + Annotations
//
//	WebDriver driver;
//
//	@Given("^user is already on login page$")
//	public void user_is_already_on_login_page() throws Throwable {
//		System.setProperty("webdriver.chrome.driver",
//				"F:\\Jar_Files\\selenium\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://www.freecrm.com");
//		driver.manage().window().maximize();
//	}
//
//	@SuppressWarnings("deprecation")
//	@When("^title of login page is free CRM$")
//	public void title_of_login_page_is_free_CRM() throws Throwable {
//		String name = driver.getTitle();
//		System.out.println("Login page title is: " + name);
//		Assert.assertEquals(
//				"#1 Free CRM software in the cloud for sales and service", name);
//
//	}
//
////	 There are two types of regular expressions that can used to pass the data via step definitions
////	  a. \"(.*)\"
////	  b. \"([^\"]*)\"
//	
////	  Simple data driven without using Examples keyword
//	@Then("^user enters \"([^\"]*)\" and \"(.*)\"$")
//	public void user_enters_username_and_password(String username, String password) {
//		driver.findElement(By.name("username")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() throws Throwable {
//		driver.findElement(By.xpath("//div[@class='input-group-btn']/input"))
//				.click();
//	}
//
//	@SuppressWarnings("deprecation")
//	@Given("^get the title of home page$")
//	public void get_the_title_of_home_page() throws Throwable {
//		String title = driver.getTitle();
//		System.out.println("Home page title is: " + title);
//		Assert.assertEquals("CRMPRO", title);
//	}
//	
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password() throws Throwable {
//		driver.findElement(By.name("username")).sendKeys("prvidya");
//		driver.findElement(By.name("password")).sendKeys("Oneplus3T");
//	}
//	
//	@Then("^user moves to new contact page$")
//	public void user_moves_to_new_contact_page() throws Throwable {
//		driver.switchTo().frame("mainpanel");
//		
//		Actions hover = new Actions(driver);
//		hover.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//	   
//	}
//
//	@Then("^user enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_contact_details_and_and(String firstname, String lastname, String position) throws Throwable {
////		JavascriptExecutor js = (JavascriptExecutor)driver;
////	   js.executeScript("document.getElementById('first_name').value='hi';");
//		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
////		Other alternative to identify the element
////		Thread.sleep(2000)
////		Actions a = new Actions(driver);
////		a.sendKeys(driver.findElement(By.xpath("//input[@id='first_name']")), firstname);
////		a.perform();
//		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(firstname);
//	    driver.findElement(By.xpath("//input[@id='surname']")).sendKeys(lastname);
//	    driver.findElement(By.xpath("//input[@id='company_position']")).sendKeys(position);
//	    driver.findElement(By.className("button")).click();
//	}
//	
//	
//
//	@Then("^close the browser$")
//	public void close_the_browser() throws Throwable {
//	    driver.quit();
//	}
//	
//	
//
//}
