Feature: Login
#some text regarding you feature file 

#GherkinSentax

Scenario: User login validation
Given User navigates to home page
When User clicks on sign in link
And User inputs email and password
And User clicks sign in button
Then User is on account page 
And new feature validation


#Steps key words
#Given, When, And, But, Then