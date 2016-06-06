package testScripts;

import objectRepository.AboutUsPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import setUpClasses.DriverInitialization;
import java.util.concurrent.TimeUnit;

public class AboutUsTests extends DriverInitialization {

    @Before
    public void openHomepage() {
        driver.get("www.integrativenutrition.com/about-us");
    }

    @Test //This test is to ensure video plays until the end
    public void videoPlay() {
        AboutUsPage.watchVideo();
        driver.manage().timeouts().implicitlyWait(136, TimeUnit.SECONDS);
        driver.switchTo().frame("media-youtube-lrkty-uqnjy");
        String videoElapsed = AboutUsPage.videoElapsed.getText();
        boolean videoComplete = videoElapsed.contains("2:14");
        try {
            Assert.assertTrue(videoComplete);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
