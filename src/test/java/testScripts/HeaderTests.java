package testScripts;

import org.junit.Assert;
import objectRepository.Header;
import org.junit.Test;
import setUpClasses.DriverInitialization;

public class HeaderTests extends DriverInitialization {

    @Test  //Test if phone number is present in header
    public void headerPhone () {
        boolean present = Header.phoneNumber.isDisplayed();
        try {
            Assert.assertTrue(present);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Search functionality - Search for "learning"
    public void headerSearch(){
        Header.conductSearch("learning");
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/search/node/learning");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //*** This section is to test that all header links go to their respective pages on click ************************

    @Test //Home link
    public void headerHomeIcon() {
        Header.clickHomeIcon();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Contact Us link
    public void headerContactUs() {
        Header.clickContactUsIcon();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/contact-us");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Curriculum Page
    public void headerCurric() {
        Header.clickCurriculumIcon();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/curriculum");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Info Sessions Page
    public void headerInfoSess() {
        Header.clickInfoSessionsIcon();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/info-sessions");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Health Coaching Page
    public void headerHealthCoach() {
        Header.clickHealthCoachIcon();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/health-coaching");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //About Us Page
    public void headerAboutUs() {
        Header.clickAboutUsIcon();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/about-us");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}



