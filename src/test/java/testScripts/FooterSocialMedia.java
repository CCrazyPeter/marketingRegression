package testScripts;

import objectRepository.Footer;
import org.junit.Assert;
import org.junit.Test;
import setUpClasses.DriverInitialization;
import java.util.Iterator;
import java.util.Set;

public class FooterSocialMedia extends DriverInitialization {

    //*** This section is to test that all social media & sub menu links go to their respective pages on click **********************

    @Test
    public void footerOpenSocialMedia() {
        Footer.clickFacebookIcon();
        Footer.clickTwitterIcon();
        Footer.clickTumblerIcon();
        Footer.clickyouTubeIcon();
        Footer.clickLinkedInIcon();
        Footer.clickVineIcon();
        Footer.clickGPlusIcon();
        Footer.clickAmazonIcon();

        Set<String> tabs = driver.getWindowHandles();
        Iterator<String> socialMedia = tabs.iterator();
        String home = socialMedia.next();
        String faceBook = socialMedia.next();
        String twitter = socialMedia.next();
        String tumbler = socialMedia.next();
        String youTube = socialMedia.next();
        String linkedIn = socialMedia.next();
        String vine = socialMedia.next();
        String googlePlus = socialMedia.next();
        String amazon = socialMedia.next();

        //Facebook
        driver.switchTo().window(faceBook);
        String currentUrlF = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlF, "https://www.facebook.com/NutritionSchool");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Twitter
        driver.switchTo().window(twitter);
        String currentUrlTwit = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlTwit, "https://twitter.com/NutritionSchool");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Tumbler
        driver.switchTo().window(tumbler);
        String currentUrlTum = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlTum, "http://integrativenutrition.tumblr.com/");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //YouTube
        driver.switchTo().window(youTube);
        String currentUrlYouTube = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlYouTube, "https://www.youtube.com/user/integrativenutrition");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //LinkedIn
        driver.switchTo().window(linkedIn);
        String currentUrlLinked = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlLinked, "https://www.linkedin.com/company/institute-for-integrative-nutrition?trk=NUS_CMPY_TWIT");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Vine
        driver.switchTo().window(vine);
        String currentUrlVine = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlVine, "https://vine.co/u/1194388372626505728?mode=grid");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Google Plus
        driver.switchTo().window(googlePlus);
        String currentUrlGPlus = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlGPlus, "https://plus.google.com/112542079191654541836/posts");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Amazon
        driver.switchTo().window(amazon);
        String currentUrlAmazon = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlAmazon, "http://www.amazon.com/s?marketplaceID=ATVPDKIKX0DER&me=A388GKFOEEICY0&merchant=A388GKFOEEICY0&redirect=true");
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*
        //Navigate back to the home window
        driver.switchTo().window(home);

        //verify SnapChat icon is displayed
        boolean isPresent = Footer.snapchatIcon.isDisplayed();
        try {
            Assert.assertTrue(isPresent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    */
    }

}
