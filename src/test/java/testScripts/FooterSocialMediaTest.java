package testScripts;

import objectRepository.Footer;

import org.junit.Assert;
import org.junit.Test;

import setUpClasses.DriverInitialization;

import java.util.Iterator;
import java.util.Set;

public class FooterSocialMediaTest extends DriverInitialization {

    //*** This section is to test that all social media & sub menu links go to their respective pages on click **********************
/*
    @Test
    public void footerOpenSocialMedia() {
        Footer.clickFacebookIcon();
        Footer.clickTwitterIcon();
        //Footer.clickTumblerIcon();
        Footer.clickyouTubeIcon();
        Footer.clickLinkedInIcon();
        //Footer.clickVineIcon();
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
/*
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
/*
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
*/
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
    
    }
    */
    @Test //Get Social
    public void footerOpenGetSocial() {
        Footer.clickFacebookIcon();
        Footer.clickInstagramIcon();
        Footer.clickTwitterIcon();
        Footer.clickyouTubeIcon();
        Footer.clickpinterestIcon();
        Footer.clickLinkedInIcon();
        Footer.clickGPlusIcon();
        Footer.clickAmazonIcon();

        Set<String> tabs = driver.getWindowHandles();
        Iterator<String> subFooter = tabs.iterator();
        String home = subFooter.next();
        String facebook = subFooter.next();
        String instagram = subFooter.next();
        String twitter = subFooter.next();
        String youtube = subFooter.next();
        String pinterest = subFooter.next();
        String linkedIn = subFooter.next();
        String gPlus = subFooter.next();
        String amazon = subFooter.next();

        //Facebook Icon
        driver.switchTo().window(facebook);
        String currentUrlFB = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlFB, "https://www.facebook.com/NutritionSchool");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Instagram Icon
        driver.switchTo().window(instagram);
        String currentUrlInst = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlInst, "https://www.instagram.com/NUTRITIONSCHOOL/");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Twitter Icon
        driver.switchTo().window(twitter);
        String currentUrlTwit = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlTwit, "https://twitter.com/NutritionSchool");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Youtube Icon
        driver.switchTo().window(youtube);
        String currentUrlYou = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlYou, "https://www.youtube.com/c/instituteforintegrativenutrition");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Pinterest Icon
        driver.switchTo().window(pinterest);
        String currentUrlPint = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlPint, "https://www.pinterest.com/nutritionschool/");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //LinkedIn Icon
        driver.switchTo().window(linkedIn);
        String currentUrlLink = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlLink, "https://www.linkedin.com/company/902375?trk=NUS_CMPY_TWIT");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Google Plus Icon
        driver.switchTo().window(gPlus);
        String currentUrlGplus = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlGplus, "https://plus.google.com/+InstituteforIntegrativeNutrition/posts");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Amazon Icon
        driver.switchTo().window(amazon);
        String currentUrlAmaz = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlAmaz, "https://www.amazon.com/s?marketplaceID=ATVPDKIKX0DER&me=A388GKFOEEICY0&merchant=A388GKFOEEICY0&redirect=true");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
