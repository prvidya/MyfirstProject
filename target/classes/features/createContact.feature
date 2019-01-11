Feature: Free CRM create contact feature 

Scenario Outline: Free CRM create contact test scenario
 
	Given user is already on login page 
	When title of login page is free CRM
	Then user enters "<user name>" and "<password>"
	Then user clicks on login button
	And get the title of home page
	Then user moves to new contact page
	Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
    Then close the browser
	
	Examples:
	
	| user name | password | firstname  | lastname  | position |
	| prvidya   | Oneplus3T| raj        | prithvi   | Engineer |
	| prvidya   | Oneplus3T| Vidya      | Prithvi   | Associate|