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
