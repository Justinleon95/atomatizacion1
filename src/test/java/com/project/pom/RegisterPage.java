package com.project.pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends Base {
	By signInLocator =By.linkText("Sign in");
	By SignInCorreo =By.id ("email_create");
	By signInCreater =By.name("SubmitCreate");
	By registerPageLocator1 =By.xpath("//*[@id=\"center_column\"]/h1");
	By registerPageLocator2 =By.xpath("//*[@id=\"noSlide\"]/h1");
	By Gender= By.id("id_gender1");
	By firstname =By.name("customer_firstname");
	By lastname =By.name("customer_lastname");
	By Password =By.id("passwd");
	By year = By.id("years");
	By month = By.id("months");
	By day = By.id("days");
	By company =By.id("company");
	By Address1 =By.id("address1");
	By Address2 =By.id("address2");
	By City =By.name("city");
	By State =By.name("id_state");
	By Zip =By.name("postcode");
	By Country =By.name("id_country");
	By Phone =By.name("phone_mobile");
	By submitAccount =By.name("submitAccount");
	By registerPageLocator3 =By.xpath("//*[@id=\"my-account\"]");
	By registerPageLocator4 =By.xpath("/html/body/div/div[2]/div/div[3]/div/h1");
	
	By signOutLocator =By.linkText("Sign out");
	By registeredMessage =By.tagName("font");
	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public String generateMail() {
		Integer i = 10;
		String theAlphaNumericS;
		StringBuilder builder;
		theAlphaNumericS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
        builder = new StringBuilder(i); 
        for (int m = 0; m < i; m++) { 
            int myindex = (int)(theAlphaNumericS.length() * Math.random());
            builder.append(theAlphaNumericS.charAt(myindex)); 
        } 
        return builder.toString(); 
	}
	
	public void registerUser() throws InterruptedException {
		click(signInLocator);
		Thread.sleep(2000);
		if (isDisplayed(registerPageLocator1)) {
			type(generateMail() + "@gmail.com",SignInCorreo);
			click(signInCreater);
			Thread.sleep(2000);
			if (isDisplayed(registerPageLocator2)){
				click(Gender);
				type("Yostin",firstname);
				type("Adrian",lastname);
				type("choucairTesting",company);
				type("123456",Password);
				type("Cra68",Address1);
				select(findElement(year),"1995");
				select(findElement(month),"4");
				select(findElement(day),"6");
				type("Casa 1",Address2);
				type("Bogota",City);
				select(findElement(State),"3");
				type("10101",Zip);
				select(findElement(Country),"21");
				type("3103424228",Phone);
				Thread.sleep(2000);
				click(submitAccount);
				if (isDisplayed(registerPageLocator3)) {
					System.out.println("Prueba ejecutada exitosa");
				} else  {
					System.out.println("creacion de cuenta incompleto");
				}
			} else  {
				System.out.println("personal information mail incompleto");
			}
		}
		else {
			System.out.println("sign in incompleto");
		}
	}
	
	public String registeredMessage() {
		WebElement fonts = findElement(registerPageLocator4);
	    return getText(fonts);
		
	}
}
