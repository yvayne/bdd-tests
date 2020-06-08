package bdd.examples.stepdefs;

import bdd.examples.apps.shop.Product;
import bdd.examples.apps.shop.ShopApp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Defines shop app tests step definitions.
 */
public class ShopSteps {

    private List<Product> productsFound;

    /**
     * Enters to login page.
     */
    @Given("^login page is displayed$")
    public void loginPageIsDisplayed() {
        ShopApp.loadLoginPage();
    }

    /**
     * Enters valid credentials.
     */
    @When("^enter valid username and password credentials$")
    public void enterValidUsernameAndPasswordCredentials() {
        ShopApp.enterCredentials();
    }

    /**
     * Asserts that home page is displayed successfully.
     */
    @Then("^home page should be displayed$")
    public void homePageShouldBeDisplayed() {
        assertTrue(ShopApp.isShopPageDisplayed());
    }

    /**
     * Searches for a product.
     *
     * @param name product name.
     */
    @Given("^a search for \"([^\"]*)\" product$")
    public void aSearchForProduct(final String name) {
        productsFound = ShopApp.searchProduct(name);
    }

    /**
     * Adds product to cart from search result.
     */
    @When("^first item of search result is added to cart$")
    public void firstItemOfSearchResultIsAddedToCart() {
        ShopApp.addProductToCart(productsFound.get(0));
    }

    /**
     * Asserts counter of cart.
     *
     * @param expectedCount expected counter value.
     */
    @Then("^users's card should display \"([^\"]*)\" in items added counter$")
    public void usersSCardShouldDisplayInItemsAddedCounter(final int expectedCount) {
        assertEquals(ShopApp.getCartCount(), expectedCount, "Cart does not have expected count value.");
    }
}
