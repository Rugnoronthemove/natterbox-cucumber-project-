$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/natterbox/resources/featurefile/login.feature");
formatter.feature({
  "line": 1,
  "name": "Log in feature",
  "description": "",
  "id": "log-in-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 28877108500,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should not Log in with invalid credential",
  "description": "",
  "id": "log-in-feature;user-should-not-log-in-with-invalid-credential",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Login link",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 1634043100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnLoginLink()"
});
formatter.result({
  "duration": 598138200,
  "status": "passed"
});
formatter.after({
  "duration": 915773300,
  "status": "passed"
});
});