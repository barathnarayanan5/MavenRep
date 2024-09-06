Feature: login orangeHRM
Scenario Outline: login with crt username and password
   Given user in the login PAGE 
   When user enter username and password
   |id|username| password|
   | 1| priya123|zdsfdf|
    | 2| bpriya123|bzdsfdf|
   And user press the login button
   Then user see the profile 
   