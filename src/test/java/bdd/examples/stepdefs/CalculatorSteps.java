package bdd.examples.stepdefs;

import bdd.examples.apps.calculator.CalculatorApp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertEquals;

/**
 * Defines calculator app tests step definitions.
 */
public class CalculatorSteps {

    /**
     * Initializes calculator.
     */
    @Given("^calculator is opened$")
    public void calculatorIsOpened() {
        CalculatorApp.initialize();
    }

    /**
     * Enters a operand.
     *
     * @param a operand value.
     */
    @When("^\"([^\"]*)\" number is entered into calc$")
    public void aNumberIsEnteredIntoCalc(final double a) {
        CalculatorApp.setNumberA(a);
    }

    /**
     * Enters operation type.
     *
     * @param operation operation type.
     */
    @When("^press \"(\\+|-|\\*|\\/)\" button$")
    public void pressOperation(final String operation) {
        CalculatorApp.setOperation(operation);
    }

    /**
     * Enters b operand.
     *
     * @param b operand value.
     */
    @When("^also \"([^\"]*)\" number is entered into calc$")
    public void alsoBNumberIsEnteredIntoCalc(final double b) {
        CalculatorApp.setNumberB(b);
    }

    /**
     * Calculates result.
     */
    @When("^press equals$")
    public void pressEquals() {
        CalculatorApp.calculate();
    }

    /**
     * Assert calculation output.
     *
     * @param expectedResult expected calculation output.
     */
    @Then("^the result should be \"([^\"]*)\" on the screen$")
    public void theResultShouldBeResultOnTheScreen(double expectedResult) {
        assertEquals(CalculatorApp.getResult(), expectedResult,
                "Calculated result does not match expected value.");
    }
}
