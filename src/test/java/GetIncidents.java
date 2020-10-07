import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.hasItem;

public class GetIncidents extends Base{

    @Test
    public void getIncidents() {

//        Response response = RestAssured
//                .get();
//        int statusCode = response.getStatusCode();
//        assertThat(statusCode, equalTo(200));
//        List<String> id = response.jsonPath().get("result.sys_id");
//        assertThat(id, hasItem(sysId));


        RestAssured
                .get()
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .path("result.sys_id", String.valueOf(hasItem(sysId)));
    }
}
