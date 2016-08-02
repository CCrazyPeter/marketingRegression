package com.IntegrativeNutrition.Marketing.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.How;


import java.util.*;
import java.util.concurrent.TimeUnit;

public class Footer {

    /************************************
     * CONSTRUCTORS
     ***********************************/
    public Footer(WebDriver _driver){
        this.driver = _driver;
    }

    /************************************
     * INITIALIZE PAGE
     ************************************/

    WebDriver driver;


    /************************************
     * PAGE ELEMENTS SETUP
     ***********************************/

    //--------------------------------Form-----------------------------
    

	    //Email text box
	    @FindBy(how = How.ID, using = "edit-submitted-email--2")
	    private static WebElement formEmail;

	    //Form Subscribe button
	    @FindBy(how = How.ID, using = "edit-webform-ajax-submit-9871--2")
	    private static WebElement formSubscribe;
	    
	    //Form Error Message
	    @FindBy(how = How.XPATH, using = "//div[@id='webform-component-email']/div")
	    private static WebElement formMessage;
	    
	  //Form Confirmation Message
	    @FindBy(how = How.CSS, using = "div.webform-confirmation")
	    private static WebElement formConfirmation;
	  
    
    //--------------------------------NEED HELP?-----------------------------
    
    
    //Regulatory Information - click on the link method
    @FindBy(how = How.XPATH, using = "//div[@id='mini-panel-site_footer']/div/div/div/div")
    private static WebElement NeedHelpInfo;


    //*** Page Links **********************************************************************************************

    //Regulatory Information - click on the link method
    @FindBy(how = How.XPATH, using = "//a[contains(@href, '/about/regulatory')]")
    private static WebElement regInfoLink;

    //Terms & Privacy Policy - click on the link method
    @FindBy(how = How.XPATH, using = "//ul[@id='footer-menu']/li[2]/a")
    private static WebElement termsPrivacyLink;

    //Affiliates - click on the link method
    @FindBy(how = How.XPATH, using = "//ul[@id='footer-menu']/li[3]/a")
    private static WebElement affiliatesLink;

    //Jobs - click on the link method
    @FindBy(how = How.XPATH, using = "//ul[@id='footer-menu']/li[4]/a")
    private static WebElement jobsLink;

    //*** Connect With Us *****************************************************************************************
  
    //Facebook - click on the icon method
    @FindBy(how = How.CSS, using = "i.icon-font_facebookcircle")
    private static WebElement faceBookIcon;
    
    //Instagram - click on the icon method
    @FindBy(how = How.CSS, using = "i.icon-font_instacircle")
    private static WebElement instagramIcon;

    //Twitter - click on the icon method
    @FindBy(how = How.XPATH, using = "//div[@id='mini-panel-site_footer']/div[3]/div/div/div/div/div/ul/li[3]/a/span/i")
    private static WebElement twitterIcon;

    //Youtube - click on the icon method
    @FindBy(how = How.XPATH, using = "//div[@id='mini-panel-site_footer']/div[3]/div/div/div/div/div/ul/li[4]/a/span/i")
    private static WebElement youtubeIcon;

    //Pinterest - click on the icon method
    @FindBy(how = How.XPATH, using = "//div[@id='mini-panel-site_footer']/div[3]/div/div/div/div/div/ul/li[5]/a/span/i")
    private static WebElement pinterestIcon;

    //LinkedIn - click on the icon method
    @FindBy(how = How.XPATH, using = "//div[@id='mini-panel-site_footer']/div[3]/div/div/div/div/div/ul/li[6]/a/span/i")
    private static WebElement linkedInIcon;

    //Google Plus - click on the icon method
    @FindBy(how = How.XPATH, using = "//div[@id='mini-panel-site_footer']/div[3]/div/div/div/div/div/ul/li[7]/a/span/i")
    private static WebElement googlePlusIcon;

    //Amazon - click on the icon method
    @FindBy(how = How.XPATH, using = "//div[@id='mini-panel-site_footer']/div[3]/div/div/div/div/div/ul/li[8]/a/span/i")
    private static WebElement amazonIcon;

    //Tumbler - click on the icon method
    @FindBy(how = How.XPATH, using = "html/body/footer/div[1]/div/div[2]/div[3]/ul[1]/li[3]/a/span[1]/i")
    private static WebElement tumblerIcon;

    //Vine - click on the icon method
    @FindBy(how = How.XPATH, using = "html/body/footer/div[1]/div/div[2]/div[3]/ul[2]/li[3]/a/span[1]/i")
    private static WebElement vineIcon;

    //SnapChat - click on the icon method
    @FindBy(how = How.XPATH, using = "html/body/footer/div[1]/div/div[2]/div[3]/ul[3]/li[3]/a/span[1]/i")
    private static WebElement snapchatIcon;
    
    
    //----------------------------------Promo modal---------------------------------------

    //Close button
    @FindBy (xpath = "(//button[@type='button'])[5]")
    private static WebElement promoCloseButton;

   
    /************************************
     * PAGE TEST METHODS
     ************************************/

    public void closePromo(){
    	
    	driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
    	boolean exists = driver.findElements( By.id("(//button[@type='button'])[5]") ).size() != 0;
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	
    	if(exists){
        	promoCloseButton.click();
    	}
    }
    
    public void inputEmail(String email) {
        formEmail.click();
        formEmail.clear();
        formEmail.sendKeys(email);
    }
    
    public void clickSubscribe() {
        formSubscribe.click();
    }
    
    public boolean formMessageDisplayed(String message){
	    String formMessage = Footer.formMessage.getText();
	    boolean TextPresent = formMessage.toLowerCase().contains(message);
	    return TextPresent;
    }
    
    public boolean formConfirmationDisplayed(String message){
	    String formMessage = Footer.formConfirmation.getText();
	    boolean TextPresent = formMessage.toLowerCase().contains(message);
	    return TextPresent;
    }
    
    
    public boolean verifyLocalPhoneNumberIsDisplayed() {
	    String NeedHelpInfo = Footer.NeedHelpInfo.getText();
	    boolean TextPresent = NeedHelpInfo.toLowerCase().contains("us: (877) 730-5444");
	    return TextPresent;
    }
    
    public boolean verifyInternationalPhoneNumberIsDisplayed() {
	    String NeedHelpInfo = Footer.NeedHelpInfo.getText();
	    boolean TextPresent = NeedHelpInfo.toLowerCase().contains("international: (800) 086-8961");
	    return TextPresent;
    }
    
    public void clickRegulatoryInfoLink() {
        // Scroll the browser to the element's Y position (doesn't work in Chrome if the page is not scrolled down)
       ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("window.scrollTo(0,"+regInfoLink.getLocation().y+")");
       // Click the element    	
    	regInfoLink.click();
    }

    public void clickTermsPrivacyLink() {
        // Scroll the browser to the element's Y position (doesn't work in Chrome if the page is not scrolled down)
       ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("window.scrollTo(0,"+termsPrivacyLink.getLocation().y+")");
       // Click the element    	
    	termsPrivacyLink.click();
    }

    public void clickAffiliatesLink() {
        // Scroll the browser to the element's Y position (doesn't work in Chrome if the page is not scrolled down)
       ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("window.scrollTo(0,"+affiliatesLink.getLocation().y+")");
       // Click the element    	
        affiliatesLink.click();
    }

    public void clickJobsLink() {
        // Scroll the browser to the element's Y position (doesn't work in Chrome if the page is not scrolled down)
       ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("window.scrollTo(0,"+jobsLink.getLocation().y+")");
       // Click the element    	
        jobsLink.click();
    }

    
    public boolean assertCorrectURL(String url, boolean newWindow, boolean newTab) throws InterruptedException {
        String currentURL;

        if (newWindow){
            Set <String>handles = driver.getWindowHandles();
            String currentHandle = handles.iterator().next();
            driver.switchTo().window(currentHandle);
            currentURL = driver.getCurrentUrl();

            driver.close();

            return url.equals(currentURL);
        }
        else if(newTab) {
            ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
            
            driver.switchTo().window(tabs2.get(1));

            currentURL = driver.getCurrentUrl();
            
        	if(!url.equals(currentURL)){
        		
        		Thread.sleep(4000);

        		currentURL = driver.getCurrentUrl();

        	}
        	
            driver.close();

            driver.switchTo().window(tabs2.get(0));
            
            return url.equals(currentURL);
            
        }
        else {

        	currentURL = driver.getCurrentUrl();
            
        	driver.navigate().back();

        	return url.equals(currentURL);

        }
    }
    

    public void clickFacebookIcon() {
        // Scroll the browser to the element's Y position (doesn't work in Chrome if the page is not scrolled down)
       ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("window.scrollTo(0,"+faceBookIcon.getLocation().y+")");
       // Click the element
       faceBookIcon.click();
   }

    public void clickInstagramIcon() {
        // Scroll the browser to the element's Y position (doesn't work in Chrome if the page is not scrolled down)
       ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("window.scrollTo(0,"+instagramIcon.getLocation().y+")");
       // Click the element
        instagramIcon.click();
    }

    public void clickTwitterIcon() {
        // Scroll the browser to the element's Y position (doesn't work in Chrome if the page is not scrolled down)
       ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("window.scrollTo(0,"+twitterIcon.getLocation().y+")");
       // Click the element
    	twitterIcon.click();
    }

    public void clickYouTubeIcon() {
        // Scroll the browser to the element's Y position (doesn't work in Chrome if the page is not scrolled down)
       ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("window.scrollTo(0,"+youtubeIcon.getLocation().y+")");
       // Click the element
    	youtubeIcon.click();
    }

    public void clickPinterestIcon() {
        // Scroll the browser to the element's Y position (doesn't work in Chrome if the page is not scrolled down)
       ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("window.scrollTo(0,"+pinterestIcon.getLocation().y+")");
       // Click the element
    	pinterestIcon.click();
    }

    public void clickLinkedInIcon() {
        // Scroll the browser to the element's Y position (doesn't work in Chrome if the page is not scrolled down)
       ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("window.scrollTo(0,"+linkedInIcon.getLocation().y+")");
       // Click the element
    	linkedInIcon.click();
    }

    public void clickGPlusIcon() {
        // Scroll the browser to the element's Y position (doesn't work in Chrome if the page is not scrolled down)
       ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("window.scrollTo(0,"+googlePlusIcon.getLocation().y+")");
       // Click the element
    	googlePlusIcon.click();
    }

    public void clickAmazonIcon() {
        // Scroll the browser to the element's Y position (doesn't work in Chrome if the page is not scrolled down)
       ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("window.scrollTo(0,"+amazonIcon.getLocation().y+")");
       // Click the element
    	amazonIcon.click();
    }

    public void clickTumblerIcon() {
        // Scroll the browser to the element's Y position (doesn't work in Chrome if the page is not scrolled down)
       ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("window.scrollTo(0,"+tumblerIcon.getLocation().y+")");
       // Click the element
    	tumblerIcon.click();
    }

    public void clickVineIcon() {
        // Scroll the browser to the element's Y position (doesn't work in Chrome if the page is not scrolled down)
       ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("window.scrollTo(0,"+vineIcon.getLocation().y+")");
       // Click the element
       vineIcon.click();
    }

}




