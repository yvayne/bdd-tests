package bdd.examples.hooks;

import bdd.examples.context.SchoolContext;
import cucumber.api.java.After;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Defines school hooks.
 */
public class SchoolHooks {

    private static final Logger LOGGER = LogManager.getLogger(SchoolHooks.class);

    private SchoolContext context;

    /**
     * Initializes an instance of {@link SchoolHooks}.
     *
     * @param context context object.
     */
    public SchoolHooks(final SchoolContext context) {
        this.context = context;
    }

    /**
     * Cleans school registry.
     */
    @After(value = "@cleanupStudentsRegistry")
    public void cleanupStudentsRegistry() {
        LOGGER.info("Cleanup school registry.");
        context.getSchool().cleanupStudentRegistry();
    }
}
