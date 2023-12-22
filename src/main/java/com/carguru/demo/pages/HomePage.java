package com.carguru.demo.pages;

import com.carguru.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[@class = 'uhf-top']")
    List<WebElement> topMenu;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Search Cars']")
    WebElement searchCars;

    @CacheLookup
    @FindBy(xpath = "(//ul[@class = 'uhf-menu']/li/div//a)[2]")
    WebElement usedOption;

    @CacheLookup
    @FindBy(xpath = "(//ul[@class = 'uhf-menu']/li/div//a)[4]")
    WebElement findADealerOption;

    public void selectTopMenuOptions(String option) {
        for (WebElement e : topMenu) {
            mouseHoverToElement(e);
            break;
        }
        log.info("Mouse hovering on " + option + " :" + topMenu.toString());
    }

    public void clickOnSearchCarOption() {
        clickOnElement(searchCars);
        log.info("Clicking on search cars option in buy + sell menu : " + searchCars.toString());
    }

    public void clickOnUsedOption() {
        clickOnElement(usedOption);
        log.info("Clicking on used option in buy + sell menu : " + usedOption.toString());
    }

    public void clickOnFindADealerOption() {
        clickOnElement(findADealerOption);
        log.info("Clicking on find a dealer option in buy + sell menu : " + findADealerOption.toString());
    }
}
