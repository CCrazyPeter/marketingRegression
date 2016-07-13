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

    @FindBy(how = How.XPATH, using = "//*[@id='webform-component-Home-Phone--c']/div[1]/div/div[2]/div/ul/li[5]")
    private WebElement unitedKingdom;


    @FindBy(how = How.CSS, using = "div.band.head")
    private static WebElement headerBanner;
     
    @FindBy(how = How.CSS, using = "h1")
    private static WebElement headerText;
     
    @FindBy(how = How.CSS, using = "span.hidden-xs")
    private static WebElement bodyText;
    
    @FindBy(how = How.CSS, using = "h2.pane-title")
    private static WebElement ourVisitingTeachers;
    
    @FindBy(how = How.ID, using = "node-6446")
    private static WebElement testimonialsCarrousel;
    
    @FindBy(how = How.CSS, using = "div.pane-content > h2")
    private static WebElement getRealWorldTraining;    
    
    @FindBy(how = How.XPATH, using = "//section[@id='block-system-main']/div[7]/div/div/div/div/div/div/div/div/div/div/div/h2")
    private static WebElement academicPartnership;   
  
    
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

    

    public boolean verifyBannerIsDisplayed (){
        boolean bannerAppear = CurriculumPage.headerBanner.isDisplayed();
        return bannerAppear;
    }
    
    public boolean verifyBannerTextIsDisplayed(){

        String headerText = CurriculumPage.headerText.getText();
        boolean TextPresent = headerText.toLowerCase().contains("world's largest nutrition school");
        return TextPresent;
    }
    
    
    public boolean verifyBodyTextIsDisplayed(){

        String bodyText = CurriculumPage.bodyText.getText();
        boolean TextPresent = bodyText.toLowerCase().contains("integrative nutrition is the only school that explores "
        		+ "more than 100 dietary theories. get an education that will empower you to transform your health and "
        		+ "happiness and launch a fulfilling new career.");
        return TextPresent;
    }
    
    public boolean verifyOurVisitinTeachersIsDisplayed(){

        String headerText = CurriculumPage.headerText.getText();
        boolean TextPresent = headerText.toLowerCase().contains("our visiting teachers");
        return TextPresent;
    }
    
    public boolean verifyTestimonialCarrouselIsDisplayed (){
        boolean bannerAppear = CurriculumPage.testimonialsCarrousel.isDisplayed();
        return bannerAppear;
    }
    
    public boolean verifyGetRealWorldTrainingIsDisplayed(){

        String getRealWorldTraining = CurriculumPage.getRealWorldTraining.getText();
        boolean TextPresent = getRealWorldTraining.toLowerCase().contains("get real world business training");
        return TextPresent;
    }
    
    
    public boolean verifyAcademicPartnershipsIsDisplayed(){

        String headerText = CurriculumPage.headerText.getText();
        boolean TextPresent = headerText.toLowerCase().contains("pursue a bachelor's or a master's degree through our academic partnerships");
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

    
    public static String getPhoneValue(){
    	String phoneValue = CurriculumPage.formPhone.getAttribute("value");
    	return phoneValue;
    }

    public boolean assertCorrectURL(String url){
        String currentURL;
        
    	currentURL = driver.getCurrentUrl();
    	boolean correctURL = currentURL.contains(url);
        return correctURL;
    }
    
    public void clickUnitedKingdomFlag(){
        unitedKingdom.click();
    }

    public boolean verifyAreaCodeMatchesFlag(){
        
    	clickSubmitButton();
        
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	
        Cookie cookie= driver.manage().getCookieNamed("strikeiron");  
        String cookieVal= cookie.getValue();

        boolean containsNumber = cookieVal.contains("447712345678");
        return containsNumber;
    }
    
}
