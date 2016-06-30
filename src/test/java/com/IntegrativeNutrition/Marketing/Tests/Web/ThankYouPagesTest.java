package com.IntegrativeNutrition.Marketing.Tests.Web;

import org.testng.annotations.Test;
import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;
import org.testng.AssertJUnit;
import com.IntegrativeNutrition.Marketing.Pages.*;
import java.util.concurrent.TimeUnit;

public class ThankYouPagesTest extends TestStarter {

    /*******************************************************************************************
     * http://www.integrativenutrition.com/class-thank-you
     *******************************************************************************************/

	//This test ensures the banner is displayed  
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void verifyBannerIsDisplayed ()  throws Exception {
        ThankYouPages thankYouPage = Screens.GuideThankYou();
        
        thankYouPage.verifyBannerIsDisplayed();
    }

    //This test is to ensure video plays until the end
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void videoPlay() throws Exception {
    	ThankYouPages classThankYou = Screens.ClassThankYou();
    	
    	classThankYou.watchVideo();
    	classThankYou.verifyClassVideoPlayback();
    	classThankYou.closeModal();
    }
    
    
        /*******************************************************************************************
         * http://www.integrativenutrition.com/guide-thank-you
         *******************************************************************************************/

    	//This test ensures the banner is displayed  
        @Test (groups = {"web.critical", "web"}, priority = 1)
        public void assertBannerIsDisplayed ()  throws Exception {
            ThankYouPages thankYouPage = Screens.GuideThankYou();
            thankYouPage.verifyBannerIsDisplayed();
        }
        	
        //This test is to ensure video plays until the end
        @Test (groups = {"web.critical", "web"}, priority = 1)
        public void guideTyPlay() throws Exception {
        	ThankYouPages guideThankYou = Screens.GuideThankYou();
        	
        	guideThankYou.watchVideo();
        	guideThankYou.verifyGuideVideoPlayback();
        	guideThankYou.closeModal();
    }




}
