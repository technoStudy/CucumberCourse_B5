package StepDefinition;

import io.cucumber.java.en.*;

public class SearchWithScenarioOutline {

    @Given("User navigate to test website")
    public void user_navigate_to_test_website() {
        System.out.println("User navigate to website!");
    }

    @When("User search for {string} in test website")
    public void user_search_for_in_test_website(String searchItem) {
        System.out.println("User search for: " + searchItem);
    }

    @Then("User should see results for {string}")
    public void user_should_see_results_for(String resultItem) {
        System.out.println("User see results for: " + resultItem);
    }

}
