$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/features/GoogleSearchEngine.feature");
formatter.feature({
  "name": "Google search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify required information is displayed as the first result in the browser after a google search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "user launches the browser with base url",
  "keyword": "Given "
});
formatter.step({
  "name": "user search with \"\u003ckeyword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "verify \"\u003cinformation\u003e\" displayed as the first search result",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "keyword",
        "information"
      ]
    },
    {
      "cells": [
        "Clarivate Analytics",
        "clarivate.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify required information is displayed as the first result in the browser after a google search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches the browser with base url",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitions.launchBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search with \"Clarivate Analytics\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitions.googleSearch(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify \"clarivate.com\" displayed as the first search result",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.Stepdefinitions.verifySearchResult(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});