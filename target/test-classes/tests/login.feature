Feature: Login functionality


Scenario: Login with valid credentials
Given User has navigates to Login Page
When User enters valid email address "simranbanuu@gmail.com" into email field
And User has entered valid password "KayirNisha@786" into password field
And User Clicks on Login button
Then User should get successfully logged in

Scenario: Login with invalid credentials
Given User has navigated to Login Page
When User enters invalid email address "simranbanuu123d@gmail.com" intoo email field
And User enters invalid password "7834556" into password field
And Clicks on Login button
Then User should get a proper warning message about credentials mismatch



Scenario: Login with valid email address invalid Password
Given User has navigated to Login Page
When User enters valid email address "simranbanuu@gmail.com" into email field
And User Enters invalid password "7834556" intoo password field
And User Clicks on Login button
Then User should get proper warning message aboout credentials mismatch


Scenario: Login with invalid email address valid Password
Given User has navigated to Login Page
When User enters valid email address "simranbanuu231@gmail.com" intoo email field
And User Enters valid password "KayirNisha@786" into password field
And User Clicks on Login button
Then User should get proper warning message aboout credentials mismatch


Scenario: Login without providing any credentails
Given User has navigated to Login Page
When User don't enter email address into email field
And User don't enter password into password field
And User Clicks on Login button
Then User should get a proper warning message about credentials mismatch