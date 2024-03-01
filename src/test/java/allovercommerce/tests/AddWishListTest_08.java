package allovercommerce.tests;

import allovercommerce.pages.AddWishListPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddWishListTest_08 {

    @Test
    public void testName() {
        //Kullanıcı anasayfaya gider https://allovercommerce.com/

        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));

        //Kullanıcı mail adresini ve passwordu yazıp sayfaya giriş yapar
        AddWishListPage addWishListPage = new AddWishListPage();
        addWishListPage.signInButton.click();
        addWishListPage.userNameTextBox.sendKeys(ConfigReader.getProperty("alloverCommerceUserName"));
        addWishListPage.passwordTextBox.sendKeys(ConfigReader.getProperty("alloverCommerceUserPassword"));
        addWishListPage.rememberMeCheckbox.click();
        addWishListPage.signIn2.click();


        ReusableMethods.bekle(2);

        //Kullanıcı anasayfada ilgilendiği ürün için arama yapar
        addWishListPage.searchBox.sendKeys("macbook", Keys.ENTER);

        //Arama sonucunda çıkan ürünlerden istediğine tıklayıp açar
        addWishListPage.productMac.click();

        //Açtığı ürünün yanında bulunan kalp simgesine tıklar.
        addWishListPage.addToFavorite.click();

        //Kullanıcı sayfanın sağındaki "Whishlist"yazısına tıklarve ürünün varlığını doğrular
        addWishListPage.wishListButton.click();
        Assert.assertTrue(addWishListPage.productMac2.isDisplayed());

        //Ekleme yaptığı ürünler için "Quick View" yazısına tıklar ve tıklandığını doğrular
        addWishListPage.quickViewButton.click();
        ReusableMethods.visibleWait(addWishListPage.addToCartButton, 5);
        Assert.assertTrue(addWishListPage.addToCartButton.isDisplayed());


        //Wishlistteki herhangi bir ürünü sepete ekler ve bilgi mesajı alındığını doğrular
        addWishListPage.addToCartButton.click();
        Assert.assertTrue(addWishListPage.wishlistPopUp.isDisplayed());

        //Sepetteki ürünü almak için "check out" yazısına tıklar ve ödeme sayfasının açıldıgını doğrular
        addWishListPage.closeAddToCartButton.click();
        addWishListPage.sepetButton.click();
        addWishListPage.checkOutButton.click();

        //Kullanıcı onceden kaydetmiş oldugu billing details'in varlığını doğrular
        String expectedBillingAdress = "apple street ";
        String actualBillingAdress = addWishListPage.billingAdressConfirm.getText().toString();
        Assert.assertEquals(expectedBillingAdress, actualBillingAdress);

        //Kullanıcı pay at the door ödeme şeklini seçebilir.

        if (!addWishListPage.payAtDoor.isSelected()) {
            addWishListPage.payAtDoor.click();
        }


        //Kullanıcı "place order" seceneğini tıklar ve alışverişin tamamlandığını doğrular
        addWishListPage.placeOrderButton.click();
        Assert.assertTrue(addWishListPage.thanksForYourOrderMessage.isDisplayed());
    }

}
