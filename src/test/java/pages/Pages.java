package team12.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team12.utilities.ConfigReader;
import team12.utilities.Driver;

public class US01_US02_US03Pages {

    public US01_US02_US03Pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='header_link ms-2']")
    public WebElement Login;

    @FindBy(xpath = "//*[@class='header_link me-2']")
    public WebElement register;

    @FindBy(id="name")
    public WebElement nameInput;

    @FindBy(id="surname")
    public WebElement surNameInput;

    @FindBy(id="birthPlace")
    public WebElement birthPlaceInput;

    @FindBy(id="phoneNumber")
    public WebElement phoneNumberInput;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement femaleRadioButton;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleRadioButton;

    @FindBy(id= "birthDay")
    public WebElement birthDay;

    @FindBy(id= "ssn")
    public WebElement ssnInput;

    @FindBy(id= "username")
    public WebElement userNameInput;

    @FindBy(id= "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[text()='Register']")
    public WebElement registerButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alertMessage;

    //contanct

    @FindBy(xpath = "//a[normalize-space()='Contact']")
    public WebElement contact;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement contactYourName;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement contactYourEmail;

    @FindBy(xpath = "//input[@id='subject']")
    public WebElement contactYourSubject;

    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement contactYourMessage;

    @FindBy(xpath = "//button[normalize-space()='Send Message']")
    public WebElement contactYourSendMessageButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement contactAlertMessage;

    //

    @FindBy(xpath = "//input[@id='username']")
    public WebElement loginUserName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement loginPassword;

    public void sendData(WebElement element, String str){
        element.sendKeys(str);
    }

    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//button[normalize-space()='Menu']")
    public WebElement loginMenu;

    @FindBy(xpath = "//a[normalize-space()='Guest User']")
    public WebElement guestUser;

    @FindBy(xpath = "//h5[@class='fw-bold p-3 card-header']")
    public WebElement guestUserText;

    @FindBy(xpath = "//th[normalize-space()='Name']")
    public WebElement guestUserName;

    @FindBy(xpath = "//th[normalize-space()='Phone Number']")
    public WebElement guestUserPhoneNumber;

    @FindBy(xpath = "//th[normalize-space()='Ssn']")
    public WebElement guestUserSsn;

    @FindBy(xpath = "//th[normalize-space()='User Name']")
    public WebElement guestUserUserName;

    @FindBy(xpath = "//td[span[text()='Aniee']]/../td[5]")
    public WebElement deleteButton;

    @FindBy(xpath = "//a[normalize-space()='Contact Get All']")
    public WebElement contactGetAll;

    @FindBy(xpath = "//span[normalize-space()='fred@gamil.com']")
    public WebElement contactGetEmail;




}
