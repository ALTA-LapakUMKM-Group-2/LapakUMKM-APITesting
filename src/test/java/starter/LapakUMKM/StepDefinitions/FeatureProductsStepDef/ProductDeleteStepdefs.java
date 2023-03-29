package starter.LapakUMKM.StepDefinitions.FeatureProductsStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import net.serenitybdd.rest.SerenityRest;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.LapakProductsApi;
import starter.LapakUMKM.LapakResponses;

public class ProductDeleteStepdefs {
    @Steps
    LapakProductsApi lapakProductsApi;
    LapakResponses lapakResponses;
    @Given("Delete product with valid parameter")
    public void deleteProductWithValidParameter() {
        Response response = SerenityRest.get(lapakProductsApi.DELETE_PRODUCTS_GET);
        JsonPath jsonPath= response.jsonPath();
        int id = jsonPath.get(lapakResponses.DELETE_ID);
        lapakProductsApi.setDeleteProducts(id);
    }

    @When("Send delete product parameter")
    public void sendDeleteProductParameter() {
        SerenityRest.when().delete(lapakProductsApi.DELETE_PRODUCTS);

    }

    @And("Validate delete product valid resources json schema")
    public void validateDeleteProductValidResourcesJsonSchema() {
    }

    @Given("Delete product valid parameter without auth token")
    public void deleteProductValidParameterWithoutAuthToken() {
        lapakProductsApi.setDeleteProductsWithoutAuth(5);
    }

    @And("Validate delete product without auth token resources json schema")
    public void validateDeleteProductWithoutAuthTokenResourcesJsonSchema() {
    }

    @Given("Delete product with invalid parameter")
    public void deleteProductWithInvalidParameter() {
        lapakProductsApi.setDeleteProducts(898);
    }

    @And("Validate delete product invalid resources json schema")
    public void validateDeleteProductInvalidResourcesJsonSchema() {
    }

    @Given("Delete image product with valid parameter")
    public void deleteImageProductWithValidParameter() {
        Response response = SerenityRest.get(lapakProductsApi.DELETE_PRODUCTS_GET);
        JsonPath jsonPath= response.jsonPath();
        int id1 = jsonPath.get(lapakResponses.DELETE_ID);
        int id2 = jsonPath.get(lapakResponses.IMAGE_ID);
        lapakProductsApi.setDeleteProductsImage(id1,id2);
    }

    @When("Send delete image product parameter")
    public void sendDeleteImageProductParameter() {
        SerenityRest.when().delete(lapakProductsApi.DELETE_PRODUCTS_IMAGE);

    }

    @And("Validate delete image product valid resources json schema")
    public void validateDeleteImageProductValidResourcesJsonSchema() {

    }

    @Given("Delete image product with invalid parameter")
    public void deleteImageProductWithInvalidParameter() {
        Response response = SerenityRest.get(lapakProductsApi.DELETE_PRODUCTS_GET);
        JsonPath jsonPath= response.jsonPath();
        int id1 = jsonPath.get(lapakResponses.DELETE_ID);
        lapakProductsApi.setDeleteProductsImageInvalidParameter(id1,809);
    }

    @And("Validate delete image product invalid resources json schema")
    public void validateDeleteImageProductInvalidResourcesJsonSchema() {
    }

    @Given("Delete image product without auth token")
    public void deleteImageProductWithoutAuthToken() {
        lapakProductsApi.setDeleteProductsImageWithoutToken(11,11);
    }

    @And("Validate delete image product without auth token resources json schema")
    public void validateDeleteImageProductWithoutAuthTokenResourcesJsonSchema() {
    }
}
