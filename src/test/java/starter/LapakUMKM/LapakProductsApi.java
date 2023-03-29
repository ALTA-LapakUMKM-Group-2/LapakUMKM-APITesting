package starter.LapakUMKM;


import com.github.javafaker.Faker;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.LapakUMKM.Utils.Constant;

import java.io.File;

public class LapakProductsApi {
    Faker faker = new Faker();
    String FIRSTNAME = faker.name().firstName();
    public static  String TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6Miwicm9sZSI6InVzZXIiLCJleHAiOjE2ODAxNDgxNjN9.m3adJyHrWwe-lKbbTp4a1le1cOcZtQjHj4kg04ryHZI";
    public static String GET_LIST_PRODUCTS = Constant.BASE_URL + "/{products}";
    public static String GET_LIST_PRODUCTS_ID = Constant.BASE_URL + "/products/{id}";
    public static String GET_LIST_PRODUCTS_IMAGE = Constant.BASE_URL + "/products/{id}/images";
    public static String POST_CREATE_PRODUCTS = Constant.BASE_URL + "/{products}";
    public static String POST_ADD_IMAGE = Constant.BASE_URL + "/products/{id}/upload-photo";
    public static String DELETE_PRODUCTS_GET = Constant.BASE_URL + "/products?user_id=2";
    public static String GET_BYUSER = Constant.BASE_URL + "/products?user_id={id}";
    public static String GET_BY_CATEGORY = Constant.BASE_URL + "/products?category_id={id}";
    public static String DELETE_PRODUCTS = Constant.BASE_URL + "/products/{id}";
    public static String DELETE_PRODUCTS_IMAGE = Constant.BASE_URL + "/products/{id1}/delete-photo/{id2}";

    @Step("Get product by category")
    public void setGetProductByCategory(int id) {
        SerenityRest.given()
                .pathParam("id", id);

    }

    @Step("Get product by user")
    public void setGetProductByUser(int id) {
        SerenityRest.given()
                .pathParam("id", id);

    }

    @Step("Delete product image without auth token")
    public void setDeleteProductsImageWithoutToken(int id , int id2) {
        SerenityRest.given()
                .pathParam("id1", id)
                .pathParam("id2",id2);
    }

    @Step("Delete product image invalid parameter")
    public void setDeleteProductsImageInvalidParameter(int id , int id2) {
        SerenityRest.given()
                .header("Authorization","Bearer "+TOKEN)
                .pathParam("id1", id)
                .pathParam("id2",id2);
    }
    @Step("Delete product image")
    public void setDeleteProductsImage(int id , int id2) {
        SerenityRest.given()
                .header("Authorization","Bearer "+TOKEN)
                .pathParam("id1", id)
                .pathParam("id2",id2);
    }
    @Step("Delete product without auth")
    public void setDeleteProductsWithoutAuth(int id) {
        SerenityRest.given()
                .pathParam("id", id);
    }

    @Step("Delete product")
    public void setDeleteProducts(int id) {
        SerenityRest.given()
                .header("Authorization","Bearer "+TOKEN)
                .pathParam("id", id);
    }

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

    @Step("PUT update product")
    public void setPutUpdateDataProducts(int id) {
        SerenityRest.given()
                .header("Authorization","Bearer "+TOKEN)
                .pathParam("id", id)
                .contentType("multipart/form-data")
                .multiPart("category_id", "2")
                .multiPart("product_name", "Sepatu Sneaker")
                .multiPart("description", "hayang wee gratis")
                .multiPart("price", "120000")
                .multiPart("stock_remaining", "100")
                .multiPart("size", "42");
    }

    @Step("PUT update product without req json")
    public void setPutUpdateDataProductsWithoutReqJson(int id) {
        SerenityRest.given()
                .header("Authorization","Bearer "+TOKEN)
                .pathParam("id", id);

    }

    @Step("PUT update product invalid parameter")
    public void setPutUpdateDataProductsInvalidParameter(int id) {
        SerenityRest.given()
                .header("Authorization","Bearer "+TOKEN)
                .pathParam("id", id);
    }

    @Step("PUT update product invalid json req")
    public void setPutUpdateDataProductsInvalidJsonReq(int id) {
        SerenityRest.given()
                .header("Authorization","Bearer "+TOKEN)
                .pathParam("id", id)
                .contentType("multipart/form-data")
                .multiPart("category_id", "2")
                .multiPart("product_name", "")
                .multiPart("description", "")
                .multiPart("price", "120000")
                .multiPart("stock_remaining", "100")
                .multiPart("size", "42");
    }

    @Step("PUT update product without token")
    public void setPutUpdateDataProductsWithoutToken(int id) {
        SerenityRest.given()
                .pathParam("id", id);
    }

    @Step("Get list product image")
    public void setGetListProductsImage(int id) {
        SerenityRest.given()
                .header("Authorization","Bearer "+TOKEN)
                .pathParam("id", id);
    }

    @Step("POST create products invalid parameter")
    public void setPostCreateProductsInvalidParameter(String products) {
        SerenityRest.given()
                .header("Authorization","Bearer "+TOKEN)
                .pathParam("products", products);
        }

        @Step("POST create products")
    public void setPostCreateProducts(String products,File image) {
        SerenityRest.given()
                .header("Authorization","Bearer "+TOKEN)
                .pathParam("products", products)
                .contentType("multipart/form-data")
                .multiPart("category_id", "2")
                .multiPart("product_name", "Sepatu Sneaker")
                .multiPart("description", "Sepatu Original Neo Advantage/ Neo original/ Advantage Original\n" +
                        "ORIGINAL\n" +
                        "MADE IN INDONESIA\n" +
                        "Size\n" +
                        "36 :\n" +
                        "37 1/3 : 23cm\n" +
                        "38 : 23.5cm\n" +
                        "39 1/3 : 24.5cm\n" +
                        "40 : 25cm\n" +
                        "41 1/3 : 26cm\n" +
                        "42 : 26.5cm\n" +
                        "43 1/3 : 27.5cm\n" +
                        "44 : 28cm\n" +
                        "\n" +
                        "ukuran size lebih kecil disarankan untuk menaikan 1size\n" +
                        "\n" +
                        "untuk size lain bisa ditanyakan brodi\n" +
                        "SEBELUM ORDER HARAP PAHAMI PENJELASAN DIBAWAH INI\n" +
                        "*Barang yang kita jual baru / bukan baran second\n" +
                        "*Barang yang kita jual langsung dari pabrik/tangan pertama dan belum ada quality control secara detail wajar kalo kita jual dibawah harga pasaran (barang yg udah lolos qc biasanya dijual diatas 1jutaan distore) *ikutin sesuai budget :)\n" +
                        "*Kita TANGGUNG JAWAB atas barang kalian, jika \n" +
                        "RAMADHAN SALE\n" +
                        "PENGIRIMAN MENJELANG LEBARAN MAX ORDER TGL 30 APRIL 2022\n" +
                        "\n" +
                        "nanti kamu salah pilih size atau kita salah kirim barang kita bersedia untuk retur barang, kita kasih garansi retur buat kamu :)\n" +
                        "*kamu beli berarti kita menjalin hubungan baru, dan pasti nya saling membutuhkan. kamu butuh barang dari kita, kita pun butuh penilaian terbaik dari kamu hehe \n" +
                        "*OPEN DROPSHIP/GROSIR/RESELLER\n" +
                        "HAPPY SHOPPING :)")
                .multiPart("price", "120000")
                .multiPart("stock_remaining", "100")
                .multiPart("size", "42")
                .multiPart("photo_product", image);
    }

    @Step("post create products without auth token")
    public void setPostCreateProductsWithoutAuth(String products) {
        SerenityRest.given()
                .pathParam("products", products)
                .contentType("multipart/form-data")
                .multiPart("category_id", "2")
                .multiPart("product_name", "Sepatu Sneaker")
                .multiPart("description", "no")
                .multiPart("price", "120000")
                .multiPart("stock_remaining", "100")
                .multiPart("size", "42");
    }

    @Step("post create products without ReqBody")
    public void setPostCreateProductsWithoutReqBody(String products) {
        SerenityRest.given()
                .header("Authorization","Bearer "+TOKEN)
                .pathParam("products", products);

    }

    @Step("post create products without String ReqBody")
    public void setPostCreateProductsWithoutStringReqbody(String products) {
        SerenityRest.given()
                .header("Authorization","Bearer "+TOKEN)
                .pathParam("products", products)
                .contentType("multipart/form-data")
                .multiPart("category_id", "2")
                .multiPart("product_name", "")
                .multiPart("description", "")
                .multiPart("price", "120000")
                .multiPart("stock_remaining", "100")
                .multiPart("size", "42");
    }

    @Step("post add iamge")
    public void setPostAddImage(File image, int id) {
        SerenityRest.given()
                .header("Authorization","Bearer "+TOKEN)
                .pathParam("id", id)
                .contentType("multipart/form-data")
                .multiPart("photo_product", image);
    }

    @Step("post add iamge without auth token")
    public void setPostAddImageWithoutAuthToken(File image, int id) {
        SerenityRest.given()
                .pathParam("id", id)
                .contentType("multipart/form-data")
                .multiPart("photo_product", image);
    }

    @Step("post add iamge with other extension")
    public void setPostAddImageOtherExtension(File image, int id) {
        SerenityRest.given()
                .header("Authorization","Bearer "+TOKEN)
                .pathParam("id", id)
                .contentType("multipart/form-data")
                .multiPart("photo_product", image);
    }

    @Step("post add iamge with large file")
    public void setPostAddImageLargeExtension(File image, int id) {
        SerenityRest.given()
                .header("Authorization","Bearer "+TOKEN)
                .pathParam("id", id)
                .contentType("multipart/form-data")
                .multiPart("photo_product", image);
    }

    @Step("post add iamge without file")
    public void setPostAddImageWithoutFile(int id) {
        SerenityRest.given()
                .header("Authorization","Bearer "+TOKEN)
                .pathParam("id", id);

    }

    @Step("post add iamge invalid parameter")
    public void setPostAddImageInvalidParameter(int id) {
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