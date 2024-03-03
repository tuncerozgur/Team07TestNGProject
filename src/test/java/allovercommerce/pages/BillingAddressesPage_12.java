package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingAddressesPage_12 {
    public BillingAddressesPage_12() {
        PageFactory.initElements(Driver.getDriver(), this);
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

    @FindBy(xpath = "//*[.='Sign Out']")//sign out botuno
    public WebElement signOutButonu;

    @FindBy(xpath = "//h2[@class='page-title']")//My account başlığının loketi
    public WebElement myAccountBasligi;

    @FindBy(xpath = "(//*[.='Addresses'])[1]")//Sol kısımdaki addreses bölümü
    public WebElement addressesBolumu;

    @FindBy(xpath = "//*[.='Billing address']")//biling yazısnın loketi
    public WebElement billingAddressBasligi;

    @FindBy(xpath = "(//*[.='Add'])[1]")//add butonu
    public WebElement addButonu;

    @FindBy(xpath = "(//form[@method='post'])[1]")
    public WebElement sayfaDogrulamasi;

    @FindBy(xpath = "//input[@autocomplete='given-name']")//isim kutusu
    public WebElement firstNameKutusu;

    @FindBy(xpath = "//input[@autocomplete='family-name']")//soyisim kutusu
    public WebElement lastNameKutusu;

    @FindBy(xpath = "//input[@id='billing_address_1']")//street kutusu
    public WebElement streetAddressKutusu;

    @FindBy(xpath = "//input[@id='billing_city']")//town city
    public WebElement townCityKutusu;

    @FindBy(xpath = "//input[@id='billing_postcode']")//zıp postcode kutusu
    public WebElement zipPostcodeKutusu;

    @FindBy(xpath = "//button[@value='Save address']")//saveaddres butonu
    public WebElement saveAddressButonu;

    @FindBy(xpath = "//div[@class='woocommerce-message alert alert-simple alert-icon alert-close-top alert-success']")
    //butona bastığmızda gelen onay mesajı kaybolan
    public WebElement bilgiMesaji;

    @FindBy(xpath = "//div[@class='page-title-bar']")
    public WebElement firstNameUyariMesaji;

    @FindBy(xpath = "//ul[@class='breadcrumb']")
    public WebElement streetAddressUyariMesaji;

}
