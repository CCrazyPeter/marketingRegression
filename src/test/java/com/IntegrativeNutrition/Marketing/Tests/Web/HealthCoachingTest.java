package com.IntegrativeNutrition.Marketing.Tests.Web;

import org.testng.annotations.Test;
import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;
import com.IntegrativeNutrition.Marketing.Pages.*;
import org.testng.Assert;



public class HealthCoachingTest extends TestStarter {


	//Tests form won't submit if name field is blank
	@Test (groups = {"web.critical", "web"}, priority = 1)
    public void nameValidation() throws Exception {
    	HealthCoachingPage healthCoachingPage = Screens.HealthCoachingPage();
    	
        Forms.inputEmail("iinqatest@gmail.com");
        Forms.clickSubmitButton();
        healthCoachingPage.assertCorrectURL("http://www.integrativenutrition.com/health-coaching");

    }

	//Tests that form won't submit if email field is blank
	@Test (groups = {"web.critical", "web"}, priority = 1) 
    public void emailValidation() throws Exception {
    	HealthCoachingPage healthCoachingPage = Screens.HealthCoachingPage();
    	
        Forms.inputName("qaTest");
        Forms.clickSubmitButton();
        healthCoachingPage.assertCorrectURL("http://www.integrativenutrition.com/health-coaching");

    }

	//Tests that flags match country code using United Kingdom
	@Test (groups = {"web.critical", "web"}, priority = 1) 
    public void countryFlagMatch() throws Exception {
    	HealthCoachingPage healthCoachingPage = Screens.HealthCoachingPage();
    	
        Forms.inputName("qaTest");
        Forms.inputEmail("hcoachTest@qatest.edu");
        Forms.clickPhoneBox();
        Forms.selectFlag();
        healthCoachingPage.clickUnitedKingdomFlag();
        Forms.enterPhoneNumber("1111111111");
        Forms.clickSubmitButton();
        String phoneValue = Forms.getPhoneValue();
        boolean ukFlag = phoneValue.contains("44");
        try {
            Assert.assertTrue(ukFlag);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //This test is to ensure video plays until the end
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void videoPlay() throws Exception {
    	HealthCoachingPage healthCoachingPage = Screens.HealthCoachingPage();
    	healthCoachingPage.clickWatchVideo();
    	healthCoachingPage.verifyVideoPlayback();
    	healthCoachingPage.closeModal();
    }
	
	//Submit Curriculum Guide form with no phone number
	@Test (groups = {"web.critical", "web"}, priority = 1) 
    public void submitFormNoPhone() {
        Forms.inputName("QATEST");
        Forms.inputEmail("iinqatest@gmail.com");
        Forms.clickSubmitButton();
    }

	//Submit Curriculum Guide form with phone number
	@Test (groups = {"web.critical", "web"}, priority = 1)
    public void submitFormWithPhone() {
        Forms.inputName("QATEST");
        Forms.inputEmail("iinqatest@gmail.com");
        Forms.clickPhoneBox();
        Forms.enterPhoneNumber("2127305433");
        Forms.clickSubmitButton();
    }

}

