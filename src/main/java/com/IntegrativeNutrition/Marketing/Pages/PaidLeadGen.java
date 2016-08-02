package com.IntegrativeNutrition.Marketing.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaidLeadGen {
	
    /************************************
     * CONSTRUCTORS
     ***********************************/
    public PaidLeadGen(WebDriver _driver){
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
    private static WebElement headerBanner;
    
    ///Fiji Flag
    @FindBy(how = How.XPATH, using =".//*[@id='webform-component-Home-Phone--c']/div[1]/div/ul/li[76]/span[1]")
    private WebElement fiji;

    //Jamaica Flag
    @FindBy(how = How.XPATH, using =".//*[@id='webform-component-Home-Phone--c']/div[1]/div/ul/li[108]/span[1]")
    private WebElement jamaica;
    
    //Uruguay Flag
    @FindBy(how = How.XPATH, using =".//*[@id='webform-component-Home-Phone--c']/div[1]/div/ul/li[230]/span[1]")
    private WebElement uruguay;
    
    //---------------------------------------Form-----------------------------------------
    
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
    @FindBy(how = How.XPATH, using = "//div[@id='webform-component-Home-Phone--c']/div/div/div")
    private static WebElement formFlag;
    
    //Phone text field
    @FindBy(how = How.ID, using = "edit-submitted-home-phone-c")
    private static WebElement formPhone;
    
    //All submit buttons (Register Here, Get Started, etc)
    @FindBy(how = How.ID, using = "edit-submit")
    private static WebElement formSubmit;

    
    
    //----------------------------------Promo modal---------------------------------------

    //Close button
    @FindBy (xpath = "(//button[@type='button'])[5]")
    private static WebElement promoCloseButton;

   
    /************************************
     * PAGE TEST METHODS
     ************************************/
    
    public void closePromo(){
    	
    	driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
    	boolean exists = driver.findElements( By.id("(//button[@type='button'])[5]") ).size() != 0;
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	
    	if(exists){
        	promoCloseButton.click();
    	}
    }

    public boolean verifyBannerIsDisplayed (){
        boolean bannerAppear = PaidLeadGen.headerBanner.isDisplayed();
        return bannerAppear;
        
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

   
    public String getPhoneValue(){
    	String phoneValue = PaidLeadGen.formPhone.getAttribute("value");
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
    
    public boolean assertCorrectURL(String url){
        if (url == driver.getCurrentUrl()){
            return true;
        }
        else {
            return false;
        }
    }

    public void clickFijiFlag(){
    	fiji.click();
    }
    
    public void clickJamaicaFlag(){
    	jamaica.click();	
    }
    
    public void clickUruguayFlag(){
    	uruguay.click();
    }
        
}
