package com.IntegrativeNutrition.Marketing.Tests.Web;

import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;
import com.IntegrativeNutrition.Marketing.Global.Common;
import com.IntegrativeNutrition.Marketing.Pages.HomePage;
import com.IntegrativeNutrition.Marketing.Pages.Screens;
import org.testng.annotations.*;
import org.testng.Assert;

public class HomePageTest extends TestStarter {

	//This test ensures the banner is displayed  
    @Test (groups = {"web.critical", "web", "beforemerge", "fasttest","beforedeploy"}, priority = 0)
    public void assertBannerIsDisplayed ()  throws Exception {
        HomePage homePage = Screens.HomePage();
        homePage.closePromo();
    	Assert.assertTrue(homePage.verifyBannerIsDisplayed());
    }

	//This test ensures the header banner text is displayed  
    @Test (groups = {"web.critical", "web", "beforemerge", "fasttest","beforedeploy"}, priority = 1)
    public void assertBannerTextIsDisplayed ()  throws Exception {
        HomePage homePage = Screens.HomePage();
        homePage.closePromo();
    	Assert.assertTrue(homePage.verifyBannerTextIsDisplayed());
    }

	//This test ensures the Watch Our Video button is displayed  
    @Test (groups = {"web.critical", "web", "beforemerge", "fasttest","beforedeploy"}, priority = 2)
    public void assertWatchOurVideoIsPresent ()  throws Exception {
        HomePage homePage = Screens.HomePage();
        homePage.closePromo();
    	Assert.assertTrue(homePage.verifyWatchOurVideoIsPresent());
    }

	//This test ensures the Sample Our Program button is displayed  
    @Test (groups = {"web.critical", "web", "beforemerge", "fasttest","beforedeploy"}, priority = 3)
    public void assertSampleOurProgramIsPresent ()  throws Exception {
        HomePage homePage = Screens.HomePage();
        homePage.closePromo();
    	Assert.assertTrue(homePage.verifySampleOurProgramIsPresent());
    }

	//This test ensures the Body Copy is present  
    @Test (groups = {"web", "beforemerge", "fasttest","beforedeploy"}, priority = 4)
    public void assertBodyCopyIsPresent ()  throws Exception {
        HomePage homePage = Screens.HomePage();
        homePage.closePromo();
    	Assert.assertTrue(homePage.verifyBodyCopyIsPresent());
    }
    
	//This test ensures the SlideShow is present  
    @Test (groups = {"web", "beforedeploy", "fasttest"}, priority = 5)
    public void assertSlideShowIsPresent ()  throws Exception {
        HomePage homePage = Screens.HomePage();
        homePage.closePromo();
    	Assert.assertTrue(homePage.verifySlideShowIsDisplayed());
    }

    //This test ensures the Sample Our Program button triggers a page scroll to the Sample Class form   
    @Test (groups = {"web", "beforedeploy", "fasttest"}, priority = 6)
    public void assertSampleProgramButtonTriggersScroll () throws Exception {
        HomePage homePage = Screens.HomePage();
        homePage.closePromo();
    	homePage.clickSampleProgram();
    	Assert.assertTrue(homePage.assertPageScrolledDown());
    }
    
    //This test is to ensure video plays until the end
    @Test (groups = {"web", "beforedeploy.ui", "slowtest"}, priority = 7)
    public void videoPlay() throws Exception {
    	HomePage homePage = Screens.HomePage();
        homePage.closePromo();
        homePage.clickWatchVideo();
        Assert.assertTrue(homePage.verifyVideoPlayback());
        homePage.closeModal();
    }
    
	//Tests form won't submit if name field is blank
	@Test (groups = {"web", "afterproduction", "fasttest","beforedeploy"}, priority = 8)
    public void nameValidation() throws Exception {
    	HomePage homePage = Screens.HomePage();
        homePage.closePromo();
    	
    	homePage.inputEmail("iinqatest@gmail.com");
    	homePage.clickSubmitButton();
        homePage.assertCorrectURL(Common.FRONTEND_URL + "/");
    }

	//Tests that form won't submit if email field is blank
	@Test (groups = {"web", "afterproduction", "fasttest","beforedeploy"}, priority = 9) 
    public void emailValidation() throws Exception {
    	HomePage homePage = Screens.HomePage();
        homePage.closePromo();
    	
    	homePage.inputName("qaTest");
    	homePage.clickSubmitButton();
        homePage.assertCorrectURL(Common.FRONTEND_URL + "/");
    }
	
	//Tests that form won't submit if email is invalid
	@Test (groups = {"web", "afterproduction", "fasttest","beforedeploy"}, priority = 10) 
    public void invalidEmailNoPhoneValidation() throws Exception {
    	HomePage homePage = Screens.HomePage();
        homePage.closePromo();
        
    	homePage.inputName("qaTest");
    	homePage.inputEmail("NotARealEmail@ThisIsAFakeAddress.do");
    	homePage.clickSubmitButton();
        homePage.assertCorrectURL(Common.FRONTEND_URL + "/");
    }
	
	//Tests that form won't submit if email is invalid
	@Test (groups = {"web", "afterproduction", "fasttest","beforedeploy"}, priority = 11) 
    public void invalidEmailPhoneValidation() throws Exception {
    	HomePage homePage = Screens.HomePage();
        homePage.closePromo();
    	
    	homePage.inputName("qaTest");
    	homePage.inputEmail("NotARealEmail@ThisIsAFakeAddress.do");
    	homePage.clickPhoneBox();
        homePage.enterPhoneNumber("7712345678");    	
    	homePage.clickSubmitButton();
        homePage.assertCorrectURL(Common.FRONTEND_URL + "/");
    }
	
	//Tests that form won't submit if all fields are blank
	@Test (groups = {"web", "afterproduction", "fasttest","beforedeploy"}, priority = 12) 
    public void blankFieldsNoPhoneValidation() throws Exception {
    	HomePage homePage = Screens.HomePage();
        homePage.closePromo();
    	homePage.inputName("");
    	homePage.inputEmail("");
    	homePage.clickSubmitButton();
        homePage.assertCorrectURL(Common.FRONTEND_URL + "/");
    }

	//Tests that form won't submit if all fields are blank
	@Test (groups = {"web", "afterproduction", "fasttest","beforedeploy"}, priority = 13) 
    public void blankFieldsPhoneValidation() throws Exception {
    	HomePage homePage = Screens.HomePage();
        homePage.closePromo();
    	homePage.inputName("");
    	homePage.inputEmail("");
    	homePage.clickPhoneBox();
        homePage.enterPhoneNumber("");    	
    	homePage.clickSubmitButton();
        homePage.assertCorrectURL(Common.FRONTEND_URL + "/");
    }
	
	//Tests that form won't submit if phone is invalid
	@Test (groups = {"web", "afterproduction", "fasttest","beforedeploy"}, priority = 14) 
    public void phoneValidation() throws Exception {
    	HomePage homePage = Screens.HomePage();
        homePage.closePromo();
    	homePage.inputName("qaTest");
    	homePage.inputEmail("iinqatest@gmail.com");
    	homePage.clickPhoneBox();
        homePage.enterPhoneNumber("111111111");    	
    	homePage.clickSubmitButton();
        homePage.assertCorrectURL(Common.FRONTEND_URL + "/");
    }
	
	//Tests that flags match country code using United Kingdom
	@Test (groups = {"web", "beforedeploy.ui", "fasttest"}, priority = 15) 
    public void countryFlagMatch() throws Exception {
    	HomePage homePage = Screens.HomePage();
        homePage.closePromo();
        
    	homePage.inputName("qaTest");
    	homePage.inputEmail("iinqatest@gmail.com");
    	homePage.clickPhoneBox();
    	homePage.selectFlag();
        homePage.clickUnitedKingdomFlag();
        homePage.enterPhoneNumber("7712345678");

        Assert.assertTrue(homePage.verifyAreaCodeMatchesFlag());
    }
	
	//Submit Sample Class form with no phone number
	@Test (groups = {"web", "beforedeploy", "fasttest"}, priority = 16) 
    public void submitFormNoPhone() {
    	HomePage homePage = Screens.HomePage();
        homePage.closePromo();
        
		homePage.inputName("QATEST");
		homePage.inputEmail("iinqatest@gmail.com");
		homePage.clickSubmitButton();
    	homePage.assertCorrectURL(Common.FRONTEND_URL + "/sample-class-module?sid=");
    }

	//Submit Sample Class form with phone number
	@Test (groups = {"web", "beforemerge", "fasttest","beforedeploy"}, priority = 17)
    public void submitFormWithPhone() {
    	HomePage homePage = Screens.HomePage();
        homePage.closePromo();
        
    	homePage.inputName("QATEST");
    	homePage.inputEmail("iinqatest@gmail.com");
    	homePage.clickPhoneBox();
    	homePage.enterPhoneNumber("2127305433");
    	homePage.clickSubmitButton();
    	homePage.assertCorrectURL(Common.FRONTEND_URL + "/sample-class-module?sid=");
    }
    
}