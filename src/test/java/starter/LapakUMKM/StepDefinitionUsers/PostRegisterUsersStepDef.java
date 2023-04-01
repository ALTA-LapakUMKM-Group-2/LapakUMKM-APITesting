package starter.LapakUMKM.StepDefinitionUsers;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.questions.UIState;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.Utils.ConstantUsers;
import starter.LapakUMKM.Utils.UsersAPI;

import java.io.File;

public class PostRegisterUsers {
    @Steps
    UsersAPI usersAPI;
    @Given("Post register user with valid json")
    public void postRegisterUserWithValidJson() {
        File json = new File(ConstantUsers.JSON_REQ_BODY_REGISTER + "/RegisterReqBody.json");
        usersAPI.registerUser(json);
    }

    @When("Send request post register user")
    public void sendRequestPostRegisterUser() {
        SerenityRest.when().post(usersAPI.REGISTER_USERS);
    }

    @And("Response body id should be {int} and token {string}")
    public void responseBodyIdShouldBeAndToken(int id, String token) {
    }

    @And("Validate json schema register")
    public void validateJsonSchemaRegister() {
    }
}
