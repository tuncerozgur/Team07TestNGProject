package allovercommerce.tests;

import allovercommerce.pages.AccountDetailsPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.security.Key;

public class AccountDetailsTest {
    @Test
    public void test() {

        //Sayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));

        //Sayfaya giriş yapalım
        AccountDetailsPage accountDetailsPage = new AccountDetailsPage();
        accountDetailsPage.signInButton.click();

        //ıd şifre girelim
        accountDetailsPage.usernameBox.sendKeys(ConfigReader.getProperty("username05"));
        accountDetailsPage.passwordBox.sendKeys(ConfigReader.getProperty("password05"));

        //giriş butonuna basalım
        accountDetailsPage.loginBox.click();

        //3saniye bekletelim
        ReusableMethods.bekle(3);

        //sing out kısmından ayarlara gelelim
        accountDetailsPage.signOut.click();

        //accountdetails bölümüne basalım
        accountDetailsPage.accountDetailsButton.click();

        //sayfaya isim ekle

        accountDetailsPage.firstNameBox.sendKeys("IN");

        //last name ekle, display name değiştir ve email değiştir
        accountDetailsPage.lastNameBox.sendKeys("ARYA",Keys.TAB,"akin.sakarya",Keys.TAB,"farhan.brando@farmoaks.com");


        //biography ekle
        accountDetailsPage.textBox.click();
        accountDetailsPage.biographyBox.sendKeys("1907",Keys.TAB);

        //mevcut şifreyi yaz
        accountDetailsPage.currentPasswordBox.sendKeys("kinsey.ramelo@farmoaks.com", Keys.TAB);

        //yeni şifreyi yaz
        accountDetailsPage.newPasswordBox.sendKeys("goforvictory.1907",Keys.TAB);

        //şifre tekrarlarını gir
        accountDetailsPage.confirmPasswordBox.sendKeys("goforvictory.1907");

        //save changes butonuna bas
        //accountDetailsPage.saveChangesButton.click();


    }
}
