package com.IntegrativeNutrition.Marketing.Pages;

import com.IntegrativeNutrition.Marketing.Global.Common;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.How;
import java.util.*;

public class AboutUsPage {

    /************************************
     * CONSTRUCTORS
     ***********************************/
    public AboutUsPage(WebDriver _driver){
        this.driver = _driver;
        this.InitializePge();
    }

    /************************************
     * INITIALIZE PAGE
     ************************************/

    WebDriver driver;

    public void waitForLoad(WebDriver driver) {
        ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                    }
                };
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(pageLoadCondition);
    }

    // Must make sure to go to page before running tests
    public void InitializePge() {
        driver.get(Common.FRONTEND_URL + "/about-us");
        waitForLoad(driver);
    }

    /************************************
     * PAGE ELEMENTS SETUP
     ***********************************/


    /************************************
     * PAGE TEST METHODS
     ************************************/



}
