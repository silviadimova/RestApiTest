package com.restapi.robots;

import com.restapi.utils.ResponseFields;
import com.restapi.utils.StatusCode;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.Random;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertFalse;

public class UserPostsRobot {

    public UserPostsRobot(String baseUrl) {
        RestAssured.baseURI = baseUrl;
    }

    public void canTheUserSeesHisEmail(String userId) {
        final Response response = given()
                .when()
                .get("users?id="+userId)
                .then()
                .assertThat()
                .statusCode(StatusCode.SUCCESS)
                .extract()
                .response();

        JsonPath jsonPath = new JsonPath(response.asString());
        String email = jsonPath.getString(ResponseFields.EMAIL);
        assertFalse(email.isEmpty());
        System.out.println("User id = " + userId + ",email = " + email);
    }

    public String createRandomUserId(int min, int max) {
        Random rand = new Random();
        return Integer.toString(rand.nextInt((max - min) + 1) + min);
    }
}
