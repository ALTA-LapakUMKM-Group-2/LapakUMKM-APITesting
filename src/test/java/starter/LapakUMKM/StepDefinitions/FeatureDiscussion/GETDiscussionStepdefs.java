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

    @And("Validate get discussion single data resource json schema")
    public void validateGetdiscussionSingleDataResourceJsonSchema() {
        File jsonSchema = new File(ConstantDiscussion.JSON_SCHEMA_GET + "/GetSingleJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    //NEGATIVE CASE

    @Given("Get single data discussion with invalid id special character {string}")
    public void getSingleDataDiscussionWithInvalidIdSpecialCharacter(String id) {
        discussionAPI.setGetInvalidDiscussion(id);
    }

    @And("Validate get single data invalid id resource json schema")
    public void validateGetSingleDataInvalidIdResourceJsonSchema() {
        File jsonSchema = new File(ConstantDiscussion.JSON_SCHEMA_GET + "/GetSpecialCharacterJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Given("Get single data discussion with invalid id alphabet {string}")
    public void getSingleDataDiscussionWithInvalidIdAlphabet(String id) {
        discussionAPI.setGetInvalidDiscussion(id);
    }

    @Given("Get single data discussion with not registered id {int}")
    public void getSingleDataDiscussionWithNotRegisteredId(int id) {
        discussionAPI.setGetDiscussion(id);
    }
}
