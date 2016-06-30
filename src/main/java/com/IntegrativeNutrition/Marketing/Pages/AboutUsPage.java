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
    
    @FindBy(how = How.XPATH, using = "//*[@id=\"loginForm\"]/div[1]/button")
    private WebElement signInButton;

    
    /************************************
     * PAGE TEST METHODS
     ************************************/

    public void clickRegulatoryInfoLink() {
    	signInButton.click();
    }



}
