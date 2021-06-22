package step;

import browserService.ReadProperties;
import io.qameta.allure.Step;
import models.User;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LoginPage;
import pagesPF.LoginPagePF;

public class LoginSteps {
    private WebDriver driver;

    public LoginSteps(WebDriver driver) {
        this.driver = driver;
    }

    @Step
    public void login(String username, String psw){
//        Assert.assertTrue(true);
//        LoginPage loginPage = new LoginPage(driver, true);
//        loginPage.setUsernameField(username);
//        loginPage.setPasswordField(psw);
//        loginPage.setButton();
    }

    public void login(User user) {
        LoginPagePF loginPagePF = new LoginPagePF(driver, true);
        loginPagePF.USERNAME_SELECTOR.sendKeys(user.getUsername());
        loginPagePF.PASSWORD_SELECTOR.sendKeys(user.getPassword());
        loginPagePF.clickLoginButton();

    }
}
