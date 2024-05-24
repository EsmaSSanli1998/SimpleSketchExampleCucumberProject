package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Pages {

    public Pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "")
    public WebElement dd;

    @FindBy(xpath = "")
    public WebElement cc;

    @FindBy(id="")
    public WebElement bb;

    @FindBy(id="")
    public WebElement aa;




}
