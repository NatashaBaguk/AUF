package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wrappers.Input;

public class LoginPage extends BasePage {

    private static String ENDPOINT = "index.php?/auth/login/";

    @FindBy(id = "name")
    public WebElement USERNAME_LOCATOR;


    @FindBy(id = "password")
    public WebElement PASSWORD_LOCATOR;


    @FindBy(id = "button_primary")
    public WebElement BUTTON_LOCATOR;


    @FindBy(className = "error-text")
    public WebElement ERROR_MESSAGE_LOCATOR;


    @FindBy(xpath = "//div[text()='Email/Login is required.']")
    public WebElement ERROR_PASSWORD_LOCATOR;


    public LoginPage(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }

    @Override
    protected void openPage() {
        driver.get(BASE_URL + ENDPOINT);
    }

    public boolean isPageOpened() {
        return BUTTON_LOCATOR.isDisplayed();
    }


    public DashboardPage clickLoginButton() {
        BUTTON_LOCATOR.click();
        return new DashboardPage(driver, false);
    }
}
