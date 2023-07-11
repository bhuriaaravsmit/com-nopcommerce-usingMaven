package testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import testbase.BaseTest;

import java.util.Collections;
import java.util.List;

public class HomePageTest extends BaseTest {

    HomePage homepage = new HomePage();
    ComputerPage computerpage = new ComputerPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();

    ShoppingCartPage shoppingcartpage = new ShoppingCartPage();
    GuestCheckOut guestCheckOut=new GuestCheckOut();

    WelComePage welComePage =new WelComePage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {
        sleep(1000);
        homepage.clickOnComputer();
        sleep(1000);
        clickOnElement(homepage.desktops);
        selectByVisibleTextFromDropDown(computerpage.sortBy, "Name: Z to A");
        List<String> productList = computerpage.getProductName();
        List<String> productListAfter = computerpage.getProductName();
        Collections.sort(productListAfter, Collections.reverseOrder());
        Assert.assertEquals(productList, productListAfter);

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {
        sleep(1000);
        homepage.clickOnComputer();
        clickOnElement(homepage.desktops);
        selectByVisibleTextFromDropDown(computerpage.sortBy, "Name: A to Z");
        computerpage.clickAddToCart();
        sleep(1000);
        verifyText(computerpage.getVerifyBuildYourOwnComputer(), "Build your own computer");

        buildYourOwnComputerPage.selectByVisibleTextFromDropDown(buildYourOwnComputerPage.productName, "2.2 GHz Intel Pentium Dual-Core E2200");
        sleep(600);
        buildYourOwnComputerPage.selectByVisibleTextFromDropDown(buildYourOwnComputerPage.ram, "8GB [+$60.00]");
        sleep(600);
        buildYourOwnComputerPage.clickOnElement(buildYourOwnComputerPage.HDD);
        sleep(600);
        buildYourOwnComputerPage.clickOnElement(buildYourOwnComputerPage.OS);
        sleep(600);
     //   buildYourOwnComputerPage.clickOnElement(buildYourOwnComputerPage.softWare);
        sleep(600);
        buildYourOwnComputerPage.clickOnElement(buildYourOwnComputerPage.softWare1);
        sleep(600);
        verifyText(buildYourOwnComputerPage.price, "$1,475.00");

        buildYourOwnComputerPage.clickOnElement(buildYourOwnComputerPage.AddButton1);
        sleep(600);
        verifyText(buildYourOwnComputerPage.getVerifyProductAdded(), "The product has been added to your shopping cart");
        clickOnElement(buildYourOwnComputerPage.shoppingCart);
        verifyText(shoppingcartpage.getVerifyShoppingCart(), "Shopping cart");
        sleep(600);
        shoppingcartpage.sendTextToElement(shoppingcartpage.qtyUpdate, "2");
        clickOnElement(shoppingcartpage.updateCart);
        sleep(600);
        verifyText(shoppingcartpage.getTotal(), "$2,950.00");
        shoppingcartpage.clickOnElement(shoppingcartpage.termsOfService);
        shoppingcartpage.clickOnElement(shoppingcartpage.checkOut);
        sleep(600);
        verifyText(welComePage.getWelcomeText(),"Welcome, Please Sign In!");
        welComePage.clickOnElement(welComePage.guestButton);
        sendTextToElement(guestCheckOut.firstName, "Shweta");
        sendTextToElement(guestCheckOut.lastName, "Shah");
        sendTextToElement(guestCheckOut.email, "shweta1335@gmail.com");
        selectByVisibleTextFromDropDown(guestCheckOut.country, "India");
        sendTextToElement(guestCheckOut.city, "Baroda");
        sendTextToElement(guestCheckOut.address1, "37 ring road");
        sendTextToElement(guestCheckOut.postalCode, "380023");
        sendTextToElement(guestCheckOut.phoneNumber, "0265248968");

        clickOnElement(guestCheckOut.addressContinue);

        clickOnElement(guestCheckOut.shippingOption);
        clickOnElement(guestCheckOut.shippping);

        sleep(300);
        clickOnElement(guestCheckOut.paymentMethod);
        clickOnElement(guestCheckOut.paymentMethodNext);

        sleep(300);

        selectByVisibleTextFromDropDown(guestCheckOut.cardType, "Master card");
        sendTextToElement(guestCheckOut.cardHolderName, "Shweta shah");
        sendTextToElement(guestCheckOut.cardNumber, "5425233430109903");
        selectByVisibleTextFromDropDown(guestCheckOut.expireMonth, "08");
        selectByVisibleTextFromDropDown(guestCheckOut.expireYear, "2026");
        sendTextToElement(guestCheckOut.cardCode, "123");

        clickOnElement(guestCheckOut.paymentInfoContinue);
        sleep(300);
        verifyText(guestCheckOut.paymentMethodVerify, "Credit Card");
        verifyText(guestCheckOut.shippingMethodVerify, "Next Day Air");

        verifyText(guestCheckOut.subTotalVerify, "$2,950.00");

        clickOnElement(guestCheckOut.confirmOrder);
        sleep(500);

        verifyText(guestCheckOut.pageTitleVerify, "Thank you");
        verifyText(guestCheckOut.oderVerify, "Your order has been successfully processed!");

        clickOnElement(guestCheckOut.orderCompleted);
        sleep(300);

        verifyText(guestCheckOut.title, "Welcome to our store");


        sleep(300);
    }


}
