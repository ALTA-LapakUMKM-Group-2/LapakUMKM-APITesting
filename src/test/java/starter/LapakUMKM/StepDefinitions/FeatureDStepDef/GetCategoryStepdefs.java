package starter.LapakUMKM.StepDefinitions.FeatureDStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.CategoryAPI;
import starter.LapakUMKM.Utils.Constant;

import java.io.File;

public class GetCategoryStepdefs {
    @Steps
    CategoryAPI categoryAPI;

    @Given("Get list data categories")
    public void getListDataCategories() { categoryAPI.getListCategories();}

    @When("Send get list data")
    public void sendGetListData() {
        SerenityRest.when().get(CategoryAPI.GET_LIST_CATEGORIES);
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

    @Given("Get single data categories with valid {int}")
    public void getSingleDataCategoriesWithValidID(int id) {
        categoryAPI.setGetSingleDataCategoriesWithValidId(id);
    }

    @When("Send get single categories")
    public void sendGetSingleCategories() {
        SerenityRest.when().get(CategoryAPI.GET_SINGLE_CATEGORY);
    }

    @And("Validate get single data resource json schema")
    public void validateGetsingleDataResourceJsonSchema(){
        File jsonSchemaListResources = new File(Constant.JSON_SCHEMA_GETSINGLE +"GetSingleCategoryJSONSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaListResources));
    }

    @Given("Get single data categories with invalid {int}")
    public void getSingleDataCategoriesWithInvalidId(int id) {
        categoryAPI.setGetSingleDataCategoriesWithInvalidId(id);
    }

    @Then("Status code should be {int} Not Found")
    public void statusCodeShouldBeNotFound(int notFound) {
        SerenityRest.then().statusCode(notFound);
    }
}
