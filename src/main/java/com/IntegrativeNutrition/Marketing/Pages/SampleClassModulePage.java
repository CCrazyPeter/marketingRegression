package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import setUpClasses.AbstractPage;

public class SampleClassModulePage extends AbstractPage {

    //Banner
    @FindBy(xpath ="//header[@role='banner']")
    public static WebElement SCMHeaderBanner;

    //Mission Video
    @FindBy(xpath = ".//*[@id='block-system-main']/div[3]/div/div/div/div[5]/div/div/div[1]/div/div")
    private static WebElement welcomeVideo;
    public static void clickWelcomeVideo(){welcomeVideo.click();}

    //Modal Close button - closes all modals
    @FindBy(xpath = "//button[@data-dismiss='modal']")
    public static WebElement modalCloseButton;
    public static void closeModal(){modalCloseButton.click();}

    //Play/Pause button
    @FindBy (xpath = ".//*[@id='modalVideo-2']/div/div/div/div/div[2]/div[1]")
    private static WebElement playButton;
    public static void clickPlayPause(){
        playButton.click();
    }

    //Video Elapsed Field
    @FindBy (xpath = ".//*[@id='modalVideo-1']/div/div/div/div/div[2]/div[3]")
    public static WebElement videoElapsed;



}
