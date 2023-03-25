package starter.LapakUMKM.Utils;

public class Constant {
    public static final String BASE_URL = "https://gorest.co.in/public/v2";
    public static final String DIR = System.getProperty("user.dir");

    //JSON REQ BODY
    public static final String JSON_REQ_BODY_POST= DIR+"/src/test/resources/JSON/ReqBody/FeatureFeedback/PostFeedbackReqBody";
    public static final String JSON_REQ_BODY_PUT = DIR+"/src/test/resources/JSON/ReqBody/FeatureFeedback/PutFeedbackReqBody";


    //JSON SCHEMA
    public static final String JSON_SCHEMA_POST= DIR+"/src/test/resources/JSON/JsonSchema/FeatureFeedback/PostJsonSchemaFeedback";
    public static final String JSON_SCHEMA_GET = DIR+"/src/test/resources/JSON/JsonSchema/FeatureFeedback/GetJsonSchemaFeedback";
    public static final String JSON_SCHEMA_PUT = DIR+"/src/test/resources/JSON/JsonSchema/FeatureFeedback/PutJsonSchemaFeedback";
    public static final String JSON_SCHEMA_DELETE = DIR+"/src/test/resources/JSON/JsonSchema/FeatureFeedback/DeleteJsonSchemaFeedback";

}