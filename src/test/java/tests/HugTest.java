package tests;

import constants.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class HugTest extends BaseTest {

    @Test
    public void SendHugTest() {
        LoginPage loginPage = new LoginPage();
        boolean isUserHug = loginPage
                .login(Credentials.USERNAME, Credentials.PASSWORD)
                .clickHugButton()
                .isUserClick();
        Assert.assertTrue(isUserHug, "didn't hug");
    }

    @Test
    public void SendHugTest2() { //не работает но очень хотелось бы!!
        LoginPage loginPage = new LoginPage();
        String HugButtonTittle = loginPage
                .login(Credentials.USERNAME, Credentials.PASSWORD)
                .clickHugButton()
                .receiveHugButtonTittle();
        Assert.assertEquals(HugButtonTittle, "Hug sent");
    }
}