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
        SerenityRest.when().post(ConstantDiscussion.JSON_SCHEMA_POST);
    }

    @Then("Status code should be {int} Created")
    public void statusCodeShouldBeCreated(int oke) {
        SerenityRest.then().statusCode(oke);
    }

    @And("Validate post create new data resources json schema")
    public void validatePostCreateNewDataResourcesJsonSchema() {
        File jsonSchema = new File(ConstantDiscussion.JSON_SCHEMA_POST + "/PostJsonSchema");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }
}
