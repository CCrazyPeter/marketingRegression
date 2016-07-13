package com.IntegrativeNutrition.Marketing.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SampleClassModulePage {

	
    /************************************
     * CONSTRUCTORS
     ***********************************/
    public SampleClassModulePage(WebDriver _driver){
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
    @FindBy(how = How.XPATH, using = "//header[@role='banner']")
    private static WebElement SCMHeaderBanner;
    
    @FindBy(how = How.XPATH, using = "//h1")
    private static WebElement headerText1;
    
    @FindBy(how = How.XPATH, using = "//h1[2]")
    private static WebElement headerText2;

    //Body text
    @FindBy(how = How.CSS, using = "div.pane-content > div > h2")
    private static WebElement bodyText;


    //Video 1 Description
    @FindBy(how = How.CSS, using = "div.description")
    private static WebElement video1;

    //Video 2 Description
    @FindBy(how = How.CSS, using = "div.classes-container.right-content > div.class-container.content > div.description")
    private static WebElement video2;
    
    //Video 3 Description
    @FindBy(how = How.XPATH, using = "//section[@id='block-system-main']/div[3]/div/div/div/div[11]/div/div/div/div[4]")
    private static WebElement video3;
    
    //Video 4 Description
    @FindBy(how = How.XPATH, using = "//section[@id='block-system-main']/div[3]/div/div/div/div[15]/div/div/div[2]/div[4]")
    private static WebElement video4;
    
    //Video 5 Description
    @FindBy(how = How.XPATH, using = "//section[@id='block-system-main']/div[3]/div/div/div/div[17]/div/div/div[2]/div[4]")
    private static WebElement video5;
    
    //Video 6 Description
    @FindBy(how = How.XPATH, using = "//section[@id='block-system-main']/div[3]/div/div/div/div[21]/div/div/div/div[4]")
    private static WebElement video6;
    
    //Video 7 Description
    @FindBy(how = How.XPATH, using = "//section[@id='block-system-main']/div[3]/div/div/div/div[23]/div/div/div/div[4]")
    private static WebElement video7;
    
    //Mission Video
    @FindBy(how = How.XPATH, using = ".//*[@id='block-system-main']/div[3]/div/div/div/div[5]/div/div/div[1]/div/div")
    private WebElement welcomeVideo;
    
    //Modal Close button - closes all modals
    @FindBy(how = How.XPATH, using = "//button[@data-dismiss='modal']")
    private WebElement modalCloseButton;
    
    //Play/Pause button
    @FindBy(how = How.XPATH, using = ".//*[@id='modalVideo-2']/div/div/div/div/div[2]/div[1]")
    private WebElement playButton;    
    
    //Video Elapsed Field
    @FindBy (xpath = ".//*[@id='modalVideo-1']/div/div/div/div/div[2]/div[3]")
    private static WebElement videoElapsed;

    
    
    /************************************
     * PAGE TEST METHODS
     ************************************/

    public void clickWelcomeVideo(){
    	welcomeVideo.click();
    }

    public void closeModal(){
    	modalCloseButton.click();	
    }

    public void clickPlayPause(){
        playButton.click();
    }
    
    public boolean verifyBannerIsDisplayed (){
        boolean bannerAppear = SampleClassModulePage.SCMHeaderBanner.isDisplayed();
        if (bannerAppear){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean verifyBannerTextIsDisplayed(){

        String pageHeadingH1 = SampleClassModulePage.headerText1.getText() + " " + SampleClassModulePage.headerText2.getText(); 
        boolean TextPresent = pageHeadingH1.toLowerCase().contains("welcome, qatest! your first class is starting below.");
        return TextPresent;
    }
    
    
    public boolean verifyBodyTextIsDisplayed(){

        String bodyText = SampleClassModulePage.bodyText.getText(); 
        boolean TextPresent = bodyText.toLowerCase().contains("thank you for your interest in health & nutrition.");
        return TextPresent;
    }
    
    public boolean verifyVideo1TextIsDisplayed(){

        String videoText = SampleClassModulePage.video1.getText(); 
        boolean TextPresent = videoText.toLowerCase().contains("Joshua Rosenthal, MScEd, welcomes you to Integrative Nutrition".toLowerCase());
        return TextPresent;
    }
    
    public boolean verifyVideo2TextIsDisplayed(){

        String videoText = SampleClassModulePage.video2.getText(); 
        boolean TextPresent = videoText.toLowerCase().contains("By improving health and happiness, we create a ripple effect that's changing the world".toLowerCase());
        return TextPresent;
    }
    public boolean verifyVideo3TextIsDisplayed(){

        String videoText = SampleClassModulePage.video3.getText(); 
        boolean TextPresent = videoText.toLowerCase().contains("Inspirational talk to support your health journey".toLowerCase());
        return TextPresent;
    }
    public boolean verifyVideo4TextIsDisplayed(){

        String videoText = SampleClassModulePage.video4.getText(); 
        boolean TextPresent = videoText.toLowerCase().contains("Explore how health coaching will improve your health".toLowerCase());
        return TextPresent;
    }
    public boolean verifyVideo5TextIsDisplayed(){

        String videoText = SampleClassModulePage.video5.getText(); 
        boolean TextPresent = videoText.toLowerCase().contains("Students share their personal experiences with diet and recovering from illness".toLowerCase());
        return TextPresent;
    }
    public boolean verifyVideo6TextIsDisplayed(){

        String videoText = SampleClassModulePage.video6.getText(); 
        boolean TextPresent = videoText.toLowerCase().contains("Discover what you'll learn during our year-long program".toLowerCase());
        return TextPresent;
    }
    public boolean verifyVideo7TextIsDisplayed(){

        String videoText = SampleClassModulePage.video7.getText(); 
        boolean TextPresent = videoText.toLowerCase().contains("Renowned doctor explains how Health Coaches are going to change the healthcare system".toLowerCase());
        return TextPresent;
    }
    
    public boolean verifyVideoPlayback (){
    	driver.manage().timeouts().implicitlyWait(110, TimeUnit.SECONDS);
        driver.switchTo().frame("iin-html5-video-1");
        String videoElapsed = SampleClassModulePage.videoElapsed.getText();
        boolean videoComplete = videoElapsed.contains("1:48");
        if (videoComplete){
            return true;
        }
        else {
            return false;
        }
    }

}
