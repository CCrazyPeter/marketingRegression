package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import setUpClasses.AbstractPage;

public class Forms extends AbstractPage {

    //First Name text box
    @FindBy(id = "edit-submitted-firstname")
    private static WebElement formName;

    public static void inputName(String name) {
        formName.click();
        formName.sendKeys(name);
    }

    //Email text box
    @FindBy(id = "edit-submitted-email")
    private static WebElement formEmail;

    public static void inputEmail(String email) {
        formEmail.click();
        formEmail.sendKeys(email);
    }

    //Call checkbox
    @FindBy(id = "edit-submitted-please-call-c-1")
    private static WebElement formCheckBox;

    public static void clickPhoneBox() {
        formCheckBox.click();
    }

    //Country flag dropdown
    @FindBy(xpath = "//div[@class='selected-flag']")
    private static WebElement formFlag;
    public static void selectFlag() {
        formFlag.click();
    }

    //Phone text field
    @FindBy(id = "edit-submitted-home-phone-c")
    public static WebElement formPhone;

    public static void enterPhoneNumber(String phone) {
        formPhone.click();
        formPhone.sendKeys(phone);
    }

    //All submit buttons (Register Here, Get Started, etc)
    @FindBy(id = "edit-submit")
    private static WebElement formSubmit;

    public static void clickSubmitButton() {
        formSubmit.click();
    }

    //Privacy Policy link
    @FindBy(xpath = ".//*[@id='webform-client-form-6101']/div/p/small/a")
    private static WebElement formprivacy;

    public static void clickPrivacyLink() {
        formprivacy.click();
    }


    /*
        Joshua's Info Session - http://www.integrativenutrition.com/info-sessions
    */

    //Date & time drop down
    @FindBy(id = "edit-submitted-stealthtime-c")
    private static WebElement dateTime;

    public static void clickDateTime() {
        dateTime.click();
    }

    //Join Now option
    @FindBy(xpath = "//option[@value='join_now_lp']")
    public static WebElement joinNow;

    //First webinar option
    @FindBy(xpath = ".//*[@id='edit-submitted-stealthtime-c']/option[2]")
    private static WebElement firstWebinar;

    public static void selectFirstWebinar() {
        firstWebinar.click();
    }

    /*
        Contact Us help field
    */
    @FindBy(xpath = "edit-submitted-contact-form-how-can-we-help-c")
    private static WebElement helpTextBox;

    public static void fillTextBox(String helpInquiry) {
        helpTextBox.click();
        helpTextBox.sendKeys(helpInquiry);
    }

    /*
        Paid Lead Gen fields
    */

    //"Why Are You Interested in IIN" field
    @FindBy(xpath = "edit-submitted-optininterest-c")
    private static WebElement whyInterestedField;

    public static void clickWhyInterested() {
        whyInterestedField.click();
    }

    //"What Topic Are You Excited to Learn" field
    @FindBy(xpath = "edit-submitted-topic-most-excited-c")
    private static WebElement topicToLearn;

    public static void clickTopicToLearn() {
        topicToLearn.click();
    }

    //"When Might You Begin Your Training" field
    @FindBy(xpath = "edit-submitted-time-frame-to-begin-c")
    private static WebElement startTraining;

    public static void clickTrainingDate() {
        startTraining.click();
    }


}
