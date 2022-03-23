package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefs {
    @Given("User is on the login page of CRM")
    public void LoginMthd(){
    Driver.getDriver().get("https://practice.cydeo.com/dropdown");
        System.out.println("Login Successful");
    }

    @When("User enters below credentials")
    public void userEntersBelowCredentials() {
    }

    @Then("User should see homepage")
    public void userShouldSeeHomepage() {
    }
}
