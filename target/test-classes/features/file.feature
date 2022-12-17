Feature: Leaftaps login functionality
Background:
Given Open the chrome browser
And Load the application url


Scenario Outline: Test login functionality with positive credential


And Enter username as <username>
And Enter password as <password>
When Click on login button
Then Homepage should be displayed

Examples:
|username|password|
|'Demosalesmanage'|'crmsfa'|

Scenario: Test login functionality with negative credential

And Enter username as 'Demo'
And Enter password as 'crmsfa'
When Click on login button
But Errormessage should be displayed
