package starter.LapakUMKM.StepDefinitions.FeatureUsers;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
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
        SerenityRest.then().statusCode(ok);}
    @And("Validate json schema register")
    public void validateJsonSchemaRegister() {
        File jsonSchema = new File(ConstantUsers.JSON_SCHEMA_REGISTER + "/ValidUsersReg.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }
    // Negative Case Register With Invalid Email
    @Given("Post register user with invalid email json")
    public void postRegisterUserWithInvalidEmailJson() {
        File json = new File(ConstantUsers.JSON_REQ_BODY_REGISTER + "/RegisterUsersInvalid.json");
        lapakUsersAPI.setRegisterUsers(json);
    }

    // Negative Case Register With Invalid Password
    @Given("Post register user with invalid password json")
    public void postRegisterUserWithInvalidPasswordJson() {
        File json = new File(ConstantUsers.JSON_REQ_BODY_REGISTER + "/RegisterUsersInvalidPwd.json");
        lapakUsersAPI.setRegisterUsers(json);
    }

    @And("Validate invalid register json schema")
    public void validateInvalidRegisterJsonSchema() {
        File jsonSchema = new File(ConstantUsers.JSON_SCHEMA_REGISTER+"/InvalidPasswordRegSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    // Negative Case Register With Invalid Email And Password
    @Given("Post register user with invalid email and password")
    public void postRegisterUserWithInvalidEmailAndPassword() {
        File json = new File(ConstantUsers.JSON_REQ_BODY_REGISTER + "/RegisterInvalidEmailPassword.json");
        lapakUsersAPI.setRegisterUsers(json);
    }

    @And("Validate invalid json schema register")
    public void validateInvalidJsonSchemaRegister() {
        File jsonSchema = new File(ConstantUsers.JSON_SCHEMA_REGISTER+"/InvalidEmailPasswordReg.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }
}
