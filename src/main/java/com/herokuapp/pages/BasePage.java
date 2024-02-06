package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver;
    public static final String BASE_URL = "https://the-internet.herokuapp.com/";

    public BasePage(WebDriver driver) {
        //this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
