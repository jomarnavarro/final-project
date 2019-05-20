$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Songs by Sinatra Login",
  "description": "  As a User\n  I want to log into Sinatra\n  So I can do CRUD on Songs",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User can login succesfully",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to Home Page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I log into the site with credentials frank:sinatra",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I will be in Home Page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I will be able to Add a Song",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User can not log in using wrong credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I navigate to Home Page",
  "keyword": "Given "
});
formatter.step({
  "name": "I log into the site with credentials \u003cbad_credentials\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I will see an error message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "bad_credentials"
      ]
    },
    {
      "cells": [
        "frenk:sinotra"
      ]
    },
    {
      "cells": [
        "frank"
      ]
    },
    {
      "cells": [
        ""
      ]
    }
  ]
});
formatter.scenario({
  "name": "User can not log in using wrong credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to Home Page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I log into the site with credentials frenk:sinotra",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I will see an error message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User can not log in using wrong credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to Home Page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I log into the site with credentials frank",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I will see an error message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User can not log in using wrong credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to Home Page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I log into the site with credentials ",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I will see an error message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});