package pages;

import org.openqa.selenium.By;
import utilities.Utility;

public class ElectronicsPage extends Utility {

    public By cellPhones = By.xpath("//div[@class='page-title']");

    public By getCellPhones() {
        return cellPhones;
    }

    public By listTab = By.xpath("//a[@class='viewmode-icon list']");

    public By productName = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");


    public By verifyNokia = By.xpath("//div[@class='product-name']/h1[text()='Nokia Lumia 1020']");

    public By getVerifyNokia() {
        return verifyNokia;
    }


    public By price = By.xpath("//span[contains(text(),'$349.00')]");

    public By getPrice() {
        return price;
    }

    public By changedQty = By.id("product_enteredQuantity_20");

    public By addToCartButton = By.id("add-to-cart-button-20");


    public By verifyAddToCart = By.xpath("//p[@class='content']");

    public By getVerifyAddToCart() {
        return verifyAddToCart;
    }

    public By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");

}
