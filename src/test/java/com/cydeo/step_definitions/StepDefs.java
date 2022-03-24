package com.cydeo.step_definitions;


import com.cydeo.pages.DropDownTask;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.DriverSingleton;
import com.github.dockerjava.api.model.Link;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;


public class StepDefs {
    DropDownTask dropDownTask = new DropDownTask();
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
        Select s = new Select(dropDownTask.monthDropdown);
        List<WebElement> listOfWebElementsOfMonths = s.getOptions();
        LinkedHashSet<String> listOfStringsOfMonths = new LinkedHashSet<>();
        for (WebElement each:listOfWebElementsOfMonths){
            listOfStringsOfMonths.add(each.getText());
        }
        System.out.println(listOfStringsOfMonths);
    }




    @Then("User should see homepage")
    public void userShouldSeeHomepage() {
    }
}
