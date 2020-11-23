package step;

import browserService.ReadProperties;
import io.qameta.allure.Step;
import models.User;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LoginPage;

public class LoginSteps {
    private WebDriver driver;

    public LoginSteps(WebDriver driver) {
        this.driver = driver;
    }

    @Step
    public void login(String username, String psw) {
        Assert.assertTrue(true);
        LoginPage loginPage = new LoginPage(driver, true);
        loginPage.USERNAME_LOCATOR.sendKeys(username);
        loginPage.PASSWORD_LOCATOR.sendKeys(psw);
        loginPage.BUTTON_LOCATOR.click();
    }


    @Step
    public void login(User user) {
        Assert.assertTrue(true);
        LoginPage loginPage = new LoginPage(driver, true);
        loginPage.USERNAME_LOCATOR.sendKeys(user.getUsername());
        loginPage.PASSWORD_LOCATOR.sendKeys(user.getPassword());
        loginPage.BUTTON_LOCATOR.click();
    }
}
