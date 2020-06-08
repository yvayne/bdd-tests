package bdd.examples.apps.shop;

import bdd.examples.apps.school.School;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Defines Shop class.
 */
public final class ShopApp {

    private static final Logger LOGGER = LogManager.getLogger(School.class);
    private static List<Product> products = new ArrayList<>();

    /**
     * Private constructor for utility class.
     */
    private ShopApp() {

    }

    /**
     * Loads login page.
     */
    public static void loadLoginPage() {
        LOGGER.info("Loading login page.");
    }

    /**
     * Enters credentials.
     */
    public static void enterCredentials() {
        LOGGER.info("Entering credentials.");
    }

    /**
     * Checks if shop page is displayed.
     *
     * @return true if its displayed, false otherwise.
     */
    public static boolean isShopPageDisplayed() {
        LOGGER.info("Validating login.");
        return true;
    }

    /**
     * Search products based on name.
     *
     * @param name product name.
     * @return search result list.
     */
    public static List<Product> searchProduct(final String name) {
        LOGGER.info("Searching product.");
        return Collections.singletonList(new Product(name));
    }

    /**
     * Adds product to cart.
     *
     * @param product product object.
     */
    public static void addProductToCart(final Product product) {
        LOGGER.info("Adding product to cart.");
        products.add(product);
    }

    /**
     * Gets cart count.
     *
     * @return cart count.
     */
    public static int getCartCount() {
        return products.size();
    }

    /**
     * Resets cart.
     */
    public static void resetCart() {
        LOGGER.info("Resetting product cart.");
        products.clear();
    }
}
