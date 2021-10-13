package com.simplilearn.capstoneproject.FoodBoxATAppln.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class foodmenuPage 
{
	@FindBy(id="listSearch")
	private WebElement searchfood;
	
	
	  @FindBy(tagName="i") 
	  private WebElement cart;
	 
	
	@FindBy(css="body > app-root > div > app-foodmenu > div.page-container.aligndisplay > div.card.mb-1.aligndisplay > div > div.col-sm-7 > div > h5")
	private WebElement foodname;
	
	@FindBy(id="Mexican Cuisine")
	private WebElement cuisine;
	
	@FindBy(tagName="h5") 
	private List<WebElement> foodcount;
	
	@FindBy(name="addFoodToCart")
	private List<WebElement> addtocartBtn;
	/*
	 * @FindBy(tagName="button") private List<WebElement> addtocartBtn;
	 */
	
	private WebDriver driver;

    public foodmenuPage(WebDriver driver) 
    {
    	driver.get("http://localhost:4200/foodmenu");
		this.driver = driver;
    }
    
    public void enterSearchKeyword(String cnameToEnter) 
	{   searchfood.clear();
		searchfood.sendKeys(cnameToEnter);
	}
    
    public String checkfoodname()
    {
    	return foodname.getText();
    }
    
	
	  public void clickCart() 
	  { 
		  cart.click(); 
	  }
	  
	  public void clickCuisine() 
	  { 
		  cuisine.click();
	  }
	  
	  public int fooditemsCount()
	  {
		  return foodcount.size();
	  }
	  
	  public void clickaddtocartBtn()
	  {
		  addtocartBtn.get(1).click();
	  }
	 
    
    public String isRedirected()
    {
    	
    	String actualURL = driver.getCurrentUrl();
    	//System.out.println(actualURL);
    	return actualURL;
    }
}
