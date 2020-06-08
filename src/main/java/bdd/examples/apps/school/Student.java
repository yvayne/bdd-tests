package bdd.examples.apps.school;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

/**
 * Defines student class.
 */
public class Student {

    private static final Logger LOGGER = LogManager.getLogger(School.class);

    private String name;
    private String lastname;
    private int age;

    /**
     * Initializes an instance of {@link Student}.
     *
     * @param data student data.
     */
    public Student(final Map<String, String> data) {
        LOGGER.info("Creating new Student.".concat(data.toString()));
        name = data.get("name");
        lastname = data.get("lastname");
        age = Integer.parseInt(data.get("age"));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(final Object object) {
        if (object instanceof Student) {
            Student student = (Student) object;
            return name.equals(student.name) && lastname.equals(student.lastname) && age == student.age;
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
