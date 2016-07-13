package com.IntegrativeNutrition.Marketing.Tests.Web;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.IntegrativeNutrition.Marketing.Global.Common;
import com.IntegrativeNutrition.Marketing.Pages.*;
import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;

public class BlogTest extends TestStarter {

	//This test ensures the banner is displayed
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void bannerDisplayed() throws Exception {
        BlogElements blogElements = Screens.BlogElements();
    	Assert.assertTrue(blogElements.verifyBannerIsDisplayed());
    }

	//This test ensures the banner text is displayed
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertBannerTextIsDisplayed() throws Exception {
        BlogElements blogElements = Screens.BlogElements();
    	Assert.assertTrue(blogElements.verifyBannerTextIsDisplayed());
    }
    
	//This test ensures the latest post is displayed
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertLatestsPostIsDisplayed() throws Exception {
        BlogElements blogElements = Screens.BlogElements();
    	Assert.assertTrue(blogElements.verifyLatestsPostIsDisplayed());
    }
    
	//This test ensures the recent posts is displayed
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertRecentPostsIsDisplayed() throws Exception {
        BlogElements blogElements = Screens.BlogElements();
    	Assert.assertTrue(blogElements.verifyRecentPostsIsDisplayed());
    }
    
	//Tests form won't submit if name field is blank
	@Test (groups = {"web.critical", "web"}, priority = 1)
    public void nameValidation() throws Exception {
    	BlogElements blogElements = Screens.BlogElements();
    	
    	blogElements.inputEmail("iinqatest@gmail.com");
    	blogElements.clickSubmitButton();
        blogElements.assertCorrectURL(Common.FRONTEND_URL + "/");
    }

	//Tests that form won't submit if email field is blank
	@Test (groups = {"web.critical", "web"}, priority = 1) 
    public void emailValidation() throws Exception {
    	BlogElements blogElements = Screens.BlogElements();
    	
    	blogElements.inputName("qaTest");
    	blogElements.clickSubmitButton();
        blogElements.assertCorrectURL(Common.FRONTEND_URL + "/");
    }
	
	//Tests that form won't submit if email is invalid
	@Test (groups = {"web.critical", "web"}, priority = 1) 
    public void invalidEmailNoPhoneValidation() throws Exception {
    	BlogElements blogElements = Screens.BlogElements();
    	
    	blogElements.inputName("qaTest");
    	blogElements.inputEmail("NotARealEmail@ThisIsAFakeAddress.do");
    	blogElements.clickSubmitButton();
        blogElements.assertCorrectURL(Common.FRONTEND_URL + "/");
    }
	
	//Tests that form won't submit if email is invalid
	@Test (groups = {"web.critical", "web"}, priority = 1) 
    public void invalidEmailPhoneValidation() throws Exception {
    	BlogElements blogElements = Screens.BlogElements();
    	
    	blogElements.inputName("qaTest");
    	blogElements.inputEmail("NotARealEmail@ThisIsAFakeAddress.do");
    	blogElements.clickPhoneBox();
        blogElements.enterPhoneNumber("7712345678");    	
    	blogElements.clickSubmitButton();
        blogElements.assertCorrectURL(Common.FRONTEND_URL + "/");
    }
	
	//Tests that form won't submit if all fields are blank
	@Test (groups = {"web.critical", "web"}, priority = 1) 
    public void blankFieldsNoPhoneValidation() throws Exception {
    	BlogElements blogElements = Screens.BlogElements();
    	blogElements.inputName("");
    	blogElements.inputEmail("");
    	blogElements.clickSubmitButton();
        blogElements.assertCorrectURL(Common.FRONTEND_URL + "/");
    }

	//Tests that form won't submit if all fields are blank
	@Test (groups = {"web.critical", "web"}, priority = 1) 
    public void blankFieldsPhoneValidation() throws Exception {
    	BlogElements blogElements = Screens.BlogElements();
    	blogElements.inputName("");
    	blogElements.inputEmail("");
    	blogElements.clickPhoneBox();
        blogElements.enterPhoneNumber("");    	
    	blogElements.clickSubmitButton();
        blogElements.assertCorrectURL(Common.FRONTEND_URL + "/");
    }
	
	//Tests that form won't submit if phone is invalid
	@Test (groups = {"web.critical", "web"}, priority = 1) 
    public void phoneValidation() throws Exception {
    	BlogElements blogElements = Screens.BlogElements();
    	blogElements.inputName("qaTest");
    	blogElements.inputEmail("iinqatest@gmail.com");
    	blogElements.clickPhoneBox();
        blogElements.enterPhoneNumber("111111111");    	
    	blogElements.clickSubmitButton();
        blogElements.assertCorrectURL(Common.FRONTEND_URL + "/");
    }
	
	//Tests that flags match country code using United Kingdom
	@Test (groups = {"web.critical", "web"}, priority = 1) 
    public void countryFlagMatch() throws Exception {
    	BlogElements blogElements = Screens.BlogElements();
    	
    	blogElements.inputName("qaTest");
    	blogElements.inputEmail("iinqatest@gmail.com");
    	blogElements.clickPhoneBox();
    	blogElements.selectFlag();
        blogElements.clickUnitedKingdomFlag();
        blogElements.enterPhoneNumber("7712345678");

        Assert.assertTrue(blogElements.verifyAreaCodeMatchesFlag());
    }
	
	//Submit Sample Class form with no phone number
	@Test (groups = {"web.critical", "web"}, priority = 1) 
    public void submitFormNoPhone() {
    	BlogElements blogElements = Screens.BlogElements();
    	
		blogElements.inputName("QATEST");
		blogElements.inputEmail("iinqatest@gmail.com");
		blogElements.clickSubmitButton();
    	blogElements.assertCorrectURL(Common.FRONTEND_URL + "/guide-thank-you?sid=");
    }

	//Submit Sample Class form with phone number
	@Test (groups = {"web.critical", "web"}, priority = 1)
    public void submitFormWithPhone() {
    	BlogElements blogElements = Screens.BlogElements();
    	
    	blogElements.inputName("QATEST");
    	blogElements.inputEmail("iinqatest@gmail.com");
    	blogElements.clickPhoneBox();
    	blogElements.enterPhoneNumber("2127305433");
    	blogElements.clickSubmitButton();
    	blogElements.assertCorrectURL(Common.FRONTEND_URL + "/guide-thank-you?sid=");
    }

    /* COMMENTED BECAUSE THERE SEEMS TO BE A PROBLEM IN THE BLOG PAGE AND THIS 
     * BUTTON IS NOT SHOWING SO I HAVE NO WAY OF GETTING THE XPATH TO THIS ELEMENT
    @Test //Tests that the load more button is displayed at the bottom of the page
    public void loadMoreDisplayed() {
        boolean loadMore = BlogElements.seeMore.isDisplayed();
        try {
            Assert.assertTrue(loadMore);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

}


