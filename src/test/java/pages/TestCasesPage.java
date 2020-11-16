package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCasesPage extends BasePage {

    private static String ENDPOINT = "index.php?/suites/view/152";

    private static By ADD_TESTCASE_LOCATOR = By.partialLinkText("Add Test Case");
    private static By TITLE_LOCATOR = By.id("title");
    private static By STEPS_LOCATOR = By.id("custom_steps");
    private static By EXPECTED_RESULT_LOCATOR = By.id("custom_expected");
    private static By ADD_TESTCASE_BUTTON_LOCATOR = By.id("accept");



    public TestCasesPage(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }

    @Override
    protected void openPage() {
        driver.get(BASE_URL + ENDPOINT);

    }

    @Override
    public boolean isPageOpened() {
        return driver.findElement(ADD_TESTCASE_LOCATOR).isDisplayed();
    }

    private WebElement setAddTestCase (){
        return driver.findElement(ADD_TESTCASE_LOCATOR);
    }

    private WebElement setTitle(){
        return driver.findElement(TITLE_LOCATOR);
    }

    private WebElement setSteps(){
        return driver.findElement(STEPS_LOCATOR);
    }

    private WebElement setExpectedResult (){
        return driver.findElement(EXPECTED_RESULT_LOCATOR);
    }

    private WebElement setAddTestCaseButton (){
        return driver.findElement(ADD_TESTCASE_BUTTON_LOCATOR);
    }

    public void getAddTestCase (){
        setAddTestCase().click();
    }

    public void getTitle(String title) {
        setTitle().sendKeys(title);
    }

    public void getSteps (String steps){
        setSteps().sendKeys(steps);
    }

    public void getExpectedResult (String ExpectedResult){
        setExpectedResult().sendKeys(ExpectedResult);
    }

    public void getAddTestCaseButton (){
        setAddTestCaseButton().click();
    }
}
