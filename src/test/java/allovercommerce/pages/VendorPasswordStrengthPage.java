package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorPasswordStrengthPage {
    public VendorPasswordStrengthPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Register']")
    public WebElement registerButton;


    @FindBy(partialLinkText="Become a Vendor")
    public WebElement becomeAvendorText;

    @FindBy(xpath ="//input[@id='passoword']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//div[@id='password_strength']")
    public  WebElement passwordText;
}
