package starter.LapakUMKM.StepDefinitions.FeatureDStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.LapakAPI;
import starter.LapakUMKM.Utils.Constant;

import java.io.File;

public class CategoryStepdefs {
    @Steps
    LapakAPI lapakAPI;

    @Given("Get list data categories")
    public void getListDataCategories() {lapakAPI.getListCategories();}

    @When("Send get list data")
    public void sendGetListData() {
        SerenityRest.when().get(LapakAPI.GET_LIST_CATEGORIES);
    }

    @Then("Status code should be {int} OK")
    public void statusCodeShouldBeOK(int ok) {
        SerenityRest.then().statusCode(ok);
    }
    @And("Validate get list resources json schema")
    public void validateGetListResourcesJsonSchema(){
        File jsonSchemaListResources = new File(Constant.JSON_SCHEMA_GETLIST +"GetListCategoryJSONSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaListResources));
    }
}
