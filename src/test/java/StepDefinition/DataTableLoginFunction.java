package StepDefinition;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class DataTableLoginFunction {

    WebDriver driver;

    @Given("Navigate to demoWebShop")
    public void navigate_to_demo_web_shop() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("http://demowebshop.tricentis.com/login");
    }

    @When("User enter invalid email address")
    public void user_enter_invalid_email_address(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

        List<String> testData = dataTable.asList();

        WebElement emailInput = driver.findElement(By.id("Email"));
        WebElement submit = driver.findElement(By.xpath("//input[@value='Log in']"));

        for (String element : testData) {
            emailInput.clear();
            emailInput.sendKeys(element);
            submit.click();
            Thread.sleep(3000);
            WebElement errorMessage = driver.findElement(By.xpath("//span[@class='field-validation-error']"));
            Assert.assertTrue(errorMessage.isDisplayed());
            Thread.sleep(3000);
        }

    }

    @Then("User should see a warning")
    public void user_should_see_a_warning() {
        driver.quit();
    }

}
