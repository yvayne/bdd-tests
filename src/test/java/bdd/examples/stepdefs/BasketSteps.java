package bdd.examples.stepdefs;

import bdd.examples.apps.basket.BasketApp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertEquals;

/**
 * Defines basket app tests step definitions.
 */
public class BasketSteps {

    /**
     * Sets initial number of fruits.
     *
     * @param initialNumber initial number.
     */
    @Given("^the basket has \"([^\"]*)\" (?:fruit|fruits)$")
    public void theBasketHasCucumbers(final int initialNumber) {
        BasketApp.setFruitsNumber(initialNumber);
    }

    /**
     * Adds fruits to the basket.
     *
     * @param number number of fruits.
     */
    @When("^\"([^\"]*)\" (?:apples|oranges) are added to the basket$")
    public void addedFruitsToTheBasket(final int number) {
        BasketApp.addFruits(number);
    }

    /**
     * Removes fruits from basket.
     *
     * @param number number of fruits to be removed.
     */
    @When("^\"([^\"]*)\" (?:fruit|fruits) are removed from the basket$")
    public void cucumbersAreRemovedFromTheBasket(final int number) {
        BasketApp.removeFruits(number);
    }

    /**
     * Asserts number of fruits.
     *
     * @param expectedNumber expected number of fruits.
     */
    @Then("^the basket contains \"([^\"]*)\" (?:fruit|fruits)$")
    public void theBasketContainsCucumbers(final int expectedNumber) {
        assertEquals(BasketApp.getFruitsNumber(), expectedNumber,
                "The number of fruits in basket does not match.");
    }
}
