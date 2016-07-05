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
    
    public static ContactUsPage ContactUsPage() {
        driver = TestEnvironment.get_Driver();
        driver.get(Common.FRONTEND_URL + "/contact-us");
        waitForLoad(driver);
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        PageFactory.initElements(driver, contactUsPage);
        return contactUsPage;
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
    
    public static HealthCoachingPage HealthCoachingPage() {
        driver = TestEnvironment.get_Driver();
        driver.get(Common.FRONTEND_URL + "/health-coaching");
        waitForLoad(driver);
        HealthCoachingPage healthCoachingPage = new HealthCoachingPage(driver);
        PageFactory.initElements(driver, healthCoachingPage);
        return healthCoachingPage;
    }
    
    public static InfoSessionsPage InfoSessionsPage() {
        driver = TestEnvironment.get_Driver();
        driver.get(Common.FRONTEND_URL + "/info-sessions");
        waitForLoad(driver);
        InfoSessionsPage infoSessionsPage = new InfoSessionsPage(driver);
        PageFactory.initElements(driver, infoSessionsPage);
        return infoSessionsPage;
    }
    
    public static SampleClassModulePage SampleClassModulePage() {
        driver = TestEnvironment.get_Driver();
        driver.get(Common.FRONTEND_URL + "/sample-class-module?sid=6041241");
        waitForLoad(driver);
        SampleClassModulePage sampleClassModulePage = new SampleClassModulePage(driver);
        PageFactory.initElements(driver, sampleClassModulePage);
        return sampleClassModulePage;
    }
    
    public static PaidLeadGen SampleNutritionClassPage() {
        driver = TestEnvironment.get_Driver();
        driver.get(Common.FRONTEND_URL + "/info-nutritioneducation");
        waitForLoad(driver);
        PaidLeadGen sampleNutritionClassPage = new PaidLeadGen(driver);
        PageFactory.initElements(driver, sampleNutritionClassPage);
        return sampleNutritionClassPage;
    }
    
    public static PaidLeadGen SampleNutritionClassPage_r() {
        driver = TestEnvironment.get_Driver();
        driver.get(Common.FRONTEND_URL + "/info-nutritioneducation-r");
        waitForLoad(driver);
        PaidLeadGen sampleNutritionClassPage_r = new PaidLeadGen(driver);
        PageFactory.initElements(driver, sampleNutritionClassPage_r);
        return sampleNutritionClassPage_r;
    }
    
    public static PaidLeadGen SampleNutritionClassPage_d() {
        driver = TestEnvironment.get_Driver();
        driver.get(Common.FRONTEND_URL + "/info-nutritioneducation-d");
        waitForLoad(driver);
        PaidLeadGen sampleNutritionClassPage_d = new PaidLeadGen(driver);
        PageFactory.initElements(driver, sampleNutritionClassPage_d);
        return sampleNutritionClassPage_d;
    }


}
