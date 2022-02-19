package StepDefinition;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class OpenCartSearchWithScenarioOutline {

    WebDriver driver;

    @Given("User navigate to Opencart")
    public void user_navigate_to_opencart() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://opencart.abstracta.us/index.php?route=common/home");
    }

    @When("User search for {string} in Opencart")
    public void user_search_for_in_opencart(String string) {
        WebElement searchInput = driver.findElement(By.xpath("//input[@name='search']"));
        searchInput.sendKeys(string);

        WebElement searchButton = driver.findElement(By.xpath("//i[@class='fa fa-search']/.."));
        searchButton.click();
    }

    @Then("Results should be related to {string} in Opencart")
    public void results_should_be_related_to_in_opencart(String string) {
        List<WebElement> results = driver.findElements(By.xpath("//h4"));

        for (WebElement element : results) {
            Assert.assertTrue(element.getText().contains(string));
        }

    }

}
