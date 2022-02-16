package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("User navigate to website")
    public void user_navigate_to_website() {
        System.out.println("User is in the website!");
    }

    @When("User enter valid username and password")
    public void user_enter_valid_username_and_password() {
        System.out.println("User entered valid username and password");
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        System.out.println("User logged in successfully");
    }

    @When("User enter valid username and invalid password")
    public void user_enter_valid_username_and_invalid_password() {
        System.out.println("User entered valid username and invalid password");
    }

    @Then("Login should fail")
    public void login_should_fail() {
        System.out.println("Login failed!");
    }

}
