package com.simplilearn.capstoneproject.FoodBoxATAppln.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.simplilearn.capstoneproject.FoodBoxATAppln.common.Base;
import com.simplilearn.capstoneproject.FoodBoxATAppln.pageobjects.signupPage;

public class signupPageTest 
{
	WebDriver driver;
	
	signupPage signuppage;
	
	String expectedURL;
	String actualURL;
	
	SoftAssert softaasert = new SoftAssert();
	
	@BeforeTest
	public void beforeTest() 
	{
		driver = Base.driver;
	}
	
	@Test
	public void registerValidateAddress()
	{
		driver.get("http://localhost:4200/signup");
		
		signuppage = PageFactory.initElements(driver, signupPage.class);
		
		signuppage.enterFirstname("Devi");
		signuppage.enterLastname("priya");
		signuppage.enterContactNo("9456872390");
		signuppage.enterEmailId("devi123@gmail.com");
		signuppage.enterUsername("DeviPriya");
		signuppage.enterPassword("DPriya1234");
		signuppage.submit();
		
		 boolean result = signuppage.isaddrerrDisplayed();
	     softaasert.assertEquals(result, true);
	        
	     String errortxt = signuppage.getaddrerrorText();
	     softaasert.assertEquals(errortxt, "Address is required.");
	}
	
	@Test
	public void registerValidateContactNo()
	{
		driver.get("http://localhost:4200/signup");
		
		signuppage = PageFactory.initElements(driver, signupPage.class);
		
		signuppage.enterFirstname("Devi");
		signuppage.enterLastname("priya");
		signuppage.enterContactNo("945687239");
		signuppage.enterAddress("23,J.P Nagar,Bengaluru");
		signuppage.enterEmailId("devi123@gmail.com");
		signuppage.enterUsername("DeviPriya");
		signuppage.enterPassword("DPriya1234");
		signuppage.submit();
		
		 boolean result = signuppage.iscontacterrDisplayed();
	     softaasert.assertEquals(result, true);
	        
	     String errortxt = signuppage.getcontacterrorText();
	     softaasert.assertEquals(errortxt, "ContactNumber must be in 10 digits!!");
	}
	
	
}
