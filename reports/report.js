$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/feature/PracticeAutomation.feature");
formatter.feature({
  "name": "PracticeAutomation",
  "description": "In order to shop the Automation books \nAs a practice automation user\nI want to connect with the practice automation application",
  "keyword": "Feature"
});
formatter.background({
  "name": "common for each scenario",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User launch the browser with practiceautomationtestingPage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinition.user_launch_the_browser_with_practiceautomationtestingPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Register Valid Details",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on my account and enter registerusername as \u0027gudapatipriyar095@gmail.com\u0027 and registerpassword as \u0027fhrsSneyjgdgdghrkggjkghshjgxmjv@100mjfrwk\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinition.i_click_on_my_account_and_enter_registerusername_as_and_registerpassword_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on register button",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinition.click_on_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on logout button",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinition.click_on_logout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i get access to the practice automation testing page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinition.i_get_access_to_the_practice_automation_testing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "common for each scenario",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User launch the browser with practiceautomationtestingPage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinition.user_launch_the_browser_with_practiceautomationtestingPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Read valid login details",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter  login details from Excel \"src/test/resources/Excel.xlsx\" with SheetName \"LoginValid\" and click on login",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinition.i_enter_login_details_from_Excel_with_SheetName_and_click_on_login(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should access to the portal with title",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinition.i_should_access_to_the_portal_with_title()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "common for each scenario",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User launch the browser with practiceautomationtestingPage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinition.user_launch_the_browser_with_practiceautomationtestingPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Register Invalid Details are given",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on my account and enter already used  registerusername as \u0027gudapatipavanapriy@gmail.com\u0027 and registerpassword as \u0027jdsfyherjglk089@jhdhf\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinition.i_click_on_my_account_and_enter_already_used_registerusername_as_and_registerpassword_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on register",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinition.click_on_register()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get error message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinition.i_should_get_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "common for each scenario",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User launch the browser with practiceautomationtestingPage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinition.user_launch_the_browser_with_practiceautomationtestingPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login password left blank",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on my accoount and enter loginemail as \u0027sumanthpavansumu34@gmail.com\u0027 and left blank loginpassword as \u0027\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinition.i_click_on_my_accoount_and_enter_loginemail_as_and_left_blank_loginpassword_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinition.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get error message should be displayed as \u0027Error: Password is required.\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinition.i_should_get_error_message_should_be_displayed_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "login invalidCredentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I click on my Account and enter loginemail as \u0027\u003cloginemail\u003e\u0027 and enter loginpassword as \u0027\u003cloginpassword\u003e\u0027 and click on login",
  "keyword": "When "
});
formatter.step({
  "name": "Error message should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "loginemail",
        "loginpassword"
      ]
    },
    {
      "cells": [
        "priyatatarao09@gmail.com",
        "fgkjgyghbvhgdfghgrg452@hjg"
      ]
    },
    {
      "cells": [
        "pavanapriya@gmail.com",
        "Ramkajalganeshrr@park12"
      ]
    }
  ]
});
formatter.background({
  "name": "common for each scenario",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User launch the browser with practiceautomationtestingPage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinition.user_launch_the_browser_with_practiceautomationtestingPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "login invalidCredentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I click on my Account and enter loginemail as \u0027priyatatarao09@gmail.com\u0027 and enter loginpassword as \u0027fgkjgyghbvhgdfghgrg452@hjg\u0027 and click on login",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinition.i_click_on_my_Account_and_enter_loginemail_as_and_enter_loginpassword_as_and_click_on_login(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinition.error_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "common for each scenario",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User launch the browser with practiceautomationtestingPage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinition.user_launch_the_browser_with_practiceautomationtestingPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "login invalidCredentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I click on my Account and enter loginemail as \u0027pavanapriya@gmail.com\u0027 and enter loginpassword as \u0027Ramkajalganeshrr@park12\u0027 and click on login",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinition.i_click_on_my_Account_and_enter_loginemail_as_and_enter_loginpassword_as_and_click_on_login(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinitions.StepDefinition.error_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
});