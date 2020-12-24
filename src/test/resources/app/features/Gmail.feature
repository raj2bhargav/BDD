@All
Feature: Gmail Home Page

@Smoke
Scenario: Verify Gmail Home Page
Given Launch Gmail Hone Page
When Verify user id and password
Then Enter user id and password
And Click on the Login button

@Regression
Scenario: Verify Gmail Home Page
Given Launch Gmail Hone Page
When Verify user id and password
Then Enter user id and password
And Click on the Login button

@Prod
Scenario: Verify Gmail Home Page
Given Launch Gmail Hone Page
When Verify user id and password
Then Enter user id and password
And Click on the Login button
