$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Workspace/Eclipse/NAB/Grid/src/test/java/features/TC03.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Login Functionality",
  "description": "",
  "id": "facebook-login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6012842402,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Facebook Login with valid data",
  "description": "",
  "id": "facebook-login-functionality;facebook-login-with-valid-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@narmu"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Launch Facebook Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should login into Facebook application",
  "keyword": "Then "
});
formatter.match({
  "location": "TC01StepDefination.launch_Facebook_Application()"
});
formatter.result({
  "duration": 15502503563,
  "status": "passed"
});
formatter.match({
  "location": "TC01StepDefination.user_enter_username_and_password()"
});
formatter.result({
  "duration": 523665686,
  "status": "passed"
});
formatter.match({
  "location": "TC01StepDefination.click_on_login_button()"
});
formatter.result({
  "duration": 268776464,
  "status": "passed"
});
formatter.match({
  "location": "TC01StepDefination.user_should_login_into_Facebook_application()"
});
formatter.result({
  "duration": 27410974827,
  "status": "passed"
});
formatter.after({
  "duration": 3444879794,
  "status": "passed"
});
});