package com.project.pom;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Search_Test {
	private WebDriver driver;
	SearchPage searchPage;
	@Before
	public void setUp() throws Exception {
		searchPage =new SearchPage(driver);
		driver =searchPage.chromeDriverConnection();
		searchPage.visit("http://automationpractice.com/index.php");
	}
	@After
	public void tearDown() throws Exception {
		//driver.quiet();
	}
	@Test
	public void test() throws InterruptedException {
		searchPage.search_Blouses();
		assertEquals("7 results have been found.",searchPage.registeredMessage());
	}

}