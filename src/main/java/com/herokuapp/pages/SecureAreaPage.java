package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecureAreaPage extends BasePage {

    public static final String SECURE_AREA_URL = BASE_URL + "secure";

    @FindBy(id = "flash-messages")
    private WebElement successMessage;
    @FindBy(linkText = "Logout")
    private WebElement logoutButton;

    public SecureAreaPage(WebDriver driver) {
        super(driver);
    }

    public String getSuccessMessageText() {
        return successMessage.getText();
    }

    public boolean isLogoutButtonDisplay() {
        return logoutButton.isDisplayed();
    }
}
