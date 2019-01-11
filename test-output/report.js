$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/features/hooks.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM app test",
  "description": "",
  "id": "free-crm-app-test",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#Scenario: free CRM create deal test"
    },
    {
      "line": 4,
      "value": "#"
    },
    {
      "line": 5,
      "value": "#\tGiven user is on deal page"
    },
    {
      "line": 6,
      "value": "#\tWhen user fills the deal form"
    },
    {
      "line": 7,
      "value": "#\tThen deal is created"
    },
    {
      "line": 8,
      "value": "#"
    },
    {
      "line": 9,
      "value": "#Scenario: free CRM create contact test"
    },
    {
      "line": 10,
      "value": "#\tGiven user is on contact page"
    },
    {
      "line": 11,
      "value": "#\tWhen user fills the contact form"
    },
    {
      "line": 12,
      "value": "#\tThen contact is created"
    },
    {
      "line": 13,
      "value": "#"
    }
  ],
  "line": 14,
  "name": "free CRM create mail test",
  "description": "",
  "id": "free-crm-app-test;free-crm-create-mail-test",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "user is on mail page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user fills the mail form",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "mail is created",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "free-crm-app-test;free-crm-create-mail-test;",
  "rows": [
    {
      "cells": [
        "mail1"
      ],
      "line": 19,
      "id": "free-crm-app-test;free-crm-create-mail-test;;1"
    },
    {
      "cells": [
        "mail2"
      ],
      "line": 20,
      "id": "free-crm-app-test;free-crm-create-mail-test;;2"
    },
    {
      "cells": [
        "mail3"
      ],
      "line": 21,
      "id": "free-crm-app-test;free-crm-create-mail-test;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 623398,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "free CRM create mail test",
  "description": "",
  "id": "free-crm-app-test;free-crm-create-mail-test;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "user is on mail page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user fills the mail form",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "mail is created",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefinition.user_is_on_mail_page()"
});
formatter.result({
  "duration": 378749843,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinition.user_fills_the_mail_form()"
});
formatter.result({
  "duration": 142891,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinition.mail_is_created()"
});
formatter.result({
  "duration": 232549,
  "status": "passed"
});
formatter.after({
  "duration": 129349,
  "status": "passed"
});
formatter.before({
  "duration": 218540,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "free CRM create mail test",
  "description": "",
  "id": "free-crm-app-test;free-crm-create-mail-test;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "user is on mail page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user fills the mail form",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "mail is created",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefinition.user_is_on_mail_page()"
});
formatter.result({
  "duration": 305862,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinition.user_fills_the_mail_form()"
});
formatter.result({
  "duration": 304461,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinition.mail_is_created()"
});
formatter.result({
  "duration": 274575,
  "status": "passed"
});
formatter.after({
  "duration": 264769,
  "status": "passed"
});
});