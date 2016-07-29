package com.IntegrativeNutrition.Marketing.Global;

/**
 * Created with IntelliJ IDEA.
 * User: Alex
 * Date Created: 3/28/14
 * Contains test environment methods. This class is used when setting up a test.
 */

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class TestEnvironment {
    private static WebDriver _driver;
    private static WebDriverWait _waitForElement;

    public static WebDriver get_Driver() {
        return _driver;
    }

    public static WebDriverWait get_waitForElement() {
        return _waitForElement;
    }

    public static WebDriver StartEnvironment(String browserName, String browserVersion,
                                             String browserPlatform, String testURL, String testEnvironment,
                                             String browserType) {
        try {

            DesiredCapabilities capabilities = new DesiredCapabilities();

            if (browserVersion != null && !(browserVersion.length() == 0))
                capabilities.setCapability(CapabilityType.VERSION, browserVersion);

            if (browserPlatform != null && !(browserPlatform.length() == 0))
                capabilities.setCapability(CapabilityType.PLATFORM, browserPlatform);

            if (browserName.toLowerCase().equals("chrome") && (testURL == null || testURL.length() == 0)) {
                initializeWebDriver("chromedriver");    //Only need to initialize webdriver for ie and chrome
                capabilities.setCapability(CapabilityType.BROWSER_NAME, browserName);
                _driver = new ChromeDriver(capabilities);
                _driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            }
            else if (browserName.toLowerCase().equals("headless") && (testURL == null || testURL.length() == 0)) {
            	initializeWebDriver("phantomjs");
                capabilities.setCapability(CapabilityType.BROWSER_NAME, browserName);
                _driver = new PhantomJSDriver(capabilities);
                _driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            }
            else if (browserName.toLowerCase().equals("firefox") && (testURL == null || testURL.length() == 0)) {
                capabilities.setCapability(CapabilityType.BROWSER_NAME, browserName);
                _driver = new FirefoxDriver(capabilities);
                _driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            }
            else if (browserName.toLowerCase().equals("ie") && (testURL == null || testURL.length() == 0)) {
                initializeWebDriver("IEDriverServer");    //Only need to initialize webdriver for ie and chrome
                capabilities.setCapability(CapabilityType.BROWSER_NAME, browserName);
                _driver = new InternetExplorerDriver(capabilities);
                _driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            }
            else {
                capabilities.setCapability(CapabilityType.BROWSER_NAME, browserName);
                initializeWebDriver("chromedriver");    //Only need to initialize webdriver for ie and chrome
                _driver = new ChromeDriver();
                _driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            }

            //This must always be set by environment, otherwise tests will fail
            testEnvironment = testEnvironment.toLowerCase();
            if (testEnvironment.equals("test")) {
                Common.FRONTEND_URL = "http://iinsandbox.prod.acquia-sites.com";
            }else if (testEnvironment.equals("stage")) {
                Common.FRONTEND_URL = "http://iinstg.prod.acquia-sites.com";
            }else if (testEnvironment.equals("live")) {
                Common.FRONTEND_URL = "http://iinsandbox.prod.acquia-sites.com";
            } else {
                Common.FRONTEND_URL = "http://www.integrativenutrition.com";
            }

            browserType = browserType.toLowerCase();

            if (browserType.equals("desktop")) {
                _driver.manage().window().maximize();
            } else if (browserType.equals("tablet")) {
                _driver.manage().window().setSize(new Dimension(1199,500));
            } else if (browserType.equals("mobile")) {
                _driver.manage().window().setSize(new Dimension(767,900));
            } else {
                _driver.manage().window().maximize();
            }

            return _driver;
        }
        catch (Exception seleniumError)
        {
            System.out.println(seleniumError.getMessage());
            return null;
        }
    }

    public static void StopEnvironment() {
        try {
            _driver.quit();
            _driver = null ;
        }
        catch (Exception seleniumError)
        {
            System.out.println(seleniumError.getMessage());
        }
    }

    private static void initializeWebDriver(String WebDriverName) {
        String Operation_System = System.getProperty("os.name").toLowerCase();
        String OS_Arch = System.getProperty("os.arch").toLowerCase();
        String OS_Simple_Name = null;
        String OS_Simple_Arch = null;
        String fileExtension = "";
        String webDriverPropertyName = null;

        if (WebDriverName.toLowerCase().equals("chromedriver")) {
            webDriverPropertyName = "chrome";
        } else if (WebDriverName.toLowerCase().equals("iedriverserver")) {
            webDriverPropertyName = "ie";
        } else if (WebDriverName.toLowerCase().equals("phantomjs")){
        	webDriverPropertyName = "phantomjs";
        	
        }

        if (Operation_System.contains("mac")) {
            OS_Simple_Name = "Mac";
            OS_Simple_Arch = "32bit";
        } else if (Operation_System.contains("win")) {
            OS_Simple_Name = "Windows";
            fileExtension = ".exe";
        } else if (Operation_System.contains("nux")) {
            OS_Simple_Name = "Linux";
        }
        
        if (OS_Arch.contains("64") )// && OS_Simple_Arch.length()==0) 
        {
            OS_Simple_Arch = "64bit";
        } else {
            OS_Simple_Arch = "32bit";
        }

        String driveFilePath = System.getProperty("user.dir") + "/target/classes/SeleniumWebDrivers/"
                + OS_Simple_Name + "/"
                + OS_Simple_Arch + "/"
                + WebDriverName
                + fileExtension;

        if (Common.doesFileExist(driveFilePath)) {
            //File cDriver = new File(TestEnvironment.class.getClassLoader().getResource(driveFilePath).getFile());
            File cDriver = new File(driveFilePath);

            //Is it executable
            if (!cDriver.canExecute()) {
                cDriver.setExecutable(true);
            }
            if (webDriverPropertyName.equals("phantomjs")){
            	System.setProperty("phantomjs.binary.path", driveFilePath);
            } else{
            	System.setProperty("webdriver." + webDriverPropertyName + ".driver", driveFilePath);
            }
        } else {

            //If we are on a 64 bit OS but don't have a 64 bit driver, we want to default to 32 bit driver.
            if (OS_Simple_Arch.equals("64bit")) {
                String drive32FilePath = "/SeleniumWebDrivers/"
                        + OS_Simple_Name + "/"
                        + "32bit/"
                        + WebDriverName
                        + fileExtension;

                if (Common.doesFileExist(drive32FilePath)) {
                    File cDriver = new File(driveFilePath);

                    //Is it executable
                    if (!cDriver.canExecute()) {
                        cDriver.setExecutable(true);
                    }
                    if (webDriverPropertyName.equals("phantomjs")){
                    	System.setProperty("phantomjs.binary.path", driveFilePath);
                    } else{
                    	System.setProperty("webdriver." + webDriverPropertyName + ".driver",driveFilePath);
                    }
                }
            }
        }
    }
}


