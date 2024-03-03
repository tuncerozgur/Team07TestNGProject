package allovercommerce.tests;

import allovercommerce.pages.AddBillingAddressPage;
import allovercommerce.pages.RegisterPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddBillingAddressTest_03 {
    String userName;
    String email;
    String password;

    @Test
    public void testRegister() {

        //Sayfaya gidilir.
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));

        //Register butonuna tıklanır.
        RegisterPage registerPage = new RegisterPage();
        registerPage.registerButton.click();

        //Username alanına valid bir değer girilir.
        Faker faker = new Faker();
        userName = faker.name().username();
        registerPage.userName.sendKeys(userName);

        //Your Email address alanına valid bir değer girilir.
        email = faker.internet().emailAddress();
        registerPage.email.sendKeys(email);

        //Password alanına valid bir değer girilir.
        password = faker.internet().password(4, 12);
        registerPage.password.sendKeys(password);

        //I agree to the privacy policy checkbox'una tıklanır.
        registerPage.agreeButton.click();

        //Sign Up butonuna tıklanır.
        registerPage.signInButton.click();

        //Sign Out butonu görür ve üye olduğunu doğrular
        Assert.assertTrue(registerPage.signOutButton.isDisplayed());

        //ve çıkış yapar
        registerPage.signOutButton.click();
        registerPage.logOutButton.click();
    }

        @Test(dependsOnMethods = "testRegister")
        public void testpositive() {

            //Sayfanın sağ üst bölümündeki Sign In butonuna tıklayarak giriş ekranına ulaşır.
            AddBillingAddressPage addBillingAddressPage = new AddBillingAddressPage();
            addBillingAddressPage.signInButton.click();

            //Kullanıcı ilgili alanlara Username ve Password bilgisini yazar ve giriş yaptıgını doğrular
            ReusableMethods.visibleWait(addBillingAddressPage.userName, 3);
            ReusableMethods.click(addBillingAddressPage.userName);
            addBillingAddressPage.userName.sendKeys(userName);
            addBillingAddressPage.password.sendKeys(password);
            addBillingAddressPage.signIn2Button.click();
            Assert.assertTrue(addBillingAddressPage.signOutButton.isDisplayed());

            //Kullanıcı My Account sekmesini tıklar
            addBillingAddressPage.signOutButton.click();

            //Kullanıcı Addresses kısmına tıklar
            addBillingAddressPage.addressButton.click();

            //Kullanıcı Billing Address başlığı altındaki ADD butonuna tıklar
            addBillingAddressPage.addButton.click();

            //First Name için valid bir değer girer
            addBillingAddressPage.firstName.sendKeys(ConfigReader.getProperty("customerFirstName"));

            //Last Name için valid bir değer girer
            addBillingAddressPage.lastName.sendKeys(ConfigReader.getProperty("customerLastName"));

            //Country/Region için valid bir değer seçer
            addBillingAddressPage.countryButton.sendKeys(ConfigReader.getProperty("customerCountryName"), Keys.TAB);
            ReusableMethods.bekle(2);

            //Street Address için valid bir değer girer
            addBillingAddressPage.streetTextBox.sendKeys(ConfigReader.getProperty("customerStreetName"));

            //Zip Code / Postcode için valid bir değer girer.
            addBillingAddressPage.zipcodeBox.sendKeys(ConfigReader.getProperty("customerZipCode"));

            //Town City için valid bir değer girer ve province için değer ataması yapar.
            addBillingAddressPage.townTextBox.sendKeys(ConfigReader.getProperty("customerTownName"), Keys.TAB, ConfigReader.getProperty("customerTownName"), Keys.TAB);

            //Phone için valid bir değer girer
            addBillingAddressPage.phoneTextBox.sendKeys(ConfigReader.getProperty("customerPhone"));

            //"Save address butonuna tıkladığımızda Billing Adress (Fatura Adresi) ekler"
            ReusableMethods.click(addBillingAddressPage.saveAdressButton);

            //Save Address butonuna tıklandığında "Address changed successfully." metni görüldüğünü doğrular
            ReusableMethods.visibleWait(addBillingAddressPage.successMessage, 2);
            Assert.assertTrue(addBillingAddressPage.successMessage.isDisplayed());

            //Güncelleme işlemleri için Edit your Billing Address butonuna tıklar
            ReusableMethods.click(addBillingAddressPage.editAddressButton);

            //Güncelleme işlemi yapılmalı. Yapıldıktan sonra "Address changed successfully."bilgi mesajını görür
            addBillingAddressPage.upDateAddress.sendKeys(ConfigReader.getProperty("customerApartment"));
            ReusableMethods.click(addBillingAddressPage.saveAdressButton);

            ReusableMethods.visibleWait(addBillingAddressPage.editSuccessMessage, 3);
            Assert.assertTrue(addBillingAddressPage.editSuccessMessage.isDisplayed());

            Driver.closeDriver();
        }

    @Test(dependsOnMethods = "testRegister")
    public void testNegative_01() {

        //Sayfanın sağ üst bölümündeki Sign In butonuna tıklayarak giriş ekranına ulaşır.
        AddBillingAddressPage addBillingAddressPage = new AddBillingAddressPage();
        addBillingAddressPage.signInButton.click();

        //Kullanıcı ilgili alanlara Username ve Password bilgisini yazar ve giriş yaptıgını doğrular
        ReusableMethods.visibleWait(addBillingAddressPage.userName, 3);
        ReusableMethods.click(addBillingAddressPage.userName);
        addBillingAddressPage.userName.sendKeys(userName);
        addBillingAddressPage.password.sendKeys(password);
        addBillingAddressPage.signIn2Button.click();
        Assert.assertTrue(addBillingAddressPage.signOutButton.isDisplayed());

        //Kullanıcı My Account sekmesini tıklar
        addBillingAddressPage.signOutButton.click();

        //Kullanıcı Addresses kısmına tıklar
        addBillingAddressPage.addressButton.click();

        //Kullanıcı Billing Address başlığı altındaki ADD butonuna tıklar
        addBillingAddressPage.addButton.click();

        //First Name için valid bir değer girer
        addBillingAddressPage.firstName.sendKeys(ConfigReader.getProperty("customerFirstName"));

        //Last Name için valid bir değer girer
        addBillingAddressPage.lastName.sendKeys(ConfigReader.getProperty("customerLastName"));

        //Country/Region için valid bir değer seçer
        addBillingAddressPage.countryButton.sendKeys(ConfigReader.getProperty("customerCountryName"), Keys.TAB);
        ReusableMethods.bekle(2);

        //Street Address için valid bir değer girer.
        addBillingAddressPage.streetTextBox.sendKeys(ConfigReader.getProperty("customerStreetName"));

        //Zip Code / Postcode için valid bir değer girer.
        addBillingAddressPage.zipcodeBox.sendKeys(ConfigReader.getProperty("customerZipCode"));

        //Town City için valid bir değer girer ve province için değer ataması yapar.
        addBillingAddressPage.townTextBox.sendKeys(ConfigReader.getProperty("customerTownName"), Keys.TAB, ConfigReader.getProperty("customerTownName"), Keys.TAB);

        //Phone için invalid bir değer girer veya değer girmez

        //"Save address butonuna tıkladığımızda "Phone is a required field." mesajını gorur
        ReusableMethods.click(addBillingAddressPage.saveAdressButton);
        Assert.assertTrue(addBillingAddressPage.invalidPhoneMsg.isDisplayed());

        Driver.closeDriver();

    }


    @Test(dependsOnMethods = "testRegister")
    public void testNegative_02() {

        //Sayfanın sağ üst bölümündeki Sign In butonuna tıklayarak giriş ekranına ulaşır.
        AddBillingAddressPage addBillingAddressPage=new AddBillingAddressPage();
        addBillingAddressPage.signInButton.click();

        //Kullanıcı ilgili alanlara Username ve Password bilgisini yazar ve giriş yaptıgını doğrular
        ReusableMethods.visibleWait(addBillingAddressPage.userName,3);
        ReusableMethods.click(addBillingAddressPage.userName);
        addBillingAddressPage.userName.sendKeys(userName);
        addBillingAddressPage.password.sendKeys(password);
        addBillingAddressPage.signIn2Button.click();
        Assert.assertTrue(addBillingAddressPage.signOutButton.isDisplayed());

        //Kullanıcı My Account sekmesini tıklar
        addBillingAddressPage.signOutButton.click();

        //Kullanıcı Addresses kısmına tıklar
        addBillingAddressPage.addressButton.click();

        //Kullanıcı Billing Address başlığı altındaki ADD butonuna tıklar
        addBillingAddressPage.addButton.click();

        //First Name için invalid bir değer girer veya değer ataması yapmaz

        //Last Name için valid bir değer girer
        addBillingAddressPage.lastName.sendKeys(ConfigReader.getProperty("customerLastName"));

        //Country/Region için valid bir değer seçer
        addBillingAddressPage.countryButton.sendKeys(ConfigReader.getProperty("customerCountryName"),Keys.TAB);
        ReusableMethods.bekle(2);

        //Street Address için valid bir değer girer
        addBillingAddressPage.streetTextBox.sendKeys(ConfigReader.getProperty("customerStreetName"));

        //Zip Code / Postcode için valid bir değer girer.
        addBillingAddressPage.zipcodeBox.sendKeys(ConfigReader.getProperty("customerZipCode"));

        //Town City için valid bir değer girer ve province için değer ataması yapar.
        addBillingAddressPage.townTextBox.sendKeys(ConfigReader.getProperty("customerTownName"),Keys.TAB,ConfigReader.getProperty("customerTownName"),Keys.TAB);

        //Phone için valid bir değer girer
        addBillingAddressPage.phoneTextBox.sendKeys(ConfigReader.getProperty("customerPhone"));

        //"Save address butonuna tıkladığımızda "First name is a required field." mesajını alır."
        ReusableMethods.click(addBillingAddressPage.saveAdressButton);

        Assert.assertTrue(addBillingAddressPage.invalidFirstNameMsg.isDisplayed());

        Driver.closeDriver();

    }
}
