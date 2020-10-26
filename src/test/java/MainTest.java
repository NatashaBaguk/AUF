import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProjectDeletePage;
import step.LoginSteps;
import step.ProjectSteps;

public class MainTest extends BaseTest {
    private LoginSteps loginSteps;
    private ProjectSteps projectSteps;
    private LoginPage loginPage;

    @Test(priority = 1)
    public void loginPositiveTest() {
        loginSteps = new LoginSteps(driver);
        loginSteps.login(readProperties.getUsername(), readProperties.getPassword());
        Assert.assertTrue(true);
    }

    @Test(enabled = false)
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

    @Test(priority = 4)
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
//
//    @Parameters({"username", "psw"})
//    @Test()
//    public void testLoginWithParameters (@Optional("sdfh") String username, @Optional("2") String psw){
//        loginSteps = new LoginSteps(driver);
//        loginSteps.login(username, psw);
//    }

    @DataProvider(name = "Последовательность тестов")
    public Object [][] sequence (){
        return new Object[][] {
                {},
        };
    }



}