package pages.object;

import static org.testng.Assert.assertEquals;

import org.testng.asserts.SoftAssert;

import Utilis.SeleniumDriver;
import pages.base.BasePage;

public class LoginPage extends BasePage {
	
	SoftAssert softAssert = new SoftAssert();
	
	public String login(String username,String password) {
		
		type("userName_Xpath",username);
		type("password_Xpath",password);
		click("loginButton_Xpath");
		
		return username;
		
	}
	
	public void loginPageVerification(String username,String password) {
		
		String text = getText("loginText_Xpath");
		String welcomeMsg = getText("loginTitle_Xpath");
		System.out.println(text);
		softAssert.assertEquals(text, "Your account was created successfully. You are now logged in.");
		String userNameExpected = login(username, password);
		softAssert.assertEquals("Welcome "+userNameExpected,welcomeMsg);
		softAssert.assertAll();
	}
	
	public void invalidLoginVerification() {
		String errorText = getText("loginErrorText_Xpath");
		System.out.println(errorText);
		softAssert.assertEquals(errorText, "The username and password could not be verified.");
		softAssert.assertAll();
	}
	
	public void pageTitleValidation() {
		String title = null;
		title = getText("loginPageTitle_Xpath");
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(title, "ParaBank");
	}
		
}
