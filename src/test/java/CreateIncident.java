import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ExtractableResponse;
import org.testng.annotations.Test;

public class CreateIncident extends Base{

    @Test
    public void createIncident() {

        ExtractableResponse response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body("{\"short_description\":\"defect2\"}")
                .post()
                .then()
                .assertThat()
                .statusCode(201)
                .extract();

        sysId = response.jsonPath().get("result.sys_id");
    }
}
