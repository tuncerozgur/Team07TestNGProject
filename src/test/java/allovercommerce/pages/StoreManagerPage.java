package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoreManagerPage {

    public StoreManagerPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath= "//a[@class='login inline-type']")
    public WebElement signInButton;

    @FindBy(xpath= "//input[@autocomplete='username']")
    public WebElement usernameBox;

    @FindBy(xpath= "//input[@autocomplete='current-password']")
    public WebElement passwordBox;

    @FindBy(xpath= "//button[@name='login']")
    public WebElement signInButton2;

    @FindBy(xpath ="//*[.='Sign Out']")
    public WebElement signOutButonu;
    @FindBy(id= "//*[@id='menu-item-1079']")
    public WebElement myAccountButton;

    @FindBy(xpath = "//h2[@class='page-title']")
    public WebElement myAccountyazisi;


    @FindBy(xpath= "//*[.='Store Manager']")
    public WebElement storeManagerButton;


    @FindBy(xpath= "(//*[.='My Store'])[1]")
    public WebElement myStoreButton;


    @FindBy(xpath = "(//a[@class='wcfm_menu_item '])[3]")
    public WebElement productsButton;
    @FindBy(xpath = "//*[.='Add Product']")
    public WebElement productText;



    @FindBy(xpath = "(//*[.='Add New'])[2]")
    public WebElement addNewButton;


    @FindBy(xpath = "(//div[@class='page_collapsible_content_holder'])[1]")
    public WebElement inventoryOption;

    @FindBy(xpath = "(//div[@class='page_collapsible_content_holder'])[4]")
    public WebElement shippingOption;


    @FindBy(xpath = "(//div[@class='page_collapsible_content_holder'])[5]")
    public WebElement attributesOption;



    @FindBy(xpath = "(//div[@class='page_collapsible_content_holder'])[7]")
    public WebElement linkedOption;



    @FindBy(xpath = "(//div[@class='page_collapsible_content_holder'])[8]")
    public WebElement seoOption;



    @FindBy(xpath = "(//div[@class='page_collapsible_content_holder'])[10]")
    public WebElement advancedOption;

    @FindBy(xpath = "//span[@class='wcfmfa fa-arrow-alt-circle-right block-indicator']")
    public WebElement inventoryButton2;


    @FindBy(xpath= "//*[(.='Shipping')]")
    public WebElement shippingButton2;

    @FindBy(css = "#wcfm_products_manage_form_attribute_head")
    public WebElement attributesButton2;


    @FindBy(xpath = "(//div[@class='page_collapsible_content_holder'])[7]")
    public WebElement linkedButton2;

    @FindBy(xpath = "(//div[@class='page_collapsible_content_holder'])[8]")
    public WebElement seoButton2;


    @FindBy(xpath = "(//div[@class='page_collapsible_content_holder'])[10]")
    public WebElement advancedButton2;


    @FindBy(xpath = "//*[@name='sku']")
    public WebElement skuButton;

    @FindBy(xpath= "(//input[@value='enable'])[3]")
    public WebElement manageStock;

    @FindBy(xpath = "//input[@name='stock_qty']")
    public WebElement stockQtyBolumu;


    @FindBy(css= "#sold_individually")
    public WebElement soldIndividually;

    /////////////////////////////////////////////////////////

    @FindBy(css="#weight")
    public WebElement weightBox;


    @FindBy(css ="#length")
    public WebElement lenghtBox;

    @FindBy(css = "#width")
    public WebElement widthBox;

    @FindBy(css = "#height")
    public WebElement heightBox;

    @FindBy(css= "#shipping_class")
    public WebElement shippingClassBox;

    @FindBy(css = "#_wcfmmp_processing_time")
    public WebElement processingTimeBox;

    /////////////////////////////////////////////////////////////////

    @FindBy(xpath= "//input[@id='attributes_is_active_1']")
    public WebElement colorBoxActive;
    @FindBy(xpath= "(//*[@class='select2-search__field'])[2]")
    public WebElement colorBox;

    @FindBy(xpath= "//input[@id='attributes_is_active_2']")
    public WebElement sizeBoxActive;

    @FindBy(xpath= "(//*[@class='select2-selection__rendered'])[3]")
    public WebElement sizeBox;

    @FindBy(xpath= "  //*[@class='wcfm-select wcfm_attribute_taxonomy']")
    public WebElement addAttributeText;

    @FindBy(css= "#wcfm_products_simple_submit_button")
    public WebElement submitBox;



}
