package com.simplilearn.capstoneproject.FoodBoxATAppln.tests;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.simplilearn.capstoneproject.FoodBoxATAppln.common.Base;
import com.simplilearn.capstoneproject.FoodBoxATAppln.pageobjects.homePage;


public class homePageTest extends Base
{
	WebDriver driver;
	
	homePage homepage;
	
	String expectedURL;
	String actualURL;
	
	SoftAssert softaasert = new SoftAssert();
	@BeforeTest
	public void beforeTest() 
	{
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe"); driver = new
		 * ChromeDriver();
		 */
		driver = Base.driver;
	}
	
	@Test
    public void clickandvalidateFoodMenuLink() throws InterruptedException {
       
		driver.get("http://localhost:4200/home/about");
		
		homepage = PageFactory.initElements(driver, homePage.class);

		//Thread.sleep(3000);
             
        //homepage.loadHomePage();
        homepage.foodmenuClick();

        expectedURL = "http://localhost:4200/foodmenu";
        actualURL = homepage.isRedirected();
        softaasert.assertEquals(actualURL, expectedURL);
        
    }
	
	@Test
    public void clickandvalidateLoginLink() throws InterruptedException 
	{
		driver.get("http://localhost:4200/home/about");
		
		homepage = PageFactory.initElements(driver, homePage.class);
		
		homepage.loginClick();
        
        expectedURL = "http://localhost:4200/login";
        actualURL = homepage.isRedirected();
        softaasert.assertEquals(actualURL, expectedURL);
	}
	
	@Test
    public void clickandvalidateSignupLink() throws InterruptedException 
	{
		driver.get("http://localhost:4200/home/about");
		
		homepage = PageFactory.initElements(driver, homePage.class);
		
		homepage.signupClick();
        
        expectedURL = "http://localhost:4200/signup";
        actualURL = homepage.isRedirected();
        softaasert.assertEquals(actualURL, expectedURL);
	}

}
