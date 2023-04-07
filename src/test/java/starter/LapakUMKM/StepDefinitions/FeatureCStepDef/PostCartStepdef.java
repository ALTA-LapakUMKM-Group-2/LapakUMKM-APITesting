package starter.LapakUMKM.StepDefinitions.FeatureCStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.CartAPI;
import starter.LapakUMKM.Utils.ConstantCart;

import java.io.File;

public class PostCartStepdef {
    @Steps
    CartAPI cartAPI;
    @Given("Post create new data with request body cart")
    public void postCreateNewDataWithRequestBodyCart() {
        File jsonReq = new File(ConstantCart.JSON_REQ_CART + "PostCartReqBody.json");
        cartAPI.setGetPostCreateNewCart(jsonReq);
    }

    @When("Send create new cart")
    public void sendCreateNewCart() {SerenityRest.when().post(CartAPI.POST_CREATE_CART);
    }

    @Then("Status code should be {int} Created")
    public void statusCodeShouldBeCreated(int Created) {
        SerenityRest.then().statusCode(Created);
    }

    //Post create new data with request body cart with empty value
    @Given("Post create new data with request body cart with empty value")
    public void postCreateNewDataWithRequestBodyCartWithEmptyValue() {
        File jsonReq = new File(ConstantCart.JSON_REQ_CART + "PostEmptyCartReqBody.json");
        cartAPI.setGetPostCreateNewCart(jsonReq);
    }
    @Then("Status code should be {int} Bad Request")
    public void statusCodeShouldBeBadRequest(int BadRequest) {
        SerenityRest.then().statusCode(BadRequest);
    }

}

//

//

