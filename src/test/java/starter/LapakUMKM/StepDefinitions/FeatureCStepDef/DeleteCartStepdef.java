package starter.LapakUMKM.StepDefinitions.FeatureCStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.CartAPI;

public class DeleteCartStepdef {
    @Steps
    CartAPI cartAPI;
    @Given("Delete cart with id {int}")
    public void deleteCartWithId(int id) {
        cartAPI.setDeleteCart(id);    }

    @When("Send delete cart")
    public void sendDeleteCart() {
        SerenityRest.when().put(CartAPI.DELETE_SINGLE_CART);
    }
}
