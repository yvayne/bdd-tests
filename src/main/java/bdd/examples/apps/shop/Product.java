package bdd.examples.apps.shop;

/**
 * Defines product class.
 */
public class Product {

    private String name;

    /**
     * Initializes and instance of {@link Product} class.
     *
     * @param name product name.
     */
    public Product(final String name) {
        this.name = name;
    }

    /**
     * Gets product name.
     *
     * @return product name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets product name.
     *
     * @param name product name.
     */
    public void setName(final String name) {
        this.name = name;
    }
}
