package com.IntegrativeNutrition.Marketing.Tests.Web;


import com.IntegrativeNutrition.Marketing.Pages.Footer;
import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;
import com.IntegrativeNutrition.Marketing.Pages.Screens;
import org.testng.annotations.*;
import org.testng.Assert;

public class FooterSocialMediaTest extends TestStarter {

    /***************************************
     * This section is to test that all social media & sub menu links go to their respective pages on click
     ***************************************/

    //Facebook Icon Link
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertCorrectFacebookLinkIcon() throws Exception {
        Footer footer = Screens.Footer();

        footer.clickFacebookIcon();
        Assert.assertTrue(footer.assertCorrectURL("https://www.facebook.com/NutritionSchool", true));
    }

    //Instagram Icon Link
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertCorrectInstagramLinkIcon() throws Exception {
        Footer footer = Screens.Footer();

        footer.clickInstagramIcon();
        Assert.assertTrue(footer.assertCorrectURL("https://www.instagram.com/NUTRITIONSCHOOL/", true));
    }

    //Twitter Icon Link
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertCorrectTwitterLinkIcon() throws Exception {
        Footer footer = Screens.Footer();

        footer.clickTwitterIcon();
        Assert.assertTrue(footer.assertCorrectURL("https://twitter.com/NutritionSchool", true));
    }

    //YouTube Icon Link
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertCorrectYouTubeLinkIcon() throws Exception {
        Footer footer = Screens.Footer();

        footer.clickYouTubeIcon();
        Assert.assertTrue(footer.assertCorrectURL("https://www.youtube.com/c/instituteforintegrativenutrition", true));
    }

    //Pinterest Icon Link
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertCorrectPinterestLinkIcon() throws Exception {
        Footer footer = Screens.Footer();

        footer.clickPinterestIcon();
        Assert.assertTrue(footer.assertCorrectURL("https://www.pinterest.com/nutritionschool/", true));
    }

    //LinkedIn Icon Link
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertCorrectLinkedInLinkIcon() throws Exception {
        Footer footer = Screens.Footer();

        footer.clickLinkedInIcon();
        Assert.assertTrue(footer.assertCorrectURL("https://www.linkedin.com/company/902375?trk=NUS_CMPY_TWIT", true));
    }

    //Google Plus Icon Link
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertCorrectGooglePlusLinkIcon() throws Exception {
        Footer footer = Screens.Footer();

        footer.clickGPlusIcon();
        Assert.assertTrue(footer.assertCorrectURL("https://plus.google.com/+InstituteforIntegrativeNutrition/posts", true));
    }

    //Amazon Icon Link
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertCorrectAmazonLinkIcon() throws Exception {
        Footer footer = Screens.Footer();

        footer.clickAmazonIcon();
        Assert.assertTrue(footer.assertCorrectURL("https://www.amazon.com/s?marketplaceID=ATVPDKIKX0DER&me=A388GKFOEEICY0&merchant=A388GKFOEEICY0&redirect=true", true));
    }
}
