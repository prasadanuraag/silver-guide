Feature: Login feature
Scenario: Valid login to actitime application.
Given: User enters the url as "http://localhost/login.do"
When: He enters the username as "<un>"
And: He enters the password as "<pwd>"
And: he clicks on login button
Then: Home page should be displayed
Examples:
|un|pwd|
|anuakasunny@gmail.com|manager|
|Dinga|Dingi|
|Virat|Anushka|
|Rohit|Ritika|