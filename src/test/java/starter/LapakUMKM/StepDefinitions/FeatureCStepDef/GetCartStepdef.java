package starter.LapakUMKM.StepDefinitions.FeatureCStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import jnr.constants.Constant;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.CartAPI;
import starter.LapakUMKM.Utils.ConstantCart;

import java.io.File;

public class GetCartStepdef {
    @Steps
    CartAPI cartAPI;
    @Given("Get list data cart valid parameter")
    public void getListDataCartValidParameter() {
        cartAPI.getListCart();
    }

    @When("Send request get list cart")
    public void sendRequestGetListCart() {
        SerenityRest.when().get(CartAPI.GET_LIST_CART);
    }



    @And("Validate json schema list cart")
    public void validateJsonSchemaListCart() {
        File jsonSchemaListResources = new File(ConstantCart.JSON_SCHEMA_GET_CART +"GetCartSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaListResources));
    }
    @Given("Get single data cart with valid {int}")
    public void getSingleDataCartWithValidID(int id) {
        cartAPI.setGetSingleDataCartWithValidId(id);
    }

    @When("Send get single cart")
    public void sendGetSingleCart() {
        SerenityRest.when().get(CartAPI.GET_SINGLE_CART);
    }

    @And("Validate get single data cart resource json schema")
    public void validateGetsingleDataCartResourceJsonSchema(){
        File jsonSchemaListResources = new File(ConstantCart.JSON_SCHEMA_GET_SINGLE +"GetSingleCartJSONSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaListResources));
    }
}

//

//

