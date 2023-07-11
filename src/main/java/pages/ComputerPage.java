package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.ArrayList;
import java.util.List;

public class ComputerPage extends Utility {

    public By sortBy = By.id("products-orderby");

   By addToCart=By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[1]");

    public By getVerifyBuildYourOwnComputer() {
        return verifyBuildYourOwnComputer;
    }

    By verifyBuildYourOwnComputer=By.xpath("//h1[contains(text(),'Build your own computer')]");

    public List<String> getProductName() {
        List<WebElement> products = driver.findElements(sortBy);
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText().toLowerCase());
        }
        return originalProductsName;
    }

public void clickAddToCart(){
        sleep(1000);
        clickOnElement(addToCart);

}




}
