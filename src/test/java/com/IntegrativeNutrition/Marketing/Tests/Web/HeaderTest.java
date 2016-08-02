package com.IntegrativeNutrition.Marketing.Tests.Web;

import com.IntegrativeNutrition.Marketing.Global.Common;
import com.IntegrativeNutrition.Marketing.Pages.Header;
import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;
import com.IntegrativeNutrition.Marketing.Pages.Screens;
import org.testng.Assert;
import org.testng.annotations.*;


public class HeaderTest extends TestStarter {

	//Test if phone number is present in header
    @Test  (groups = {"web", "beforemerge", "fasttest", "beforedeploy"}, priority = 1)
    public void assertHeaderPhoneisDisplayed () throws Exception  {
        Header header = Screens.Header();
        header.closePromo();
        Assert.assertTrue(header.verifyPhoneNumberIsDisplayed());
    }

  //Search functionality - Search for "learning"
    @Test (groups = {"web.critical", "web", "beforemerge", "slowtest", "beforedeploy"}, priority = 2)
    public void headerSearch() throws Exception {
        Header header = Screens.Header();
        header.closePromo();
        header.conductSearch("learning");
        Assert.assertTrue(header.assertCorrectURL(Common.FRONTEND_URL + "/search/solr/learning"));
    }

    //Search functionality - Search for "aaabbbccc" (test No Results Page)
    @Test (groups = {"web.critical", "web", "beforedeploy", "slowtest"}, priority = 3)
    public void headerSearchNoResults() throws Exception {
        Header header = Screens.Header();
        header.closePromo();
        header.conductSearch("aaabbbccc");
        Assert.assertTrue(header.assertCorrectURL(Common.FRONTEND_URL + "/search/solr/aaabbbccc"));
        Assert.assertTrue(header.verifySearchNoResultsMessageIsDisplayed());
    }
    
    //*** This section is to test that all header links go to their respective pages on click ************************
  
    //Home link
    @Test (groups = {"web.critical", "web", "beforemerge", "slowtest", "beforedeploy"}, priority = 4)
    public void headerHomeIcon() throws Exception {
    	Header header = Screens.Header();
    	header.closePromo();
        header.clickHomeIcon();
        Assert.assertTrue(header.assertCorrectURL(Common.FRONTEND_URL + "/"));
    }

    //Contact Us link
    @Test (groups = {"web.critical", "web", "beforemerge", "slowtest", "beforedeploy"}, priority = 5)
    public void headerContactUs() throws Exception {
    	Header header = Screens.Header();
    	header.closePromo();
        header.clickContactUsIcon();
        Assert.assertTrue(header.assertCorrectURL(Common.FRONTEND_URL + "/contact-us"));
    }

    //Curriculum Page
    @Test (groups = {"web.critical", "web", "beforedeploy.ui", "slowtest"}, priority = 6)
    public void headerCurric() throws Exception {
    	Header header = Screens.Header();
    	header.closePromo();
    	header.clickCurriculumBasics();
    	Assert.assertTrue(header.assertCorrectURL(Common.FRONTEND_URL + "/curriculum"));
    }

    //Educational Partnerships Page
    @Test (groups = {"web.critical", "web", "beforedeploy.ui", "slowtest"}, priority = 7)
    public void headerEducationalPartnerships() throws Exception {
    	Header header = Screens.Header();
    	header.closePromo();
    	header.clickEducationalPartnershipsIcon();
    	Assert.assertTrue(header.assertCorrectURL(Common.FRONTEND_URL + "/career/certification"));
    }

	//Info Sessions Page
    @Test (groups = {"web.critical", "web", "beforedeploy.ui", "slowtest"}, priority = 8)
    public void headerInfoSess() throws Exception {
    	Header header = Screens.Header();
    	header.closePromo();
        header.clickInfoSessionsSignUp();
        Assert.assertTrue(header.assertCorrectURL(Common.FRONTEND_URL + "/info-sessions"));
    }

    //Health Coaching Page
    @Test (groups = {"web.critical", "web", "beforedeploy.ui", "slowtest"}, priority = 9)
    public void headerHealthCoach() throws Exception {
    	Header header = Screens.Header();
    	header.closePromo();
        header.clickHealthCoachWhatIs();
        Assert.assertTrue(header.assertCorrectURL(Common.FRONTEND_URL + "/health-coaching"));
    }

    //About Us Page
    @Test  (groups = {"web.critical", "web", "beforedeploy.ui", "slowtest"}, priority = 10)
    public void headerAboutUs() throws Exception {
    	Header header = Screens.Header();
    	header.closePromo();
        header.clickAboutUsWhoAreWe();
        Assert.assertTrue(header.assertCorrectURL(Common.FRONTEND_URL + "/about-us"));
    }
}