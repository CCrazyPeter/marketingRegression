package com.IntegrativeNutrition.Marketing.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutUsPage {

    /************************************
     * CONSTRUCTORS
     ***********************************/
    public AboutUsPage(WebDriver _driver){
        this.driver = _driver;
    }

    /************************************
     * INITIALIZE PAGE
     ************************************/

    WebDriver driver;

    /************************************
     * PAGE ELEMENTS SETUP
     ***********************************/
    
    @FindBy(how = How.XPATH, using = "//section[@id='block-system-main']/div")
    private static WebElement headerBanner;

    
    @FindBy(how = How.CSS, using = "div.play-button.center-block")
    private static WebElement watchVideoButton;
  
    
    //Modal Close button - closes all modals
    @FindBy(xpath = "//*[@id='modalVideo-1']/div/button")
    private static WebElement modalCloseButton;

    //Play/Pause button
    @FindBy (xpath = "//button[@class='ytp-play-button ytp-button']")
    private static WebElement playButton;


    //Video Elapsed Field
    @FindBy (xpath = "//span[@class='ytp-time-current']")
    private static WebElement videoElapsed;
    

    @FindBy (xpath = "//section[@id='block-system-main']/div[4]")
    private static WebElement ourHistory;

    @FindBy (xpath = "//section[@id='block-system-main']/div[5]")
    private static WebElement aboutOurFounder;
    
    @FindBy (xpath = "//section[@id='block-system-main']/div[6]")
    private static WebElement ourCoreValues;

    @FindBy (xpath = "//section[@id='block-system-main']/div[8]")
    private static WebElement ourBoardOfAdvisors;
    
    
    
    /************************************
     * PAGE TEST METHODS
     ************************************/

    public boolean verifyBannerIsDisplayed (){
        boolean bannerAppear = AboutUsPage.headerBanner.isDisplayed();
        return bannerAppear;
    }
    
    public void closeModal() {
    	modalCloseButton.click();
    }
    
    public void clickPlayPause(){
        playButton.click();
    }
    
    public void clickWatchVideo(){
    	watchVideoButton.click();
    }
    
    public boolean verifyVideoPlayback (){

        driver.switchTo().frame(driver.findElement(By.id("media-youtube-lrkty-uqnjy")));
        WebDriverWait wait = new WebDriverWait(driver,200);
        wait.until(ExpectedConditions.textToBePresentInElement(AboutUsPage.videoElapsed, "2:14"));
        
        String videoElapsed = AboutUsPage.videoElapsed.getText();
        boolean videoComplete = videoElapsed.contains("2:14");
        
        driver.switchTo().defaultContent();
        return videoComplete;
    }
    
    public boolean verifyOurHistoryIsDisplayed (){
        boolean ourHistoryAppear = AboutUsPage.ourHistory.isDisplayed();
        return ourHistoryAppear;
    }
    
    public boolean verifyAboutOurFounderIsDisplayed (){
        boolean aboutOurFounderAppear = AboutUsPage.aboutOurFounder.isDisplayed();
        return aboutOurFounderAppear;
    }
    
    public boolean verifyOurCoreValuesIsDisplayed (){
        boolean ourCoreValuesAppear = AboutUsPage.ourCoreValues.isDisplayed();
        return ourCoreValuesAppear;
    }
    
    public boolean verifyOurBoardOfAdvisorsIsDisplayed (){
        boolean ourBoardOfAdvisorsAppear = AboutUsPage.ourBoardOfAdvisors.isDisplayed();
        return ourBoardOfAdvisorsAppear;
    }
}
