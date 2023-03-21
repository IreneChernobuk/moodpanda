package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private SelenideElement homeButton = $(new ByText("Home"));
    private SelenideElement yourPostButton = $(By.xpath("//div[contains(@class, 'content-pane')]//a[contains(text(), 'Your posts')]"));
    private SelenideElement postUpdateButton = $(By.xpath("//div[@class ='buttons']/a[text() ='Post update']"));
    private ElementsCollection hugButtons = $$(By.xpath("//header[@class = 'card-header']//following::footer/a[contains(text(), 'Hug')]"));
    private SelenideElement editProfileButton = $(By.xpath("//div[contains(@class, 'content-pane')]//a[contains(text(), 'Edit profile')]"));

    public boolean isHomeDisplayed() {
        homeButton.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return homeButton.isDisplayed();
    }

    public MainPage clickHugButton() {
        hugButtons.get(2).click();
        return this;
    }

    public PostPage clickPostUpdateButton() {
        postUpdateButton.click();
        return new PostPage();
    }

    public String getNameButton() {
        hugButtons
                .get(2)
                .shouldBe(Condition.attribute("disabled"), Duration.ofSeconds(10));
        return hugButtons.get(2).getText();
    }

    public MyPostPage clickYourPostButton() {
        yourPostButton.click();
        return new MyPostPage();
    }

    public EditProfilePage clickEditProfileButton() {
        editProfileButton.click();
        return new EditProfilePage();
    }
}