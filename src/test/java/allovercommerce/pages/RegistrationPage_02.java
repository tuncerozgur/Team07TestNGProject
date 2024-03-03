package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage_02 {
    public RegistrationPage_02() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//a[@class='register inline-type']")
    public WebElement registerButton;

    @FindBy(css ="#reg_username")
    public WebElement userNameTextBox;

    @FindBy(xpath = "//input[@id='reg_email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@id='reg_password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//input[@id='register-policy']")
    public WebElement iAgreeButton;

    @FindBy(xpath = "//button[@name='register']")
    public WebElement signUpButton;

    @FindBy(xpath = "//p[contains(text(),'An account is already registered with your email a')]")
    public WebElement signUpErrorMessageEmail;


    @FindBy(xpath = "//p[contains(text(),'An account is already registered with that username. Please choose another.')]")
    public WebElement signUpErrorMessageUsername;
}
