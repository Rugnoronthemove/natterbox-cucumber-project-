package com.natterbox.pages;

import com.natterbox.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//a[contains(text(),'Login')]")
    WebElement _logIntLink;

    public void clickOnLogInLink() {
        clickOnElement(_logIntLink);
    }

}
