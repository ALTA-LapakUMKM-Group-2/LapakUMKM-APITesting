package starter.LapakUMKM.Utils;

public class ConstantUsers {
    public static final String BASE_URL = "https://lapakumkm.mindd.site";

    public static final String DIR = System.getProperty("user.dir");

    // JSON REQ BODY

    public static final String JSON_REQ_BODY_REGISTER = DIR +"/src/test/resources/JSON/ReqBody/1.RegisterUsers";

    public static final String JSON_REQ_BODY_LOGIN =DIR + "/src/test/resources/JSON/ReqBody/2.LoginUsers";

    public static final String JSON_REQ_BODY_UPDATE =DIR + "/src/test/resources/JSON/ReqBody/3.UpdateUsers";

    // JSON SCHEMA

    public static final String JSON_SCHEMA_REGISTER = DIR + "/src/test/resources/JSON/JsonSchema/RegisterUsers";

    public static final String JSON_SCHEMA_LOGIN = DIR + "/src/test/resources/JSON/JsonSchema/LoginUsers";

    public static final String JSON_SCHEMA_GET = DIR + "/src/test/resources/JSON/JsonSchema/GetUsers";

    public static final String JSON_SCHEMA_UPDATE = DIR + "/src/test/resources/JSON/JsonSchema/UpdateUsers";

    public static final String JSON_SCHEMA_DELETE= DIR + "/src/test/resources/JSON/JsonSchema/DeleteUsers";
}
