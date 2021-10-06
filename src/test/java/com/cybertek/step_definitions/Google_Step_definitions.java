package com.cybertek.step_definitions;

import com.cybertek.Utilities.Driver;
import com.cybertek.pages.GoogleSearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javafx.beans.binding.StringExpression;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_Step_definitions {
    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {
       String actualTitle=Driver.getDriver().getTitle();
       String expectedTitle="Google";
       Assert.assertTrue(actualTitle.equals(expectedTitle));
    }
    @Given("User is on Google home page")
    public void user_is_on_google_home_page() {
        Driver.getDriver().get("https://google.com");
    }
    @When("User searches for apple")
    public void user_searches_for_apple() {
        GoogleSearchPage googleSearchPage=new GoogleSearchPage();
        googleSearchPage.searchBar.sendKeys("apple"+ Keys.ENTER);

    }
    @Then("User should see apple in the title")
    public void user_should_see_apple_in_the_title() {
String actualTitle=Driver.getDriver().getTitle();
String expectedTitle="apple";
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }
}
