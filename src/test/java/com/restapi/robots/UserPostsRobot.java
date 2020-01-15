package com.restapi.robots;

import com.restapi.models.UserPostPayload;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

import java.util.List;
import java.util.Random;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class UserPostsRobot {

    private int userId;
    private JsonPath responseStructure;

    public UserPostsRobot(String baseUrl) {
        RestAssured.baseURI = baseUrl;
    }

    public void clearResponseStructure() {
        responseStructure = null;

        System.out.println("Robot clears the test response structure\n");
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setRandomUserId(int min, int max) {
        Random rand = new Random();
        userId = rand.nextInt((max - min) + 1) + min;
    }

    public void getUserProfile() {
        responseStructure = given()
                .when()
                .get("users?id=" + userId)
                .then()
                .assertThat()
                .statusCode(200)
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
                .statusCode(200)
                .extract()
                .body()
                .jsonPath();
    }

    public void makeNewPost(String title, String text) {
        UserPostPayload payload = new UserPostPayload(userId, title, text);
        responseStructure = given()
                .contentType(ContentType.JSON)
                .when()
                .body(payload.toString())
                .post("posts")
                .then()
                .assertThat()
                .statusCode(201)
                .extract()
                .jsonPath();
    }

    public void canTheUserSeeHisEmail() {
        String email = responseStructure.getString("email");
        assertFalse(email.isEmpty());

        System.out.println("User id = " + userId + ",email = " + email + "\n");
    }

    public void doesTheUserHaveValidPosts() {
        List<Object> posts = responseStructure.get("findAll{ it.userId == "+ userId +" && it.id >= 1 && it.id <= 100 }");
        assertFalse(posts.isEmpty());

        System.out.println("User id = " + userId + ", posts size = " + posts.size() + "\n");
    }

    public void doesTheUserSeeSuccessfulPostResult() {
        int newPostId = responseStructure.getInt("id");
        int newPostUserId = responseStructure.getInt("userId");
        assertTrue(newPostId > 0);
        assertEquals(userId, newPostUserId);

        System.out.println("User id = " + newPostUserId + ", new post id = " + newPostId + "\n");
    }
}
