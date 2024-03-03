package allovercommerce.tests;

import allovercommerce.pages.ShippingAddressesPage_13;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ShippingAddressesTest_13 {

    @Test
    public void pozitivetest() {

        // Kullanıcı site anasayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        ShippingAddressesPage_13 shippingAddressesPage13 = new ShippingAddressesPage_13();
        // Kullanıcı sitenin sağ üst köşesinde bulunan"sign in"butonuna tıklar ve giriş yapar
        shippingAddressesPage13.signInButonu.click();

        // Kullanıcı username alanına bir username girer
        shippingAddressesPage13.userNameKutusu.sendKeys(ConfigReader.getProperty("userName13"));

        // Kullanıcı password alanına password girer
        shippingAddressesPage13.passwordKutusu.sendKeys(ConfigReader.getProperty("password13"));

        // Kullanıcı remember me butonunu aktif eder
        shippingAddressesPage13.remembermeKutucugu.click();

        // Kullanıcı sign ın butonuna tıklar ve sayfaya giriş yapar
        shippingAddressesPage13.girisButonu.click();

        //  Kullanıcı sing out simgesine tıklar
        shippingAddressesPage13.signOutButonu.click();

        // Açılan pencerede sol tarafta bulunan Addresses bölümüne tıklar.
        shippingAddressesPage13.addressesBolumu.click();

        // Açılan ekranda Shipping adress altında bulanan add kısmına tıklar
        shippingAddressesPage13.addButonu.click();

        // Açılan ekranda kullanıcı First Name kısmına ismini girer
        shippingAddressesPage13.firstNameKutusu.sendKeys(ConfigReader.getProperty("firstName13"));

        // Kullanıcı Last Name kısmına soyadını girer Kullanıcı Country / Region kısmına bir veri seçer
        shippingAddressesPage13.lastNameKutusu.sendKeys(ConfigReader.getProperty("lastName13"), Keys.TAB, Keys.TAB, "Turkey", Keys.ENTER);


        // Kullanıcı Street address alanına bir veri girer
        shippingAddressesPage13.streetAddressKutusu.sendKeys(ConfigReader.getProperty("streetAdress13"));


        // Kullanıcı Postcode / ZIP alanına bir veri girer
        shippingAddressesPage13.zipPostcodeKutusu.sendKeys(ConfigReader.getProperty("zipPostcode13"));

        // Kullanıcı Town / City alanına bir veri girer Kullanıcı Province alanına bir veri seçer
        shippingAddressesPage13.townCityKutusu.sendKeys(ConfigReader.getProperty("townCity13"),
                Keys.TAB, "Adıyaman", Keys.ENTER);


        // Kullanıcı save address butonuna tıklar.
        // shippingAddressesPage13.saveAddressButonu.click();

        // Kullanıcı Address changed successfully yazısını görür ve shipping adress eklendiği doğrulanır.
        // Assert.assertTrue(shippingAddressesPage13.eklentiDogrulama.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void negativetest1() {
        // Kullanıcı site anasayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        ShippingAddressesPage_13 shippingAddressesPage13 = new ShippingAddressesPage_13();

        // Kullanıcı sitenin sağ üst köşesinde bulunan"sign in"butonuna tıklar ve giriş yapar
        shippingAddressesPage13.signInButonu.click();

        // Kullanıcı username alanına bir username girer
        shippingAddressesPage13.userNameKutusu.sendKeys(ConfigReader.getProperty("userName13"));

        // Kullanıcı password alanına password girer
        shippingAddressesPage13.passwordKutusu.sendKeys(ConfigReader.getProperty("password13"));

        // Kullanıcı remember me butonunu aktif eder
        shippingAddressesPage13.remembermeKutucugu.click();

        // Kullanıcı sign ın butonuna tıklar ve sayfaya giriş yapar
        shippingAddressesPage13.girisButonu.click();

        //  Kullanıcı sing out simgesine tıklar
        shippingAddressesPage13.signOutButonu.click();

        // Açılan pencerede sol tarafta bulunan Addresses bölümüne tıklar.
        shippingAddressesPage13.addressesBolumu.click();

        // Açılan ekranda Shipping adress altında bulanan add kısmına tıklar
        shippingAddressesPage13.addButonu.click();

        // Kullanıcı Firstname alanına bir veri girmez

        //******************************************

        // Kullanıcı Last Name kısmına soyadını girer Kullanıcı Country / Region kısmına bir veri seçer
        shippingAddressesPage13.lastNameKutusu.sendKeys(ConfigReader.getProperty("lastName13"), Keys.TAB, Keys.TAB, "Turkey", Keys.ENTER);


        // Kullanıcı Street address alanına bir veri girer
        shippingAddressesPage13.streetAddressKutusu.sendKeys(ConfigReader.getProperty("streetAdress13"));


        // Kullanıcı Postcode / ZIP alanına bir veri girer
        shippingAddressesPage13.zipPostcodeKutusu.sendKeys(ConfigReader.getProperty("zipPostcode13"));

        // Kullanıcı Town / City alanına bir veri girer Kullanıcı Province alanına bir veri seçer
        shippingAddressesPage13.townCityKutusu.sendKeys(ConfigReader.getProperty("townCity13"), Keys.TAB, "Adıyaman", Keys.ENTER);


        // Kullanıcı save address butonuna tıklar.
        // shipping13Page.saveAddressButonu.click();

        // Kullanıcı bilgilerin eklenmediğine dair mesaj alır ve doğrular
        // Assert.assertTrue(shipping13Page.firstNameUyarimesaji.isDisplayed());

        // Driver.closeDriver();
    }

    @Test
    public void negativetest2() {

        // Kullanıcı site anasayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        ShippingAddressesPage_13 shippingAddressesPage13 = new ShippingAddressesPage_13();

        // Kullanıcı sitenin sağ üst köşesinde bulunan"sign in"butonuna tıklar ve giriş yapar
        shippingAddressesPage13.signInButonu.click();

        // Kullanıcı username alanına bir username girer
        shippingAddressesPage13.userNameKutusu.sendKeys(ConfigReader.getProperty("userName13"));

        // Kullanıcı password alanına password girer
        shippingAddressesPage13.passwordKutusu.sendKeys(ConfigReader.getProperty("password13"));

        // Kullanıcı remember me butonunu aktif eder
        shippingAddressesPage13.remembermeKutucugu.click();

        // Kullanıcı sign ın butonuna tıklar ve sayfaya giriş yapar
        shippingAddressesPage13.girisButonu.click();

        //  Kullanıcı sing out simgesine tıklar
        shippingAddressesPage13.signOutButonu.click();

        // Açılan pencerede sol tarafta bulunan Addresses bölümüne tıklar.
        shippingAddressesPage13.addressesBolumu.click();

        // Açılan ekranda Shipping adress altında bulanan add kısmına tıklar
        shippingAddressesPage13.addButonu.click();

        // Açılan ekranda kullanıcı First Name kısmına ismini girer
        shippingAddressesPage13.firstNameKutusu.sendKeys(ConfigReader.getProperty("firstName13"));

        // Kullanıcı Last Name kısmına soyadını girer Kullanıcı Country / Region kısmına bir veri seçer
        shippingAddressesPage13.lastNameKutusu.sendKeys(ConfigReader.getProperty("lastName13"), Keys.TAB, Keys.TAB, "Turkey", Keys.ENTER);


        // Kullanıcı Street address alanına bir veri girer
        shippingAddressesPage13.streetAddressKutusu.sendKeys(ConfigReader.getProperty("streetAdress13"));


        // Kullanıcı Postcode / ZIP alanına bir veri girmez

        //*****************************************

        // Kullanıcı Town / City alanına bir veri girer Kullanıcı Province alanına bir veri seçer
        shippingAddressesPage13.townCityKutusu.sendKeys(ConfigReader.getProperty("townCity13"),
                Keys.TAB, "Adıyaman", Keys.ENTER);


        // Kullanıcı save address butonuna tıklar.
        // shipping13Page.saveAddressButonu.click();

        // Kullanıcı bilgilerin eklenmediğine dair mesaj alır ve doğrular
        // Assert.assertTrue(shipping13Page.zipPostUyariMesaji.isDisplayed());

        Driver.closeDriver();
    }
}
