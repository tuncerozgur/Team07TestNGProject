package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddBillingAddressPage {
    public AddBillingAddressPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[@class='login inline-type']")
    public WebElement signInButton;


    @FindBy(xpath = "(//input[@id='username'])[1]")
    public WebElement userName;


    @FindBy(xpath = "(//input[@id='password'])[1]")
    public WebElement password;


    @FindBy(xpath = "//button[@value='Sign In']")
    public WebElement signIn2Button;


    @FindBy(xpath = "//span[.='Sign Out']")
    public WebElement signOutButton;

    @FindBy(xpath = "//li[@id='menu-item-1079']")
    public WebElement myAccountButton;

    @FindBy(xpath = "//a[.='Addresses']")
    public WebElement addressButton;

    @FindBy(xpath = "(//a[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]")
    public WebElement addButton;


    @FindBy(xpath = "//input[@id='billing_first_name']")
    public WebElement firstName;


    @FindBy(xpath = "//input[@id='billing_last_name']")
    public WebElement lastName;


    @FindBy(xpath = "//span[@aria-label='Country / Region']")
    public WebElement countryButton;



    @FindBy(xpath = "//input[@id='billing_address_1']")
    public WebElement streetTextBox;



    @FindBy(xpath = "//input[@id='billing_city']")
    public WebElement townTextBox;



    @FindBy(xpath = "//input[@id='billing_postcode']")
    public WebElement zipcodeBox;


    @FindBy(xpath = "//span[@aria-label='State']]")
    public WebElement provinceButton;


    @FindBy(xpath = "//input[@id='billing_phone']")
    public WebElement phoneTextBox;


    @FindBy(xpath = "//button[@value='Save address']")
    public WebElement saveAdressButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement successMessage;


    @FindBy(xpath = "//a[.='Edit Your Billing Address']")
    public WebElement editAddressButton;

    @FindBy(xpath = "//input[@name='billing_address_2']")
    public WebElement upDateAddress;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement editSuccessMessage;


    @FindBy (xpath = "//div[@class='page-title-bar']")
    public WebElement invalidFirstNameMsg;

    @FindBy(xpath = "//div[@class='page-title-wrap']")
    public WebElement invalidPhoneMsg;

}
