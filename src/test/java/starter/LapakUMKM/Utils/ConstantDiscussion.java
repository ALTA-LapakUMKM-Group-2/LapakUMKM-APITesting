package starter.LapakUMKM.Utils;

public class ConstantDiscussion {
    public static final String BASE_URL = "https://lapakumkm.mindd.site";
    public static final String DIR = System.getProperty("user.dir");

    // JSON REQUEST BODY
    public static final String JSON_REQ_BODY_PUT = DIR+"/src/test/resources/JSON/ReqBody/FeatureDiscussion/PUTReqBody";
    public static final String JSON_REQ_BODY_POST= DIR+"/src/test/resources/JSON/ReqBody/FeatureDiscussion/POSTReqBody";


    // JSON SCHEMA
    public static final String JSON_SCHEMA_GET = DIR+"/src/test/resources/JSON/JsonSchema/FeatureDiscussion/GETJsonSchema";
    public static final String JSON_SCHEMA_POST = DIR+"/src/test/resources/JSON/JsonSchema/FeatureDiscussion/POSTJsonSchema";
    public static final String JSON_SCHEMA_PUT = DIR+"/src/test/resources/JSON/JsonSchema/FeatureDiscussion/PUTJsonSchema";
    public static final String JSON_SCHEMA_DELETE = DIR+"/src/test/resources/JSON/JsonSchema/FeatureDiscussion/DELETEJsonSchema";
    public static final String JSON_SCHEMA_GET_DATA_PRODUCT = DIR+"/src/test/resources/JSON/JsonSchema/FeatureDiscussion/GETDataFormProductJsonSchema";

}