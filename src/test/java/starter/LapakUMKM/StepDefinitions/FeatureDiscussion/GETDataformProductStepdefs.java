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

    @And("Validate get data from product data resource json schema")
    public void validateGetDataFromProductDataResourceJsonSchema() {
        File jsonSchema = new File(ConstantDiscussion.JSON_SCHEMA_GET_DATA_PRODUCT + "/GetDataformProductJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @When("Send get data form product")
    public void sendGetDataFormProduct() {
        SerenityRest.when().get(DiscussionAPI.GET_DATA_FROM_PRODUCT);
    }
}
