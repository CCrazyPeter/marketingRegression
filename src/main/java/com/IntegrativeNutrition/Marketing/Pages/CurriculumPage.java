package com.IntegrativeNutrition.Marketing.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CurriculumPage {
	
    /************************************
     * CONSTRUCTORS
     ***********************************/
    public CurriculumPage(WebDriver _driver){
        this.driver = _driver;
    }

    /************************************
     * INITIALIZE PAGE
     ************************************/

    WebDriver driver;

    /************************************
     * PAGE ELEMENTS SETUP
     ***********************************/
    
    
    //Watch Our Video Button
    @FindBy(how = How.CSS, using = "div.play-button.center-block")
    private static WebElement watchVideoButton;
    
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
    
    public boolean verifyVideoPlayback (){

        driver.switchTo().frame(driver.findElement(By.id("media-youtube-8f0lea1ov4q")));
        WebDriverWait wait = new WebDriverWait(driver,200);
        wait.until(ExpectedConditions.textToBePresentInElement(CurriculumPage.videoElapsed, "2:24"));
        
        String videoElapsed = CurriculumPage.videoElapsed.getText();
        boolean videoComplete = videoElapsed.contains("2:24");
        
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

    public static void selectFlag() {
        formFlag.click();
    }

    public void enterPhoneNumber(String phone) {
        formPhone.click();
        formPhone.sendKeys(phone);
    }

    public void clickSubmitButton() {
        formSubmit.click();
    }

    
    public static String getPhoneValue(){
    	String phoneValue = CurriculumPage.formPhone.getAttribute("value");
    	return phoneValue;
    }


}
