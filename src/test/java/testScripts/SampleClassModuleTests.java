package testScripts;

import objectRepository.HomePage;
import objectRepository.SampleClassModulePage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import setUpClasses.DriverInitialization;

import java.util.concurrent.TimeUnit;

public class SampleClassModuleTests extends DriverInitialization {

    @Before
    public void openSCMpage() {
        driver.manage().deleteAllCookies();
        driver.get("http://www.integrativenutrition.com/sample-class-module");
    }

    @Test //This tests the banner being displayed
    public void bannerDisplayed() {
        boolean bannerAppear = SampleClassModulePage.SCMHeaderBanner.isDisplayed();
        try {
            Assert.assertTrue(bannerAppear);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //This test tests the first video module
    public void videoPlay() {
        SampleClassModulePage.clickWelcomeVideo();
        driver.manage().timeouts().implicitlyWait(110, TimeUnit.SECONDS);
        //driver.switchTo().frame("media-youtube-e5ac7sou1s4");
        /*
        String videoElapsed = SampleClassModulePage.videoElapsed.getText();
        boolean videoComplete = videoElapsed.contains("1:48");
        try {
            Assert.assertTrue(videoComplete);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    */
    }
    }


