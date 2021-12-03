package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Signin_Test {
	private WebDriver driver;
	SigninPage signinPage;
	@Before
	public void setUp() throws Exception {
		signinPage=new SigninPage(driver);
		driver =signinPage.chromeDriverConnection();
		signinPage.visit("http://automationpractice.com/index.php");
		
	}
	@After
	public void tearDown() throws Exception {
		//driver.quiet();
	}
	@Test
	public void test() throws InterruptedException {
		signinPage.signIn();
		assertEquals("MY ACCOUNT",signinPage.registeredMessage());
	}
}
