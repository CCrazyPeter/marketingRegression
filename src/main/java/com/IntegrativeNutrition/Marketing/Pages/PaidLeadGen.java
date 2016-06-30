package com.IntegrativeNutrition.Marketing.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class PaidLeadGen {
    /************************************
     * CONSTRUCTORS
     ***********************************/
    public PaidLeadGen(WebDriver _driver){
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
    
    ///Fiji Flag
    @FindBy(how = How.XPATH, using =".//*[@id='webform-component-Home-Phone--c']/div[1]/div/ul/li[76]/span[1]")
    private WebElement fiji;

    //Jamaica Flag
    @FindBy(how = How.XPATH, using =".//*[@id='webform-component-Home-Phone--c']/div[1]/div/ul/li[108]/span[1]")
    private WebElement jamaica;
    
  //Uruguay Flag
    WebElement uruguay = driver.findElement(By.xpath(".//*[@id='webform-component-Home-Phone--c']/div[1]/div/ul/li[230]/span[1]"));
    
    /************************************
     * PAGE TEST METHODS
     ************************************/

    public void verifyBannerIsDisplayed (){
        boolean bannerAppear = PaidLeadGen.headerBanner.isDisplayed();
        try {
            Assert.assertTrue(bannerAppear);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean assertCorrectURL(String url){
        if (url == driver.getCurrentUrl()){
            return true;
        }
        else {
            return false;
        }
    }
        
    public void clickFijiFlag(){
    	fiji.click();
    }
    
    public void clickJamaicaFlag(){
    	jamaica.click();	
    }
    
    public void clickUruguayFlag(){
    	uruguay.click();
    }
        
}
