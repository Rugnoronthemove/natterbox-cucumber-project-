package com.natterbox.cucumber.stepdefs;

import com.natterbox.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class MyStepdefs {
    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {

    }

    @And("^I click on Login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLogInLink();
    }
}
