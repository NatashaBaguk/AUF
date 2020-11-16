package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import step.LoginSteps;
import wrappers.*;

public class UIElementsTest extends BaseTest {

//    @Test
//    public void initTest(){
//        LoginPage loginPage = new LoginPage(driver,true);
//        UIElement element = loginPage.getUsernameField();
//        element.click();
//    }

    @Test
    public void tableTest (){
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.login(readProperties.getUsername(), readProperties.getPassword());
        
        driver.get("https://aqa071.testrail.io/index.php?/admin/projects/overview");

        Table table = new Table(driver, By.cssSelector("table.grid"));
        table.clickItemInRow(1);

    }

    @Test
    public void inputTest (){
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.login(readProperties.getUsername(), readProperties.getPassword());

    }

    @Test
    public void clickRadioButton (){
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.login(readProperties.getUsername(), readProperties.getPassword());

        driver.get("https://aqa071.testrail.io/index.php?/admin/projects/edit/63/1");

        RadioButton radioButton = new RadioButton(driver, By.cssSelector("div[style='width: 640px']"));
        radioButton.clickRadioButton(2);
    }

//    @Test
//    public void dropDownMenu (){
//        LoginSteps loginSteps = new LoginSteps(driver);
//        loginSteps.login(readProperties.getUsername(), readProperties.getPassword());
//
//        driver.get("https://aqa071.testrail.io/index.php?/suites/view/63");
//
//        DropDownMenu dropDownMenu = new DropDownMenu(driver, By.xpath("//span[text()='Reports']"));
//
//    }


}
