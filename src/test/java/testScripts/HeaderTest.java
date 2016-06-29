package testScripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import objectRepository.Header;

import setUpClasses.DriverInitialization;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;


public class HeaderTest extends DriverInitialization {

    @Test  //Test if phone number is present in header
    public void headerPhone () {
        boolean present = Header.phoneNumber.isDisplayed();
        try {
            AssertJUnit.assertTrue(present);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Search functionality - Search for "learning"
    public void headerSearch(){
        Header.conductSearch("learning");
        String currentUrl = driver.getCurrentUrl();
        try {
            //Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/search/node/learning");
        	AssertJUnit.assertEquals(currentUrl, "http://www.integrativenutrition.com/search/solr/learning");
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
            AssertJUnit.assertEquals(currentUrl, "http://www.integrativenutrition.com/");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Contact Us link
    public void headerContactUs() {
        Header.clickContactUsIcon();
        String currentUrl = driver.getCurrentUrl();
        try {
            AssertJUnit.assertEquals(currentUrl, "http://www.integrativenutrition.com/contact-us");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Curriculum Page
    public void headerCurric() {

    	Actions actions = new Actions(driver);
    	WebElement menuHoverLink = driver.findElement(By.xpath("//a[contains(text(),'Our Curriculum')]"));
    	actions.moveToElement(menuHoverLink);

    	WebElement subLink = driver.findElement(By.xpath("//a[contains(text(),'Curriculum Basics')]"));
    	actions.moveToElement(subLink);
    	actions.click();
    	actions.perform();
    	
//        Header.clickCurriculumIcon();
        String currentUrl = driver.getCurrentUrl();
        try {
            AssertJUnit.assertEquals(currentUrl, "http://www.integrativenutrition.com/curriculum");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Info Sessions Page
    public void headerInfoSess() {
        //Header.clickInfoSessionsIcon();
    	Actions actions = new Actions(driver);
    	WebElement menuHoverLink = driver.findElement(By.xpath("//a[contains(text(),'Info Sessions')]"));
    	actions.moveToElement(menuHoverLink);

    	WebElement subLink = driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]"));
    	actions.moveToElement(subLink);
    	actions.click();
    	actions.perform();    	
    	
        String currentUrl = driver.getCurrentUrl();
        try {
            AssertJUnit.assertEquals(currentUrl, "http://www.integrativenutrition.com/info-sessions");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Health Coaching Page
    public void headerHealthCoach() {
    	
    	Actions actions = new Actions(driver);
    	WebElement menuHoverLink = driver.findElement(By.xpath("//a[contains(text(),'Health Coaching')]"));
    	actions.moveToElement(menuHoverLink);

    	WebElement subLink = driver.findElement(By.xpath("//a[contains(text(),'What is a Health Coach?')]"));
    	actions.moveToElement(subLink);
    	actions.click();
    	actions.perform();

        //Header.clickHealthCoachIcon();
        String currentUrl = driver.getCurrentUrl();
        try {
            AssertJUnit.assertEquals(currentUrl, "http://www.integrativenutrition.com/health-coaching");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //About Us Page
    public void headerAboutUs() {
        //Header.clickAboutUsIcon();
    	
    	Actions actions = new Actions(driver);
    	WebElement menuHoverLink = driver.findElement(By.xpath("//a[contains(text(),'About Us')]"));
    	actions.moveToElement(menuHoverLink);

    	WebElement subLink = driver.findElement(By.xpath("//a[contains(text(),'Who We Are')]"));
    	actions.moveToElement(subLink);
    	actions.click();
    	actions.perform();
    	
    	
        String currentUrl = driver.getCurrentUrl();
        try {
            AssertJUnit.assertEquals(currentUrl, "http://www.integrativenutrition.com/about-us");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}