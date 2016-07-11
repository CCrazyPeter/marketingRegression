package com.IntegrativeNutrition.Marketing.Tests.Web;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.IntegrativeNutrition.Marketing.Global.Common;
import com.IntegrativeNutrition.Marketing.Pages.*;
import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;


public class InfoSessionTest extends TestStarter {

	//Tests form won't submit if name field is blank
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void nameValidation() throws Exception{
        InfoSessionsPage infoSessionsPage = Screens.InfoSessionsPage();
        
        Forms.inputEmail("iinqatest@gmail.com");
        Forms.clickSubmitButton();
        infoSessionsPage.assertCorrectURL(Common.FRONTEND_URL + "/info-sessions");
    }

  //Tests that form won't submit if email field is blank
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void emailValidation() throws Exception{
        InfoSessionsPage infoSessionsPage = Screens.InfoSessionsPage();
        
        Forms.inputName("qaTest");
        Forms.clickSubmitButton();
        infoSessionsPage.assertCorrectURL(Common.FRONTEND_URL + "/info-sessions");
 
    }

  //Tests that flags match country code using Cyprus
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void countryFlagMatch() throws Exception {
        InfoSessionsPage infoSessionsPage = Screens.InfoSessionsPage();
        
        infoSessionsPage.inputName("qaTest");
        infoSessionsPage.inputEmail("iinqatest@gmail.com");
        infoSessionsPage.selectFlag();
        infoSessionsPage.clickCyprusFlag();
        infoSessionsPage.enterPhoneNumber("22123456");
        infoSessionsPage.clickSubmitButton();

        Assert.assertTrue(infoSessionsPage.verifyAreaCodeMatchesFlag());

        
    }    
}