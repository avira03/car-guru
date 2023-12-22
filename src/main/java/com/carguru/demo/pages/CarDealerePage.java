package com.carguru.demo.pages;

import com.carguru.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CarDealerePage extends Utility {
    private static final Logger log = LogManager.getLogger(CarDealerePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Find a Car Dealership Near You']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//p[@class = 'dealerBanner--dealershipName']")
    List<WebElement> carDealersName;

    public String getWelcomeText() {
        log.info("Getting welcome text from Find a Dealer page : " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public String getCarDealersName(String name) {
        for (WebElement namelist : carDealersName) {
            break;
        }
        log.info("Getting and verifying dealer name : " + carDealersName.toString());
        return name;
    }
}
