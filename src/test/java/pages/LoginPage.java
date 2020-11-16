package pages;

import baseEntities.BasePage;
import browserService.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
        try {
            return driver.findElement(BUTTON_LOCATOR).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    private WebElement getUsernameField() {
        return driver.findElement(USERNAME_LOCATOR);
    }

    private WebElement getPasswordField() {
        return driver.findElement(PASSWORD_LOCATOR);

    }

    private WebElement getButton (){
        return driver.findElement(BUTTON_LOCATOR);
    }

    public void setUsernameField(String username) {
        getUsernameField().sendKeys(username);
    }

    public void setPasswordField(String password) {
        getPasswordField().sendKeys(password);
    }

    public void setButton (){
        getButton().click();
    }

    public WebElement getErrorMessage(){
        return driver.findElement(ERROR_MESSAGE_LOCATOR);
    }

    public WebElement getErrorPassword (){
        return driver.findElement(ERROR_PASSWORD_LOCATOR);
    }

}
