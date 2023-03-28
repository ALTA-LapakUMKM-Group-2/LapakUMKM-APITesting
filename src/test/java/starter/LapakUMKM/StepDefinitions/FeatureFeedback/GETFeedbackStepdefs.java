package starter.LapakUMKM.StepDefinitions.FeatureFeedback;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.FeedbackAPI;
import starter.LapakUMKM.Utils.ConstantFeedback;
import io.restassured.module.jsv.JsonSchemaValidator;

import java.io.File;

public class GETFeedbackStepdefs {
    @Steps
    FeedbackAPI feedbackAPI;


    @Given("Get list data feedback")
    public void getListDataFeedback() {
        feedbackAPI.setGetListFeedback();
    }

    @When("Send get list data")
    public void sendGetListData() {
        SerenityRest.when().get(FeedbackAPI.GET_LIST_FEEDBACK);
    }

    @Then("Status code should be {int} OK")
    public void statusCodeShouldBeOK(int oke) {
        SerenityRest.then().statusCode(oke);
    }

    @And("Validate get list data resource json schema")
    public void validateGetListDataResourceJsonSchema() {
        File jsonSchema = new File(ConstantFeedback.JSON_SCHEMA_GET + "/GetfromProductJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Given("Get single data feedback with valid id {int}")
    public void getSingleDataFeedbackWithValidId(int id) {
        feedbackAPI.setGetIdFeedback(id);
    }

    @When("Send get single data feedback")
    public void sendGetSingleDataFeedback() {
        SerenityRest.when().get(feedbackAPI.GET_ID_FEEDBACK);
    }

    @And("Validate get single data resource json schema")
    public void validateGetSingleDataResourceJsonSchema() {
        File jsonSchema = new File(ConstantFeedback.JSON_SCHEMA_GET + "/GetIDJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Given("Get single data feedback with invalid id special character {string}")
    public void getSingleDataFeedbackWithInvalidIdSpecialCharacter(String id) {
        feedbackAPI.setGetInvalidIdFeedback(id);
    }

    @Then("Status code should be {int} Not Found")
    public void statusCodeShouldBeNotFound(int ok) {
        SerenityRest.then().statusCode(ok);
    }

    @And("Validate get single data invalid feedback id resource json schema")
    public void validateGetSingleDataInvalidFeedbackIdResourceJsonSchema() {
        File jsonSchema = new File(ConstantFeedback.JSON_SCHEMA_GET + "/GetInvalidJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Given("Get single data feedback with invalid id alphabet {string}")
    public void getSingleDataFeedbackWithInvalidIdAlphabet(String id) {
        feedbackAPI.setGetInvalidIdFeedback(id);
    }

    @Given("Get single data feedback with not registered id {int}")
    public void getSingleDataFeedbackWithNotRegisteredId(int id) {
        feedbackAPI.setGetIdFeedback(id);
    }
}
