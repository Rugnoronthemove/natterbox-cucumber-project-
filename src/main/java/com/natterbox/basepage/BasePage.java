package com.natterbox.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public static WebDriver driver;

    public BasePage() {

        PageFactory.initElements(driver,this);

        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/java/com/natterbox/resources/propertyfile/log4j.properties");
    }
}
