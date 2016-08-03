package com.IntegrativeNutrition.Marketing.Tests.Web;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.IntegrativeNutrition.Marketing.Global.Common;
import com.IntegrativeNutrition.Marketing.Pages.*;
import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;

public class BlogTest extends TestStarter {

	//This test ensures the banner is displayed
    @Test (groups = {"web.critical", "web", "beforemerge", "fasttest", "beforedeploy"}, priority = 38)
    public void bannerDisplayed() throws Exception {
        BlogElements blogElements = Screens.BlogElements();
        blogElements.closePromo();
    	Assert.assertTrue(blogElements.verifyBannerIsDisplayed());
    }

	//This test ensures the banner text is displayed
    @Test (groups = {"web.critical", "web", "beforemerge", "fasttest", "beforedeploy"}, priority = 39)
    public void assertBannerTextIsDisplayed() throws Exception {
        BlogElements blogElements = Screens.BlogElements();
        blogElements.closePromo();
    	Assert.assertTrue(blogElements.verifyBannerTextIsDisplayed());
    }

	//This test ensures the latest post is displayed
    @Test (groups = {"web.critical", "web", "beforedeploy", "fasttest"}, priority = 40)
    public void assertLatestsPostIsDisplayed() throws Exception {
        BlogElements blogElements = Screens.BlogElements();
        blogElements.closePromo();
    	Assert.assertTrue(blogElements.verifyLatestsPostIsDisplayed());
    }
    
	//This test ensures the recent posts is displayed
    @Test (groups = {"web.critical", "web", "beforedeploy", "fasttest"}, priority = 41)
    public void assertRecentPostsIsDisplayed() throws Exception {
        BlogElements blogElements = Screens.BlogElements();
        blogElements.closePromo();
    	Assert.assertTrue(blogElements.verifyRecentPostsIsDisplayed());
    }
    
	//Tests form won't submit if name field is blank
	@Test (groups = {"web", "afterproduction", "slowtest", "beforedeploy"}, priority = 42)
    public void nameValidation() throws Exception {
    	BlogElements blogElements = Screens.BlogElements();
    	blogElements.closePromo();
    	blogElements.inputEmail("iinqatest@gmail.com");
    	blogElements.clickSubmitButton();
        blogElements.assertCorrectURL(Common.FRONTEND_URL + "/");
    }

	//Tests that form won't submit if email field is blank
	@Test (groups = {"web", "afterproduction", "slowtest", "beforedeploy"}, priority = 43) 
    public void emailValidation() throws Exception {
    	BlogElements blogElements = Screens.BlogElements();
    	blogElements.closePromo();
    	blogElements.inputName("qaTest");
    	blogElements.clickSubmitButton();
        blogElements.assertCorrectURL(Common.FRONTEND_URL + "/");
    }
	
	//Tests that form won't submit if email is invalid
	@Test (groups = {"web", "afterproduction", "slowtest", "beforedeploy"}, priority = 44) 
    public void invalidEmailNoPhoneValidation() throws Exception {
    	BlogElements blogElements = Screens.BlogElements();
    	blogElements.closePromo();
    	blogElements.inputName("qaTest");
    	blogElements.inputEmail("NotARealEmail@ThisIsAFakeAddress.do");
    	blogElements.clickSubmitButton();
        blogElements.assertCorrectURL(Common.FRONTEND_URL + "/");
    }
	
	//Tests that form won't submit if email is invalid
	@Test (groups = {"web", "afterproduction", "slowtest", "beforedeploy"}, priority = 45) 
    public void invalidEmailPhoneValidation() throws Exception {
    	BlogElements blogElements = Screens.BlogElements();
    	blogElements.closePromo();
    	blogElements.inputName("qaTest");
    	blogElements.inputEmail("NotARealEmail@ThisIsAFakeAddress.do");
    	blogElements.clickPhoneBox();
        blogElements.enterPhoneNumber("7712345678");    	
    	blogElements.clickSubmitButton();
        blogElements.assertCorrectURL(Common.FRONTEND_URL + "/");
    }
	
	//Tests that form won't submit if all fields are blank
	@Test (groups = {"web", "afterproduction", "slowtest", "beforedeploy"}, priority = 46) 
    public void blankFieldsNoPhoneValidation() throws Exception {
    	BlogElements blogElements = Screens.BlogElements();
    	blogElements.closePromo();
    	blogElements.inputName("");
    	blogElements.inputEmail("");
    	blogElements.clickSubmitButton();
        blogElements.assertCorrectURL(Common.FRONTEND_URL + "/");
    }

	//Tests that form won't submit if all fields are blank
	@Test (groups = {"web", "afterproduction", "slowtest", "beforedeploy"}, priority = 47) 
    public void blankFieldsPhoneValidation() throws Exception {
    	BlogElements blogElements = Screens.BlogElements();
    	blogElements.closePromo();
    	blogElements.inputName("");
    	blogElements.inputEmail("");
    	blogElements.clickPhoneBox();
        blogElements.enterPhoneNumber("");    	
    	blogElements.clickSubmitButton();
        blogElements.assertCorrectURL(Common.FRONTEND_URL + "/");
    }

	//Tests that form won't submit if phone is invalid
	@Test (groups = {"web", "afterproduction", "slowtest"}, priority = 48) 
    public void phoneValidation() throws Exception {
    	BlogElements blogElements = Screens.BlogElements();
    	blogElements.closePromo();
    	blogElements.inputName("qaTest");
    	blogElements.inputEmail("iinqatest@gmail.com");
    	blogElements.clickPhoneBox();
        blogElements.enterPhoneNumber("111111111");    	
    	blogElements.clickSubmitButton();
        blogElements.assertCorrectURL(Common.FRONTEND_URL + "/");
    }

	//Tests that flags match country code using United Kingdom
	@Test (groups = {"web.critical", "web", "beforedeploy.ui", "slowtest"}, priority = 49) 
    public void countryFlagMatch() throws Exception {
    	BlogElements blogElements = Screens.BlogElements();
    	blogElements.closePromo();
    	blogElements.inputName("qaTest");
    	blogElements.inputEmail("iinqatest@gmail.com");
    	blogElements.clickPhoneBox();
    	blogElements.selectFlag();
        blogElements.clickUnitedKingdomFlag();
        blogElements.enterPhoneNumber("7712345678");

        Assert.assertTrue(blogElements.verifyAreaCodeMatchesFlag());
    }
	
	//Submit Sample Class form with no phone number
	@Test (groups = {"web.critical", "web", "beforedeploy", "slowtest"}, priority = 50) 
    public void submitFormNoPhone() {
    	BlogElements blogElements = Screens.BlogElements();
    	blogElements.closePromo();
		blogElements.inputName("QATEST");
		blogElements.inputEmail("iinqatest@gmail.com");
		blogElements.clickSubmitButton();
    	blogElements.assertCorrectURL(Common.FRONTEND_URL + "/guide-thank-you?sid=");
    }

	//Submit Sample Class form with phone number
	@Test (groups = {"web.critical", "web", "beforedeploy", "slowtest"}, priority = 51)
    public void submitFormWithPhone() {
    	BlogElements blogElements = Screens.BlogElements();
    	blogElements.closePromo();
    	blogElements.inputName("QATEST");
    	blogElements.inputEmail("iinqatest@gmail.com");
    	blogElements.clickPhoneBox();
    	blogElements.enterPhoneNumber("2127305433");
    	blogElements.clickSubmitButton();
    	blogElements.assertCorrectURL(Common.FRONTEND_URL + "/guide-thank-you?sid=");
    }

}


