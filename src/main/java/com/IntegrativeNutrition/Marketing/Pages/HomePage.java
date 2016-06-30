package com.IntegrativeNutrition.Marketing.Pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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

    //Banner
    @FindBy(how = How.XPATH, using = "//header[@role='banner']")
    private static WebElement headerBanner;

    //Watch Our Video Button
    @FindBy(how = How.XPATH, using = "//div[9]/div/div")
    private static WebElement watchVideoButton;
    

    //Sample Our Program button
    @FindBy(how = How.XPATH, using = ".//*[@id='block-system-main']/div[1]/div/div/div/div[9]/div/div[2]/a/span")
    private static WebElement sampleProgramButton;

    
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
    
    public void clickSampleProgram () {
        sampleProgramButton.click();
    }
   
    public void closeModal() {
    	modalCloseButton.click();
    }
    
    public void clickPlayPause(){
        playButton.click();
    }
    
    public boolean verifyBannerIsDisplayed (){
        boolean bannerAppear = HomePage.headerBanner.isDisplayed();
        return bannerAppear;
    }
    
    public boolean verifyVideoPlayback (){
    	driver.manage().timeouts().implicitlyWait(115, TimeUnit.SECONDS);
        driver.switchTo().frame("media-youtube-e5ac7sou1s4");
        String videoElapsed = HomePage.videoElapsed.getText();
        boolean videoComplete = videoElapsed.contains("1:53");
        return videoComplete;
    }
    
    public boolean assertPageScrolledDown(){
    	JavascriptExecutor executor = (JavascriptExecutor) driver;
    	Long value = (Long) executor.executeScript("return window.scrollY;");
    	if (value > 100){
    		return true;
    	}
    	else
    		return false;
    }
    
}
