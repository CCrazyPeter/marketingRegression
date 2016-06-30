package com.IntegrativeNutrition.Marketing.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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
    @FindBy(how = How.CSS, using = "css=div.play-button.center-block")
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
    
    public boolean verifyVideoPlayback() {
        driver.manage().timeouts().implicitlyWait(147, TimeUnit.SECONDS);
        driver.switchTo().frame("media-youtube-8f0lea1ov4q");
        String videoElapsed = CurriculumPage.videoElapsed.getText();
        boolean videoComplete = videoElapsed.contains("2:24");
        return videoComplete;
    }
    

}
