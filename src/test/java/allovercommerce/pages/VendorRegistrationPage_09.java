package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorRegistrationPage_09 {

 public VendorRegistrationPage_09(){

  PageFactory.initElements(Driver.getDriver(),this);
 }

 @FindBy(css =".register.inline-type" )
 public WebElement registerButton;

 @FindBy(partialLinkText="Become a Vendor")
 public WebElement becomeAvendorText;

 @FindBy(css ="#user_email" )
 public WebElement VendorEmailAddres;


 @FindBy(css ="input[name='wcfm_email_verified_input']" )
 public WebElement VendorEmailVerify;

 @FindBy(xpath ="//input[@id='passoword']")
    public WebElement passwordTextBox;

 @FindBy(xpath ="//input[@id='confirm_pwd']")
 public WebElement confirmPasswordTextBox;

 @FindBy(xpath ="//div[@id='password_strength']")
 public WebElement passwordStrong;

}
