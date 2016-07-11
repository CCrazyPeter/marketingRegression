package com.IntegrativeNutrition.Marketing.Tests.Web;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.IntegrativeNutrition.Marketing.Global.Common;
import com.IntegrativeNutrition.Marketing.Pages.ContactUsPage;
import com.IntegrativeNutrition.Marketing.Pages.Screens;
import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;

public class ContactUsTest  extends TestStarter{

	//This test ensures the banner is displayed  
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertBannerIsDisplayed ()  throws Exception {
    	ContactUsPage contactUsPage = Screens.ContactUsPage();
    	Assert.assertTrue(contactUsPage.verifyBannerIsDisplayed());
    }

	//This test ensures "let's connect" is displayed  
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertLetsConnectIsDisplayed ()  throws Exception {
    	ContactUsPage contactUsPage = Screens.ContactUsPage();
    	Assert.assertTrue(contactUsPage.verifyLetsConnectIsDisplayed());
    }
	
	//This test ensures the banner is displayed  
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertContactInformationIsDisplayed ()  throws Exception {
    	ContactUsPage contactUsPage = Screens.ContactUsPage();
    	Assert.assertTrue(contactUsPage.verifycontactInformationIsDisplayed());
    }
	
    //Test Form Submission
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void verifyForm() throws Exception {
    	ContactUsPage contactUsPage = Screens.ContactUsPage();
        
    	ContactUsPage.inputName("qaTest");
    	ContactUsPage.inputEmail("iinqatest@gmail.com");
    	ContactUsPage.enterPhoneNumber("8099521818");
    	ContactUsPage.fillTextBox("You Can Help Me By Passing This Test");
    	ContactUsPage.clickSubmitButton();
        contactUsPage.assertCorrectURL(Common.FRONTEND_URL + "/contact-thank-you?sid=");
    }    
    
}
