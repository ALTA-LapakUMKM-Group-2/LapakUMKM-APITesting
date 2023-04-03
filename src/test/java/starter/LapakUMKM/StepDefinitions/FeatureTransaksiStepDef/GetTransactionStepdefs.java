package starter.LapakUMKM.StepDefinitions.FeatureTransaksiStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.TransactionAPI;
import starter.LapakUMKM.Utils.Constant;
import io.restassured.module.jsv.JsonSchemaValidator;


import java.io.File;

public class GetTransactionStepdefs {
    @Steps
    TransactionAPI transactionAPI;

    @Given("Get list data transaction")
    public void getListDataTransaction() {
        transactionAPI.getListTransaction();
    }

    @When("Send get list data transaction")
    public void sendGetListDataTransaction() {
        SerenityRest.when().get(TransactionAPI.GET_LIST_TRANSACTION);
    }

    @Then("Status code should be {int} OK")
    public void statusCodeShouldBeOK(int ok) {
        SerenityRest.then().statusCode(ok);
    }

    @And("Validate get list data transaction resource json schema")
    public void ValidateGetListdataTransactionResourceJsonSchema() {
        File jsonSchemaListResources = new File(Constant.JSON_SCHEMA_GETLISTTRANSACTION + "GetListTransactionJSONSchema2.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaListResources));
    }
    //GETby id
    @Given("Get by id with valid {int}")
    public void getById(int id) {
        transactionAPI.setGetById(id);
    }

    @When("Send get single data transaction")
    public void sendGetSingleDataTransaction() {
        SerenityRest.when().get(TransactionAPI.GET_ID_TRANSACTION);
    }

    @And("Validate get single data resource json schema")
    public void validateGetSingleDataResourceJsonSchema(){
        File jsonSchemaListResources = new File(Constant.JSON_SCHEMA_GETID +"GetIdTransactionJSONSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaListResources));
    }
    //invalid id
    @Given("Get by with invalid {int}")
    public void getByWithInvalidId(int id) {
        transactionAPI.setGetByWithInvalidId(id);
    }
    @Then("Status code should be {int} Not Found")
    public void statusCodeShouldBeNotFound(int notFound) {
        SerenityRest.then().statusCode(notFound);
    }

    @Given("Get detail transaction by id {int}")
    public void getDetailTransactionById(int arg0) {
    }


    @Given("Get single data transaction with valid id {int}")
    public void getSingleDataTransactionWithValidId(int id) {
        transactionAPI.setGetbySingleDataTransactionWithValidId(id);
    }

    @When("Send get single data transcation")
    public void sendGetSingleDataTranscation() {
        SerenityRest.when().get(TransactionAPI.GET_LIST_TRANSACTION);
    }

    @Given("Get Detail Transaction By Invalid {int}")
    public void getDetailTransactionByInvalidId(int id) {
        transactionAPI.setGetDetailTransactionByInvalidId(id);
    }


}
