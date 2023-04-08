package starter.LapakUMKM;


import com.github.javafaker.Faker;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.LapakUMKM.Utils.Constant;

import java.io.File;

public class CategoryAPI {


    public static  String TOKEN = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTYwLCJyb2xlIjoidXNlciIsImV4cCI6MTY4MTExMjAxNn0.f79cSmg7tFJdoA7MkMOdPS_r-qdt5U7xPHy4Ubff-wM";
    public static  String GET_LIST_CATEGORIES = Constant.BASE_URL+"/categories";
    public static  String GET_SINGLE_CATEGORY = Constant.BASE_URL+"/categories/{id}";
    public static  String POST_CREATE_CATEGORY = Constant.BASE_URL+"/categories";
    public static  String PUT_UPDATE_CATEGORY = Constant.BASE_URL+"/categories/{id}";
    public static  String DELETE_SINGLE_CATEGORY = Constant.BASE_URL+"/categories/{id}";

    //ALIA
    @Step("Get list categories")
    public void getListCategories() {
        SerenityRest.given().header("Authorization", TOKEN);
    }

   @Step("Get single data categories with valid id")
    public void setGetSingleDataCategoriesWithValidId(int id){
        SerenityRest.given().pathParam("id", id);
    }

    @Step("Get single data categories with invalid id")
    public void setGetSingleDataCategoriesWithInvalidId(int id){
        SerenityRest.given().pathParam("id", id);
    }

    @Step("Post create new data with request body categories")
    public void setGetPostCreateNewDataWithRequestBodyCategories(File json) {
        SerenityRest.given().header("Authorization",TOKEN).contentType(ContentType.JSON).body(json);
    }
    @Step("Post create new categories empty value")
    public void setGetPostCreateNewCategoriesEmptyValue(File json) {
        SerenityRest.given().header("Authorization", TOKEN).contentType(ContentType.JSON).body(json);
    }
    @Step("Post create new categories long value")
    public void setGetPostCreateNewCategoriesLongValue(File json) {
        SerenityRest.given().header("Authorization", TOKEN).contentType(ContentType.JSON).body(json);
    }
    @Step("Put update category with valid id")
    public void setPutUpdateCategoryWithValidId(int id, File json) {
        SerenityRest.given().header("Authorization", TOKEN).pathParam("id", id).contentType(ContentType.JSON).body(json);
    }
    @Step("Put update category with invalid id")
    public void setPutUpdateCategoryWithInvalidId(int id, File json) {
        SerenityRest.given().header("Authorization", TOKEN).pathParam("id", id).contentType(ContentType.JSON).body(json);
    }
    @Step("Put update category with valid id and empty value")
    public void setPutUpdateCategoryWithValidIdInputEmptyValue(int id, File json) {
        SerenityRest.given().header("Authorization", TOKEN).pathParam("id", id).contentType(ContentType.JSON).body(json);
    }
    @Step("Delete category with valid id")
    public void setDeleteCategoryWithValidId(int id){
        SerenityRest.given().header("Authorization",TOKEN).pathParam("id", id);
    }
    @Step("Delete category with invalid id")
    public void setDeleteCategoryWithInvalidId(int id){
        SerenityRest.given().header("Authorization",TOKEN).pathParam("id", id);
    }
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