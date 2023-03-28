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

public class ProductPostPutStepdefs {
    @Steps
    LapakProductsApi lapakProductsApi;
    @Given("Post create product valid json request body with auth token")
    public void postCreateProductValidJsonRequestBodyWithAuthToken() {
        lapakProductsApi.setPostCreateProducts("products");

    }

    @When("Send post create product parameter")
    public void sendPostCreateProductParameter() {
        SerenityRest.when().post(lapakProductsApi.POST_CREATE_PRODUCTS);
    }

    @Then("Status code should be {int} Created")
    public void statusCodeShouldBeCreated(int arg0) {
        SerenityRest.then().statusCode(arg0);
    }

    @And("Validate post create new user with auth token resources json schema")
    public void validatePostCreateNewUserWithAuthTokenResourcesJsonSchema() {
        File jsonSchemaListUser = new File(Constant.JSON_SCHEMA_PRODUCTS + "PostCreateProductsValid.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaListUser));

    }

    @Given("Post create product valid json request body without auth token")
    public void postCreateProductValidJsonRequestBodyWithoutAuthToken() {
        lapakProductsApi.setPostCreateProductsWithoutAuth("products");
    }

    @Then("Status code should be {int} Unauthorized")
    public void statusCodeShouldBeUnauthorized(int arg0) {
        SerenityRest.then().statusCode(arg0);
    }

    @And("Validate post create new user without auth token resources json schema")
    public void validatePostCreateNewUserWithoutAuthTokenResourcesJsonSchema() {
        File jsonSchemaProducts = new File(Constant.JSON_SCHEMA_PRODUCTS + "PostCreateProductInvalid.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaProducts));
    }

    @Given("Post create product without json request body")
    public void postCreateProductWithoutJsonRequestBody() {
        lapakProductsApi.setPostCreateProductsWithoutReqBody("products");
    }

    @Then("Status code should be {int} Bad Request")
    public void statusCodeShouldBeBadRequest(int arg0) {
        SerenityRest.then().statusCode(arg0);
    }

    @And("Validate create product without json request body resources json schema")
    public void validateCreateProductWithoutJsonRequestBodyResourcesJsonSchema() {
        File jsonSchemaProducts = new File(Constant.JSON_SCHEMA_PRODUCTS + "PostCreateProductInvalid.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaProducts));
    }

    @Given("Post create product with empty field json request body")
    public void postCreateProductWithEmptyFieldJsonRequestBody() {
        lapakProductsApi.setPostCreateProductsWithoutStringReqbody("products");
    }

    @And("Validate create product with empty field json request body resources json schema")
    public void validateCreateProductWithEmptyFieldJsonRequestBodyResourcesJsonSchema() {
        File jsonSchemaProducts = new File(Constant.JSON_SCHEMA_PRODUCTS + "PostCreateProductInvalid.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaProducts));
    }

    @Given("Post create product with invalid parameter")
    public void postCreateProductWithInvalidParameter() {
        lapakProductsApi.setPostCreateProductsInvalidParameter("products665");
    }

    @And("Validate create product with invalid parameter resources json schema")
    public void validateCreateProductWithInvalidParameterResourcesJsonSchema() {
        File jsonSchemaProducts = new File(Constant.JSON_SCHEMA_PRODUCTS + "PostCreateProductInvalid.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaProducts));
    }
}
