package step;

import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.TestCasesPage;

public class AddTestCaseSteps {

    private WebDriver driver;

    public AddTestCaseSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void createTestCase (String title, String steps, String ExpectedResult){
        DashboardPage dashboardPage = new DashboardPage(driver,true);
        dashboardPage.getSelectProject();
        dashboardPage.clickSelectTestCases();

        TestCasesPage testCasesPage = new TestCasesPage(driver,true);
        testCasesPage.getAddTestCase();
        testCasesPage.getTitle(title);
        testCasesPage.getSteps(steps);
        testCasesPage.getExpectedResult(ExpectedResult);
        testCasesPage.getAddTestCaseButton();

    }
}
