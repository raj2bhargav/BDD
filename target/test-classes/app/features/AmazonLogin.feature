Feature: Amazon Login Page
	In order to test login page
	As a Registerer user 
	I want to specify the login conditions

Scenario:
	Given user is on Amazon Login Page
	And Sign in button is present on screen
	When user clicks on Sign in button
	Then user is displayed login screen
	When user enters "test@gmail.com" in username field
	And user enters "test@123" in password field
	And user clicks on the Sign in button
	Then user is on home page
	And title of the home page is "Amazon"
	But sign in button is not displayed