package com.IntegrativeNutrition.Marketing.Tests.Web;

import org.testng.annotations.Test;
import com.IntegrativeNutrition.Marketing.Pages.*;
import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;

public class SampleClassModuleTest extends TestStarter {

	 //This tests the banner being displayed
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void bannerDisplayed() throws Exception{
    	SampleClassModulePage sampleClassModulePage = Screens.SampleClassModulePage();
    	
    	sampleClassModulePage.verifyBannerIsDisplayed();
    }
    
  //This test tests the first video module
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void videoPlay() throws Exception {
    	SampleClassModulePage sampleClassModulePage = Screens.SampleClassModulePage();
    	
    	sampleClassModulePage.clickWelcomeVideo();
    	sampleClassModulePage.verifyVideoPlayback();
    	sampleClassModulePage.closeModal();
    }
    
}


