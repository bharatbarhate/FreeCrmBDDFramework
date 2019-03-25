Feature: Free CRM Application Taggaing Validation

@SmokeTest @RegressionTest
Scenario: Verify Calendar click for FreeCRM Application
Given User is on a Login Page of FreeCRM
When User sees a title of Login Screen
And user enters username as <username> and password as <password> on FreeCRM
|username|password|
|bharat_rmc@yahoo.com|Test@12345|
And user clicks on login button of FreeCRM
Then user is redirected on Home page of FreeCRM
Then user clicks on Calendar icon
Then user Clicks on Settings icon and user selects Log Out Option and logs out from system

@SmokeTest
Scenario: Verify Companies click for FreeCRM Application
Given User is on a Login Page of FreeCRM
When User sees a title of Login Screen
And user enters username as <username> and password as <password> on FreeCRM
|username|password|
|bharat_rmc@yahoo.com|Test@12345|
And user clicks on login button of FreeCRM
Then user is redirected on Home page of FreeCRM
Then user clicks on Companies icon
Then user Clicks on Settings icon and user selects Log Out Option and logs out from system

@RegressionTest
Scenario: Verify Deals click for FreeCRM Application
Given User is on a Login Page of FreeCRM
When User sees a title of Login Screen
And user enters username as <username>  and password as <password> on FreeCRM
|username|password|
|bharat_rmc@yahoo.com|Test@12345|
And user clicks on login button of FreeCRM
Then user is redirected on Home page of FreeCRM
Then user clicks on Deals icon
Then user Clicks on Settings icon and user selects Log Out Option and logs out from system

@SmokeTest
Scenario: Verify Tasks click for FreeCRM Application
Given User is on a Login Page of FreeCRM
When User sees a title of Login Screen
And user enters username as <username>  and password as <password> on FreeCRM
|username|password|
|bharat_rmc@yahoo.com|Test@12345|
And user clicks on login button of FreeCRM
Then user is redirected on Home page of FreeCRM
Then user clicks on Tasks icon
Then user Clicks on Settings icon and user selects Log Out Option and logs out from system

@RegressionTest
Scenario: Verify Cases click for FreeCRM Application
Given User is on a Login Page of FreeCRM
When User sees a title of Login Screen
And user enters username as <username>  and password as <password> on FreeCRM
|username|password|
|bharat_rmc@yahoo.com|Test@12345|
And user clicks on login button of FreeCRM
Then user is redirected on Home page of FreeCRM
Then user clicks on Cases icon
Then user Clicks on Settings icon and user selects Log Out Option and logs out from system

@SmokeTest @RegressionTest @End2End
Scenario: Verify Calls click for FreeCRM Application
Given User is on a Login Page of FreeCRM
When User sees a title of Login Screen
And user enters username as <username>  and password as <password> on FreeCRM
|username|password|
|bharat_rmc@yahoo.com|Test@12345|
And user clicks on login button of FreeCRM
Then user is redirected on Home page of FreeCRM
Then user clicks on Calls icon
Then user Clicks on Settings icon and user selects Log Out Option and logs out from system

@RegressionTest @End2End
Scenario: Verify Documents click for FreeCRM Application
Given User is on a Login Page of FreeCRM
When User sees a title of Login Screen
And user enters username as <username>  and password as <password> on FreeCRM
|username|password|
|bharat_rmc@yahoo.com|Test@12345|
And user clicks on login button of FreeCRM
Then user is redirected on Home page of FreeCRM
Then user clicks on Documents icon
Then user Clicks on Settings icon and user selects Log Out Option and logs out from system

@RegressionTest
Scenario: Verify Email click for FreeCRM Application
Given User is on a Login Page of FreeCRM
When User sees a title of Login Screen
And user enters username as <username>  and password as <password> on FreeCRM
|username|password|
|bharat_rmc@yahoo.com|Test@12345|
And user clicks on login button of FreeCRM
Then user is redirected on Home page of FreeCRM
Then user clicks on Email icon
Then user Clicks on Settings icon and user selects Log Out Option and logs out from system

@End2End
Scenario: Verify Campaigns click for FreeCRM Application
Given User is on a Login Page of FreeCRM
When User sees a title of Login Screen
And user enters username as <username>  and password as <password> on FreeCRM
|username|password|
|bharat_rmc@yahoo.com|Test@12345|
And user clicks on login button of FreeCRM
Then user is redirected on Home page of FreeCRM
Then user clicks on Campaigns icon
Then user Clicks on Settings icon and user selects Log Out Option and logs out from system

@UnitTest
Scenario: Verify Reports click for FreeCRM Application
Given User is on a Login Page of FreeCRM
When User sees a title of Login Screen
And user enters username as <username>  and password as <password> on FreeCRM
|username|password|
|bharat_rmc@yahoo.com|Test@12345|
And user clicks on login button of FreeCRM
Then user is redirected on Home page of FreeCRM
Then user clicks on Reports icon
Then user Clicks on Settings icon and user selects Log Out Option and logs out from system
