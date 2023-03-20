package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class MyPostPage {
    private SelenideElement dropdownButton = $(By.xpath("//footer//div[@class='dropdown-trigger']"));
    private SelenideElement deleteSussesMessage = $(By.xpath("//div[contains(@class, 'notification')]"));
    private SelenideElement deleteButton = $(By.xpath("//footer//div[@class='dropdown-content']/a[text() = ' Delete ']"));

    public MyPostPage clickDropdownButton() {
        dropdownButton.click();
        return this;
    }

    public MyPostPage clickDeleteButton() {
        deleteButton.click();
        return this;
    }

    public boolean appearDeleteMessage() {
        deleteSussesMessage.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return deleteSussesMessage.isDisplayed();
    }
}