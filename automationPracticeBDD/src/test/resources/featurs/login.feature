@login
Feature: Login
#some text regarding you feature file 

#GherkinSentax



@smokeTest
Scenario: User login validation
Given User navigates to home page
When User clicks on sign in link
And User inputs email and password
And User clicks sign in button
Then User is on account page 


@negative
Scenario: User login validation with invalid credentials
Given User navigates to home page
When User clicks on sign in link
And User inputs "invalid" email and "invalid" password
And User clicks sign in button
Then User should see error message "Invalid email address " 


@negative @multipExamples
Scenario Outline: User login validation with invalid credentials
Given User navigates to home page
When User clicks on sign in link
And User inputs "<email>" email and "<password" password
And User clicks sign in button
Then User should see error message "<error message>" 



 
 Examples: invalid credentials
 |email                |password|error message        | 
 |Invalid              |Invalid |Invalid email address|
 |abc213@mailinator.com|Invalid |Authentication failed|
 |Invalid              |abc1234 |Invalid email addres |



#Steps key words
#Given, When, And, But, Then