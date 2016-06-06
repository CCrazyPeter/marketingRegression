package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import setUpClasses.AbstractPage;


public class Header extends AbstractPage {

    //Home icon
    
	//@FindBy(xpath = ".//*[@id='navbar']/div[2]/div/div[1]/a/span[1]")
    //private static WebElement home;
    //public static void clickHomeIcon(){home.click();}

    @FindBy(xpath = "//div[@id='sticky-header']/div/div/div/div/div[2]/a/span")
    private static WebElement home;
    public static void clickHomeIcon(){home.click();}
    
    //Curriculum icon
    
    //@FindBy (xpath = ".//*[@id='navbar']/div[2]/div/div[2]/nav/ul/li[1]/a")
    //private static WebElement curriculum;
    //public static void clickCurriculumIcon(){curriculum.click();}

    @FindBy (xpath = "//a[contains(text(),'Curriculum Basics')]")
	private static WebElement curriculum;
    public static void clickCurriculumIcon(){curriculum.click();}
    
    
    @FindBy (xpath = "//a[contains(text(),'Educational Partnerships')]")
	private static WebElement EducationalPartnerships;
    public static void clickEducationalPartnershipsIcon(){EducationalPartnerships.click();}

    
    

    //Info sessions icon
    
    //@FindBy (xpath = ".//*[@id='navbar']/div[2]/div/div[2]/nav/ul/li[2]/a")
    //private static WebElement info;
    //public static void clickInfoSessionsIcon(){info.click();}

    @FindBy (xpath = "//div[@id='mini-panel-mega_menu_info_sessions-1']/div/div/div/div/ul/li")
    private static WebElement info;
    public static void clickInfoSessionsIcon(){info.click();}
    
    //Health Coaching icon

	//@FindBy (xpath = ".//*[@id='navbar']/div[2]/div/div[2]/nav/ul/li[3]/a")
    //private static WebElement healthCoach;
	//public static void clickHealthCoachIcon(){healthCoach.click();}

	@FindBy (xpath = "//div[@id='mini-panel-mega_menu_health_coaching-1']/div/div/div")
	private static WebElement healthCoach;
	public static void clickHealthCoachIcon(){healthCoach.click();}
	
	
    //About Us
    @FindBy (xpath = ".//*[@id='navbar']/div[2]/div/div[2]/nav/ul/li[4]/a")
    private static WebElement about;
    public static void clickAboutUsIcon(){about.click();}

    //Phone Number
    //@FindBy (xpath = "//p[@class='telephone-number']")
    @FindBy (css="div.telephone-number")
    public static WebElement phoneNumber;

    //Contact Us
    @FindBy (xpath = ".//*[@id='secondary-menu']/li/a")
    private static WebElement contact;
    public static void clickContactUsIcon(){contact.click();}

    //Search
    @FindBy (id = "edit-search-block-form--2")
    private static WebElement search;
    public static void conductSearch(String term){
        search.sendKeys(term);
        search.sendKeys(Keys.RETURN);}
        
}