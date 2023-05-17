package task5;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    //Webelements
    private final SelenideElement emailField = $x("//input[@id='username']");
    private final SelenideElement passwordField = $x("//input[@id='password']");
    private final SelenideElement continueButton = $x("//input[@id='loginButton']");
    private final SelenideElement emailInvalidDataMessage = $x("//div[@id='responseMessage']");


    //Methods for taking actions
    public void fillEmailField(String email) {
        emailField.sendKeys(email);
    }
    public void clickContinueButton() {
        continueButton.click();
    }
    public void emailErrorMessageIsPresent() {
        emailInvalidDataMessage.shouldBe(Condition.visible);
    }
    public void fillPasswordField(String password) {
        passwordField.sendKeys(password);
    }
}
