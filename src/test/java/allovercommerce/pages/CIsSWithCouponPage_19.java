package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CIsSWithCouponPage_19 {

    public CIsSWithCouponPage_19() {
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[.='Sign In']")//griş butonu
    public WebElement signInButton;

    @FindBy(xpath = "//input[@autocomplete='username']")//username kutusu
    public WebElement userNameTextBox;

    @FindBy(xpath = "//input[@autocomplete='current-password']")//şifre kutusu
    public WebElement passwordTextBox;

    @FindBy(xpath = "//input[@id='rememberme']")//tekrar hatırla kutusu
    public WebElement rememberMeCheckbox;

    @FindBy(xpath = "//button[@name='login']")//giriş kutusundaki sıgn ın
    public WebElement signIn2;

    @FindBy(xpath ="(//input[@class='form-control'])[1]")//urun arama searchBox
    public WebElement searchBox;

    @FindBy(xpath = "//img[@src='https://allovercommerce.com/wp-content/uploads/2023/09/macbook2.png']")//urun arama searchBox
    public WebElement productMac;

    @FindBy(xpath = "//span[@class='cart-name']")//chart page
    public WebElement chartButton;

    @FindBy(xpath = "//img[@src='https://allovercommerce.com/wp-content/uploads/2024/02/erkek-orgu-kazak-modelleri-10-300x300.jpg']")
    public WebElement productSweater;

    @FindBy(xpath = "//a[@class='showcoupon']")
    public WebElement coupunButton;

    @FindBy(xpath = "//*[@id='coupon_code']")
    public WebElement coupunCodeButton; //input[@name='coupon_code']

    @FindBy(xpath = "//button[@name='apply_coupon']")
    public WebElement applyCouponButton;

    @FindBy(xpath = "//div[text()='Coupon code applied successfully.']")
    public WebElement applyCouponText;

    @FindBy(xpath = "//li[text()='Coupon \"asdfa25\" does not exist!']")
    public WebElement applyCoupon2Text;

    @FindBy(xpath = "//button[@class='single_add_to_cart_button button alt']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//a[@class='button checkout wc-forward']")
    public WebElement checkOutButton;

    @FindBy(xpath = "//input[@id='payment_method_cod']")
    public WebElement payAtDoor;

    @FindBy(xpath = "//button[.='Place order']")
    public WebElement placeOrderButton;

    @FindBy(xpath = "//p[.='Thank you. Your order has been received.']")
    public WebElement thanksForYourOrderMessage;
}
