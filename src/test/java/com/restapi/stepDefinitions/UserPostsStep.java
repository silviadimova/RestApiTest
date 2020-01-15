package com.restapi.stepDefinitions;

import com.restapi.robots.UserPostsRobot;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class UserPostsStep {

    private UserPostsRobot robot = new UserPostsRobot("https://jsonplaceholder.typicode.com/");

    @After
    public void afterEachScenario() {
        robot.clearResponseStructure();
    }

    @Given("^As a random User$")
    public void asAUserWithRandomIdEquals() {
        robot.setRandomUserId(1, 10);
    }

    @Given("^As a User with id equals (\\d+)$")
    public void asAUserWithId(int id) {
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

    @When("^I make new post with (\\S+) and (\\S+)$")
    public void iMakeNewPostWithTitleAndText(String title, String text) {
        robot.makeNewPost(title, text);
    }

    @Then("^I can see my email$")
    public void iCanSeeMyEmail() {
        robot.canTheUserSeeHisEmail();
    }

    @Then("^I see some valid posts$")
    public void iSeeValidPosts() {
        robot.doesTheUserHaveValidPosts();
    }

    @Then("^I see successful post result$")
    public void iSeeSuccessfulPostResult() {
        robot.doesTheUserSeeSuccessfulPostResult();
    }
}
