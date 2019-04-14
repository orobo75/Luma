package com.lamtech.luma.stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginSteps {
    @Given("^user on login homepage$")
    public void userOnLoginHomepage() throws Throwable {
    }

    @When("^user enter thier \"([^\"]*)\"$")
    public void userEnterThier(String username) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
