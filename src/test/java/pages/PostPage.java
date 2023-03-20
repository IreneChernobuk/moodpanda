package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PostPage {
    private SelenideElement textField = $(By.className("textarea"));
    private SelenideElement updateButton = $(By.xpath("//a[contains(text(), 'Update')]"));

    public PostPage sendTextMessage(){
        textField.sendKeys("I'll think about it tomorrow");
        return this;
    }

    public PostUpdatePage clickUpdateButton(){
        updateButton.click();
        return new PostUpdatePage();
    }
}