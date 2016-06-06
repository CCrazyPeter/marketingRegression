package testScripts;

import objectRepository.CurriculumPage;
import objectRepository.Forms;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import setUpClasses.DriverInitialization;

import java.util.concurrent.TimeUnit;

public class CurriculumPageTests extends DriverInitialization {

    @Before
    public void openHomepage() {
        driver.get("http://www.integrativenutrition.com/curriculum");
    }
/*
    @Test //This test is to ensure video plays until the end
    public void videoPlay() {
        CurriculumPage.playVideo();
        driver.manage().timeouts().implicitlyWait(147, TimeUnit.SECONDS);
        driver.switchTo().frame("media-youtube-8f0lea1ov4q");
        String videoElapsed = CurriculumPage.videoElapsed.getText();
        boolean videoComplete = videoElapsed.contains("2:24");
        try {
            Assert.assertTrue(videoComplete);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
*/
    @Test //Submit Curriculum Guide form with no phone number
    public void submitFormNoPhone() {
        Forms.inputName("curriculumTest");
        Forms.inputEmail("curriculumNoPhone@qatest.edu");
        Forms.clickSubmitButton();
    }

    @Test //Submit Curriculum Guide form with phone number
    public void submitFormWithPhone() {
        Forms.inputName("curriculumTest");
        Forms.inputEmail("curriculumWithPhone@qatest.edu");
        Forms.clickPhoneBox();
        Forms.enterPhoneNumber("2127305433");
        Forms.clickSubmitButton();
    }
/*
    @Test //Test Privacy Link goes to correct url
    public void testPrivacyPolicy() {
        CurriculumPage.clickPrivacyLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/lp/privacypolicy");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
*/
}
