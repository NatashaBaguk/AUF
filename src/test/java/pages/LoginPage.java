package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    private static String ENDPOINT = "index.php?/auth/login/";


    private static By USERNAME_LOCATOR = By.id("name");
    private static By PASSWORD_LOCATOR = By.id("password");
    private static By BUTTON_LOCATOR = By.id("button_primary");
    private static By ERROR_MESSAGE_LOCATOR = By.className("error-text");
    private static By ERROR_PASSWORD_LOCATOR = By.xpath("//div[text()='Email/Login is required.']");

    public LoginPage(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }


    @Override
    protected void openPage() {
        driver.get(BASE_URL + ENDPOINT);
    }

    public boolean isPageOpened() {
        return waiters.isElementDisplayed(By.id("button_primary"));
    }

    private WebElement getUsernameField() {
        return waiters.getElementBy(USERNAME_LOCATOR);
    }

    private WebElement getPasswordField() {
        return waiters.getElementBy(PASSWORD_LOCATOR);

    }

    private WebElement getButton() {
        return waiters.getElementBy(BUTTON_LOCATOR);
    }

    public void setUsernameField(String username) {
        getUsernameField().sendKeys(username);
    }

    public void setPasswordField(String password) {
        getPasswordField().sendKeys(password);
    }

    public void setButton() {
        getButton().click();
    }

    public WebElement getErrorMessage() {
        return waiters.getElementBy(ERROR_MESSAGE_LOCATOR);
    }

    public WebElement getErrorPassword() {
        return waiters.getElementBy(ERROR_PASSWORD_LOCATOR);
    }
}
