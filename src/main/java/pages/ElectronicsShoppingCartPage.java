package pages;

import org.openqa.selenium.By;
import utilities.Utility;

public class ElectronicsShoppingCartPage extends Utility {


    public By total = By.xpath("(//span[@class='value-summary'])[1]");
    public By shoppingCart =By.xpath("//h1[text()='Shopping cart']");
    public By getTotal() {
        return total;
    }

    public By agreeTerms = By.id("termsofservice");

    public By checkOut = By.id("checkout");


    public By welcomeText = By.xpath("//h1[text()='Welcome, Please Sign In!']");

    public By getWelcomeText() {
        return welcomeText;
    }


    public By register = By.xpath("//button[@class='button-1 register-button']");

    public By verifyRegister = By.xpath("//h1[text()='Register']");

    public By getVerifyRegister() {
        return verifyRegister;
    }



    public By registration =By.xpath("//div[@class='result");
    public By getRegistration() {
        return registration;
    }

public By conti =By.xpath("//a[text()='Continue']");

}
