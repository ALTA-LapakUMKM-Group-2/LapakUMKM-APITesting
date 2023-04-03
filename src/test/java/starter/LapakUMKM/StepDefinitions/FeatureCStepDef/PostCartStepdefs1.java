package starter.LapakUMKM.StepDefinitions.FeatureCStepDef;

public class PostCartStepdefs1 {
    @Steps
    CartAPI cartAPI;

    @Given("Post create new data with request body cart")
    public void postCreateNewDataWithRequestBodyCart() {
        File jsonReq = new File(Constant.JSON_REQ_BODY_POST_FEATURE + "PostCategoryReqBody.json");
        categoryAPI.setGetPostCreateNewDataWithRequestBodyCart(jsonReq);
    }

    @When("Send create new cart")
    public void sendCreateNewCart() {SerenityRest.when().post(CartAPI.POST_CREATE_CART);
    }

    @Then("Status code should be {int} Created")
    public void statusCodeShouldBeCreated(int Created) {
        SerenityRest.then().statusCode(Created);
    }

    @And("Validate new cart resource json schema")
    public void validateNewCartResourceJsonSchema(){
        File jsonSchemaNewCartResources = new File(Constant.JSON_SCHEMA_POSTNEW +"CreateNewCartJSONSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaNewCartResources));
    }

    @Given("Post create new cart empty value")
    public void postCreateNewCartEmptyValue() {
        File jsonReq = new File(Constant.JSON_REQ_BODY_POSTEMPTYVALUE + "/PostEmptyValueCartReqBody.json");
        cartAPI.setGetPostCreateNewCategoriesEmptyValue(jsonReq);
    }

    @Then("Status code should be {int} Bad Request")
    public void statusCodeShouldBeBadRequest(int badRequest) {
        SerenityRest.then().statusCode(badRequest);
    }

    @Given("Post create new cart long value")
    public void postCreateNewCartLongValue() {
        File jsonReq = new File(Constant.JSON_REQ_BODY_POSTLONGVALUE + "/PostLongValueCartReqBody.json");
        cartAPI.setGetPostCreateNewCartLongValue(jsonReq);
    }
}
