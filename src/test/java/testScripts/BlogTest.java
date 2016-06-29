package testScripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
//import objectRepository.BlogElements;
import objectRepository.Forms;
import setUpClasses.DriverInitialization;

public class BlogTest extends DriverInitialization {

    @BeforeMethod
	public void openBlogLanding() {
        driver.get("www.integrativenutrition.com/blog");
    }
/*
    @Test  //This test ensures the banner is displayed
    public void bannerDisplayed() {
        boolean bannerAppear = BlogElements.blogHeaderBanner.isDisplayed();
        try {
            Assert.assertTrue(bannerAppear);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
*/
    @Test //Submit Curriculum Guide form with no phone number
    public void submitFormNoPhone() {
        Forms.inputName("blogTest");
        Forms.inputEmail("blogNoPhone@qatest.edu");
        Forms.clickSubmitButton();
        boolean expectedUrl= driver.getCurrentUrl().contains("http://www.integrativenutrition.com/guide-thank-you?sid=");
        try {
            AssertJUnit.assertTrue(expectedUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
/*
    @Test //Tests that the load more button is displayed at the bottom of the page
    public void loadMoreDisplayed() {
        boolean loadMore = BlogLandingPage.seeMore.isDisplayed();
        try {
            Assert.assertTrue(loadMore);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
*/
}


