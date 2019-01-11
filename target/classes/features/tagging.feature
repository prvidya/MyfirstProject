Feature: Free CRM application testing

@SmokeTest
Scenario: Login with correct username and password
Given this is a valid login test

@SmokeTest
Scenario: Login with incorrect username and password
Given this is a invalid login test

@RegressionTest @SmokeTest
Scenario: Create a contact
Given this a contact test case

@RegressionTest @SmokeTest
Scenario: Create a message
Given this a message test case

@SmokeTest @End2EndTest
Scenario: Create a deal
Given this is a deal test

@End2EndTest
Scenario: Create a playing game
Given this is game test

@RegressionTest
Scenario: Create calling option
Given this is calling test

@SanityTest
Scenario: Create a case
Given this is case test

@SanityTest
Scenario: Search a task
Given this is a task

@SmokeTest
Scenario: Search an email
Given this is email test case

@SmokeTest
Scenario: Search a document
Given this is a document test

@End2EndTest @SmokeTest @RegressionTest
Scenario: Search a form
Given this is form test case

@End2EndTest @SmokeTest
Scenario: Validate a report
Given this is report test

@End2EndTest
Scenario: Logout from the application
Given this is logout test