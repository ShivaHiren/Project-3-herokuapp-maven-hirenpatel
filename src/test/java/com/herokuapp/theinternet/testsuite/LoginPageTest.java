package com.herokuapp.theinternet.testsuite;


import com.herokuapp.theinternet.pages.LoginPage;
import com.herokuapp.theinternet.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test
    public void UserSholdLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUserName("Jhonwick");
        loginPage.enterPassword("Jhonwick");
        loginPage.clickOnLoginButton();
        Assert.assertEquals("Secure Area", "Secure Area");

    }

    @Test
    public void verifyTheUsernameErrorMessage() {
        loginPage.enterUserName("Superman");
        loginPage.enterPassword("Jhonwick");
        loginPage.clickOnLoginButton();
        Assert.assertEquals("Your username is invalid!\\n\" +\n" +
                "                \"×", "Your username is invalid!\\n\" +\n" +
                "                \"×");

    }

    @Test
    public void verifyThePasswordErrorMessage() {
        loginPage.enterUserName("Jhonwick");
        loginPage.enterPassword("1234");
        loginPage.clickOnLoginButton();
        Assert.assertEquals("Your password is invalid!\\n\" +\n" +
                "                \"×", "Your password is invalid!\\n\" +\n" +
                "                \"×");

    }

}

