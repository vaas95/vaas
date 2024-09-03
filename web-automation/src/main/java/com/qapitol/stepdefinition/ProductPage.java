package com.qapitol.stepdefinition;

import com.qapitol.sauron.report.core.annotations.ReportTestStep;
import com.qapitol.sauron.web.AbstractWebPage;
import org.testng.Assert;

public class ProductPage extends AbstractWebPage {
    public static final String ProductPage = "productPage";
    public static final String SelectRating = "selectRating";
    public static final String EnterReview = "enterReview";
    public static final String SubmitButton = "submitBtn";
    public static final String SuccessMessage = "successMsg";
    public static final String User_Profile = "userProfile";
    public static final String logout_Button = "logoutBtn";
    public static final String add_Cart = "addCart";
    public static final String brand_sign = "brandSign";
    public static final String Check_Out = "checkOut";
    public static final String Proceed_Checkout="proceedCheckout";



    @ReportTestStep("verify whether user is able to view product details")
    public void verifyProduct() {
        Assert.assertTrue(waitAndCheckIsElementPresent(ProductPage));
        Assert.assertTrue(waitAndCheckIsElementPresent(SelectRating));
        selectOptionByIndex(5,SelectRating);
        Assert.assertTrue(waitAndCheckIsElementPresent(EnterReview));
        waitAndSetText(EnterReview,"Ok Test");
        Assert.assertTrue(waitAndCheckIsElementPresent(SubmitButton));
        clickOnWithoutWait(SubmitButton);
        Assert.assertTrue(waitAndCheckIsElementPresent(SuccessMessage));
        pageRefresh();
        Assert.assertTrue(waitAndCheckIsElementPresent(User_Profile));
        waitAndClickOn(User_Profile);
        Assert.assertTrue(waitAndCheckIsElementPresent(logout_Button));
        waitAndClickOn(logout_Button);
    }
    @ReportTestStep("Select Product and add to Cart ")
    public void selectProduct(){
        Assert.assertTrue(waitAndCheckIsElementPresent(add_Cart));
        waitAndClickOn(add_Cart);
        Assert.assertTrue(waitAndCheckIsElementPresent(brand_sign));
        waitAndClickOn(brand_sign);



    }


    @ReportTestStep("Select Product and add to Cart2")
    public void selectProducttwo(){
        Assert.assertTrue(waitAndCheckIsElementPresent(add_Cart));
        waitAndClickOn(add_Cart);
        Assert.assertTrue(waitAndCheckIsElementPresent(Check_Out));
        waitAndClickOn(Check_Out);




    }
    public void brandSign(){
        Assert.assertTrue(waitAndCheckIsElementPresent(brand_sign));
        waitAndClickOn(brand_sign);
    }
    @ReportTestStep("Select Product and add to Cart2")
    public void selectProductthree(){
        Assert.assertTrue(waitAndCheckIsElementPresent(add_Cart));
        waitAndClickOn(add_Cart);
        Assert.assertTrue(waitAndCheckIsElementPresent(Check_Out));
        waitAndClickOn(Check_Out);



    }
}
