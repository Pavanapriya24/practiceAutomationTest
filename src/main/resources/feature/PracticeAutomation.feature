Feature: PracticeAutomation
In order to shop the Automation books 
As a practice automation user
I want to connect with the practice automation application

Background: common for each scenario
Given User launch the browser with practiceautomationtestingPage

Scenario: Register Valid Details
When I click on my account and enter registerusername as 'gudapatipolespriyar095@gmail.com' and registerpassword as 'fuyfito5iyhrsSneyjgdgdghrkggjkghshjgxmjv@100mjfrwk'
And click on register button 
And click on logout button
Then i get access to the practice automation testing page

Scenario: Read valid login details 
When I enter  login details from Excel "src/test/resources/Excel.xlsx" with SheetName "LoginValid" and click on login
Then I should access to the portal with title

Scenario: Register Invalid Details are given
When I click on my account and enter already used  registerusername as 'gudapatipavanapriy@gmail.com' and registerpassword as 'jdsfyherjglk089@jhdhf'
And click on register
Then I should get error message

Scenario: Login password left blank
When I click on my accoount and enter loginemail as 'sumanthpavansumu34@gmail.com' and left blank loginpassword as ''
And click on login button
Then I should get error message should be displayed as 'Error: Password is required.'

Scenario Outline: login invalidCredentials
When I click on my Account and enter loginemail as '<loginemail>' and enter loginpassword as '<loginpassword>' and click on login
Then Error message should be displayed
Examples:
|loginemail|loginpassword|
|priyatatarao09@gmail.com|fgkjgyghbvhgdfghgrg452@hjg|
|pavanapriya@gmail.com|Ramkajalganeshrr@park12|
