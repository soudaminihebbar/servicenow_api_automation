import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.hasItem;

public class GetIncidents {

    @Test
    public void getIncidents() {

        String sysId = "1c741bd70b2322007518478d83673af";

        RestAssured.baseURI = "https://dev91173.service-now.com/api/now/table/incident";
        RestAssured.authentication = RestAssured.basic("admin", "InstancePswd1");

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
