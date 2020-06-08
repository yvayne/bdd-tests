package bdd.examples.apps.school;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Defines School class.
 */
public class School {

    private static final Logger LOGGER = LogManager.getLogger(School.class);
    private List<Student> students;

    /**
     * Initializes an instance of {@link School} class.
     */
    public School() {
        students = new ArrayList<>();
    }

    /**
     * Adds student to registry.
     *
     * @param student student object.
     */
    public void addStudent(final Student student) {
        LOGGER.info("Adding student to registry.");
        students.add(student);
    }

    /**
     * Checks if student is in registry.
     *
     * @param student student object.
     * @return true if student is in registry, false otherwise.
     */
    public boolean isStudentInRegistry(final Student student) {
        LOGGER.info("Verifying if student is in registry.");
        return students.contains(student);
    }

    /**
     * Cleans student registry.
     */
    public void cleanupStudentRegistry() {
        LOGGER.info("Cleaning registry.");
        students.clear();
    }
}
