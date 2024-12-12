@OrangeHRM
Feature: Login feature
@Valid
Scenario Outline: Valid login to orangehrm application.
Given: User enters the url as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When: He enters the username as "<username>"
And: He enters the password as "<password>"
And: he clicks on login button
Then: Home page should be displayed

Examples:
|username|password|
|Admin|admin123|
|anuakasunny@gmail.com|manager|
|Dinga|Dingi|
|Virat|Anushka|
|Rohit|Ritika|