package com.cybertek.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin="html:target/cucumber-report.html",
        features = "src/test/resources/features",
        glue="com/cybertek/step_definitions",
        dryRun=true,
        tags= "@wipZukhra"
        //can do all @all, can do separate @Student , can do conditions @Librarian or/and @Student,
        //regression and not @student,
)
public class Cukes_Runner {
}
