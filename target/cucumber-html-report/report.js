$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("UserPosts.feature");
formatter.feature({
  "line": 1,
  "name": "User posts (Read and Create)",
  "description": "",
  "id": "user-posts-(read-and-create)",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User sees his email",
  "description": "",
  "id": "user-posts-(read-and-create);user-sees-his-email",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "As a random User",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I get my profile",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I can see my email",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "User has valid posts",
  "description": "",
  "id": "user-posts-(read-and-create);user-has-valid-posts",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "As a User with id equals \u003cid\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I get my posts",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I see some valid posts",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "user-posts-(read-and-create);user-has-valid-posts;",
  "rows": [
    {
      "cells": [
        "id"
      ],
      "line": 14,
      "id": "user-posts-(read-and-create);user-has-valid-posts;;1"
    },
    {
      "cells": [
        "5"
      ],
      "line": 15,
      "id": "user-posts-(read-and-create);user-has-valid-posts;;2"
    },
    {
      "cells": [
        "10"
      ],
      "line": 16,
      "id": "user-posts-(read-and-create);user-has-valid-posts;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "User has valid posts",
  "description": "",
  "id": "user-posts-(read-and-create);user-has-valid-posts;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "As a User with id equals 5",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I get my posts",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I see some valid posts",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 16,
  "name": "User has valid posts",
  "description": "",
  "id": "user-posts-(read-and-create);user-has-valid-posts;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "As a User with id equals 10",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I get my posts",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I see some valid posts",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 18,
  "name": "User is able to make a new post",
  "description": "",
  "id": "user-posts-(read-and-create);user-is-able-to-make-a-new-post",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "As a User with id equals 4",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I make new post with title and text",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I see successful post result",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});