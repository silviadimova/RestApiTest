package com.restapi.stepDefinitions;

import com.restapi.robots.UserPostsRobot;
import com.restapi.utils.Urls;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class UserPostsStep {

    private UserPostsRobot robot = new UserPostsRobot(Urls.API_BASE_URL);

    @After
    public void afterEachScenario() {
        robot.clearResponseStructure();
    }

    @Given("^As a random User$")
    public void asAUserWithRandomIdEquals() {
        robot.setRandomUserId(1, 10);
    }

    @Given("^As a User with id equals (\\S+)$")
    public void asAUserWithId(String id) {
        robot.setUserId(id);
    }

    @When("^I get my profile$")
    public void iGetMyProfile() {
        robot.getUserProfile();
    }

    @When("^I get my posts$")
    public void iGetMyPosts() {
        robot.getUserPosts();
    }

    @Then("^I can see my email$")
    public void iCanSeeMyEmail() {
        robot.canTheUserSeesHisEmail();
    }

    @Then("^I see some valid posts$")
    public void iSeeValidPosts() {
        robot.doesTheUserHaveValidPosts();
    }
}
