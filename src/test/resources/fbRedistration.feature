@Regin
Feature: To validate the account creation of facebook application

@Regin1
Scenario: To create new account
Given To launch the browser and to maximize the window
When To launch the url of the facebook application
And To click the create new account button

# One Dimensional Map Data
And To pass firstname in firstname text box
#header      givenData
|firstname1|samuel|
|firstname2|janani|
|firstname3|shifana|

And To pass secondname in secondname text box

#Two Dimensional Map data
And To pass mobileno or email in email text box
|password1|password2|password3|
|12345678|meelas67|87654321|
|09876543|txkurtxk|i85d865d|
|lyfiyr76|ku658k57|86lxi7tk|


And To create new password using new password text box
Then To close the browser

