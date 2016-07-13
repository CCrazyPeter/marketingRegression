package com.IntegrativeNutrition.Marketing.Tests.Web;

import org.testng.annotations.Test;
import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;
import com.IntegrativeNutrition.Marketing.Global.Common;
import com.IntegrativeNutrition.Marketing.Pages.HealthCoachingPage;
import com.IntegrativeNutrition.Marketing.Pages.Screens;
import org.testng.Assert;



public class HealthCoachingTest extends TestStarter {

	//This test ensures the banner is displayed  
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertBannerIsDisplayed ()  throws Exception {
    	HealthCoachingPage healthCoachingPage = Screens.HealthCoachingPage();
    	Assert.assertTrue(healthCoachingPage.verifyBannerIsDisplayed());
    }
    
	//This test ensures the header banner text is displayed  
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertBannerTextIsDisplayed ()  throws Exception {
    	HealthCoachingPage healthCoachingPage = Screens.HealthCoachingPage();
    	Assert.assertTrue(healthCoachingPage.verifyBannerTextIsDisplayed());
    }
    
	//This test ensures the "World need health coaches" section is displayed  
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertWorldNeedsHealthCoachesIsDisplayed ()  throws Exception {
    	HealthCoachingPage healthCoachingPage = Screens.HealthCoachingPage();
    	Assert.assertTrue(healthCoachingPage.verifyWorldNeedsHealthCoachesIsDisplayed());
    }

	//This test ensures the "Health Coaching Is Right For You" section is displayed  
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertHealthCoachingIsRightForYouIsDisplayed ()  throws Exception {
    	HealthCoachingPage healthCoachingPage = Screens.HealthCoachingPage();
    	Assert.assertTrue(healthCoachingPage.verifyHealthCoachingIsRightForYouIsDisplayed());
    }



    //This test is to ensure video plays until the end
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void videoPlay() throws Exception {
    	HealthCoachingPage healthCoachingPage = Screens.HealthCoachingPage();
    	healthCoachingPage.clickWatchVideo();
    	Assert.assertTrue(healthCoachingPage.verifyVideoPlayback());
    	healthCoachingPage.closeModal();
    }
	

	//Tests form won't submit if name field is blank
	@Test (groups = {"web.critical", "web"}, priority = 1)
    public void nameValidation() throws Exception {
    	HealthCoachingPage healthCoachingPage = Screens.HealthCoachingPage();
    	
    	healthCoachingPage.inputEmail("iinqatest@gmail.com");
    	healthCoachingPage.clickSubmitButton();
        healthCoachingPage.assertCorrectURL(Common.FRONTEND_URL + "/health-coaching");

    }

	//Tests that form won't submit if email field is blank
	@Test (groups = {"web.critical", "web"}, priority = 1) 
    public void emailValidation() throws Exception {
    	HealthCoachingPage healthCoachingPage = Screens.HealthCoachingPage();
    	
    	healthCoachingPage.inputName("qaTest");
    	healthCoachingPage.clickSubmitButton();
        healthCoachingPage.assertCorrectURL(Common.FRONTEND_URL + "/health-coaching");

    }

	//Tests that flags match country code using United Kingdom
	@Test (groups = {"web.critical", "web"}, priority = 1) 
    public void countryFlagMatch() throws Exception {
    	HealthCoachingPage healthCoachingPage = Screens.HealthCoachingPage();
    	
    	healthCoachingPage.inputName("qaTest");
    	healthCoachingPage.inputEmail("iinqatest@gmail.com");
    	healthCoachingPage.clickPhoneBox();
    	healthCoachingPage.selectFlag();
        healthCoachingPage.clickUnitedKingdomFlag();
        healthCoachingPage.enterPhoneNumber("7712345678");

        Assert.assertTrue(healthCoachingPage.verifyAreaCodeMatchesFlag());

    }
	
	//Submit Curriculum Guide form with no phone number
	@Test (groups = {"web.critical", "web"}, priority = 1) 
    public void submitFormNoPhone() {
    	HealthCoachingPage healthCoachingPage = Screens.HealthCoachingPage();
    	
		healthCoachingPage.inputName("QATEST");
		healthCoachingPage.inputEmail("iinqatest@gmail.com");
		healthCoachingPage.clickSubmitButton();
    }

	//Submit Curriculum Guide form with phone number
	@Test (groups = {"web.critical", "web"}, priority = 1)
    public void submitFormWithPhone() {
    	HealthCoachingPage healthCoachingPage = Screens.HealthCoachingPage();
    	
    	healthCoachingPage.inputName("QATEST");
    	healthCoachingPage.inputEmail("iinqatest@gmail.com");
    	healthCoachingPage.clickPhoneBox();
    	healthCoachingPage.enterPhoneNumber("2127305433");
    	healthCoachingPage.clickSubmitButton();
    }

}

