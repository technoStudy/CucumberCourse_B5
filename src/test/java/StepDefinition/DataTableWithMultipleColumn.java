package StepDefinition;

import io.cucumber.java.en.*;

import java.util.List;

public class DataTableWithMultipleColumn {

    @Given("User navigate to login page")
    public void user_navigate_to_login_page() {
        System.out.println("User navigate to login page");
    }

    @When("User enter email and password")
    public void user_enter_email_and_password(io.cucumber.datatable.DataTable dataTable) {

//       { { "test@technostudy.com", "1234567890" } , { "admin@technostudy.com", "abcdefg123" } }
        List<List<String>> testData = dataTable.asLists();

        for (List<String> list : testData) {
            System.out.println("User enter email: " + list.get(0) + " and user enter password: " + list.get(1));
        }

    }

    @Then("User Logout")
    public void user_logout() {
        System.out.println("User logout!");
    }

}
