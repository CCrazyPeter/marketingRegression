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

    
    /*
    Contact Us help field
    */
    
    @FindBy(how = How.ID, using = "edit-submitted-contact-form-how-can-we-help-c")
    private static WebElement helpTextBox;

    
    //First Name text box
    @FindBy(how = How.ID, using = "edit-submitted-firstname")
    private static WebElement formName;

    //Email text box
    @FindBy(how = How.ID, using = "edit-submitted-email")
    private static WebElement formEmail;

    //Call checkbox
    @FindBy(how = How.ID, using = "edit-submitted-please-call-c-1")
    private static WebElement formCheckBox;

    //Country flag dropdown
    @FindBy(how = How.XPATH, using = "//div[@class='selected-flag']")
    private static WebElement formFlag;
    
    //Phone text field
    @FindBy(how = How.ID, using = "edit-submitted-home-phone-c")
    private static WebElement formPhone;
    
    //All submit buttons (Register Here, Get Started, etc)
    @FindBy(how = How.ID, using = "edit-submit")
    private static WebElement formSubmit;

    
    
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
    
    public static void inputName(String name) {
        formName.click();
        formName.sendKeys(name);
    }

    public static void inputEmail(String email) {
        formEmail.click();
        formEmail.sendKeys(email);
    }

    public static void clickPhoneBox() {
        formCheckBox.click();
    }

    public static void selectFlag() {
        formFlag.click();
    }

    public static void enterPhoneNumber(String phone) {
        formPhone.click();
        formPhone.sendKeys(phone);
    }

    public static void clickSubmitButton() {
        formSubmit.click();
    }
    
    public static String getPhoneValue(){
    	String phoneValue = ContactUsPage.formPhone.getAttribute("value");
    	return phoneValue;
    }

    public static void fillTextBox(String helpInquiry) {
        helpTextBox.click();
        helpTextBox.sendKeys(helpInquiry);
    }

}
