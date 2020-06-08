package bdd.examples.stepdefs;

import bdd.examples.apps.school.Student;
import bdd.examples.context.SchoolContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;

import static org.testng.Assert.assertTrue;

/**
 * Defines student tests step definitions.
 */
public class StudentSteps {

    private SchoolContext context;
    private Student student;

    /**
     * Initializes an instance of {@link StudentSteps}.
     *
     * @param context context object.
     */
    public StudentSteps(final SchoolContext context) {
        this.context = context;
    }

    /**
     * Creates new student according to data.
     *
     * @param data student's data.
     */
    @Given("^a new student is created with the following information$")
    public void aNewStudentIsCreatedWithTheFollowingInformation(final Map<String, String> data) {
        student = new Student(data);
    }

    /**
     * Adds studen to registry.
     */
    @When("^new student is added to school registry$")
    public void newStudentIsAddedToSchoolRegistry() {
        context.getSchool().addStudent(student);
    }

    /**
     * Asserts student registry content.
     */
    @Then("^school registry should contain new student information$")
    public void schoolRegistryShouldContainNewStudentInformation() {
        assertTrue(context.getSchool().isStudentInRegistry(student), "Student is not in School registry.");
    }
}
