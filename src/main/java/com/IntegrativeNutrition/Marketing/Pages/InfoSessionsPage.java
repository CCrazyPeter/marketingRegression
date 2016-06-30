package com.IntegrativeNutrition.Marketing.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class InfoSessionsPage {

    /************************************
     * CONSTRUCTORS
     ***********************************/
    public InfoSessionsPage(WebDriver _driver){
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
    
    @FindBy(how = How.XPATH, using = ".//*[@id='webform-component-Home-Phone--c']/div[1]/div/ul/li[61]/span[1]")
    private WebElement cyprus;

    
    /************************************
     * PAGE TEST METHODS
     ************************************/
    

    public void clickCyprusFlag(){
    	cyprus.click();	
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
