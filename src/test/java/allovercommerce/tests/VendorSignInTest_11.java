package allovercommerce.tests;

import allovercommerce.pages.VendorSignInPage_11;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VendorSignInTest_11 {
    @Test
    public void PROJE() {

        // Kullanıcı web sitesine gider ve Sign in butonuna tıklar
        VendorSignInPage_11 vendorSignInPage_11 = new VendorSignInPage_11();
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        vendorSignInPage_11.signInButonu.click();

        // Kullanıcı username alanına bir username girer
        vendorSignInPage_11.userNameKutusu.sendKeys(ConfigReader.getProperty("vendoruserName11"));

        // Kullanıcı password alanına password girer
        vendorSignInPage_11.passwordKutusu.sendKeys(ConfigReader.getProperty("vendorpassword11"));

        // Kullanıcı remember me butonunu aktif eder
        vendorSignInPage_11.remembermeKutucugu.click();

        // Kullanıcı sign ın butonuna tıklar ve sayfaya giriş yapar
        vendorSignInPage_11.girisButonu.click();

        // Kullanıcı web sitesine gider ve Kullanıcı sing out simgesine tıklar
        vendorSignInPage_11.signOutButonu.click();


        // Kullanıcı My Account sayfasında oldugunu dogrular
        Assert.assertTrue(vendorSignInPage_11.myAccountBasligi.isDisplayed());

        // Kullanıcı dashboard'a tıklar ve dashboard sayfasında olduğunu dogrular
        vendorSignInPage_11.dashboardBolumu.click();
        Assert.assertTrue(vendorSignInPage_11.dashboardBolumu.isDisplayed(), "Hata2");

        // Kullanıcı store manager'a tıklar ve Kullanıcı store manager sayfasında oldugunu dogrular
        vendorSignInPage_11.storeManagerBolumu.click();
        Assert.assertTrue(vendorSignInPage_11.storeManagerYazisi.isDisplayed(), "Hata3");
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(5);
        ReusableMethods.scrollEnd();

        // Kullanıcı orders'a tıklar ve Kullanıcı order sayfasında oldugunu dogrular
        vendorSignInPage_11.ordersBolumu.click();
        Assert.assertTrue(vendorSignInPage_11.ordersDogrulama.isDisplayed(), "Hata4");
        Driver.getDriver().navigate().back();

        // Kullanıcı downloads'a tıklar ve Kullanıcı downloads sayfasında oldugunu dogrular
        vendorSignInPage_11.dowloadsBolumu.click();
        Assert.assertTrue(vendorSignInPage_11.dowloadsDogrulama.isDisplayed(), "Hata5");
        Driver.getDriver().navigate().back();

        // Kullanıcı addresses'e tıklar ve Kullanıcı addresses sayfasında oldugunu dogrular
        vendorSignInPage_11.addressesBolumu.click();
        Assert.assertTrue(vendorSignInPage_11.addressesDogrulama.isDisplayed(), "Hata6");
        Driver.getDriver().navigate().back();

        // Kullanıcı account details'e tıklar ve Kullanıcı account details sayfasında oldugunu dogrular
        vendorSignInPage_11.accountDetailsBolumu.click();
        Assert.assertTrue(vendorSignInPage_11.getAccountDetailsDogrulama.isDisplayed(), "Hata7");
        Driver.getDriver().navigate().back();

        // Kullanıcı wishlist'e tıklar ve Kullanıcı wishlist sayfasında oldugunu dogrular
        ReusableMethods.click(vendorSignInPage_11.wishlistBolumu);
        Assert.assertTrue(vendorSignInPage_11.wishlistDogrulama.isDisplayed(), "Hata8");
        Driver.getDriver().navigate().back();

        // Kullanıcı support tickets'e tıklar ve Kullanıcı support tickets sayfasında oldugunu dogrular
        vendorSignInPage_11.supportTicketsdBolumu.click();
        Assert.assertTrue(vendorSignInPage_11.supportTicketsDogrulama.isDisplayed(), "Hata9");
        ReusableMethods.scrollEnd();
        Driver.getDriver().navigate().back();

        // Kullanıcı following'e tıklar ve Kullanıcı followings sayfasında oldugunu dogrular
        vendorSignInPage_11.followingsBolumu.click();
        Assert.assertTrue(vendorSignInPage_11.followingDogrulama.isDisplayed(), "Hata10");
        Driver.getDriver().navigate().back();

        // Kullanıcı log out ile cıkış yaptığını dogrular
        ReusableMethods.click(vendorSignInPage_11.logoutBolumu);
        Assert.assertTrue(vendorSignInPage_11.cikisDogrulama.isDisplayed());

        Driver.closeDriver();

    }

}
