package pages;

import org.openqa.selenium.By;
import utilities.Utility;

public class ShoppingCartPage extends Utility {

    public By verifyShoppingCart = By.xpath("//h1[text()='Shopping cart']");

    public By getVerifyShoppingCart() {
        return verifyShoppingCart;
    }

    public By qtyUpdate = By.xpath("//input[@class='qty-input']");

    public By updateCart = By.id("updatecart");
    public By total = By.xpath("(//span[@class='value-summary'])[1]");

    public By getTotal() {
        return total;
    }

    public By termsOfService =By.id("termsofservice");

    public By checkOut =By.id("checkout");






}
