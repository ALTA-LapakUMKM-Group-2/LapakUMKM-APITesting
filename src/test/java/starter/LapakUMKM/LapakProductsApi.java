package starter.LapakUMKM;


import com.github.javafaker.Faker;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.LapakUMKM.Utils.Constant;

public class LapakProductsApi {
    Faker faker = new Faker();
    String FIRSTNAME = faker.name().firstName();
    public static  String TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6Miwicm9sZSI6InVzZXIiLCJleHAiOjE2ODAxNDgxNjN9.m3adJyHrWwe-lKbbTp4a1le1cOcZtQjHj4kg04ryHZI";
    public static String GET_LIST_PRODUCTS = Constant.BASE_URL + "/{products}";
    public static String GET_LIST_PRODUCTS_ID = Constant.BASE_URL + "/products/{id}";
    public static String GET_LIST_PRODUCTS_IMAGE = Constant.BASE_URL + "/products/{id}/images";
    public static String GET_SINGLE_USER = Constant.BASE_URL + "/users/{id}";
    public static String POST_CREATE_USER = Constant.BASE_URL + "/{post}/";
    public static String USERS  = Constant.BASE_URL + "/users/";


    @Step("Get list product")
    public void setGetListProducts(String products) {
        SerenityRest.given()
                .pathParam("products", products);
    }

    @Step("Get list product by id")
    public void setGetListProductsId(int id) {
        SerenityRest.given()
                .pathParam("id", id);
    }

    @Step("Get list product image")
    public void setGetListProductsImage(int id) {
        SerenityRest.given()
                .header("Authorization","Bearer "+TOKEN)
                .pathParam("id", id);
    }

 // lamaaa
    @Step("Token Authorization")
    public void setTOKEN (){
        SerenityRest.given()
                .header("Authorization","Bearer"+TOKEN);}
    @Step("Post Create New User no gender")
    public void setPostCreateUserNoGender(String post) {
        SerenityRest.given().header("Authorization","Bearer "+TOKEN)
                .pathParam("post", post)
                .contentType("multipart/form-data")
                .multiPart("name", "ALTA GOREST")
                .multiPart("email", FIRSTNAME+"@gmail.com")
                .multiPart("gender", "")
                .multiPart("status", "active");
    }
    @Step("Post Create New User no auth")
    public void setPostCreateUserNoAuth(String post) {
        SerenityRest.given()
                .pathParam("post", post)
                .contentType("multipart/form-data")
                .multiPart("name", "ALTA GOREST")
                .multiPart("email", FIRSTNAME+"@gmail.com")
                .multiPart("gender", "male")
                .multiPart("status", "active");
    }
    @Step("Post Create New User no email")
    public void setPostCreateUserNoEmail(String post) {
        SerenityRest.given().header("Authorization","Bearer "+TOKEN)
                .pathParam("post", post)
                .contentType("multipart/form-data")
                .multiPart("name", "hola")
                .multiPart("email", "")
                .multiPart("gender", "male")
                .multiPart("status", "active");
    }
    @Step("Post Create New User no status")
    public void setPostCreateUserNostatus(String post) {
        SerenityRest.given().header("Authorization","Bearer "+TOKEN)
                .pathParam("post", post)
                .contentType("multipart/form-data")
                .multiPart("name", "hore")
                .multiPart("email", FIRSTNAME+"@gmail.com")
                .multiPart("gender", "male")
                .multiPart("status", "");
    }
    @Step("Post Create New User no name")
    public void setPostCreateUserNoName(String post) {
        SerenityRest.given().header("Authorization","Bearer "+TOKEN)
                .pathParam("post", post)
                .contentType("multipart/form-data")
                .multiPart("name", "")
                .multiPart("email", FIRSTNAME+"@gmail.com")
                .multiPart("gender", "male")
                .multiPart("status", "active");
    }
    @Step("Post Create New User")
    public void setPostCreateUser(String post) {
        SerenityRest.given().header("Authorization","Bearer "+TOKEN)
                .pathParam("post", post)
                .contentType("multipart/form-data")
                .multiPart("name", "ALTA GOREST")
                .multiPart("email", FIRSTNAME+"@gmail.com")
                .multiPart("gender", "male")
                .multiPart("status", "active");
    }

    @Step("Get single user")
    public void setGetSingleUser(int id){
        SerenityRest.given().pathParam("id", id);
    }

    @Step("Get list users")
    public void getListUsers(String users) {
        SerenityRest.given()
                .pathParam("users", users);
    }

    @Step("Get list users page")
    public void setGetListUsersPage(int id){
        SerenityRest.given()
                .pathParam("id",id);
    }
    @Step("Get list todos")
    public void getListTodos(String todos){
        SerenityRest.given().pathParam("todos", todos);
    }


}