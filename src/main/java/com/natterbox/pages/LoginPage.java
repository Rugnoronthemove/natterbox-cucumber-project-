package com.natterbox.pages;

import com.cucumber.listener.Reporter;
import com.natterbox.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//a[contains(text(),'Login')]")
    WebElement _logIntLink;

    public void clickOnLogInLink() {
        clickOnElement(_logIntLink);
    }

    @FindBy(id = "username")
    WebElement _usernameField;

    public void enterUsername(String userName) {
        Reporter.addStepLog("Entering username : " + userName + " to username field : " + _usernameField.toString() + "<br>");
        sendTextToElement(_usernameField, userName);
        log.info("Entering username : " + userName + " to username field : " + _usernameField.toString());
    }

    @FindBy(id = "password")
    WebElement _passwordField;

    public void enterPassword(String password) {
        Reporter.addStepLog("Entering password : " + password + " to password field : " + _passwordField.toString() + "<br>");
        sendTextToElement(_passwordField, password);
        log.info("Entering password : " + password + " to password field : " + _passwordField.toString());
    }

    @FindBy(xpath = "//button[@name='login']")
    WebElement _loginBtn;

    public void clickOnLoginButton() {
        Reporter.addStepLog("Clicking on login button : " + _loginBtn.toString());
        clickOnElement(_loginBtn);
        log.info("Clicking on login button : " + _loginBtn.toString());
    }

    @FindBy(xpath = "//div[@class='alert alert-danger login-alert ng-binding ng-scope']")
    WebElement _errorMessage;

    public String getErrorMsgText() {
        Reporter.addStepLog("gettig text from" + _errorMessage.toString());
        log.info("gettig text from" + _errorMessage.toString());
        return getTextFromElement(_errorMessage);

    }

}
