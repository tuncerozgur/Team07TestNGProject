package allovercommerce.tests;

import allovercommerce.pages.CIsSWithCouponPage_19;
import allovercommerce.pages.VIsSWithCouponPage_20;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VIsSWithCouponTest_20 {

    @Test
    public void testpositive() {

        //1-Kullanıcı websitesine gider
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));

        //2-Kullanıcı mail adresini ve passwordu yazıp sayfaya giriş yapar
        VIsSWithCouponPage_20 vIsSWithCouponPage20=new VIsSWithCouponPage_20();
        vIsSWithCouponPage20.signInButton.click();
        vIsSWithCouponPage20.userNameTextBox.sendKeys(ConfigReader.getProperty("alloverCommerceUserName"));
        vIsSWithCouponPage20.passwordTextBox.sendKeys(ConfigReader.getProperty("alloverCommerceUserPassword"));
        vIsSWithCouponPage20.rememberMeCheckbox.click();
        vIsSWithCouponPage20.signIn2.click();

        //3-Kullanıcı indirim koduna uygun search box'tan istediği bir ürünü arar.
        ReusableMethods.bekle(2);
        vIsSWithCouponPage20.searchBox.sendKeys("Men Sweater", Keys.ENTER);

        //4-Kullanıcı 'Add to Cart' butonuna tıklayarak ürünü sepete ekler.
        vIsSWithCouponPage20.addToCartButton.click();

        //5-Kullanıcı sağ üstte bulunan çanta ikonuna tıklar sepete eklediği ürünleri sağda açılan ekrandan görüntüler.
        vIsSWithCouponPage20.chartButton.click();
        Assert.assertTrue(vIsSWithCouponPage20.productSweater.isDisplayed());


        //6-Kullanıcı sağda açılan ekrandan 'View Cart' butonuna tıklar ve sepet sayfasına ulaşır.
        vIsSWithCouponPage20.checkOutButton.click();

        //7-Kullanıcı Coupon Discount başlığı altındaki alana kupon kodunu girer.
        vIsSWithCouponPage20.coupunButton.click();
        vIsSWithCouponPage20.coupunCodeButton.sendKeys("kazak25");

        //8-Kullanıcı Apply Coupon butonuna basarak kuponu uygular.
        vIsSWithCouponPage20.applyCouponButton.click();

        //9-Kullanıcı üste "Coupon code applied successfully." yazısını gördüğünü doğrular
        String expectedCoupon= "Coupon code applied successfully.";
        String actualCoupon=vIsSWithCouponPage20.applyCouponText.getText().toString();
        Assert.assertEquals(expectedCoupon, actualCoupon);

        //10-Kullanıcı Payments Method başlığı altında bulunan seçeneklerden ödeme şeklini seçer.

        if (!vIsSWithCouponPage20.payAtDoor.isSelected()) {
            vIsSWithCouponPage20.payAtDoor.submit();
        }

        //11-Kullanıcı son olarak Place Order butonuna basarak siparişi verme işlemini tamamlar.
        vIsSWithCouponPage20.placeOrderButton.submit();

        ReusableMethods.bekle(10);

        //12-Ekranda "Thank you. Your order has been received." yazısı gördüğünü doğrular

        Assert.assertTrue(vIsSWithCouponPage20.thanksForYourOrderMessage.isDisplayed());
        Driver.closeDriver();
    }


    @Test
    public void testNegative() {

        //1-Kullanıcı websitesine gider
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));

        //2-Kullanıcı mail adresini ve passwordu yazıp sayfaya giriş yapar
        VIsSWithCouponPage_20 vIsSWithCouponPage20=new VIsSWithCouponPage_20();
        vIsSWithCouponPage20.signInButton.click();
        vIsSWithCouponPage20.userNameTextBox.sendKeys(ConfigReader.getProperty("alloverCommerceUserName"));
        vIsSWithCouponPage20.passwordTextBox.sendKeys(ConfigReader.getProperty("alloverCommerceUserPassword"));
        vIsSWithCouponPage20.rememberMeCheckbox.click();
        vIsSWithCouponPage20.signIn2.click();

        //3-Kullanıcı indirim koduna uygun search box'tan istediği bir ürünü arar.
        ReusableMethods.bekle(2);
        vIsSWithCouponPage20.searchBox.sendKeys("Men Sweater", Keys.ENTER);

        //4-Kullanıcı 'Add to Cart' butonuna tıklayarak ürünü sepete ekler.
        vIsSWithCouponPage20.addToCartButton.click();


        //5-Kullanıcı sağ üstte bulunan çanta ikonuna tıklar sepete eklediği ürünleri sağda açılan ekrandan görüntüler.
        vIsSWithCouponPage20.chartButton.click();
        Assert.assertTrue(vIsSWithCouponPage20.productSweater.isDisplayed());


        //6-Kullanıcı sağda açılan ekrandan 'View Cart' butonuna tıklar ve sepet sayfasına ulaşır.
        vIsSWithCouponPage20.checkOutButton.click();

        //7-Kullanıcı Coupon Discount başlığı altındaki alana kupon kodunu girer.
        vIsSWithCouponPage20.coupunButton.click();
        vIsSWithCouponPage20.coupunCodeButton.sendKeys("asdfa25");

        //8-Kullanıcı Apply Coupon butonuna basarak kuponu uygular.
        vIsSWithCouponPage20.applyCouponButton.click();

        //9-Kullanıcı üste "Coupon "asdfa25" does not exist!" yazısını gördüğünü doğrular
        String expectedCoupon= "Coupon \"asdfa25\" does not exist!";
        String actualCoupon=vIsSWithCouponPage20.applyCoupon2Text.getText().toString();
        Assert.assertEquals(expectedCoupon, actualCoupon);
        Driver.closeDriver();


    }
}

