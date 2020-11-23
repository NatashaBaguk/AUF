package tests;



import baseEntities.BaseTest;
import models.*;
import org.testng.annotations.Test;
import pagesPF.DashboardPagePF;
import pagesPF.LoginPagePF;
import step.LoginSteps;



public class PageFactoryTest extends BaseTest {
    //Page Factory нужно использовать только со статическими страницами
    @Test
    public void firstTest() {


        LoginPagePF loginPagePF = new LoginPagePF(driver, true);
        loginPagePF.USERNAME_SELECTOR.sendKeys(readProperties.getUsername());
        loginPagePF.PASSWORD_SELECTOR.sendKeys(readProperties.getPassword());

        /**value of Invocation**/

        DashboardPagePF dashboardPagePF = loginPagePF.clickLoginButton();
        dashboardPagePF.clickSelectTestCases();


//        LoginSteps loginSteps = new LoginSteps(driver);
//        loginSteps.login(user);

//        Project project = new Project("Main Project by Marina", "Description by Marina",
//                true, 1, false);
//
//        ProjectBuilder projectBuilder = ProjectBuilder.newBuilder()
//                .setName("")
//                .setAnnouncement("")
//                .build();
//
//    }
    }
        @Test
        public void secondTest () {
            TestCase testCase = new TestCase.Builder()
                    .withTitle("Title1")
                    .withReference("AQA-1")
                    .build();

            testCase.getTitle();
        }
    }
