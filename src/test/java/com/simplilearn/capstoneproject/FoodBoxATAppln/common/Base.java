package com.simplilearn.capstoneproject.FoodBoxATAppln.common;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base 
{
	/*
	 * protected WebDriver driver;
	 * 
	 * @Before public void setUp() throws Exception {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe"); driver = new
	 * ChromeDriver(); }
	 * 
	 * @After public void tearDown() throws Exception { driver.quit(); }
	 */
	
	public static WebDriver driver = null;
	  
    @BeforeSuite
    public void initialize() throws IOException {
  
    	System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
    
        driver = new ChromeDriver();
    
        // To maximize browser
        driver.manage().window().maximize();
    
        
    }
  
    @AfterSuite
    // Test cleanup
    public void TeardownTest() {
       //Base.driver.quit();
    }
}
