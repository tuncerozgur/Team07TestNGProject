package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    public RegisterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Register']")
    public WebElement registerButton;


    @FindBy(xpath = "//input[@id='reg_username']")
    public WebElement userName;


    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;


    @FindBy(xpath = "//input[@id='reg_password']")
    public WebElement password;



    @FindBy(xpath = "//input[@id='register-policy']")
    public WebElement agreeButton;


    @FindBy(xpath = "//button[@class='woocommerce-Button woocommerce-button button woocommerce-form-register__submit']")
    public WebElement signInButton;


    @FindBy(xpath ="//span[.='Sign Out']" )
    public WebElement signOutButton;

    @FindBy(xpath = "//a[.='Log out']")
    public WebElement logOutButton;





}
