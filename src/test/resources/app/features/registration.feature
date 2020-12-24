Feature: User Registration Page

Scenario: user registration with different data
	Given User is on the registration page
	When User enters following user details
	| rah | bhargav | test@gmail.com | 12345789 |
	| aaa | xys | test@gmail.com | 12345789 |
	| bbb | ttt | test@gmail.com | 12345789 |
	Then user registration should be successful

	
	
Scenario: user registration with different data with columns
	Given User is on the registration page
	When User enters following user details with columns
	|firstname | lastname | email | phone |
	| rah | bhargav | test@gmail.com | 12345789 |
	| aaa | xys | test@gmail.com | 12345789 |
	| bbb | ttt | test@gmail.com | 12345789 |
	Then user registration should be successful
	