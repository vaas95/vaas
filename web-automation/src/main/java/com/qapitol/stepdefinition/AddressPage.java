package com.qapitol.stepdefinition;

import com.qapitol.sauron.report.core.annotations.ReportTestStep;
import com.qapitol.sauron.web.AbstractWebPage;
import io.qameta.allure.Step;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;


public class AddressPage extends AbstractWebPage{

    public static final String Address_Select = "addressSelect";
    public static final String Proceed_Checkout = "proceedCheckout";
    public static final String New_Address1 ="newAddress1";
    public static final String New_Address2 ="newAddress2";
    public static final String New_City ="newCity";
    public static final String New_State ="newState";
    public static final String New_Country="newCountry";
    public static final String New_Postal="newPostal";
    public static final String New_Phone="newPhone";
    public static final String Add_Address="addAddress";

    @Step("Enter payment details and checkout")
    public void enterDetails()
    {
        Assert.assertTrue(waitAndCheckIsElementPresent(Address_Select));
        waitAndClickOn(Address_Select);
        scrollTilEndOfPageUsingJs();
        Assert.assertTrue(waitAndCheckIsElementPresent(Proceed_Checkout));
        waitAndClickOn(Proceed_Checkout);
    }
    @Step("Enter new Address Details")
    public void newDetails()
    {
        Assert.assertTrue(waitAndCheckIsElementPresent(New_Address1));
        waitAndSetText(New_Address1,"Test1");
        Assert.assertTrue(waitAndCheckIsElementPresent(New_Address2));
        waitAndSetText(New_Address2,"Test2");
        Assert.assertTrue(waitAndCheckIsElementPresent(New_City));
        waitAndSetText(New_City,"Bengaluru");
        Assert.assertTrue(waitAndCheckIsElementPresent(New_State));
        waitAndSetText(New_State,"Karnataka");
        Assert.assertTrue(waitAndCheckIsElementPresent(New_Country));
        selectOptionByText(New_Country,"India");
        Assert.assertTrue(waitAndCheckIsElementPresent(New_Postal));
        waitAndSetText(New_Postal,"560008");
        Assert.assertTrue(waitAndCheckIsElementPresent(New_Phone));
        waitAndSetText(New_Phone,"882597470");
        Assert.assertTrue(waitAndCheckIsElementPresent(Add_Address));
        waitAndClickOn(Add_Address);
        Assert.assertTrue(waitAndCheckIsElementPresent(Address_Select));
        waitAndClickOn(Address_Select);
        Assert.assertTrue(waitAndCheckIsElementPresent(Proceed_Checkout));
        waitAndClickOn(Proceed_Checkout);


    }



}
