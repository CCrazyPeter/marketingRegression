package com.IntegrativeNutrition.Marketing.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by carlos on 8/9/15.
 */
public class HealthCoachingPage {
	
    /************************************
     * CONSTRUCTORS
     ***********************************/
    public HealthCoachingPage(WebDriver _driver){
        this.driver = _driver;
    }

    /************************************
     * INITIALIZE PAGE
     ************************************/

    WebDriver driver;

    /************************************
     * PAGE ELEMENTS SETUP
     ***********************************/
  
    @FindBy(how = How.CSS, using = "div.band.head")
    private static WebElement headerBanner; 
    
    
    @FindBy(how = How.CSS, using = "h1")
    private static WebElement headerText; 
    
    
    @FindBy(how = How.XPATH, using = "//*[@id='webform-component-Home-Phone--c']/div[1]/div/div[2]/div/ul/li[5]")
    private WebElement unitedKingdom;

   
    @FindBy(how = How.CSS, using = "h2.pane-title")
    private static WebElement worldNeedsHealthCoaches;
    
    
    @FindBy(how = How.CSS, using = "div.pane-title > h2")
    private static WebElement benefitsOfBeingAHealthCoach;
    
    
    @FindBy(how = How.XPATH, using = "//section[@id='block-system-main']/div[5]/div/div/div/div/div/h2")
    private static WebElement healthCoachingIsRightForYou;
    
  
    
    //Play Video Button
    @FindBy(how = How.CSS, using = "div.play-button.center-block")
    private static WebElement watchVideoButton;
    
    //---------------------------------Video modal-------------------------------------------

    //Modal Close button - closes all modals
    @FindBy(xpath = "//button[@data-dismiss='modal']")
    private static WebElement modalCloseButton;

    //Play/Pause button
    @FindBy (xpath = "//button[@class='ytp-play-button ytp-button']")
    private static WebElement playButton;


    //Video Elapsed Field
    @FindBy (xpath = "//span[@class='ytp-time-current']")
    private static WebElement videoElapsed;
    
    
    
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
        boolean bannerAppear = HealthCoachingPage.headerBanner.isDisplayed();
        return bannerAppear;
    }

    public boolean verifyBannerTextIsDisplayed(){

        String headerText = HealthCoachingPage.headerText.getText();
        boolean TextPresent = headerText.toLowerCase().contains("NUTRITION AND HEALTH COACHING".toLowerCase());
        return TextPresent;
    }

    
    public boolean verifyWorldNeedsHealthCoachesIsDisplayed (){
        String worldNeedsHealthCoaches = HealthCoachingPage.worldNeedsHealthCoaches.getText();
        boolean TextPresent = worldNeedsHealthCoaches.toLowerCase().contains("the world needs health coaches");
        return TextPresent;

    }
    
    public boolean verifyHealthCoachingIsRightForYouIsDisplayed (){
        String healthCoachingIsRightForYou = HealthCoachingPage.healthCoachingIsRightForYou.getText();
        boolean TextPresent = healthCoachingIsRightForYou.toLowerCase().contains("health coaching is right for you if...");
        return TextPresent;
    }
    
    public boolean verifybenefitsOfBeingAHealthCoachIsDisplayed (){
        String benefitsOfBeingAHealthCoach = HealthCoachingPage.benefitsOfBeingAHealthCoach.getText();
        boolean TextPresent = benefitsOfBeingAHealthCoach.toLowerCase().contains("benefits of being a health coach");
        return TextPresent;
    }
        
    
    
    public void clickWatchVideo (){
        watchVideoButton.click();
    }

    public void closeModal() {
    	modalCloseButton.click();
    }

    public void clickPlayPause(){
        playButton.click();
    }
    
    public boolean assertCorrectURL(String url){
        String currentURL;
        
    	currentURL = driver.getCurrentUrl();
    	
        if (url.equals(currentURL)){
            return true;
        }
        else {
            return false;
        }
    }
    
    public void clickUnitedKingdomFlag(){
        unitedKingdom.click();
    }
    
    public boolean verifyVideoPlayback (){

        driver.switchTo().frame(driver.findElement(By.id("media-youtube-aivruz1uyqe")));
        WebDriverWait wait = new WebDriverWait(driver,200);
        wait.until(ExpectedConditions.textToBePresentInElement(HealthCoachingPage.videoElapsed, "1:56"));
        
        String videoElapsed = HealthCoachingPage.videoElapsed.getText();
        boolean videoComplete = videoElapsed.contains("1:56");
        
        driver.switchTo().defaultContent();
        return videoComplete;
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

        if(cookieVal.contains("447712345678")){
        	return true;
        }
        else{
    	return false;
        }
    }
    
    
    

}
