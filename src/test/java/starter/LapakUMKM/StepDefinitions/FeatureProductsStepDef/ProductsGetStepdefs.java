package starter.LapakUMKM.StepDefinitions.FeatureProductsStepDef;

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

public class ProductsGetStepdefs {
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

    @And("Validate get all valid parameter product resources json schema")
    public void validateGetListAllValidParameterProductResourcesJsonSchema() {
        File jsonSchemaListUser = new File(Constant.JSON_SCHEMA_PRODUCTS + "GetAllProducts.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaListUser));
    }

    @Given("Get list all product with invalid parameter id {string}")
    public void getListAllProductWithInvalidParameterId(String arg0) {
        lapakProductsApi.setGetListProducts("arg0");
    }

    @And("Validate get all product invalid parameter product resources json schema")
    public void validateGetListAllProductInvalidParameterProductResourcesJsonSchema() {
        File jsonSchemaListUser = new File(Constant.JSON_SCHEMA_PRODUCTS + "GetAllInvalid.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaListUser));
    }

    @Given("Get product by id {int} with valid parameter")
    public void getProductByIdWithValidParameter(int arg0) {
        lapakProductsApi.setGetListProductsId(arg0);
    }

    @When("Send get product by id parameter")
    public void sendProductByIdParameter() {
        SerenityRest.when().get(lapakProductsApi.GET_LIST_PRODUCTS_ID);

    }

    @And("Validate product by id valid parameter product resources json schema")
    public void validateProductByIdValidParameterProductResourcesJsonSchema() {
        File jsonSchemaListUser = new File(Constant.JSON_SCHEMA_PRODUCTS + "GetListProductById.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaListUser));
    }

    @Given("Get product by id with invalid parameter id {int}")
    public void getProductByIdWithInvalidParameterIdId(int id) {
        lapakProductsApi.setGetListProductsId(id);

    }

    @And("Validate get product by id invalid parameter product resources json schema")
    public void validateGetProductByIdInvalidParameterProductResourcesJsonSchema() {
        File jsonSchemaListUser = new File(Constant.JSON_SCHEMA_PRODUCTS + "GetProducstIdInvalid.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaListUser));
    }

    @Given("Get image by product id {int} valid parameter")
    public void getImageByProductIdValidParameter(int arg0) {
        lapakProductsApi.setGetListProductsImage(arg0);
    }

    @When("Send get image by products id parameter")
    public void sendGetImageByProductsIdParameter() {
        SerenityRest.when().get(lapakProductsApi.GET_LIST_PRODUCTS_IMAGE);

    }

    @And("Validate image by products resources json schema")
    public void validateImageByProductsResourcesJsonSchema() {
        File jsonSchemaListUser = new File(Constant.JSON_SCHEMA_PRODUCTS + "GetProductImageValid.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaListUser));
    }

    @Given("Get image by product id invalid parameter id {int}")
    public void getImageByProductIdInvalidParameterIdId(int arg0) {
        lapakProductsApi.setGetListProductsImage(arg0);
    }

    @When("Send get image product by id parameter")
    public void sendGetImageProductByIdParameter() {
        SerenityRest.when().get(lapakProductsApi.GET_LIST_PRODUCTS_IMAGE);
    }

    @And("Validate get image product by id invalid parameter product resources json schema")
    public void validateGetImageProductByIdInvalidParameterProductResourcesJsonSchema() {
        File jsonSchemaListUser = new File(Constant.JSON_SCHEMA_PRODUCTS + "GetProductsImageInvalid.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaListUser));
    }

    @Given("Get product by user id with valid parameter")
    public void getProductByUserIdWithValidParameter() {
        lapakProductsApi.setGetProductByUser(141);
    }


    @When("Send get product by user id parameter")
    public void sendGetProductByUserIdParameter() {
    SerenityRest.when().get(lapakProductsApi.GET_BYUSER);

    }


    @And("Validate product by user id parameter product resources json schema")
    public void validateProductByUserIdParameterProductResourcesJsonSchema() {
        File jsonSchemaListUser = new File(Constant.JSON_SCHEMA_PRODUCTS + "GetProductByUser.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaListUser));
    }

    @Given("Get product  by user id  with invalid parameter")
    public void getProductByUserIdWithInvalidParameter() {
        lapakProductsApi.setGetProductByUser(808);
    }

    @And("Validate product by user id invalid parameter product resources json schema")
    public void validateProductByUserIdInvalidParameterProductResourcesJsonSchema() {
        File jsonSchemaListUser = new File(Constant.JSON_SCHEMA_PRODUCTS + "GetProductsImageInvalid.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaListUser));

    }

    @Given("Get product by category with valid parameter")
    public void getProductByCategoryWithValidParameter() {
        lapakProductsApi.setGetProductByCategory(2);

    }

    @When("Send get product by category parameter")
    public void sendGetProductByCategoryParameter() {
        SerenityRest.when().get(lapakProductsApi.GET_BY_CATEGORY);

    }

    @And("Validate product by category  parameter product resources json schema")
    public void validateProductByCategoryParameterProductResourcesJsonSchema() {
        File jsonSchemaListUser = new File(Constant.JSON_SCHEMA_PRODUCTS + "GetProductByCategory.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaListUser));
    }

    @Given("Get product by category with invalid parameter")
    public void getProductByCategoryWithInvalidParameter() {
        lapakProductsApi.setGetProductByCategory(101);

    }

    @And("Validate product by category invalid parameter product resources json schema")
    public void validateProductByCategoryInvalidParameterProductResourcesJsonSchema() {
        File jsonSchemaListUser = new File(Constant.JSON_SCHEMA_PRODUCTS + "GetProductsImageInvalid.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaListUser));
    }
}