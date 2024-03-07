package allovercommerce.pages;


import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CouponCreationPage {

    public CouponCreationPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[.='Sign In']")
    public WebElement loginButton;
    @FindBy(xpath = "//*[@type='text']")
    public WebElement email;
    @FindBy(xpath= "//input[@autocomplete='current-password']")
    public WebElement password;
    @FindBy(id = "menu-item-1079")
    public WebElement myAccountButton;
    @FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--wcfm-store-manager']")
    public WebElement storeManagerButton;
    @FindBy(xpath = "//*[@class='wcfmfa fa-gift']")
    public WebElement coupons;
    @FindBy(id = "add_new_coupon_dashboard")
    public WebElement addNewButton;
    @FindBy(xpath = "//*[@id='title']")
    public WebElement code;
    @FindBy(id = "description")
    public WebElement description;
    @FindBy(id = "discount_type")
    public WebElement discountType;
    @FindBy(xpath = "//*[@id='coupon_amount']")
    public WebElement couponAmount;
    @FindBy(id = "expiry_date")
    public WebElement expiryDate;
    @FindBy(id = "free_shipping")
    public WebElement freeShippingCheckbox;
    @FindBy(id = "show_on_store")
    public WebElement showOnStoreCheckbox;
    @FindBy(xpath = "//*[@name='submit-data']")
    public WebElement submitButton;
    @FindBy(xpath = "//*[@id='wcfm-coupons']")
    public WebElement couponsTabel;
    @FindBy(xpath = "//*[@class='wcfm-message wcfm-error']")
    public WebElement alertMsg;

}
