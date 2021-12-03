package com.project.pom;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SearchPage extends Base {
	  
	public SearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	WebDriver driver;
	By searchBoxLocator= By.id ("search_query_top");
	By btnLocator = By.name("submit_search");
	By resultLocator = By.cssSelector("span.heading-counter");
	
  @BeforeClass
  public void beforeClass() {
	  
	    System.setProperty("webdriver.chrome.driver","./src/test/resources/chromeDriver/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	  
  }
  
  @Test
  public void search_Blouses() throws InterruptedException {
	  type("Dresses",searchBoxLocator);
		Thread.sleep(2000);
		click(btnLocator);
	  
	   //WebElement searchbox=driver.findElement(searchBoxLocator);
	   //searchbox.clear();
	   //searchbox.sendKeys("blouse");
	   //searchbox.submit();
	}
	public String registeredMessage() {
		WebElement fonts = findElement(resultLocator);
	    return getText(fonts);
	}
  
  

  @AfterClass
  public void afterClass() {
	 // driver.close()
  }
 
 
}