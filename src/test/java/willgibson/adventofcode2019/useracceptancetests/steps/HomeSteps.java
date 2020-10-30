package willgibson.adventofcode2019.useracceptancetests.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.assertj.core.api.Assertions.assertThat;

public class HomeSteps {

    private final String baseURL = "http://localhost:8080/";
    ChromeDriver driver;

    @Before
    public void createDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("['start-maximized']");
        driver = new ChromeDriver(chromeOptions);
    }

    @After()
    public void closeBrowser() {
        driver.quit();
    }

    @When("I visit the home page")
    public void iVisitTheHomePage() {
        driver.get(baseURL);
    }

    @When("I visit the home page for day {string}")
    public void iVisitTheHomePageForDay(String day) {
        driver.get(baseURL + "?day=" + day);
    }

    @Then("the page heading is {string}")
    public void iSeeInTheText(String needle) {
        assertThat(driver.findElement(By.tagName("h1")).getText()).isEqualTo(needle);
    }

    @And("the answers are shown for days {int} to {int}")
    public void theAnswersAreShownForTheFollowingDaysTo(int startDay, int endDay) {
        assertThat(driver.findElement(By.cssSelector(".day01 h2")).getText()).startsWith("Day 01");
        assertThat(driver.findElement(By.cssSelector(".day01 dd.part1")).getText()).isNotEmpty();

    }

    @And("the answer is shown for day {string}")
    public void theAnswerIsShownForDay(String day) {
        day = ("00" + day).substring(day.length());
        assertThat(driver.findElement(By.cssSelector(".day" + day + " h2")).getText()).startsWith("Day " + day );
        assertThat(driver.findElement(By.cssSelector(".day" + day + " dd.part1")).getText()).isNotEmpty();
    }
}
