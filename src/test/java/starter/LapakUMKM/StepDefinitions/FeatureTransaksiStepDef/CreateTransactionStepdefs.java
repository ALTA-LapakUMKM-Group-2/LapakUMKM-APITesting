package starter.LapakUMKM.StepDefinitions.FeatureTransaksiStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.TransactionAPI;
import starter.LapakUMKM.Utils.ConstantTransaksi;

import java.io.File;

public class CreateTransactionStepdefs {
    @Steps
    TransactionAPI transactionAPI;

    @Given("Post create new data with request body transaction")
    public void postCreateNewDataWithRequestBodyTransaction() {
        File jsonReq = new File(ConstantTransaksi.JSON_REQ_BODY_POST_TRANSACTION+"CreateTransactionReqBody.json");
        transactionAPI.setGetPostCreateNewDataWithRequestBodyTransaction(jsonReq);
    }

    @When("Send create new transaction")
    public void sendCreateNewTransaction() {
        SerenityRest.when().post(TransactionAPI.POST_CREATE_TRANSACTION);
    }

    @Then("Status code should be {int} created")
    public void statusCodeShouldBeOK(int created) {
        SerenityRest.then().statusCode(created);
    }

    @And("Validate new transaction resource json schema")
    public void validateNewTransactionResourceJsonSchema() {
        File jsonSchemaNewCategoriesResources = new File(ConstantTransaksi.JSON_SCHEMA_POSTNEWT + "CreateIdTransactionJSONSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaNewCategoriesResources));
    }

    @Given("Create new transaction empty value")
    public void createNewTransactionEmptyValueInvalid(int id) {
        File jsonSchemaNewCategoriesResources = new File(ConstantTransaksi.JSON_SCHEMA_POSTNEWT + "CreateIdTransactionJSONSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaNewCategoriesResources));
    }



    @When("Send transaction")
        public void sendTransaction(){
            SerenityRest.when().post(TransactionAPI.POST_CREATE_TRANSACTION);
        }

//
//    @Then("Status code should be {int} Bad Request")
//    public void statusCodeShouldBeBadRequest(int arg0) {
//    }

    @Given("Create new transaction empty value \\(invalid)")
    public void createNewTransactionEmptyValueInvalid() {
    }
}
//   @Given("Post create new transaction empty value")
//    public void postCreateNewTransactionEmptyValue() {
//        File jsonReq = new File(Constant.JSON_REQ_BODY_POSTEMPTYVALUE + "/PostEmptyValueTransactionReqBody.json");
//        transactionAPI.setGetPostCreateNewTransactionEmptyValue(jsonReq);
//    }
//
//    @Then("Status code should be {int} Bad Request")
//    public void statusCodeShouldBeBadRequest(int badRequest) {
//        SerenityRest.then().statusCode(badRequest);
//    }
//}
