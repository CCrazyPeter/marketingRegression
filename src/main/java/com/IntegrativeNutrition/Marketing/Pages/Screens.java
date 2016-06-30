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
    
    public static HomePage HomePage() {
        driver = TestEnvironment.get_Driver();
        driver.get(Common.FRONTEND_URL);
        waitForLoad(driver);
        HomePage homePage = new HomePage(driver);
        PageFactory.initElements(driver, homePage);
        return homePage;
    }
    
    public static Header Header() {
        driver = TestEnvironment.get_Driver();
        driver.get(Common.FRONTEND_URL);
        waitForLoad(driver);
        Header header = new Header(driver);
        PageFactory.initElements(driver, header);
        return header;
    }
    
    public static BlogElements BlogElements() {
        driver = TestEnvironment.get_Driver();
        driver.get(Common.FRONTEND_URL + "/blog");
        waitForLoad(driver);
        BlogElements blogElement = new BlogElements(driver);
        PageFactory.initElements(driver, blogElement);
        return blogElement;
    }
    
    public static CurriculumPage CurriculumPage() {
        driver = TestEnvironment.get_Driver();
        driver.get(Common.FRONTEND_URL + "/curriculum");
        waitForLoad(driver);
        CurriculumPage curriculumPage = new CurriculumPage(driver);
        PageFactory.initElements(driver, curriculumPage);
        return curriculumPage;
    }

    public static ThankYouPages GuideThankYou() {
        driver = TestEnvironment.get_Driver();
        driver.get(Common.FRONTEND_URL + "/guide-thank-you");
        waitForLoad(driver);
        ThankYouPages guideThankYou = new ThankYouPages(driver);
        PageFactory.initElements(driver, guideThankYou);
        return guideThankYou;
    }
    
    public static ThankYouPages ClassThankYou() {
        driver = TestEnvironment.get_Driver();
        driver.get(Common.FRONTEND_URL + "/class-thank-you");
        waitForLoad(driver);
        ThankYouPages classThankYou = new ThankYouPages(driver);
        PageFactory.initElements(driver, classThankYou);
        return classThankYou;
    }
    
}
