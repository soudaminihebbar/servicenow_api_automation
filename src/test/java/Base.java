import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

public class Base {
    public static String sysId;

    @BeforeTest
    public void init() {
        RestAssured.baseURI = "https://dev91173.service-now.com/api/now/table/incident";
        RestAssured.authentication = RestAssured.basic("admin", "InstancePswd1");
    }
}
