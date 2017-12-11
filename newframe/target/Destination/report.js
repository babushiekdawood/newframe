$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Test1.feature");
formatter.feature({
  "line": 1,
  "name": "Open the TrustnetDirect and click login",
  "description": "",
  "id": "open-the-trustnetdirect-and-click-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3646004157,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Open the TrustnetDirect and verify Login",
  "description": "",
  "id": "open-the-trustnetdirect-and-click-login;open-the-trustnetdirect-and-verify-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@done"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "Open the TrustnetDirect Website",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Click the Login button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User able to see the Login Popup",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Enter the \"babuqa1\" and \"Fedby123#\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Click the Loginpopup Login button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User logged in Succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Homepage.open_the_TrustnetDirect_Website()"
});
formatter.result({
  "duration": 4949680916,
  "status": "passed"
});
formatter.match({
  "location": "Homepage.click_the_Login_button()"
});
formatter.result({
  "duration": 5080263608,
  "status": "passed"
});
formatter.match({
  "location": "Homepage.user_able_to_see_the_Login_Popup()"
});
formatter.result({
  "duration": 5110825898,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "babuqa1",
      "offset": 11
    },
    {
      "val": "Fedby123#",
      "offset": 25
    }
  ],
  "location": "Homepage.enterTheAnd(String,String)"
});
formatter.result({
  "duration": 10282874931,
  "status": "passed"
});
formatter.match({
  "location": "Homepage.clickTheLoginpopupLoginButton()"
});
formatter.result({
  "duration": 5105343226,
  "status": "passed"
});
formatter.match({
  "location": "Homepage.userLoggedInSuccesfully()"
});
formatter.result({
  "duration": 3089755752,
  "status": "passed"
});
formatter.after({
  "duration": 736141805,
  "status": "passed"
});
});