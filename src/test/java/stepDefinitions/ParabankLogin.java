package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import Utilis.SeleniumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.base.BasePage;
import pages.object.LoginPage;

public class ParabankLogin {
	
	public static WebDriver driver;
	BasePage base = new BasePage();
	LoginPage login = new LoginPage();
	
	
	@Given("the user has navigated to the website")
	public void the_user_has_navigated_to_the_website() {
	    
		base.getWebsiteFromConfig();
		
	}
	
	@Then("user verifies the home page title")
	public void user_verifies_the_home_page_title() {
		


	}
	
	@Then("user verifies the login page title")
	public void user_verifies_the_login_page_title() {
		
		login.pageTitleValidation();

	}
	
	@Then("verifies the home page links")
	public void verifies_the_home_page_links() {
	    
	}
	
	@When("user clicks on the {string} link")
	public void user_clicks_on_the_link(String string) {
	    
	}
	
	@Then("registration page is displayed and all the fields are present")
	public void registration_page_is_displayed_and_all_the_fields_are_present() {
	    
	}
	
	@And("User enters the data in the fields")
	public void user_enters_the_data_in_the_fields() {
	    
	}
	
	@And("user clicks on the {string} button")
	public void user_clicks_on_the_button(String string) {
	    
	}
	
	@And("verify that user is registered successfully")
	public void verify_that_user_is_registered_successfully() {
	    
	}
	
	@When("user enters the {string} & {string} and clicks on login button")
	public void user_enters_the_and_clicks_on_login_button(String username, String password) {
		
		login.login(username, password);
	    
	}
	
	@Then("User should be logged in if {string} & {string} are valid")
	public void user_should_be_logged_in_if_are_valid(String string, String string2) {
	    login.loginPageVerification(string, string2);
	}
	
	@Then("error should be displayed if it is ID, password is invalid")
	public void error_should_be_displayed_if_it_is_id_password_is_invalid() {
	    login.invalidLoginVerification();
	}
	
	@Given("user is logged into the website")
	public void user_is_logged_into_the_website() {
	   
	}

	@Then("{string} page should be displayed")
	public void page_should_be_displayed(String string) {
	    
	}
	
	@Then("verifies the login page links")
	public void verifies_the_login_page_links() {
	    
	}
	
	@And("user enters the details to open the account")
	public void user_enters_the_details_to_open_the_account() {
	    
	}

	@And("verify that account is opened and account number is assigned")
	public void verify_that_account_is_opened_and_account_number_is_assigned() {
	    
	}
}
