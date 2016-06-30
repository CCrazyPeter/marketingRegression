package com.IntegrativeNutrition.Marketing.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;



public class Header {
	
	
    /************************************
     * CONSTRUCTORS
     ***********************************/
    public Header(WebDriver _driver){
        this.driver = _driver;
    }

    /************************************
     * INITIALIZE PAGE
     ************************************/

    WebDriver driver;

    /************************************
     * PAGE ELEMENTS SETUP
     ***********************************/
    
    //Home icon
    @FindBy(how = How.XPATH, using = "//div[@id='sticky-header']/div/div/div/div/div[2]/a/span")
    private WebElement home;
   
    //Our Curriculum
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Our Curriculum')]")
    private WebElement ourCurriculum;
    
    //Curriculum Basics
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Curriculum Basics')]")
	private WebElement curriculumBasics;
    
    //Curriculum icon - Educational Partnerships
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Educational Partnerships')]")
	private WebElement EducationalPartnerships;

    //Info sessions
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Info Sessions')]")
    private WebElement infoSessions;

    //Info sessions - Sign Up
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Sign Up')]")
    private WebElement signUp;
    
    //Health Coaching
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Health Coaching')]")
	private WebElement healthCoach;
	
    //Health Coaching
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'What is a Health Coach?')]")
	private WebElement whatIsHealthCoach;
    
    //About Us
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'About Us')]")
    private WebElement aboutUs;
    
    //About Us - Who Are we
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Who We Are')]")
    private WebElement whoAreWe;
    
    //Phone Number
    @FindBy(how = How.CSS, using ="div.telephone-number")
    public static WebElement phoneNumber;

    //Contact Us
    @FindBy(how = How.XPATH, using = ".//*[@id='secondary-menu']/li/a")
    private WebElement contact;

    //Search
    @FindBy (id = "edit-search-block-form--2")
    private WebElement search;
    
    /************************************
     * PAGE TEST METHODS
     ************************************/
    
    public void clickHomeIcon(){
    	home.click();
    }
    
    public void clickCurriculumBasics(){
    	Actions actions = new Actions(driver);
    	actions.moveToElement(ourCurriculum);
    	actions.moveToElement(curriculumBasics);
    	actions.click();
    	actions.perform();
    }
	
    public void clickEducationalPartnershipsIcon(){
    	EducationalPartnerships.click();
    }
    
    public void clickInfoSessionsSignUp(){
    	Actions actions = new Actions(driver);
    	actions.moveToElement(infoSessions);
    	actions.moveToElement(signUp);
    	actions.click();
    	actions.perform();
    }
    
	public void clickHealthCoachWhatIs(){
	   	Actions actions = new Actions(driver);
    	actions.moveToElement(healthCoach);
    	actions.moveToElement(whatIsHealthCoach);
    	actions.click();
    	actions.perform();
	}

    public void clickAboutUsWhoAreWe(){
	   	Actions actions = new Actions(driver);
    	actions.moveToElement(aboutUs);
    	actions.moveToElement(whoAreWe);
    	actions.click();
    	actions.perform();
    	
    }
    
    public void clickContactUsIcon(){
    	contact.click();
    }
    
    public void conductSearch(String term){
        search.sendKeys(term);
        search.sendKeys(Keys.RETURN);
    }
    
    
    public void verifyPhoneNumberIsDisplayed() {
	    boolean present = Header.phoneNumber.isDisplayed();
	    try {
	        Assert.assertTrue(present);
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