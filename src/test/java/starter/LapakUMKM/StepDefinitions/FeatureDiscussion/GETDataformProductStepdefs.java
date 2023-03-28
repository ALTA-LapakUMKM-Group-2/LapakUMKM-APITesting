package starter.LapakUMKM.StepDefinitions.FeatureDiscussion;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.DiscussionAPI;
import starter.LapakUMKM.Utils.ConstantDiscussion;

import java.io.File;

public class GETDataformProductStepdefs {
    @Steps
    DiscussionAPI discussionAPI;

    @Given("Get data discussion from product id  with valid id {int}")
    public void getDataDiscussionFromProductIdWithValidId(int id) {
        discussionAPI.setGetDataFromProduct(id);
    }

    @And("Validate get data discussion from product data resource json schema")
    public void validateGetDataFromProductDataResourceJsonSchema() {
        File jsonSchema = new File(ConstantDiscussion.JSON_SCHEMA_GET_DATA_PRODUCT + "/GetDataformProductJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @When("Send get data form product")
    public void sendGetDataFormProduct() {
        SerenityRest.when().get(DiscussionAPI.GET_DATA_FROM_PRODUCT);
    }

    //NEGATIVE CASE


    @Given("Get data discussion from product id with no registered id {int}")
    public void getDataDiscussionFromProductIdWithNoRegisteredId(int id) {
        discussionAPI.setGetDataFromProduct(id);
    }

    @And("Validate get invalid data discussion from product data resource json schema")
    public void validateGetInvalidDataDiscussionFromProductDataResourceJsonSchema() {
        File jsonSchema = new File(ConstantDiscussion.JSON_SCHEMA_GET_DATA_PRODUCT + "/GetDataformProductINVALIDJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Given("Get data discussion from  product id with invalid id {string}")
    public void getDataDiscussionFromProductIdWithInvalidId(String id) {
        discussionAPI.setGetInvalidDiscussion(id);
    }

    @Given("Get data discussion from  product id with invalid alphabet id {string}")
    public void getDataDiscussionFromProductIdWithInvalidAlphabetId(String id) {
        discussionAPI.setGetInvalidDiscussion(id);
    }

    @Given("Get data discussion from  product id  without id")
    public void getDataDiscussionFromProductIdWithoutId() {
        discussionAPI.setGetWithoutidDataFromProduct();
    }

    @When("Send get data invalid id form product")
    public void sendGetDataInvalidIdFormProduct() {
        SerenityRest.when().get(discussionAPI.GET_DATA_INVALID_FROM_PRODUCT);
    }

    @When("Send get data without id form product")
    public void sendGetDataWithoutIdFormProduct() {
        SerenityRest.when().get(discussionAPI.GET_WITHOUTID_DATA_FROM_PRODUCT);
    }
}
