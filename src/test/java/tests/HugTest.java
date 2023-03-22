package tests;

import constants.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class HugTest extends BaseTest {

    @Test
    public void SendHugTest() {
        LoginPage loginPage = new LoginPage();
        String HugButtonTittle = loginPage
                .login(Credentials.USERNAME, Credentials.PASSWORD)
                .clickHugButton()
                .getNameButton();
        Assert.assertEquals(HugButtonTittle, "Hug sent");
    }
}