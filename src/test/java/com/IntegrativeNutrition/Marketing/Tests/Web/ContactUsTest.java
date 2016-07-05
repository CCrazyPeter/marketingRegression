package com.IntegrativeNutrition.Marketing.Tests.Web;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.IntegrativeNutrition.Marketing.Pages.ContactUsPage;
import com.IntegrativeNutrition.Marketing.Pages.Forms;
import com.IntegrativeNutrition.Marketing.Pages.Screens;
import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;

public class ContactUsTest  extends TestStarter{

	//This test ensures the banner is displayed  
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertBannerIsDisplayed ()  throws Exception {
    	ContactUsPage contactUsPage = Screens.ContactUsPage();
    	Assert.assertTrue(contactUsPage.verifyBannerIsDisplayed());
    }

	//This test ensures the banner is displayed  
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
        
        Forms.inputName("qaTest");
        Forms.inputEmail("iinqatest@gmail.com");
        Forms.enterPhoneNumber("8099521818");
        Forms.fillTextBox("You Can Help Me By Passing This Test");
        Forms.clickSubmitButton();
        contactUsPage.assertCorrectURL("http://www.integrativenutrition.com/contact-thank-you?sid=");
    }    
    
}
