package com.qapitol.stepdefinition;

import com.qapitol.sauron.common.configuration.Config;
import com.qapitol.sauron.core.Grid;
import com.qapitol.sauron.data.Data;
import com.qapitol.sauron.report.core.annotations.ReportTestStep;
import com.qapitol.sauron.web.AbstractWebPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class LoginPage extends AbstractWebPage {

  public static final String EMAIL = "email";
  public static final String PASSWORD = "password";
  public static final String SUBMIT_BUTTON = "submitButton";
  public static final String URL = "url";
  public static final String Book_StoreImage="bookStoreImg";
  public static final String Register_user="registerUser";
  public static final String SIGN_IN_BUTTON = "signInBtn";
  public static final String Sign_Up ="signUp";
  public static final String User_Name ="userName";
  public static final String First_Name ="firstName";
  public static final String Email_Id ="emailId";
  public static final String Pass_Word ="passWord";
  public static final String Confirm_Password ="confirmPassword";
  public static final String Register_Confirm ="registerConfirm";






  @ReportTestStep("launch book store web application")
  public void browserLaunchBookStore() {
    Grid.driver().get(Config.getConfigProperty(URL));
  }

  @ReportTestStep("login to book store web application")
  public void loginIntoPage() {

    Grid.driver().manage().window().maximize();
    Assert.assertTrue(waitAndCheckIsElementPresent(SIGN_IN_BUTTON));
    waitAndClickOn(SIGN_IN_BUTTON);
    Assert.assertTrue(waitAndCheckIsElementPresent(EMAIL));
    Assert.assertTrue(waitAndCheckIsElementPresent(PASSWORD));
    clearTextBox(EMAIL);
    waitAndSetText(EMAIL, Config.getConfigProperty(EMAIL));
    clearTextBox(PASSWORD);
    waitAndSetText(PASSWORD, Config.getConfigProperty(PASSWORD));
    Assert.assertTrue(waitAndCheckIsElementPresent(SUBMIT_BUTTON));
    waitAndClickOn(SUBMIT_BUTTON);

  }
  @ReportTestStep("Register new user")
  public void registerUser()
  {
    Assert.assertTrue(waitAndCheckIsElementPresent(Register_user));
    waitAndClickOn(Register_user);
    Assert.assertTrue(waitAndCheckIsElementPresent(Sign_Up));
    Assert.assertTrue(waitAndCheckIsElementPresent(User_Name));
    waitAndSetText(User_Name,"Vaas1235656");
    Assert.assertTrue(waitAndCheckIsElementPresent(First_Name));
    waitAndSetText(First_Name,"Test2");
    Assert.assertTrue(waitAndCheckIsElementPresent(Email_Id));
    waitAndSetText(Email_Id,"test127884@gmail.com");
    Assert.assertTrue(waitAndCheckIsElementPresent(Pass_Word));
    waitAndSetText(Pass_Word,"abc123");
    Assert.assertTrue(waitAndCheckIsElementPresent(Confirm_Password));
    waitAndSetText(Confirm_Password,"abc123");
    Assert.assertTrue(waitAndCheckIsElementPresent(Register_Confirm));
    waitAndClickOn(Register_Confirm);
  }














}
