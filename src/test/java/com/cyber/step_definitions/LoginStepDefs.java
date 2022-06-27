package com.cyber.step_definitions;

import io.cucumber.java.en.*;

public class LoginStepDefs {

    @Given("the user on the login page")
    public void the_user_on_the_login_page() {
        System.out.println("open browser and go to login page");
    }

    @When("the user enters the valid user")
    public void the_user_enters_the_valid_user() {
        System.out.println("provide valid credentials");
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("make verifications");
    }

    @When("the user enters the invalid user")
    public void the_user_enters_the_invalid_user() {
        System.out.println("provide invalid credentials");
    }

    @When("the user enters the invalid user 2")
    public void the_user_enters_the_invalid_user_2() {
        System.out.println("provide invalid credentials_2");
    }

}
