package tests.api;

import baseEntities.BaseApiTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.apache.http.protocol.HTTP;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class apiTestRailTests extends BaseApiTest {

    @Test
    public void test() {
        String baseUrl = "https://aqa0702.testrail.io/";
        String endpoint = "index.php?/api/v2/get_projects";

        RestAssured.baseURI = baseUrl;

        //Setup Request Object
        RequestSpecification requestSpecification = given();
        requestSpecification.header(HTTP.CONTENT_TYPE, ContentType.JSON);
        requestSpecification.auth().preemptive().basic("atrostyanko+072@gmail.com", "w3n1bU7F4rxOfnfvrBJL");

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

        String endpoint = "index.php?/api/v2/get_projects";
        given()
                .auth().preemptive().basic("atrostyanko+072@gmail.com", "w3n1bU7F4rxOfnfvrBJL")
                .header(HTTP.CONTENT_TYPE, ContentType.JSON)
                .when()
                    .get(endpoint)
                .then()
                    .statusCode(HttpStatus.SC_OK)
                .log().body();
    }
}
