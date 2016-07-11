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
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertBannerIsDisplayed ()  throws Exception {
    	PaidLeadGen sampleNutritionClassPage = Screens.SampleNutritionClassPage();
    	
    	Assert.assertTrue(sampleNutritionClassPage.verifyBannerIsDisplayed());
    }

    
    //Tests form won't submit if name field is blank
    @Test (groups = {"web.critical", "web"}, priority = 1) 
    public void nameValidation() throws Exception{
    	PaidLeadGen sampleNutritionClassPage = Screens.SampleNutritionClassPage();
    	
        Forms.inputEmail("iinqatest@gmail.com");
        Forms.clickSubmitButton();    
        sampleNutritionClassPage.assertCorrectURL(Common.FRONTEND_URL + "/info-nutritioneducation");

    }

    //Tests that form won't submit if email field is blank
    @Test (groups = {"web.critical", "web"}, priority = 1) 
    public void emailValidation() throws Exception{
    	PaidLeadGen sampleNutritionClassPage = Screens.SampleNutritionClassPage();
    	
        Forms.inputName("qaTest");
        Forms.clickSubmitButton();
        sampleNutritionClassPage.assertCorrectURL(Common.FRONTEND_URL + "/info-nutritioneducation");
    }

    //Tests that flags match country code using Fiji
    @Test (groups = {"web.critical", "web"}, priority = 1) 
    public void countryFlagMatch() throws Exception{
    	PaidLeadGen sampleNutritionClassPage = Screens.SampleNutritionClassPage();
    	
        Forms.selectFlag();
        sampleNutritionClassPage.clickFijiFlag();
        Forms.enterPhoneNumber("1111111111");
        Forms.clickSubmitButton();
        String phoneValue = Forms.getPhoneValue();
        boolean fijiFlag = phoneValue.contains("679");
        try {
            AssertJUnit.assertTrue(fijiFlag);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //Tests that form submits properly
    @Test (groups = {"web.critical", "web"}, priority = 1) 
    public void formSubmit() throws Exception{
    	PaidLeadGen sampleNutritionClassPage = Screens.SampleNutritionClassPage();
    	
        Forms.inputName("qaTest");
        Forms.inputEmail("iinqatest@gmail.com");
        Forms.clickSubmitButton();
        sampleNutritionClassPage.assertCorrectURL(Common.FRONTEND_URL + "/class-thank-you?sid=");

    }

    /**************************************************************
     * http://www.integrativenutrition.com/info-nutritioneducation-r
     **************************************************************/

    //Tests if banner is displayed
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void bannerDisplayedR() throws Exception{
    	PaidLeadGen sampleNutritionClassPage_r = Screens.SampleNutritionClassPage_r();
    	
    	sampleNutritionClassPage_r.verifyBannerIsDisplayed();
    }

    
    //Tests form won't submit if name field is blank
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void nameValidationR() throws Exception{
    	PaidLeadGen sampleNutritionClassPage_r = Screens.SampleNutritionClassPage_r();
    	
        Forms.inputEmail("iinqatest@gmail.com");
        Forms.clickSubmitButton();
        sampleNutritionClassPage_r.assertCorrectURL(Common.FRONTEND_URL + "/info-nutritioneducation-r");
    }

    
    //Tests that form won't submit if email field is blank
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void emailValidationR() throws Exception{
    	PaidLeadGen sampleNutritionClassPage_r = Screens.SampleNutritionClassPage_r();
        Forms.inputName("qaTest");
        Forms.clickSubmitButton();
        sampleNutritionClassPage_r.assertCorrectURL(Common.FRONTEND_URL + "/info-nutritioneducation-r");
    }

    //Tests that flags match country code using Jamaica
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void countryFlagMatchR() throws Exception{
    	PaidLeadGen sampleNutritionClassPage_r = Screens.SampleNutritionClassPage_r();
        Forms.clickPhoneBox();
        Forms.selectFlag();
        sampleNutritionClassPage_r.clickJamaicaFlag();
        Forms.enterPhoneNumber("1111111111");
        Forms.clickSubmitButton();
        String phoneValue = Forms.getPhoneValue();
        boolean jamiacaFlag = phoneValue.contains("876");
        try {
            AssertJUnit.assertTrue(jamiacaFlag);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Tests that form submits properly
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void formSubmitR() throws Exception{
    	PaidLeadGen sampleNutritionClassPage_r = Screens.SampleNutritionClassPage_r();
        Forms.inputName("qaTest");
        Forms.inputEmail("iinqatest@gmail.com");
        Forms.clickSubmitButton();
        sampleNutritionClassPage_r.assertCorrectURL(Common.FRONTEND_URL + "/class-thank-you?sid=");
    }

    /**************************************************************
     * http://www.integrativenutrition.com/info-nutritioneducation-d
     **************************************************************/

    //Tests if banner is displayed
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void bannerDisplayedD() throws Exception{
    	PaidLeadGen sampleNutritionClassPage_d = Screens.SampleNutritionClassPage_d();
    	
    	sampleNutritionClassPage_d.verifyBannerIsDisplayed();
    }

    
    //Tests form won't submit if name field is blank
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void nameValidationD() throws Exception{
    	PaidLeadGen sampleNutritionClassPage_d = Screens.SampleNutritionClassPage_d();
    	
        Forms.inputEmail("iinqatest@gmail.com");
        Forms.clickSubmitButton();
        sampleNutritionClassPage_d.assertCorrectURL(Common.FRONTEND_URL + "/info-nutritioneducation-d");
    }

    //Tests that form won't submit if email field is blank
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void emailValidationD() throws Exception{
    	PaidLeadGen sampleNutritionClassPage_d = Screens.SampleNutritionClassPage_d();
    	
        Forms.inputName("qaTest");
        Forms.clickSubmitButton();    
        sampleNutritionClassPage_d.assertCorrectURL(Common.FRONTEND_URL + "/info-nutritioneducation-d");
    }

    //Tests that flags match country code using Uruguay
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void countryFlagMatchD() throws Exception{
    	PaidLeadGen sampleNutritionClassPage_d = Screens.SampleNutritionClassPage_d();
        Forms.selectFlag();
        sampleNutritionClassPage_d.clickUruguayFlag();
        Forms.enterPhoneNumber("1111111111");
        Forms.clickSubmitButton();
        String phoneValue = Forms.getPhoneValue();
        boolean uruguayFlag = phoneValue.contains("598");
        try {
            AssertJUnit.assertTrue(uruguayFlag);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Tests that form submits properly
    public void formSubmitD() {
    	PaidLeadGen sampleNutritionClassPage_d = Screens.SampleNutritionClassPage_d();
        Forms.inputName("qaTest");
        Forms.inputEmail("qatesting@qatest.edu");
        Forms.clickSubmitButton();
        sampleNutritionClassPage_d.assertCorrectURL(Common.FRONTEND_URL + "/class-thank-you?sid=");
    }

    }





