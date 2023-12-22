package com.carguru.demo.steps;

import com.carguru.demo.pages.CarDealerePage;
import com.carguru.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class FindDealers {
    @And("I click Find a Dealer")
    public void iClickFindADealer() {
        new HomePage().clickOnFindADealerOption();
    }

    @Then("I navigate to car-dealers page")
    public void iNavigateToCarDealersPage() {
        Assert.assertEquals(new CarDealerePage().getWelcomeText(), "Find a Car Dealership Near You");
    }

    @And("I should see the dealer names {string} are display on page")
    public void iShouldSeeTheDealerNamesAreDisplayOnPage(String dealersName) {
        Assert.assertEquals(new CarDealerePage().getCarDealersName(dealersName),dealersName);
    }
}
