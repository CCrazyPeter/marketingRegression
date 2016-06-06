package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import setUpClasses.AbstractPage;

public class PaidLeadGen extends AbstractPage{

    //Banner
    @FindBy(xpath ="//header[@role='banner']")
    public static WebElement headerBanner;

}
