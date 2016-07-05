package com.IntegrativeNutrition.Marketing.Tests.Web;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.IntegrativeNutrition.Marketing.Pages.*;
import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;

public class BlogTest extends TestStarter {

	//This test ensures the banner is displayed
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void bannerDisplayed() throws Exception {
        BlogElements blogElements = Screens.BlogElements();
    	Assert.assertTrue(blogElements.verifyBannerIsDisplayed());
    }
    
    //Submit Curriculum Guide form with no phone number
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void submitFormNoPhone() {
        BlogElements blogElements = Screens.BlogElements();
        Forms.inputName("QATEST");
        Forms.inputEmail("iinqatest@gmail.com");
        Forms.clickSubmitButton();
        blogElements.assertCorrectURL("http://www.integrativenutrition.com/guide-thank-you?sid=");
    }

    /* COMMENTED BECAUSE THERE SEEMS TO BE A PROBLEM IN THE BLOG PAGE AND THIS 
     * BUTTON IS NOT SHOWING SO I HAVE NO WAY OF GETTING THE XPATH TO THIS ELEMENT
    @Test //Tests that the load more button is displayed at the bottom of the page
    public void loadMoreDisplayed() {
        boolean loadMore = BlogElements.seeMore.isDisplayed();
        try {
            Assert.assertTrue(loadMore);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

}


