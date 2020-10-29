package willgibson.adventofcode2019.useracceptancetests.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {

    @When("I visit the home page")
    public void iVisitTheHomePage() {
    }

    @Then("I see {string} in the text")
    public void iSeeInTheText(String needle) {
    }
}
