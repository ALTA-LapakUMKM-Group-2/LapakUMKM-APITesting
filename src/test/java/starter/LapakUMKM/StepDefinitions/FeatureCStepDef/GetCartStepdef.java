package starter.LapakUMKM.StepDefinitions.FeatureCStepDef;

import net.thucydides.core.annotations.Steps;

public class GetCartStepdef {
    @Steps
    CartAPI cartAPI;

    @Given("Get list data cart")
    public void getListDataCart() { cartAPI.getListCart();}

    @When("Send get list data")
    public void sendGetListData() {
        SerenityRest.when().get(CartAPI.GET_LIST_CART);
    }

    @Then("Status code should be {int} OK")
    public void statusCodeShouldBeOK(int ok) {
        SerenityRest.then().statusCode(ok);
    }

    @And("Validate get list resources json schema")
    public void validateGetListResourcesJsonSchema(){
        File jsonSchemaListResources = new File(Constant.JSON_SCHEMA_GETLIST +"GetListCartJSONSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaListResources));
    }

    @Given("Get single data categories with valid {int}")
    public void getSingleDataCartWithValidID(int id) {
        categoryAPI.setGetSingleDataCartWithValidId(id);
    }

    @When("Send get single categories")
    public void sendGetSingleCart() {
        SerenityRest.when().get(CartAPI.GET_SINGLE_CATEGORY);
    }

    @And("Validate get single data resource json schema")
    public void validateGetsingleDataResourceJsonSchema(){
        File jsonSchemaListResources = new File(Constant.JSON_SCHEMA_GETSINGLE +"GetSingleCartJSONSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaListResources));
    }
}
