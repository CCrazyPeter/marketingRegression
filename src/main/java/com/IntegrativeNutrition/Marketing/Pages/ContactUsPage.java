package com.IntegrativeNutrition.Marketing.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactUsPage {
	
    /************************************
     * CONSTRUCTORS
     ***********************************/
    public ContactUsPage(WebDriver _driver){
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
