Feature: orangeHrmdemo
Scenario: verify the orange hrm login page
Given open the browser
When I enter username and password
And click on login button
Then sucessfully login 
And logout