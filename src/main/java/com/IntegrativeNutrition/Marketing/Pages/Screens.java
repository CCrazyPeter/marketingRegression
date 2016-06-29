package com.IntegrativeNutrition.Marketing.Pages;

import com.IntegrativeNutrition.Marketing.Global.Common;
import com.IntegrativeNutrition.Marketing.Global.TestEnvironment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date Created: 6/30/14
 * Contains instantiation of all screen objects
 */

public class Screens {

    static WebDriver driver;

    public static Footer Footer() {
        driver = TestEnvironment.get_Driver();
        driver.get(Common.FRONTEND_URL);
        Footer footer = new Footer(driver);
        PageFactory.initElements(driver, footer);
        return footer;
    }

    public static AboutUsPage AboutUsPage() {
        driver = TestEnvironment.get_Driver();
        driver.get(Common.FRONTEND_URL);
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        PageFactory.initElements(driver, aboutUsPage);
        return aboutUsPage;
    }
}
