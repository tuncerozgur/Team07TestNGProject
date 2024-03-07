package allovercommerce.tests;

import allovercommerce.pages.ComparePage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import org.testng.annotations.Test;

public class CompareTest {
    @Test
    public void positiveTest() {
        // Kullanıcı sayfadan Men butonuna tıklar ve erkek ürünleri kategorisine gider.
        ComparePage comparePage = new ComparePage();
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        comparePage.signInButton.click();
        comparePage.usernameBox.sendKeys(ConfigReader.getProperty("username05"));
        comparePage.passwordBox.sendKeys(ConfigReader.getProperty("password05"));
        comparePage.signInButton2.click();
        ReusableMethods.click(comparePage.manButonu);

        // Kullanıcı sayfadaki ürünlerin üzerine imleci getirerek ürünün sağ üst bölümündeki terazi ikonuna tıklayarak 4 ürünü karşılaştırma paneline ekler.
        ReusableMethods.click(comparePage.satrancTerazi);
        ReusableMethods.click(comparePage.griPantolon);
        ReusableMethods.click(comparePage.pusula);
        ReusableMethods.click(comparePage.tisort);

        // Kullanıcı Start Compare butonuna basarak ürünleri karşılaştırır.
        ReusableMethods.click(comparePage.startCompareButton);

        // Kullanıcı karşılaştırma panelindeyken ürünlerin üst kısmındaki x ikonuna basarak ürünleri panelden siler ve yerine yeni ürün ekler.
        ReusableMethods.click(comparePage.pantolonX);
    }
    @Test
    public void negativeTest(){
        // Kullanıcı sayfadan Men butonuna tıklar ve erkek ürünleri kategorisine gider.
        ComparePage comparePage = new ComparePage();
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        comparePage.signInButton.click();
        comparePage.usernameBox.sendKeys(ConfigReader.getProperty("username05"));
        comparePage.passwordBox.sendKeys(ConfigReader.getProperty("password05"));
        comparePage.signInButton2.click();
        ReusableMethods.click(comparePage.manButonu);

        // Kullanıcı sayfadaki ürünlerin üzerine imleci getirerek ürünün sağ üst bölümündeki terazi ikonuna tıklayarak 4 ürünü karşılaştırma paneline ekler.
        ReusableMethods.click(comparePage.satrancTerazi);
        ReusableMethods.click(comparePage.griPantolon);
        ReusableMethods.click(comparePage.pusula);
        ReusableMethods.click(comparePage.tisort);

        // Kullanıcı Start Compare butonuna basarak ürünleri karşılaştırır.
        ReusableMethods.click(comparePage.startCompareButton);

        //Kullanıcı karşılaştırma paneline 4'den fazla ürün eklemeyi dener.
    }
}
