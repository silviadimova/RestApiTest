package com.restapi.stepDefinitions;

import com.restapi.robots.UserPostsRobot;
import com.restapi.utils.Urls;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class UserPostsStep {

    private UserPostsRobot robot = new UserPostsRobot(Urls.API_BASE_URL);
    private String userId;

    @Given("^As a random User$")
    public void asAUserWithRandomIdEquals() {
        userId = robot.createRandomUserId(1, 10);
    }

    @Given("^As a User with id equals (\\S+)$")
    public void asAUserWithId(String id) {
        userId = id;
    }

    @Then("^I can see my email$")
    public void iCanSeeMyEmail() {
        robot.canTheUserSeesHisEmail(userId);
    }
}
