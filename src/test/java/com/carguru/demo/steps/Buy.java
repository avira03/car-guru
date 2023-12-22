package com.carguru.demo.steps;

import com.carguru.demo.pages.HomePage;
import com.carguru.demo.pages.ProductPage;
import com.carguru.demo.pages.SearchPage;
import com.carguru.demo.pages.UsedCarSearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Buy {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I mouse hover on {string} tab")
    public void iMouseHoverOnTab(String option) {
        new HomePage().selectTopMenuOptions(option);
    }

    @And("I click Search Cars link")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnSearchCarOption();
    }

    @Then("I navigate to ‘new and used car search’ page")
    public void iNavigateToNewAndUsedCarSearchPage() {
        Assert.assertEquals(new SearchPage().getWelcomeText(), "New & Used Car Search - carsguide");

    }

    @And("I select make {string}")
    public void iSelectMake(String make) {
        new SearchPage().selectMakeFromDropDown(make);
    }

    @And("I select model {string}")
    public void iSelectModel(String model) {
        new SearchPage().selectModelsFromDropDown(model);
    }

    @And("I select location {string}")
    public void iSelectLocation(String location) {
        new SearchPage().selectLocationFromDropDown(location);
    }

    @And("I select price {string}")
    public void iSelectPrice(String price) {
        new SearchPage().selectPriceFromDropDown(price);
    }

    @And("I click on Find My Next Car tab")
    public void iClickOnFindMyNextCarTab() {
        new SearchPage().clickOnFindMyNextCar();
    }

    @Then("I should see the make {string} in results")
    public void iShouldSeeTheMakeInResults(String make) {
        if (new ProductPage().checkTitle()) {
            Assert.assertTrue(new ProductPage().getTitleOfThePage().contains(make));
        } else
            System.out.println("Result title is not available");
    }


    @And("I click Used link")
    public void iClickUsedLink() {
        new HomePage().clickOnUsedOption();
    }

    @Then("I navigate to Used Cars For Sale page")
    public void iNavigateToUsedCarsForSalePage() {
        Assert.assertEquals(new UsedCarSearchPage().getWelcomeText(), "Used Cars For Sale");

    }
}
