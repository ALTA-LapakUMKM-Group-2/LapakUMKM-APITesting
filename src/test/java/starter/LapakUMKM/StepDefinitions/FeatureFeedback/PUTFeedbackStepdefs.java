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

    @When("Send put update data feedback")
    public void sendPutUpdateDataFeedback() {
        SerenityRest.when().put(FeedbackAPI.PUT_UPDATE_FEEDBACK);
    }

    @And("Validate put update data feedback resource json schema")
    public void validatePutUpdateDatafeedbackResourceJsonSchema() {
        File jsonSchema = new File(ConstantFeedback.JSON_SCHEMA_PUT + "/PutJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @And("Validate put invalid update data feedback resource json schema")
    public void validatePutInvalidUpdateDatafeedbackResourceJsonSchema() {
        File jsonSchema = new File(ConstantFeedback.JSON_SCHEMA_PUT + "/PutInvalidJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Given("Put update data request body feedback id {int}")
    public void putUpdateDataRequestBodyFeedbackId(int id) {
        File jsonReq = new File(ConstantFeedback.JSON_REQ_BODY_PUT + "/PutFeedbackIDReqBody.json");
        feedbackAPI.setPutUpdateFeedback(id, jsonReq);
    }

    @Given("Put update data request body product id {int}")
    public void putUpdateDataRequestBodyProductId(int id) {
        File jsonReq = new File(ConstantFeedback.JSON_REQ_BODY_PUT + "/PutProductIDFeedbackReqBody.json");
        feedbackAPI.setPutUpdateFeedback(id, jsonReq);
    }

    @Given("Put update data request body invalid feedback product id {int}")
    public void putUpdateDataRequestBodyInvalidProductId(int id) {
        File jsonReq = new File(ConstantFeedback.JSON_REQ_BODY_PUT + "/PutInvalidProductIDFeedbackReqBody.json");
        feedbackAPI.setPutUpdateFeedback(id, jsonReq);
    }

    @Given("Put update data with request body product feedback id is blank id {int}")
    public void putUpdateDataWithRequestBodyProductfeedbackIdIsBlankId(int id) {
        File jsonReq = new File(ConstantFeedback.JSON_REQ_BODY_PUT + "/PutProductIDBlankFeedbackReqBody.json");
        feedbackAPI.setPutUpdateFeedback(id, jsonReq);
    }

    @Given("Put Create new data with request body rating is blank id {int}")
    public void putCreateNewDataWithRequestBodyRatingIsBlankId(int id) {
        File jsonReq = new File(ConstantFeedback.JSON_REQ_BODY_PUT + "/PutRatingBlankFeedbackReqBody.json");
        feedbackAPI.setPutUpdateFeedback(id, jsonReq);
    }

    @Given("Put Create new data with request body invalid rating id {int}")
    public void putCreateNewDataWithRequestBodyInvalidRatingId(int id) {
        File jsonReq = new File(ConstantFeedback.JSON_REQ_BODY_PUT + "/PutRatingInvalidFeedbackReqBody.json");
        feedbackAPI.setPutUpdateFeedback(id, jsonReq);
    }

    @Given("Given Put update data request body with valid json {int}")
    public void givenPutUpdateDataRequestBodyWithValidJson(int id) {
        File jsonReq = new File(ConstantFeedback.JSON_REQ_BODY_PUT + "/PutValidFeedbackReqBody.json");
        feedbackAPI.setPutUpdateFeedback(id, jsonReq);
    }


    @Given("Put update data with feedback id is blank id {int}")
    public void putUpdateDataWithFeedbackIdIsBlankId(int id) {
        File jsonReq = new File(ConstantFeedback.JSON_REQ_BODY_PUT + "/PutFeedbackBlankReqBody.json");
        feedbackAPI.setPutUpdateFeedback(id, jsonReq);
    }
}
