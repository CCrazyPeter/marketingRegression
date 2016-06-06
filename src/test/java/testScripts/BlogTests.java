package testScripts;

import objectRepository.BlogLandingPage;
import objectRepository.Forms;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import setUpClasses.DriverInitialization;

public class BlogTests extends DriverInitialization {

    @Before
    public void openBlogLanding() {
        driver.get("www.integrativenutrition.com/blog");
    }

    @Test  //This test ensures the banner is displayed
    public void bannerDisplayed() {
        boolean bannerAppear = BlogLandingPage.blogHeaderBanner.isDisplayed();
        try {
            Assert.assertTrue(bannerAppear);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Submit Curriculum Guide form with no phone number
    public void submitFormNoPhone() {
        Forms.inputName("blogTest");
        Forms.inputEmail("blogNoPhone@qatest.edu");
        Forms.clickSubmitButton();
        boolean expectedUrl= driver.getCurrentUrl().contains("http://www.integrativenutrition.com/guide-thank-you?sid=");
        try {
            Assert.assertTrue(expectedUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Tests that the load more button is displayed at the bottom of the page
    public void loadMoreDisplayed() {
        boolean loadMore = BlogLandingPage.seeMore.isDisplayed();
        try {
            Assert.assertTrue(loadMore);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


