package com.IntegrativeNutrition.Marketing.Pages;

import org.openqa.selenium.By;
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
    @FindBy(xpath = "//*[@id='modalVideo-1']/div/button")
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
        //driver.switchTo().frame(driver.findElement(By.id("media-youtube-e5ac7sou1s4")));
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
    
}
