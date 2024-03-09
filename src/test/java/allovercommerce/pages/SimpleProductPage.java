package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class SimpleProductPage {
    public SimpleProductPage() {
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

    @FindBy(xpath = "//*[.='Store Manager']")
    public WebElement storeManagerBolumu;

    @FindBy(xpath = "(//*[.='Store Manager'])[1]")
    public WebElement storeManagerYazisi;

    @FindBy(xpath = "(//span[@class='text'])[4]")
    public WebElement prodoctsDogrulama;

    @FindBy(xpath = "(//*[.='Add New'])[1]")
    public WebElement addNewButton;

    @FindBy(xpath = "(//*[.='Short Description'])[1]")
    public WebElement addSayfaDogrulama;

    @FindBy(xpath = "//*[.='Simple Product']")
    public WebElement simpleProdoctDogrulama;

    @FindBy(xpath = "//input[@id='is_virtual']")
    public WebElement virtualBoxDogrulama;

    @FindBy(xpath = "//input[@id='is_downloadable']")
    public WebElement downloadableBoxDogrulama;

    @FindBy(xpath = "//img[@id='featured_img_display']")
    public WebElement gorsel;

    @FindBy(xpath = "//img[@id='gallery_img_gimage_0_display']")
    public WebElement galeri;


    @FindBy(css = "#__wp-uploader-id-1")
    public WebElement selectFilesButton;

    @FindBy(xpath = "(//button[.='Select Files'])[3]")
    public WebElement selectFilesButton2;

    @FindBy(xpath = "//button[@class='media-menu-item']")
    public WebElement uploadFiles;

    @FindBy(xpath = "//input[@id='regular_price']")
    public WebElement priceBox;

    @FindBy(xpath = "//input[@id='sale_price']")
    public WebElement salePriceBox;

    @FindBy(xpath = "//button[.='Select']")
    public WebElement sagAltSelect;

    @FindBy(xpath = "//textarea[@id='attachment-details-description']")
    public WebElement desciription;

    @FindBy(xpath = "//input[@id='pro_title']")
    public WebElement productTitleBox;

    @FindBy(xpath = "//input[@value='1283']")
    public WebElement gunTarhanalari21;

    @FindBy(xpath = "//button[@id='insert-media-button']")
    public WebElement addMediaButton;


    @FindBy(xpath = "//*[.='Insert into post']")
    public WebElement insertIntoButton;

    @FindBy(xpath = "//body[@data-id='description']")
    public WebElement descriptionBody;

    @FindBy(xpath = "//input[@id='wcfm_products_simple_submit_button']")
    public WebElement submitButonu;




    public class FileUploadHelper {

        public static void uploadFileWithRobot(String filePath) {
            try {
                Robot robot = new Robot();

                // Dosya yolunu kopyala
                StringSelection stringSelection = new StringSelection(filePath);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

                ReusableMethods.bekle(5);
                // CTRL+V (Yapıştır) kısayolu ile dosya yolu yapıştır
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_CONTROL);

                // ENTER tuşu ile dosya seçimi onayla
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
            } catch (AWTException e) {
                e.printStackTrace();
            }
        }
    }




}
