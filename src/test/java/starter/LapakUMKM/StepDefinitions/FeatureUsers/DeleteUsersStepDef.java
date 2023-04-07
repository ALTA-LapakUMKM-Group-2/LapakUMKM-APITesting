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

public class DeleteUsersStepDef {

    @Steps
    LapakUsersAPI lapakUsersAPI;

    @Given("Delete users with valid parameter")
    public void deleteUsersWithValidParameter() {
        lapakUsersAPI.setDeleteUsers();
    }

    @When("Send delete users")
    public void sendDeleteUsers() {
        SerenityRest.when().delete(LapakUsersAPI.DELETE_USERS);
    }


    @And("Validate delete users recourse json schema")
    public void validateDeleteUsersRecourseJsonSchema() {
        File jsonSchema = new File(ConstantUsers.JSON_SCHEMA_DELETE+"/ValidDeleteUsersSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    // Negative Delete With Invalid Parameter
    @Given("Delete users with invalid parameter")
    public void deleteUsersWithInvalidParameter() {
        lapakUsersAPI.setGetUsersInvalid();
    }
}
