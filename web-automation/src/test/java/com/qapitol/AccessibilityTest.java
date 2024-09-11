package com.qapitol;

import com.qapitol.stepdefinition.LoginPage;
import com.qapitol.sauron.common.annotations.SauronTest;
import com.qapitol.sauron.core.pages.DiService;
import com.qapitol.sauron.report.core.annotations.ReportTest;
import com.qapitol.sauron.web.accessibility.AccessibilityBuilder;
import org.testng.annotations.Test;

public class AccessibilityTest {
  final LoginPage loginPage = DiService.get(LoginPage.class);

  @SauronTest
  @Test
  @ReportTest("verify accessibility testing for book store login, home and pdp page")
  public void verifyUserAbleToLoginToApplication() {
    loginPage.browserLaunchBookStore();
    AccessibilityBuilder.getInstance().savePageViolationsWithPageTitle("LoginPage");
    loginPage.loginIntoPage();
  }
}
