package allovercommerce.tests;



import allovercommerce.pages.CouponCreationPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateCouponAsVendorTest {

    @Test
    public void positiveTest() {

        //Kullanıcı site url'e tılayıp site anasayfasına gider.
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));

        //Kullanıcı sağ üste bulunan sign in butonuna tıklar.
        CouponCreationPage couponCreationPage= new CouponCreationPage();
        couponCreationPage.loginButton.click();

        //Kullanıcı Username or email address kısmına geçerli email girer.
        //Kullanıcı Password kısmına geçerli password'u girer.
        //Kullanıcı sign in butonuna tıklar ve log in olur.
        couponCreationPage.email.sendKeys(ConfigReader.getProperty("vendorUserName02"));
        couponCreationPage.password.sendKeys(ConfigReader.getProperty("vendorPassword02"),Keys.ENTER);

        ReusableMethods.bekle(2);

        //Kullanıcı sayfanın alt kısmında bulunan "My Account" butonuna tıklanır
        ReusableMethods.scrollEnd();
        couponCreationPage.myAccountButton.click();

        //Kullanıcı sol tarafta bulunan Store Manager butonuna tıklar
        couponCreationPage.storeManagerButton.click();

        //Kullanıcı açılan ekranda sol kısımda bulunan Coupons butonuna tıklar
        ReusableMethods.scroll(couponCreationPage.coupons);
        couponCreationPage.coupons.click();

        //Kullanıcı açılan ekranda Add New butonuna tıklar
        ReusableMethods.scroll(couponCreationPage.addNewButton);
        couponCreationPage.addNewButton.click();

        //Kullanıcı olusturmak istediği kodu code bölümüne girer ve doğrulanır.
        ReusableMethods.scroll(couponCreationPage.addNewButton);//cod bölümüne ulaşmak icin sayfayı add new butonuna kadar kayıdırıldı.
        couponCreationPage.code.sendKeys("Onyx25");
        Assert.assertNotNull(couponCreationPage.code);

        //Kullanıcı Description bölümüne açıklama  yazar ve doğrular.
        couponCreationPage.description.sendKeys("Secili ürünlerde %25 indirim");
        Assert.assertNotNull(couponCreationPage.description);

        //Kullanıcı Discount Type bölümünden veriyi seçer ve doğrulanır
        Assert.assertTrue(couponCreationPage.discountType.getText().contains("Percentage discount"));

        //Kullanıcı Coupon Amount alanını doldurur ve doğrulanır.
        couponCreationPage.couponAmount.sendKeys("25");
        Assert.assertNotNull(couponCreationPage.couponAmount);

        //Kullanıcı Coupon expiry date girer ve girdiği doğrulanır.
        couponCreationPage.expiryDate.sendKeys("2024-02-29");
        Assert.assertNotNull(couponCreationPage.expiryDate);
        couponCreationPage.expiryDate.sendKeys(Keys.TAB);

        //Kullanıcı Allow free shipping alanını seçer ve seçtiği doğrulanır.
        couponCreationPage.freeShippingCheckbox.click();
        Assert.assertTrue(couponCreationPage.freeShippingCheckbox.isSelected());

        //Kullanıcı Show on store alanını seçer ve seçtiği doğrulanır.
        couponCreationPage.showOnStoreCheckbox.click();
        Assert.assertTrue(couponCreationPage.showOnStoreCheckbox.isSelected());

        //Kullanıcı geçerli sayfanın alt kısmında bulunan submit butonuna tıklar ve coupun'u olsturur
        ReusableMethods.scroll(couponCreationPage.submitButton);
        couponCreationPage.submitButton.click();

        ReusableMethods.bekle(3);

        //Kullanıcı Store Maneger sayfasından coupon ekranına geldiğinde olusturdugu coupon'u görür ve doğrulanır.
        ReusableMethods.scroll(couponCreationPage.coupons);
        couponCreationPage.coupons.click();
        ReusableMethods.scroll(couponCreationPage.addNewButton);
        ReusableMethods.bekle(2);
        Assert.assertTrue(couponCreationPage.couponsTabel.getText().contains("Onyx25"));

        //Sayfa kapatılır.
        Driver.closeDriver();
    }

    @Test
    public void negativeTest() {

        //Kullanıcı site url'e tılayıp site anasayfasına gider.
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));

        //Kullanıcı sağ üste bulunan sign in butonuna tıklar.
        CouponCreationPage couponCreationPage= new CouponCreationPage();
        couponCreationPage.loginButton.click();

        //Kullanıcı Username or email address kısmına geçerli email girer.
        //Kullanıcı Password kısmına geçerli password'u girer.
        //Kullanıcı sign in butonuna tıklar ve log in olur.
        couponCreationPage.email.sendKeys(ConfigReader.getProperty("vendorUserName02"));
        couponCreationPage.password.sendKeys(ConfigReader.getProperty("vendorPassword02"),Keys.ENTER);

        ReusableMethods.bekle(2);

        //Kullanıcı sayfanın alt kısmında bulunan "My Account" butonuna tıklanır
        ReusableMethods.scrollEnd();
        couponCreationPage.myAccountButton.click();

        //Kullanıcı sol tarafta bulunan Store Manager butonuna tıklar
        couponCreationPage.storeManagerButton.click();

        //Kullanıcı açılan ekranda sol kısımda bulunan Coupons butonuna tıklar
        ReusableMethods.scroll(couponCreationPage.coupons);
        couponCreationPage.coupons.click();

        //Kullanıcı açılan ekranda Add New butonuna tıklar
        ReusableMethods.scroll(couponCreationPage.addNewButton);
        couponCreationPage.addNewButton.click();

        //Kullanıcı code kısmına veri girmez ve girmediği doğrulanır
        ReusableMethods.scroll(couponCreationPage.addNewButton);//cod bölümüne ulaşmak icin sayfayı add new butonuna kadar kayıdırıldı.
        Assert.assertTrue(couponCreationPage.code.getText().isEmpty());

        //Kullanıcı Description bölümüne açıklama  yazar ve doğrular.
        couponCreationPage.description.sendKeys("Secili ürünlerde %25 indirim");
        Assert.assertNotNull(couponCreationPage.description);

        //Kullanıcı Discount Type bölümünden veriyi seçer ve doğrulanır
        Assert.assertTrue(couponCreationPage.discountType.getText().contains("Percentage discount"));

        //Kullanıcı Coupon Amount alanını doldurur ve doğrulanır.
        couponCreationPage.couponAmount.sendKeys("25");
        Assert.assertNotNull(couponCreationPage.couponAmount);

        //Kullanıcı Coupon expiry date girer ve girdiği doğrulanır.
        couponCreationPage.expiryDate.sendKeys("2024-02-29");
        Assert.assertNotNull(couponCreationPage.expiryDate);

        //Kullanıcı Allow free shipping alanını seçer ve seçtiği doğrulanır.
        couponCreationPage.freeShippingCheckbox.click();
        Assert.assertTrue(couponCreationPage.freeShippingCheckbox.isSelected());

        //Kullanıcı Show on store alanını seçer ve seçtiği doğrulanır.
        couponCreationPage.showOnStoreCheckbox.click();
        Assert.assertTrue(couponCreationPage.showOnStoreCheckbox.isSelected());

        //Kullanıcı geçerli sayfanın alt kısmında bulunan submit butonuna tıklar.
        ReusableMethods.scroll(couponCreationPage.submitButton);
        couponCreationPage.submitButton.click();

        //Kullanıcı "Please insert atleast Coupon Title before submit." hatasını alır ve coupon olusturulamadığı doğrulanır
        ReusableMethods.visibleWait(couponCreationPage.alertMsg,2);
        Assert.assertTrue(couponCreationPage.alertMsg.getText().contains("Please insert atleast Coupon Title before submit."));
        Driver.closeDriver();
    }

}
