package com.simplilearn.capstoneproject.FoodBoxATAppln.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pwdchangePage 
{
	@FindBy(id="inputoldPassword") 
	private WebElement oldpwdTxtBox;
	
	@FindBy(id="inputnewPassword") 
	private WebElement newpwdTxtBox;
	
	@FindBy(id="inputconfirmPassword") 
	private WebElement confirmpwdTxtBox;
	
	@FindBy(name="update") 
	private WebElement updateBtn;
	
	@FindBy(xpath="/html/body/app-root/div/app-admindashboard/app-changepwd/div/form/div[3]")
	private WebElement pwdErrormsg;
	
	private WebDriver driver;

    public pwdchangePage(WebDriver driver) 
    {
    	driver.get("http://localhost:4200/adminDashboard/changepwd");
		this.driver = driver;
    }
    
    public void enterOldPwd(String pwdToEnter) 
	{   oldpwdTxtBox.clear();
		oldpwdTxtBox.sendKeys(pwdToEnter);
	}
    
    public void enterNewPwd(String pwdToEnter) 
	{   newpwdTxtBox.clear();
		newpwdTxtBox.sendKeys(pwdToEnter);
	}
    
    public void enterConfirmPwd(String pwdToEnter) 
	{   confirmpwdTxtBox.clear();
		confirmpwdTxtBox.sendKeys(pwdToEnter);
	}
    
    public void submit() {
    	updateBtn.submit();
	}
    
    public boolean ispwderrDisplayed()
	{
		return pwdErrormsg.isDisplayed();
	}
	
	public String getpwderrorText()
	{
		return pwdErrormsg.getText();
	}
}
