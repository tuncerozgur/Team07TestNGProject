package allovercommerce.pages;

import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddShippingAdressPage_04 {
    public AddShippingAdressPage_04() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='login inline-type']")
    public WebElement signInButton;

    @FindBy(xpath = "//button[@name='register']")
    public WebElement signUpButton;

    @FindBy(xpath = "//span[.='Sign Out']")
    public WebElement signOutButton;

    @FindBy(xpath = "//a[.='Log out']")
    public WebElement logOutButton;

    //register
    @FindBy(xpath = "//span[.='Register']")
    public WebElement registerButton;


    @FindBy(css = "#reg_username")
    public WebElement userName;


    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;


    @FindBy(xpath = "//input[@id='reg_password']")
    public WebElement password;



    @FindBy(xpath = "//input[@id='register-policy']")
    public WebElement agreeButton;

    //sign in kısmından giriş için gerekli locate'ler
    @FindBy(css = "#username")
    public WebElement signInUserName;

    @FindBy(css = "#password")
    public WebElement signInPassword;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement signInLoginButton;

    @FindBy(xpath = "(//a[.='My Account'])[1]")
    public WebElement myAccountFooter;

    //my account
    @FindBy(xpath = "//h2[.='My Account']")
    public WebElement myAccountPage;

    @FindBy(xpath = "//a[.='Addresses']")
    public WebElement adressesSection;

    @FindBy(xpath = "(//a[.='Add'])[1]")
    public WebElement addButton;

    @FindBy(css = "#billing_first_name")
    public WebElement billingFirstNameTextBox;

    @FindBy(css = "#billing_last_name")
    public WebElement billingLastNameTextBox;

    @FindBy(css = "#billing_last_name")
    public WebElement billingCompanyName;

    @FindBy(css = "#select2-billing_country-container")
    public WebElement billingCountryRegion;

    @FindBy(xpath = "//input[@name='billing_address_1']")
    public WebElement billingStreetAdress;

    @FindBy(xpath = "//input[@name='billing_city']")
    public WebElement billingTownCity;

    @FindBy(xpath = "//span[@class='select2-selection__placeholder']")
    public WebElement billingState;

    @FindBy(xpath = "//input[@name='billing_postcode']")
    public WebElement billingzipCode;

    @FindBy(xpath = "//button[@value='Save address']")
    public WebElement billingSaveAdressButton;

    @FindBy(xpath = "//div[@class='woocommerce-message alert alert-simple alert-icon alert-close-top alert-success']")
    public WebElement adressChangedMessage;

    @FindBy(xpath = "//li[@class=' alert alert-simple alert-icon alert-close-top alert-danger']")
    public WebElement adressAlertIcon;



}
