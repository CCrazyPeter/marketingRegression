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

	//This test ensures the header banner text is displayed  
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertBannerTextIsDisplayed ()  throws Exception {
    	ContactUsPage contactUsPage = Screens.ContactUsPage();
    	Assert.assertTrue(contactUsPage.verifyBannerTextIsDisplayed());
    }
    
	//This test ensures the contact information is displayed  
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertContactInfoIsDisplayed ()  throws Exception {
    	ContactUsPage contactUsPage = Screens.ContactUsPage();
    	Assert.assertTrue(contactUsPage.verifycontactInformationIsDisplayed());
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
	
    
	//Submit form with all correct data
	@Test (groups = {"web.critical", "web"}, priority = 1) 
    public void submitForm() {
    	ContactUsPage contactUsPage = Screens.ContactUsPage();
    	
		contactUsPage.inputName("QATEST");
		contactUsPage.inputEmail("iinqatest@gmail.com");
    	contactUsPage.fillTextBox("You Can Help Me By Passing This Test");
        contactUsPage.enterPhoneNumber("7712345678");
		contactUsPage.clickSubmitButton();
    	contactUsPage.assertCorrectURL(Common.FRONTEND_URL + "/contact-thank-you?sid=");
    }
	
	//Tests form won't submit if inquiry field is blank
	@Test (groups = {"web.critical", "web"}, priority = 1)
    public void inquiryValidation() throws Exception {
    	ContactUsPage contactUsPage = Screens.ContactUsPage();
    	
    	contactUsPage.inputEmail("iinqatest@gmail.com");
    	contactUsPage.inputName("QATEST");
    	contactUsPage.fillTextBox("");
        contactUsPage.enterPhoneNumber("7712345678"); 
    	contactUsPage.clickSubmitButton();
        contactUsPage.assertCorrectURL(Common.FRONTEND_URL + "/contact-us");
    }
    
	//Tests form won't submit if name field is blank
	@Test (groups = {"web.critical", "web"}, priority = 1)
    public void nameValidation() throws Exception {
    	ContactUsPage contactUsPage = Screens.ContactUsPage();
    	
    	contactUsPage.inputEmail("iinqatest@gmail.com");
    	contactUsPage.inputName("");
    	contactUsPage.fillTextBox("You Can Help Me By Passing This Test");
        contactUsPage.enterPhoneNumber("7712345678"); 
    	contactUsPage.clickSubmitButton();
        contactUsPage.assertCorrectURL(Common.FRONTEND_URL + "/contact-us");
    }

	//Tests that form won't submit if email field is blank
	@Test (groups = {"web.critical", "web"}, priority = 1) 
    public void emailValidation() throws Exception {
    	ContactUsPage contactUsPage = Screens.ContactUsPage();
    	
    	contactUsPage.inputEmail("");
    	contactUsPage.inputName("qaTest");
    	contactUsPage.fillTextBox("You Can Help Me By Passing This Test");
        contactUsPage.enterPhoneNumber("7712345678"); 
    	contactUsPage.clickSubmitButton();
        contactUsPage.assertCorrectURL(Common.FRONTEND_URL + "/contact-us");
    }
	
	//Tests that form won't submit if email is invalid
	@Test (groups = {"web.critical", "web"}, priority = 1) 
    public void invalidEmailValidation() throws Exception {
    	ContactUsPage contactUsPage = Screens.ContactUsPage();
    	
    	contactUsPage.inputName("qaTest");
    	contactUsPage.inputEmail("NotARealEmail@ThisIsAFakeAddress.do");
    	contactUsPage.fillTextBox("You Can Help Me By Passing This Test");
        contactUsPage.enterPhoneNumber("7712345678"); 
    	contactUsPage.clickSubmitButton();
        contactUsPage.assertCorrectURL(Common.FRONTEND_URL + "/contact-us");
    }
	
	
	//Tests that form won't submit if email is inactive
	@Test (groups = {"web.critical", "web"}, priority = 1) 
    public void inactiveEmailValidation() throws Exception {
    	ContactUsPage contactUsPage = Screens.ContactUsPage();
    	
    	contactUsPage.inputName("qaTest");
    	contactUsPage.inputEmail("NotARealEmail@ThisIsAFakeAddress.do");
    	contactUsPage.fillTextBox("You Can Help Me By Passing This Test");
        contactUsPage.enterPhoneNumber("7712345678"); 
    	contactUsPage.clickSubmitButton();
        contactUsPage.assertCorrectURL(Common.FRONTEND_URL + "/contact-us");
    }
		
	//Tests that form won't submit if all fields are blank
	@Test (groups = {"web.critical", "web"}, priority = 1) 
    public void blankFieldsNoPhoneValidation() throws Exception {
    	ContactUsPage contactUsPage = Screens.ContactUsPage();
    	contactUsPage.inputName("");
    	contactUsPage.inputEmail("");
    	contactUsPage.fillTextBox("");
    	contactUsPage.enterPhoneNumber("");
    	contactUsPage.clickSubmitButton();
        contactUsPage.assertCorrectURL(Common.FRONTEND_URL + "/contact-us");
    }

	//Tests that form won't submit if phone is invalid
	@Test (groups = {"web.critical", "web"}, priority = 1) 
    public void invalidPhoneValidation() throws Exception {
    	ContactUsPage contactUsPage = Screens.ContactUsPage();
    	contactUsPage.inputName("qaTest");
    	contactUsPage.inputEmail("iinqatest@gmail.com");
    	contactUsPage.fillTextBox("You Can Help Me By Passing This Test");
        contactUsPage.enterPhoneNumber("111111111");    	
    	contactUsPage.clickSubmitButton();
        contactUsPage.assertCorrectURL(Common.FRONTEND_URL + "/contact-us");
    }
	
	
	//Submit form with no phone number
	@Test (groups = {"web.critical", "web"}, priority = 1) 
    public void submitFormNoPhone() throws Exception {
    	ContactUsPage contactUsPage = Screens.ContactUsPage();
    	contactUsPage.inputName("qaTest");
    	contactUsPage.inputEmail("iinqatest@gmail.com");
    	contactUsPage.fillTextBox("You Can Help Me By Passing This Test");
        contactUsPage.enterPhoneNumber("");    	
    	contactUsPage.clickSubmitButton();
        contactUsPage.assertCorrectURL(Common.FRONTEND_URL + "/contact-us");
    }
	

}
