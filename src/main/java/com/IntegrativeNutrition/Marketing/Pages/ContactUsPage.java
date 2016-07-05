package com.IntegrativeNutrition.Marketing.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactUsPage {
	
    /************************************
     * CONSTRUCTORS
     ***********************************/
    public ContactUsPage(WebDriver _driver){
        this.driver = _driver;
    }

    /************************************
     * INITIALIZE PAGE
     ************************************/

    WebDriver driver;

    /************************************
     * PAGE ELEMENTS SETUP
     ***********************************/
    
    @FindBy(how = How.XPATH, using = "//section[@id='block-system-main']/div/div")
    private static WebElement headerBanner;

    @FindBy(how = How.XPATH, using = "//div[@id='node-6121']/div")
    private static WebElement letsConnect;

    @FindBy(how = How.XPATH, using = "//section[@id='block-system-main']/div/div[2]/div/div/div/div[2]/div")
    private static WebElement contactInformation;

    
    /************************************
     * PAGE TEST METHODS
     ************************************/
    
    public boolean verifyBannerIsDisplayed (){
        boolean bannerAppear = ContactUsPage.headerBanner.isDisplayed();
        return bannerAppear;
    }
    
    public boolean verifyLetsConnectIsDisplayed (){
        boolean letsConnectAppear = ContactUsPage.letsConnect.isDisplayed();
        return letsConnectAppear;
    }
    
    public boolean verifycontactInformationIsDisplayed (){
        boolean contactInformationAppear = ContactUsPage.contactInformation.isDisplayed();
        return contactInformationAppear;
    }
    
    public boolean assertCorrectURL(String url){
    	
        if (driver.getCurrentUrl().contains(url)){
            return true;
        }
        else {
            return false;
        }
    }

}
