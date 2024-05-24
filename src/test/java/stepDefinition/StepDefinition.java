package team12.stepDefinition.uiStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import team12.pages.US01_US02_US03Pages;
import team12.utilities.ConfigReader;
import team12.utilities.Driver;
import team12.utilities.ReusableMethods;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US01_US02_US03Def {

    Response response;
    US01_US02_US03Pages pagesLocat = new US01_US02_US03Pages();
    private static String fakeUsername;
    private static String fakeSurname;
    private static String fakeSsn;
    private static String fakePhoneNumber;
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    public static String emailGetAll;


    @Given("kullanici omer {string} sayfasina gider")
    public void kullaniciOmerSayfasinaGider(String baseUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(baseUrl));
        ReusableMethods.bekle(2);
    }

    @Given("kullanici omer register butonuna tiklar")
    public void kullaniciOmerRegisterButonunaTiklar() {
        pagesLocat.register.click();
    }


    @When("kullanici name {string}, surname {string},birth_place {string}, phone_number {string},gender {string}, birth_day {string},ssn {string},username {string},password{string}")
    public void kullaniciNameSurnameBirth_placePhone_numberGenderBirth_daySsnUsernamePassword(String name, String surname, String birth_place, String phone_number, String gender, String birth_day, String ssn, String username, String password) {
        Faker faker = new Faker();
        //  fakeUsername = faker.name().name();
        // pagesLocat.nameInput.sendKeys(fakeUsername);

        pagesLocat.nameInput.sendKeys(name);

        // fakeUsername = faker.name().name();
        //pagesLocat.surNameInput.sendKeys(fakeSurname);
        pagesLocat.surNameInput.sendKeys(surname);

        pagesLocat.birthPlaceInput.sendKeys(birth_place);
        fakePhoneNumber = faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(1000, 9999);
        pagesLocat.phoneNumberInput.sendKeys(fakePhoneNumber);

        if (gender.equalsIgnoreCase("male")) {
            ReusableMethods.click(pagesLocat.maleRadioButton);
        } else {
            ReusableMethods.click(pagesLocat.femaleRadioButton);
        }


        pagesLocat.birthDay.sendKeys(birth_day);
        fakeSsn = faker.idNumber().ssnValid();
        pagesLocat.ssnInput.sendKeys(fakeSsn);
        fakeUsername = faker.name().username();
        pagesLocat.userNameInput.sendKeys(fakeUsername);
        pagesLocat.passwordInput.sendKeys(password);

    }


    @And("kullanici omer kayit yapildigini dogrular")
    public void kullaniciOmerKayitYapildiginiDogrular() {
        ReusableMethods.bekle(2);
        //  US01_US02_US03Pages pagesLocat = new US01_US02_US03Pages();
        ReusableMethods.click(pagesLocat.registerButton);
        ReusableMethods.visibleWait(pagesLocat.alertMessage, 5);
        assertTrue(pagesLocat.alertMessage.getText().contains("Guest User registered"));
    }


    @Given("kullanici omer contact butonuna tiklar.")
    public void kullaniciOmerContactButonunaTiklar() {
        pagesLocat.contact.click();
        ReusableMethods.bekle(2);
    }


    @When("kullanici name {string}, email {string},subject {string}, message {string}")
    public void kullaniciNameEmailSubjectMessage(String name, String email, String subject, String message) {

        pagesLocat.contactYourName.sendKeys(name);
        ReusableMethods.bekle(1);
        pagesLocat.contactYourEmail.sendKeys(email);
        ReusableMethods.bekle(1);
        pagesLocat.contactYourSubject.sendKeys(subject);
        ReusableMethods.bekle(1);
        //    ReusableMethods.scroll(pagesLocat.contactYourMessage);
        ReusableMethods.bekle(1);
        pagesLocat.contactYourMessage.sendKeys(message);


    }

    @Then("kullanici sendMessage butonuna tiklar")
    public void kullaniciSendMessageButonunaTiklar() {
        ReusableMethods.bekle(1);
        ReusableMethods.click(pagesLocat.contactYourSendMessageButton);
    }

    @And("kullanici kayit mesaji yapildigini dogrular")
    public void kullaniciKayitMesajiYapildiginiDogrular() {
        ReusableMethods.bekle(1);
        ReusableMethods.visibleWait(pagesLocat.alertMessage, 5);
        assertTrue(pagesLocat.contactAlertMessage.getText().contains("Successfully"));
    }

    @When("kullanici sayisal ifadeli name {string}, surname {string},birth_place {string}, phone_number {string},gender {string}, birth_day {string},ssn {string},username {string},password{string}")
    public void kullaniciSayisalIfadeliNameSurnameBirth_placePhone_numberGenderBirth_daySsnUsernamePassword(String name, String surname, String birth_place, String phone_number, String gender, String birth_day, String ssn, String username, String password) {
        Faker faker = new Faker();
        //fakeUsername = faker.name().name();
        //pagesLocat.nameInput.sendKeys(fakeUsername);

        pagesLocat.nameInput.sendKeys(name);

        // fakeUsername = faker.name().name();
        //pagesLocat.surNameInput.sendKeys(fakeSurname);
        pagesLocat.surNameInput.sendKeys(surname);

        pagesLocat.birthPlaceInput.sendKeys(birth_place);
        fakePhoneNumber = faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(1000, 9999);
        pagesLocat.phoneNumberInput.sendKeys(fakePhoneNumber);

        if (gender.equalsIgnoreCase("male")) {
            ReusableMethods.click(pagesLocat.maleRadioButton);
        } else {
            ReusableMethods.click(pagesLocat.femaleRadioButton);
        }


        pagesLocat.birthDay.sendKeys(birth_day);
        fakeSsn = faker.idNumber().ssnValid();
        pagesLocat.ssnInput.sendKeys(fakeSsn);
        fakeUsername = faker.name().username();
        pagesLocat.userNameInput.sendKeys(fakeUsername);
        pagesLocat.passwordInput.sendKeys(password);

    }

    @When("kullanici cinsiyet secmeden name {string}, surname {string},birth_place {string}, phone_number {string},gender {string}, birth_day {string},ssn {string},username {string},password{string}")
    public void kullaniciCinsiyetSecmedenNameSurnameBirth_placePhone_numberGenderBirth_daySsnUsernamePassword(String name, String surname, String birth_place, String phone_number, String gender, String birth_day, String ssn, String username, String password) {
        Faker faker = new Faker();
        fakeUsername = faker.name().name();
        pagesLocat.nameInput.sendKeys(fakeUsername);

        pagesLocat.nameInput.sendKeys(name);

        // fakeUsername = faker.name().name();
        //pagesLocat.surNameInput.sendKeys(fakeSurname);
        pagesLocat.surNameInput.sendKeys(surname);

        pagesLocat.birthPlaceInput.sendKeys(birth_place);
        fakePhoneNumber = faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(1000, 9999);
        pagesLocat.phoneNumberInput.sendKeys(fakePhoneNumber);
/*
        if (gender.equalsIgnoreCase("male")) {
            ReusableMethods.click(pagesLocat.maleRadioButton);
        } else {
            ReusableMethods.click(pagesLocat.femaleRadioButton);
        }

 */

        pagesLocat.birthDay.sendKeys(birth_day);
        fakeSsn = faker.idNumber().ssnValid();
        pagesLocat.ssnInput.sendKeys(fakeSsn);
        fakeUsername = faker.name().username();
        pagesLocat.userNameInput.sendKeys(fakeUsername);
        pagesLocat.passwordInput.sendKeys(password);
    }


    @When("kullanici omer login butonuna tiklar")
    public void kullaniciOmerLoginButonunaTiklar() {
        pagesLocat.Login.click();
        ReusableMethods.bekle(1);
    }


    @Then("kullanici omer usarname girer")
    public void kullaniciOmerUsarnameGirer() {
        pagesLocat.loginUserName.sendKeys(ConfigReader.getProperty("adminName"));
        ReusableMethods.bekle(1);
    }


    @Then("kullanici omer password girer")
    public void kullaniciOmerPasswordGirer() {
        pagesLocat.loginPassword.sendKeys(ConfigReader.getProperty("adminPassword"));
        ReusableMethods.bekle(1);

        //  pagesLocat.sendData(pagesLocat.loginUserName,ConfigReader.getProperty("adminName"));
        // pagesLocat.sendData(pagesLocat.loginPassword,ConfigReader.getProperty("adminPassword"));
    }


    @And("kullanici omer user name login butonuna tiklar")
    public void kullaniciOmerUserNameLoginButonunaTiklar() {
        pagesLocat.loginButton.click();
    }

    @And("kullanici sigin-login oldugunu dogrular")
    public void kullaniciSiginLoginOldugunuDogrular() {
        assertTrue(pagesLocat.loginMenu.isDisplayed());
        ReusableMethods.bekle(1);
    }


    @And("kullanici omer menu secegine tiklar")
    public void kullaniciOmerMenuSecegineTiklar() {
        pagesLocat.loginMenu.click();
        ReusableMethods.bekle(1);
    }

    @And("kullanici omer Guest User secegine tiklar")
    public void kullaniciOmerGuestUserSecegineTiklar() {
        pagesLocat.guestUser.click();
        ReusableMethods.bekle(1);
    }

    @And("kullanici Guest User list sayfasini gorur")
    public void kullaniciGuestUserListSayfasiniGorur() {
        assertTrue(pagesLocat.guestUserText.isDisplayed());
        ReusableMethods.bekle(1);
    }

    @And("Admin Guest User List, Name, Phone Number, SSN, User Name bilgilerini gorur")
    public void adminGuestUserListNamePhoneNumberSSNUserNameBilgileriniGorur() {
        assertTrue(pagesLocat.guestUserText.isDisplayed());
        assertTrue(pagesLocat.guestUserName.isDisplayed());
        assertTrue(pagesLocat.guestUserPhoneNumber.isDisplayed());
        assertTrue(pagesLocat.guestUserSsn.isDisplayed());
        assertTrue(pagesLocat.guestUserUserName.isDisplayed());
    }

    @When("kullanici invalid degerli name {string}, surname {string},birth_place {string}, phone_number {string},gender {string}, birth_day {string},ssn {string},username {string},password{string}")
    public void kullaniciInvalidDegerliNameSurnameBirth_placePhone_numberGenderBirth_daySsnUsernamePassword(String name, String surname, String birth_place, String phone_number, String gender, String birth_day, String ssn, String username, String password) {
        Faker faker = new Faker();
        //  fakeUsername = faker.name().name();
        // pagesLocat.nameInput.sendKeys(fakeUsername);

        pagesLocat.nameInput.sendKeys(name);

        // fakeUsername = faker.name().name();
        //pagesLocat.surNameInput.sendKeys(fakeSurname);
        pagesLocat.surNameInput.sendKeys(surname);

        pagesLocat.birthPlaceInput.sendKeys(birth_place);
        fakePhoneNumber = faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(1000, 9999);
        pagesLocat.phoneNumberInput.sendKeys(fakePhoneNumber);
/*
        if (gender.equalsIgnoreCase("male")) {
            ReusableMethods.click(pagesLocat.maleRadioButton);
        } else {
            ReusableMethods.click(pagesLocat.femaleRadioButton);
        }

 */

        pagesLocat.birthDay.sendKeys(birth_day);
        fakeSsn = faker.idNumber().ssnValid();
        pagesLocat.ssnInput.sendKeys(fakeSsn);
        fakeUsername = faker.name().username();
        pagesLocat.userNameInput.sendKeys(fakeUsername);
        pagesLocat.passwordInput.sendKeys(password);
    }

    @When("kullanici invalid degerli surname name {string}, surname {string},birth_place {string}, phone_number {string},gender {string}, birth_day {string},ssn {string},username {string},password{string}")
    public void kullaniciInvalidDegerliSurnameNameSurnameBirth_placePhone_numberGenderBirth_daySsnUsernamePassword(String name, String surname, String birth_place, String phone_number, String gender, String birth_day, String ssn, String username, String password) {
        Faker faker = new Faker();
        fakeUsername = faker.name().name();
        pagesLocat.nameInput.sendKeys(fakeUsername);

        //pagesLocat.nameInput.sendKeys(name);

        // fakeUsername = faker.name().name();
        //pagesLocat.surNameInput.sendKeys(fakeSurname);
        pagesLocat.surNameInput.sendKeys(surname);

        pagesLocat.birthPlaceInput.sendKeys(birth_place);
        fakePhoneNumber = faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(1000, 9999);
        pagesLocat.phoneNumberInput.sendKeys(fakePhoneNumber);
/*
        if (gender.equalsIgnoreCase("male")) {
            ReusableMethods.click(pagesLocat.maleRadioButton);
        } else {
            ReusableMethods.click(pagesLocat.femaleRadioButton);
        }

 */

        pagesLocat.birthDay.sendKeys(birth_day);
        fakeSsn = faker.idNumber().ssnValid();
        pagesLocat.ssnInput.sendKeys(fakeSsn);
        fakeUsername = faker.name().username();
        pagesLocat.userNameInput.sendKeys(fakeUsername);
        pagesLocat.passwordInput.sendKeys(password);
    }

    @When("kullanici invalid degerli birth place name {string}, surname {string},birth_place {string}, phone_number {string},gender {string}, birth_day {string},ssn {string},username {string},password{string}")
    public void kullaniciInvalidDegerliBirthPlaceNameSurnameBirth_placePhone_numberGenderBirth_daySsnUsernamePassword(String name, String surname, String birth_place, String phone_number, String gender, String birth_day, String ssn, String username, String password) {
        Faker faker = new Faker();
        fakeUsername = faker.name().name();
        pagesLocat.nameInput.sendKeys(fakeUsername);

        //pagesLocat.nameInput.sendKeys(name);

        // fakeUsername = faker.name().name();
        //pagesLocat.surNameInput.sendKeys(fakeSurname);
        pagesLocat.surNameInput.sendKeys(surname);

        pagesLocat.birthPlaceInput.sendKeys(birth_place);
        fakePhoneNumber = faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(1000, 9999);
        pagesLocat.phoneNumberInput.sendKeys(fakePhoneNumber);

        pagesLocat.birthDay.sendKeys(birth_day);
        fakeSsn = faker.idNumber().ssnValid();
        pagesLocat.ssnInput.sendKeys(fakeSsn);
        fakeUsername = faker.name().username();
        pagesLocat.userNameInput.sendKeys(fakeUsername);
        pagesLocat.passwordInput.sendKeys(password);
    }

    @When("kullanici invalid degerli phone number name {string}, surname {string},birth_place {string}, phone_number {string},gender {string}, birth_day {string},ssn {string},username {string},password{string}")
    public void kullaniciInvalidDegerliPhoneNumberNameSurnameBirth_placePhone_numberGenderBirth_daySsnUsernamePassword(String name, String surname, String birth_place, String phone_number, String gender, String birth_day, String ssn, String username, String password) {
        Faker faker = new Faker();
        fakeUsername = faker.name().name();
        pagesLocat.nameInput.sendKeys(fakeUsername);

        //pagesLocat.nameInput.sendKeys(name);

        // fakeUsername = faker.name().name();
        //pagesLocat.surNameInput.sendKeys(fakeSurname);
        pagesLocat.surNameInput.sendKeys(surname);

        pagesLocat.birthPlaceInput.sendKeys(birth_place);
        //  fakePhoneNumber = faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(1000, 9999);
        pagesLocat.phoneNumberInput.sendKeys(phone_number);

        pagesLocat.birthDay.sendKeys(birth_day);
        fakeSsn = faker.idNumber().ssnValid();
        pagesLocat.ssnInput.sendKeys(fakeSsn);
        fakeUsername = faker.name().username();
        pagesLocat.userNameInput.sendKeys(fakeUsername);
        pagesLocat.passwordInput.sendKeys(password);
    }

    @When("kullanici invalid name {string}, email {string},subject {string}, message {string}")
    public void kullaniciInvalidNameEmailSubjectMessage(String name, String email, String subject, String message) {

        pagesLocat.contactYourName.sendKeys(name);
        ReusableMethods.bekle(1);
        pagesLocat.contactYourEmail.sendKeys(email);
        ReusableMethods.bekle(1);
        pagesLocat.contactYourSubject.sendKeys(subject);
        ReusableMethods.bekle(1);
        //    ReusableMethods.scroll(pagesLocat.contactYourMessage);
        ReusableMethods.bekle(1);
        pagesLocat.contactYourMessage.sendKeys(message);
    }

    @When("kullanici invalid email name {string}, email {string},subject {string}, message {string}")
    public void kullaniciInvalidEmailNameEmailSubjectMessage(String name, String email, String subject, String message) {

        pagesLocat.contactYourName.sendKeys(name);
        ReusableMethods.bekle(1);
        pagesLocat.contactYourEmail.sendKeys(email);
        ReusableMethods.bekle(1);
        pagesLocat.contactYourSubject.sendKeys(subject);
        ReusableMethods.bekle(1);
        //    ReusableMethods.scroll(pagesLocat.contactYourMessage);
        ReusableMethods.bekle(1);
        pagesLocat.contactYourMessage.sendKeys(message);
    }

    @And("kullanici kayit yapilmadigini dogrular")
    public void kullaniciKayitYapilmadiginiDogrular() {
        ReusableMethods.bekle(1);
        //ReusableMethods.visibleWait(pagesLocat.alertMessage, 5);
        assertTrue(pagesLocat.ssnInput.isDisplayed());


    }

    @Then("kullanici Guest user list bilgilerini delete butonuna tiklayarak siler")
    public void kullaniciGuestUserListBilgileriniDeleteButonunaTiklayarakSiler() {

        WebElement table = Driver.getDriver().findElement(By.xpath("(//tbody[@class='table-group-divider'])"));
        List<WebElement> rows = table.findElements(By.xpath("//tbody/tr/td[1]"));
        for (WebElement kullaniciAdi : rows) {

            if (kullaniciAdi.getText().contains("Aniee")) {
                pagesLocat.deleteButton.click();
            }
            // Assert.assertTrue(kullaniciAdi.getText().contains("Annie"));
        }
    }

    @Then("kullanici silindigini dogrular")
    public void kullanici_silindigini_dogrular() {
        ReusableMethods.bekle(1);
        ReusableMethods.visibleWait(pagesLocat.alertMessage, 5);
        assertTrue(pagesLocat.ssnInput.isDisplayed());
    }

    @And("kullanici Contact Get All secegine tiklar")
    public void kullaniciContactGetAllSecegineTiklar() {

        pagesLocat.contactGetAll.click();
        ReusableMethods.bekle(1);
        emailGetAll = pagesLocat.contactGetEmail.getText();
        System.out.println("emailGetAll = " + emailGetAll);


    }




    // //tbody/tr/td[1]
    // //td[span[text()='Del']]/../td[5]

    // (//div[@class='card-body'])
    // (//tbody[@class='table-group-divider'])
        /*
        WebElement table=Driver.getDriver().findElement(By.xpath("(//div[@class='card-body'])"));
List<WebElement> rows=table.findElements(By.xpath(".//tr"));
for(WebElement row:rows) {
    System.out.println(row.getText());
    Assert.assertTrue(row.getText().contains("English FRIDAY 14:30:00 15:00:00"));
}


Hucre hucre butun data yi yazdirmak istersem kullanirim, ama su an ihtiyac yok
WebElement table=Driver.getDriver().findElement(By.xpath("(//table[@class='table table-striped table-bordered table-hover'])[3]"));
List<WebElement> rows=table.findElements(By.xpath(".//tr"));
for(WebElement row:rows){
    List<WebElement> cells=row.findElements(By.xpath(".//td"));
    for (WebElement cell:cells){
        System.out.println(cell.getText());
    }
}
         */
}
