package com.IntegrativeNutrition.Marketing.Tests.Web;

import com.IntegrativeNutrition.Marketing.Pages.Header;
import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;
import com.IntegrativeNutrition.Marketing.Pages.Screens;
import org.testng.Assert;
import org.testng.annotations.*;


public class HeaderTest extends TestStarter {

	//Test if phone number is present in header
    @Test  (groups = {"web.critical", "web"}, priority = 1)
    public void assertHeaderPhoneisDisplayed () throws Exception  {
        Header header = Screens.Header();
        Assert.assertTrue(header.verifyPhoneNumberIsDisplayed());
    }
    
  //Search functionality - Search for "learning"
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void headerSearch() throws Exception {
        Header header = Screens.Header();
        
        header.conductSearch("learning");
        Assert.assertTrue(header.assertCorrectURL("http://www.integrativenutrition.com/search/solr/learning"));
    }

    //Search functionality - Search for "aaabbbccc" (test No Results Page)
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void headerSearchNoResults() throws Exception {
        Header header = Screens.Header();
        
        header.conductSearch("aaabbbccc");
        Assert.assertTrue(header.assertCorrectURL("http://www.integrativenutrition.com/search/solr/aaabbbccc"));
        Assert.assertTrue(header.verifySearchNoResultsMessageIsDisplayed());
    }
    
    //*** This section is to test that all header links go to their respective pages on click ************************
  
    //Home link
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void headerHomeIcon() throws Exception {
    	Header header = Screens.Header();
    	
        header.clickHomeIcon();
        Assert.assertTrue(header.assertCorrectURL("http://www.integrativenutrition.com/"));
    }

    //Contact Us link
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void headerContactUs() throws Exception {
    	Header header = Screens.Header();
    	
        header.clickContactUsIcon();
        Assert.assertTrue(header.assertCorrectURL("http://www.integrativenutrition.com/contact-us"));
    }
    
    //Curriculum Page
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void headerCurric() throws Exception {
    	Header header = Screens.Header();
    	
    	header.clickCurriculumBasics();
    	Assert.assertTrue(header.assertCorrectURL("http://www.integrativenutrition.com/curriculum"));
    }

	//Info Sessions Page
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void headerInfoSess() throws Exception {
    	Header header = Screens.Header();
    	
        header.clickInfoSessionsSignUp();
        Assert.assertTrue(header.assertCorrectURL("http://www.integrativenutrition.com/info-sessions"));
    }

    //Health Coaching Page
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void headerHealthCoach() throws Exception {
    	Header header = Screens.Header();
    	
        header.clickHealthCoachWhatIs();
        Assert.assertTrue(header.assertCorrectURL("http://www.integrativenutrition.com/health-coaching"));
    }

    //About Us Page
    @Test  (groups = {"web.critical", "web"}, priority = 1)
    public void headerAboutUs() throws Exception {
    	Header header = Screens.Header();
    	
        header.clickAboutUsWhoAreWe();
        Assert.assertTrue(header.assertCorrectURL("http://www.integrativenutrition.com/about-us"));
    }
}