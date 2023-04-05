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
        File json = new File(ConstantUsers.JSON_REQ_BODY_LOGIN + "/UsersLoginValid.json");
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
    // Negative Login With Invalid Email
    @Given("Login with invalid user email json")
    public void loginWithInvalidUserEmailJson() {
        File json = new File(ConstantUsers.JSON_REQ_BODY_LOGIN+"/InvalidEmailLogin.json");
       lapakUsersAPI.loginUser(json);
    }

    // Negative Login With Invalid Password
    @Given("Login with invalid user password json")
    public void loginWithInvalidUserPasswordJson() {
        File json = new File(ConstantUsers.JSON_REQ_BODY_LOGIN+"/InvalidPasswordLogin.json");
        lapakUsersAPI.loginUser(json);
    }

    @And("Validate invalid login json schema")
    public void validateInvalidLoginJsonSchema() {
        File jsonSchema = new File(ConstantUsers.JSON_SCHEMA_LOGIN+"/LoginInvalidPassword.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }


    @Given("Login with invalid email and password json")
    public void loginWithInvalidEmailAndPasswordJson() {
        File json = new File(ConstantUsers.JSON_REQ_BODY_LOGIN+"/InvalidEmailPassword.json");
        lapakUsersAPI.loginUser(json);
    }

    @And("Validate invalid email and password json schema")
    public void validateInvalidEmailAndPasswordJsonSchema() {
        File jsonSchema = new File(ConstantUsers.JSON_SCHEMA_LOGIN+"/LoginInvalidEmailPasswordSchema.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }
}
