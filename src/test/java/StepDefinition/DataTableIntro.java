package StepDefinition;

import io.cucumber.java.en.*;

import java.util.List;

public class DataTableIntro {

    @Given("Navigate to website")
    public void navigate_to_website() {
        System.out.println("User navigate Website!");
    }

    @When("User enter email address")
    public void user_enter_email_address(io.cucumber.datatable.DataTable dataTable) {

//      { "asdfytrsdfghjhg", "876543456756776", "@#^%$#!@#$%^&", "JGFDFGHJGFHJKU", "fghja@#$%^12345" }
        List<String> testData = dataTable.asList();

        for (String element : testData) {
            System.out.println("Send Keys -> " + element);
        }

    }

    @Then("Close application")
    public void close_application() {
        System.out.println("User Logout!");
    }

}
