package tests.api;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseLogSpecification;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class apiTests {

    @Test
    public void test() {
        String baseUrl = "https://reqres.in";
        String endpoint = "/api/users/2";

        RestAssured.baseURI = baseUrl;

        //Setup Request Object
        RequestSpecification requestSpecification = given();

        //Setup Response Object
        Response response = requestSpecification.request(Method.GET, endpoint);

        //Get Response Status

        int statusCode = response.statusCode();
        System.out.println("StatusCode: " + statusCode);

        //Get Response body
        String responseBody = response.getBody().asString();
        System.out.println("Body: " + responseBody);

        Assert.assertEquals(statusCode, 200, "Invalid status Code");
    }

    @Test
    public void shortSimpleApiTest() {
        given()
                .when()
                    .get("https://reqres.in")
                .then()
                    .statusCode(HttpStatus.SC_OK)
                .log().body();
    }
}
