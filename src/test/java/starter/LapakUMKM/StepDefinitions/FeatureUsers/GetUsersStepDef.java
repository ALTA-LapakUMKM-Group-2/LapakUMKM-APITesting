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

public class GetUsersStepDef {

    @Steps
    LapakUsersAPI lapakUsersAPI;
    @Given("Get users data")
    public void getUsersData() {
        lapakUsersAPI.setGetUsers();
    }

    @When("Send get users")
    public void sendGetUsers() {
        SerenityRest.when().get(LapakUsersAPI.GET_USERS);
    }


    @And("Validate get users json schema")
    public void validateGetUsersJsonSchema() {
        File jsonSchema = new File(ConstantUsers.JSON_SCHEMA_GET + "/GetValidSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }


    // Negative Get Invalid Parameter
    @Given("Get users data with invalid parameter")
    public void getUsersDataWithInvalidParameter() {lapakUsersAPI.setGetUsersInvalid();
    }

    @And("Validate get users invalid parameter json schema")
    public void validateGetUsersInvalidParameterJsonSchema() {
        File jsonSchema = new File(ConstantUsers.JSON_SCHEMA_GET + "/GetInvalidSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }
}
