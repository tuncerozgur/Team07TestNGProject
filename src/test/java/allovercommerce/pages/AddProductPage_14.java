package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class AddProductPage_14 {
    public AddProductPage_14() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Sign in,signout section
    @FindBy(xpath = "//span[.='Sign In']")
    public WebElement signInButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement signInConfirmButton;

    @FindBy(xpath = "//span[.='Sign Out']")
    public WebElement signOutButton;

    //My account

    @FindBy(xpath = "//h2[.='My Account']")
    public WebElement myAccountPageText;

    //Store Manager

    @FindBy(xpath = "//a[.='Store Manager']")
    public WebElement storeManagerMenu;

    @FindBy(xpath = "(//span[@class='wcfmfa fa-cube'])[1]")
    public WebElement productsMenu;

    @FindBy(xpath = "//span[contains(text(),'Add New')]")
    public WebElement addNewProductButton;


    @FindBy(css = "#product_type")
    public WebElement productType;

    @FindBy(css = "#add_new_product_dashboard")
    public WebElement simpleProduct;

    @FindBy(xpath = "//option[.='Variable Product']")
    public WebElement variableProduct;

    @FindBy(xpath = "//option[@value='grouped']")
    public WebElement groupedProduct;

    @FindBy(xpath = "//option[@value='external']")
    public WebElement externalProduct;

    @FindBy(css = "#insert-media-button")
    public WebElement addMediaButton;

    @FindBy(css = "#insert-media-button")
    public WebElement addMediaInstructions;

    @FindBy(css = "#menu-item-upload")
    public WebElement uploadFilesButton;

    @FindBy(css = "#__wp-uploader-id-1")
    public WebElement selectFilesButton;

    @FindBy(xpath = "//p[.='Showing 1 of 1 media items']")
    public WebElement loadCountConfirm;

    @FindBy(xpath = "//button[normalize-space()='Insert into post']")
    public WebElement insertIntoPostButton;

    @FindBy(xpath = "//img[@src='https://allovercommerce.com/wp-content/uploads/2024/03/images.jpg']")
    public WebElement imageShortDescription;

    @FindBy(xpath = "//button[@data-editor='description']")
    public WebElement descriptionAddMedia;

    @FindBy(xpath = "(//div[@class='media-frame-title'])[1]")
    public WebElement addMediaText;

    @FindBy(xpath = "//img[@data-mce-src='https://allovercommerce.com/wp-content/uploads/2024/03/selectme-300x156.png']")
    public WebElement selectMePng;

    @FindBy(css = "#pro_title")
    public WebElement productTitle;


    @FindBy(xpath = "(//input[@value='1086'])[1]")
    public WebElement categoriesCheckBox;

    @FindBy(xpath = "//body[@id='tinymce']")
    public WebElement shortDescriptionTextArea;

    @FindBy(xpath = "//body[@data-id='description']")
    public WebElement descriptionTextArea;

    @FindBy(xpath = "(//p[normalize-space()='+Add new category'])[1]")
    public WebElement addNewCategory;

    @FindBy(xpath = "//input[@id='wcfm_new_cat']")
    public WebElement categoryName;

    @FindBy(css = "#wcfm_new_parent_cat")
    public WebElement parentCategory;

    @FindBy(xpath = "//button[@class='button wcfm_add_category_bt wcfm_add_taxonomy_bt']")
    public WebElement addCategoryButton;

    @FindBy(xpath = "//span[.='z12']") // herdefasında yeni olacak
    public WebElement categoryConfirm;

    @FindBy(xpath = "(//button[@id='menu-item-upload'])[2]")
    public WebElement uploadFilesButton2;

    @FindBy(css = "#__wp-uploader-id-4")
    public WebElement selectFilesButton2;

    @FindBy(xpath = "//input[@class='wcfm-checkbox checklist_type_product_brand ']")
    public WebElement productBrandsCheckBox;


    @FindBy(xpath = "//p[.='+Add new Product brands']")
    public WebElement addNewProductBrandButton;

    @FindBy(css = "#wcfm_new_product_brand")
    public WebElement productBrandsName;

    @FindBy(xpath = "//select[@name='wcfm_new_parent_product_brand']")
    public WebElement parentTaxonomy;

    @FindBy(xpath = "//button[@data-taxonomy='product_brand']")
    public WebElement addProductBrandFinalStep;

    @FindBy(xpath = "(//input[@class='wcfm-checkbox'])[2]")
    public WebElement finalCheckBox;

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





