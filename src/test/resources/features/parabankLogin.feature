Feature: Verify Parabank website scenarios

	Scenario: Login page validation
  	Given the user has navigated to the website
  	Then user verifies the login page title
  	And verifies the login page links

  #Scenario: Bank registration
    #Given the user has navigated to the website
    #When user clicks on the "Register" link
    #Then registration page is displayed and all the fields are present
    #And User enters the data in the fields
    #And user clicks on the "Register" button
    #And verify that user is registered successfully

  Scenario Outline: Valid Login to the website
    Given the user has navigated to the website
    When user enters the "<ID>" & "<Password>" and clicks on login button
    Then User should be logged in if "<ID>" & "<Password>" are valid

    Examples: 
      | ID    | Password |
      | amit  | amit     |

	Scenario Outline: Invalid Login to the website
    Given the user has navigated to the website
    When user enters the "<ID>" & "<Password>" and clicks on login button
    Then error should be displayed if it is ID, password is invalid

    Examples: 
      | ID    | Password |
      | amit  | shukla   |
      | amit1 | amit     |
      | abcd  | efghi    |

#	Scenario: Home page validation
  #	Given the user has navigated to the website
  #	Then user verifies the home page title
  #	And verifies the home page links
#
#
  #Scenario: Open new account
    #Given user is logged into the website
    #When user clicks on the "Open New Account" link
    #Then "Open new account" page should be displayed
    #And user enters the details to open the account
    #And user clicks on the "Open New Account" button
    #And verify that account is opened and account number is assigned
