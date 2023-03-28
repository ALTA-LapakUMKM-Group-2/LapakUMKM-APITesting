package starter.LapakUMKM.StepDefinitions.FeatureCStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import starter.LapakUMKM.LapakUMKMCartTransaksi;
import starter.LapakUMKM.Utils.Constant;

import java.io.File;

public class Contoh1Stepdefs {
    LapakUMKMCartTransaksi lapakUMKMCartTransaksi;

    @Given("Get list todos with valid parameter")
    public void getListTodosWithValidParameter() { lapakUMKMCartTransaksi.getListTodos("todos");
    }

    @When("Send request get list todos")
    public void sendRequestGetListTodos() {
        SerenityRest.when().get(lapakUMKMCartTransaksi.GET_LIST_TODOS);
    }

    @Then("Should return status code {int} OK")
    public void shouldReturnStatusCode(int OK) { SerenityRest.then().statusCode(OK);
    }

    @And("Validate json schema list todos")
    public void validateJsonSchemaListTodos() {
        File jsonSchemaListTodos = new File(Constant.JSON_SCHEMA_TODOS + "ListTodosJSONSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaListTodos));
    }
}
