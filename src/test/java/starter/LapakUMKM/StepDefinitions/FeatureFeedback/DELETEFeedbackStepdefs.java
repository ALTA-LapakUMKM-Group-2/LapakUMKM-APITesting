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

public class DELETEFeedbackStepdefs {
    @Steps
    FeedbackAPI feedbackAPI;

    @Given("Delete data feedback with valid id {int}")
    public void deleteDataFeedbackWithValidId(int id) {
        feedbackAPI.setDeleteIdFeedback(id);
    }

    @When("Send delete data feedback")
    public void sendDeleteDataFeedback() {
        SerenityRest.when().delete(feedbackAPI.DELETE_ID_FEEDBACK);
    }

    @And("Validate delete data feedback recourse json schema")
    public void validateDeleteDataFeedbackRecourseJsonSchema() {
        File jsonSchema = new File(ConstantFeedback.JSON_SCHEMA_DELETE + "/DeleteJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }
}
