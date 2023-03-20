package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {
    private SelenideElement homeButton = $(new ByText("Home"));
    private SelenideElement yourPostButton = $(By.xpath("//div[contains(@class, 'content-pane')]//a[contains(text(), 'Your posts')]"));
    private SelenideElement postUpdateButton = $(By.xpath("//div[@class ='buttons']/a[text() ='Post update']"));

    private ElementsCollection hugs = $$(By.xpath("//header[@class = 'card-header']/parent::div/following::section//div//a"));
    private ElementsCollection hugButtons = $$(By.xpath("//header[@class = 'card-header']//following::footer/a[contains(text(), 'Hug')]"));
    private SelenideElement editProfileButton = $(By.xpath("//div[contains(@class, 'content-pane')]//a[contains(text(), 'Edit profile')]"));

    public boolean isHomeDisplayed() {
        homeButton.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return homeButton.isDisplayed();
    }

    public MainPage clickHugButton() {
        hugButtons.get(4).click();
        return this;
    }

    public PostPage clickPostUpdateButton() {
        postUpdateButton.click();
        return new PostPage();
    }

    public boolean isUserClick() {
        hugs.get(4).shouldBe(Condition.visible, Duration.ofSeconds(5));
        return hugs.get(4).getText().contains("Irena B");
    }

    public String receiveHugButtonTittle() {
        hugButtons.get(1).shouldBe(Condition.disabled, Duration.ofSeconds(5));
        String HugButtonTittle = hugButtons.get(2).getText();
        return HugButtonTittle;
    }

    public MyPostPage clickYourPostButton(){
        yourPostButton.click();
        return new MyPostPage();
    }

    public EditProfilePage clickEditProfileButton(){
        editProfileButton.click();
        return new EditProfilePage();
    }
}