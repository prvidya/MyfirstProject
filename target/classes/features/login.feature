Feature: Free CRM Login Feature 

#Scenario: Free CRM login Test scenario 

#	Given user is already on login page 
#	When title of login page is free CRM
#	Then user enters username and password
#	Then user clicks on login button
#	And get the title of home page

#  Simple data driven without using Examples keyword

	Scenario: Free CRM login Test scenario 
	Given user is already on login page 
	When title of login page is free CRM
	Then user enters "prvidya" and "Oneplus3T"
	Then user clicks on login button
	And get the title of home page
	
#	With Examples keyword

Scenario Outline: Free CRM login Test scenario
 
	Given user is already on login page 
	When title of login page is free CRM
	Then user enters "<user name>" and "<password>"
	Then user clicks on login button
	And get the title of home page
	
	Examples:
	
	| user name | password |
	| prvidya   | Oneplus3T|
	| naveenK   | test@123 |
	