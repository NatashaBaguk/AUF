package tests.gui;

import baseEntities.BaseTest;
import org.testng.annotations.Test;
import pages.DashboardPage;
import step.LoginSteps;

public class JSTests extends BaseTest {

    @Test
    public void moveToElementTest(){
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.login(readProperties.getUsername(), readProperties.getPassword());

        DashboardPage dashboardPage = new DashboardPage(driver,true);
        dashboardPage.clickBottomProjectLink();
    }
}
