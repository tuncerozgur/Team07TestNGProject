package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorSignInPage_11 {
    public VendorSignInPage_11() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[.='Sign In']")//griş butonu
    public WebElement signInButonu;
    @FindBy(xpath = "//input[@autocomplete='username']")//username kutusu
    public WebElement userNameKutusu;

    @FindBy(xpath = "//input[@autocomplete='current-password']")//şifre kutusu
    public WebElement passwordKutusu;
    @FindBy(xpath = "//input[@id='rememberme']")//tekrar hatırla kutusu
    public WebElement remembermeKutucugu;

    @FindBy(xpath = "//button[@name='login']")//giriş kutusundaki sıgn ın
    public WebElement girisButonu;

    @FindBy(xpath ="//*[.='Sign Out']")//sign out botuno
    public WebElement signOutButonu;

    @FindBy(xpath = "//h2[@class='page-title']")//My account başlığının loketi
    public WebElement myAccountBasligi;

    @FindBy(xpath = "//*[.='Dashboard']")
    public WebElement dashboardBolumu;

    @FindBy(xpath = "//*[.='Store Manager']")
    public WebElement storeManagerBolumu;

    @FindBy(xpath = "(//*[.='Store Manager'])[1]")
    public WebElement storeManagerYazisi;

    @FindBy(xpath = "(//*[.='Orders'])[2]")
    public WebElement ordersBolumu;

    @FindBy(xpath = "//*[.='No order has been made yet.']")
    public WebElement ordersDogrulama;

    @FindBy(xpath = "(//*[.='Downloads'])[2]")
    public WebElement dowloadsBolumu;

    @FindBy(xpath = "//*[.='No downloads available yet.']")
    public WebElement dowloadsDogrulama;

    @FindBy(xpath = "(//*[.='Addresses'])[2]")
    public WebElement addressesBolumu;

    @FindBy(xpath = "//*[.='Billing address']")
    public WebElement addressesDogrulama;

    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-account']")
    public WebElement accountDetailsBolumu;

    @FindBy(xpath = "//*[.='Biography']")
    public WebElement getAccountDetailsDogrulama;

    @FindBy(xpath = "//span[@class='icon-box-icon icon-wishlist']")
    public WebElement wishlistBolumu;

    @FindBy(xpath = "//*[.='No products added to the wishlist']")
    public WebElement wishlistDogrulama;

    @FindBy(xpath = "//*[.='Support Tickets']")
    public WebElement supportTicketsdBolumu;

    @FindBy(xpath = "//*[.='Ticket(s)']")
    public WebElement supportTicketsDogrulama;

    @FindBy(xpath = "//*[.='Followings']")
    public WebElement followingsBolumu;

    @FindBy(xpath = "//*[.='Actions']")
    public WebElement followingDogrulama;

    @FindBy(xpath = "(//*[.='Logout'])[1]")
    public WebElement logoutBolumu;

    @FindBy(xpath = "//*[.='Register']")
    public WebElement cikisDogrulama;

}

