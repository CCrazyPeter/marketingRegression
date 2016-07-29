package com.IntegrativeNutrition.Marketing.Tests.Web;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;
import com.IntegrativeNutrition.Marketing.Global.Common;
import com.IntegrativeNutrition.Marketing.Pages.*;

public class CurriculumPageTest extends TestStarter {

	//This test ensures the banner is displayed  
    @Test (groups = {"web.critical", "web","beforemerge", "fasttest","beforedeploy"}, priority = 1)
    public void assertBannerIsDisplayed ()  throws Exception {
        CurriculumPage curriculumPage = Screens.CurriculumPage();
        curriculumPage.closePromo();
    	Assert.assertTrue(curriculumPage.verifyBannerIsDisplayed());
    }

	//This test ensures the header banner text is displayed  
    @Test (groups = {"web.critical", "web","beforemerge", "fasttest","beforedeploy"}, priority = 2)
    public void assertBannerTextIsDisplayed ()  throws Exception {
        CurriculumPage curriculumPage = Screens.CurriculumPage();
        curriculumPage.closePromo();
    	Assert.assertTrue(curriculumPage.verifyBannerTextIsDisplayed());
    }

	//This test ensures the body text is displayed  
    @Test (groups = {"web.critical", "web","beforedeploy", "fasttest"}, priority = 3)
    public void assertBodyTextIsDisplayed ()  throws Exception {
        CurriculumPage curriculumPage = Screens.CurriculumPage();
        curriculumPage.closePromo();
    	Assert.assertTrue(curriculumPage.verifyBodyTextIsDisplayed());
    }

	//This test ensures the Our Visiting Teachers section is displayed  
    @Test (groups = {"web","beforedeploy", "slowtest"}, priority = 4)
    public void assertOurVisitinTeachersIsDisplayed ()  throws Exception {
        CurriculumPage curriculumPage = Screens.CurriculumPage();
        curriculumPage.closePromo();
    	Assert.assertTrue(curriculumPage.verifyOurVisitinTeachersIsDisplayed());
    }

	//This test ensures the Testimonial Carrousel is displayed  
    @Test (groups = {"web","beforedeploy", "slowtest"}, priority = 5)
    public void assertTestimonialCarrouselIsDisplayed ()  throws Exception {
        CurriculumPage curriculumPage = Screens.CurriculumPage();
        curriculumPage.closePromo();
    	Assert.assertTrue(curriculumPage.verifyTestimonialCarrouselIsDisplayed());
    }

	//This test ensures the Get Real World Training section is displayed  
    @Test (groups = {"web","beforedeploy", "slowtest"}, priority = 6)
    public void assertGetRealWorldTrainingIsDisplayed ()  throws Exception {
        CurriculumPage curriculumPage = Screens.CurriculumPage();
        curriculumPage.closePromo();
    	Assert.assertTrue(curriculumPage.verifyGetRealWorldTrainingIsDisplayed());
    }

     //This test is to ensure video plays until the end
    @Test (groups = {"web","beforedeploy", "slowtest"}, priority = 7)
    public void videoPlay() throws Exception {
    	CurriculumPage curriculumPage = Screens.CurriculumPage();
    	curriculumPage.closePromo();
    	curriculumPage.clickWatchVideo();
        Assert.assertTrue(curriculumPage.verifyVideoPlayback());
        curriculumPage.closeModal();
    }

	//Tests form won't submit if name field is blank
	@Test (groups = {"web","afterproduction", "fasttest","beforedeploy"}, priority = 8)
    public void nameValidation() throws Exception {
    	CurriculumPage curriculumPage = Screens.CurriculumPage();
    	curriculumPage.closePromo();
    	curriculumPage.inputEmail("iinqatest@gmail.com");
    	curriculumPage.clickSubmitButton();
        curriculumPage.assertCorrectURL(Common.FRONTEND_URL + "/curriculum");
    }

	//Tests that form won't submit if email field is blank
	@Test (groups = {"web","afterproduction", "fasttest","beforedeploy"}, priority = 9) 
    public void emailValidation() throws Exception {
    	CurriculumPage curriculumPage = Screens.CurriculumPage();
    	curriculumPage.closePromo();
    	curriculumPage.inputName("qaTest");
    	curriculumPage.clickSubmitButton();
        curriculumPage.assertCorrectURL(Common.FRONTEND_URL + "/curriculum");
    }

	//Tests that form won't submit if email is invalid
	@Test (groups = {"web","afterproduction", "fasttest","beforedeploy"}, priority = 10) 
    public void invalidEmailNoPhoneValidation() throws Exception {
    	CurriculumPage curriculumPage = Screens.CurriculumPage();
    	curriculumPage.closePromo();
    	curriculumPage.inputName("qaTest");
    	curriculumPage.inputEmail("NotARealEmail@ThisIsAFakeAddress.do");
    	curriculumPage.clickSubmitButton();
        curriculumPage.assertCorrectURL(Common.FRONTEND_URL + "/curriculum");
    }

	//Tests that form won't submit if email is invalid
	@Test (groups = {"web","afterproduction", "fasttest","beforedeploy"}, priority = 11) 
    public void invalidEmailPhoneValidation() throws Exception {
    	CurriculumPage curriculumPage = Screens.CurriculumPage();
    	curriculumPage.closePromo();
    	curriculumPage.inputName("qaTest");
    	curriculumPage.inputEmail("NotARealEmail@ThisIsAFakeAddress.do");
    	curriculumPage.clickPhoneBox();
        curriculumPage.enterPhoneNumber("7712345678");    	
    	curriculumPage.clickSubmitButton();
        curriculumPage.assertCorrectURL(Common.FRONTEND_URL + "/curriculum");
    }

	//Tests that form won't submit if all fields are blank
	@Test (groups = {"web","afterproduction", "fasttest","beforedeploy"}, priority = 12) 
    public void blankFieldsNoPhoneValidation() throws Exception {
    	CurriculumPage curriculumPage = Screens.CurriculumPage();
    	curriculumPage.closePromo();
    	curriculumPage.inputName("");
    	curriculumPage.inputEmail("");
    	curriculumPage.clickSubmitButton();
        curriculumPage.assertCorrectURL(Common.FRONTEND_URL + "/curriculum");
    }

	//Tests that form won't submit if all fields are blank
	@Test (groups = {"web","afterproduction", "fasttest","beforedeploy"}, priority = 13) 
    public void blankFieldsPhoneValidation() throws Exception {
    	CurriculumPage curriculumPage = Screens.CurriculumPage();
    	curriculumPage.closePromo();
    	curriculumPage.inputName("");
    	curriculumPage.inputEmail("");
    	curriculumPage.clickPhoneBox();
        curriculumPage.enterPhoneNumber("");    	
    	curriculumPage.clickSubmitButton();
        curriculumPage.assertCorrectURL(Common.FRONTEND_URL + "/curriculum");
    }

	//Tests that form won't submit if phone is invalid
	@Test (groups = {"web","afterproduction", "fasttest","beforedeploy"}, priority = 14) 
    public void phoneValidation() throws Exception {
    	CurriculumPage curriculumPage = Screens.CurriculumPage();
    	curriculumPage.closePromo();
    	curriculumPage.inputName("qaTest");
    	curriculumPage.inputEmail("iinqatest@gmail.com");
    	curriculumPage.clickPhoneBox();
        curriculumPage.enterPhoneNumber("111111111");    	
    	curriculumPage.clickSubmitButton();
        curriculumPage.assertCorrectURL(Common.FRONTEND_URL + "/curriculum");
    }

	//Tests that flags match country code using United Kingdom
	@Test (groups = {"web.critical", "web","beforedeploy", "fasttest"}, priority = 15) 
    public void countryFlagMatch() throws Exception {
    	CurriculumPage curriculumPage = Screens.CurriculumPage();
    	curriculumPage.closePromo();
    	curriculumPage.inputName("qaTest");
    	curriculumPage.inputEmail("iinqatest@gmail.com");
    	curriculumPage.clickPhoneBox();
    	curriculumPage.selectFlag();
        curriculumPage.clickUnitedKingdomFlag();
        curriculumPage.enterPhoneNumber("7712345678");

        Assert.assertTrue(curriculumPage.verifyAreaCodeMatchesFlag());
    }

	//Submit Sample Class form with no phone number
	@Test (groups = {"web.critical", "web","beforedeploy", "fasttest"}, priority = 16) 
    public void submitFormNoPhone() {
    	CurriculumPage curriculumPage = Screens.CurriculumPage();
    	curriculumPage.closePromo();
		curriculumPage.inputName("QATEST");
		curriculumPage.inputEmail("iinqatest@gmail.com");
		curriculumPage.clickSubmitButton();
    	curriculumPage.assertCorrectURL(Common.FRONTEND_URL + "/guide-thank-you?sid=");
    }

	//Submit Sample Class form with phone number
	@Test (groups = {"web.critical", "web","beforedeploy", "fasttest"}, priority = 17)
    public void submitFormWithPhone() {
    	CurriculumPage curriculumPage = Screens.CurriculumPage();
    	curriculumPage.closePromo();
    	curriculumPage.inputName("QATEST");
    	curriculumPage.inputEmail("iinqatest@gmail.com");
    	curriculumPage.clickPhoneBox();
    	curriculumPage.enterPhoneNumber("2127305433");
    	curriculumPage.clickSubmitButton();
    	curriculumPage.assertCorrectURL(Common.FRONTEND_URL + "/guide-thank-you?sid=");
    }
}
