package tests.api;

import baseEntities.BaseApiTest;
import com.google.gson.Gson;
import models.UserGson;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

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
    public void useApiTest (){
        given()
                .when()
                .get("index.php?/api/v2/get_users")
                .then()
                .log().body()
                .body("id", hasItems(1, 2, 3))
                .body("name[0]", equalTo("AQA7 Master"))
                .body("email[0]", equalTo("atrostyanko+072@gmail.com"))
                .statusCode(HttpStatus.SC_OK);

    }

//    @Test
//    public void userAsStringTest (){
//
//        UserGson expectedUser = UserGson.builder()
//                .name("AQA07 Master")
//                .id(1)
//                .email("atrostaynko+072@gmail.com")
//                .is_active(true)
//                .role_id(1)
//                .role("Lead")
//                .build();
//
//
//        String jsonResponse =
//        given()
//                .when()
//                .get("index.php?/api/v2/get_user/1").asString();
//
//
//        System.out.println(jsonResponse);
//
//        Gson gson = new Gson();
//        UserGson userGson = gson.fromJson(jsonResponse, UserGson.class);
//
//        System.out.println(userGson.toString());
//        Assert.assertEquals(expectedUser.toString(),userGson.toString());
//        Assert.assertTrue(expectedUser.equals(userGson));
//        Assert.assertEquals(expectedUser, userGson);
//
//    }
}
