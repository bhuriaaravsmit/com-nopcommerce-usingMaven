package pages;

import org.openqa.selenium.By;
import utilities.Utility;

public class WelComePage extends Utility {
    public By welcomeText=By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    public By getWelcomeText() {
        return welcomeText;
    }

public By guestButton = By.xpath("//button[@class='button-1 checkout-as-guest-button']");
















}
