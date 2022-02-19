package StepDefinition;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class OpenCartEditAccountWithScenarioOutline {

    WebDriver driver;

    @Given("Navigate to Opencart app")
    public void navigate_to_opencart_app() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://opencart.abstracta.us/index.php?route=common/home");
    }

    @And("Login to your account")
    public void login_to_your_account() {
        WebElement myAccountLogo = driver.findElement(By.xpath("//a[@title='My Account']"));
        myAccountLogo.click();

        WebElement loginButton = driver.findElement(By.xpath("//a[text()='Login']"));
        loginButton.click();

        WebElement usernameInput = driver.findElement(By.xpath("//input[@name='email']"));
        usernameInput.sendKeys("123456789@test.com");

        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));
        passwordInput.sendKeys("123456789");

        WebElement loginSubmitButton = driver.findElement(By.xpath("//input[@value='Login']"));
        loginSubmitButton.click();
    }

    @When("User navigate to edit account page")
    public void user_navigate_to_edit_account_page() {
        WebElement editAccountButton = driver.findElement(By.xpath("//a[text()='Edit Account']"));
        editAccountButton.click();
    }

    @And("Update {string}")
    public void update(String firstNameData) {
        WebElement firstnameInput = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstnameInput.clear();
        firstnameInput.sendKeys(firstNameData);

        WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
        continueButton.click();
    }

    @Then("User should see success message")
    public void user_should_see_success_message() {
        WebElement successMessage = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(successMessage.getText().toLowerCase().contains("success"));

        driver.quit();
    }

}
