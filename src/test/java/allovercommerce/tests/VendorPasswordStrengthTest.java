package allovercommerce.tests;

import allovercommerce.pages.VendorPasswordStrengthPage;
import allovercommerce.pages.VendorRegistrationPage_09;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VendorPasswordStrengthTest {
    @Test
            public void test01(){
    // Kullanıcı websitesine gider
    Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));


    //Register sekmesine  tıklar
    VendorPasswordStrengthPage vendorregister= new VendorPasswordStrengthPage();
    vendorregister.registerButton.click();

    // "Sign Up" sekmesinde sol alt kısmında bulunan "Become a vendor" linki tıklanılır
    vendorregister.becomeAvendorText.click();

        //Password alanı 0-4 karakter arası doldurulur, "too short" mesajının görüldüğü doğrulanır
        vendorregister.passwordTextBox.sendKeys("12345");
        String tooShort="Too short";
        Assert.assertEquals(vendorregister.passwordText.getText(),tooShort,"Yazılar aynı değil");
        ReusableMethods.bekle(4);


        //Password alanı 4-8 karakter arası doldurulur, "Weak" mesajının görüldüğü doğrulanır
        vendorregister.passwordTextBox.sendKeys("678");
        String weak="Weak";
        Assert.assertEquals(vendorregister.passwordText.getText(),weak,"Yazılar aynı değil");
        ReusableMethods.bekle(4);


        //Password alanı 8-10 karakter arası doldurulur, "Good" mesajının görüldüğü dogrulanır
        vendorregister.passwordTextBox.sendKeys("a");
        String good= "Good";
        Assert.assertEquals(vendorregister.passwordText.getText(),good,"Yazılar aynı değil");

        //Password alanı  11 ve fazlası karakterle doldurulur,"Strong" mesajının görüldüğü dogrulanır
        vendorregister.passwordTextBox.sendKeys("AA");
        String strong= "Strong";
        Assert.assertEquals(vendorregister.passwordText.getText(),strong,"Yazılar aynı değil");







}
}