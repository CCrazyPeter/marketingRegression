package com.IntegrativeNutrition.Marketing.Tests.Web;

import org.testng.annotations.Test;
import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;
import com.IntegrativeNutrition.Marketing.Pages.*;

public class CurriculumPageTest extends TestStarter {

/*
    @Test //This test is to ensure video plays until the end
    public void videoPlay() {
        CurriculumPage.playVideo();
        driver.manage().timeouts().implicitlyWait(147, TimeUnit.SECONDS);
        driver.switchTo().frame("media-youtube-8f0lea1ov4q");
        String videoElapsed = CurriculumPage.videoElapsed.getText();
        boolean videoComplete = videoElapsed.contains("2:24");
        try {
            Assert.assertTrue(videoComplete);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
*/
	//Submit Curriculum Guide form with no phone number
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void submitFormNoPhone() throws Exception{
        Forms.inputName("QATEST");
        Forms.inputEmail("iinqatest@gmail.com");
        Forms.clickSubmitButton();
    }

    //Submit Curriculum Guide form with phone number
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void submitFormWithPhone() {
        Forms.inputName("QATEST");
        Forms.inputEmail("iinqatest@gmail.com");
        Forms.clickPhoneBox();
        Forms.enterPhoneNumber("2127305433");
        Forms.clickSubmitButton();
    }
}
