package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigninPage extends Base{
	By signInLocator =By.linkText("Sign in");
	By usernameEmail = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input");
	By passwordhomeLocator = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/input");
	By BtnLogin=By.name("SubmitLogin");
	By registerPageLocator1 =By.xpath("//*[@id=\"center_column\"]/h1");
	By registerPageLocator2 =By.xpath("/html/body/div/div[2]/div/div[3]/div/h1");
	

	public SigninPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void signIn () throws InterruptedException {
		click (signInLocator);
		Thread.sleep(2000);
		if (isDisplayed(registerPageLocator1)) {
			type("yaleonr10@gmail.com",usernameEmail);
			type("juanperez",passwordhomeLocator);
			click(BtnLogin);	
		}
		else {
			System.out.println("login incompleto");
		}
	}
	public String registeredMessage() {
		WebElement fonts = findElement(registerPageLocator2);
	    return getText(fonts);
	}
	
}
