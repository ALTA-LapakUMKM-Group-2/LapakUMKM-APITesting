package starter.LapakUMKM.StepDefinitions.FeatureDiscussion;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.DiscussionAPI;
import starter.LapakUMKM.Utils.ConstantDiscussion;

import java.io.File;

public class PUTDiscussionStepdefs {
    @Steps
    DiscussionAPI discussionAPI;

    @Given("Put update data request body discussion id {int}")
    public void putUpdateDataRequestBodyDiscussion(int id) {
        File jsonReq = new File(ConstantDiscussion.JSON_REQ_BODY_PUT + "/PutReqBody.json");
        discussionAPI.setPutUpdateDiscussion(id, jsonReq);
    }

    @When("Send put update data discussion")
    public void sendPutUpdateData() {
        SerenityRest.when().put(DiscussionAPI.PUT_UPDATE_DISCUSSION);
    }

    @And("Validate put update data resource json schema")
    public void validatePutUpdateDataResourceJsonSchema() {
        File jsonSchema = new File(ConstantDiscussion.JSON_SCHEMA_PUT + "/PutJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @And("Validate put discussion invalid update data resource json schema")
    public void validatePutDiscussionInvalidUpdateDataResourceJsonSchema() {
        File jsonSchema = new File(ConstantDiscussion.JSON_SCHEMA_PUT + "/PutInvalidJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Given("Put update data request body with valid json {int}")
    public void putUpdateDataRequestBodyWithValidJson(int id) {
        File jsonReq = new File(ConstantDiscussion.JSON_REQ_BODY_PUT + "/PutInvalidJsonReqBody.json");
        discussionAPI.setPutUpdateDiscussion(id, jsonReq);
    }

    @Given("Put update data request body invalid product id {int}")
    public void putUpdateDataRequestBodyInvalidProductId(int id) {
        File jsonReq = new File(ConstantDiscussion.JSON_REQ_BODY_PUT + "/PutInvalidProductIDJsonReqBody.json");
        discussionAPI.setPutUpdateDiscussion(id, jsonReq);
    }

    @Given("Put update data with request body product id is blank {int}")
    public void putUpdateDataWithRequestBodyProductIdIsBlank(int id) {
        File jsonReq = new File(ConstantDiscussion.JSON_REQ_BODY_PUT + "/PutProductIDBlankReqBody.json");
        discussionAPI.setPutUpdateDiscussion(id, jsonReq);
    }

}
