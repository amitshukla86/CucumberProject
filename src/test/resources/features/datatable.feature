@Smoke
Feature: Login to the website

	Background:
		Given User has valid credentials
		When user clicks on the url
	
	Scenario: Verify Login functionality
		And enters "valid" username & "valid" password
		And clicks on login
		Then user is logged in successfully
		And user enters its "firstname" & "lastname"
			| Adam   | Scott   |
			| Tina   | Scott   |
		And user can see the home page
		
