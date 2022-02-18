package StepDefinition;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class GoogleSearchDataFromFeatureFile {

    WebDriver driver;

    @Given("User navigate to Google website")
    public void user_navigate_to_google_website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");
    }

    @When("User search for {string} in Google")
    public void user_search_for_in_google(String searchData) {

        WebElement searchInput = driver.findElement(By.xpath("//input[@title='Search']"));
        searchInput.sendKeys(searchData);

        WebElement searchSubmitButton = driver.findElement(By.xpath("//input[@value='Google Search']"));
        searchSubmitButton.click();

    }

    @Then("User should see {string} results in Google")
    public void user_should_see_results_in_google(String searchResultItem) {

        WebElement searchResult = driver.findElement(By.xpath("//a//h3"));

        System.out.println("Search Result text: " + searchResult.getText());
        Assert.assertTrue(searchResult.getText().toLowerCase().contains(searchResultItem.toLowerCase()));

        driver.quit();

    }

}
