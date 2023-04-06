package starter.LapakUMKM.StepDefinitions.FeatureCStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.CartAPI;
import starter.LapakUMKM.Utils.ConstantCart;

import java.io.File;

public class PostCartStepdef {
    @Steps
    CartAPI cartAPI;
    @Given("Post create new data with request body cart")
    public void postCreateNewDataWithRequestBodyCart() {
        File jsonReq = new File(ConstantCart.JSON_SCHEMA_Post_CART + "PostCartReqBody.json");
        cartAPI.setGetPostCartNewDataWithRequestBodyCart(jsonReq);
    }

    @When("Send create new categories")
    public void sendCreateNewCategories() {SerenityRest.when().post(CategoryAPI.POST_CREATE_CATEGORY);
    }

    @Then("Status code should be {int} Created")
    public void statusCodeShouldBeCreated(int Created) {
        SerenityRest.then().statusCode(Created);
    }

    @And("Validate new categories resource json schema")
    public void validateNewCategoriesResourceJsonSchema(){
        File jsonSchemaNewCategoriesResources = new File(Constant.JSON_SCHEMA_POSTNEW +"CreateNewCategoryJSONSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaNewCategoriesResources));
    }
}

//

//

