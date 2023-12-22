package com.carguru.demo.pages;

import com.carguru.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[@class = 'h1Text search--title']")
    WebElement resultText;

    public String getTitleOfThePage() {
        log.info("Getting title of the page and verifing the make name : " + resultText.toString());
        return getTextFromElement(resultText);
    }

    public boolean checkTitle() {
        return verifyThatElementIsDisplayed(resultText);
    }
}
