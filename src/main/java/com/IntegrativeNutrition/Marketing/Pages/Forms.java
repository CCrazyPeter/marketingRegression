package com.IntegrativeNutrition.Marketing.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Forms {
	
	
    /************************************
     * CONSTRUCTORS
     ***********************************/
    public Forms(WebDriver _driver){
        this.driver = _driver;
    }

    /************************************
     * INITIALIZE PAGE
     ************************************/

    WebDriver driver;

    /************************************
     * PAGE ELEMENTS SETUP
     ***********************************/
    
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

    //Privacy Policy link
    @FindBy(how = How.XPATH, using = ".//*[@id='webform-client-form-6101']/div/p/small/a")
    private static WebElement formprivacy;

    
    /*
    Joshua's Info Session - http://www.integrativenutrition.com/info-sessions
    */
    
    //Date & time drop down
    @FindBy(how = How.ID, using = "edit-submitted-stealthtime-c")
	private static WebElement dateTime;

    //Join Now option
    @FindBy(xpath = "//option[@value='join_now_lp']")
    private static WebElement joinNow;
    
    //First webinar option
    @FindBy(xpath = ".//*[@id='edit-submitted-stealthtime-c']/option[2]")
    private static WebElement firstWebinar;
    
        
    /*
    Contact Us help field
    */
    
    @FindBy(xpath = "edit-submitted-contact-form-how-can-we-help-c")
    private static WebElement helpTextBox;
    
    
    /*
    Paid Lead Gen fields
    */
    
    //"Why Are You Interested in IIN" field
    @FindBy(xpath = "edit-submitted-optininterest-c")
    private static WebElement whyInterestedField;

    //"What Topic Are You Excited to Learn" field
    @FindBy(xpath = "edit-submitted-topic-most-excited-c")
    private static WebElement topicToLearn;
    
    //"When Might You Begin Your Training" field
    @FindBy(xpath = "edit-submitted-time-frame-to-begin-c")
    private static WebElement startTraining;
    
    
    /************************************
     * PAGE TEST METHODS
     ************************************/

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

    public static void clickPrivacyLink() {
        formprivacy.click();
    }
    
    public static String getPhoneValue(){
    	String phoneValue = Forms.formPhone.getAttribute("value");
    	return phoneValue;
    }

    
    /*
        Joshua's Info Session - http://www.integrativenutrition.com/info-sessions
    */

    public static void clickDateTime() {
        dateTime.click();
    }
    
    public static void clickJoinNow(){
    	joinNow.click();
    }

    public static void selectFirstWebinar() {
        firstWebinar.click();
    }

    /*
        Contact Us help field
    */

    public static void fillTextBox(String helpInquiry) {
        helpTextBox.click();
        helpTextBox.sendKeys(helpInquiry);
    }

    /*
        Paid Lead Gen fields
    */

    public static void clickWhyInterested() {
        whyInterestedField.click();
    }


    public static void clickTopicToLearn() {
        topicToLearn.click();
    }


    public static void clickTrainingDate() {
        startTraining.click();
    }

}
