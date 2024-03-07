package allovercommerce.tests;

import allovercommerce.pages.ShoppingPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest {
    @Test
    public void ShoppingTest(){

        //1-Kullanıcı websitesine gider
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        //Sayfanın sağ üst bölümündeki Sign In butonuna tıklayarak giriş ekranına ulaşır.

        ShoppingPage shoppingPage = new ShoppingPage();
        ReusableMethods.visibleWait(shoppingPage.signInButton,3);
        shoppingPage.signInButton.click();
        //Kullanıcı ilgili alanlara Username ve Password bilgisini yazar ve giriş sağlar.
        shoppingPage.userNameArea.sendKeys(ConfigReader.getProperty("customerUserName"));
        shoppingPage.passwordArea.sendKeys(ConfigReader.getProperty("customerPassword"));
        shoppingPage.loginButton.click();
        //Kullanıcı search box'tan istediği bir ürünü arar.
        shoppingPage.searchBoxButton.sendKeys("Men Sweater", Keys.ENTER);
        //Kullanıcı 'Add to Cart' butonuna tıklayarak ürünü sepete ekler.
        shoppingPage.addToCardButton.click();
        //Kullanıcı sağ üstte bulunan çanta ikonuna tıklar sepete eklediği ürünleri sağda açılan ekrandan görüntüler.
        shoppingPage.cartButton.click();
        //Assert.assertTrue(shoppingPage.productSweater.isDisplayed());
        //Kullanıcı 7. step'de, sağda açılan ekrandan 'View Cart' butonuna tıklar ve sepet sayfasına ulaşır.
        ReusableMethods.click(shoppingPage.viewCartButton);
        //Kullanıcı Quantity başlığı altındaki + ve - butonlarına tıklayarak sepetteki ürünün miktarını azaltabilir veya arttırabilir.
        shoppingPage.plusButton.click();
        shoppingPage.minusButton.click();
        //Kullanıcı ödeme adımına geçmek için Proceed To Checkout butonuna tıklar.
        ReusableMethods.click(shoppingPage.proceedToCheckout);
        //Kullanıcı açılan sayfada fatura adresi bilgilerinin otomatik doldurulduğunu doğrular.
        Assert.assertTrue(shoppingPage.lastNameDogrulama.isDisplayed());
        //Kullanıcı Payments Method başlığı altında bulunan seçeneklerden ödeme şeklini seçer.
        shoppingPage.PaymentMethods.click();
        //Kullanıcı son olarak Place Order butonuna basarak siparişi verme işlemini tamamlar.
        shoppingPage.PlaceOrderButton.click();

        Driver.closeDriver();
    }
}
