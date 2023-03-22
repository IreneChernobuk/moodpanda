package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.$;

public class PostUpdatePage {
    private SelenideElement moodText = $(new ByText("Mood updated"));
    private SelenideElement homeButton = $(By.xpath("//div[@class='navbar-start']//a[contains(text(),'Home')]"));

    public boolean updateMood(){
        moodText.shouldBe(Condition.visible, Duration.ofSeconds(5));
       return moodText.isDisplayed();
    }

    public MainPage clickHomeButton(){
        homeButton.click();
        return new MainPage();
    }
}