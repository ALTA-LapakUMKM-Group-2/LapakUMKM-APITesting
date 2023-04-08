package starter.LapakUMKM;


import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.LapakUMKM.Utils.ConstantCart;

import java.io.File;

public class CartAPI {


    public static  String TOKEN = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NTMsInJvbGUiOiJzZWxsZXIiLCJleHAiOjE2ODExNDEyOTB9.oi5StCaxvyPZKfgzwU_JfyfQFExkekKhSHuL2fWskdk";
    public static  String GET_LIST_CART = ConstantCart.BASE_URL+"/carts";
    public static  String GET_SINGLE_CART = ConstantCart.BASE_URL+"/carts/{id}";
    public static  String POST_CREATE_CART = ConstantCart.BASE_URL+"/carts";
    public static  String PUT_UPDATE_CART = ConstantCart.BASE_URL+"/carts/{id}";
    public static  String DELETE_SINGLE_CART = ConstantCart.BASE_URL+"/carts/{id}";

    //ALIA
    @Step("Get list data cart")
    public void getListCart() {
        SerenityRest.given().header("Authorization", TOKEN);
    }

    @Step("Get single data cart with valid id")
    public void setGetSingleDataCartWithValidId(int id){
        SerenityRest.given().pathParam("id", id);
   }
   @Step("Post create new Cart")
    public void setGetPostCreateNewCart(File json) {
        SerenityRest.given().header("Authorization",TOKEN).contentType(ContentType.JSON).body(json);
    }
    @Step("Put edit new Cart")
    public void setPutEditNewCart(File json, int id) {
        SerenityRest.given().pathParam("id", id).header("Authorization",TOKEN).contentType(ContentType.JSON).body(json);
    }
    @Step("delete Cart")
    public void setDeleteCart(int id) {
        SerenityRest.given().pathParam("id", id).header("Authorization",TOKEN);
    }
//    @Step("Get single data cart with invalid id")
//    public void setGetSingleDataCartWithInvalidId(int id){
//        SerenityRest.given().pathParam("id", id);
//    }
//
//    @Step("Post create new data with request body cart")
//    public void setGetPostCreateNewDataWithRequestBodyCart(File json) {
//        SerenityRest.given().header("Authorization",TOKEN).contentType(ContentType.JSON).body(json);
//    }
//    @Step("Post create new cart empty value")
//    public void setGetPostCreateNewCartEmptyValue(File json) {
//        SerenityRest.given().header("Authorization", TOKEN).contentType(ContentType.JSON).body(json);
//    }
//    @Step("Post create new cart long value")
//    public void setGetPostCreateNewCartLongValue(File json) {
//        SerenityRest.given().header("Authorization", TOKEN).contentType(ContentType.JSON).body(json);
//    }
//    @Step("Put update cart with valid id")
//    public void setPutUpdateCartWithValidId(int id, File json) {
//        SerenityRest.given().header("Authorization", TOKEN).pathParam("id", id).contentType(ContentType.JSON).body(json);
//    }
//    @Step("Put update cart with invalid id")
//    public void setPutUpdateCartWithInvalidId(int id, File json) {
//        SerenityRest.given().header("Authorization", TOKEN).pathParam("id", id).contentType(ContentType.JSON).body(json);
//    }
//    @Step("Put update cart with valid id and empty value")
//    public void setPutUpdateCartWithValidIdInputEmptyValue(int id, File json) {
//        SerenityRest.given().header("Authorization", TOKEN).pathParam("id", id).contentType(ContentType.JSON).body(json);
//    }
//    @Step("Delete cart with valid id")
//    public void setDeleteCartWithValidId(int id){
//        SerenityRest.given().header("Authorization",TOKEN).pathParam("id", id);
//    }
//    @Step("Delete cart with invalid id")
//    public void setDeleteCartWithInvalidId(int id){
//        SerenityRest.given().header("Authorization",TOKEN).pathParam("id", id);
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