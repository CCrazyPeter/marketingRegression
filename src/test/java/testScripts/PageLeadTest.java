package testScripts;
import objectRepository.Forms;
import objectRepository.PaidLeadGen;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setUpClasses.DriverInitialization;

public class PageLeadTest extends DriverInitialization {

    @Before
    public void clearCookies() {
        driver.manage().deleteAllCookies();
    }

//*** These tests are for the Paid Lead Gen pages

    /**************************************************************
     * http://www.integrativenutrition.com/info-nutritioneducation
     **************************************************************/

    @Test //Tests if banner is displayed
    public void bannerDisplayed() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation");
        boolean bannerAppear = PaidLeadGen.headerBanner.isDisplayed();
        try {
            Assert.assertTrue(bannerAppear);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Tests form won't submit if name field is blank
    public void nameValidation() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation");
        Forms.inputEmail("paidLeadTest@qatest.edu");
        Forms.clickSubmitButton();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/info-nutritioneducation");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Tests that form won't submit if email field is blank
    public void emailValidation() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation");
        Forms.inputName("qaTest");
        Forms.clickSubmitButton();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/info-nutritioneducation");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Tests that flags match country code using Fiji
    public void countryFlagMatch() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation");
        Forms.selectFlag();
        WebElement fiji = driver.findElement(By.xpath(".//*[@id='webform-component-Home-Phone--c']/div[1]/div/ul/li[76]/span[1]"));
        fiji.click();
        Forms.enterPhoneNumber("1111111111");
        Forms.clickSubmitButton();
        String phoneValue = Forms.formPhone.getAttribute("value");
        boolean fijiFlag = phoneValue.contains("679");
        try {
            Assert.assertTrue(fijiFlag);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test //Tests that form submits properly
    public void formSubmit() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation");
        Forms.inputName("qaTest");
        Forms.inputEmail("qatesting@qatest.edu");
        Forms.clickSubmitButton();
        boolean expectedUrl= driver.getCurrentUrl().contains("http://www.integrativenutrition.com/class-thank-you?sid=");
        try {
            Assert.assertTrue(expectedUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**************************************************************
     * http://www.integrativenutrition.com/info-nutritioneducation-r
     **************************************************************/

    @Test //Tests if banner is displayed
    public void bannerDisplayedR() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation-r");
        boolean bannerAppear = PaidLeadGen.headerBanner.isDisplayed();
        try {
            Assert.assertTrue(bannerAppear);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Tests form won't submit if name field is blank
    public void nameValidationR() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation-r");
        Forms.inputEmail("paidLeadTest@qatest.edu");
        Forms.clickSubmitButton();
        boolean currentUrl = driver.getCurrentUrl().contains("http://www.integrativenutrition.com/info-nutritioneducation-r");
        try {
            Assert.assertTrue(currentUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Tests that form won't submit if email field is blank
    public void emailValidationR() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation-r");
        Forms.inputName("qaTest");
        Forms.clickSubmitButton();
        boolean currentUrl = driver.getCurrentUrl().contains("http://www.integrativenutrition.com/info-nutritioneducation-r");
        try {
            Assert.assertTrue(currentUrl);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Tests that flags match country code using Jamaica
    public void countryFlagMatchR() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation-r3");
        Forms.clickPhoneBox();
        Forms.selectFlag();
        WebElement jamaica = driver.findElement(By.xpath(".//*[@id='webform-component-Home-Phone--c']/div[1]/div/ul/li[108]/span[1]"));
        jamaica.click();
        Forms.enterPhoneNumber("1111111111");
        Forms.clickSubmitButton();
        String phoneValue = Forms.formPhone.getAttribute("value");
        boolean jamiacaFlag = phoneValue.contains("876");
        try {
            Assert.assertTrue(jamiacaFlag);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Tests that form submits properly
    public void formSubmitR() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation-r");
        Forms.inputName("qaTest");
        Forms.inputEmail("qatesting@qatest.edu");
        Forms.clickSubmitButton();
        boolean expectedUrl= driver.getCurrentUrl().contains("http://www.integrativenutrition.com/class-thank-you?sid=");
        try {
            Assert.assertTrue(expectedUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**************************************************************
     * http://www.integrativenutrition.com/info-nutritioneducation-d
     **************************************************************/

    @Test //Tests if banner is displayed
    public void bannerDisplayedD() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation-d");
        boolean bannerAppear = PaidLeadGen.headerBanner.isDisplayed();
        try {
            Assert.assertTrue(bannerAppear);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Tests form won't submit if name field is blank
    public void nameValidationD() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation-d");
        Forms.inputEmail("paidLeadTest@qatest.edu");
        Forms.clickSubmitButton();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/info-nutritioneducation-d");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Tests that form won't submit if email field is blank
    public void emailValidationD() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation-d");
        Forms.inputName("qaTest");
        Forms.clickSubmitButton();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/info-nutritioneducation-d");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Tests that flags match country code using Uruguay
    public void countryFlagMatchD() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation-d");
        Forms.selectFlag();
        WebElement uruguay = driver.findElement(By.xpath(".//*[@id='webform-component-Home-Phone--c']/div[1]/div/ul/li[230]/span[1]"));
        uruguay.click();
        Forms.enterPhoneNumber("1111111111");
        Forms.clickSubmitButton();
        String phoneValue = Forms.formPhone.getAttribute("value");
        boolean uruguayFlag = phoneValue.contains("598");
        try {
            Assert.assertTrue(uruguayFlag);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Tests that form submits properly
    public void formSubmitD() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation-d");
        Forms.inputName("qaTest");
        Forms.inputEmail("qatesting@qatest.edu");
        Forms.clickSubmitButton();
        boolean expectedUrl= driver.getCurrentUrl().contains("http://www.integrativenutrition.com/class-thank-you?sid=");
        try {
            Assert.assertTrue(expectedUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    }





