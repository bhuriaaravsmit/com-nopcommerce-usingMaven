package pages;

import org.openqa.selenium.By;
import utilities.Utility;

public class GuestCheckOut extends Utility {

    public By firstName=By.id("BillingNewAddress_FirstName");
    public By lastName=By.id("BillingNewAddress_LastName");
    public By email=By.id("BillingNewAddress_Email");
    public By country=By.id("BillingNewAddress_CountryId");
    public  By city=By.id("BillingNewAddress_City");
    public By address1=By.id("BillingNewAddress_Address1");
    public By postalCode=By.id("BillingNewAddress_ZipPostalCode");
    public  By phoneNumber=By.id("BillingNewAddress_PhoneNumber");

    public By addressContinue = By.xpath("//button[@class='button-1 new-address-next-step-button']");

    public By shippingOption = By.id("shippingoption_1");

    public By shippping = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    public By paymentMethod = By.id("paymentmethod_1");

    public By paymentMethodNext =By.xpath("//button[@class='button-1 payment-method-next-step-button']");

    public By cardType = By.id("CreditCardType");
    public By cardHolderName = By.id("CardholderName");
    public By cardNumber=By.id("CardNumber");

    public By expireMonth=By.id("ExpireMonth");
    public By expireYear=By.id("ExpireYear");

    public By cardCode=By.id("CardCode");

    public By paymentInfoContinue=By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    public By  paymentMethodVerify=By.xpath("//li[@class='payment-method']/span[@class='value']");

    public By  shippingMethodVerify=By.xpath("//li[@class='shipping-method']/span[@class='value']");

    public By  subTotalVerify=By.xpath("//span[@class='product-subtotal']");
    public By confirmOrder=  By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
    public By pageTitleVerify=  By.xpath("//div[@class='page-title']/h1");
    public By oderVerify=  By.xpath("//div[@class='title']/strong");

    public By orderCompleted=  By.xpath("//button[@class='button-1 order-completed-continue-button']");
    public By title=  By.xpath("//div[@class='topic-block-title']/h2");


}
