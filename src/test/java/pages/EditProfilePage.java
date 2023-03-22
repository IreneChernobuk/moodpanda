package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class EditProfilePage {
    private SelenideElement firstNameInput = $(By.xpath("//label[text()='First name']/parent::div//input"));
    private SelenideElement lastNameInput = $(By.xpath("//label[text()='Last name initial']/parent::div//input"));
    private SelenideElement safeIdentityButton = $(new ByText("Save identity"));
    private SelenideElement getName = $(By.xpath("//div[@class='media-content']//p[contains(@class,'title')]"));

    public EditProfilePage exitFirstName(String name) {
        firstNameInput.clear();
        firstNameInput.sendKeys(name);
        return this;
    }

    public EditProfilePage safeIdentityButton() {
        safeIdentityButton.click();
        return this;
    }

    public String receiveName() {
        getName.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return getName.getText();
    }

    public EditProfilePage exitLastName(String firstLetterSurname) {
        lastNameInput.clear();
        lastNameInput.sendKeys(firstLetterSurname);
        return this;
    }
}