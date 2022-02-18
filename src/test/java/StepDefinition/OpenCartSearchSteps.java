package StepDefinition;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class OpenCartSearchSteps {

    WebDriver driver;

    @Given("User navigate to Opencart website")
    public void user_navigate_to_opencart_website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://opencart.abstracta.us/index.php?route=common/home");
    }

    @When("User search for {string} in OpenCart")
    public void user_search_for_in_open_cart(String searchItem) {
        WebElement searchInput = driver.findElement(By.xpath("//input[@name='search']"));
        searchInput.sendKeys(searchItem);

        WebElement searchButton = driver.findElement(By.xpath("//i[@class='fa fa-search']/.."));
        searchButton.click();
    }

    @Then("All the results in Opencart should be related to {string}")
    public void all_the_results_in_opencart_should_be_related_to(String expectedResult) {
        List<WebElement> searchResultItems = driver.findElements(By.xpath("//h4"));

        for (WebElement element : searchResultItems) {
            System.out.println(element.getText());
            Assert.assertTrue(element.getText().contains(expectedResult));
        }

        driver.quit();

    }

}
