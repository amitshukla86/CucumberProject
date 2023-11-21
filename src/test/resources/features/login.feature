@Smoke
Feature: Login to the website

	Background:
		Given User has valid credentials
		When user clicks on the url
	
	Scenario: Verify Login functionality
		And enters "valid" username & "valid" password
		And clicks on login
		Then user is logged in successfully
		And user can see the home page
		
	Scenario Outline: Verify Login functionality New
		And enters "<username>" username & "<password>" password
		And clicks on login
		Then user is logged in successfully
		And user can see the home page
		
Examples:
		|username|password|
		|valid   |valid   |
		|valid   |invalid |
		|invalid |valid   |
		|invalid |invalid |