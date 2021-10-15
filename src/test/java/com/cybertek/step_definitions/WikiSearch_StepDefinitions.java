package com.cybertek.step_definitions;

import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.Utilities.Driver;
import com.cybertek.pages.WikiSearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikiSearch_StepDefinitions {
    WikiSearchPage wikiSearchPage=new WikiSearchPage();
    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        String url= ConfigurationReader.getProperty("wikiUrl");
        Driver.getDriver().get("http://www.wikipedia.org");

    }

    @When("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String arg0) {
        wikiSearchPage.searchBox.sendKeys(arg0);

    }
    @And("User clicks wiki search button")
    public void userClicksWikiSearchButton() {
        wikiSearchPage.searchButton.click();
    }

    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String arg0) {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle=arg0+ " - Wikipedia"; //arg0  makes it dynamic
        // arg0 stands for the string in the wiki search feature. "Steve Jobs"
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String arg0) {
        String expectedHeader=arg0;
        String actualheader= wikiSearchPage.mainHeader.getText();
        Assert.assertEquals(actualheader,expectedHeader);
    }
}
