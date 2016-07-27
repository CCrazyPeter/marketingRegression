package com.IntegrativeNutrition.Marketing.Tests.Web;

import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;
import com.IntegrativeNutrition.Marketing.Global.Common;
import com.IntegrativeNutrition.Marketing.Pages.*;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;


public class PaidLeadTest extends TestStarter {

//*** These tests are for the Paid Lead Gen pages

    /**************************************************************
     * http://www.integrativenutrition.com/info-nutritioneducation
     **************************************************************/
	
	//This test ensures the banner is displayed  
    @Test (groups = {"web.critical", "web", "beforedeploy", "fasttest"}, priority = 1)
    public void assertBannerIsDisplayed ()  throws Exception {
    	PaidLeadGen sampleNutritionClassPage = Screens.SampleNutritionClassPage();
    	
    	Assert.assertTrue(sampleNutritionClassPage.verifyBannerIsDisplayed());
    }

    //Tests form won't submit if name field is blank
    @Test (groups = {"web", "afterproduction", "fasttest"}, priority = 1) 
    public void nameValidation() throws Exception{
    	PaidLeadGen sampleNutritionClassPage = Screens.SampleNutritionClassPage();
    	
    	sampleNutritionClassPage.inputEmail("iinqatest@gmail.com");
    	sampleNutritionClassPage.clickSubmitButton();    
        sampleNutritionClassPage.assertCorrectURL(Common.FRONTEND_URL + "/info-nutritioneducation");

    }

    //Tests that form won't submit if email field is blank
    @Test (groups = {"web", "afterproduction", "fasttest"}, priority = 1) 
    public void emailValidation() throws Exception{
    	PaidLeadGen sampleNutritionClassPage = Screens.SampleNutritionClassPage();
    	
    	sampleNutritionClassPage.inputName("qaTest");
    	sampleNutritionClassPage.clickSubmitButton();
        sampleNutritionClassPage.assertCorrectURL(Common.FRONTEND_URL + "/info-nutritioneducation");
    }

    //Tests that flags match country code using Fiji
    @Test (groups = {"web.critical", "web", "beforedeploy", "fasttest"}, priority = 1) 
    public void countryFlagMatch() throws Exception{
    	PaidLeadGen sampleNutritionClassPage = Screens.SampleNutritionClassPage();
    	
    	sampleNutritionClassPage.selectFlag();
        sampleNutritionClassPage.clickFijiFlag();
        sampleNutritionClassPage.enterPhoneNumber("1111111111");
        sampleNutritionClassPage.clickSubmitButton();
        String phoneValue = sampleNutritionClassPage.getPhoneValue();
        boolean fijiFlag = phoneValue.contains("679");
        try {
            AssertJUnit.assertTrue(fijiFlag);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //Tests that form submits properly
    @Test (groups = {"web.critical", "web", "beforedeploy", "fasttest"}, priority = 1) 
    public void formSubmit() throws Exception{
    	PaidLeadGen sampleNutritionClassPage = Screens.SampleNutritionClassPage();
    	
    	sampleNutritionClassPage.inputName("qaTest");
    	sampleNutritionClassPage.inputEmail("iinqatest@gmail.com");
    	sampleNutritionClassPage.clickSubmitButton();
        sampleNutritionClassPage.assertCorrectURL(Common.FRONTEND_URL + "/class-thank-you?sid=");

    }

    /**************************************************************
     * http://www.integrativenutrition.com/info-nutritioneducation-r
     **************************************************************/

    //Tests if banner is displayed
    @Test (groups = {"web.critical", "web", "beforedeploy", "fasttest"}, priority = 1)
    public void bannerDisplayedR() throws Exception{
    	PaidLeadGen sampleNutritionClassPage_r = Screens.SampleNutritionClassPage_r();
    	
    	sampleNutritionClassPage_r.verifyBannerIsDisplayed();
    }

    
    //Tests form won't submit if name field is blank
    @Test (groups = {"web", "afterproduction", "fasttest"}, priority = 1)
    public void nameValidationR() throws Exception{
    	PaidLeadGen sampleNutritionClassPage_r = Screens.SampleNutritionClassPage_r();
    	
    	sampleNutritionClassPage_r.inputEmail("iinqatest@gmail.com");
    	sampleNutritionClassPage_r.clickSubmitButton();
        sampleNutritionClassPage_r.assertCorrectURL(Common.FRONTEND_URL + "/info-nutritioneducation-r");
    }

    
    //Tests that form won't submit if email field is blank
    @Test (groups = {"web", "afterproduction", "fasttest"}, priority = 1)
    public void emailValidationR() throws Exception{
    	PaidLeadGen sampleNutritionClassPage_r = Screens.SampleNutritionClassPage_r();
    	sampleNutritionClassPage_r.inputName("qaTest");
    	sampleNutritionClassPage_r.clickSubmitButton();
        sampleNutritionClassPage_r.assertCorrectURL(Common.FRONTEND_URL + "/info-nutritioneducation-r");
    }

    //Tests that flags match country code using Jamaica
    @Test (groups = {"web.critical", "web", "beforedeploy", "fasttest"}, priority = 1)
    public void countryFlagMatchR() throws Exception{
    	PaidLeadGen sampleNutritionClassPage_r = Screens.SampleNutritionClassPage_r();
    	sampleNutritionClassPage_r.clickPhoneBox();
    	sampleNutritionClassPage_r.selectFlag();
        sampleNutritionClassPage_r.clickJamaicaFlag();
        sampleNutritionClassPage_r.enterPhoneNumber("1111111111");
        sampleNutritionClassPage_r.clickSubmitButton();
        String phoneValue = sampleNutritionClassPage_r.getPhoneValue();
        boolean jamiacaFlag = phoneValue.contains("876");
        try {
            AssertJUnit.assertTrue(jamiacaFlag);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Tests that form submits properly
    @Test (groups = {"web.critical", "web", "beforedeploy", "fasttest"}, priority = 1)
    public void formSubmitR() throws Exception{
    	PaidLeadGen sampleNutritionClassPage_r = Screens.SampleNutritionClassPage_r();
    	sampleNutritionClassPage_r.inputName("qaTest");
    	sampleNutritionClassPage_r.inputEmail("iinqatest@gmail.com");
    	sampleNutritionClassPage_r.clickSubmitButton();
        sampleNutritionClassPage_r.assertCorrectURL(Common.FRONTEND_URL + "/class-thank-you?sid=");
    }

    /**************************************************************
     * http://www.integrativenutrition.com/info-nutritioneducation-d
     **************************************************************/

    //Tests if banner is displayed
    @Test (groups = {"web.critical", "web", "beforedeploy", "fasttest"}, priority = 1)
    public void bannerDisplayedD() throws Exception{
    	PaidLeadGen sampleNutritionClassPage_d = Screens.SampleNutritionClassPage_d();
    	
    	sampleNutritionClassPage_d.verifyBannerIsDisplayed();
    }

    
    //Tests form won't submit if name field is blank
    @Test (groups = {"web", "afterproduction", "fasttest"}, priority = 1)
    public void nameValidationD() throws Exception{
    	PaidLeadGen sampleNutritionClassPage_d = Screens.SampleNutritionClassPage_d();
    	
    	sampleNutritionClassPage_d.inputEmail("iinqatest@gmail.com");
    	sampleNutritionClassPage_d.clickSubmitButton();
        sampleNutritionClassPage_d.assertCorrectURL(Common.FRONTEND_URL + "/info-nutritioneducation-d");
    }

    //Tests that form won't submit if email field is blank
    @Test (groups = {"web", "afterproduction", "fasttest"}, priority = 1)
    public void emailValidationD() throws Exception{
    	PaidLeadGen sampleNutritionClassPage_d = Screens.SampleNutritionClassPage_d();
    	
    	sampleNutritionClassPage_d.inputName("qaTest");
    	sampleNutritionClassPage_d.clickSubmitButton();    
        sampleNutritionClassPage_d.assertCorrectURL(Common.FRONTEND_URL + "/info-nutritioneducation-d");
    }

    //Tests that flags match country code using Uruguay
    @Test (groups = {"web.critical", "web", "beforedeploy", "fasttest"}, priority = 1)
    public void countryFlagMatchD() throws Exception{
    	PaidLeadGen sampleNutritionClassPage_d = Screens.SampleNutritionClassPage_d();
    	sampleNutritionClassPage_d.selectFlag();
        sampleNutritionClassPage_d.clickUruguayFlag();
        sampleNutritionClassPage_d.enterPhoneNumber("1111111111");
        sampleNutritionClassPage_d.clickSubmitButton();
        String phoneValue = sampleNutritionClassPage_d.getPhoneValue();
        boolean uruguayFlag = phoneValue.contains("598");
        try {
            AssertJUnit.assertTrue(uruguayFlag);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Tests that form submits properly
    @Test (groups = {"web.critical", "web", "beforedeploy", "fasttest"}, priority = 1)
    public void formSubmitD() {
    	PaidLeadGen sampleNutritionClassPage_d = Screens.SampleNutritionClassPage_d();
    	sampleNutritionClassPage_d.inputName("qaTest");
    	sampleNutritionClassPage_d.inputEmail("qatesting@qatest.edu");
    	sampleNutritionClassPage_d.clickSubmitButton();
        sampleNutritionClassPage_d.assertCorrectURL(Common.FRONTEND_URL + "/class-thank-you?sid=");
    }

    }





