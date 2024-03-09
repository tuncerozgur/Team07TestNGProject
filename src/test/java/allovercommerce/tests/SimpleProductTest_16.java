package allovercommerce.tests ;


import allovercommerce.pages.SimpleProductPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleProductTest_16 {
    @Test
    public void test() {
        //Url e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        SimpleProductPage simpleProductPage = new SimpleProductPage();
        //Sign in ikonu tiklanir
        simpleProductPage.signInButonu.click();

        //Username or email address kutusuna Username girilir
        simpleProductPage.userNameKutusu.sendKeys(ConfigReader.getProperty("vendoruserName11"));

        //Password kutusuna Password girilir
        simpleProductPage.passwordKutusu.sendKeys(ConfigReader.getProperty("vendorpassword11"));

        //Sign in butonuna tiklanir ve login olduğu doğrulanır
        simpleProductPage.remembermeKutucugu.click();
        simpleProductPage.girisButonu.click();

        //My Account ikonuna tiklanir ve sayfada olduğunu doğrular
        simpleProductPage.signOutButonu.click();

        //Store Manager e tiklanir ve sayfada oldugunu doğrular
        simpleProductPage.storeManagerBolumu.click();
        Assert.assertTrue(simpleProductPage.storeManagerYazisi.isDisplayed());

        //My Store satirinda Product basligi dogrulanir
        Assert.assertTrue(simpleProductPage.prodoctsDogrulama.isDisplayed());
        simpleProductPage.prodoctsDogrulama.click();

        //Add New butonuna tiklanir ve sayfada oldugu doğrulanır
        simpleProductPage.addNewButton.click();
        Assert.assertTrue(simpleProductPage.addSayfaDogrulama.isDisplayed());

        //Simle Product default olarak geldigi dogrulanir
        Assert.assertTrue(simpleProductPage.simpleProdoctDogrulama.isSelected());

        //Virtual secilebilir oldugu dogrulanir
        ReusableMethods.click(simpleProductPage.virtualBoxDogrulama);
        Assert.assertTrue(simpleProductPage.virtualBoxDogrulama.isDisplayed());

        //Downloadable secilebilir oldugu dogrulanir
        ReusableMethods.click(simpleProductPage.downloadableBoxDogrulama);
        Assert.assertTrue(simpleProductPage.downloadableBoxDogrulama.isDisplayed());

        //Price kutusuna deger girilebildigi dogrulanir
        simpleProductPage.priceBox.sendKeys("300");
        Assert.assertTrue(simpleProductPage.priceBox.isDisplayed());

        //Sale Price kutusuna deger  girilebildigi dogrulanir
        simpleProductPage.salePriceBox.sendKeys("500");
        Assert.assertTrue(simpleProductPage.salePriceBox.isDisplayed());

        //Product Title kutusuna deger girilebildigi dogrulanir
        simpleProductPage.productTitleBox.sendKeys("3 ALANA 3 DEFA DAHA ALMAK PARASIYLA BEDAVA");
        Assert.assertTrue(simpleProductPage.productTitleBox.isDisplayed());

        //Categories secilebilirligi dogrulanir
        ReusableMethods.click(simpleProductPage.gunTarhanalari21);
        Assert.assertTrue(simpleProductPage.gunTarhanalari21.isDisplayed());

        Driver.closeDriver();
    }


}