package setUpClasses;

import objectRepository.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverInitialization  {
	
    public static WebDriver driver;
    
    @BeforeClass
    public static void createEnvironment() {
        
    	//driver = new FirefoxDriver();
    	
    	System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
    	driver = new ChromeDriver();
        
    	//driver = new SafariDriver();

        driver.manage().deleteAllCookies();
        driver.get("http://www.integrativenutrition.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Initialize all pages
        PageFactory.initElements(driver, new Header());
        PageFactory.initElements(driver, new Footer());
        PageFactory.initElements(driver, new Forms());
        PageFactory.initElements(driver, new HomePage());
        PageFactory.initElements(driver, new CurriculumPage());
        PageFactory.initElements(driver, new InfoSessionsPage());
        PageFactory.initElements(driver, new HealthCoachingPage());
        PageFactory.initElements(driver, new AboutUsPage());
        PageFactory.initElements(driver, new ContactUsPage());
        PageFactory.initElements(driver, new BlogElements());
        PageFactory.initElements(driver, new PaidLeadGen());
    }

    @AfterClass
    public static void tearDownEnvironment(){driver.quit();
    }

}

