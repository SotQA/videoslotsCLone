package task5;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class UserAccountPage {
    private final SelenideElement userInfo = $x("//div[@data-tooltipmark='usernavitem']");
    private final SelenideElement noteTitleField = $x("//textarea[@inputmode='text']");
    private final SelenideElement logOutButton = $x("//a[@id='qa-ACCOUNT_DROPDOWN_LOGOUT']");
    private final SelenideElement allNotesButton = $x("//a[@id='qa-NAV_ALL_NOTES']");
    private final SelenideElement addNewNoteButton = $x("//button[@id='qa-NAVBAR_NOTE_ADD_BUTTON']");
    private final SelenideElement newNoteIframe = $x("//iframe[@id='qa-COMMON_EDITOR_IFRAME']");
    private final SelenideElement logOutConfirmButton = $x("//button[@id='qa-LOGOUT_CONFIRM_DIALOG_CANCEL']");
    private final SelenideElement noteTitleText = $x("//textarea[@inputmode='text']//following-sibling::div");

    public void clickUserInfoButton() {
        userInfo.click();
    }
    public void clickLogOutButton() {
        logOutButton.click();
    }
    public void clickAllNotesButton() {
        allNotesButton.click();
    }
    public void clickAddNewNoteButton() {
        addNewNoteButton.click();
    }
    public void clickLogOutConfirmButton() {
        logOutConfirmButton.click();
    }

    public void userInfoIsPresent() {
        userInfo.shouldBe(Condition.visible);
    }

    public void fillNoteTitleField(String value) {
        Selenide.switchTo().frame(newNoteIframe);
        noteTitleField.sendKeys(value);
        Selenide.switchTo().parentFrame();
    }

    public String getTextOutOfNoteTitle() {
        Selenide.switchTo().frame(newNoteIframe);
        return noteTitleText.getAttribute("textContent");
    }
}
