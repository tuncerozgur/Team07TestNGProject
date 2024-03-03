package allovercommerce.tests;

import allovercommerce.pages.RegistrationPage_02;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest_02 {

    //**Kullanıcı daha önce girilmiş  değerlerle sisteme giriş yapamamalı**

    @Test
    public void test01() {
        //Kullanıcı daha önce girilmiş  değerlerle sisteme giriş yapamamalı
        //Kullanıcı web sitesine gider
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        Faker faker = new Faker();

        //Register  butonuna tıklar
        RegistrationPage_02 registrationPage02 = new RegistrationPage_02();
        registrationPage02.registerButton.click();

        //Farklı bir user name girer
        registrationPage02.userNameTextBox.sendKeys(faker.name().username());

        //Aynı email adresi girer
        registrationPage02.emailTextBox.sendKeys(ConfigReader.getProperty("customerEmail"));

        //Aynı password girer
        registrationPage02.passwordTextBox.sendKeys(ConfigReader.getProperty("customerPassword"));

        //"""I agree to the privacy policy"" butonunu onaylar"
        registrationPage02.iAgreeButton.click();

        //Sign up butonuna tıklar
        registrationPage02.signUpButton.click();

        //"An account is already registered with your email address"mesajını görür"
        Assert.assertTrue(registrationPage02.signUpErrorMessageEmail.isDisplayed());
        
        Driver.closeDriver();
    }

    @Test
    public void negativeTest() {

        RegistrationPage_02 registrationPage02 = new RegistrationPage_02();
        Faker faker = new Faker();

        //Kullanıcı web sitesine gider
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));

        //Register  butonuna tıklar
        registrationPage02.registerButton.click();

        //Farklı bir user name girer
        registrationPage02.userNameTextBox.sendKeys(faker.name().username());

        //Aynı email adresi girer
        registrationPage02.emailTextBox.sendKeys(ConfigReader.getProperty("customerEmail"));

        //Aynı password girer
        registrationPage02.passwordTextBox.sendKeys(ConfigReader.getProperty("customerPassword"));

        //"""I agree to the privacy policy"" butonunu onaylar"
        registrationPage02.iAgreeButton.click();

        //Sign up butonuna tıklar
        registrationPage02.signUpButton.click();

        //"""An account is already registered with your email address.. ""mesajını görür"
        Assert.assertTrue(registrationPage02.signUpErrorMessageEmail.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void negativeTest2() {
        //Web sitesine daha önce giriş yapılmış olmalı
        //Kullanıcı web sitesine gider
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));
        RegistrationPage_02 registrationPage02=new RegistrationPage_02();
        Faker faker = new Faker();

        //Register  butonuna tıklar
        registrationPage02.registerButton.click();

        //Farklı bir email adresi girer
        registrationPage02.emailTextBox.sendKeys(faker.internet().emailAddress());

        //User name alanina daha önceden oluşturulmuş  bir üyelik ile aynı girer
        registrationPage02.userNameTextBox.sendKeys(ConfigReader.getProperty("customerUserName"));

        //Valid bir password girer
        registrationPage02.passwordTextBox.sendKeys(ConfigReader.getProperty("customerPassword"));

        //"""I agree to the privacy policy"" butonunu onaylar"
        registrationPage02.iAgreeButton.click();

        //Sign up butonuna tıklar
        registrationPage02.signUpButton.click();

        //"""An account is already registered with that username. Please choose another. ""mesajını görür"
        Assert.assertTrue(registrationPage02.signUpErrorMessageUsername.isDisplayed());

        Driver.closeDriver();
    }
}
