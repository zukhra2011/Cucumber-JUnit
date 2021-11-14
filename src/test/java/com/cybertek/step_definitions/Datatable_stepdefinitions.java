package com.cybertek.step_definitions;

import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.Utilities.Driver;
import com.cybertek.pages.LibraryLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class Datatable_stepdefinitions {
    LibraryLoginPage libraryLoginPage=new LibraryLoginPage();
    @Given("User is on the login page of library app")
    public void user_is_on_the_login_page_of_library_app() {
        System.out.println("User is on the login page!");
        String url= ConfigurationReader.getProperty("libraryUrl");
        Driver.getDriver().get(url);

    }

    @When("User enters username and password")
    public void user_enters_username_and_password(Map<String,String> loginInfo) {
       libraryLoginPage.emailInput.sendKeys(loginInfo.get("username"));
       libraryLoginPage.passwordInput.sendKeys(loginInfo.get("password"));
       libraryLoginPage.signIn.click();
    }
    @Then("User should see title is Library")
    public void user_should_see_title_is_something() {
        System.out.println("Title verification");
   String actualTitle=Driver.getDriver().getTitle();
   String expectedTitle="Library";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Then("User should see below words displayed")
    public void user_should_see_below_words_displayed(List<String> listOfFruits) {

        System.out.println("listOfFruits.size() = " + listOfFruits.size());
        System.out.println("listOfFruits= "+listOfFruits);
    }

    }
