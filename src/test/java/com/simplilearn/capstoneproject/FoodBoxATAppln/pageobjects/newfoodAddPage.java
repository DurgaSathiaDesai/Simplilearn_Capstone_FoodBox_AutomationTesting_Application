package com.simplilearn.capstoneproject.FoodBoxATAppln.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class newfoodAddPage 
{
	@FindBy(id="inputfoodname") 
	private WebElement foodnameTxtBox;
	
	@FindBy(id="desc") 
	private WebElement fooddescTxtBox;
	
	/*
	 * @FindBy(name="cuisines") private WebElement cuisinedropdown;
	 */
	
	@FindBy(id="inputprice") 
	private WebElement foodpriceTxtBox;
	
	/*
	 * @FindBy(name="offers") private WebElement offersdropdown;
	 */
	
	@FindBy(id="inputimage") 
	private WebElement foodimgTxtBox;
	
	/*
	 * @FindBy(name="status") private WebElement statusdropdown;
	 */
	
	@FindBy(name="nameerr")
	private WebElement foodnameErrormsg;
	
	/*
	 * @FindBy(name="priceerr") private WebElement priceErrormsg;
	 */
	
	@FindBy(name="add") 
	private WebElement addBtn;
	
	private WebDriver driver;

    public newfoodAddPage(WebDriver driver) 
    {
    	driver.get("http://localhost:4200/adminDashboard/managefooditems/addfooditem");
		this.driver = driver;
    }
    
    public void enterFoodname(String fnameToEnter) 
	{   foodnameTxtBox.clear();
		foodnameTxtBox.sendKeys(fnameToEnter);
	}
    
    public void enterFooddesc(String fdescToEnter) 
	{   fooddescTxtBox.clear();
		fooddescTxtBox.sendKeys(fdescToEnter);
	}
    
    public void selectCuisine(String cuisine) 
	{   
    	Select cuisines = new Select(driver.findElement(By.name("cuisines")));
    	cuisines.selectByValue(cuisine);
	}
    
    public void selectOffers(String offer) 
	{   
    	Select cuisines = new Select(driver.findElement(By.name("offers")));
    	cuisines.selectByValue(offer);
	}
    
    public void selectStatus(String status) 
	{   
    	Select cuisines = new Select(driver.findElement(By.name("status")));
    	cuisines.selectByValue(status);
	}
    
    public void enterFoodprice(String priceToEnter) 
	{   foodpriceTxtBox.clear();
		foodpriceTxtBox.sendKeys(priceToEnter);
	}
    
    public void enterFoodimg(String imgToEnter) 
	{   foodimgTxtBox.clear();
		foodimgTxtBox.sendKeys(imgToEnter);
	}
    
    public void submit() {
    	addBtn.submit();
	}
	
	public boolean isfoodnameerrDisplayed()
	{
		return foodnameErrormsg.isDisplayed();
	}
	
	public String getfoodnameerrorText()
	{
		return foodnameErrormsg.getText();
	}
	
	/*
	 * public boolean ispriceerrDisplayed() { return priceErrormsg.isDisplayed(); }
	 * 
	 * public String getpriceerrorText() { return priceErrormsg.getText(); }
	 */
}
