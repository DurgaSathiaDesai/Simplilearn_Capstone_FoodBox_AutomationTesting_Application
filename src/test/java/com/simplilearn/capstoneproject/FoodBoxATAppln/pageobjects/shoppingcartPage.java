package com.simplilearn.capstoneproject.FoodBoxATAppln.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class shoppingcartPage 
{
	 //@FindBy(tagName="button")
		//private List<WebElement> qtychangeBtn;
	  @FindBy(name="incrQty") 
	  private WebElement incrQtyBtn;
	 
	  @FindBy(name="decrQty") 
	  private WebElement decrQtyBtn;
	 
		/*
		 * @FindBy(tagName="span") private List<WebElement> quantity;
		 */
	  @FindBy(name="Qty") 
	  private WebElement quantity;
	  
	  @FindBy(linkText="CheckOut") 
	  private WebElement checkout;
	  WebDriver driver;

	  public shoppingcartPage(WebDriver driver) 
	  {
		  driver.get("http://localhost:4200/cartdetails");
		  this.driver = driver;
	  }
	    
	  public void clickInc()
	  {
		  incrQtyBtn.click();
	  }
	  
	  public void clickdecr()
	  {
		  decrQtyBtn.click();
	  }
	  
	  public String getQty()
	  {
		  return quantity.getText();
	  }
	  
	  public void clickcheckout()
	  {
		  checkout.click();
	  }
	  
	  public String isRedirected()
	    {
	    	
	    	String actualURL = driver.getCurrentUrl();
	    	//System.out.println(actualURL);
	    	return actualURL;
	    }
}
