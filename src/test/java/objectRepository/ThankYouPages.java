package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import setUpClasses.AbstractPage;

public class ThankYouPages extends AbstractPage {

    //Banner
    //@FindBy(xpath = ".//*[@id='navbar']/div[2]")
    @FindBy(xpath ="//header[@role='banner']")
    public static WebElement headerBanner;

    //Video Button
    @FindBy(xpath =".//*[@id='block-system-main']/div[3]/div/div/div/div[3]/div/div")
    private static WebElement watchVideoButton;

    public static void watchVideo (){
        watchVideoButton.click();
    }

    //Modal Close button - closes all modals
    @FindBy(xpath = "//button[@data-dismiss='modal']")
    public static WebElement modalCloseButton;
    public static void closeModal(){modalCloseButton.click();}

    //Play/Pause button
    @FindBy (xpath = "//button[@class='ytp-play-button ytp-button']")
    private static WebElement playButton;
    public static void clickPlayPause(){
        playButton.click();
    }

    //Video Elapsed Field
    @FindBy (xpath = "//span[@class='ytp-time-current']")
    public static WebElement videoElapsed;

}
