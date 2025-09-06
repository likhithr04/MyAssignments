Feature: CreateLead function of Leaftaps application

@regression @smoke
Scenario Outline: CreateLead with multiple data


And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then It should be able to login
When Click on the CRMSFA link
And Click on the Leads link
And Click on the CreateLead link
Given Enter the Companyname as <CompanyName>
And Enter the Firstname as <FirstName>
And Enter the lastname as <LastName>
When Click on the CreateLead button
Then Lead should be created

Examples:
|CompanyName|FirstName|LastName|
|'TestLeaf'|'Vineeth'|'Rajendran'|
|'Qeagle'|'Hari'|'Radhakrisnan'|