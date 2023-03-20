package tests;

import constants.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class UpdatingDataTest extends BaseTest{
    public String firstName = "Irena";
    public String firstLetterSurname = "B";

    @Test
    public void updateFirstName() {
        LoginPage loginPage = new LoginPage();
        String isFirstNameUpdate = loginPage
                .login(Credentials.USERNAME, Credentials.PASSWORD)
                .clickEditProfileButton()
                .exitFirstName(firstName)
                .safeIdentityButton()
                .receiveName();
        Assert.assertTrue(isFirstNameUpdate.contains(firstName), "first name has not changed");
    }

    @Test
    public void updateLastName() {
        LoginPage loginPage = new LoginPage();
        String isLastNameUpdate = loginPage
                .login(Credentials.USERNAME, Credentials.PASSWORD)
                .clickEditProfileButton()
                .exitLastName(firstLetterSurname)
                .safeIdentityButton()
                .receiveName();
        Assert.assertTrue(isLastNameUpdate.contains(firstLetterSurname),"first letter surname has not changed");
    }
}