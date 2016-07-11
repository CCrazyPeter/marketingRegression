package com.IntegrativeNutrition.Marketing.Pages;

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
  
    @FindBy(how = How.XPATH, using = "//*[@id='webform-component-Home-Phone--c']/div[1]/div/div[2]/div/ul/li[5]")
    private WebElement unitedKingdom;
    
    
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


    /************************************
     * PAGE TEST METHODS
     ************************************/

    

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
        
    	String teststr = driver.getCurrentUrl();
    	
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
