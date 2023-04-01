package starter.LapakUMKM.StepDefinitions.FeatureFeedback;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.FeedbackAPI;
import starter.LapakUMKM.Utils.ConstantFeedback;

import java.io.File;

public class POSTFeedbackStepdefs {
    @Steps
    FeedbackAPI feedbackAPI;

    @Given("Post create new data with request body valid id product and feedback")
    public void postCreateNewDataWithRequestBodyValidIdProductAndFeedback() {
        File jsonReq = new File(ConstantFeedback.JSON_REQ_BODY_POST + "/PostFeedbackReqBody.json");
        feedbackAPI.setPostCreateFeedback(jsonReq);
    }

    @When("Send post for create new data feedback")
    public void sendPostForCreateNewDatafeedback() {
        SerenityRest.when().post(feedbackAPI.POST_CREATE_FEEDBACK);
    }

    @And("Validate post create feedback new data resources json schema")
    public void validatePostCreateNewDataResourcesJsonSchema() {
        File jsonSchema = new File(ConstantFeedback.JSON_SCHEMA_POST + "/PostJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Given("Post create new data with request body parent id is blank feedback")
    public void postCreateNewDataWithRequestBodyParentIdIsBlankfeedback() {
        File jsonReq = new File(ConstantFeedback.JSON_REQ_BODY_POST+"/PostParentBlankFeedbackReqBody.json");
        feedbackAPI.setPostCreateFeedback(jsonReq);
    }


    @And("Validate post feedback invalid create new data resources json schema")
    public void validatefeedbackPostInvalidCreateNewDataResourcesJsonSchema() {
        File jsonSchema = new File(ConstantFeedback.JSON_SCHEMA_POST +"/PostInvalidJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Given("Post Create new data with request body invalid parent id feedback")
    public void postCreateNewDataWithRequestBodyInvalidParentIdfeedback() {
        File jsonReq = new File(ConstantFeedback.JSON_REQ_BODY_POST+"/PostInvalidParentFeedbackReqBody.json");
        feedbackAPI.setPostCreateFeedback(jsonReq);
    }

    @Given("Post Create new data with product id not registered feedback")
    public void postCreateNewDataWithProductIdNotRegisteredfeedback() {
        File jsonReq = new File(ConstantFeedback.JSON_REQ_BODY_POST+"/PostInvalidParentFeedbackReqBody.json");
        feedbackAPI.setPostCreateFeedback(jsonReq);
    }

    @Given("Post Create new data with invalid id product and feedback")
    public void postCreateNewDataWithInvalidIdProductAndFeedback() {
        File jsonReq = new File(ConstantFeedback.JSON_REQ_BODY_POST+"/PostInvalidJsonFeedbackReqBody.json");
        feedbackAPI.setPostCreateFeedback(jsonReq);
    }

    @Given("Post Create new data with request body product id is blank feedback")
    public void postCreateNewDataWithRequestBodyProductIdIsBlankfeedback() {
        File jsonReq = new File(ConstantFeedback.JSON_REQ_BODY_POST+"/PostProductIDBlankFeedbackReqBody.json");
        feedbackAPI.setPostCreateFeedback(jsonReq);
    }

    @Given("Post Create new data with request body feedback id is blank")
    public void postCreateNewDataWithRequestBodyFeedbackIdIsBlank() {
        File jsonReq = new File(ConstantFeedback.JSON_REQ_BODY_POST+"/PostFeedbackBlankReqBody.json");
        feedbackAPI.setPostCreateFeedback(jsonReq);
    }

    @Given("Post Create new data with request body rating is blank")
    public void postCreateNewDataWithRequestBodyRatingIsBlank() {
        File jsonReq = new File(ConstantFeedback.JSON_REQ_BODY_POST+"/PostRatingBlankFeedbackReqBody.json");
        feedbackAPI.setPostCreateFeedback(jsonReq);
    }

    @Given("Post Create new data with request body invalid rating")
    public void postCreateNewDataWithRequestBodyInvalidRating() {
        File jsonReq = new File(ConstantFeedback.JSON_REQ_BODY_POST+"/PostInvalidRatingFeedbackReqBody.json");
        feedbackAPI.setPostCreateFeedback(jsonReq);
    }
}
