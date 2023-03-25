package starter.LapakUMKM;
import com.github.javafaker.Faker;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.checkerframework.checker.units.qual.C;
import starter.LapakUMKM.Utils.ConstantDiscussion;


public class DiscussionAPI {

    //POST
    public static String POST_CREATE_DISCUSSION = ConstantDiscussion.BASE_URL + "discussion";


    //GET
    public static String GET_DISCUSSION = ConstantDiscussion.BASE_URL + "discussion/{id}";


    //PUT
    public static String PUT_UPDATE_DISCUSSION = ConstantDiscussion.BASE_URL + "discussion/{id}";



    //DELETE
    public static String DELETE_DISCUSSION = ConstantDiscussion.BASE_URL + "discussion/{id}";



}