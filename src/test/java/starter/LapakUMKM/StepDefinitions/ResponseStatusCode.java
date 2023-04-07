package starter.LapakUMKM.StepDefinitions;

import io.cucumber.java.en.Then;
import net.serenitybdd.rest.SerenityRest;

public class ResponseStatusCode {

    @Then("Status code should be {int} OK")
    public void statusCodeShouldBeOK(int oke) {
        SerenityRest.then().statusCode(oke);
    }

    @Then("Status code should be {int} Not Found")
    public void statusCodeShouldBeNotFound(int ok) {
        SerenityRest.then().statusCode(ok);
    }

    @Then("Status code should be {int} Created")
    public void statusCodeShouldBeCreated(int oke) {
        SerenityRest.then().statusCode(oke);
    }
        @Then("Status code should be {int} Bad Request")
    public void statusCodeShouldBeBadRequest(int ok) {
        SerenityRest.then().statusCode(ok);
    }

    @Then("Status code should be {int} Unauthorized")
    public void statusCodeShouldBeUnauthorized(int arg0) {
        SerenityRest.then().statusCode(arg0);
    }

}
