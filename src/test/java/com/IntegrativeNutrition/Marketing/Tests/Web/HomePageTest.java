package testScripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import Pages.PaidLeadGen;
import setUpClasses.DriverInitialization;

public class HomePageTest extends DriverInitialization {

    @Test  //This test ensures the banner is displayed
    public void bannerDisplayed (){
        //driver.get("http://www.integrativenutrition.com");
        boolean bannerAppear = PaidLeadGen.headerBanner.isDisplayed();
        try {
            AssertJUnit.assertTrue(bannerAppear);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
/*
    @Test //This test is to ensure video plays until the end
    public void videoPlay () {
        driver.get("www.integrativenutrition.com");
        HomePage.clickWatchVideo();
        driver.manage().timeouts().implicitlyWait(115, TimeUnit.SECONDS);
        driver.switchTo().frame("media-youtube-e5ac7sou1s4");
        String videoElapsed = HomePage.videoElapsed.getText();
        boolean videoComplete = videoElapsed.contains("1:53");
        try {
            Assert.assertTrue(videoComplete);
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
*/
}
