package com.qapitol.demo.stepdefinition;

import com.qapitol.sauron.core.Grid;
import com.qapitol.sauron.core.pages.AbstractPage;
import com.qapitol.sauron.report.core.annotations.ReportTestStep;
import com.qapitol.sauron.webmobile.WebMobileActionListener;
import com.qapitol.sauron.webmobile.pages.AbstractWebMobilePage;
import org.testng.Assert;

public class AddCasePage extends AbstractWebMobilePage {

  private static final String ADD_CASE = "addCase";
  private static final String CASE_TITLE = "title";
  private static final String DESCRIPTION = "description";
  private static final String SUBMIT = "submit";
  private static final String VALUE = "value";
  private static final String CASE_NAME = "caseName";
  private static final String DELETE_CASE = "deleteCase";
  private static final String LOGOUT = "addCase";
  private static final String TITLE = "Tree plantation";
  private static final String CASE_DESCRIPTION = "31 March";
  private static final String CASE_VALUE = "5000";

  public void clickOnAddNewCaseButton() {
    waitAndClickOn(ADD_CASE);
  }

  @ReportTestStep("Add new case")
  public void addNewCase() {
    waitAndSetText(CASE_TITLE, TITLE);
    waitAndSetText(DESCRIPTION, CASE_DESCRIPTION);
    waitAndSetText(VALUE, CASE_VALUE);
    waitAndClickOn(SUBMIT);
  }

  @ReportTestStep("Verify user is logged into application")
  public void verifyUerLoggedIntoApplication() {
    Assert.assertTrue(waitAndCheckIsElementPresent(ADD_CASE));
  }

  @ReportTestStep("Verify case is created")
  public void verifyCaseIsCreated() {
    Assert.assertTrue(waitAndCheckIsElementPresent(CASE_NAME, TITLE));
  }

  @ReportTestStep("Delete case")
  public void deleteCase() {
    waitAndClickOn(DELETE_CASE);
  }

  @ReportTestStep("Verify case is deleted")
  public void verifyCaseIsDeleted() {
    Assert.assertFalse(waitAndCheckIsElementPresent(CASE_NAME, TITLE));
  }
}
