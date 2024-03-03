package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingAddressesPage_13 {

    public ShippingAddressesPage_13() {
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

    @FindBy(xpath = "(//*[.='Addresses'])[1]")//Sol kısımdaki addreses bölümü
    public WebElement addressesBolumu;

    @FindBy(xpath = "(//*[.='Add'])[2]")//add butonu
    public WebElement addButonu;

    @FindBy(xpath = "//input[@autocomplete='given-name']")//isim kutusu
    public WebElement firstNameKutusu;

    @FindBy(xpath = "//input[@autocomplete='family-name']")//soyisim kutusu
    public WebElement lastNameKutusu;

    @FindBy(xpath = "//input[@placeholder='House number and street name']")//street kutusu
    public WebElement streetAddressKutusu;

    @FindBy(xpath = "//input[@autocomplete='postal-code']")//zıp postcode kutusu
    public WebElement zipPostcodeKutusu;

    @FindBy(xpath = "//input[@autocomplete='address-level2']")//town city
    public WebElement townCityKutusu;

    @FindBy(xpath = "//button[@value='Save address']") //save address butonu
    public WebElement saveAddressButonu;

    @FindBy(xpath = "(//table[@class='address-table'])[2]")//butona bastığımızda gelen onay mesajı kaybolan
    public WebElement eklentiDogrulama;

    @FindBy(xpath = "//li[@class=' alert alert-simple alert-icon alert-close-top alert-danger']")
    public WebElement firstNameUyarimesaji;

    @FindBy(xpath = "//li[@data-id='shipping_postcode']")
    public WebElement zipPostUyariMesaji;




}
