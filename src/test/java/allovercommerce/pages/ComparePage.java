package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComparePage {
    public ComparePage (){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath= "//a[@class='login inline-type']")
    public WebElement signInButton;

    @FindBy(xpath= "//input[@autocomplete='username']")
    public WebElement usernameBox;

    @FindBy(xpath= "//input[@autocomplete='current-password']")
    public WebElement passwordBox;

    @FindBy(xpath= "//button[@name='login']")
    public WebElement signInButton2;

    @FindBy(xpath ="(//*[.='Men'])[1]")
    public WebElement manButonu;

    @FindBy(xpath = "(//a[@data-product_id='19895'])[2]")
    public WebElement satrancTerazi;

    @FindBy(xpath = "(//a[@data-product_id='21675'])[2]")
    public WebElement griPantolon;

    @FindBy(xpath = "(//a[@data-product_id='14000'])[2]")
    public WebElement pusula;

    @FindBy(xpath = "(//a[@data-product_id='14669'])[2]")
    public WebElement tisort;

    @FindBy(xpath = "//*[.='Start Compare !']")
    public WebElement startCompareButton;

    @FindBy(xpath = "(//i[@class='w-icon-times-solid'])[2]")
    public WebElement pantolonX;

}

