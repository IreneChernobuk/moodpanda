package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PostPage {
    private SelenideElement textField = $(By.className("textarea"));
    private SelenideElement updateButton = $(By.xpath("//a[contains(text(), 'Update')]"));
    private SelenideElement moodButton = $(By.xpath("//div[contains(@class, 'is-hidden-touch')]/button[contains(text(), '10')]"));
    private SelenideElement moodOptionButton = $(By.xpath("//label/parent::div//button[5]"));

    public PostPage sendTextMessage() {
        textField.sendKeys("I'll think about it tomorrow");
        return this;
    }

    public PostPage clickMoodButton() {
        moodButton.click();
        return this;
    }

    public PostPage chooseAndClickMood() {
        moodOptionButton.click();
        return this;
    }

    public PostUpdatePage clickUpdateButton() {
        updateButton.click();
        return new PostUpdatePage();
    }
}