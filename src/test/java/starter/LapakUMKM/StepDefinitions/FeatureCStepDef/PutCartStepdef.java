package starter.LapakUMKM.StepDefinitions.FeatureCStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.CartAPI;
import starter.LapakUMKM.Utils.ConstantCart;

import java.io.File;

public class PutCartStepdef {
    @Steps
    CartAPI cartAPI;

    @Given("Put edit new data with request body cart with id {int}")
    public void putEditNewDataWithRequestBodyCart(int id) {
        File jsonReq = new File(ConstantCart.JSON_REQ_POSTEMPTY + "PutCartReqBody.json");
        cartAPI.setPutEditNewCart(jsonReq, id);
    }
    @When("Send edit new cart")
    public void sendEditNewCart() {
        SerenityRest.when().put(CartAPI.PUT_UPDATE_CART);
    }
    @Then("Status code should be {int} Not Found")
    public void statusCodeShouldBeNotFound(int NotFound) {
        SerenityRest.then().statusCode(NotFound);
    }

}
