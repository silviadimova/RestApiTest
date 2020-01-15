package com.restapi.robots;

import com.restapi.models.UserPostPayload;
import com.restapi.utils.ResponseFields;
import com.restapi.utils.StatusCode;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import java.util.List;
import java.util.Random;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertFalse;

public class UserPostsRobot {

    private String userId;
    private JsonPath responseStructure;

    public UserPostsRobot(String baseUrl) {
        RestAssured.baseURI = baseUrl;
    }

    public void clearResponseStructure() {
        responseStructure = null;
        System.out.println("Robot clears the test response structure\n");
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setRandomUserId(int min, int max) {
        Random rand = new Random();
        userId = Integer.toString(rand.nextInt((max - min) + 1) + min);
    }

    public void getUserProfile() {
        responseStructure = given()
                .when()
                .get("users?id=" + userId)
                .then()
                .assertThat()
                .statusCode(StatusCode.SUCCESS)
                .extract()
                .body()
                .jsonPath();
    }

    public void getUserPosts() {
        responseStructure = given()
                .when()
                .get("posts?usersId=" + userId)
                .then()
                .assertThat()
                .statusCode(StatusCode.SUCCESS)
                .extract()
                .body()
                .jsonPath();
    }

    public void canTheUserSeesHisEmail() {
        String email = responseStructure.getString(ResponseFields.EMAIL);
        assertFalse(email.isEmpty());
        System.out.println("User id = " + userId + ",email = " + email + "\n");
    }

    public void doesTheUserHaveValidPosts() {
        List<UserPostPayload> posts = responseStructure.get("findAll{ it.userId == "+ userId +" && it.id >= 1 && it.id <= 100 }");
        assertFalse(posts.isEmpty());
        System.out.println("User id = " + userId + ", posts size = " + posts.size() + "\n");
    }
}
