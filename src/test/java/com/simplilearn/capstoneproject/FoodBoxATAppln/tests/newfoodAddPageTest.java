package com.simplilearn.capstoneproject.FoodBoxATAppln.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.simplilearn.capstoneproject.FoodBoxATAppln.common.Base;
import com.simplilearn.capstoneproject.FoodBoxATAppln.pageobjects.newfoodAddPage;


public class newfoodAddPageTest 
{
	newfoodAddPage addpage;

	WebDriver driver;
	SoftAssert softaasert = new SoftAssert();

	@BeforeTest
	public void beforeTest() {
		driver = Base.driver;
	}

	@Test
	public void validateFoodname()
	{
		driver.get("http://localhost:4200/adminDashboard/managefooditems/addfooditem");

		addpage = PageFactory.initElements(driver, newfoodAddPage.class);
		
		addpage.enterFooddesc("Poori(2pcs) with channa masala and Raita");
		addpage.selectCuisine("Indian Cuisine");
		addpage.enterFoodprice("120.00");
		addpage.selectOffers("No offers");
		addpage.enterFoodimg("poori.jpg");
		addpage.selectStatus("available");
		
		addpage.submit();
		
		boolean result = addpage.isfoodnameerrDisplayed();
	     softaasert.assertEquals(result, true);
	        
	     String errortxt = addpage.getfoodnameerrorText();
	     softaasert.assertEquals(errortxt, "Foodname is required.");
	}
	
	@Test
	public void validateFoodprice()
	{
		driver.get("http://localhost:4200/adminDashboard/managefooditems/addfooditem");

		addpage = PageFactory.initElements(driver, newfoodAddPage.class);
		
		addpage.enterFoodname("Poori masala");
		addpage.enterFooddesc("Poori(2pcs) with channa masala and Raita");
		addpage.selectCuisine("Indian Cuisine");
		addpage.enterFoodprice("120");
		addpage.selectOffers("No offers");
		addpage.enterFoodimg("poori.jpg");
		addpage.selectStatus("available");
		
		addpage.submit();
		
		/*
		 * boolean result = addpage.ispriceerrDisplayed();
		 * softaasert.assertEquals(result, true);
		 * 
		 * String errortxt = addpage.getpriceerrorText();
		 * softaasert.assertEquals(errortxt, "Food price is invalid.");
		 */
	}
}
