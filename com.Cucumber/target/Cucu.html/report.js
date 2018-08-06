$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Cucu2.feature");
formatter.feature({
  "line": 5,
  "name": "Orange HRM Login",
  "description": "",
  "id": "orange-hrm-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 4,
      "name": "@Sanity"
    }
  ]
});
formatter.background({
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "Site is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "CucuSteps.site_is_opened()"
});
formatter.result({
  "duration": 45924535080,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login Scenario",
  "description": "",
  "id": "orange-hrm-login;login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I enter Admin and admin",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I should get logged in",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 8
    },
    {
      "val": "admin",
      "offset": 18
    }
  ],
  "location": "CucuSteps.i_enter_user_name_and_password(String,String)"
});
formatter.result({
  "duration": 235428874,
  "status": "passed"
});
formatter.match({
  "location": "CucuSteps.i_shold_get_logged_in()"
});
formatter.result({
  "duration": 14116090719,
  "status": "passed"
});
});