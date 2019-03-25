Feature: Free CRM Login Feature
#Data Driven testing without Example
#Scenario: Verify Free CRM Login Test
#Given User is on a Login Page
#When User sees a title of Login Page as CRM 
#And user enters username as "bharat_rmc@yahoo.com" and password as "Test@12345" 
#And user clicks on login button
#Then user is redirected on Home page

Scenario Outline: Verify Free CRM Login Test
Given User is on a Login Page
When User sees a title of Login Page as CRM 
And user enters username as "<username>" and password as "<password>"
And user clicks on login button
Then user is redirected on Home page
Then user clicks on Contacts page
Then user clicks on New button on Contacts page
Then user enters First Name as "<FirstName>" and Middle Name as "<MiddleName>" and Last Name as "<LastName>"  
Then user enters Company as "<Company>" and Email as "<Email>" 
Then user enters Street as "<Street>" and City as "<City>" and State as "<State>" and Zip as "<Zip>" and Country as "<Country>" 
Then user Clicks on Save button.
Then user Clicks on Contacts icon.
Then user Clicks on Settings icon.
Then user Clicks on Settings icon and user selects Log Out Option and log off. 
Examples:
|username|password|FirstName|MiddleName|LastName|Company|Email|Street|City|State|Zip|Country|
|bharat_rmc@yahoo.com|Test@12345|Swapnil|test|Patil|CTS|swapnil420@yahoo.com|420|Middleburg Heights|OHIO|44130|united states|
|bharat_rmc@yahoo.com|Test@12345|Neelima|test|Chaudhari|CTS|neelima420@yahoo.com|420|Middleburg Heights|OHIO|44130|united states|
|bharat_rmc@yahoo.com|Test@12345|Mama|test|Chaudhari|CTS|neelima420@yahoo.com|420|Middleburg Heights|OHIO|44130|united states|
|bharat_rmc@yahoo.com|Test@12345|Mami|test|Chaudhari|CTS|neelima420@yahoo.com|420|Middleburg Heights|OHIO|44130|united states|
|bharat_rmc@yahoo.com|Test@12345|Raju|test|Bhoge|CTS|neelima420@yahoo.com|420|Middleburg Heights|OHIO|44130|united states|