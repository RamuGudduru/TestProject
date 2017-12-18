$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Workspace/Eclipse/NAB/Grid/src/test/java/features/TC02.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Login Functionality",
  "description": "",
  "id": "facebook-login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8711832198,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "3 Facebook Login with third valid data",
  "description": "",
  "id": "facebook-login-functionality;3-facebook-login-with-third-valid-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@siva"
    },
    {
      "line": 17,
      "name": "@last"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "Launch Facebook Application",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "User enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User should login into Facebook application",
  "keyword": "Then "
});
formatter.match({
  "location": "TC01StepDefination.launch_Facebook_Application()"
});
formatter.result({
  "duration": 66176719360,
  "status": "passed"
});
formatter.match({
  "location": "TC01StepDefination.user_enter_username_and_password()"
});
formatter.result({
  "duration": 39278324,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d63.0.3239.84)\n  (Driver info: chromedriver\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.5.2\u0027, revision: \u002710229a9\u0027, time: \u00272017-08-21T17:29:55.15Z\u0027\nSystem info: host: \u0027ADMIN-PC\u0027, ip: \u0027192.168.1.101\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_73\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f), userDataDir\u003dC:\\Users\\admin\\AppData\\Local\\Temp\\scoped_dir4880_24814}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d63.0.3239.84, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: fd1a9f2f66d4876858c4fe1e09a2a8d5\n*** Element info: {Using\u003did, value\u003demail}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:641)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:414)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:457)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:406)\r\n\tat steps.TC01StepDefination.user_enter_username_and_password(TC01StepDefination.java:42)\r\n\tat ✽.When User enter username and password(E:/Workspace/Eclipse/NAB/Grid/src/test/java/features/TC02.feature:20)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TC01StepDefination.click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC01StepDefination.user_should_login_into_Facebook_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 177716470,
  "status": "passed"
});
});