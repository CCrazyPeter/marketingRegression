package testScripts;

import org.testng.annotations.BeforeMethod;
import setUpClasses.DriverInitialization;

public class AboutUsTest extends DriverInitialization {

    @BeforeMethod
	public void openHomepage() {
        driver.get("www.integrativenutrition.com/about-us");
    }
    

/*    @Test //This test is to ensure video plays until the end
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
*/
}
