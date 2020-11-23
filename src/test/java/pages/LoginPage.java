package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wrappers.Input;
import wrappers.UIElement;

public class LoginPage extends BasePage {

    private static String ENDPOINT = "index.php?/auth/login/";

    @FindBy(id = "name")
     public WebElement USERNAME_LOCATOR;
//    private static By USERNAME_LOCATOR = By.id("name");

    @FindBy (id ="password")
     public WebElement PASSWORD_LOCATOR;
//    private static By PASSWORD_LOCATOR = By.id("password");

    @FindBy (id ="button_primary")
    public WebElement BUTTON_LOCATOR;
//    private static By BUTTON_LOCATOR = By.id("button_primary");

    @FindBy(className = "error-text")
    public WebElement ERROR_MESSAGE_LOCATOR;
//    private static By ERROR_MESSAGE_LOCATOR = By.className("error-text");

    @FindBy( xpath = "//div[text()='Email/Login is required.']")
     public WebElement ERROR_PASSWORD_LOCATOR;
//    private static By ERROR_PASSWORD_LOCATOR = By.xpath("//div[text()='Email/Login is required.']");

    public LoginPage(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }


    @Override
    protected void openPage() {
        driver.get(BASE_URL + ENDPOINT);
    }

    public boolean isPageOpened() {
        return waits.isElementDisplayed(By.id("button_primary"));
    }

    public Input getUsernameField() {
        // return waits.getElementBy(USERNAME_LOCATOR);
        return new Input(driver, USERNAME_LOCATOR);
    }

    private Input getPasswordField() {
        return new Input(driver, PASSWORD_LOCATOR);

    }

    private WebElement getButton() {
        return null;
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
        return null;
    }

    public WebElement getErrorPassword() {
        return null;
    }

    public DashboardPage clickLoginButton (){
        BUTTON_LOCATOR.click();
        return new DashboardPage(driver, false);
    }
}
