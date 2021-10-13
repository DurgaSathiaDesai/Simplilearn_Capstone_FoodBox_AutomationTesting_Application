package com.simplilearn.capstoneproject.FoodBoxATAppln.tests;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.simplilearn.capstoneproject.FoodBoxATAppln.common.Base;

import com.simplilearn.capstoneproject.FoodBoxATAppln.pageobjects.loginPage;

public class loginPageTest 
{
	WebDriver driver;
	
	loginPage loginpage;
	
	String expectedURL;
	String actualURL;
	
	SoftAssert softaasert = new SoftAssert();
	
	@BeforeTest
	public void beforeTest() 
	{
		driver = Base.driver;
	}
	
	@Test
	public void validateUserLoginWithValidCreds()
	{
		driver.get("http://localhost:4200/login");
		
		loginpage = PageFactory.initElements(driver, loginPage.class);
		
		loginpage.login("PaulWalker", "Paul1234");
		
		//FluentWait wait = new FluentWait(driver);
		//Specify the timout of the wait
		//wait.withTimeout(5000, TimeUnit.SECONDS);
		
		expectedURL = "http://localhost:4200/foodmenu";
        actualURL = loginpage.isRedirected();
        softaasert.assertEquals(actualURL, expectedURL);
	}
	
	
	@Test
	public void validateAdminLoginWithValidCreds()
	{
		driver.get("http://localhost:4200/login");
		
		loginpage = PageFactory.initElements(driver, loginPage.class);
		
		loginpage.login("MaryJones", "admin1Mary");
		
		/*
		 * FluentWait wait = new FluentWait(driver); //Specify the timout of the wait
		 * wait.withTimeout(5000, TimeUnit.SECONDS);
		 */
		
		expectedURL = "http://localhost:4200/adminDashboard/managecuisines";
        actualURL = loginpage.isRedirected();
        softaasert.assertEquals(actualURL, expectedURL);
	}
	
	@Test
	public void validateUserLoginWithInValidCreds()
	{
		driver.get("http://localhost:4200/login");
		
		loginpage = PageFactory.initElements(driver, loginPage.class);
		
		loginpage.login("PaulWalker", "Paul6734");
		
		/*
		 * FluentWait wait = new FluentWait(driver); //Specify the timout of the wait
		 * wait.withTimeout(5000, TimeUnit.SECONDS);
		 */
		expectedURL = "http://localhost:4200/login";
        actualURL = loginpage.isRedirected();
        softaasert.assertEquals(actualURL, expectedURL);
        
        boolean result = loginpage.isDisplayed();
        softaasert.assertEquals(result, true);
        
        String errortxt = loginpage.geterrorText();
        softaasert.assertEquals(errortxt, "Invalid Credentials !!");
	}
}
