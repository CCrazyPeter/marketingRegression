package com.IntegrativeNutrition.Marketing.Tests.Web;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.IntegrativeNutrition.Marketing.Pages.*;
import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;


public class InfoSessionTest extends TestStarter {

	//Tests form won't submit if name field is blank
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void nameValidation() throws Exception{
        InfoSessionsPage infoSessionsPage = Screens.InfoSessionsPage();
        
        Forms.inputEmail("iinqatest@gmail.com");
        Forms.clickSubmitButton();
        infoSessionsPage.assertCorrectURL("http://www.integrativenutrition.com/info-sessions");
    }

  //Tests that form won't submit if email field is blank
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void emailValidation() throws Exception{
        InfoSessionsPage infoSessionsPage = Screens.InfoSessionsPage();
        
        Forms.inputName("qaTest");
        Forms.clickSubmitButton();
        infoSessionsPage.assertCorrectURL("http://www.integrativenutrition.com/info-sessions");
 
    }

  //Tests that flags match country code using Cyprus
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void countryFlagMatch() throws Exception {
        InfoSessionsPage infoSessionsPage = Screens.InfoSessionsPage();
        
        Forms.inputName("qaTest");
        Forms.inputEmail("iinqatest@gmail.com");
        Forms.selectFlag();
        infoSessionsPage.clickCyprusFlag();
        Forms.enterPhoneNumber("1111111111");
        Forms.clickSubmitButton();
        String phoneValue = Forms.getPhoneValue();
        boolean cyprusFlag = phoneValue.contains("357");
        try {
            Assert.assertTrue(cyprusFlag);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}

