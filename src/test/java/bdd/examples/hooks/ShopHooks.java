package bdd.examples.hooks;

import bdd.examples.apps.shop.ShopApp;
import cucumber.api.java.After;

/**
 * Defines shop hooks.
 */
public class ShopHooks {

    /**
     * Cleans product cart.
     */
    @After(value = "@cleanCartPostCondition")
    public void cleanCartPostCondition() {
        ShopApp.resetCart();
    }
}
