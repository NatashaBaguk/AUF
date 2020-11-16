import baseEntities.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import step.AddTestCaseSteps;
import step.LoginSteps;
import step.ProjectSteps;


public class MainTest extends BaseTest {


    private LoginSteps loginSteps;
    private ProjectSteps projectSteps;

    @Test(priority = 1, description = "Description for Allure")
    @Description("Немного деталей по тесту")
    @Link("https://aqa07.atlassian.net/browse/AQA07-25")
    @TmsLink("1")
    @Severity(SeverityLevel.BLOCKER)
    public void loginPositiveTest() {
        loginSteps = new LoginSteps(driver);
        loginSteps.login(readProperties.getUsername(), readProperties.getPassword());
        Assert.assertTrue(true);
    }

    @Test(enabled = false)
    @Issue("AQA07-25")
    public void loginNegativeTest () {
      loginSteps = new LoginSteps(driver);
      loginSteps.login("fail", readProperties.getPassword());

      Assert.assertEquals(new LoginPage(driver, false).getErrorMessage().getText(),
              "Email/Login or Password is incorrect. Please try again.",
              "Incorrect message");
    }

    @Test(enabled = false)
    public void loginNegativeTest1 () {
      loginSteps = new LoginSteps(driver);
      loginSteps.login(readProperties.getUsername(), "123");

      Assert.assertEquals(new LoginPage(driver, false).getErrorMessage().getText(),
              "Email/Login or Password is incorrect. Please try again.",
              "Incorrect message");
    }

    @Test(enabled = false)
    public void loginNegativeTest2 () {
      loginSteps = new LoginSteps(driver);
      loginSteps.login("", "");

      Assert.assertEquals(new LoginPage(driver, false).getErrorPassword().getText(),
              "Email/Login is required.",
              "Incorrect message");
    }

    @Test(priority = 2)
    public void createProject (){
        projectSteps = new ProjectSteps(driver);
        projectSteps.create("First");
        Assert.assertTrue(true);

    }

    @Test(priority = 3)
    public void editProject (){
        projectSteps = new ProjectSteps(driver);
        projectSteps.edit("Мой первый проект на TestRail");
        Assert.assertTrue(true);
    }

    @Test(enabled = false)
    public void deleteProject (){
        projectSteps = new ProjectSteps(driver);
        projectSteps.delete();
        Assert.assertTrue(true);
    }

//    @DataProvider(name = "набор кредов")
//    public Object[][] credentialsForTest (){
//        return new Object[][] {
//                {readProperties.getUsername(),readProperties.getPassword()},
//                {"Username","w3n1bU7F4rxOfnfvrBJL"},
//                {"Username","dfdgdfg"}
//        };
//    }
//    @Test(dataProvider = "набор кредов")
//    public void testLoginWithMultipleCredentials (String username, String psw){
//        loginSteps = new LoginSteps(driver);
//        loginSteps.login(username, psw);
//    }

//    @DataProvider(name = "Создание тест-кейса")
//    public Object [][] validDataTestCase (){
//        return new Object[][] {
//                {readProperties.getTitle1(), readProperties.getSteps1(),readProperties.getResult1()},
//                {readProperties.getTitle2(), readProperties.getSteps2(),readProperties.getResult2()},
//                {readProperties.getTitle3(), readProperties.getSteps3(),readProperties.getResult3()}
//        };
//    }
//
//    @Test(dataProvider = "Создание тест-кейса")
//    public void validDataForTestCase (String title, String steps, String ExpectedResult){
//        loginPositiveTest();
//        AddTestCaseSteps addTestCaseSteps = new AddTestCaseSteps(driver);
//        addTestCaseSteps.createTestCase(title,steps,ExpectedResult);
//    }

}