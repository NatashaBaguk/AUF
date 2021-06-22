package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BasePage {

    private static String ENDPOINT ="index.php?/dashboard";

    private static By SELECT_PROJECT_LOCATOR = By.xpath("//*[@class='column summary-column flex-projects-2']/preceding::a[@href='index.php?/projects/overview/152'][2]");
    private static By SELECT_TESTCASES_LOCATOR = By.id("navigation-suites");
    private static By bottomProjectLinkSelector = By.linkText("WP_001");

    public DashboardPage(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }

    @Override
    protected void openPage() {
        driver.get(BASE_URL + ENDPOINT);

    }

    @Override
    public boolean isPageOpened() {
        return waits.isElementDisplayed(SELECT_PROJECT_LOCATOR);
    }

    private WebElement findSelectProject (){
        return waits.getElementBy(SELECT_PROJECT_LOCATOR);
    }

    private WebElement setSelectTestCases (){
        return waits.getElementBy(SELECT_TESTCASES_LOCATOR);
    }

    public void getSelectProject (){
        findSelectProject().click();
    }

    public void clickSelectTestCases (){
        setSelectTestCases().click();
    }

    public WebElement getBottomProjectLinkSelector (){
        return waits.getElementBy(bottomProjectLinkSelector);
    }

    public void clickBottomProjectLink (){
        WebElement webElement = getBottomProjectLinkSelector();
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true)", webElement);
        js.executeScript("arguments[0].click;", webElement);
        webElement.click();
    }

}
