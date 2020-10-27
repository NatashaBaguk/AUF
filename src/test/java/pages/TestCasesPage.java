package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCasesPage extends BasePage {

    private static String ENDPOINT = "index.php?/suites/view/152";

    private static By ADD_TESTCASE_LOCATOR = By.partialLinkText("Add Test Case");


    public TestCasesPage(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }

    @Override
    protected void openPage() {

    }

    @Override
    public boolean isPageOpened() {
        return false;
    }

    private WebElement setAddTestCase (){
        return driver.findElement(ADD_TESTCASE_LOCATOR);
    }

    public void getAddTestCase (){
        setAddTestCase().click();
    }
}
