package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPage {
    public ShoppingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[.='Sign In']")//Giriş Butonu
    public WebElement signInButton;
    @FindBy(xpath = "//input[@autocomplete='username']")//username
    public WebElement userNameArea;
    @FindBy(xpath = "//input[@autocomplete='current-password']")//password
    public WebElement passwordArea;
    @FindBy(xpath = "//button[@name='login']")//giriş ekranindaki Sign in butonu
    public WebElement loginButton;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/header[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/input[2]")//urun arama
    public WebElement searchBoxButton;
    @FindBy(xpath = "//button[@name='add-to-cart']")//sepete ekle
    public WebElement addToCardButton;
    @FindBy (xpath = "(//span[@class='cart-count'])[1]")
    public WebElement cartButton;
    //@FindBy (className = "//i[@class='fas fa-times']")
    //public WebElement productSweater;
    @FindBy(xpath = "//*[.='View cart']")
    public WebElement viewCartButton;

    @FindBy(xpath = "//button[@class='quantity-plus w-icon-plus']")
    public WebElement plusButton;
    @FindBy(xpath = "//button[@class='quantity-minus w-icon-minus']")
    public WebElement minusButton;
    @FindBy(xpath = "//div[@class='wc-proceed-to-checkout']")
    public WebElement proceedToCheckout;
    @FindBy(xpath = "(//input[@value='Fettucini'])[1]")
    public WebElement lastNameDogrulama;
    @FindBy(xpath = "//input[@id='payment_method_cod']")
    public WebElement PaymentMethods;
    @FindBy(xpath = "//*[.='Place order']")
    public WebElement PlaceOrderButton;

}

