package starter.LapakUMKM.StepDefinitions.FeatureChat;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.ChatAPI;
import starter.LapakUMKM.Utils.ConstantChat;

import java.io.File;

public class GETChatStepdefs {
    @Steps
    ChatAPI chatAPI;

    @Given("Get messages data by chatroom parameter valid Id {string}")
    public void getMessagesDataByChatroomParameterValidIdR(String arg0) {
        chatAPI.setGetDataInvalidId(arg0);
    }

    @When("Send get messages by chatroom valid Id")
    public void sendGetMessagesByChatroomValidId() {
        SerenityRest.when().get(ChatAPI.GET_DATA_ID);
    }

    @And("Validate get messages by chatroom with valid id resources json schema")
    public void validateGetMessagesByChatroomWithValidIdResourcesJsonSchema() {
        File jsonSchema = new File(ConstantChat.JSON_SCHEMA_GET + "/GETChatJSIONSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Given("Get messages data by chatroom parameter alphabet invalid Id {string}")
    public void getMessagesDataByChatroomParameterAlphabetInvalidId(String arg0) {
        chatAPI.setGetDataInvalidId(arg0);
    }

    @When("Send get messages by chatroom invalid Id")
    public void sendGetMessagesByChatroomInvalidId() {
        SerenityRest.when().get(chatAPI.GET_DATA_ID);
    }

    @And("Validate get messages by chatroom with invalid id resources json schema")
    public void validateGetMessagesByChatroomWithInvalidIdResourcesJsonSchema() {
        File jsonSchema = new File(ConstantChat.JSON_SCHEMA_GET + "/GETInvalidChatJSIONSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Given("Get messages data by chatroom parameter special character invalid Id {string}")
    public void getMessagesDataByChatroomParameterSpecialCharacterInvalidId(String arg0) {
        chatAPI.setGetDataInvalidId(arg0);

    }

    @Given("Get messages data by chatroom parameter unregister Id {int}")
    public void getMessagesDataByChatroomParameterUnregisterId(int arg0) {
        chatAPI.setGetDataId(arg0);

    }
}
