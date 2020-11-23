package tests;

import baseEntities.BaseTest;
import models.Account;
import models.User;
import org.testng.annotations.Test;
import step.LoginSteps;

public class PageFactoryTest extends BaseTest {

    @Test
    public void firstTest(){

        User user = new User(readProperties.getUsername(),readProperties.getPassword());

        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.login(user);

        Account account = Account.newBuilder()
                .setToken("hello")
                .setUserId("habr")
                .build();


    }


}
