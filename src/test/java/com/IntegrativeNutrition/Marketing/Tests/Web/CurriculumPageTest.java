package com.IntegrativeNutrition.Marketing.Tests.Web;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;
import com.IntegrativeNutrition.Marketing.Pages.*;

public class CurriculumPageTest extends TestStarter {


    @Test //This test is to ensure video plays until the end
    public void videoPlay() {
    	CurriculumPage curriculumPage = Screens.CurriculumPage();
    	curriculumPage.clickWatchVideo();
        Assert.assertTrue(curriculumPage.verifyVideoPlayback());
        curriculumPage.closeModal();
    }

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
