package com.IntegrativeNutrition.Marketing.Pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


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
    
    @FindBy(how = How.XPATH, using = ".//*[@id='webform-component-Home-Phone--c']/div[1]/div/ul/li[5]/span[1]")
    private WebElement unitedKingdom;

    //Play Video Button
    @FindBy(how = How.CSS, using = "css=div.play-button.center-block")
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
        if (url == driver.getCurrentUrl()){
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
    	driver.manage().timeouts().implicitlyWait(118, TimeUnit.SECONDS);
        driver.switchTo().frame("media-youtube-aivruz1uyqe");
        String videoElapsed = HealthCoachingPage.videoElapsed.getText();
        boolean videoComplete = videoElapsed.contains("1:56");
        if (videoComplete){
            return true;
        }
        else {
            return false;
        }
    }

}
