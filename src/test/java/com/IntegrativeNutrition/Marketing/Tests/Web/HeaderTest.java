package com.IntegrativeNutrition.Marketing.Tests.Web;

import com.IntegrativeNutrition.Marketing.Pages.Header;
import com.IntegrativeNutrition.Marketing.Pages.HomePage;
import com.IntegrativeNutrition.Marketing.Tests.Common.TestStarter;
import com.IntegrativeNutrition.Marketing.Pages.Screens;
import org.testng.annotations.*;
import org.testng.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;


public class HeaderTest extends TestStarter {

	//Test if phone number is present in header
    @Test  (groups = {"web.critical", "web"}, priority = 1)
    public void assertHeaderPhoneisDisplayed () throws Exception  {
        Header header = Screens.Header();
        
    	header.verifyPhoneNumberIsDisplayed();
    }
    
  //Search functionality - Search for "learning"
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void headerSearch() throws Exception {
        Header header = Screens.Header();
        
        header.conductSearch("learning");
    	header.assertCorrectURL("http://www.integrativenutrition.com/search/solr/learning");
    }

    //*** This section is to test that all header links go to their respective pages on click ************************
  
    //Home link
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void headerHomeIcon() throws Exception {
    	Header header = Screens.Header();
    	
        header.clickHomeIcon();
        header.assertCorrectURL("http://www.integrativenutrition.com/");
    }

    //Contact Us link
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void headerContactUs() throws Exception {
    	Header header = Screens.Header();
    	
        header.clickContactUsIcon();
        header.assertCorrectURL("http://www.integrativenutrition.com/contact-us");
    }
    
    //Curriculum Page
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void headerCurric() throws Exception {
    	Header header = Screens.Header();
    	
    	header.clickCurriculumBasics();
    	header.assertCorrectURL("http://www.integrativenutrition.com/curriculum");
    }

	//Info Sessions Page
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void headerInfoSess() throws Exception {
    	Header header = Screens.Header();
    	
        header.clickInfoSessionsSignUp();
        header.assertCorrectURL("http://www.integrativenutrition.com/info-sessions");
    }

    //Health Coaching Page
    @Test (groups = {"web.critical", "web"}, priority = 1)
    public void headerHealthCoach() throws Exception {
    	Header header = Screens.Header();
    	
        header.clickHealthCoachWhatIs();
        header.assertCorrectURL("http://www.integrativenutrition.com/health-coaching");
    }

    //About Us Page
    @Test  (groups = {"web.critical", "web"}, priority = 1)
    public void headerAboutUs() throws Exception {
    	Header header = Screens.Header();
    	
        header.clickAboutUsWhoAreWe();
    	header.assertCorrectURL("http://www.integrativenutrition.com/about-us");
    }
}