package com.IntegrativeNutrition.Marketing.Tests.Web;


import com.IntegrativeNutrition.Marketing.Pages.AboutUsPage;
import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;
import com.IntegrativeNutrition.Marketing.Pages.Screens;
import org.testng.annotations.*;
import org.testng.Assert;

public class AboutUsTest extends TestStarter {

	//This test ensures the banner is displayed  
    @Test (groups = {"web.critical", "web", "beforemerge", "fasttest"}, priority = 1)
    public void assertBannerIsDisplayed ()  throws Exception {
        AboutUsPage aboutUsPage = Screens.AboutUsPage();
        aboutUsPage.closePromo();
    	Assert.assertTrue(aboutUsPage.verifyBannerIsDisplayed());
    }

  	//This test ensures the banner text is displayed  
    @Test (groups = {"web.critical", "web", "beforemerge", "fasttest"}, priority = 2)
    public void assertBannerTextIsDisplayed ()  throws Exception {
        AboutUsPage aboutUsPage = Screens.AboutUsPage();
        aboutUsPage.closePromo();
    	Assert.assertTrue(aboutUsPage.verifyBannerTextIsDisplayed());
    }

  	//This test ensures the body text is displayed  
    @Test (groups = {"web.critical", "web", "beforemerge", "fasttest"}, priority = 3)
    public void assertBodyTextIsDisplayed ()  throws Exception {
        AboutUsPage aboutUsPage = Screens.AboutUsPage();
        aboutUsPage.closePromo();
    	Assert.assertTrue(aboutUsPage.verifyBodyCopyIsPresent());
    }

  	//This test ensures the video intro text is displayed  
    @Test (groups = {"web", "beforedeploy", "slowtest"}, priority = 4)
    public void assertVideoIntroTextIsDisplayed ()  throws Exception {
        AboutUsPage aboutUsPage = Screens.AboutUsPage();
        aboutUsPage.closePromo();
    	Assert.assertTrue(aboutUsPage.verifyVideoIntroTextIsPresent());
    }

	//This test ensures Our History is displayed  
    @Test (groups = {"web", "beforedeploy", "slowtest"}, priority = 5)
    public void assertOurHistoryIsDisplayed ()  throws Exception {
        AboutUsPage aboutUsPage = Screens.AboutUsPage();
        aboutUsPage.closePromo();
    	Assert.assertTrue(aboutUsPage.verifyOurHistoryIsDisplayed());
    }

	//This test ensures About Our Founder is displayed  
    @Test (groups = {"web", "beforedeploy", "slowtest"}, priority = 6)
    public void assertAboutOurFounderIsDisplayed ()  throws Exception {
        AboutUsPage aboutUsPage = Screens.AboutUsPage();
        aboutUsPage.closePromo();
    	Assert.assertTrue(aboutUsPage.verifyAboutOurFounderIsDisplayed());
    }

	//This test ensures Our Core Values is displayed  
    @Test (groups = {"web", "beforedeploy", "slowtest"}, priority = 7)
    public void assertOurCoreValuesIsDisplayed ()  throws Exception {
        AboutUsPage aboutUsPage = Screens.AboutUsPage();
        aboutUsPage.closePromo();
    	Assert.assertTrue(aboutUsPage.verifyOurCoreValuesIsDisplayed());
    }

	//This test ensures Our Board Of Advisors is displayed  
    @Test (groups = {"web", "beforedeploy", "slowtest"}, priority = 8)
    public void assertOurBoardOfAdvisorsIsDisplayed ()  throws Exception {
        AboutUsPage aboutUsPage = Screens.AboutUsPage();
        aboutUsPage.closePromo();
    	Assert.assertTrue(aboutUsPage.verifyOurBoardOfAdvisorsIsDisplayed());
    }

    //This test is to ensure video plays until the end
    @Test (groups = {"web", "beforedeploy", "slowtest"}, priority = 9)
    public void videoPlay() throws Exception {
    	AboutUsPage aboutUsPage = Screens.AboutUsPage();
    	aboutUsPage.closePromo();
    	aboutUsPage.clickWatchVideo();
        Assert.assertTrue(aboutUsPage.verifyVideoPlayback());
        aboutUsPage.closeModal();
    }

}