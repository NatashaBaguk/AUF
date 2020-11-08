package step;

import browserService.ReadProperties;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LoginPage;

public class LoginSteps {
    private WebDriver driver;

    public LoginSteps(WebDriver driver) {
        this.driver = driver;
    }

    @Step
    public void login(String username, String psw){
        Assert.assertTrue(true);
        LoginPage loginPage = new LoginPage(driver, true);
        loginPage.setUsernameField(username);
        loginPage.setPasswordField(psw);
        loginPage.setButton();
    }
}
