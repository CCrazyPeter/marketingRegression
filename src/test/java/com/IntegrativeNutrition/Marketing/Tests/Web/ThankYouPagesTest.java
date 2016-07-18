package com.IntegrativeNutrition.Marketing.Tests.Web;

import org.testng.annotations.Test;
import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;
import org.testng.Assert;
import com.IntegrativeNutrition.Marketing.Pages.*;

public class ThankYouPagesTest extends TestStarter {

    /*******************************************************************************************
     * http://www.integrativenutrition.com/class-thank-you
     *******************************************************************************************/

	//This test ensures the banner is displayed  
    @Test (groups = {"web.critical", "web", "beforemerge", "fasttest"}, priority = 1)
    public void verifyBannerIsDisplayed ()  throws Exception {
        ThankYouPages thankYouPage = Screens.GuideThankYou();
        
        thankYouPage.verifyBannerIsDisplayed();
    }
    
	//This test ensures the banner text is displayed  
    @Test (groups = {"web.critical", "web", "beforemerge", "fasttest"}, priority = 1)
    public void verifyBannerTextIsDisplayed ()  throws Exception {
        ThankYouPages thankYouPage = Screens.GuideThankYou();
        
        thankYouPage.verifyBannerTextIsDisplayed();
    }
    

	//This test ensures the body text is displayed  
    @Test (groups = {"web.critical", "web", "beforemerge", "fasttest"}, priority = 1)
    public void assertClassBodyTextIsDisplayed ()  throws Exception {
        ThankYouPages thankYouPage = Screens.GuideThankYou();
        thankYouPage.verifyClassBodyTextIsDisplayed();
    }

    //This test is to ensure video plays until the end
    @Test (groups = {"web", "beforedeploy", "slowtest"}, priority = 1)
    public void videoPlay() throws Exception {
    	ThankYouPages classThankYou = Screens.ClassThankYou();
    	
    	classThankYou.watchVideo();
    	Assert.assertTrue(classThankYou.verifyVideoPlayback());
    	classThankYou.closeModal();
    }
    
    
        /*******************************************************************************************
         * http://www.integrativenutrition.com/guide-thank-you
         *******************************************************************************************/

    	//This test ensures the banner is displayed  
        @Test (groups = {"web.critical", "web", "beforemerge", "fasttest"}, priority = 1)
        public void assertBannerIsDisplayed ()  throws Exception {
            ThankYouPages thankYouPage = Screens.GuideThankYou();
            thankYouPage.verifyBannerIsDisplayed();
        }
        
    	//This test ensures the banner is displayed  
        @Test (groups = {"web.critical", "web", "beforemerge", "fasttest"}, priority = 1)
        public void assertBannerTextIsDisplayed ()  throws Exception {
            ThankYouPages thankYouPage = Screens.GuideThankYou();
            thankYouPage.verifyBannerTextIsDisplayed();
        }
        
    	//This test ensures the body text is displayed  
        @Test (groups = {"web.critical", "web", "beforemerge", "fasttest"}, priority = 1)
        public void assertGuideBodyTextIsDisplayed ()  throws Exception {
            ThankYouPages thankYouPage = Screens.GuideThankYou();
            thankYouPage.verifyGuideBodyTextIsDisplayed();
        }
        
        //This test is to ensure video plays until the end
        @Test (groups = {"web", "beforedeploy", "slowtest"}, priority = 1)
        public void guideTyPlay() throws Exception {
        	ThankYouPages guideThankYou = Screens.GuideThankYou();
        	
        	guideThankYou.watchVideo();
        	Assert.assertTrue(guideThankYou.verifyGuideVideoPlayback());
        	guideThankYou.closeModal();
    }




}
