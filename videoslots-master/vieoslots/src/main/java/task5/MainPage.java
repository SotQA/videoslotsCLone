package task5;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    //Webelements
    private SelenideElement loginButton = $x("//nav[@class='utility-nav']//a[text()='Log In']");


    //Method for taking actions
    public void clickLoginButton(){
        loginButton.click();
    }
    public void loginButtonIsPresent(){
        loginButton.shouldBe(Condition.visible);
    }
}
