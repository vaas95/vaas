package com.qapitol.stepdefinition;


import com.qapitol.sauron.web.AbstractWebPage;
import io.qameta.allure.Step;
import org.testng.Assert;

public class PaymentPage extends AbstractWebPage {

    public static final String Payment_Select = "paymentSelect";
    public static final String Proceed_Order = "proceedOrder";
    public static final String Payment_Page="paymentPage";
    public static final String Card_Number="cardNumber";
    public static final String Exp_month="expMonth";
    public static final String Exp_Year="expYear";
    public static final String Exp_Cvv="expCvv";
    public static final String Add_Card="addCard";


    @Step("Select payment method")
    public void selectPayment()
    {
        Assert.assertTrue(waitAndCheckIsElementPresent(Payment_Select));
        waitAndClickOn(Payment_Select);
        scrollTilEndOfPageUsingJs();
        Assert.assertTrue(waitAndCheckIsElementPresent(Proceed_Order));
        waitAndClickOn(Proceed_Order);
        takeScreenShot();
    }
    @Step("Select payment method")
    public void newPayment()
    {
        Assert.assertTrue(waitAndCheckIsElementPresent(Payment_Page));
        Assert.assertTrue(waitAndCheckIsElementPresent(Card_Number));
        clearTextBox(Card_Number);
        waitAndSetText(Card_Number,"4567456123457890");
        Assert.assertTrue(waitAndCheckIsElementPresent(Exp_month));
        clearTextBox(Exp_month);
        waitAndSetText(Exp_month,"10");
        Assert.assertTrue(waitAndCheckIsElementPresent(Exp_Year));
        clearTextBox(Exp_Year);
        waitAndSetText(Exp_Year,"2028");
        Assert.assertTrue(waitAndCheckIsElementPresent(Exp_Cvv));
        clearTextBox(Exp_Cvv);
        waitAndSetText(Exp_Cvv,"123");
        Assert.assertTrue(waitAndCheckIsElementPresent(Add_Card));
        waitAndClickOn(Add_Card);
        waitAndClickOn(Proceed_Order);
        takeScreenShot();


    }





}
