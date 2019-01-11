Feature: Deal data creation

Scenario: Free CRM create a new deal scenario
 
	Given user is already on login page 
	When title of login page is free CRM
	Then user enters username and password
	| prvidya | Oneplus3T |
	Then user clicks on login button
	And get the title of home page
	Then user moves to new deal page
#	If we create multiple set of data we need to write same  code every time to get the other row data
	Then user enters deal details 
	
	| test deal | 1000 | 50 | 10 |
	| test deal | 1000 | 50 | 10 |
	Then close the browser