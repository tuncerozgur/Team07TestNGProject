package allovercommerce.tests;

import allovercommerce.pages.VendorRegistrationPage_09;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;



public class VendorRegistrationTest_09 {
    /*
1	Kullanıcı websitesine gider
2	 Register sekmesine  tıklar
3	 "Sign Up" sekmesinde sol alt kısmında bulunan "Become a vendor" linki tıklanılır
4	"Vendor Registration"" sayfasında olduğu doğrulanır"
5	"Email"" adresine mail adresi girilir"
6	Girilen mail adresine gönderilen doğrulama kodu için mail sayfasına gidilir
7	Gönderilen kod alınıp verification code kısmına yazılır
8	Password alanı doldurulur
9	Confirm password alanı passwordun aynısı olarak doldurulur
10	Register butonuna tıklayarak vendor olarak kayıdı tamamlanmalı
10	Kullanıcı 11 ve daha fazlası karakter için "strong" mesajını görür
12	Kullanıcı şifrenin bu hali için de sign up butonu aktif olur
*/

    String alinanEmailadresi;
    String alinanVerificationCode;
@Test
public void test01(){
    // Kullanıcı websitesine gider
    Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));


    //Register sekmesine  tıklar
    VendorRegistrationPage_09 vendorregister= new VendorRegistrationPage_09();
    vendorregister.registerButton.click();

    // "Sign Up" sekmesinde sol alt kısmında bulunan "Become a vendor" linki tıklanılır
    vendorregister.becomeAvendorText.click();

    //"Vendor Registration"" sayfasında olduğu doğrulanır"
    Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://allovercommerce.com/vendor-register/");

    //"Email" adresine mail adresi girilir"
    // Sayfanın Windows Handle değeri
    String allOverCommerceHandle = Driver.getDriver().getWindowHandle();
    System.out.println("AlloverCommerce adresinin handle değeri="+allOverCommerceHandle);

    // https://www.fakemail.net/ Adresine git
    Driver.getDriver().switchTo().newWindow(WindowType.TAB);
    Driver.getDriver().get("https://www.fakemail.net/");

    String fakeMailHandle =Driver.getDriver().getWindowHandle();
    System.out.println("Fake mail handle değeri="+fakeMailHandle);

    // e-mail adresini al
    String eMailAdres =Driver.getDriver().findElement(By.cssSelector("span#email")).getText();
    System.out.println("Alinan mail adresi="+eMailAdres);
    alinanEmailadresi=eMailAdres;
    ReusableMethods.bekle(2);

    // https://allovercommerce.com/ sayfasına dön
    Driver.getDriver().switchTo().window(allOverCommerceHandle);
    ReusableMethods.bekle(2);

    //alınan maili gir
    vendorregister.VendorEmailAddres.sendKeys(eMailAdres, Keys.TAB);
    ReusableMethods.bekle(3);

   // Girilen mail adresine gönderilen doğrulama kodu için fake mail sayfasına gidilir
    Driver.getDriver().switchTo().window(fakeMailHandle);
    Driver.getDriver().navigate().refresh();
    ReusableMethods.bekle(4);

    //Gönderilen kod alınıp verification code kısmına yazılır
    //fake mail gelen kutusuna tıkla
    Driver.getDriver().findElement(By.cssSelector(".from")).click();

    //iframe geçme
    Driver.getDriver().switchTo().frame(1);
    String verificationCode = Driver.getDriver().findElement(By.tagName("b")).getText();
    alinanVerificationCode=verificationCode;
    System.out.println(verificationCode);

   // Gönderilen kod alınıp verification code kısmına yazılır
    Driver.getDriver().switchTo().window(allOverCommerceHandle);
    vendorregister.VendorEmailVerify.sendKeys(verificationCode);

    //Password alanı doldurulur
    vendorregister.passwordTextBox.sendKeys("123456789aAx");

    //Kullanıcı 11 ve daha fazlası karakter için "strong" mesajını görür
    Assert.assertTrue(vendorregister.passwordStrong.isDisplayed());

    //Confirm password alanı passwordun aynısı olarak doldurulur
   // 12	Kullanıcı şifrenin bu hali için de sign up butonu aktif olur
    vendorregister.confirmPasswordTextBox.sendKeys("123456789aAx",Keys.TAB,Keys.ENTER);

    Driver.closeDriver();

}

@Test
  public void test02(){
    /*
1	Kullanıcı websitesine gider
2	 Register sekmesine  tıklar
3	 "Sign Up" sekmesinde sol alt kısmında bulunan "Become a vendor" linki tıklanılır
4	Vendor Registration"" sayfasında olduğu doğrulanır"
5	Email adresine mail adresi girilir"
6	Girilen mail adresine gönderilen doğrulama kodu için mail sayfasına gidilir
7	Gönderilen kod alınıp verification code kısmına yazılır
8	Password alanı doldurulur
9	Confirm password alanı password dan farklı olarak doldurulur
10	Register butonuna tıklandığında ""Password and Confirm-password are not same" mesajını alır*/

    // Kullanıcı websitesine gider
    Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));


    //Register sekmesine  tıklar
    VendorRegistrationPage_09 vendorregister= new VendorRegistrationPage_09();
    vendorregister.registerButton.click();

    // "Sign Up" sekmesinde sol alt kısmında bulunan "Become a vendor" linki tıklanılır
    vendorregister.becomeAvendorText.click();

    //"Vendor Registration"" sayfasında olduğu doğrulanır"
    Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://allovercommerce.com/vendor-register/");

    //"Email" adresine mail adresi girilir"
    // Sayfanın Windows Handle değeri
    String allOverCommerceHandle = Driver.getDriver().getWindowHandle();
    System.out.println("AlloverCommerce adresinin handle değeri="+allOverCommerceHandle);

    // https://www.fakemail.net/ Adresine git
    Driver.getDriver().switchTo().newWindow(WindowType.TAB);
    Driver.getDriver().get("https://www.fakemail.net/");

    String fakeMailHandle =Driver.getDriver().getWindowHandle();
    System.out.println("Fake mail handle değeri="+fakeMailHandle);

    // e-mail adresini al
    String eMailAdres =Driver.getDriver().findElement(By.cssSelector("span#email")).getText();
    System.out.println("Alinan mail adresi="+eMailAdres);
    ReusableMethods.bekle(2);

    // https://allovercommerce.com/ sayfasına dön
    Driver.getDriver().switchTo().window(allOverCommerceHandle);
    ReusableMethods.bekle(2);

    //alınan maili gir
    vendorregister.VendorEmailAddres.sendKeys(eMailAdres, Keys.TAB);
    ReusableMethods.bekle(3);

    // Girilen mail adresine gönderilen doğrulama kodu için fake mail sayfasına gidilir
    Driver.getDriver().switchTo().window(fakeMailHandle);
    Driver.getDriver().navigate().refresh();
    ReusableMethods.bekle(4);

    //Gönderilen kod alınıp verification code kısmına yazılır
    //fake mail gelen kutusuna tıkla
    Driver.getDriver().findElement(By.cssSelector(".from")).click();

    //iframe geçme
    Driver.getDriver().switchTo().frame(1);
    String verificationCode = Driver.getDriver().findElement(By.tagName("b")).getText();
    System.out.println(verificationCode);

    // Gönderilen kod alınıp verification code kısmına yazılır
    Driver.getDriver().switchTo().window(allOverCommerceHandle);
    vendorregister.VendorEmailVerify.sendKeys(verificationCode);

    //Password alanı doldurulur
    vendorregister.passwordTextBox.sendKeys("123456789aAx");

    //Kullanıcı 11 ve daha fazlası karakter için "strong" mesajını görür
    Assert.assertTrue(vendorregister.passwordStrong.isDisplayed());

    //Confirm password alanı password dan farklı olarak doldurulur, register butonuna tıklanır
    vendorregister.confirmPasswordTextBox.sendKeys("123456789aAy",Keys.TAB,Keys.ENTER);

    //Register butonuna tıklandığında ""Password and Confirm-password are not same" mesajını alır
    Assert.assertTrue(vendorregister.confirmMessage.isDisplayed());

    }

    @Test(dependsOnMethods = "test01")
    public void test03(){
    /*1	Kullanıcı websitesine gider
2	 Register sekmesine tıklanılır
3	 "Sign Up" sekmesinde sol alt kısmında bulunan "Become a vendor" linki tıklanılır
4	Become a Vendor"" sayfasına geldiği gözlemlenir"
5	Registration"" bölümünde bulunan ""Email"" kutucuğuna daha öne kayıt ettiğimiz email adresi tekrar yazılır"
6	Email sekmesinin altında kullanıcı "Verication code sent to your email: elijha.corran@falkcia.com" uyarısını görür
7	Email adresini kontrol edildiğinde "Verication code" içinde yazılı olduğu bir mail geldiği görülür
8	Password kısmına bir sifre yazılır
9	Confirm Password kısmına sifre tekrar yazılır
10	Sağ altta bulunan Register sekmesine basılır
11	This Email already exists. Please login to the site and apply as vendor" mesajı alınır*/

        // Kullanıcı websitesine gider
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));


        //Register sekmesine  tıklar
        VendorRegistrationPage_09 vendorregister= new VendorRegistrationPage_09();
        vendorregister.registerButton.click();

        // "Sign Up" sekmesinde sol alt kısmında bulunan "Become a vendor" linki tıklanılır
        vendorregister.becomeAvendorText2.click();


        //"Vendor Registration"" sayfasında olduğu doğrulanır"
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://allovercommerce.com/vendor-register/");


        //Registration"" bölümünde bulunan ""Email"" kutucuğuna daha öne kayıt ettiğimiz email adresi tekrar yazılır"
        vendorregister.VendorEmailAddres.sendKeys(alinanEmailadresi, Keys.TAB);

        //Email adresini kontrol edildiğinde "Verication code" içinde yazılı olduğu bir mail geldiği görülür
        vendorregister.VendorEmailVerify.sendKeys(alinanVerificationCode);

        //Password alanı doldurulur
        vendorregister.passwordTextBox.sendKeys("123456789aAx");

        //Kullanıcı 11 ve daha fazlası karakter için "strong" mesajını görür
        Assert.assertTrue(vendorregister.passwordStrong.isDisplayed());

        //Confirm password alanı password dan farklı olarak doldurulur, register butonuna tıklanır
        vendorregister.confirmPasswordTextBox.sendKeys("123456789aAx",Keys.TAB,Keys.ENTER);

        //This Email already exists. Please login to the site and apply as vendor" mesajı alınır
        Assert.assertTrue(vendorregister.confirmMessage.isDisplayed());




    }















}
