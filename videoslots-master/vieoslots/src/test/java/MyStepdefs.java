import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import task5.LoginPage;
import task5.MainPage;
import task5.UserAccountPage;

import static com.codeborne.selenide.Selenide.open;

public class MyStepdefs {

    private MainPage mainPage = new MainPage();
    private LoginPage loginPage = new LoginPage();
    private UserAccountPage userAccountPage = new UserAccountPage();

    @Given("user opens a webpage {string}")
    public void userOpensAWebpage(String arg0) {
        Configuration.timeout = 10000;
        open(arg0);
    }

    @When("user clicks on {string} button")
    public void userClicksOnButton(String arg0) {
        mainPage.clickLoginButton();
    }

    @And("user fills the email field with {string}")
    public void userFillsTheEmailFieldWith(String arg0) {
        loginPage.fillEmailField(arg0);
    }

    @And("clicks Continue button")
    public void clicksContinueButton() {
        loginPage.clickContinueButton();
    }

    @And("user fills the password field with {string}")
    public void userFillsThePasswordFieldWith(String arg0) {
        loginPage.fillPasswordField(arg0);
    }

    @Then("user sees personal account being logged in")
    public void userSeesPersonalAccountBeingLoggedIn() {
        userAccountPage.userInfoIsPresent();
    }

    @And("user fills email field with invalid data {string}")
    public void userFillsEmailFieldWithInvalidData(String arg0) {
        loginPage.fillEmailField(arg0);
    }

    @And("user clicks on Continue button")
    public void userClicksOnContinueButton() {
        loginPage.clickContinueButton();
    }

    @Then("user sees error message")
    public void userSeesErrorMessage() {
        loginPage.emailErrorMessageIsPresent();
    }

    @When("user clicks {string} button")
    public void userClicksButton(String arg0) {
        userAccountPage.clickAddNewNoteButton();
    }

    @And("user types {string} into new note title")
    public void userTypesIntoNewNoteTitle(String arg0) {
        userAccountPage.fillNoteTitleField(arg0);
    }

    @And("user logs out")
    public void userLogsOut() {
        userAccountPage.clickUserInfoButton();
        userAccountPage.clickLogOutButton();
    }

    @And("user confirms logging out")
    public void userConfirmsLoggingOut() {
        userAccountPage.clickLogOutConfirmButton();
    }

    @Then("user is on main page and user sees Log in button")
    public void userIsOnMainPageAndUserSeesButton() {
        mainPage.loginButtonIsPresent();
    }

    @Then("note title has {string} in it")
    public void noteTitleHasInIt(String arg0) {
        Assert.assertEquals(arg0, userAccountPage.getTextOutOfNoteTitle());
    }
}
