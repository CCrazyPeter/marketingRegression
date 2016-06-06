package objectRepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import setUpClasses.AbstractPage;

public class HomePage extends AbstractPage {

    //Banner
    @FindBy(xpath ="//header[@role='banner']")
    public static WebElement headerBanner;

    //Watch Our Video Button
    //@FindBy(xpath =".//*[@id='block-system-main']/div[1]/div/div/div/div[9]/div/div[1]")
    @FindBy(xpath ="//div[9]/div/div")
    //section[@id='block-system-main']/div/div/div/div/div[9]/div/div
    private static WebElement watchVideoButton;
    

    public static void clickWatchVideo (){
        watchVideoButton.click();
    }

    //Sample Our Program button
    @FindBy (xpath =".//*[@id='block-system-main']/div[1]/div/div/div/div[9]/div/div[2]/a/span")
    private static WebElement sampleProgramButton;

    public static void clickSampleProgram () {
        sampleProgramButton.click();
    }

    /*******************************************************************************************
     * Video modal
     *******************************************************************************************/

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
