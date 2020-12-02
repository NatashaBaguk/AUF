package tests.api;

import baseEntities.BaseApiTest;
import com.google.gson.Gson;
import models.Endpoints;
import models.ProjectGson;
import models.UserGson;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class HomeApiTests extends BaseApiTest {

    private int projectId;

    @Test
    public int addProjectApiTest() {
        ProjectGson projectGson = ProjectGson.builder()
                .name("Sudden show")
                .suite_mode(1)
                .build();

        Gson gson = new Gson();
        String json = gson.toJson(projectGson);

        this.projectId =
                given()
                        .body(json)
                        .when()
                        .post(new Endpoints().addProject)
                        .then()
                        .log().body()
                        .body("name", equalTo("Sudden show"))
                        .body("suite_mode", is(1))
                        .body("show_announcement", is(false))
                        .body("is_completed", is(false))
                        .statusCode(HttpStatus.SC_OK)
                        .extract().jsonPath().get("id");

        return this.projectId;

    }

    @Test
    public void updateProjectApiTest() {
        ProjectGson projectGson = ProjectGson.builder()
                .name("Sudden show update")
                .announcement("Let the fun begin!")
                .build();

        Gson gson = new Gson();
        String json = gson.toJson(projectGson);

        given()
                .pathParam("id", projectId)
                .body(json)
                .when()
                .post(new Endpoints().updateProject)
                .then()
                .log().body()
                .body("name", equalTo("Sudden show update"))
                .body("announcement", equalTo("Let the fun begin!"))
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void deleteProjectApiTest() {
        given()
                .pathParam("id", projectId)
                .when()
                .post(new Endpoints().deleteProject)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK);
    }
}
