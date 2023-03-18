package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private SelenideElement homeButton = $(new ByText("Home"));

    public boolean isHomeDisplayed() {
        homeButton.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return homeButton.isDisplayed();
    }
}