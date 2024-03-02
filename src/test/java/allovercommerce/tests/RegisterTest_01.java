package allovercommerce.tests;

import allovercommerce.pages.RegisterPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest_01 {


    @Test
    public void testpositive() {

        //Sayfaya gidilir.
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));

        //Register butonuna tıklanır.
        RegisterPage registerPage=new RegisterPage();
        registerPage.registerButton.click();

        //Username alanına valid bir değer girilir.
        Faker faker=new Faker();
        registerPage.userName.sendKeys(faker.name().username());

        //Your Email address alanına valid bir değer girilir.
        registerPage.email.sendKeys(faker.internet().emailAddress());

        //Password alanına valid bir değer girilir.
        registerPage.password.sendKeys(faker.internet().password(4,12));

        //I agree to the privacy policy checkbox'una tıklanır.
        registerPage.agreeButton.click();

        //Sign Up butonuna tıklanır.
        registerPage.signInButton.click();

        //Sign Out butonu görür ve üye olduğunu doğrular
        Assert.assertTrue(registerPage.signOutButton.isDisplayed());
    }
}
