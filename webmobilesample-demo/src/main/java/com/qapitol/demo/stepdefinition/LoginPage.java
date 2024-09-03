package com.qapitol.demo.stepdefinition;

import com.qapitol.sauron.core.Grid;
import com.qapitol.sauron.core.pages.AbstractPage;
import com.qapitol.sauron.mobile.sessions.MobileTestSession;
import com.qapitol.sauron.report.core.annotations.ReportTestStep;
import com.qapitol.sauron.web.sessions.WebTestSession;
import com.qapitol.sauron.webmobile.WebMobileActionListener;

public class LoginPage extends AbstractPage implements
    WebMobileActionListener {

  private static final String LOGIN_ID = "loginId";
  private static final String SIGN_IN_BUTTON = "signInButton";
  private static final String URL = "http://203.92.60.190:8080/";


  @ReportTestStep("Launch app")
  public void launchAPP() {
    if (Grid.getTestSession() instanceof MobileTestSession) {
      Grid.driver();
    } else if (Grid.getTestSession() instanceof WebTestSession) {
      Grid.driver().get(URL);
    }
  }

  @ReportTestStep("Switch between web and mobile session")
  public void switchBetweenWebAndMobile() {
    Grid.switchPlatformContext();
  }

  @ReportTestStep("Login into application with valid username and password")
  public void loginIntoPage() {
    waitAndSetText(LOGIN_ID, "6f021db0");
    waitAndClickOn(SIGN_IN_BUTTON);
  }
  @ReportTestStep("Refresh Browser")
  public void refreshBrowser(){
    Grid.driver().navigate().refresh();
  }
}
