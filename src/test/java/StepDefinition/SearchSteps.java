package StepDefinition;

import io.cucumber.java.en.*;

public class SearchSteps {

    @And("User go to search page")
    public void user_go_to_search_page() {
        System.out.println("User navigate search page");
    }

    @When("User search for Cucumber")
    public void user_search_for_cucumber() {
        System.out.println("User search for cucumber");
    }

    @Then("All the results should be displayed for Cucumber")
    public void all_the_results_should_be_displayed_for_cucumber() {
        System.out.println("User see the results related to cucumber");
    }

    @When("User search for SDET")
    public void user_search_for_sdet() {
        System.out.println("User search for SDET");
    }

    @Then("All the results should be displayed for SDET")
    public void all_the_results_should_be_displayed_for_sdet() {
        System.out.println("Results are related to SDET");
    }

}
