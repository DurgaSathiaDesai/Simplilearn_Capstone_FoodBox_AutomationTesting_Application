package com.simplilearn.capstoneproject.FoodBoxATAppln.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.simplilearn.capstoneproject.FoodBoxATAppln.common.Base;
import com.simplilearn.capstoneproject.FoodBoxATAppln.pageobjects.foodmenuPage;

public class foodmenuPageTest {
	foodmenuPage foodmenupage;

	WebDriver driver;
	SoftAssert softaasert = new SoftAssert();

	@BeforeTest
	public void beforeTest() {
		driver = Base.driver;
	}

	@Test(priority=1)
	public void searchFooditem() {
		driver.get("http://localhost:4200/foodmenu");

		foodmenupage = PageFactory.initElements(driver, foodmenuPage.class);

		foodmenupage.enterSearchKeyword("lasagna");
		String actualname = foodmenupage.checkfoodname();
		String expectedname = "Authentic Italian Lasagna";
		// System.out.println(actualname);
		softaasert.assertEquals(actualname, expectedname);
	}

	
	  @Test
	  public void clickRedirectToCartPage() 
	  {
		  driver.get("http://localhost:4200/foodmenu");
		  foodmenupage = PageFactory.initElements(driver, foodmenuPage.class);
		  
		  foodmenupage.clickCart();
	  
		  String expectedURL = "http://localhost:4200/cartdetails"; 
		  String actualURL = foodmenupage.isRedirected(); 
	  //System.out.println(actualURL);
	      softaasert.assertEquals(actualURL, expectedURL);
	  
	  }
	 
	  @Test 
	  public void clickCuisine() 
	  {
		  driver.get("http://localhost:4200/foodmenu");
		  foodmenupage = PageFactory.initElements(driver, foodmenuPage.class);
		  
		  foodmenupage.clickCuisine();
		  
		  int actualcount = foodmenupage.fooditemsCount();
		  System.out.println(actualcount);
		  softaasert.assertEquals(actualcount, 2);
	  }
	  
	  @Test(priority=0)
	  public void clickAddToCart() 
	  {
		  driver.get("http://localhost:4200/foodmenu");
		  foodmenupage = PageFactory.initElements(driver, foodmenuPage.class);
		  
		  foodmenupage.clickaddtocartBtn();
		  
		  //foodmenupage.clickCart();
	  }

}
