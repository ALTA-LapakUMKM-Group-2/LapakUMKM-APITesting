package starter.LapakUMKM.StepDefinitions.FeatureFeedback;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.FeedbackAPI;
import starter.LapakUMKM.Utils.ConstantFeedback;

import java.io.File;

public class GETFeedbackProductStepdefs {
    @Steps
    FeedbackAPI feedbackAPI;

    @Given("Get data feedback from product id  with valid id {int}")
    public void getDataFeedbackFromProductIdWithValidId(int id) {
        feedbackAPI.setGetProductFeedback(id);
    }

    @When("Send  Get data feedback from product")
    public void sendGetDataFeedbackFromProduct() {
        SerenityRest.when().get(feedbackAPI.GET_PRODUCT_FEEDBACK);
    }

    @And("Validate feedback from product resource json schema")
    public void validateFeedbackFromProductResourceJsonSchema() {
        File jsonSchema = new File(ConstantFeedback.JSON_SCHEMA_GET_PRODUCT + "/GetfromProductJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }
}
