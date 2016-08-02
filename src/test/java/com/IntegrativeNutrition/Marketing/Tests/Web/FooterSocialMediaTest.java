package com.IntegrativeNutrition.Marketing.Tests.Web;

import com.IntegrativeNutrition.Marketing.Pages.Footer;
import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;
import com.IntegrativeNutrition.Marketing.Pages.Screens;
import org.testng.annotations.*;
import org.testng.Assert;

public class FooterSocialMediaTest extends TestStarter {

    //Need Help Info Local Phone
    @Test (groups = {"web.critical", "web", "beforemerge", "fasttest","beforedeploy"}, priority = 1)
    public void assertLocalPhoneNumberIsDisplayed() throws Exception {
        Footer footer = Screens.Footer();
        footer.closePromo();
        Assert.assertTrue(footer.verifyLocalPhoneNumberIsDisplayed());
    }

    //Need Help Info International Phone
    @Test (groups = {"web.critical", "web", "beforemerge", "fasttest","beforedeploy"}, priority = 2)
    public void assertInternationalPhoneNumberIsDisplayed() throws Exception {
        Footer footer = Screens.Footer();
        footer.closePromo();
        Assert.assertTrue(footer.verifyInternationalPhoneNumberIsDisplayed());
    }

	//Tests correct form submission
	@Test (groups = {"web.critical", "web", "beforemerge", "slowtest","beforedeploy"}, priority = 3) 
    public void assertFormSubmissionWorks() throws Exception {
    	Footer footer = Screens.Footer();
    	footer.closePromo();
    	footer.inputEmail("iinqatest@gmail.com");
    	footer.clickSubscribe();
    	footer.formConfirmationDisplayed("thank you for joining the mission – check your inbox for the latest from integrative nutrition!");
	}

	//Tests form submission no email
	@Test (groups = {"web.critical", "web", "beforedeploy", "slowtest"}, priority = 4) 
    public void assertFormSubmissionNoEmailWorks() throws Exception {
    	Footer footer = Screens.Footer();
    	footer.closePromo();
    	footer.inputEmail("");
    	footer.clickSubscribe();
    	footer.formMessageDisplayed("email field is required.");
	}

	//Tests form submission invalid email
	@Test (groups = {"web.critical", "web", "beforedeploy", "slowtest"}, priority = 5) 
    public void assertFormSubmissionInvalidEmailWorks() throws Exception {
    	Footer footer = Screens.Footer();
    	footer.closePromo();
    	footer.inputEmail("fgvbhjnkl");
    	footer.clickSubscribe();
    	footer.formMessageDisplayed("the value in email is not a valid email address.");
	}

	//Tests form submission inactive email
	@Test (groups = {"web.critical", "web", "beforedeploy", "slowtest"}, priority = 6) 
    public void assertFormSubmissionInactiveEmailWorks() throws Exception {
    	Footer footer = Screens.Footer();
    	footer.closePromo();
    	footer.inputEmail("NotAnActiveEmail@justatestemailaddress.com");
    	footer.clickSubscribe();
    	footer.formMessageDisplayed("please enter an active email address.");
	}
	
	
	
    /***************************************
     * This section is to test that all social media & sub menu links go to their respective pages on click
     ***************************************/

    //Amazon Icon Link
    @Test (groups = {"web.critical", "web", "beforedeploy", "fasttest"}, priority = 7)
    public void assertCorrectAmazonLinkIcon() throws Exception {
        Footer footer = Screens.Footer();
        footer.closePromo();
        footer.clickAmazonIcon();
        
        Assert.assertTrue(footer.assertCorrectURL("https://www.amazon.com/s?marketplaceID=ATVPDKIKX0DER&me=A388GKFOEEICY0&merchant=A388GKFOEEICY0&redirect=true", false, true));
        
    }
	
    //Facebook Icon Link
    @Test (groups = {"web.critical", "web", "beforedeploy", "fasttest"}, priority = 8)
    public void assertCorrectFacebookLinkIcon() throws Exception {
        Footer footer = Screens.Footer();
        footer.closePromo();
        footer.clickFacebookIcon();
        Assert.assertTrue(footer.assertCorrectURL("https://www.facebook.com/NutritionSchool", false, true));
    }

    //Instagram Icon Link
    @Test (groups = {"web.critical", "web", "beforedeploy", "fasttest"}, priority = 9)
    public void assertCorrectInstagramLinkIcon() throws Exception {
        Footer footer = Screens.Footer();
        footer.closePromo();
        footer.clickInstagramIcon();
        Assert.assertTrue(footer.assertCorrectURL("https://www.instagram.com/NUTRITIONSCHOOL/", false, true));
    }

    //Twitter Icon Link
    @Test (groups = {"web.critical", "web", "beforedeploy", "fasttest"}, priority = 10)
    public void assertCorrectTwitterLinkIcon() throws Exception {
        Footer footer = Screens.Footer();
        footer.closePromo();
        footer.clickTwitterIcon();
        Assert.assertTrue(footer.assertCorrectURL("https://twitter.com/NutritionSchool", false, true));
    }

    //YouTube Icon Link
    @Test (groups = {"web.critical", "web", "beforedeploy", "fasttest"}, priority = 11)
    public void assertCorrectYouTubeLinkIcon() throws Exception {
        Footer footer = Screens.Footer();
        footer.closePromo();
        footer.clickYouTubeIcon();
        Assert.assertTrue(footer.assertCorrectURL("https://www.youtube.com/c/instituteforintegrativenutrition", false, true));
    }

    //Pinterest Icon Link
    @Test (groups = {"web.critical", "web", "beforedeploy", "fasttest"}, priority = 12)
    public void assertCorrectPinterestLinkIcon() throws Exception {
        Footer footer = Screens.Footer();
        footer.closePromo();
        footer.clickPinterestIcon();
        Assert.assertTrue(footer.assertCorrectURL("https://www.pinterest.com/nutritionschool/", false, true));
    }

    //LinkedIn Icon Link
    @Test (groups = {"web.critical", "web", "beforedeploy", "fasttest"}, priority = 13)
    public void assertCorrectLinkedInLinkIcon() throws Exception {
        Footer footer = Screens.Footer();
        footer.closePromo();
        footer.clickLinkedInIcon();
        Assert.assertTrue(footer.assertCorrectURL("https://www.linkedin.com/company/902375?trk=NUS_CMPY_TWIT", false, true));
    }

    //Google Plus Icon Link
    @Test (groups = {"web.critical", "web", "beforedeploy", "fasttest"}, priority = 14)
    public void assertCorrectGooglePlusLinkIcon() throws Exception {
        Footer footer = Screens.Footer();
        footer.closePromo();
        footer.clickGPlusIcon();
        Assert.assertTrue(footer.assertCorrectURL("https://plus.google.com/+InstituteforIntegrativeNutrition/posts", false, true));
    }


}
