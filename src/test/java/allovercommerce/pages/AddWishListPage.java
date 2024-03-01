package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddWishListPage {
    public AddWishListPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


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


    @FindBy(xpath ="//a[@data-title='Browse wishlist...']")
    public WebElement addToFavorite;

    @FindBy(xpath = "//a[@class='wishlist block-type']")//wishlist page
    public WebElement wishListButton;

    @FindBy(xpath = "//a[.='Macbook V20.1']")
    public WebElement productMac2;

    @FindBy(xpath = "//button[@class='btn btn-quickview btn-outline btn-default btn-rounded btn-sm mr-lg-2']")
    public WebElement quickViewButton;

    @FindBy(xpath = "//button[@class='single_add_to_cart_button button alt']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//a[@class='product-title']")
    public WebElement wishlistPopUp;


    @FindBy(xpath = "//div[@class='elementor-element elementor-element-fbb1175 mr-2 elementor-widget elementor-widget-wolmart_header_cart']")
    public WebElement sepetButton;

    @FindBy(xpath = "//button[@title='Close (Esc)']")
    public WebElement closeAddToCartButton;


    @FindBy(xpath = "//a[@class='button checkout wc-forward']")
    public WebElement checkOutButton;

    @FindBy(xpath = "//input[@value='apple street']")
    public WebElement billingAdressConfirm;

    @FindBy(xpath = "//input[@id='payment_method_cod']")
    public WebElement payAtDoor;

    @FindBy(xpath = "//button[.='Place order']")
    public WebElement placeOrderButton;

    @FindBy(xpath = "//p[.='Thank you. Your order has been received.']")
    public WebElement thanksForYourOrderMessage;




}
