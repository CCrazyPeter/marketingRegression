package com.IntegrativeNutrition.Marketing.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.How;



public class BlogElements  {
	
    /************************************
     * CONSTRUCTORS
     ***********************************/
    public BlogElements (WebDriver _driver){
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
    @FindBy(how = How.XPATH, using = "//section[@id='block-system-main']/div")
    private static WebElement blogHeaderBanner;
    
    
    /************************************
     * PAGE TEST METHODS
     ************************************/

    
    public boolean verifyBannerIsDisplayed (){
        boolean bannerAppear = BlogElements.blogHeaderBanner.isDisplayed();
        if (bannerAppear){
            return true;
        }
        else {
            return false;
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

}
