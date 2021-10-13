package com.simplilearn.capstoneproject.FoodBoxATAppln.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class signupPage 
{
	@FindBy(id="inputfirstname")
	private WebElement firstnameTxtbox;
	
	@FindBy(id="lastname")
	private WebElement lastnameTxtbox;
	
	@FindBy(id="contactnumber")
	private WebElement contactnoTxtbox;
	
	@FindBy(id="email")
	private WebElement emailidTxtbox;
	
	@FindBy(id="address")
	private WebElement addressTxtbox;
	
	@FindBy(id="inputusername")
	private WebElement usernameTxtbox;
	
	@FindBy(id="inputnewPassword")
	private WebElement pwdTxtbox;
	
	@FindBy(name="signup")
	private WebElement signupBtn;
	
	@FindBy(name="addrerror")
	private WebElement addrErrormsg;
	
	@FindBy(name="contacterr")
	private WebElement contactnoErrormsg;
	
	WebDriver driver;

    public signupPage(WebDriver driver) 
    {
    	driver.get("http://localhost:4200/signup");
		this.driver = driver;
    }
    
    public void enterFirstname(String fnameToEnter) 
	{   firstnameTxtbox.clear();
		firstnameTxtbox.sendKeys(fnameToEnter);
	}


	public void enterLastname(String lnameToEnter) 
	{
		lastnameTxtbox.clear();
		lastnameTxtbox.sendKeys(lnameToEnter);
		
	}

	public void enterContactNo(String contactnoToEnter) 
	{   contactnoTxtbox.clear();
		contactnoTxtbox.sendKeys(contactnoToEnter);
	}


	public void enterEmailId(String emailidToEnter) 
	{
		emailidTxtbox.clear();
		emailidTxtbox.sendKeys(emailidToEnter);
	}

	public void enterAddress(String addressToEnter) 
	{   addressTxtbox.clear();
		addressTxtbox.sendKeys(addressToEnter);
	}

	public void enterUsername(String usernameToEnter) 
	{   usernameTxtbox.clear();
		usernameTxtbox.sendKeys(usernameToEnter);
	}

	public void enterPassword(String passwordToEnter) 
	{
		pwdTxtbox.clear();
		pwdTxtbox.sendKeys(passwordToEnter);
	}
	
	public void submit() {
		signupBtn.submit();
	}
	
	public boolean isaddrerrDisplayed()
	{
		return addrErrormsg.isDisplayed();
	}
	
	public String getaddrerrorText()
	{
		return addrErrormsg.getText();
	}
	
	public boolean iscontacterrDisplayed()
	{
		return contactnoErrormsg.isDisplayed();
	}
	
	public String getcontacterrorText()
	{
		return contactnoErrormsg.getText();
	}
}
