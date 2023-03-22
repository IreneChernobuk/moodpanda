package tests;

import constants.Credentials;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PostUpdatePage;

public class MessageTest extends BaseTest{

    @BeforeTest
    public void CreateMessage() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(Credentials.USERNAME, Credentials.PASSWORD)
                .clickPostUpdateButton()
                .clickMoodButton()
                .chooseAndClickMood()
                .sendTextMessage()
                .clickUpdateButton()
                .updateMood();
    }

    @Test
    public void DeleteMessage() {
        PostUpdatePage postUpdatePage = new PostUpdatePage();
        boolean isPostDelete = postUpdatePage
                .clickHomeButton()
                .clickYourPostButton()
                .clickDropdownButton()
                .clickDeleteButton()
                .appearDeleteMessage();
        Assert.assertTrue(isPostDelete, "post didn't delete. Message didn't appear");
    }
}