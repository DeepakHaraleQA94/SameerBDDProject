Feature: Login Functinality

Background: User at the login page

Scenario: Validate login functionality
When User enter the username
And User enter the password
And User click on login button
Then User landing on home page

Scenario: Enter valid username and Invalid password

When User enter the username
And User enter invalid the password
And User click on login button
Then User landing on home page

Scenario: Enter Invalid username and valid password
When User enter Invalid the username
And User enter valid the password
And User click on login button
Then User landing on home page