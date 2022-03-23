package com.cydeo.step_definitions;


import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.DriverSingleton;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.Map;


public class StepDefs {
    @Given("User is on the login page of CRM")
    public void login(){
        String url = ConfigurationReader.getProperty("url");
        DriverSingleton.getDriver().get(url);
    }

    @When("User enters below credentials")
    public void userEntersBelowCredentials(Map<String,String> list) {
        for(Map.Entry<String,String> each: list.entrySet()){
            System.out.println(each.getValue());
        }
    }

    @Then("User should see homepage")
    public void userShouldSeeHomepage() {
    }
}
