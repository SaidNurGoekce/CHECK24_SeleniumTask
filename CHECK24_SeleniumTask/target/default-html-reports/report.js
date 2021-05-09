$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/task.feature");
formatter.feature({
  "name": "Selenium Task",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user fills in the registration form.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the check24 Kreditkarten-Vergleich page",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.TaskStepDefs.the_user_is_on_the_check24_Kreditkarten_Vergleich_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the cookie \u0027ppset\u003dkreditkarte\u0027 is set in response headers",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.TaskStepDefs.the_user_should_see_the_cookie_is_set_in_response_headers(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the first listed product",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.TaskStepDefs.the_user_clicks_on_the_first_listed_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fills in \u0027taskprepforCHECK24@gmail.com\u0027 as email",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.TaskStepDefs.the_user_fills_in_as_email(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on weiter button",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.TaskStepDefs.the_user_clicks_on_weiter_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on als Gast fortfahren radio-button",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.TaskStepDefs.the_user_clicks_on_als_Gast_fortfahren_radio_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks to weiter button below",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.TaskStepDefs.theUserClicksToWeiterButtonBelow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on weiter button on registration page",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.TaskStepDefs.theUserClicksOnWeiterButtonOnRegistrationPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error messages are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.TaskStepDefs.error_messages_are_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fills in all fields with valid values",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.TaskStepDefs.the_user_fills_in_all_fields_with_valid_values(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on weiter button on registration page",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.TaskStepDefs.theUserClicksOnWeiterButtonOnRegistrationPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "registration success message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.TaskStepDefs.registration_success_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});