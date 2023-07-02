@Login
Feature: To  validate the login functionality of faceboook application

Background:
Given To launch the chrome browser and maximize window

@Login1
Scenario: To validate login with valid username and invalid password
When To launch the url of the facebook application
And To pass valid username in email field
And To pass invalid password in password field
And To click the login button
And To check weather navigate to homepage or not
Then To close the browser

@Login2
Scenario Outline: To validate the positive and negative combination of login functionality
When User has to hit the facebook url
And User has to pass the data "<emaildatas>" in email field
And User has to pass the data "<passworddatas>" in password field
And User has to click the login button
Then User has to close the browser

Examples:

|emaildatas|passworddatas|
|salshi1926@gmail.com			|saleem|
|abc@gmail.com			 			|meelas|
|def@gmail.com			 			|yliycl|
|inmakesselinium@gmail.com|inmake|
|inmakes@gmail.com				|54321 |
|dge@gmail.com 					|gvbalr| 