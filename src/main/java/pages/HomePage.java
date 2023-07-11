package pages;

import org.openqa.selenium.By;
import utilities.Utility;

public class HomePage extends Utility {
    public By computer = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']");

    public By electronics = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']");

    public By desktops = By.xpath("//h2//a[text()=' Desktops ']");

    public By cellPhones = By.xpath("(//ul/li/a[text()='Cell phones '])[1]");

    public void selectMenu(String menu) {
        clickOnElement(By.xpath("//a[text()='" + menu + "']"));
    }

    public void clickOnComputer() {
        sleep(1000);
        clickOnElement(computer);

    }

    public void clickOnDesktop() {
        sleep(1000);
        clickOnElement(desktops);

    }


    public void mouseHoverToElectronics() {

        sleep(1000);
        mouseHoverToElement(electronics);

    }

    public void mouseHoverToCellPhones() {
        sleep(1000);
        mouseHoverToElementAndClick(cellPhones);

    }


}
