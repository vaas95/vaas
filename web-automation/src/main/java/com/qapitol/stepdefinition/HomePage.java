package com.qapitol.stepdefinition;

import com.qapitol.sauron.report.core.annotations.ReportTestStep;
import com.qapitol.sauron.web.AbstractWebPage;
import org.testng.Assert;

public class HomePage extends AbstractWebPage {

    public static final String Home_page = "homePage1";
    public static final String Product_selection = "productSelection1";
    public static final String Product_One = "productOne";
    public static final String Product_two = "productTwo";
    public static final String Logout_button="logoutButton";
    public static final String Logout_button2="logoutButton2";
    public static final String Product_three="productThree";



    @ReportTestStep("verify homepage icon is present")
    public void verifyHomepage(){
        Assert.assertTrue(waitAndCheckIsElementPresent(Home_page));
    }

        @ReportTestStep("Select Product and give ratings")
        public void productSelection(){
            Assert.assertTrue(waitAndCheckIsElementPresent(Product_selection));
            waitAndClickOn(Product_selection);

        }
    @ReportTestStep("Select 1st product from the homepage")
    public void selectProducts()
    {
        Assert.assertTrue(waitAndCheckIsElementPresent(Product_One));
        waitAndClickOn(Product_One);


    }
    @ReportTestStep("Select 2nd product from the homepage")
    public void selectProductstwo()
    {
        Assert.assertTrue(waitAndCheckIsElementPresent(Product_two));
        waitAndClickOn(Product_two);
    }
    @ReportTestStep("Logout from page")
    public void logoutPage()
    {
        Assert.assertTrue(waitAndCheckIsElementPresent(Logout_button));
        waitAndClickOn(Logout_button);
        Assert.assertTrue(waitAndCheckIsElementPresent(Logout_button2));
        waitAndClickOn(Logout_button2);
    }
    @ReportTestStep("Select 3rd product from the homepage")
    public void selectProductsthree()
    {
        Assert.assertTrue(waitAndCheckIsElementPresent(Product_two));
        waitAndClickOn(Product_three);

    }







    }

