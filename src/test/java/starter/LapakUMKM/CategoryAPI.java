package starter.LapakUMKM;


import com.github.javafaker.Faker;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.Utils.Constant;

public class CategoryAPI {


    public static  String TOKEN = "Bearer 7bf93ec8d77c033e571a1dbcb59e5985a4297bcbb530efb8698d25b22919d782";
    public static  String GET_LIST_CATEGORIES = Constant.BASE_URL+"/categories";

    //ALIA
    @Step("Get list categories")
    public void getListCategories() {
        SerenityRest.given().header("Authorization", TOKEN);
    }

//    @Step("Get single user")
//    public void setGetSingleUser(int id){
//        SerenityRest.given().pathParam("id", id);
//    }
//
//    @Step("Get list users")
//    public void getListUsers(String users) {
//        SerenityRest.given()
//                .pathParam("users", users);
//    }
//
//    @Step("Get list users page")
//    public void setGetListUsersPage(int id){
//        SerenityRest.given()
//                .pathParam("id",id);
//    }
//    @Step("Get list todos")
//    public void getListTodos(String todos){
//        SerenityRest.given().pathParam("todos", todos);
//    }



}