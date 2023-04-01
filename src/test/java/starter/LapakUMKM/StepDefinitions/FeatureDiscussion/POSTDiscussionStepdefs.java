package starter.LapakUMKM.StepDefinitions.FeatureDiscussion;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.DiscussionAPI;
import starter.LapakUMKM.Utils.ConstantDiscussion;

import java.io.File;

public class POSTDiscussionStepdefs {
    @Steps
    DiscussionAPI discussionAPI;

    @Given("Post create new data with request body valid id product and discussion")
    public void postCreateNewDataWithRequestBodyValidIdProductAndDiscussion() {
        File jsonReq = new File(ConstantDiscussion.JSON_REQ_BODY_POST + "/PostReqBody.json");
        discussionAPI.setPostCreateDiscussion(jsonReq);
    }

    @When("Send post for create new data")
    public void sendPostForCreateNewData() {
        SerenityRest.when().post(discussionAPI.POST_CREATE_DISCUSSION);
    }

//    @Then("Status code should be {int} Created")
//    public void statusCodeShouldBeCreated(int oke) {
//        SerenityRest.then().statusCode(oke);
//    }

    @And("Validate post create new data resources json schema")
    public void validatePostCreateNewDataResourcesJsonSchema() {
        File jsonSchema = new File(ConstantDiscussion.JSON_SCHEMA_POST + "/PostJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Given("Post create new data with request body parent id is blank")
    public void postCreateNewDataWithRequestBodyParentIdIsBlank() {
        File jsonReq = new File(ConstantDiscussion.JSON_REQ_BODY_POST + "/PostParentBlankReqBody.json");
        discussionAPI.setPostCreateDiscussion(jsonReq);
    }

    @Given("Post Create new data with request body invalid parent id")
    public void postCreateNewDataWithRequestBodyInvalidParentId() {
        File jsonReq = new File(ConstantDiscussion.JSON_REQ_BODY_POST + "/PostInvalidParentReqBody.json");
        discussionAPI.setPostCreateDiscussion(jsonReq);
    }

//    @Then("Status code should be {int} Bad Request")
//    public void statusCodeShouldBeBadRequest(int ok) {
//        SerenityRest.then().statusCode(ok);
//    }

    @And("Validate post discussion invalid create new data resource json schema")
    public void validatePostInvalidCreateNewDataResourceJsonSchema() {
        File jsonSchema = new File(ConstantDiscussion.JSON_SCHEMA_POST + "/PostInvalidJsonSchema.json");
    }

    @Given("Post Create new data with product id not registered")
    public void postCreateNewDataWithProductIdNotRegistered() {
        File jsonReq = new File(ConstantDiscussion.JSON_REQ_BODY_POST + "/PostNotRegisterReqBody.json");
        discussionAPI.setPostCreateDiscussion(jsonReq);
    }

    @Given("Post Create new data with invalid id product and discussion")
    public void postCreateNewDataWithInvalidIdProductAndDiscussion() {
        File jsonReq = new File(ConstantDiscussion.JSON_REQ_BODY_POST + "/PostInvalidJSONReqBody.json");
        discussionAPI.setPostCreateDiscussion(jsonReq);
    }

    @Given("Post Create new data with request body product id is blank")
    public void postCreateNewDataWithRequestBodyProductIdIsBlank() {
        File jsonReq = new File(ConstantDiscussion.JSON_REQ_BODY_POST + "/PostProductIDBlankReqBody.json");
        discussionAPI.setPostCreateDiscussion(jsonReq);
    }

    @Given("Post Create new data with request body discussion id is blank")
    public void postCreateNewDataWithRequestBodyDiscussionIdIsBlank() {
        File jsonReq = new File(ConstantDiscussion.JSON_REQ_BODY_POST+"/PostDiscussionBlankReqBody.json");
        discussionAPI.setPostCreateDiscussion(jsonReq);
    }
}
