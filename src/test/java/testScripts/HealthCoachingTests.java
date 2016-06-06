package testScripts;

import objectRepository.Forms;
import objectRepository.HealthCoachingPage;
import objectRepository.HomePage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setUpClasses.DriverInitialization;

import java.util.concurrent.TimeUnit;

public class HealthCoachingTests extends DriverInitialization {

    @Before
    public void openInfoSess() {
        driver.get("http://www.integrativenutrition.com/health-coaching");
        driver.manage().deleteAllCookies();
    }

    @Test //Tests form won't submit if name field is blank
    public void nameValidation() {
        Forms.inputEmail("hCoachTest@qatest.edu");
        Forms.clickSubmitButton();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/health-coaching");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Tests that form won't submit if email field is blank
    public void emailValidation() {
        Forms.inputName("qaTest");
        Forms.clickSubmitButton();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/health-coaching");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Tests that flags match country code using United Kingdom
    public void countryFlagMatch() {
        Forms.inputName("qaTest");
        Forms.inputEmail("hcoachTest@qatest.edu");
        Forms.clickPhoneBox();
        Forms.selectFlag();
        WebElement unitedKingdom = driver.findElement(By.xpath(".//*[@id='webform-component-Home-Phone--c']/div[1]/div/ul/li[5]/span[1]"));
        unitedKingdom.click();
        Forms.enterPhoneNumber("1111111111");
        Forms.clickSubmitButton();
        String phoneValue = Forms.formPhone.getAttribute("value");
        boolean ukFlag = phoneValue.contains("44");
        try {
            Assert.assertTrue(ukFlag);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //This test is to ensure video plays until the end
    public void videoPlay() {
        HealthCoachingPage.watchVideo();
        driver.manage().timeouts().implicitlyWait(118, TimeUnit.SECONDS);
        driver.switchTo().frame("media-youtube-aivruz1uyqe");
        String videoElapsed = HealthCoachingPage.videoElapsed.getText();
        boolean videoComplete = videoElapsed.contains("1:56");
        try {
            Assert.assertTrue(videoComplete);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Submit Curriculum Guide form with no phone number
    public void submitFormNoPhone() {
        Forms.inputName("hCoachTest");
        Forms.inputEmail("hCoach@qatest.edu");
        Forms.clickSubmitButton();
    }

    @Test //Submit Curriculum Guide form with phone number
    public void submitFormWithPhone() {
        Forms.inputName("hCoachTest");
        Forms.inputEmail("hCoach@qatest.edu");
        Forms.clickPhoneBox();
        Forms.enterPhoneNumber("2127305433");
        Forms.clickSubmitButton();
    }

    @Test //Test Privacy Link goes to correct url
    public void testPrivacyPolicy() {
        HealthCoachingPage.clickPrivacyLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/lp/privacypolicy");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

