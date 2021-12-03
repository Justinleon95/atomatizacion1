package com.project.pom;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
public class Register_Test {
	private WebDriver driver;
	RegisterPage registerPage;
	@Before
	public void setUp() throws Exception {
		registerPage =new RegisterPage(driver);
		driver =registerPage.chromeDriverConnection();
		registerPage.visit("http://automationpractice.com/index.php");
	}
	@After
	public void tearDown() throws Exception {
		//driver.quiet();
	}
	@Test
	public void test() throws InterruptedException {
		registerPage.registerUser();
		assertEquals("MY ACCOUNT",registerPage.registeredMessage());
	}

}
