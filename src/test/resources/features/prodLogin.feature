Feature: Login to the Prod website
	@Smoke
	Scenario: Verify Prod Login functionality
		Given User has valid credentials
		When user clicks on the url
		And enters "valid" username & "valid" password
		And clicks on login
		Then user is logged in successfully
		And user can see the home page
	@Smoke	
	Scenario Outline: Verify Prod Login functionality New
		Given User has valid credentials
		When user clicks on the url
		And enters "<username>" username & "<password>" password
		And clicks on login
		And user verifies the captcha
		Then user is logged in successfully
		And user can see the home page
		
Examples:
		|username|password|
		|valid   |valid   |
		|valid   |invalid |
		|invalid |valid   |
		|invalid |invalid |