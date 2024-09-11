package com.qapitol;

import com.qapitol.stepdefinition.LoginPage;
import com.qapitol.sauron.common.annotations.SauronTest;
import com.qapitol.sauron.core.pages.DiService;
import com.qapitol.sauron.data.reader.property.SauronTestData;
import com.qapitol.sauron.report.core.annotations.ReportTest;
import org.testng.annotations.Test;

@SauronTest
public class BookStoreDataTest {

  final LoginPage loginPage = DiService.get(LoginPage.class);

  @SauronTest(testId = "test1")
  @Test
  @ReportTest("verify user is able to login to application")
  public void verifyUserAbleToLoginToApplication() {
    loginPage.browserLaunchBookStore();
  }

  @SauronTest
  @Test
  @ReportTest("verify user is able to login to application by reading data from properties file")
  public void verifyUserAbleToLoginToApplicationProperties() {
    SouranSampleTestData testData = SauronTestData.createTestData(SouranSampleTestData.class);
    String username = testData.username();
    String password = testData.password();
    loginPage.browserLaunchBookStore();
  }


}
