package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BasePage {

    private static String ENDPOINT ="index.php?/dashboard";

    private static By SELECT_PROJECT_LOCATOR = By.xpath("//*[@class='column summary-column flex-projects-2']/preceding::a[@href='index.php?/projects/overview/152'][2]");
    private static By SELECT_TESTCASES_LOCATOR = By.id("navigation-suites");


    public DashboardPage(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }

    @Override
    protected void openPage() {
        driver.get(BASE_URL + ENDPOINT);

    }

    @Override
    public boolean isPageOpened() {
        return driver.findElement(SELECT_PROJECT_LOCATOR).isDisplayed();
    }

    private WebElement setSelectProject (){
        return driver.findElement(SELECT_PROJECT_LOCATOR);
    }

    private WebElement setSelectTestCases (){
        return driver.findElement(SELECT_TESTCASES_LOCATOR);
    }


    public void getSelectProject (){
        setSelectProject().click();
    }

    public void getSelectTestCases (){
        setSelectTestCases().click();
    }

}
