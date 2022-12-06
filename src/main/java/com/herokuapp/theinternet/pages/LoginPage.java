package com.herokuapp.theinternet.pages;


import com.herokuapp.theinternet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By userName = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//i[contains(text(),'Login')]");
    By welcomeText = By.xpath("//h2[contains(text(),' Secure Area')]");
    By errorMessage = By.xpath("//div[@id='flash']");
    By invalidPassword = By.xpath("//div[@class='flash error']");



    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void enterUserName(String name) {
        sendTextToElement(userName , name);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }
}
