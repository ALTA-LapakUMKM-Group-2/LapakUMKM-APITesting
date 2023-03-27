package starter.LapakUMKM.StepDefinitions.FeatureDiscussion;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.DiscussionAPI;
import io.restassured.module.jsv.JsonSchemaValidator;
import starter.LapakUMKM.Utils.ConstantDiscussion;

import java.io.File;


public class GETDiscussionStepdefs {
    @Steps
    DiscussionAPI discussionAPI;

    @Given("Get list data discussion")
    public void getListDataDiscussion() {
        discussionAPI.setGetListData();
    }

    @When("Send get list data")
    public void sendGetListData() {
        SerenityRest.when().get(DiscussionAPI.GET_LIST_DATA);
    }

    @Then("Status code should be {int} OK")
    public void statusCodeShouldBeOK(int ok) {
        SerenityRest.then().statusCode(ok);
    }

    @And("Validate get list data resource json schema")
    public void validateGetListDataResourceJsonSchema() {
        File jsonSchema = new File(ConstantDiscussion.JSON_SCHEMA_GET + "/GetJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Given("Get single data discussion with valid id {int}")
    public void getSingleDataDiscussionWithValidIdId(int id) {
        discussionAPI.setGetDiscussion(id);
    }

    @When("Send get single data discussion")
    public void sendGetSingleDataDiscussion() {
        SerenityRest.when().get(DiscussionAPI.GET_DISCUSSION);
    }

    @And("Validate get single data resource json schema")
    public void validateGetSingleDataResourceJsonSchema() {
        File jsonSchema = new File(ConstantDiscussion.JSON_SCHEMA_GET + "/GetSingleJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }
}
