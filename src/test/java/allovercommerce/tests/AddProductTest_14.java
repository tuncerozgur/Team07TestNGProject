package allovercommerce.tests;


import allovercommerce.pages.AddProductPage_14;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class AddProductTest_14 {
    @Test
    public void addProductTest() {
        //Url e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("alloverCommerceUrl"));

        //Sign in ikonu tiklanir ve giriş yaptıgı doğrulanır
        AddProductPage_14 addProductPage14=new AddProductPage_14();
        addProductPage14.signInButton.click();
        Assert.assertTrue(addProductPage14.signInConfirmButton.isDisplayed());

        //Username or email address kutusuna Username girilir
        addProductPage14.username.sendKeys(ConfigReader.getProperty("username"));

        //Password kutusuna Password girilir
        addProductPage14.password.sendKeys(ConfigReader.getProperty("password"));

        //Sign in butonuna tiklanir ve login oldugu doğrulanır
        addProductPage14.signInConfirmButton.click();
        Assert.assertTrue(addProductPage14.signOutButton.isDisplayed());

        //My Account ikonuna tiklanir ve bu sayfada oldugu doğrulanır
        addProductPage14.signOutButton.click();
        Assert.assertTrue(addProductPage14.myAccountPageText.isDisplayed());

        //Store Manager e tiklanir ve bu sayfada oldugu doğrulanır
        addProductPage14.storeManagerMenu.click();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://allovercommerce.com/store-manager/");

        //Products a tiklanir ve bu sayfadaki Product baslıgı dogrulanır

        ReusableMethods.click(addProductPage14.productsMenu);
        Assert.assertTrue(addProductPage14.addNewProductButton.isDisplayed());

        //Add New butonuna tiklanir ve Add Product sayfasında oldugu doğrulanır
        ReusableMethods.click(addProductPage14.addNewProductButton);


        //Simple Product görünür ve tıklanabilir olduğu doğrulanır
        Assert.assertTrue(addProductPage14.simpleProduct.isDisplayed());

        //Variable Product görünür ve tıklanabilir olduğu doğrulanır
        ReusableMethods.click(addProductPage14.variableProduct);
        Assert.assertTrue(addProductPage14.variableProduct.isDisplayed());


        //Grouped Product görünür ve tıklanabilir olduğu doğrulanır
        ReusableMethods.click(addProductPage14.groupedProduct);
        Assert.assertTrue(addProductPage14.groupedProduct.isDisplayed());

        //External - Affiliate Product görünür ve tıklanabilir olduğu doğrulanır
        ReusableMethods.click(addProductPage14.externalProduct);
        Assert.assertTrue(addProductPage14.externalProduct.isDisplayed());

        //Short Description yazisinin altindaki ADD MEDIA butonuna tiklanir

        ReusableMethods.click(addProductPage14.addMediaButton);

        //Add media sayfasinda olundugu dogrulanir
        Assert.assertTrue(addProductPage14.addMediaInstructions.isDisplayed());

        //Upload Files tiklanir
        addProductPage14.uploadFilesButton.click();

        //Select Files butonuna tiklanir

        addProductPage14.selectFilesButton.click();

        //Acilan pencereden urun fotografi eklenir ve ekleme işleminin yapıldıgı doğrulanır


        String path ="\"C:\\Users\\tunce\\Desktop\\images.jpg\"";
        AddProductPage_14.FileUploadHelper.uploadFileWithRobot(path);


        //Urun fotografinin eklendigi dogrulanir
        Assert.assertTrue(addProductPage14.loadCountConfirm.isDisplayed());

        //Insert Into Post butonuna tiklanir

        ReusableMethods.bekle(5);
        ReusableMethods.click(addProductPage14.insertIntoPostButton);

        //Urun fotografinin Short Description alanina eklendigi dogrulanir
        WebElement iframeElement = Driver.getDriver().findElement(By.cssSelector("#excerpt_ifr"));
        Driver.getDriver().switchTo().frame(iframeElement);
        Assert.assertTrue(addProductPage14.imageShortDescription.isDisplayed());
        Driver.getDriver().switchTo().defaultContent();


//her defasında locate degisiyor o yüzden ürünler kısmından sürekli image.jpg kalacak sekilde ayarlamalisin

        //Description yazisinin altindaki ADD MEDIA butonuna tiklanir
        ReusableMethods.click(addProductPage14.descriptionAddMedia);

        //Add media sayfasinda olundugu dogrulanir
        // Assert.assertTrue(addProductPage14.addMediaText.isDisplayed());

        //Upload Files kirilimina tiklanir
        ReusableMethods.click(addProductPage14.uploadFilesButton2);

        //Select Files butonuna tiklanir
        ReusableMethods.click( addProductPage14.selectFilesButton2);

        //Acilan pencerecen urun fotografi eklenir
        String path2="\"C:\\Users\\tunce\\Desktop\\selectme.png\"";
        AddProductPage_14.FileUploadHelper.uploadFileWithRobot(path2);

        //Insert Into Post butonuna tiklanir
        ReusableMethods.click(addProductPage14.insertIntoPostButton);

        //Urun fotografinin Description alanina eklendigi dogrulanir
        WebElement descriptionIframe = Driver.getDriver().findElement(By.xpath("//iframe[@id='description_ifr']"));
        Driver.getDriver().switchTo().frame(descriptionIframe);
        Assert.assertTrue(addProductPage14.selectMePng.isDisplayed());
        Driver.getDriver().switchTo().defaultContent();

        //Product Title kutusuna baslik ismi girilir
        addProductPage14.productTitle.sendKeys("products");


        //Short Description alanina metin girilir
        Driver.getDriver().switchTo().frame(iframeElement);
        addProductPage14.shortDescriptionTextArea.sendKeys("bla bla");
        Driver.getDriver().switchTo().defaultContent();

        //Description alanina metin girilir
        Driver.getDriver().switchTo().frame(descriptionIframe);
        addProductPage14.descriptionTextArea.sendKeys("bla bla");
        Driver.getDriver().switchTo().defaultContent();


        //Categories secilebilirligi dogrulanir
        addProductPage14.categoriesCheckBox.click();
        Assert.assertTrue(addProductPage14.categoriesCheckBox.isSelected());

        //Add New Category butonuna tıklanır
        addProductPage14.addNewCategory.click();

        //Category Name kutusuna kategori ismi girilir
        addProductPage14.categoryName.sendKeys("z12"); // herdefasinda yeni olacak

        //Parent category den secim yapilir
        addProductPage14.parentCategory.sendKeys("N", Keys.ENTER);

        //Add butonu tiklanir
        ReusableMethods.click(addProductPage14.addCategoryButton);

        //Eklenilen kategori Categories listesinde dogrulanir
        Assert.assertTrue(addProductPage14.categoryConfirm.isDisplayed());


        //Product brands secilebilirligi dogrulanir
        ReusableMethods.click(addProductPage14.productBrandsCheckBox);
        Assert.assertTrue(addProductPage14.productBrandsCheckBox.isSelected());

        //Add new category linkine tiklanir
        ReusableMethods.click(addProductPage14.addNewProductBrandButton);

        //Product brands Name kutusuna kategori ismi girilir
        addProductPage14.productBrandsName.sendKeys("z11");

        //Parent taxonomy den secim yapilir
        addProductPage14.parentTaxonomy.sendKeys("E");

        //Add butonu tiklanir
        ReusableMethods.click(addProductPage14.addProductBrandFinalStep);

        //Eklenilen kategori Product brands listesinde dogrulanir
        Assert.assertTrue(addProductPage14.finalCheckBox.isSelected());
    }

}
