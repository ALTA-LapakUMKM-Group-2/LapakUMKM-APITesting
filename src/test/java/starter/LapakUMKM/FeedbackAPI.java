package starter.LapakUMKM;


import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.LapakUMKM.Utils.ConstantFeedback;

import java.io.File;

public class FeedbackAPI {

    public static String TOKEN = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6Miwicm9sZSI6InVzZXIiLCJleHAiOjE2ODA0NTE5ODB9.-JcItFOA3992Qeq_zH3djv7MRbngPsZfuCyWUrfYFwY";

    // POST
    public static String POST_CREATE_FEEDBACK = ConstantFeedback.BASE_URL + "/feedbacks";
    @Step("Post create data feedback")
    public void setPostCreateFeedback(File json){
        SerenityRest.given().header("Authorization", TOKEN).contentType(ContentType.JSON).body(json);
    }



    // GET
    public static String GET_LIST_FEEDBACK = ConstantFeedback.BASE_URL + "/feedbacks";
    @Step("Get list data feedback")
    public void setGetListFeedback(){
        SerenityRest.given().header("Authorization", TOKEN);
    }

    public static String GET_ID_FEEDBACK = ConstantFeedback.BASE_URL + "/feedbacks/{id}";
    @Step("Get by id")
    public void setGetIdFeedback(int id){
        SerenityRest.given().header("Authorization",TOKEN).pathParam("id", id);
    }

    public static String GET_INVALID_ID_FEEDBACK = ConstantFeedback.BASE_URL + "/feedbacks/{id}";
    @Step("Get invalid id")
    public void setGetInvalidIdFeedback(String id){
        SerenityRest.given().header("Authorization",TOKEN).pathParam("id", id);
    }


    public static String GET_PRODUCT_FEEDBACK = ConstantFeedback.BASE_URL + "/products/{id}/feedbacks";
    @Step("Get id by product")
    public void setGetProductFeedback(int id){
        SerenityRest.given().header("Authorization", TOKEN).pathParam("id", id);
    }

    public static String GET_INVALID_PRODUCT_FEEDBACK = ConstantFeedback.BASE_URL + "/products/{id}/feedbacks";
    @Step("Get invalid id by product")
    public void setGetInvalidProductFeedback(String id){
        SerenityRest.given().header("Authorization", TOKEN).pathParam("id", id);

    }


    // PUT
    public static String PUT_UPDATE_FEEDBACK = ConstantFeedback.BASE_URL + "/feedbacks/{id}";
    @Step("Update data feedback")
    public void setPutUpdateFeedback(int id, File json){
        SerenityRest.given().header("Authorization",TOKEN).pathParam("id", id).contentType(ContentType.JSON).body(json);
    }


    // DELETE
    public  static String DELETE_ID_FEEDBACK = ConstantFeedback.BASE_URL + "/feedbacks/{id}";
    @Step("Delete id feedback")
    public void setDeleteIdFeedback(int id){
        SerenityRest.given().header("Authorization",TOKEN).pathParam("id", id);
    }

    public  static String DELETE_INVALID_ID_FEEDBACK = ConstantFeedback.BASE_URL + "/feedbacks/{id}";
    @Step("Delete invalid id feedback")
    public void setDeleteInvalidIdFeedback(String id){
        SerenityRest.given().header("Authorization",TOKEN).pathParam("id", id);
    }

}