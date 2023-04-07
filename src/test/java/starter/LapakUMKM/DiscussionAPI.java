package starter.LapakUMKM;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.LapakUMKM.Utils.ConstantDiscussion;

import java.io.File;


public class DiscussionAPI {
    public static String TOKEN = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTQ1LCJyb2xlIjoidXNlciIsImV4cCI6MTY4MTA1MjUzMX0.P3MIosc2ebLHgxqB9Q1dFqfm0GB1KuGrigjJfp4ApEo";


    //POST
    public static String POST_CREATE_DISCUSSION = ConstantDiscussion.BASE_URL + "/discussions";
    @Step("Post create new discussion")
    public void setPostCreateDiscussion(File json){
        SerenityRest.given().header("Authorization",TOKEN).contentType(ContentType.JSON).body(json);
    }


    //GET LIST DATA
    public static String GET_LIST_DATA = ConstantDiscussion.BASE_URL + "/discussions";
    @Step("Get list data")
    public void setGetListData(){
        SerenityRest.given().header("Authorization",TOKEN);
    }


    //GET BY ID
    public static String GET_DISCUSSION = ConstantDiscussion.BASE_URL + "/discussions/{id}";
    @Step("Get user by id")
    public void setGetDiscussion(int id){
        SerenityRest.given().header("Authorization",TOKEN).pathParam("id",id);
    }

    public static String GET_INVALID_DISCUSSION = ConstantDiscussion.BASE_URL + "/discussions/{id}";
    @Step("Get user invalid id")
    public void setGetInvalidDiscussion(String id){
        SerenityRest.given().header("Authorization",TOKEN).pathParam("id", id);
    }


    //GET DATA FORM PRODUCT
    public static String GET_DATA_FROM_PRODUCT = ConstantDiscussion.BASE_URL + "/products/{id}/discussions";
    @Step("Get data form product")
    public void setGetDataFromProduct(int id){
        SerenityRest.given().header("Authorization",TOKEN).pathParam("id",id);
    }

    public static String GET_DATA_INVALID_FROM_PRODUCT = ConstantDiscussion.BASE_URL + "/products/{id}/discussions";
    @Step("Get invalid data form product")
    public void setGetDataInvalidFromProduct(String id){
        SerenityRest.given().header("Authorization",TOKEN).pathParam("id",id);
    }

    public static String GET_WITHOUTID_DATA_FROM_PRODUCT = ConstantDiscussion.BASE_URL + "/products//discussions";
    @Step("Get without id from product")
    public void setGetWithoutidDataFromProduct(){
        SerenityRest.given().header("Authorization",TOKEN);

    }


    //PUT
    public static String PUT_UPDATE_DISCUSSION = ConstantDiscussion.BASE_URL + "/discussions/{id}";
    @Step("Put update data")
    public void setPutUpdateDiscussion(int id, File json){
        SerenityRest.given().header("Authorization",TOKEN).pathParam("id",id).contentType(ContentType.JSON).body(json);
    }



    //DELETE
    public static String DELETE_DISCUSSION = ConstantDiscussion.BASE_URL + "/discussions/{id}";
    @Step("Delete id user")
    public void setDeleteDiscussion(int id){
        SerenityRest.given().header("Authorization",TOKEN).pathParam("id", id);
    }

    public static String DELETE_INVALID_DISCUSSION = ConstantDiscussion.BASE_URL + "/discussions/{id}";
    @Step("Delete id invalid user")
    public void setDeleteInvalidDiscussion(String id){
        SerenityRest.given().header("Authorization", TOKEN).pathParam("id", id);
    }



}