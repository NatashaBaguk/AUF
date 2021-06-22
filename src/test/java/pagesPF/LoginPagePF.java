package pagesPF;


import baseEntities.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagePF extends BasePage {
    private static String ENDPOINT = "/index.php?/auth/login/";


    @FindBy(id = "name")
    public WebElement USERNAME_SELECTOR;

    @FindBy(id = "password")
    public WebElement PASSWORD_SELECTOR;

    @FindBy(id = "button_primary")
    private WebElement LOGIN_BUTTON;

    @FindBy(className = "error-text")
    public WebElement ERROR_MESSAGE_Selector;

    public LoginPagePF(WebDriver driver, boolean openPageByUrl){
        super(driver, openPageByUrl);
    }

    public void openPage() {
        driver.get(BASE_URL + ENDPOINT);
    }

    public boolean isPageOpened() {
        return USERNAME_SELECTOR.isDisplayed();
    }

    /**Chain of Invocation**/
    public DashboardPagePF clickLoginButton() {
        LOGIN_BUTTON.click();
        return new DashboardPagePF(driver, false);
    }
}