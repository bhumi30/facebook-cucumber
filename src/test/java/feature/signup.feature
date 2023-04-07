Feature: facebook signup features

Scenario:1 successful signup

Given I am opening facebook.com
Then  I click on the creaate account link
And  I enter lastname mobile number password
Then  I enter my birth date
Then  I click on signup button
And  I verify the error message "what's your name"


