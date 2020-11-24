package tests.gui;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.DashboardPage;
import step.LoginSteps;

import java.util.concurrent.TimeUnit;

public class ActionTests extends BaseTest {

    @Test
    public void clickBottomLink (){
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.login(readProperties.getUsername(), readProperties.getPassword());

        DashboardPage dashboardPage = new DashboardPage(driver, false);
        dashboardPage.clickBottomProjectLink();

    }

    @Test
    public void uploadTest() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/upload");

        WebElement uploadInput = driver.findElement(By.xpath("//input[@type='file']"));
        uploadInput.sendKeys("/Users/aleksandr.trostyanko/Downloads/2020-11-04_14-11-54.jpg");

        driver.findElement(By.id("file-submit")).click();
    }

}
