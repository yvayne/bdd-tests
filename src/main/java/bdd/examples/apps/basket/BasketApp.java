package bdd.examples.apps.basket;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Defines Basket app class.
 */
public final class BasketApp {

    private static final Logger LOGGER = LogManager.getLogger(BasketApp.class);
    private static int fruitsNumber = 0;

    /**
     * Empty constructor for utility class.
     */
    private BasketApp() {

    }

    /**
     * Adds fruits to basket.
     *
     * @param number number of fruits.
     */
    public static void addFruits(final int number) {
        LOGGER.info(String.format("Adding %s fruit(s) to basket.", number));
        fruitsNumber += number;
    }

    /**
     * Removes fruits from basket.
     *
     * @param number number of fruits.
     */
    public static void removeFruits(final int number) {
        LOGGER.info(String.format("Removing %s fruit(s) to basket.", number));
        fruitsNumber -= number;
    }

    /**
     * Gets fruits number.
     *
     * @return fruits number.
     */
    public static int getFruitsNumber() {
        return fruitsNumber;
    }

    /**
     * Sets fruits number.
     *
     * @param number fruits number.
     */
    public static void setFruitsNumber(final int number) {
        fruitsNumber = number;
    }
}
