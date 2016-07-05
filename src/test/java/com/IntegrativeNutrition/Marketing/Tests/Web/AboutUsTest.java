package com.IntegrativeNutrition.Marketing.Tests.Web;


import com.IntegrativeNutrition.Marketing.Pages.AboutUsPage;
import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;
import com.IntegrativeNutrition.Marketing.Pages.Screens;
import org.testng.annotations.*;
import org.testng.Assert;

public class AboutUsTest extends TestStarter {

	//This test ensures the banner is displayed  
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertBannerIsDisplayed ()  throws Exception {
        AboutUsPage aboutUsPage = Screens.AboutUsPage();
    	Assert.assertTrue(aboutUsPage.verifyBannerIsDisplayed());
    }
    
	//This test ensures the banner is displayed  
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertOurHistoryIsDisplayed ()  throws Exception {
        AboutUsPage aboutUsPage = Screens.AboutUsPage();
    	Assert.assertTrue(aboutUsPage.verifyOurHistoryIsDisplayed());
    }
    
	//This test ensures the banner is displayed  
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertAboutOurFounderIsDisplayed ()  throws Exception {
        AboutUsPage aboutUsPage = Screens.AboutUsPage();
    	Assert.assertTrue(aboutUsPage.verifyAboutOurFounderIsDisplayed());
    }
    
	//This test ensures the banner is displayed  
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertOurCoreValuesIsDisplayed ()  throws Exception {
        AboutUsPage aboutUsPage = Screens.AboutUsPage();
    	Assert.assertTrue(aboutUsPage.verifyOurCoreValuesIsDisplayed());
    }
    
	//This test ensures the banner is displayed  
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertOurBoardOfAdvisorsIsDisplayed ()  throws Exception {
        AboutUsPage aboutUsPage = Screens.AboutUsPage();
    	Assert.assertTrue(aboutUsPage.verifyOurBoardOfAdvisorsIsDisplayed());
    }
    
    //This test is to ensure video plays until the end
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void videoPlay() throws Exception {
    	AboutUsPage aboutUsPage = Screens.AboutUsPage();
    	aboutUsPage.clickWatchVideo();
        Assert.assertTrue(aboutUsPage.verifyVideoPlayback());
        aboutUsPage.closeModal();
    }
    

    

}
