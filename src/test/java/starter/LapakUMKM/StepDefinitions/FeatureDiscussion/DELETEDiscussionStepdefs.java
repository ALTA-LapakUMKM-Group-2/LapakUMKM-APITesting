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

    @Given("Delete data discussion with invalid alphabet {string}")
    public void deleteDataDiscussionWithInvalidAlphabet(String id) {
        discussionAPI.setDeleteInvalidDiscussion(id);
    }

    @And("Validate delete data invalid id discussion recourse json schema")
    public void validateDeleteDataInvalidIdDiscussionRecourseJsonSchema() {
        File jsonSchema = new File(ConstantDiscussion.JSON_SCHEMA_DELETE + "/DeleteInvalidIDJsonSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @When("Send delete invalid data discussion")
    public void sendDeleteInvalidDataDiscussion() {
        SerenityRest.when().delete(DiscussionAPI.DELETE_INVALID_DISCUSSION);
    }

    @Given("Delete data discussion with invalid special character {string}")
    public void deleteDataDiscussionWithInvalidSpecialCharacter(String id) {
        discussionAPI.setDeleteInvalidDiscussion(id);
    }

    @Given("Delete data discussion with no registered id {int}")
    public void deleteDataDiscussionWithNoRegisteredId(int id) {
        discussionAPI.setDeleteDiscussion(id);
    }
}
