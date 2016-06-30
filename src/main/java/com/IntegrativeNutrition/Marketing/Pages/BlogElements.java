package com.IntegrativeNutrition.Marketing.Pages;

import com.IntegrativeNutrition.Marketing.Global.Common;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.How;
import java.util.*;


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

    
    public void verifyBannerIsDisplayed (){
        boolean bannerAppear = BlogElements.blogHeaderBanner.isDisplayed();
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

}
