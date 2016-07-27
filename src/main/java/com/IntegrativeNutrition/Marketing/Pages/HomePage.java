package com.IntegrativeNutrition.Marketing.Pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {

    /************************************
     * CONSTRUCTORS
     ***********************************/
    public HomePage(WebDriver _driver){
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

    
    //Banner
    @FindBy(how = How.XPATH, using = "//header[@role='banner']")
    private static WebElement headerBanner;

    //Banner Text
    @FindBy(how = How.CSS, using = "h1.page-heading")
    private static WebElement pageHeadingH1;
   
    
    //Watch Our Video Button
    @FindBy(how = How.XPATH, using = "//div[9]/div/div")
    private static WebElement watchVideoButton;
    

    //Sample Our Program button
    @FindBy(how = How.XPATH, using = ".//*[@id='block-system-main']/div[1]/div/div/div/div[9]/div/div[2]/a/span")
    private static WebElement sampleProgramButton;

    //Body Text
    @FindBy(how = How.XPATH, using = "//section[@id='block-system-main']/div[2]/div/div/div/div/div/div/div/div/div/div/h2[2]")
    private static WebElement CopyText;

    //Join a Movement
    @FindBy(how = How.XPATH, using = "//section[@id='block-system-main']/div[2]/div/div/div/div/div/div/div/div/div/div/div/div/h3")
    private static WebElement JoinAMovement;
    
    //Become a Health Coach
    @FindBy(how = How.XPATH, using = "//section[@id='block-system-main']/div[2]/div/div/div/div/div/div/div/div/div/div/div/div[2]/h3")
    private static WebElement BecomeAHealthCoach;
    
    //Study Nutrition Online
    @FindBy(how = How.XPATH, using = "//section[@id='block-system-main']/div[2]/div/div/div/div/div/div/div/div/div/div/div/div[3]/h3")
    private static WebElement StudyNutrition;
    
    
    //Slideshow
    @FindBy(how = How.ID, using = "node-6316")
    private static WebElement SlideShow;
    
    
    //---------------------------------Video modal-------------------------------------------

    //Modal Close button - closes all modals
    @FindBy(xpath = "//*[@id='modalVideo-1']/div/button")
    private static WebElement modalCloseButton;
  
    		
    //Play/Pause button
    @FindBy (xpath = "//button[@class='ytp-play-button ytp-button']")
    private static WebElement playButton;


    //Video Elapsed Field
    @FindBy (xpath = "//span[@class='ytp-time-current']")
    private static WebElement videoElapsed;

    
    //----------------------------------Promo modal---------------------------------------

    //Close button
    @FindBy (xpath = "(//button[@type='button'])[5]")
    private static WebElement promoCloseButton;

   
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
    
    public void clickWatchVideo (){
        watchVideoButton.click();
    }
    
    public void clickSampleProgram () {
        sampleProgramButton.click();
    }
   
    public void closeModal() {
    	
    	modalCloseButton.click();
    }
    
    
    public void closePromo(){
    	
    	driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
    	boolean exists = driver.findElements( By.id("(//button[@type='button'])[5]") ).size() != 0;
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	
    	if(exists){
        	promoCloseButton.click();
    	}
    }
    
    public void clickPlayPause(){
        playButton.click();
    }
    
    public boolean verifyBannerIsDisplayed (){
        boolean bannerAppear = HomePage.headerBanner.isDisplayed();
        return bannerAppear;
    }
    
    public boolean verifyBannerTextIsDisplayed(){

        String pageHeadingH1 = HomePage.pageHeadingH1.getText();
        boolean TextPresent = pageHeadingH1.toLowerCase().contains("world's largest nutrition school");
        return TextPresent;
    }
    
    public boolean verifyWatchOurVideoIsPresent(){

        String watchVideoButton = HomePage.watchVideoButton.getText();
        boolean ButtonPresent = watchVideoButton.toLowerCase().contains("watch our video");
        return ButtonPresent;
    }

    public boolean verifySampleOurProgramIsPresent(){

        String sampleProgramButton = HomePage.sampleProgramButton.getText();
        boolean ButtonPresent = sampleProgramButton.toLowerCase().contains("sample our program");
        return ButtonPresent;
    }
    
    public boolean verifyBodyCopyIsPresent(){
    	
    	String CopyText = HomePage.CopyText.getText();
    	String Join = HomePage.JoinAMovement.getText();
    	String Become = HomePage.BecomeAHealthCoach.getText();
    	String Study = HomePage.StudyNutrition.getText();
        boolean TextPresent = CopyText.toLowerCase().contains("passionate about health and wellness?")
        					&& Join.toLowerCase().contains("join a movement to change the world")
        					&& Become.toLowerCase().contains("become a health coach in just six months")
        					&& Study.toLowerCase().contains("study nutrition online anytime, anywhere");
        return TextPresent;
    }
    
    
    public boolean verifySlideShowIsDisplayed (){
        boolean slideShowAppears = HomePage.SlideShow.isDisplayed();
        return slideShowAppears;
    }
    
    public boolean verifyVideoPlayback (){

        driver.switchTo().frame(driver.findElement(By.id("media-youtube-e5ac7sou1s4")));
        WebDriverWait wait = new WebDriverWait(driver,200);
        wait.until(ExpectedConditions.textToBePresentInElement(HomePage.videoElapsed, "1:53"));
        
        String videoElapsed = HomePage.videoElapsed.getText();
        boolean videoComplete = videoElapsed.contains("1:53");
        
        driver.switchTo().defaultContent();
        return videoComplete;
    }

    public boolean assertPageScrolledDown(){
    	JavascriptExecutor executor = (JavascriptExecutor) driver;
    	Long value = (Long) executor.executeScript("return window.scrollY;");
    	if (value > 10){
    		return true;
    	}
    	else
    		return false;
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
    	String phoneValue = HomePage.formPhone.getAttribute("value");
    	return phoneValue;
    }

    
}
