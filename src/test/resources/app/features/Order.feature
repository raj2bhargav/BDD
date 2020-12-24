Feature: Home Page
	In Order Page to check my Order Details
	As a register user
	I want to specify the features of order details page

	
	Background: 
	Given a register user exists
	Given user is on Amazon Login page
	When user enters username
	And user enters password
	Then user navigates to order page
	
	Scenario: Check Previous Order Details
	When user click on Order Link
	Then user checks the previous orders
	
	Scenario: Check Open Order details
	When user click on the Open Order Link
	Then user checks Open Order details
	
	Scenario: Check Cancelled Order Details
	When user click on the Cancelled Order Links
	Then User checks Cancelled Order details
	
	