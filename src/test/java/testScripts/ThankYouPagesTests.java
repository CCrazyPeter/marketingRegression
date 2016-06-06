package testScripts;

import objectRepository.ThankYouPages;
import org.junit.Assert;
import org.junit.Test;
import setUpClasses.DriverInitialization;

import java.util.concurrent.TimeUnit;

public class ThankYouPagesTests extends DriverInitialization {

    /*******************************************************************************************
     * http://www.integrativenutrition.com/class-thank-you
     *******************************************************************************************/

    @Test
    public void classTyBanner() {
        driver.get("http://www.integrativenutrition.com/class-thank-you");
            boolean bannerAppear = ThankYouPages.headerBanner.isDisplayed();
            try {
                Assert.assertTrue(bannerAppear);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    @Test //This test is to ensure video plays until the end
    public void classTyPlay() {
        driver.get("http://www.integrativenutrition.com/class-thank-you");
        ThankYouPages.watchVideo();
        driver.manage().timeouts().implicitlyWait(147, TimeUnit.SECONDS);
        driver.switchTo().frame("media-youtube-8f0lea1ov4q");
        String videoElapsed = ThankYouPages.videoElapsed.getText();
        boolean videoComplete = videoElapsed.contains("2:24");
        try {
            Assert.assertTrue(videoComplete);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
        /*******************************************************************************************
         * http://www.integrativenutrition.com/guide-thank-you
         *******************************************************************************************/

        @Test
        public void guideTyBanner() {
            driver.get("http://www.integrativenutrition.com/guide-thank-you");
            boolean bannerAppear = ThankYouPages.headerBanner.isDisplayed();
            try {
                Assert.assertTrue(bannerAppear);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Test //This test is to ensure video plays until the end
        public void guideTyPlay() {
            driver.get("http://www.integrativenutrition.com/guide-thank-you");
            ThankYouPages.watchVideo();
            driver.manage().timeouts().implicitlyWait(122, TimeUnit.SECONDS);
            driver.switchTo().frame("media-youtube-snlfol2uu-g");
            String videoElapsed = ThankYouPages.videoElapsed.getText();
            boolean videoComplete = videoElapsed.contains("2:00");
            try {
                Assert.assertTrue(videoComplete);
            } catch (Exception e) {
                e.printStackTrace();
            }
    }




}
