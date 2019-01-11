Feature: Deal data creation

Scenario: Free CRM create a new deal scenario
 
	Given user is already on login page 
	When title of login page is free CRM
	Then user enters username and password
	| username | password |
	| prvidya | Oneplus3T |
	Then user clicks on login button
	And get the title of home page
	Then user moves to new deal page
	Then user enters deal details 
	| title | amount | probability | commission |
	| test deal1 | 1000 | 50 | 10 |
	| test deal2 | 2000 | 60 | 20 |
	| test deal3 | 3000 | 70 | 30 |
	Then close the browser