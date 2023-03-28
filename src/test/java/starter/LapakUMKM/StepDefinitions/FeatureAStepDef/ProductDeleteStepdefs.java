package starter.LapakUMKM.StepDefinitions.FeatureAStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import net.serenitybdd.rest.SerenityRest;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
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
        lapakProductsApi.setDeleteProducts(80808080);
    }

    @And("Validate delete product invalid resources json schema")
    public void validateDeleteProductInvalidResourcesJsonSchema() {
    }

    @Given("Delete image product with valid parameter")
    public void deleteImageProductWithValidParameter() {
    }
}
