package testsuite;

import org.testng.annotations.Test;
import pages.ElectronicsPage;
import pages.ElectronicsShoppingCartPage;
import pages.HomePage;
import pages.RegisterPageElectronics;
import testbase.BaseTest;

public class ElectronicsPageTest extends BaseTest {

    HomePage homepage = new HomePage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    ElectronicsShoppingCartPage electronicsShoppingCartPage = new ElectronicsShoppingCartPage();

    RegisterPageElectronics registerPageElectronics = new RegisterPageElectronics();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        sleep(2000);
        homepage.mouseHoverToElectronics();
        homepage.mouseHoverToCellPhones();
        sleep(2000);
        verifyText(electronicsPage.getCellPhones(), "Cell phones");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() {
        sleep(3000);
        homepage.mouseHoverToElectronics();
        sleep(1000);
        homepage.mouseHoverToCellPhones();
        verifyText(electronicsPage.getCellPhones(), "Cell phones");
        electronicsPage.clickOnElement(electronicsPage.listTab);
        sleep(2000);
        electronicsPage.clickOnElement(electronicsPage.productName);
        verifyText(electronicsPage.getVerifyNokia(), "Nokia Lumia 1020");
        verifyText(electronicsPage.getPrice(), "$349.00");
        sendTextToElement(electronicsPage.changedQty, "2");
        electronicsPage.clickOnElement(electronicsPage.addToCartButton);
        verifyText(electronicsPage.getVerifyAddToCart(), "The product has been added to your shopping cart");
        clickOnElement(electronicsPage.shoppingCart);
        verifyText(electronicsShoppingCartPage.shoppingCart, "Shopping cart");
        verifyText(electronicsShoppingCartPage.getTotal(), "$698.00");
        electronicsShoppingCartPage.clickOnElement(electronicsShoppingCartPage.agreeTerms);
        electronicsShoppingCartPage.clickOnElement(electronicsShoppingCartPage.checkOut);
        verifyText(electronicsShoppingCartPage.getWelcomeText(), "Welcome, Please Sign In!");
        electronicsShoppingCartPage.clickOnElement(electronicsShoppingCartPage.register);
        verifyText(electronicsShoppingCartPage.getVerifyRegister(), "Register");

        sendTextToElement(registerPageElectronics.firstName, "Shweta");
        sendTextToElement(registerPageElectronics.lastName, "Shah");
        sendTextToElement(registerPageElectronics.email, "Shweta.shh1@gmail.com");
        sendTextToElement(registerPageElectronics.password, "Shweta123");
        sendTextToElement(registerPageElectronics.confirmPassword, "Shweta123");


        verifyText(electronicsShoppingCartPage.getRegistration(), "Your registration completed");

        electronicsShoppingCartPage.clickOnElement(electronicsShoppingCartPage.conti);


        // electronicsShoppingCartPage.clickOnElement(electronicsShoppingCartPage.registerButton);
    }


}
