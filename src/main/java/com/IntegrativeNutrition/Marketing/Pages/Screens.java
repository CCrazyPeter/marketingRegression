package com.IntegrativeNutrition.Marketing.Pages;

import com.IntegrativeNutrition.Marketing.Global.Common;
import com.IntegrativeNutrition.Marketing.Global.TestEnvironment;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date Created: 6/30/14
 * Contains instantiation of all screen objects
 */

public class Screens {

    static WebDriver driver;

    public static void waitForLoad(WebDriver driver) {
        ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                    }
                };
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(pageLoadCondition);
    }

    public static Footer Footer() {
        driver = TestEnvironment.get_Driver();
        driver.get(Common.FRONTEND_URL);
        waitForLoad(driver);
        Footer footer = new Footer(driver);
        PageFactory.initElements(driver, footer);
        return footer;
    }

    public static AboutUsPage AboutUsPage() {
        driver = TestEnvironment.get_Driver();
        driver.get(Common.FRONTEND_URL + "/about-us");
        waitForLoad(driver);
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        PageFactory.initElements(driver, aboutUsPage);
        return aboutUsPage;
    }

}
