package starter.LapakUMKM.StepDefinitions.FeatureFeedback;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.FeedbackAPI;
import starter.LapakUMKM.Utils.ConstantFeedback;

import java.io.File;

public class PUTFeedbackStepdefs {
    @Steps
    FeedbackAPI feedbackAPI;

    @Given("Put update data request body with valid json id {int}")
    public void putUpdateDataRequestBodyWithValidJson(int id) {
        File jsonReq = new File(ConstantFeedback.JSON_REQ_BODY_PUT + "/PutFeedbackReqBody.json");
        feedbackAPI.setPutUpdateFeedback(id, jsonReq);
    }

    @When("Send put update data")
    public void sendPutUpdateData() {
        SerenityRest.when().put(FeedbackAPI.PUT_UPDATE_FEEDBACK);
    }

    @And("Validate put update data resource json schema")
    public void validatePutUpdateDataResourceJsonSchema() {
        File jsonSchema = new File(ConstantFeedback.JSON_SCHEMA_PUT + "/PutJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }
}
