package step_definitions;

import io.cucumber.java.en.*;
import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;

public class ApiTaskStepDefs {

    Response response;

    @Given("the user enters {string} as path param and sends GET request")
    public void the_user_enters_as_path_param_and_sends_GET_request(String id) {
        response = given().pathParam("id", id)
                .when().get("/{id}");
    }


    @Then("verify {string}")
    public void verify(String statusCode) {
        assertEquals(Integer.parseInt(statusCode), response.statusCode());
    }




}
