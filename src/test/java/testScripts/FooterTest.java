package testScripts;

import objectRepository.Footer;
import org.junit.Assert;
import org.junit.Test;
import setUpClasses.DriverInitialization;
import java.util.Iterator;
import java.util.Set;


public class FooterTest extends DriverInitialization {

    //*** This section is to test that all footer links go to their respective pages on click ************************

/*
	@Test //Curriculum link
    public void footerCurric() {
        Footer.clickCurriculumLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/curriculum");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
    @Test //IIN Learning Center link
    public void footerLC() {
        Footer.clickLearningCenterLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/curriculum#learningcenter");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Visiting Center link
    public void footerVisitTeach() {
        Footer.clickVisitingTeachersLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/curriculum#visitingteachers");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Business Training link
    public void footerBusinessTraining() {
        Footer.clickBusinessTrainingLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/curriculum#businesstraining");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Health Coaching link
    public void footerHealthCoaching() {
        Footer.clickHealthCoachingLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/health-coaching");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //What is HC link
    public void footerWhatIsHC() {
        Footer.clickWhatsHCLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/health-coaching#definehc");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Grad Success link
    public void footerGradSuccess() {
        Footer.clickGradSuccessLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/health-coaching#gradsuccess");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Passionate Career link
    public void footerPassionateCareer() {
        Footer.clickCareerPassionLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/health-coaching#careerpassion");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Info Sessions link
    public void footerInfoSessions() {
        Footer.clickInfoSessionsLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/info-sessions");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Meet The Founder link
    public void footerMeetFounder() {
        Footer.clickMeetFounderLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/info-sessions#founder");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Student Experience link
    public void footerStudentExperience() {
        Footer.clickStudentExperienceLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/info-sessions#studentexperience");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //HC Right For You link
    public void footerHCright4You() {
        Footer.clickHCRightForYouLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/info-sessions#hcrightforyou");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //My Healthy Your Healthy link
    public void footerMyHealthy() {
        Footer.clickMyYourHealthLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/info-sessions#healthy");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //About Us link
    public void footerAboutUs() {
        Footer.clickAboutUsLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/about-us");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Health Revolution link
    public void footerHealthRev() {
        Footer.clickHealthRevLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/about-us#aboutvideo");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Core Values link
    public void footerCoreValues() {
        Footer.clickCoreValuesLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/about-us#corevalues");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Board of Advisors link
    public void footerAdvisorBoard() {
        Footer.clickAdvisorBoardLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/about-us#advisors");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Reviews link
    public void footerReviews() {
        Footer.clickReviewsLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/reviews");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Blog link
    public void footerBlog() {
        Footer.clickBlogLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/blog");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //From the Founder link
    public void footerFromFounder() {
        Footer.clickFromFounderLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/blog/categories/notes-from-the-founder");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Health Trends link
    public void footerHealthTrends() {
        Footer.clickHealthTrendsLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/blog/categories/health-trends");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
*/
/*     
    @Test //This tests sub footer menu
    public void footerOpenSubFooter() {
        Footer.clickRegulatoryInfoLink();
        Footer.clickTermsPrivacyLink();
        Footer.clickAffiliatesLink();
        Footer.clickJobsLink();

        Set<String> tabs = driver.getWindowHandles();
        Iterator<String> subFooter = tabs.iterator();
        String home = subFooter.next();
        String regInfo = subFooter.next();
        String termsPrivacy = subFooter.next();
        String affiliates = subFooter.next();
        String jobs = subFooter.next();

        //Regulatory Info link
        driver.switchTo().window(regInfo);
        String currentUrlRI = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlRI, "http://www.integrativenutrition.com/about/regulatory");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Terms of Use - Privacy Policy link
        driver.switchTo().window(termsPrivacy);
        String currentUrlTerms = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlTerms, "http://www.integrativenutrition.com/lp/privacypolicy");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Affiliates link
        driver.switchTo().window(affiliates);
        String currentUrlAff = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlAff, "http://www.integrativenutrition.com/affiliates");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Jobs link
        driver.switchTo().window(jobs);
        String currentUrlJobs = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlJobs, "http://www.integrativenutrition.com/jobs");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Navigate back to the home window
        driver.get("http://www.integrativenutrition.com/curriculum");

    }
*/
}