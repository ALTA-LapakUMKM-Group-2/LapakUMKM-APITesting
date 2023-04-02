package starter.LapakUMKM;


import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.LapakUMKM.Utils.ConstantChat;
import starter.LapakUMKM.Utils.ConstantFeedback;

import java.io.File;

public class ChatAPI {

    public static String TOKEN = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NTMsInJvbGUiOiJ1c2VyIiwiZXhwIjoxNjgwNTc5NTk2fQ.5nCAcugpPf7cJYc6WZOJHKAkhhTBrUzsbFPc-k_QdYI";

    // POST
    public static String POST_CREATE_CHAT = ConstantChat.BASE_URL + "/chats";
    @Step("Post create data chats")
    public void setPostCreateChat(File json){
        SerenityRest.given().header("Authorization", TOKEN).contentType(ContentType.JSON).body(json);
    }


    //GET
    public static String GET_DATA_ID = ConstantChat.BASE_URL + "/rooms/{id}/chats";
    @Step("Get by valid ID")
    public void setGetDataId(int id){
        SerenityRest.given().header("Authorization", TOKEN).pathParam("id", id);
    }

    public void setGetDataInvalidId(String id){
        SerenityRest.given().header("Authorization", TOKEN).pathParam("id", id);
    }

}