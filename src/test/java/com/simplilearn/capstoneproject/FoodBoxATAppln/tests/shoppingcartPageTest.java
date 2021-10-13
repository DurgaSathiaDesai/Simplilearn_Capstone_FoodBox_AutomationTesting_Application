package com.simplilearn.capstoneproject.FoodBoxATAppln.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.simplilearn.capstoneproject.FoodBoxATAppln.common.Base;
import com.simplilearn.capstoneproject.FoodBoxATAppln.pageobjects.shoppingcartPage;


public class shoppingcartPageTest 
{
	shoppingcartPage cartpage;

	WebDriver driver;
	SoftAssert softaasert = new SoftAssert();

	@BeforeTest
	public void beforeTest() {
		driver = Base.driver;
	}

	@Test(priority=0)
	public void incQtyandCheck()
	{
		driver.get("http://localhost:4200/cartdetails");

		cartpage = PageFactory.initElements(driver, shoppingcartPage.class);
		
		cartpage.clickInc();
		
		String actualQty = cartpage.getQty();
		String expectedQty = "2";
		// System.out.println(actualname);
		softaasert.assertEquals(actualQty, expectedQty);

	}
	
	@Test(priority=1)
	public void decrQtyandCheck()
	{
		driver.get("http://localhost:4200/cartdetails");

		cartpage = PageFactory.initElements(driver, shoppingcartPage.class);
		
		cartpage.clickdecr();
		
		String actualQty = cartpage.getQty();
		String expectedQty = "1";
		// System.out.println(actualname);
		softaasert.assertEquals(actualQty, expectedQty);

	}
	
	@Test
	public void clickCheckout()
	{
		driver.get("http://localhost:4200/cartdetails");

		cartpage = PageFactory.initElements(driver, shoppingcartPage.class);
		 String expectedURL = "http://localhost:4200/checkout"; 
		  String actualURL = cartpage.isRedirected(); 
	  //System.out.println(actualURL);
	      softaasert.assertEquals(actualURL, expectedURL);
	}
}
