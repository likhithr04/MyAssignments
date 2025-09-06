Feature: Account Management in Leaftaps 

@smoke 
Scenario Outline: Create a new account with valid details 
	And Enter the username as <Username> 
	And Enter the password as <Password> 
	When Click on the Login button 
	Then It should be able to login 
	When Click on the CRMSFA link 
	And Click on the Accounts link 
	And Click on the CreateAccounts link 
	And enter account name <accountName> 
	When Click on the CreateLead button
	Then Account should be created 
	
	Examples: 
		| Username         | Password | accountName | 
		| Demosalesmanager | crmsfa   | TestLeaf    |
		| Demosalesmanager | crmsfa   | Likhith     |