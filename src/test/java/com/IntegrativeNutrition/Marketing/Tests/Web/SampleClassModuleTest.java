package com.IntegrativeNutrition.Marketing.Tests.Web;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.IntegrativeNutrition.Marketing.Pages.*;
import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;

public class SampleClassModuleTest extends TestStarter {

	 //This tests the banner being displayed
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void bannerDisplayed() throws Exception{
    	SampleClassModulePage sampleClassModulePage = Screens.SampleClassModulePage();
    	
    	Assert.assertTrue(sampleClassModulePage.verifyBannerIsDisplayed());
    }

	 //This tests the banner text being displayed
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void bannerTextDisplayed() throws Exception{
    	SampleClassModulePage sampleClassModulePage = Screens.SampleClassModulePage();
    	
    	Assert.assertTrue(sampleClassModulePage.verifyBannerTextIsDisplayed());
    }
    
	 //This tests the banner text being displayed
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void videoIntroTextDisplayed() throws Exception{
    	SampleClassModulePage sampleClassModulePage = Screens.SampleClassModulePage();
    	
    	Assert.assertTrue(sampleClassModulePage.verifyVideo1TextIsDisplayed());
    	Assert.assertTrue(sampleClassModulePage.verifyVideo2TextIsDisplayed());
    	Assert.assertTrue(sampleClassModulePage.verifyVideo3TextIsDisplayed());
    	Assert.assertTrue(sampleClassModulePage.verifyVideo4TextIsDisplayed());
    	Assert.assertTrue(sampleClassModulePage.verifyVideo5TextIsDisplayed());
    	Assert.assertTrue(sampleClassModulePage.verifyVideo6TextIsDisplayed());
    	Assert.assertTrue(sampleClassModulePage.verifyVideo7TextIsDisplayed());
    }

  //This test tests the first video module
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void videoPlay() throws Exception {
    	SampleClassModulePage sampleClassModulePage = Screens.SampleClassModulePage();
    	
    	sampleClassModulePage.clickWelcomeVideo();
    	Assert.assertTrue(sampleClassModulePage.verifyVideoPlayback());
    	sampleClassModulePage.closeModal();
    }
    
}


