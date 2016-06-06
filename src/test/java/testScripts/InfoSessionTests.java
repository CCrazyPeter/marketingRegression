package testScripts;

import objectRepository.Forms;
import objectRepository.InfoSessionsPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import setUpClasses.DriverInitialization;

public class InfoSessionTests extends DriverInitialization {

    @Before
    public void openInfoSess() {
        driver.get("http://www.integrativenutrition.com/info-sessions");
        Forms.clickDateTime();
        Select webinar = new Select(Forms.dateTime);
        webinar.selectByIndex(1);
        Forms.dateTime.sendKeys(Keys.ENTER);
        }

    @Test //Tests form won't submit if name field is blank
    public void nameValidation() {
        Forms.inputEmail("infoSessTest@qatest.edu");
        Forms.clickSubmitButton();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/info-sessions");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Tests that form won't submit if email field is blank
    public void emailValidation() {
        Forms.inputName("qaTest");
        Forms.clickSubmitButton();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/info-sessions");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Tests that flags match country code using Cyprus
    public void countryFlagMatch() {
        Forms.inputName("qaTest");
        Forms.inputEmail("infoSessTest@qatest.edu");
        Forms.selectFlag();
        WebElement cyprus = driver.findElement(By.xpath(".//*[@id='webform-component-Home-Phone--c']/div[1]/div/ul/li[61]/span[1]"));
        cyprus.click();
        Forms.enterPhoneNumber("1111111111");
        Forms.clickSubmitButton();
        String phoneValue = Forms.formPhone.getAttribute("value");
        boolean cyprusFlag = phoneValue.contains("357");
        try {
            Assert.assertTrue(cyprusFlag);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        @Test //Test Privacy Link goes to correct url
        public void testPrivacyPolicy() {
            InfoSessionsPage.clickPrivacyLink();
            String currentUrl = driver.getCurrentUrl();
            try {
                Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/lp/privacypolicy");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

