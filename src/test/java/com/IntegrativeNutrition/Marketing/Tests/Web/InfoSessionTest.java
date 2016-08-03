package com.IntegrativeNutrition.Marketing.Tests.Web;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.IntegrativeNutrition.Marketing.Global.Common;
import com.IntegrativeNutrition.Marketing.Pages.*;
import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;


public class InfoSessionTest extends TestStarter {

	
	//This test ensures the banner is displayed  
    @Test (groups = {"web.critical", "web", "beforemerge", "fasttest","beforedeploy"}, priority = 106)
    public void assertBannerIsDisplayed ()  throws Exception {
    	InfoSessionsPage infoSessionsPage = Screens.InfoSessionsPage();
    	Assert.assertTrue(infoSessionsPage.verifyBannerIsDisplayed());
    }
    
	//This test ensures the header banner text is displayed  
    @Test (groups = {"web.critical", "web", "beforemerge", "fasttest","beforedeploy"}, priority = 107)
    public void assertBannerTextIsDisplayed ()  throws Exception {
    	InfoSessionsPage infoSessionsPage = Screens.InfoSessionsPage();
    	Assert.assertTrue(infoSessionsPage.verifyBannerTextIsDisplayed());
    }
    
	//Tests form won't submit if name field is blank
    @Test (groups = {"web", "afterproduction", "fasttest","beforedeploy"}, priority = 108)
    public void nameValidation() throws Exception{
        InfoSessionsPage infoSessionsPage = Screens.InfoSessionsPage();
        
        //infoSessionsPage.closePromoModal();
        infoSessionsPage.inputEmail("iinqatest@gmail.com");
        infoSessionsPage.clickSubmitButton();
        Assert.assertTrue(infoSessionsPage.assertCorrectURL(Common.FRONTEND_URL + "/info-sessions"));
    }

  //Tests that form won't submit if email field is blank
    @Test (groups = {"web", "afterproduction", "fasttest","beforedeploy"}, priority = 109)
    public void emailValidation() throws Exception{
        InfoSessionsPage infoSessionsPage = Screens.InfoSessionsPage();
        
        //infoSessionsPage.closePromoModal();
        infoSessionsPage.inputName("qaTest");
        infoSessionsPage.clickSubmitButton();
        Assert.assertTrue(infoSessionsPage.assertCorrectURL(Common.FRONTEND_URL + "/info-sessions"));
 
    }

  //Tests that flags match country code using Cyprus
    @Test (groups = {"web.critical", "web", "beforedeploy.ui", "fasttest"}, priority = 110)
    public void countryFlagMatch() throws Exception {
        InfoSessionsPage infoSessionsPage = Screens.InfoSessionsPage();
        
        //infoSessionsPage.closePromoModal();
        infoSessionsPage.inputName("qaTest");
        infoSessionsPage.inputEmail("iinqatest@gmail.com");
        infoSessionsPage.selectFlag();
        infoSessionsPage.clickCyprusFlag();
        infoSessionsPage.enterPhoneNumber("22123456");
        infoSessionsPage.clickSubmitButton();

        Assert.assertTrue(infoSessionsPage.verifyAreaCodeMatchesFlag());
        Assert.assertTrue(infoSessionsPage.assertCorrectURL(Common.FRONTEND_URL + "/webinars/Meet_The_Founder"));

    }    
}