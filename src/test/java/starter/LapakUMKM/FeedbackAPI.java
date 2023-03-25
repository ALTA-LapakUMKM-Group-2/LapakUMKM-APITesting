package starter.LapakUMKM;


import com.github.javafaker.Faker;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.omg.CORBA.PUBLIC_MEMBER;
import starter.LapakUMKM.Utils.Constant;

public class FeedbackAPI {

    // POST
    public static String POST_CREATE_FEEDBACK = Constant.BASE_URL + "/feedback";



    // GET
    public static String GET_ID_FEEDBACK = Constant.BASE_URL + "feedback";



    // PUT
    public static String PUT_UPDATE_FEEDBACK = Constant.BASE_URL + "feedback/1";



    // DELETE
    public  static String DELETE_ID_FEEDBACK = Constant.BASE_URL + "feedback/1";



}