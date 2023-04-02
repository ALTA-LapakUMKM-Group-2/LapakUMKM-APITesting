package starter.LapakUMKM.StepDefinitions.FeatureUsers;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.LapakUsersAPI;
import starter.LapakUMKM.Utils.ConstantUsers;

import java.io.File;

public class RegisterStepDef {

    @Steps
    LapakUsersAPI lapakUsersAPI;
    @Given("Post register user with valid json")
    public void postRegisterUserWithValidJson() {
        File json = new File(ConstantUsers.JSON_REQ_BODY_REGISTER + "/RegisterUsers.json");
        lapakUsersAPI.setRegisterUsers(json);
    }

    @When("Send request post register user")
    public void sendRequestPostRegisterUser() {
        SerenityRest.when().post(LapakUsersAPI.REGISTER_USERS);
    }

    @Then("Should return status code {int}")
    public void shouldReturnStatusCode(int ok) {
        SerenityRest.then().statusCode(ok);
    }

    @And("Validate json schema register")
    public void validateJsonSchemaRegister() {
        File jsonSchema = new File(ConstantUsers.JSON_SCHEMA_REGISTER + "/RegisterUsersSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }
}
