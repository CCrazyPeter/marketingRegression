package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import setUpClasses.AbstractPage;

public class InfoSessionsPage extends AbstractPage {

    //Privacy Policy link
    @FindBy(xpath = ".//*[@id='webform-client-form-6456']/div/p/small/a")
    private static WebElement formprivacy;

    public static void clickPrivacyLink() {
        formprivacy.click();
    }
}
