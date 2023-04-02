package starter.LapakUMKM.StepDefinitions.FeatureUsers;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.LapakUsersAPI;
import starter.LapakUMKM.Utils.ConstantUsers;

import java.io.File;

public class LoginUsersStepDef {
    @Steps
    LapakUsersAPI lapakUsersAPI;
    @Given("Login with valid user json")
    public void loginWithValidUserJson() {
        File json = new File(ConstantUsers.JSON_REQ_BODY_LOGIN + "/LoginUsers.json");
        lapakUsersAPI.loginUser(json);
    }

    @When("Send request post login user")
    public void sendRequestPostLoginUser() {
        SerenityRest.when().post(LapakUsersAPI.LOGIN_USERS);
    }

    @And("Validate json schema login user")
    public void validateJsonSchemaLoginUser() {
        File jsonSchema = new File(ConstantUsers.JSON_SCHEMA_LOGIN+"/LoginUsersSchema.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }
}
