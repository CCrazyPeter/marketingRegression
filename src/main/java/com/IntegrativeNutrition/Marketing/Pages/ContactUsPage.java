package com.IntegrativeNutrition.Marketing.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
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
    
    @FindBy(how = How.XPATH, using = "//*[@id='webform-component-Home-Phone--c']/div[1]/div/div[2]/div/ul/li[5]")
    private WebElement unitedKingdom;

    
    @FindBy(how = How.XPATH, using = "//section[@id='block-system-main']/div/div")
    private static WebElement headerBanner;
    
    @FindBy(how = How.CSS, using = "h1")
    private static WebElement headerText;


    @FindBy(how = How.XPATH, using = "//div[@id='node-6121']/div")
    private static WebElement letsConnect;

    @FindBy(how = How.XPATH, using = "//section[@id='block-system-main']/div/div[2]/div/div/div/div[2]/div")
    private static WebElement contactInformation;

    @FindBy(how = How.XPATH, using = "p.first")
    private static WebElement phones;
    
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
    
    
    public void clickUnitedKingdomFlag(){
        unitedKingdom.click();
    }
    
    public boolean verifyBannerIsDisplayed (){
        boolean bannerAppear = ContactUsPage.headerBanner.isDisplayed();
        return bannerAppear;
    }
    
    public boolean verifyBannerTextIsDisplayed(){

        String headerText = ContactUsPage.headerText.getText();
        boolean TextPresent = headerText.toLowerCase().contains("contact us");
        return TextPresent;
    }
    
    
    public boolean verifyLetsConnectIsDisplayed (){
        boolean letsConnectAppear = ContactUsPage.letsConnect.isDisplayed();
        return letsConnectAppear;
    }
    
    public boolean verifycontactInformationIsDisplayed (){
    	String phones = ContactUsPage.phones.getText();
        boolean contactInformationAppear = ContactUsPage.contactInformation.isDisplayed() 
        		&& phones.toLowerCase().contains("us: (877) 730-5444")
        		&& phones.toLowerCase().contains("in the uk: (800) 086-8961")
        		&& phones.toLowerCase().contains("international: +1 (212) 730-5433");
  
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
    
    public void inputName(String name) {
    	formName.click();
    	formName.clear();
        formName.sendKeys(name);
    }

    public void inputEmail(String email) {
    	formEmail.click();
    	formEmail.clear();
        formEmail.sendKeys(email);
    }


    public void selectFlag() {
        formFlag.click();
    }

    public void enterPhoneNumber(String phone) {
    	formPhone.click();
    	formPhone.clear();
        formPhone.sendKeys(phone);
    }

    public void clickSubmitButton() {
        formSubmit.click();
    }
    
    public static String getPhoneValue(){
    	String phoneValue = ContactUsPage.formPhone.getAttribute("value");
    	return phoneValue;
    }

    public boolean verifyAreaCodeMatchesFlag(){
        
    	clickSubmitButton();
        
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	
        Cookie cookie= driver.manage().getCookieNamed("strikeiron");  
        String cookieVal= cookie.getValue();

        boolean containsNumber = cookieVal.contains("447712345678");
        return containsNumber;
    }
    
    
    public void fillTextBox(String helpInquiry) {
        helpTextBox.click();
        helpTextBox.clear();
        helpTextBox.sendKeys(helpInquiry);
    }

}
