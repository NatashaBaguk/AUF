package pages;

import baseEntities.BasePage;
import browserService.BrowserService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.UIElement;


public class LoginPage extends BasePage {
    private static String ENDPOINT = "/auth/login";

    protected By emailSelector = By.id("name");
    protected By passwordSelector = By.id("password");
    protected By loginSelector = By.id("button_primary");

    public LoginPage(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }

    @Override
    protected void openPage() {
        driver.get(BASE_URL + ENDPOINT);
    }

    public boolean isPageOpened() {
        return waits.isElementDisplayed(loginSelector);
    }

    public UIElement getEmailField(String username) {
        return new UIElement(driver, emailSelector);
    }

    public UIElement getPasswordField(String psw) {
        return new UIElement(driver, passwordSelector);
    }

    public UIElement getLoginButton() {
        return new UIElement(driver, loginSelector);
    }
}