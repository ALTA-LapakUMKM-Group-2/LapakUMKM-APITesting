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

public class UpdateUsersStepDef {
    @Steps
    LapakUsersAPI lapakUsersAPI;
    @Given("Post update data request body")
    public void postUpdateDataRequestBody() {
        File jsonReq = new File(ConstantUsers.JSON_REQ_BODY_UPDATE + "/UpdateUsers.json");
        lapakUsersAPI.setPostUpdateUsers(jsonReq);
    }

    @When("Send put update data")
    public void sendPutUpdateData() {
        SerenityRest.when().post(LapakUsersAPI.UPDATE_USERS);
    }


    @And("Validate post update users resource json schema")
    public void validatePostUpdateUsersResourceJsonSchema() {
        File jsonSchema = new File(ConstantUsers.JSON_SCHEMA_UPDATE + "/UpdateUsersSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }
}
