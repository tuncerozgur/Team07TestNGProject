package allovercommerce.tests;

import allovercommerce.pages.BillingAddressesPage_12;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BillingAddresesTest_12 {

    @Test
    public void pozitivetest() {

        //   Web sitesine gidilir ve Sign in ikonu tiklanir
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        BillingAddressesPage_12 billingAddressesPage12 = new BillingAddressesPage_12();
        billingAddressesPage12.signInButonu.click();

        //   Kullanıcı username alanına bir username girer
        billingAddressesPage12.userNameKutusu.sendKeys(ConfigReader.getProperty("userName12"));

        //   Kullanıcı password alanına password girer
        billingAddressesPage12.passwordKutusu.sendKeys(ConfigReader.getProperty("password12"));

        //   Kullanıcı remember me butonunu aktif eder
        billingAddressesPage12.remembermeKutucugu.click();

        //   Kullanıcı sign ın butonuna tıklar ve sayfaya giriş yapar
        billingAddressesPage12.girisButonu.click();

        //  Kullanıcı sing out simgesine tıklar
        billingAddressesPage12.signOutButonu.click();

        //   Kullanici sayfa başlıgının MY ACCOUNT oldugunu dogrular
        Assert.assertTrue(billingAddressesPage12.myAccountBasligi.isDisplayed());

        //   Kullanici My account sayfasinda ADRESSES yazisina tiklar
        billingAddressesPage12.addressesBolumu.click();

        //   Kullanici Adresses sayfasinda billing address basligi oldugunu dogrular
        Assert.assertTrue(billingAddressesPage12.billingAddressBasligi.isDisplayed());

        //   Kullanıcı ADD butonuna tiklar
        billingAddressesPage12.addButonu.click();

        //   Kullanici billing adres sayfasinda oldugunu dogrular
        Assert.assertTrue(billingAddressesPage12.sayfaDogrulamasi.isDisplayed());

        //   Kullanici First Name alanina valid bir deger girer
        billingAddressesPage12.firstNameKutusu.sendKeys(ConfigReader.getProperty("firstName12"));

        //   Kullanici Last Name alanina valid bir deger girer Kullanici Country/Region alanina ulke ismi girer
        billingAddressesPage12.lastNameKutusu.sendKeys(ConfigReader.getProperty("lastName12"),
                Keys.TAB, Keys.TAB, "Turkey", Keys.TAB, Keys.TAB);


        //   Kullanici Street adress alanina valid bir deger girer
        billingAddressesPage12.streetAddressKutusu.sendKeys(ConfigReader.getProperty("streetAdress12"));

        //   Kullanici POSTCODE / ZIP alanina valid bir deger girer
        billingAddressesPage12.zipPostcodeKutusu.sendKeys(ConfigReader.getProperty("zipPostcode12"));

        //   Kullanici TOWN/CITY alanina valid bir deger girer
        //   Kullanici PROVİNCE alaninda valid bir eyalet ismi secer
        //   Kullanici Phone alanina valid bir deger girer
        billingAddressesPage12.townCityKutusu.sendKeys(ConfigReader.getProperty("townCity12"),
                Keys.TAB, "Istanbul", Keys.ENTER, Keys.TAB, "05555555555");

        //   Kullanıcı sayfasındaki SAVE ADRESS butonuna tıklar
        // myAccount12Page.saveAddressButonu.click();

        //   Kullanıcı billing adresine eklendiğine dair mesaj alır
        //   Kullanıcı bilgi mesajını dogrular
        //     Assert.assertTrue(myAccount12Page.bilgiMesaji.isDisplayed());
        Driver.closeDriver();

    }

    @Test
    public void negativetest1() {

        //   Web sitesine gidilir ve Sign in ikonu tiklanir
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        BillingAddressesPage_12 billingAddressesPage12 = new BillingAddressesPage_12();
        billingAddressesPage12.signInButonu.click();

        //   Kullanıcı username alanına bir username girer
        billingAddressesPage12.userNameKutusu.sendKeys(ConfigReader.getProperty("userName12"));

        //   Kullanıcı password alanına password girer
        billingAddressesPage12.passwordKutusu.sendKeys(ConfigReader.getProperty("password12"));

        //   Kullanıcı remember me butonunu aktif eder
        billingAddressesPage12.remembermeKutucugu.click();

        //   Kullanıcı sign ın butonuna tıklar ve sayfaya giriş yapar
        billingAddressesPage12.girisButonu.click();

        //  Kullanıcı sing out simgesine tıklar
        billingAddressesPage12.signOutButonu.click();

        //   Kullanici sayfa başlıgının MY ACCOUNT oldugunu dogrular
        Assert.assertTrue(billingAddressesPage12.myAccountBasligi.isDisplayed());

        //   Kullanici My account sayfasinda ADRESSES yazisina tiklar
        billingAddressesPage12.addressesBolumu.click();

        //   Kullanici Adresses sayfasinda billing address basligi oldugunu dogrular
        Assert.assertTrue(billingAddressesPage12.billingAddressBasligi.isDisplayed());

        //   Kullanıcı ADD butonuna tiklar
        billingAddressesPage12.addButonu.click();

        //   Kullanici billing adres sayfasinda oldugunu dogrular
        Assert.assertTrue(billingAddressesPage12.sayfaDogrulamasi.isDisplayed());

        // Kullanici First Name alanina bir değer girmezse

        //***********************************************

        //   Kullanici Last Name alanina valid bir deger girer Kullanici Country/Region alanina ulke ismi girer
        billingAddressesPage12.lastNameKutusu.sendKeys(ConfigReader.getProperty("lastName12"),
                Keys.TAB, Keys.TAB, "Turkey", Keys.TAB, Keys.TAB);


        //   Kullanici Street adress alanina valid bir deger girer
        billingAddressesPage12.streetAddressKutusu.sendKeys(ConfigReader.getProperty("streetAdress12"));

        //   Kullanici POSTCODE / ZIP alanina valid bir deger girer
        billingAddressesPage12.zipPostcodeKutusu.sendKeys(ConfigReader.getProperty("zipPostcode12"));

        //   Kullanici TOWN/CITY alanina valid bir deger girer
        //   Kullanici PROVİNCE alaninda valid bir eyalet ismi secer
        //   Kullanici Phone alanina valid bir deger girer
        billingAddressesPage12.townCityKutusu.sendKeys(ConfigReader.getProperty("townCity12"),
                Keys.TAB, "Istanbul", Keys.ENTER, Keys.TAB, "05555555555");

        //   Kullanıcı sayfasındaki SAVE ADRESS butonuna tıklar
        // myAccount12Page.saveAddressButonu.click();

        //   Kullanıcı billing adresine eklenmediğine dair mesaj alır
        //   Kullanıcı bilgi mesajını dogrular
        //   Assert.assertTrue(myAccount12Page.firstNameUyariMesaji.isDisplayed());
        //Driver.closeDriver();

    }

    @Test
    public void negativetest2() {
        //   Web sitesine gidilir ve Sign in ikonu tiklanir
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        BillingAddressesPage_12 billingAddressesPage12 = new BillingAddressesPage_12();
        billingAddressesPage12.signInButonu.click();

        //   Kullanıcı username alanına bir username girer
        billingAddressesPage12.userNameKutusu.sendKeys(ConfigReader.getProperty("userName12"));

        //   Kullanıcı password alanına password girer
        billingAddressesPage12.passwordKutusu.sendKeys(ConfigReader.getProperty("password12"));

        //   Kullanıcı remember me butonunu aktif eder
        billingAddressesPage12.remembermeKutucugu.click();

        //   Kullanıcı sign ın butonuna tıklar ve sayfaya giriş yapar
        billingAddressesPage12.girisButonu.click();

        //  Kullanıcı sing out simgesine tıklar
        billingAddressesPage12.signOutButonu.click();

        //   Kullanici sayfa başlıgının MY ACCOUNT oldugunu dogrular
        Assert.assertTrue(billingAddressesPage12.myAccountBasligi.isDisplayed());

        //   Kullanici My account sayfasinda ADRESSES yazisina tiklar
        billingAddressesPage12.addressesBolumu.click();

        //   Kullanici Adresses sayfasinda billing address basligi oldugunu dogrular
        Assert.assertTrue(billingAddressesPage12.billingAddressBasligi.isDisplayed());

        //   Kullanıcı ADD butonuna tiklar
        billingAddressesPage12.addButonu.click();

        //   Kullanici billing adres sayfasinda oldugunu dogrular
        Assert.assertTrue(billingAddressesPage12.sayfaDogrulamasi.isDisplayed());

        //   Kullanici First Name alanina valid bir deger girer
        billingAddressesPage12.firstNameKutusu.sendKeys(ConfigReader.getProperty("firstName12"));

        //   Kullanici Last Name alanina valid bir deger girer Kullanici Country/Region alanina ulke ismi girer
        billingAddressesPage12.lastNameKutusu.sendKeys(ConfigReader.getProperty("lastName12"),
                Keys.TAB, Keys.TAB, "Turkey", Keys.TAB, Keys.TAB);


        //  Kullanici Street adress alanina valid bir deger girmez

        //****************************************

        //   Kullanici POSTCODE / ZIP alanina valid bir deger girer
        billingAddressesPage12.zipPostcodeKutusu.sendKeys(ConfigReader.getProperty("zipPostcode12"));

        //   Kullanici TOWN/CITY alanina valid bir deger girer
        //   Kullanici PROVİNCE alaninda valid bir eyalet ismi secer
        //   Kullanici Phone alanina valid bir deger girer
        billingAddressesPage12.townCityKutusu.sendKeys(ConfigReader.getProperty("townCity12"),
                Keys.TAB, "Istanbul", Keys.ENTER, Keys.TAB, "05555555555");

        // Kullanıcı sayfasındaki SAVE ADRESS butonuna tıklar
        // myAccount12Page.saveAddressButonu.click();

        //   Kullanıcı billing adresine eklenmediğine dair mesaj alır
        //   Kullanıcı bilgi mesajını dogrular
        //    Assert.assertTrue(myAccount12Page.streetAddressUyariMesaji.isDisplayed());
        // Driver.closeDriver();

    }
}
