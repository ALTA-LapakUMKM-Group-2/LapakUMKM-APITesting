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

public class PostCategoryStepdefs {
    @Steps
    CategoryAPI categoryAPI;

    @Given("Post create new data with request body categories")
    public void postCreateNewDataWithRequestBodyCategories() {
        File jsonReq = new File(Constant.JSON_REQ_BODY_POST_FEATURE + "PostCategoryReqBody.json");
        categoryAPI.setGetPostCreateNewDataWithRequestBodyCategories(jsonReq);
    }

    @When("Send create new categories")
    public void sendCreateNewCategories() {SerenityRest.when().post(CategoryAPI.POST_CREATE_CATEGORY);
    }

    @And("Validate new categories resource json schema")
    public void validateNewCategoriesResourceJsonSchema(){
        File jsonSchemaNewCategoriesResources = new File(Constant.JSON_SCHEMA_POSTNEW +"CreateNewCategoryJSONSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaNewCategoriesResources));
    }

    @Given("Post create new categories empty value")
    public void postCreateNewCategoriesEmptyValue() {
        File jsonReq = new File(Constant.JSON_REQ_BODY_POSTEMPTYVALUE + "/PostEmptyValueCategoryReqBody.json");
        categoryAPI.setGetPostCreateNewCategoriesEmptyValue(jsonReq);
    }

    @Given("Post create new categories long value")
    public void postCreateNewCategoriesLongValue() {
        File jsonReq = new File(Constant.JSON_REQ_BODY_POSTLONGVALUE + "/PostLongValueCategoryReqBody.json");
        categoryAPI.setGetPostCreateNewCategoriesLongValue(jsonReq);
    }
}
