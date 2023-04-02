package starter.LapakUMKM.StepDefinitions.FeatureChat;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.ChatAPI;
import starter.LapakUMKM.Utils.ConstantChat;
import io.restassured.module.jsv.JsonSchemaValidator;
import java.io.File;

public class POSTChatStepdefs {
    @Steps
    ChatAPI chatAPI;


    @Given("Post create new data chat with valid data json")
    public void postCreateNewDataChatWithValidDataJson() {
        File jsonReq = new File(ConstantChat.JSON_REQ_BODY_POST + "/POSTCreateChatReqBody.json");
        chatAPI.setPostCreateChat(jsonReq);
    }

    @When("Send post create new chat")
    public void sendPostCreateNewChat() {
        SerenityRest.when().post(ChatAPI.POST_CREATE_CHAT);
    }

    @And("Validate post create new data chat resources json schema")
    public void validatePostCreateNewDataChatResourcesJsonSchema() {
        File jsonSchema = new File(ConstantChat.JSON_SCHEMA_POST +"/POSTChatJSIONSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Given("Post create new data chat with invalid data json")
    public void postCreateNewDataChatWithInvalidDataJson() {
        File jsonReq = new File(ConstantChat.JSON_REQ_BODY_POST + "/POSTInvalidCreateChatReqBody.json");
        chatAPI.setPostCreateChat(jsonReq);
    }

    @And("Validate post create new data invalid chat resources json schema")
    public void validatePostCreateNewDataInvalidChatResourcesJsonSchema() {
        File jsonSchema = new File(ConstantChat.JSON_SCHEMA_POST +"/POSTChatInvalidJSIONSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Given("Post create new data chat with recipient_id is blank")
    public void postCreateNewDataChatWithRecipient_idIsBlank() {
        File jsonReq = new File(ConstantChat.JSON_REQ_BODY_POST + "/POSTRecepientBlankCreateChatReqBody.json");
        chatAPI.setPostCreateChat(jsonReq);
    }


    @Given("Post create new data chat with text is blank")
    public void postCreateNewDataChatWithTextIsBlank() {
        File jsonReq = new File(ConstantChat.JSON_REQ_BODY_POST + "/POSTTextBlankCreateChatReqBody.json");
        chatAPI.setPostCreateChat(jsonReq);
    }
}
