package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProductAndShopingPage {
    public AddProductAndShopingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[.='Sign In']")
    public WebElement signInButton;

    @FindBy(xpath = "//input[@autocomplete='username']")
    public WebElement userNameBox;

    @FindBy(xpath = "//input[@autocomplete='current-password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='rememberme']")
    public WebElement remembermeKutucugu;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement signIn2Button;

    @FindBy(xpath ="//*[.='Sign Out']")
    public WebElement signOutButonu;

    @FindBy(xpath ="(//input[@class='form-control'])[1]")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@name='add-to-cart']")
    public WebElement addProductChess;

    @FindBy(xpath = "//img[@src='https://allovercommerce.com/wp-content/uploads/2024/03/ip-300x300.jpg']")
    public WebElement productIphone;

    @FindBy(xpath = "//button[@name='add-to-cart']")
    public WebElement addProductIphone;

    @FindBy(xpath = "//a[@class='cart-toggle']")
    public WebElement cartButton;

    @FindBy(xpath = "//a[@class='button checkout wc-forward']")
    public WebElement checkoutButton;

    @FindBy(xpath = "(//input[@value='abriang'])[1]")
    public WebElement billingAdressConfirm;

    @FindBy(xpath = "(//span[@class='woocommerce-Price-amount amount'])[7]")
    public WebElement totalPrice;

    @FindBy(xpath = "//input[@id='payment_method_cod']")
    public WebElement payAtDoor;

    @FindBy(xpath = "//button[.='Place order']")
    public WebElement placeOrderButton;

    @FindBy(xpath = "//p[.='Thank you. Your order has been received.']")
    public WebElement thanksForYourOrderMessage;

    @FindBy(xpath = "//a[.='Orders']")
    public WebElement ordersButton;

    @FindBy(xpath = "(//span[@class='woocommerce-Price-amount amount'])[1]")
    public WebElement amountConfirm;














}

