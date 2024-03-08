package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountDetailsPage {
    //deneme
    public AccountDetailsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[.='Sign In']")
    public WebElement signInButton;//sağ üst giriş kısmındaki yer

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameBox;//açılan sayfadaki ıd giriş kısmı

    @FindBy(xpath = "//input[@id='password']")//passwordkısmı
    public WebElement passwordBox;
    @FindBy(xpath = "//button[@name='login']")//hepsini yaptıktan sonra giriş butonu
    public WebElement loginBox;

    @FindBy(xpath = "//*[.='Sign Out']")//sayfanın sağ üst kısmındaki saign out butonuna tıklama
    public WebElement signOut;

    @FindBy(xpath = "(//*[.='Account details'])[1]")//sol taraftaki account details butonunun loketi
    public WebElement accountDetailsButton;

    @FindBy(xpath = "//input[@autocomplete='given-name']")//first name kutusu
    public WebElement firstNameBox;

    @FindBy(xpath = "//input[@id='account_last_name']")//last name kutusu
    public WebElement lastNameBox;

    @FindBy(xpath = "//input[@id='account_display_name']")//display kutusu
    public WebElement displayNameBox;

    @FindBy(xpath = "//input[@id='account_email']")//email kutusu
    public WebElement emailAddressBox;

    @FindBy(xpath = "//button[@id='user_description-html']")
    public WebElement textBox;

    @FindBy(xpath = "//textarea[@rows='20']")//biography text
    public WebElement biographyBox;

    @FindBy(xpath = "//input[@id='password_current']")//mevcut şifre
    public WebElement currentPasswordBox;
    @FindBy(xpath = "//input[@id='password_1']")//yeni şifre
    public WebElement newPasswordBox;
    @FindBy(xpath = "//input[@id='password_2']")//yeni şifre tekrar
    public WebElement confirmPasswordBox;

    @FindBy(xpath = "//*[.='Save changes']")//kaydet butonu
    public WebElement saveChangesButton;
}
