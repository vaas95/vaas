package com.qapitol;

import com.qapitol.sauron.core.pages.DiService;
import com.qapitol.sauron.report.core.annotations.ReportTest;
import com.qapitol.stepdefinition.*;
import org.testng.annotations.Test;

import com.qapitol.sauron.common.annotations.SauronTest;

@SauronTest
public class BookStoreTest {

  final LoginPage loginPage = DiService.get(LoginPage.class);
  final HomePage homePage = DiService.get(HomePage.class);
  final ProductPage productPage = DiService.get(ProductPage.class);
  final AddressPage addressPage = DiService.get(AddressPage.class);
  final PaymentPage paymentPage = DiService.get(PaymentPage.class);


  @SauronTest
  @Test(priority = 0)
  @ReportTest("verify user is able to give rating for a product")
  public void verifyUserAbleToLoginToApplication() {
    loginPage.browserLaunchBookStore();
    loginPage.loginIntoPage();
    homePage.verifyHomepage();
    homePage.productSelection();
    productPage.verifyProduct();
  }

  @SauronTest
  @Test(priority = 1)
  @ReportTest("Place order with 2 different products and verify order details.")
  public void twoOrders() {
    loginPage.browserLaunchBookStore();
    loginPage.loginIntoPage();
    homePage.selectProducts();
    productPage.selectProduct();
    homePage.selectProductstwo();
    productPage.selectProducttwo();
    addressPage.enterDetails();
    paymentPage.selectPayment();


  }

  @SauronTest
  @Test(priority = 2)
  @ReportTest("Start user as guest user then register as new user and place order")
  public void guestUser() {
    loginPage.browserLaunchBookStore();
    loginPage.loginIntoPage();
    homePage.logoutPage();
    loginPage.registerUser();
    homePage.selectProducts();
    productPage.selectProducttwo();
    addressPage.newDetails();
    paymentPage.newPayment();
  }

  @SauronTest
  @Test(priority = 3)
  @ReportTest("Add 3 different products in cart and verify cart and validate details.")
  public void threeProduct() {
    loginPage.browserLaunchBookStore();
    loginPage.loginIntoPage();
    homePage.selectProducts();
    productPage.selectProduct();
    homePage.selectProductstwo();
    productPage.selectProducttwo();
    productPage.brandSign();
    homePage.selectProductsthree();
    productPage.selectProductthree();
    addressPage.enterDetails();
    paymentPage.selectPayment();

  }

  @SauronTest
  @Test(priority = 4)
  @ReportTest("Place order with new address and payment method and verify address and payment details")
  public void newOrder() {
    loginPage.browserLaunchBookStore();
    loginPage.loginIntoPage();
    homePage.selectProducts();
    productPage.selectProductthree();
    addressPage.newDetails();
    paymentPage.newPayment();


  }
}