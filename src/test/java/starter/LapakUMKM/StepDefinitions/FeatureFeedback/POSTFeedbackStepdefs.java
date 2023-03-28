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

    @When("Send post for create new data")
    public void sendPostForCreateNewData() {
        SerenityRest.when().post(feedbackAPI.POST_CREATE_FEEDBACK);
    }

    @Then("Status code should be {int} Created")
    public void statusCodeShouldBeCreated(int ok) {
        SerenityRest.then().statusCode(ok);
    }

    @And("Validate post create new data resources json schema")
    public void validatePostCreateNewDataResourcesJsonSchema() {
        File jsonSchema = new File(ConstantFeedback.JSON_SCHEMA_POST + "/PostJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }
}
