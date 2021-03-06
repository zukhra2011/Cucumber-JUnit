package com.cybertek.step_definitions;

import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.Utilities.Driver;
import com.cybertek.pages.EtsySearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsyStep_Definitions {
    @Given("User is on Etsy landing page")
    public void user_is_on_etsy_landing_page() {
        String url= ConfigurationReader.getProperty("etsyUrl");
        Driver.getDriver().get(url);
    }

    @Then("User should see Etsy title as expected")
    public void user_should_see_etsy_title_as_expected() {
        String expectedTitle="Etsy-Shop for handmade, vintage, custom and unique gifts for everyone";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue("Title is not as expected", actualTitle.equals(expectedTitle));

    }
    EtsySearchPage etsySearchPage=new EtsySearchPage();

    @When("User types Wooden spoon in the search bar")
    public void userTypesWoodenSpoonInTheSearchBar() {
        etsySearchPage.searchBar.sendKeys("Wooden spoon");
    }
    @And("User clicks to search button")
    public void userClicksToSearchButton() {
        etsySearchPage.searchButton.click();
    }
    @Then("User sees title is Wooden spoon | Etsy")
    public void userSeesTitleIsWoodenSpoonEtsy() {
        String expectedTitle="Wooden spoon | Etsy";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals("Title is not expected", actualTitle, expectedTitle);
    }
}
