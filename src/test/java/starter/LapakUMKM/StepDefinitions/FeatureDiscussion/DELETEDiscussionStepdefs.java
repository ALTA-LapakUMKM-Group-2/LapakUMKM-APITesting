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

public class DELETEDiscussionStepdefs {
    @Steps
    DiscussionAPI discussionAPI;

    @Given("Delete data discussion with valid id {int}")
    public void deleteDataDiscussionWithValidId(int id) {
        discussionAPI.setDeleteDiscussion(id);
    }

    @When("Send delete data discussion")
    public void sendDeleteDataDiscussion() {
        SerenityRest.when().delete(DiscussionAPI.DELETE_DISCUSSION);
    }

    @And("Validate delete data discussion recourse json schema")
    public void validateDeleteDataDiscussionRecourseJsonSchema() {
        File jsonSchema = new File(ConstantDiscussion.JSON_SCHEMA_DELETE + "/DeleteJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }
}
