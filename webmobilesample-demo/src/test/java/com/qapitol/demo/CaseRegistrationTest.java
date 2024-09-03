package com.qapitol.demo;

import com.qapitol.demo.stepdefinition.AddCasePage;
import com.qapitol.demo.stepdefinition.LoginPage;
import com.qapitol.sauron.common.annotations.SauronTest;
import com.qapitol.sauron.core.pages.DiService;
import com.qapitol.sauron.report.core.annotations.ReportTest;
import org.testng.annotations.Test;

public class CaseRegistrationTest {

  private final LoginPage loginStep = DiService.get(LoginPage.class);
  private final AddCasePage addCaseStep = DiService.get(AddCasePage.class);

  @Test(description = "Verify case registration")
  @SauronTest
  @ReportTest("Verify case registration")
  public void verifyCaseRegistration() {
    loginStep.launchAPP();
    loginStep.switchBetweenWebAndMobile();
    loginStep.launchAPP();
    loginStep.loginIntoPage();
    addCaseStep.verifyUerLoggedIntoApplication();
    addCaseStep.clickOnAddNewCaseButton();
    addCaseStep.addNewCase();
    addCaseStep.verifyCaseIsCreated();
    loginStep.switchBetweenWebAndMobile();
    loginStep.loginIntoPage();
    addCaseStep.deleteCase();
    addCaseStep.verifyCaseIsDeleted();
    loginStep.switchBetweenWebAndMobile();
    loginStep.refreshBrowser();
    addCaseStep.verifyCaseIsDeleted();
  }
}
