package starter.LapakUMKM;

import io.restassured.http.ContentType;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.LapakUMKM.Utils.ConstantUsers;

import java.io.File;

public class LapakUsersAPI {

    public static String TOKEN = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NzUsInJvbGUiOiJ1c2VyIiwiZXhwIjoxNjgwNjg5OTA3fQ.j9w14fiGhX1T4YSywmSqlNc4_vRS_gMyVW1Ahi5H4PI";

    public static String REGISTER_USERS = ConstantUsers.BASE_URL+ "/auth/register";

    public static String LOGIN_USERS = ConstantUsers.BASE_URL+ "/auth/login";

    public static String GET_USERS = ConstantUsers.BASE_URL+ "/users";

    public static String UPDATE_USERS = ConstantUsers.BASE_URL+ "/users";

    @Step("Register user")
    public void setRegisterUsers(File json) {
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Login user")
    public void loginUser(File json) {
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Get users")
    public void setGetUsers(){
        SerenityRest.given().header("Authorization",TOKEN);
    }

    @Step("Post update data")
    public void setPostUpdateUsers(File json){
        SerenityRest.given().header("Authorization",TOKEN).contentType(ContentType.JSON).body(json);
    }

}
