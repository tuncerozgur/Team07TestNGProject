package allovercommerce.tests;

import allovercommerce.pages.AddProductAndShopingPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductAndShoping_17 {

    @Test
    public void test() {

        //Url e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));

        //Sign in ikonu tiklanir
        AddProductAndShopingPage addProductAndShopingPage=new AddProductAndShopingPage();
        addProductAndShopingPage.signInButton.click();

        //Username or email address kutusuna Username girilir
        addProductAndShopingPage.userNameBox.sendKeys(ConfigReader.getProperty("alloverCommerceUserName"));

        //Password kutusuna Password girilir
        addProductAndShopingPage.passwordBox.sendKeys(ConfigReader.getProperty("alloverCommerceUserPassword"));

        //Sign in butonuna tiklanir ve giriş yapılır
        addProductAndShopingPage.signIn2Button.click();
        Assert.assertTrue(addProductAndShopingPage.signOutButonu.isDisplayed());

        //Kullanıcı searchbox'a herhangi bir ürün yazar ve aratır
        addProductAndShopingPage.searchBox.sendKeys("chess", Keys.ENTER);

        //Açılan sayfadaki ürünü sepetine ekler
        ReusableMethods.click(addProductAndShopingPage.addProductChess);

        //Kullanıcı başka bir ürün aratır ve sepetine ekler
        ReusableMethods.visibleWait(addProductAndShopingPage.searchBox,2);
        addProductAndShopingPage.searchBox.sendKeys("iphone",Keys.ENTER);
        ReusableMethods.click(addProductAndShopingPage.productIphone);
        ReusableMethods.click(addProductAndShopingPage.addProductIphone);

        //Kullanıcı alışveriş sepetine gider ve checkout butonuna tıklar.
        addProductAndShopingPage.cartButton.click();
        addProductAndShopingPage.checkoutButton.click();

        //Açılan sayfada fatura bilgilerinin otomatik olarak geldiğini doğrular
        ReusableMethods.visibleWait(addProductAndShopingPage.billingAdressConfirm,2);
        Assert.assertTrue(addProductAndShopingPage.billingAdressConfirm.isDisplayed());


        //Kullanıcı toplam ödenecek rakamı görüntüler
        Assert.assertTrue(addProductAndShopingPage.totalPrice.isDisplayed());
        String str=addProductAndShopingPage.totalPrice.getText();

        //Ödeme yöntemlerinin seçilebilirliğini doğrular
        if (!addProductAndShopingPage.payAtDoor.isSelected()) {
            ReusableMethods.click(addProductAndShopingPage.payAtDoor);
        }


        //Kullanıcı PlaceOrder butuonuna tıklar
        ReusableMethods.click(addProductAndShopingPage.placeOrderButton);

        //Alışverişin tamamlandığına dair doğrulama mesajını alır
        Assert.assertTrue(addProductAndShopingPage.thanksForYourOrderMessage.isDisplayed());

        //My Account-Orders butonuna tıklar
        addProductAndShopingPage.signOutButonu.click();
        addProductAndShopingPage.ordersButton.click();

        //Kullanıcı yapmış olduğu alışverişin varlığını doğrular
        String confirmPrice=addProductAndShopingPage.amountConfirm.getText();
        Assert.assertEquals(confirmPrice,str);

    }
}
