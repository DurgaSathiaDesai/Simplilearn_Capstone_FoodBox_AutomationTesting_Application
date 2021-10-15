package com.simplilearn.capstoneproject.FoodBoxATAppln.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.simplilearn.capstoneproject.FoodBoxATAppln.common.Base;
import com.simplilearn.capstoneproject.FoodBoxATAppln.pageobjects.pwdchangePage;

public class pwdchangePageTest 
{
	pwdchangePage changepage;

	WebDriver driver;
	SoftAssert softaasert = new SoftAssert();

	@BeforeTest
	public void beforeTest() {
		driver = Base.driver;
	}

	@Test
	public void updatePwdTest()
	{
		driver.get("http://localhost:4200/adminDashboard/changepwd");

		changepage = PageFactory.initElements(driver, pwdchangePage.class);
		
		changepage.enterOldPwd("admin1Jones");
		changepage.enterNewPwd("admin1Mary");
		changepage.enterConfirmPwd("admin12Mary");
		changepage.submit();
		
		boolean result = changepage.ispwderrDisplayed();
	    softaasert.assertEquals(result, true);
	        
	    String errortxt = changepage.getpwderrorText();
	    softaasert.assertEquals(errortxt, "New password and confirm password does not match!!");
	}
		
}
