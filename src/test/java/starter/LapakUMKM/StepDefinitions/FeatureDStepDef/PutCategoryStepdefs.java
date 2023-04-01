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

public class PutCategoryStepdefs {
    @Steps
    CategoryAPI categoryAPI;

    @Given("Put update category with valid {int}")
    public void putUpdateCategoryWithValidId(int id) {
        File jsonReq = new File(Constant.JSON_REQ_BODY_PUT + "UpdateCategoryReqBody.json");
        categoryAPI.setPutUpdateCategoryWithValidId(id, jsonReq);
    }

    @When("Send put update category")
    public void sendPutUpdateCategory() {
        SerenityRest.when().put(CategoryAPI.PUT_UPDATE_CATEGORY);
    }

    @And("Validate put update category resource json schema")
    public void validatePutUpdateCategoriesResourceJsonSchema(){
        File jsonSchemaPutUpdateCategoriesResources = new File(Constant.JSON_SCHEMA_PUT +"UpdateCategoryJSONSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaPutUpdateCategoriesResources));
    }

    @Given("Put update category with invalid {int}")
    public void putUpdateCategoryWithInvalidId(int id) {
        File jsonReq = new File(Constant.JSON_REQ_BODY_PUTINVALID + "/UpdateInvalidCategoryReqBody.json");
        categoryAPI.setPutUpdateCategoryWithValidId(id, jsonReq);
    }

    @Given("Put Update category with valid {int} input empty value")
    public void putUpdateCategoryWithValidIdInputEmptyValue(int id) {
        File jsonReq = new File(Constant.JSON_REQ_BODY_PUTEMPTYVALUE + "/UpdateEmptyValueCategoryReqBody.json");
        categoryAPI.setPutUpdateCategoryWithValidIdInputEmptyValue(id, jsonReq);
    }
}
