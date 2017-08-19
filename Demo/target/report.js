$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Facebook.feature");
formatter.feature({
  "line": 1,
  "name": "Test Facebook",
  "description": "",
  "id": "test-facebook",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login functionality exists",
  "description": "",
  "id": "test-facebook;login-functionality-exists",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I have opened the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I open Facebook website",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Login button should exists",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enter valid Facebook credentilas \"ramakrishna\" and \"Ram9446\"",
  "keyword": "When "
});
formatter.match({
  "location": "CucumberReport.openBrowser()"
});
formatter.result({
  "duration": 9787304249,
  "status": "passed"
});
formatter.match({
  "location": "CucumberReport.goToFacebook()"
});
formatter.result({
  "duration": 5647559954,
  "status": "passed"
});
formatter.match({
  "location": "CucumberReport.loginButton()"
});
formatter.result({
  "duration": 60412532,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ramakrishna",
      "offset": 39
    },
    {
      "val": "Ram9446",
      "offset": 57
    }
  ],
  "location": "CucumberReport.user_enter_valid_Facebook_credentilas_and(String,String)"
});
formatter.result({
  "duration": 4417227909,
  "status": "passed"
});
});