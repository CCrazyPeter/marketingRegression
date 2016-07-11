package com.IntegrativeNutrition.Marketing.Tests.Web;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;
import com.IntegrativeNutrition.Marketing.Pages.*;

public class CurriculumPageTest extends TestStarter {


     //This test is to ensure video plays until the end
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void videoPlay() throws Exception {
    	CurriculumPage curriculumPage = Screens.CurriculumPage();
    	curriculumPage.clickWatchVideo();
        Assert.assertTrue(curriculumPage.verifyVideoPlayback());
        curriculumPage.closeModal();
    }
    

	//Submit Curriculum Guide form with no phone number
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void submitFormNoPhone() throws Exception{
    	CurriculumPage curriculumPage = Screens.CurriculumPage();
    	curriculumPage.inputName("QATEST");
    	curriculumPage.inputEmail("iinqatest@gmail.com");
    	curriculumPage.clickSubmitButton();
    }

    //Submit Curriculum Guide form with phone number
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void submitFormWithPhone() {
    	CurriculumPage curriculumPage = Screens.CurriculumPage();
    	curriculumPage.inputName("QATEST");
    	curriculumPage.inputEmail("iinqatest@gmail.com");
    	curriculumPage.clickPhoneBox();
    	curriculumPage.enterPhoneNumber("2127305433");
    	curriculumPage.clickSubmitButton();
    }
}
