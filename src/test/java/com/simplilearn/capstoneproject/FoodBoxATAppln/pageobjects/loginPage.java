package com.simplilearn.capstoneproject.FoodBoxATAppln.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage 
{
	@FindBy(id="inputusername")
	private WebElement username;
	
	@FindBy(id="inputPassword")
	private WebElement pwd;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	@FindBy(id="errormsg")
	private WebElement errormsg;
	
	private WebDriver driver;

    public loginPage(WebDriver driver) 
    {
    	driver.get("http://localhost:4200/login");
		this.driver = driver;
    }
    
	public void enterUsername(String usernameToEnter) 
	{   username.clear();
		username.sendKeys(usernameToEnter);
	}

	//enterPassword
	public void enterPassword(String passwordToEnter) 
	{
		pwd.clear();
		pwd.sendKeys(passwordToEnter);
	}

	//submit
	public void submit() {
		loginbtn.submit();
	}
	
	public void login(String name, String password) {
		enterUsername(name);
		enterPassword(password);
		submit();
	}
	
	public String isRedirected()
    {
    	
    	String actualURL = driver.getCurrentUrl();
    	//System.out.println(actualURL);
    	return actualURL;
    }
	
	public boolean isDisplayed()
	{
		return errormsg.isDisplayed();
	}
	
	public String geterrorText()
	{
		return errormsg.getText();
	}
	
}
