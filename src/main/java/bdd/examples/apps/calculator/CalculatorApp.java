package bdd.examples.apps.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Defines Calculator App class.
 */
public final class CalculatorApp {

    private static final Logger LOGGER = LogManager.getLogger(CalculatorApp.class);
    private static String operation;
    private static double a;
    private static double b;
    private static double result;

    /**
     * Private constructor for utility class.
     */
    private CalculatorApp() {

    }

    /**
     * Sets a operand.
     *
     * @param a operand.
     */
    public static void setNumberA(final double a) {
        LOGGER.info(String.format("Setting %s as 'a' value.", a));
        CalculatorApp.a = a;
    }

    /**
     * Sets b operand.
     *
     * @param b operand.
     */
    public static void setNumberB(final double b) {
        LOGGER.info(String.format("Setting %s as 'b' value.", b));
        CalculatorApp.b = b;
    }

    /**
     * Sets operation type.
     *
     * @param operation operation.
     */
    public static void setOperation(final String operation) {
        LOGGER.info(String.format("Setting %s as operation value.", operation));
        CalculatorApp.operation = operation;
    }

    /**
     * Calculates result.
     */
    public static void calculate() {
        LOGGER.info("Calculating operation.");
        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                LOGGER.error("Error when calculating operation.");
                result = 0;
        }
    }

    /**
     * Gets result.
     *
     * @return result.
     */
    public static double getResult() {
        return result;
    }

    /**
     * Initializes values.
     */
    public static void initialize() {
        LOGGER.info("Initializing calculator.");
        operation = "";
        a = 0;
        b = 0;
        result = 0;
    }
}
