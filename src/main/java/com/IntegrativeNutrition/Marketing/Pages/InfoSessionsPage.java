package com.IntegrativeNutrition.Marketing.Pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InfoSessionsPage {

    /************************************
     * CONSTRUCTORS
     ***********************************/
    public InfoSessionsPage(WebDriver _driver){
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
    @FindBy(how = How.CSS, using = "div.band.head ")
    private static WebElement headerBanner;

    //Banner Text
    @FindBy(how = How.CSS, using = "h1")
    private static WebElement pageHeadingH1;
   
        
    //@FindBy(how = How.XPATH, using = ".//*[@id='webform-component-Home-Phone--c']/div[1]/div/ul/li[61]/span[1]")
    @FindBy(how = How.XPATH, using = "//div[@id='webform-component-Home-Phone--c']/div/div/ul/li[61]")
    private WebElement cyprus;
    
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
    
    //Date & time drop down
    @FindBy(how = How.ID, using = "edit-submitted-webinar-date")
	private static WebElement dateTime;

    //Join Now option
    @FindBy(xpath = "//option[@value='join_now_lp']")
    private static WebElement joinNow;
    
    //First webinar option
    @FindBy(xpath = ".//*[@id='edit-submitted-webinar-date']/option[2]")
    private static WebElement firstWebinar;

    //First webinar option
    @FindBy(xpath = "(//button[@type='button'])[5]")
    private static WebElement promoModalClose;

    
    //----------------------------------Promo modal---------------------------------------

    //Close button
    @FindBy (xpath = "(//button[@type='button'])[5]")
    private static WebElement promoCloseButton;

   
    /************************************
     * PAGE TEST METHODS
     ************************************/
    
    
    public boolean verifyBannerIsDisplayed (){
        boolean bannerAppear = InfoSessionsPage.headerBanner.isDisplayed();
        return bannerAppear;
    }
    
    public boolean verifyBannerTextIsDisplayed(){

        String pageHeadingH1 = InfoSessionsPage.pageHeadingH1.getText();
        boolean TextPresent = pageHeadingH1.toLowerCase().contains("Info Sessions".toLowerCase());
        return TextPresent;
    }
    

    public void closePromo(){
    	if(InfoSessionsPage.promoCloseButton.isDisplayed()){
    		promoCloseButton.click();	
    	}
    }

    
    public void clickCyprusFlag(){
    	cyprus.click();	
    }
    
    public boolean assertCorrectURL(String url){
        if (url.equals(driver.getCurrentUrl())){
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

    public void clickPhoneBox() {
        formCheckBox.click();
    }

    public void selectFlag() {
        formFlag.click();
    }

    public void enterPhoneNumber(String phone) {
        formPhone.click();
        formPhone.sendKeys(phone);
    }

    public void clickSubmitButton() {
        formSubmit.click();
    }

    public boolean verifyAreaCodeMatchesFlag(){

    	clickSubmitButton();

    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Cookie cookie= driver.manage().getCookieNamed("strikeiron");  
        String cookieVal= cookie.getValue();

        if(cookieVal.contains("35722456077")){
        	return true;
        }
        else{
    	return false;
        }
    }

    public void clickDateTime() {
        dateTime.click();
    }

    public void clickJoinNow(){
    	joinNow.click();
    }

    public void selectFirstWebinar() {
        firstWebinar.click();
    }

}