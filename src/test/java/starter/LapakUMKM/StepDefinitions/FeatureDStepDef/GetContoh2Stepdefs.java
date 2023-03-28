//package starter.LapakUMKM.StepDefinitions.FeatureDStepDef;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import net.serenitybdd.rest.SerenityRest;
//import net.thucydides.core.annotations.Steps;
//import starter.LapakUMKM.LapakUMKMCartTransaksi;
//import starter.LapakUMKM.LapakResponses;
//import starter.LapakUMKM.Utils.Constant;
//import java.io.File;
//
//import io.restassured.module.jsv.JsonSchemaValidator;
//
//import static org.hamcrest.CoreMatchers.equalTo;
//
//public class /GetContoh2Stepdefs {
//    @Steps
//    LapakUMKMCartTransaksi lapakUMKMCartTransaksi;
//    @Given("Get single user detail registered {int}")
//    public void getSingleUserDetailRegisteredId(int id) {
//        lapakUMKMCartTransaksi.setGetSingleUser(id);
//
//    }
//
//    @When("Send get single user parameter")
//    public void sendGetSingleUserParameter() {
//        SerenityRest.when().get(lapakUMKMCartTransaksi.GET_SINGLE_USER);
//    }
//
//    @And("Respons body should be {int} user")
//    public void responsBodyShouldBeIdUser(int id) {SerenityRest.then().body(LapakResponses.ID,equalTo(id));
//    }
//
//    @And("Validate get single user detail resources json schema")
//    public void validateGetSingleUserDetaliResourcesJsonSchema() {
//        File jsonSchemaListUser = new File(Constant.JSON_SCHEMA_USER +"SingleUserJSONSchema.json");
//        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaListUser));
//    }
//
//    @Given("Get single user detail unregistered {int}")
//    public void getSingleUserDetailUnregisteredId(int id) {
//        lapakUMKMCartTransaksi.setGetSingleUser(id);
//    }
//
//    @And("Respons body should error {string}")
//    public void responsBodyShouldError(String message) {SerenityRest.then().body(LapakResponses.MESSAGE,equalTo(message));
//    }
//
//    @And("Validate json schema")
//    public void validateGetSingleUserDetaliResourcesJsonSchema1() {
//        File jsonSchemaListUser = new File(Constant.JSON_SCHEMA_USER +"SingleUserUnregisterJSONSchema.json");
//        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaListUser));
//    }
//}
