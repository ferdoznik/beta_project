package lib.ui.RIES;

import io.qameta.allure.Step;
import lib.Platform;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AuthPageObject extends MainPageObject {

    protected static String
            LOGIN_FIELD,
            PASSWORD_FILED,
            RIES_LOGO,
            EDIT_LOGIN_FIELD,
            EDIT_PASSWORD_FIELD,
            MY_OBJECTS_SWITCHER,
            LOADER,
            NOTIFICATION_DIALOGUE_ALLOW,
            NOTIFICATION_DIALOGUE_FOLLOW_ACTIVITY_ACCEPT,
            TITLE_SEARCH_IN_TOPBAR,
            SYNC_CATALOGS_SCREEN,
            LOGIN_BUTTON;

    public AuthPageObject(RemoteWebDriver driver){
        super(driver);
    }

    @Step("Skipping IOS dialogs and waiting for login button")
    public void waitForRIESLogoDissapear() {
        this.waitForElementNotPresent(RIES_LOGO, "Logo is still there", 5);
    }


    @Step("Skipping IOS security dialogues and waiting for login button")
    public void waitForLoginButton() {
            this.waitForElementPresent(LOGIN_BUTTON, "Cannot see Login button", 15);
    }

    @Step("Entering login")
    public void enterRIESLogin() {
        this.waitForElementPresent(LOGIN_FIELD, "Cannot find search input after clicking search init element");
        this.waitForElementAndClick(LOGIN_FIELD, "Cannot find and click search init element", 2);
        this.waitForElementAndSendKeys(EDIT_LOGIN_FIELD, "18858", "Cannot see and send login", 5);
    }

    @Step("Entering password")
    public void enterRIESPassword() {
        this.waitForElementPresent(PASSWORD_FILED, "Cannot find search input after clicking search init element");
        this.waitForElementAndClick(PASSWORD_FILED, "Cannot find and click search init element", 3);
        this.waitForElementPresent(EDIT_PASSWORD_FIELD, "Cannot find search input after clicking search init element");
        this.waitForElementAndSendKeys(EDIT_PASSWORD_FIELD, "Test20231", "Cannot see and send login", 3);
    }

    @Step("Clicking Log in button")
    public void clickLOGINButton() {
        this.waitForElementAndClick(LOGIN_BUTTON, "Cannot find and click LOGIN button", 5);
        this.waitForElementNotPresent(LOADER, "Can see Loader", 5);
    }

    @Step("Waiting for loader to disappear")
    public void waitForLoaderToDisappear() {
        this.waitForElementNotPresent(LOADER, "Can see Loader", 10);
        if (Platform.getInstance().isIOS()){
        this.waitForElementNotPresent(SYNC_CATALOGS_SCREEN, "Synchronization is still going", 5);}
    }

    @Step("Checking if it's screen correct screen")
    public void assertIfBlockIsThere() {
        if (Platform.getInstance().isIOS()){this.waitForElementPresent(TITLE_SEARCH_IN_TOPBAR, "Cannot see the title Search in the top-bar",10);
        }else{
        this.assertElementIsPresent(MY_OBJECTS_SWITCHER, "Cannot find My objects");}
    }

    @Step("Entering Login and password")
    public void enterLoginData(String login, String password) {
        this.waitForElementPresent(LOGIN_FIELD, "Cannot find search input after clicking search init element");
        this.waitForElementAndClick(LOGIN_FIELD, "Cannot find and click search init element", 2);
        this.waitForElementAndSendKeys(EDIT_LOGIN_FIELD, login, "Cannot find and put Login", 5);
        this.waitForElementPresent(PASSWORD_FILED, "Cannot find search input after clicking search init element");
        this.waitForElementAndClick(PASSWORD_FILED, "Cannot find and click search init element", 2);
        this.waitForElementAndSendKeys(EDIT_PASSWORD_FIELD, password, "Cannot find and put password", 5);
    }
}
