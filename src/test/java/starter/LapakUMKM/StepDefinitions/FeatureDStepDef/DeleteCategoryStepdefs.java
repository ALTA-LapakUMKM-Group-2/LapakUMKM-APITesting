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

public class DeleteCategoryStepdefs {
    @Steps
    CategoryAPI categoryAPI;

    @Given("Delete category with valid {int}")
    public void getDeleteCategoryWithValidId(int id) {
        categoryAPI.setDeleteCategoryWithValidId(id);
    }

    @When("Send delete category")
    public void sendGetDeleteCategories() {
        SerenityRest.when().delete(CategoryAPI.DELETE_SINGLE_CATEGORY);
    }

    @Given("Delete category with invalid {int}")
    public void getDeleteCategoryWithInvalidId(int id) {
        categoryAPI.setDeleteCategoryWithInvalidId(id);
    }
}
