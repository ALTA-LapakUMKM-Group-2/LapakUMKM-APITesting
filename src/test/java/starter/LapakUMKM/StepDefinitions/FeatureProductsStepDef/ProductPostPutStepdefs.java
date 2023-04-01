package starter.LapakUMKM.StepDefinitions.FeatureProductsStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.LapakProductsApi;
import starter.LapakUMKM.LapakResponses;

import java.io.File;

public class ProductPostPutStepdefs {
    @Steps
    LapakProductsApi lapakProductsApi;
    LapakResponses lapakResponses;

    @Given("Post create product valid json request body with auth token")
    public void postCreateProductValidJsonRequestBodyWithAuthToken() {
        File image = new File(Constant.UPLOAD_IMAGE + "img.png");
        lapakProductsApi.setPostCreateProducts("products",image);

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
        File jsonSchemaProducts = new File(Constant.JSON_SCHEMA_PRODUCTS + "PostInvalidParameter.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaProducts));
    }

    @Given("Post add image product with multipart valid")
    public void postAddImageProductWithMultipartValid() {
        File image = new File(Constant.UPLOAD_IMAGE + "baju3.jpeg");
        lapakProductsApi.setPostAddImage(image,10);
    }

    @When("Send post add image product parameter")
    public void sendPostAddImageProductParameter() {
        SerenityRest.when().post(lapakProductsApi.POST_ADD_IMAGE);

    }

    @And("Validate add image product valid resources json schema")
    public void validateAddImageProductValidResourcesJsonSchema() {
        File jsonSchemaProducts = new File(Constant.JSON_SCHEMA_PRODUCTS + "PostAddImageValid.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaProducts));
    }

    @Given("Post add image product with multipart valid without auth token")
    public void postAddImageProductWithMultipartValidWithoutAuthToken() {
        File image = new File(Constant.UPLOAD_IMAGE + "baju3.jpeg");
        lapakProductsApi.setPostAddImageWithoutAuthToken(image,10);
    }

    @And("Validate add image product valid without auth token resources json schema")
    public void validateAddImageProductValidWithoutAuthTokenResourcesJsonSchema() {
        File jsonSchemaProducts = new File(Constant.JSON_SCHEMA_PRODUCTS + "PostCreateProductInvalid.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaProducts));
    }

    @Given("Post add image product with other extension image")
    public void postAddImageProductWithOtherExtensionImage() {
        File image = new File(Constant.JSON_SCHEMA_PRODUCTS + "PostCreateProductInvalid.json");
        lapakProductsApi.setPostAddImageOtherExtension(image,10);
    }

    @Then("Status code should be {int} unsupported media type")
    public void statusCodeShouldBeUnsupportedMediaType(int arg0) {
        SerenityRest.then().statusCode(arg0);

    }

    @And("Validate add image product with other extension image json schema")
    public void validateAddImageProductWithOtherExtensionImageJsonSchema() {
        File jsonSchemaProducts = new File(Constant.JSON_SCHEMA_PRODUCTS + "PostCreateProductInvalid.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaProducts));
    }

    @Given("Post add image product with large size")
    public void postAddImageProductWithLargeSize() {
        File image = new File(Constant.UPLOAD_IMAGE + "largeExtension.jpg");
        lapakProductsApi.setPostAddImageOtherExtension(image,10);
    }

    @Then("Status code should be {int} Request Entity Too Large")
    public void statusCodeShouldBeRequestEntityTooLarge(int arg0) {
        SerenityRest.then().statusCode(arg0);
    }

    @Given("Post add image product without file image")
    public void postAddImageProductWithoutFileImage() {
        lapakProductsApi.setPostAddImageWithoutFile(10);
    }
    @And("Validate add image product without file image resources json schema")
    public void validateAddImageProductWithoutFileImageResourcesJsonSchema() {
        File jsonSchemaProducts = new File(Constant.JSON_SCHEMA_PRODUCTS + "PostCreateProductInvalid.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaProducts));
    }

    @Given("Post add image product invalid parameter")
    public void postAddImageProductInvalidParameter() {
        lapakProductsApi.setPostAddImageInvalidParameter(90909);
    }

    @And("Validate add image product invalid parameter resources json schema")
    public void validateAddImageProductInvalidParameterResourcesJsonSchema() {
        File jsonSchemaProducts = new File(Constant.JSON_SCHEMA_PRODUCTS + "PostCreateProductInvalid.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaProducts));
    }


    @Given("PUT update a product valid json request body")
    public void putUpdateAProductValidJsonRequestBody() {
        Response response = SerenityRest.get(lapakProductsApi.DELETE_PRODUCTS_GET);
        JsonPath jsonPath= response.jsonPath();
        int id = jsonPath.get(lapakResponses.DELETE_ID);
        lapakProductsApi.setPutUpdateDataProducts(id);
        
    }

    @When("Send put update a product parameter")
    public void sendPutUpdateAProductParameter() {
        SerenityRest.when().put(lapakProductsApi.GET_LIST_PRODUCTS_ID);
    }

    @And("Validate update a product valid resources json schema")
    public void validateUpdateAProductValidResourcesJsonSchema() {
        File jsonSchemaProducts = new File(Constant.JSON_SCHEMA_PRODUCTS + "PutUpdateValid.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaProducts));
    }

    @Given("PUT update a product valid json request body without token")
    public void putUpdateAProductValidJsonRequestBodyWithoutToken() {
        lapakProductsApi.setPutUpdateDataProductsWithoutToken(10);
    }

    @And("Validate update a product without auth token resources json schema")
    public void validateUpdateAProductWithoutAuthTokenResourcesJsonSchema() {
        File jsonSchemaProducts = new File(Constant.JSON_SCHEMA_PRODUCTS + "PostCreateProductInvalid.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaProducts));
    }

    @Given("PUT update a product without json request body")
    public void putUpdateAProductWithoutJsonRequestBody() {
        Response response = SerenityRest.get(lapakProductsApi.DELETE_PRODUCTS_GET);
        JsonPath jsonPath= response.jsonPath();
        int id = jsonPath.get(lapakResponses.DELETE_ID);
        lapakProductsApi.setPutUpdateDataProductsWithoutReqJson(id);
    }

    @And("Validate update a product without req body resources json schema")
    public void validateUpdateAProductWithoutReqBodyResourcesJsonSchema() {
        File jsonSchemaProducts = new File(Constant.JSON_SCHEMA_PRODUCTS + "PostCreateProductInvalid.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaProducts));
    }

    @Given("PUT update a product invalid json request body")
    public void putUpdateAProductInvalidJsonRequestBody() {
        Response response = SerenityRest.get(lapakProductsApi.DELETE_PRODUCTS_GET);
        JsonPath jsonPath= response.jsonPath();
        int id = jsonPath.get(lapakResponses.DELETE_ID);
        lapakProductsApi.setPutUpdateDataProductsInvalidJsonReq(id);
    }

    @And("Validate update a product invalid req body resources json schema")
    public void validateUpdateAProductInvalidReqBodyResourcesJsonSchema() {
        File jsonSchemaProducts = new File(Constant.JSON_SCHEMA_PRODUCTS + "PostCreateProductInvalid.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaProducts));
    }

    @Given("PUT update a product invalid parameter")
    public void putUpdateAProductInvalidParameter() {
        lapakProductsApi.setPutUpdateDataProductsInvalidParameter(80898);
    }

    @And("Validate update a product invalid parameter resources json schema")
    public void validateUpdateAProductInvalidParameterResourcesJsonSchema() {
        File jsonSchemaProducts = new File(Constant.JSON_SCHEMA_PRODUCTS + "PostCreateProductInvalid.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaProducts));
    }
}
