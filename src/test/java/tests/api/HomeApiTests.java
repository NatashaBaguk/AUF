package tests.api;

import baseEntities.BaseApiTest;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class HomeApiTests extends BaseApiTest  {

    @Test
    public void userApiTest (){
        given()
                .when()
                .get("/index.php?/api/v2/get_user/1")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .log().body();
    }

    @Test
    public void usersApiTest (){
        given()
                .when()
                .get("index.php?/api/v2/get_users")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .log().body();
    }

    @Test
    public void getProjectApiTest (){
        given()
                .when()
                .get("index.php?/api/v2/get_project/19")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .log().body();
    }
}
