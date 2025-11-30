import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetUsersTest {
    @Test
    public void getUsersList() {
        baseURI = "https://reqres.in";

        given()
//                .relaxedHTTPSValidation()
//                .header("User-Agent", "Mozilla/5.0")
                //.header("Accept", "application/json")
                .when()
                .get("/api/users?page=2")
                .then()
                .statusCode(200)
                .log()
                .all();
    }

}
