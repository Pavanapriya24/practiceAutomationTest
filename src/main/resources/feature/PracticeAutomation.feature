Feature: PracticeAutomation
In order to shop the Automation books 
As a practice automation user
I want to connect with the practice automation application

Background: common for each scenario
Given User launch the browser with practiceautomationtestingPage

Scenario: Register Valid Details
When I click on my account and enter registerusername as 'sumanthatarao098@gmail.com' and registerpassword as 'YherojudfAfgkjgyghbvhgdfghgrg452@hjg'
And click on register button
Then i get access to the practice automation

Scenario: Login valid Details are given
When I click on my accoount and enter loginemail as 'priyatatarao09@gmail.com' and loginpassword as 'YhjjjjjdfAfgkjgyghbvhgdfghgrg452@hjg'
And click on login icon
Then i should get title as My Account

Scenario: Register Invalid Details are given
When I click on my account and enter registerusername as 'gudapatipavanapriy@gmail.com' and registerpassword as 'jdsfyherjglk089@12'
And click on register button
Then I should get already used email

Scenario: Login Invalid Details are given
When I click on my accoount and enter loginemail as 'sumanthpavansumu34@gmail.com' and loginpassword as 'pavanapriyatatarao09@gmail.com'
And click on login button
Then I should get invalid username or password 

Scenario Outline: Valid invalidCredentials
When I click on my Account and enter loginemail as '<loginemail>' and enter loginpassword as '<loginpassword>'
And click on login button
Then I should get access to the practice automation page
Examples:
|loginemail|loginpassword|
|pavanapriyanaka56@gmail.com|Ramadhiganeshrr@park12K6|
|pavanapriya@gmail.com|Ramkajalganeshrr@park12|