package allovercommerce.tests;

import allovercommerce.pages.AddShippingAdressPage_04;
import allovercommerce.pages.RegisterPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddShippingAdressTest_04 {

    public String username;
    public String email;
    public String password;

    @Test
            public void newAccount(){
        Faker faker=new Faker();
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));

        AddShippingAdressPage_04 addShippingAdressPage04=new AddShippingAdressPage_04();
        addShippingAdressPage04.registerButton.click();

        username = faker.name().username();
        email = faker.internet().emailAddress();
        password = faker.internet().password(4, 12);

        addShippingAdressPage04.userName.sendKeys(username);
        addShippingAdressPage04.email.sendKeys(email);
        addShippingAdressPage04.password.sendKeys(password);
        addShippingAdressPage04.agreeButton.click();
        ReusableMethods.visibleWait(addShippingAdressPage04.signInButton,3);
        addShippingAdressPage04.signUpButton.click();
        addShippingAdressPage04.signOutButton.click();
        addShippingAdressPage04.logOutButton.click();
        Driver.closeDriver();
    }

    @Test(dependsOnMethods = "newAccount")
    public void addShippingAdressTest() {

        AddShippingAdressPage_04 addShippingAdressPage04=new AddShippingAdressPage_04();
        Faker faker=new Faker();

        //Kullanıcı anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));

        //Kullanıcı mail adresini ve passwordu yazıp sayfaya giriş yapar
        addShippingAdressPage04.signInButton.click();
        addShippingAdressPage04.signInUserName.sendKeys(username);
        addShippingAdressPage04.signInPassword.sendKeys(password);
        addShippingAdressPage04.signInLoginButton.click();

        //Kullanıcı My Account Sayfasına gelir ve dogrular
        ReusableMethods.scrollEnd();
        ReusableMethods.visibleWait(addShippingAdressPage04.myAccountFooter,3);
        addShippingAdressPage04.myAccountFooter.click();
        Assert.assertTrue(addShippingAdressPage04.myAccountPage.isDisplayed());

        //Kullanıcı Addresses kısmına tıklar
        ReusableMethods.scroll(addShippingAdressPage04.adressesSection);
        ReusableMethods.click(addShippingAdressPage04.adressesSection);

        //Kullanıcı Shipping Addresses başlığı altındaki ADD kısmına tıklar açıldıgını dogrular
        ReusableMethods.click(addShippingAdressPage04.addButton);
        Assert.assertTrue(addShippingAdressPage04.billingFirstNameTextBox.isDisplayed());

        //First Name için valid bir değer girer
        addShippingAdressPage04.billingFirstNameTextBox.sendKeys(faker.name().firstName());

        //Last Name, Company Name(optional) ,Country/Region için valid bir değer girer
        ReusableMethods.scroll(addShippingAdressPage04.billingCountryRegion);
        ReusableMethods.click(addShippingAdressPage04.billingCountryRegion);
        addShippingAdressPage04.billingLastNameTextBox.sendKeys(faker.name().lastName(), Keys.TAB,
                faker.company().name(),Keys.TAB,Keys.ENTER,"United States (US)",Keys.ENTER);

        //Street Address için valid bir değer girer
        addShippingAdressPage04.billingStreetAdress.sendKeys(faker.address().fullAddress());

        //Town City , State   , /Zip Code , Phone  için valid bir değer girer
        addShippingAdressPage04.billingTownCity.sendKeys(faker.address().city(),
                Keys.TAB,"Alabama",Keys.ENTER,Keys.TAB,faker.address().zipCode(),Keys.TAB,faker.phoneNumber().cellPhone());

        //Save Address butonuna tıklar ve tamamlandıgına dair mesaj alır
        ReusableMethods.click(addShippingAdressPage04.billingSaveAdressButton);
        Assert.assertTrue(addShippingAdressPage04.adressChangedMessage.isDisplayed());
        Driver.closeDriver();
    }

    @Test(dependsOnMethods ="newAccount")
    public void negativeTest() {
        AddShippingAdressPage_04 addShippingAdressPage04=new AddShippingAdressPage_04();
        Faker faker=new Faker();

        //Kullanıcı anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));

        //Kullanıcı mail adresini ve passwordu yazıp sayfaya giriş yapar
        addShippingAdressPage04.signInButton.click();
        addShippingAdressPage04.signInUserName.sendKeys(username);
        addShippingAdressPage04.signInPassword.sendKeys(password);
        addShippingAdressPage04.signInLoginButton.click();

        //Kullanıcı My Account Sayfasına gelir ve dogrular
        ReusableMethods.scrollEnd();
        ReusableMethods.visibleWait(addShippingAdressPage04.myAccountFooter,3);
        addShippingAdressPage04.myAccountFooter.click();
        Assert.assertTrue(addShippingAdressPage04.myAccountPage.isDisplayed());

        //Kullanıcı Addresses kısmına tıklar
        ReusableMethods.scroll(addShippingAdressPage04.adressesSection);
        ReusableMethods.click(addShippingAdressPage04.adressesSection);

        //Kullanıcı Shipping Addresses başlığı altındaki ADD kısmına tıklar açıldıgını dogrular
        ReusableMethods.click(addShippingAdressPage04.addButton);
        Assert.assertTrue(addShippingAdressPage04.billingFirstNameTextBox.isDisplayed());

        //First Name için valid bir değer girer
        addShippingAdressPage04.billingFirstNameTextBox.sendKeys(faker.name().firstName());

        //Last Name, Company Name(optional) ,Country/Region için valid bir değer girer
        ReusableMethods.scroll(addShippingAdressPage04.billingCountryRegion);
        ReusableMethods.click(addShippingAdressPage04.billingCountryRegion);
        addShippingAdressPage04.billingLastNameTextBox.sendKeys(faker.name().lastName(), Keys.TAB,
                faker.company().name(),Keys.TAB,Keys.ENTER,"United States (US)",Keys.ENTER);

        //Street Address kısmını boş bırakır


        //Town City , State   , /Zip Code , Phone  için valid bir değer girer
        addShippingAdressPage04.billingTownCity.sendKeys(faker.address().city(),
                Keys.TAB,"Alabama",Keys.ENTER,Keys.TAB,faker.address().zipCode(),Keys.TAB,faker.phoneNumber().cellPhone());

        //Save Address butonuna tıklar ve tamamlanmadigina dair mesaj alır
        ReusableMethods.click(addShippingAdressPage04.billingSaveAdressButton);
        Assert.assertTrue(addShippingAdressPage04.adressAlertIcon.isDisplayed());
        Driver.closeDriver();
    }

    @Test(dependsOnMethods = "newAccount")
    public void negativeTest2() {
        AddShippingAdressPage_04 addShippingAdressPage04=new AddShippingAdressPage_04();
        Faker faker=new Faker();

        //Kullanıcı anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));

        //Kullanıcı mail adresini ve passwordu yazıp sayfaya giriş yapar
        addShippingAdressPage04.signInButton.click();
        addShippingAdressPage04.signInUserName.sendKeys(username);
        addShippingAdressPage04.signInPassword.sendKeys(password);
        addShippingAdressPage04.signInLoginButton.click();

        //Kullanıcı My Account Sayfasına gelir ve dogrular
        ReusableMethods.scrollEnd();
        ReusableMethods.visibleWait(addShippingAdressPage04.myAccountFooter,3);
        addShippingAdressPage04.myAccountFooter.click();
        Assert.assertTrue(addShippingAdressPage04.myAccountPage.isDisplayed());

        //Kullanıcı Addresses kısmına tıklar
        ReusableMethods.scroll(addShippingAdressPage04.adressesSection);
        ReusableMethods.click(addShippingAdressPage04.adressesSection);

        //Kullanıcı Shipping Addresses başlığı altındaki ADD kısmına tıklar açıldıgını dogrular
        ReusableMethods.click(addShippingAdressPage04.addButton);
        Assert.assertTrue(addShippingAdressPage04.billingFirstNameTextBox.isDisplayed());

        //First Name boş bırakır


        //Last Name, Company Name(optional) ,Country/Region için valid bir değer girer
        ReusableMethods.scroll(addShippingAdressPage04.billingCountryRegion);
        ReusableMethods.click(addShippingAdressPage04.billingCountryRegion);
        addShippingAdressPage04.billingLastNameTextBox.sendKeys(faker.name().lastName(), Keys.TAB,
                faker.company().name(),Keys.TAB,Keys.ENTER,"United States (US)",Keys.ENTER);

        //Street Address kısmını doldurur
        addShippingAdressPage04.billingStreetAdress.sendKeys(faker.address().fullAddress());


        //Town City , State   , /Zip Code , Phone  için valid bir değer girer
        addShippingAdressPage04.billingTownCity.sendKeys(faker.address().city(),
                Keys.TAB,"Alabama",Keys.ENTER,Keys.TAB,faker.address().zipCode(),Keys.TAB,faker.phoneNumber().cellPhone());

        //Save Address butonuna tıklar ve tamamlanmadigina dair mesaj alır
        ReusableMethods.click(addShippingAdressPage04.billingSaveAdressButton);
        Assert.assertTrue(addShippingAdressPage04.adressAlertIcon.isDisplayed());
        Driver.closeDriver();

    }
}
