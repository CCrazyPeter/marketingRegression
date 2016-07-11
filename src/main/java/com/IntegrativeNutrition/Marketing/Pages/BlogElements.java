package com.IntegrativeNutrition.Marketing.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.How;



public class BlogElements  {
	
    /************************************
     * CONSTRUCTORS
     ***********************************/
    public BlogElements (WebDriver _driver){
        this.driver = _driver;
    }

    /************************************
     * INITIALIZE PAGE
     ************************************/

    WebDriver driver;

    /************************************
     * PAGE ELEMENTS SETUP
     ***********************************/

    //Banner
    @FindBy(how = How.XPATH, using = "//section[@id='block-system-main']/div")
    private static WebElement blogHeaderBanner;
    
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
        boolean bannerAppear = BlogElements.blogHeaderBanner.isDisplayed();
        if (bannerAppear){
            return true;
        }
        else {
            return false;
        }
 }
    
    public boolean assertCorrectURL(String url){
        if (url == driver.getCurrentUrl()){
            return true;
        }
        else {
            return false;
        }
    }

    public void inputName(String name) {
        formName.click();
        formName.sendKeys(name);
    }

    public void inputEmail(String email) {
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

    public void clickSubmitButton() {
        formSubmit.click();
    }

    
    public static String getPhoneValue(){
    	String phoneValue = BlogElements.formPhone.getAttribute("value");
    	return phoneValue;
    }

    
}
