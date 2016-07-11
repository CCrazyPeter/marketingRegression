package com.IntegrativeNutrition.Marketing.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThankYouPages {

    /************************************
     * CONSTRUCTORS
     ***********************************/
    public ThankYouPages(WebDriver _driver){
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
    private static WebElement headerBanner;
    
    //Video Button
    @FindBy(how = How.XPATH, using = ".//*[@id='block-system-main']/div[3]/div/div/div/div[3]/div/div")
    private static WebElement watchVideoButton;
    
    //Modal Close button - closes all modals
    @FindBy(how = How.XPATH, using = "//button[@data-dismiss='modal']")
    private static WebElement modalCloseButton;
    
    //Play/Pause button
    @FindBy(how = How.XPATH, using = "//button[@class='ytp-play-button ytp-button']")
    private static WebElement playButton;
    
    
    /************************************
     * PAGE TEST METHODS
     ************************************/

    public void watchVideo (){
        watchVideoButton.click();    
    }

    public void closeModal(){
    	modalCloseButton.click();	
    }

    public void clickPlayPause(){
        playButton.click();
    }

    //Video Elapsed Field
    @FindBy (xpath = "//span[@class='ytp-time-current']")
    public static WebElement videoElapsed;
        
    
    public boolean verifyVideoPlayback (){

        driver.switchTo().frame(driver.findElement(By.id("media-youtube-8f0lea1ov4q")));
        WebDriverWait wait = new WebDriverWait(driver,200);
        wait.until(ExpectedConditions.textToBePresentInElement(ThankYouPages.videoElapsed, "2:24"));
        
        String videoElapsed = ThankYouPages.videoElapsed.getText();
        boolean videoComplete = videoElapsed.contains("2:24");
        
        driver.switchTo().defaultContent();
        return videoComplete;
    }
    
    public boolean verifyGuideVideoPlayback (){
    	driver.manage().timeouts().implicitlyWait(122, TimeUnit.SECONDS);
        driver.switchTo().frame("media-youtube-snlfol2uu-g");
        String videoElapsed = ThankYouPages.videoElapsed.getText();
        boolean videoComplete = videoElapsed.contains("2:00");
        if (videoComplete){
        	return true;
        }
        else {
        	return false;
        }
    }
    
    public boolean verifyBannerIsDisplayed (){
        boolean bannerAppear = ThankYouPages.headerBanner.isDisplayed();
        if (bannerAppear){
        	return true;
        }
        else {
        	return false;
        }
    }
    
    
    

}
