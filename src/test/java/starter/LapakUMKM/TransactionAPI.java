package starter.LapakUMKM;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.LapakUMKM.Utils.Constant;

import java.io.File;

public class TransactionAPI {
    public static String TOKEN = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NTMsInJvbGUiOiJ1c2VyIiwiZXhwIjoxNjgwNjcxNzAxfQ.rkBolTf_ZAHco9cRqlIC_q7OyL6TWqMkQF20Ljb1c4w";
    public static String GET_ID_TRANSACTION = Constant.BASE_URL+"/transactions/{id}";
    public static String GET_LIST_TRANSACTION = Constant.BASE_URL+"/transactions";
    public static String POST_CREATE_TRANSACTION = Constant.BASE_URL+"/transactions";

    @Step("Get list transaction")
    public void getListTransaction() {
        SerenityRest.given().header("Authorization", TOKEN);
    }
    @Step("Get by data id")
    public void setGetById(int id){
        SerenityRest.given().header("Authorization", TOKEN).pathParam("id", id);
    }
    @Step("Get by data invalid id")
    public void setGetByWithInvalidId(int id){
        SerenityRest.given().header("Authorization", TOKEN).pathParam("id", id);
    }
    @Step("Get detail transaction by id")
    public void setGetbySingleDataTransactionWithValidId(int id){
        SerenityRest.given().header("Authorization", TOKEN).pathParam("id", id);
    }
    @Step("Get detail transaction by invalid id")
    public void setGetDetailTransactionByInvalidId(int id){
        SerenityRest.given().header("Authorization", TOKEN).pathParam("id", id);
    }

    @Step("Post create new data with request body transaction")
    public void setGetPostCreateNewDataWithRequestBodyTransaction(File json) {
       SerenityRest.given().header("Authorization",TOKEN).contentType(ContentType.JSON).body(json);
    }
//    @Step("Post create new categories empty value")
//    public void setGetPostCreateNewCategoriesEmptyValue(File json) {
//        SerenityRest.given().header("Authorization", TOKEN).contentType(ContentType.JSON).body(json);
//    }
//    @Step("Post create new categories long value")
//    public void setGetPostCreateNewCategoriesLongValue(File json) {
//        SerenityRest.given().header("Authorization", TOKEN).contentType(ContentType.JSON).body(json);
//    }
//    @Step("Put update category with valid id")
//    public void setPutUpdateCategoryWithValidId(int id, File json) {
//        SerenityRest.given().header("Authorization", TOKEN).pathParam("id", id).contentType(ContentType.JSON).body(json);
//    }
//    @Step("Put update category with invalid id")
//    public void setPutUpdateCategoryWithInvalidId(int id, File json) {
//        SerenityRest.given().header("Authorization", TOKEN).pathParam("id", id).contentType(ContentType.JSON).body(json);
//    }
//    @Step("Put update category with valid id and empty value")
//    public void setPutUpdateCategoryWithValidIdInputEmptyValue(int id, File json) {
//        SerenityRest.given().header("Authorization", TOKEN).pathParam("id", id).contentType(ContentType.JSON).body(json);
//    }
//    @Step("Delete category with valid id")
//    public void setDeleteCategoryWithValidId(int id){
//        SerenityRest.given().header("Authorization",TOKEN).pathParam("id", id);
//    }
//    @Step("Delete category with invalid id")
//    public void setDeleteCategoryWithInvalidId(int id){
//        SerenityRest.given().header("Authorization",TOKEN).pathParam("id", id);
//    }
}
