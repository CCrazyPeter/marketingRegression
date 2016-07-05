package com.IntegrativeNutrition.Marketing.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.How;
import java.util.*;

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

    @FindBy(how = How.ID, using = "username")
    private WebElement usernameTextbox;

    @FindBy(how = How.ID, using = "password")
    private WebElement passwordTextbox;

    @FindBy(how = How.XPATH, using = "//*[@id=\"loginForm\"]/div[1]/button")
    private WebElement signInButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"loginForm\"]/div[2]/span[2]/a")
    private WebElement forgotPasswordlink;

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
    @FindBy(how = How.XPATH, using = "//div[@id='mini-panel-site_footer']/div[3]/div/div/div/div/div/ul/li/a/span/i")
    private static WebElement faceBookIcon;

    //Instagram - click on the icon method
    @FindBy(how = How.XPATH, using = "//div[@id='mini-panel-site_footer']/div[3]/div/div/div/div/div/ul/li[2]/a/span/i")
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
    
    

    /************************************
     * PAGE TEST METHODS
     ************************************/

    public void clickRegulatoryInfoLink() {
        regInfoLink.click();
    }

    public void clickTermsPrivacyLink() {
        termsPrivacyLink.click();
    }

    public void clickAffiliatesLink() {
        affiliatesLink.click();
    }

    public void clickJobsLink() {
        jobsLink.click();
    }

    public void clickFacebookIcon() {
        faceBookIcon.click();
    }

    public boolean assertCorrectURL(String url, boolean newWindow) {
        String currentURL;

        if (newWindow){
            Set <String>handles = driver.getWindowHandles();
            String currentHandle = handles.iterator().next();
            driver.switchTo().window(currentHandle);
            currentURL = driver.getCurrentUrl();

            driver.close();

            if (url == currentURL){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            currentURL = driver.getCurrentUrl();
            driver.navigate().back();
            if (url == driver.getCurrentUrl()){
                return true;
            }
            else {
                return false;
            }
        }
    }

    public void clickInstagramIcon() {
        instagramIcon.click();
    }

    public void clickTwitterIcon() {
        twitterIcon.click();
    }

    public void clickYouTubeIcon() {
        youtubeIcon.click();
    }

    public void clickPinterestIcon() {
        pinterestIcon.click();
    }

    public void clickLinkedInIcon() {
        linkedInIcon.click();
    }

    public void clickGPlusIcon() {
        googlePlusIcon.click();
    }

    public void clickAmazonIcon() {
        amazonIcon.click();
    }

    public void clickTumblerIcon() {
        tumblerIcon.click();
    }

    public void clickVineIcon() {
        vineIcon.click();
    }

}




