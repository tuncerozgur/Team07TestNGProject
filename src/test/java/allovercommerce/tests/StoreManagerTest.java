package allovercommerce.tests;

import allovercommerce.pages.StoreManagerPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StoreManagerTest {
    @Test
    public void testTC01() {


        //Kullanıcı Web sitesine gider ve Sign in butonuna tiklanir
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        StoreManagerPage storeManagerPage= new StoreManagerPage();
        storeManagerPage.signInButton.click();
        // Username or email address kutusuna Username girilir
        storeManagerPage.usernameBox.sendKeys(ConfigReader.getProperty("alloverCommerceUsername"));
        //Password kutusuna Password girilir
        storeManagerPage.passwordBox.sendKeys(ConfigReader.getProperty("alloverCommercePassword"));
        //Sign in butonuna tıklar
        storeManagerPage.signInButton2.click();

        // Login olundugu dogrulanir
        Assert.assertTrue(storeManagerPage.signOutButonu.isDisplayed());

        //sign out tıklanır ve my account sayfasinda olundugu dogrulanir

        storeManagerPage.signOutButonu.click();
        Assert.assertTrue(storeManagerPage.myAccountyazisi.isDisplayed());


        //Store Manager e tiklanir ve My Store sayfasinda olundugu dogrulanir
        storeManagerPage.storeManagerButton.click();
        Assert.assertTrue(storeManagerPage.myStoreButton.isDisplayed());

        // Product basligi dogrulanir Product a tiklanir
        Assert.assertTrue(storeManagerPage.productsButton.isDisplayed());
        storeManagerPage.productsButton.click();
        //Add New butonuna tiklanir ve Add Product sayfasinda olundugu dogrulanir
        storeManagerPage.addNewButton.click();
        Assert.assertTrue(storeManagerPage.productText.isDisplayed());
        ReusableMethods.scrollEnd();
        //Inventory secenegi dogrulanir
        Assert.assertTrue(storeManagerPage.inventoryOption.isDisplayed());
        //Shipping secenegi dogrulanir
        Assert.assertTrue(storeManagerPage.shippingOption.isDisplayed());
        //Attributes secenegi dogrulanir
        Assert.assertTrue(storeManagerPage.attributesOption.isDisplayed());
        //Linked seçenegi dogrulanir
        Assert.assertTrue(storeManagerPage.linkedOption.isDisplayed());
        //Seo seçenegi dogrulanir
        Assert.assertTrue(storeManagerPage.seoOption.isDisplayed());
        //Advanced seçenegi dogrulanır
        Assert.assertTrue(storeManagerPage.advancedOption.isDisplayed());


    }









    @Test(dependsOnMethods = "testTC01")
    public void testTC02() {


        //Inventory secenegi dogrulanir
        StoreManagerPage storeManagerPage= new StoreManagerPage();
        Assert.assertTrue(storeManagerPage.inventoryOption.isDisplayed());

        //SKU alanına bir stok kodu girilir
        storeManagerPage.skuButton.sendKeys("1234");

        //  manage stock alanı seçilir
        ReusableMethods.click(storeManagerPage.manageStock);

        //  stock qty  alanı doldurulur
        storeManagerPage.stockQtyBolumu.sendKeys("50");

        //  sold individually alanı seçilir
        ReusableMethods.click(storeManagerPage.soldIndividually);
    }


    @Test(dependsOnMethods = "testTC01")
    public void testTC03() {
        //  Shipping butonuna tıklanır
        StoreManagerPage storeManagerPage = new StoreManagerPage();
        ReusableMethods.click(storeManagerPage.shippingButton2);

        // weight alanı seçilir ve deger girilir
        //  lenght alanı, width alanı, height alanına degerler girilir

        ReusableMethods.click(storeManagerPage.weightBox);
        storeManagerPage.weightBox.sendKeys("10");

        ReusableMethods.click(storeManagerPage.lenghtBox);
        storeManagerPage.lenghtBox.sendKeys("20", Keys.TAB);
        ReusableMethods.click(storeManagerPage.widthBox);
        storeManagerPage.widthBox.sendKeys("30",Keys.TAB);
        ReusableMethods.click(storeManagerPage.heightBox);
        ReusableMethods.sendKeysJS(storeManagerPage.heightBox,"40");

        //    Shipping class alanı dogrulanır
        storeManagerPage.shippingClassBox.click();
        storeManagerPage.shippingClassBox.sendKeys("No shipping class",Keys.ENTER);

        //     Processing time alanına secenek eklenir
        ReusableMethods.click(storeManagerPage.processingTimeBox);
        storeManagerPage.processingTimeBox.sendKeys("1 business day",Keys.PAGE_DOWN,Keys.ENTER);




    }

    @Test(dependsOnMethods = "testTC01")
    public void testTC04() {
        //   Attributes butonuna tıklanır
        StoreManagerPage storeManagerPage= new StoreManagerPage();
        ReusableMethods.click(storeManagerPage.attributesButton2);

        //   color alanı secilir ve color alanına renk seçilir
        ReusableMethods.click(storeManagerPage.colorBoxActive);
        storeManagerPage.colorBox.click();
        storeManagerPage.colorBox.sendKeys("Yellow",Keys.TAB,Keys.TAB,Keys.ENTER);



        //    size alanı aktif edilir ve size alanına deger girilir
        ReusableMethods.click(storeManagerPage.sizeBoxActive);
        ReusableMethods.click(storeManagerPage.sizeBox);
        ReusableMethods.sendKeysJS(storeManagerPage.sizeBox,"01_09_11_12_2023");



        //add attribute seçili olsun
        storeManagerPage.addAttributeText.isSelected();

        //   Submit butonuna tıklanır
        ReusableMethods.click(storeManagerPage.submitBox);

    }}

