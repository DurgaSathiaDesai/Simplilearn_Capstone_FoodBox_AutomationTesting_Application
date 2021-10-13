package com.simplilearn.capstoneproject.FoodBoxATAppln.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class managecuisinesPage 
{
	@FindBy(id="cuisinename")
	private WebElement cuisinename;
	
	@FindBy(name="add")
	private WebElement addbtn;
	
	@FindBy(id="errormsg")
	private WebElement errormsg;
	
	/*
	 * @FindBy(name="msg") private WebElement successmsg;
	 */
	
	WebDriver driver;

    public managecuisinesPage(WebDriver driver) 
    {
    	driver.get("http://localhost:4200/adminDashboard/managecuisines");
		this.driver = driver;
    }
    
    public void enterCuisinename(String cnameToEnter) 
	{   cuisinename.clear();
		cuisinename.sendKeys(cnameToEnter);
	}
    
    public void submit() {
    	addbtn.submit();
	}
    
    public void addCuisine(String name) {
    	enterCuisinename(name);
		submit();
	}
    
    public boolean iserrormsgDisplayed()
	{
		return errormsg.isDisplayed();
	}
	
	public String geterrorText()
	{
		return errormsg.getText();
	}
	
	/*
	 * public boolean issuccessmsgDisplayed() { return successmsg.isDisplayed(); }
	 * 
	 * public String getsuccessText() { return successmsg.getText(); }
	 */
	 
}
