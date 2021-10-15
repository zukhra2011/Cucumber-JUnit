package com.cybertek.step_definitions;


import com.cybertek.Utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before(value="@login",order=1)//get from java
    public void setupLoginScenario(){
        System.out.println("---Setting up browser with further details");
    }
    @Before("@db")
    public void setupScenario(){
        System.out.println("Before--Setting up browser with further details....");

    }
    @After
    public void tearDownScenario(Scenario scenario){
       //If my scenario fails
        //take a screenshot
       // scenario.isFailed()
        if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }


        System.out.println("----Teardown steps are being applied....");
        Driver.closeDriver();
    }
    @BeforeStep
    public void setuoStep(){
        System.out.println("---setup applying for each stage");
    }
    @AfterStep
    public void afterStep(){
        System.out.println("---teardown applying for each step");
    }

}
