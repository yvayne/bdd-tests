package bdd.examples.context;

import bdd.examples.apps.school.School;

/**
 * defines School context.
 */
public class SchoolContext {

    private School school;

    /**
     * Initializes an instance of {@link SchoolContext} class.
     */
    public SchoolContext() {
        school = new School();
    }

    /**
     * Gets school reference from context.
     *
     * @return school object.
     */
    public School getSchool() {
        return school;
    }
}
