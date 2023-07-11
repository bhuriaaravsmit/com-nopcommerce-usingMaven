package pages;

import org.openqa.selenium.By;
import utilities.Utility;

public class BuildYourOwnComputerPage extends Utility {


    public By productName = By.id("product_attribute_1");

    public By ram = By.id("product_attribute_2");

    public By HDD = By.id("product_attribute_3_7");

    public By OS = By.id("product_attribute_4_9");

    public By softWare = By.id("product_attribute_5_10");
    public By softWare1 = By.id("product_attribute_5_12");

    public By price = By.id("price-value-1");

    public By AddButton1 =By.id("add-to-cart-button-1");

    public By verifyProductAdded=By.xpath("//p[@class='content']");

    public By shoppingCart =By.xpath("//a[contains(text(),'shopping cart')]");

    public By getVerifyProductAdded() {
        return verifyProductAdded;
    }


public void mouseHoverToElement()
{
    sleep(2000);
    mouseHoverToElement(shoppingCart);

}
}
