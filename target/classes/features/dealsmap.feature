Feature: Deal data creation

#Scenario Outline: Free CRM validate deal creation
#
#Given User is on a Login Page of Free CRM
#When User sees a title of Login Page
#And user enters username as"<username>" and password as"<password>"
#And user clicks on login button of Free CRM
#Then user is redirected on Home page of Free CRM
#Then user clicks on Deals icon
#Then user clicks on New button
#Then user enters Title as "<title>" and Stage as "<stage>" and Status as "<status>"
#Then user clicks on Save button
#Then user clicks on Deals icon again to see deal has been stored sucessfully
#Then user Clicks on Settings icon and user selects Log Out Option and log out from system
#
#Examples:
#|username|password|title|stage|status|
#|bharat_rmc@yahoo.com|Test@12345|DealsofAmerica- KOHLS 30% off|Prospect|New| 

Scenario: Free CRM validate deal creation

Given User is on a Login Page of Free CRM
When User sees a title of Login Page
And user enters username as <username> and password as <password> 
|username|password|
|bharat_rmc@yahoo.com|Test@12345|
And user clicks on login button of Free CRM
Then user is redirected on Home page of Free CRM
Then user clicks on Deals icon
Then user clicks on New button
Then user enters Title as <title> and Stage as <stage> and Status as <status>
|title|stage|status|
|DealsofAmerica- KOHLS 30% off|Prospect|New|
|Buy One Get One- KOHLS 20% off|Research|Active|
|Macy's Balck Friday- Macy's DoorBuster 20% off|Prospect|Active|
Then user clicks on Save button
Then user clicks on Deals icon again to see deal has been stored sucessfully
Then user Clicks on Settings icon and user selects Log Out Option and log out from system
