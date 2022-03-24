package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.cydeo.utilities.DriverSingleton.getDriver;

public class DropDownTask {
    
    public DropDownTask() {
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy (id = "month") public WebElement monthDropdown;

}
