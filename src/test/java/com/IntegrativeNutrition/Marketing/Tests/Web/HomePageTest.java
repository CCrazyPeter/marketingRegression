package com.IntegrativeNutrition.Marketing.Tests.Web;


import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;
import com.IntegrativeNutrition.Marketing.Pages.HomePage;
import com.IntegrativeNutrition.Marketing.Pages.Screens;
import org.testng.annotations.*;
import org.testng.Assert;

public class HomePageTest extends TestStarter {

	//This test ensures the banner is displayed  
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertBannerIsDisplayed ()  throws Exception {
        HomePage homePage = Screens.HomePage();
    	homePage.verifyBannerIsDisplayed();
    }
    

    //This test ensures the Sample Our Program button triggers a page scroll to the Sample Class form   
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void assertSampleProgramButtonTriggersScroll () throws Exception {
        HomePage homePage = Screens.HomePage();
    	homePage.clickSampleProgram();
    	Assert.assertTrue(homePage.assertPageScrolledDown());
    }
    
    //This test is to ensure video plays until the end
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void videoPlay() throws Exception {
    	HomePage homePage = Screens.HomePage();
        homePage.clickWatchVideo();
        homePage.verifyVideoPlayback();
        homePage.closeModal();
    }
}