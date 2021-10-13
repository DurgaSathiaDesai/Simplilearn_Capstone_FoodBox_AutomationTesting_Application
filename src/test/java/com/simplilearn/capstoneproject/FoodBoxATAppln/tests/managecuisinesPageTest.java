package com.simplilearn.capstoneproject.FoodBoxATAppln.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.simplilearn.capstoneproject.FoodBoxATAppln.common.Base;
import com.simplilearn.capstoneproject.FoodBoxATAppln.pageobjects.managecuisinesPage;

public class managecuisinesPageTest 
{
	managecuisinesPage cuisinepage;
	
	WebDriver driver;
	SoftAssert softaasert = new SoftAssert();
	
	@BeforeTest
	public void beforeTest() 
	{
		driver = Base.driver;
	}
	
	@Test(priority=0)
	public void addnewCuisine()
	{
		driver.get("http://localhost:4200/adminDashboard/managecuisines");
		
		cuisinepage = PageFactory.initElements(driver, managecuisinesPage.class);
		
		cuisinepage.addCuisine("Japanese Cuisine");
		
		
		  //WebDriverWait wait=new WebDriverWait(driver, 8000);
			/*
			 * boolean result = cuisinepage.issuccessmsgDisplayed();
			 * softaasert.assertEquals(result, true);
			 * 
			 * String successtxt = cuisinepage.getsuccessText();
			 * softaasert.assertEquals(successtxt, "Cuisine added successfully!!");
			 */
	}
	
	@Test(priority=1)
	public void addExistingCuisine()
	{
		driver.get("http://localhost:4200/adminDashboard/managecuisines");
		
		cuisinepage = PageFactory.initElements(driver, managecuisinesPage.class);
		
		cuisinepage.addCuisine("Japanese Cuisine");
		
		//WebDriverWait wait=new WebDriverWait(driver, 5000);
		
		boolean result = cuisinepage.iserrormsgDisplayed();
        softaasert.assertEquals(result, true);
        
        String errortxt = cuisinepage.geterrorText();
        softaasert.assertEquals(errortxt, "Cuisine already exists!!!");
	}
}
