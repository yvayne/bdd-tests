package bdd.examples.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Defines test runner execution class.
 */
@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test/resources/features/"},
        glue = {"bdd.examples"})
public class Runner extends AbstractTestNGCucumberTests {

    /**
     * Code executed before feature files execution.
     */
    @BeforeTest
    public void beforeExecution() {
    }

    /**
     * Code executed after feature files execution.
     */
    @AfterTest
    public void afterExecution() {
    }
}
