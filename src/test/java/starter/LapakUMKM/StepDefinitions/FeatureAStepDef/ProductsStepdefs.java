package starter.LapakUMKM.StepDefinitions.FeatureAStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.LapakProductsApi;
import starter.LapakUMKM.Utils.Constant;

import java.io.File;

public class ProductsStepdefs {
@Steps
    LapakProductsApi lapakProductsApi;
    @Given("Get list all product with valid parameter")
    public void getListAllProductWithValidParameter() {
        lapakProductsApi.setGetListProducts("products");
    }

    @When("Send get list all product parameter")
    public void sendGetListAllProductParameter() {
        SerenityRest.when().get(lapakProductsApi.GET_LIST_PRODUCTS);
    }

    @And("Validate get list all valid parameter product resources json schema")
    public void validateGetListAllValidParameterProductResourcesJsonSchema() {
        File jsonSchemaListUser = new File(Constant.JSON_SCHEMA_PRODUCTS +"GetAllProducts.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaListUser));
    }

    @Then("Status code should be {int} OK")
    public void statusCodeShouldBeOK(int OK) {
        SerenityRest.then().statusCode(OK);
    }

    @Given("Get list all product with invalid parameter id {string}")
    public void getListAllProductWithInvalidParameterId(String arg0) {
        lapakProductsApi.setGetListProducts("arg0");
    }
    @Then("Status code should be {int} Not Found")
    public void statusCodeShouldBeNotFound(int arg0) {
        SerenityRest.then().statusCode(arg0);
    }

    @And("Validate get list all product invalid parameter product resources json schema")
    public void validateGetListAllProductInvalidParameterProductResourcesJsonSchema() {
        File jsonSchemaListUser = new File(Constant.JSON_SCHEMA_PRODUCTS +"GetAllInvalid.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaListUser));
    }


}
