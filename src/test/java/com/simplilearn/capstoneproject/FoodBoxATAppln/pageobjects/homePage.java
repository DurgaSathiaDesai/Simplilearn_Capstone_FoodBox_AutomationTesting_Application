package com.simplilearn.capstoneproject.FoodBoxATAppln.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage 
{
	@FindBy(linkText = "Food menu")
    private WebElement foodMenu;
	
	@FindBy(linkText = "Signup")
    private WebElement signup;
	
	@FindBy(linkText = "Login")
    private WebElement login;
	
	private WebDriver driver;

    public homePage(WebDriver driver) 
    {
    	driver.get("http://localhost:4200/home/about");
		this.driver = driver;
    }
    
    public void foodmenuClick()
    {
    	foodMenu.click();
    }
    
    public void loginClick()
    {
    	login.click();
    }
    
    public void signupClick()
    {
    	signup.click();
    }
	/*
	 * public void loadHomePage() { driver.get("http://localhost:4200/home/about");
	 * }
	 */
	 
    
    public String isRedirected()
    {
    	
    	String actualURL = driver.getCurrentUrl();
    	//System.out.println(actualURL);
    	return actualURL;
    }

}
