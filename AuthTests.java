package app.RIES.Tests;

import app.RIES.lib.CoreTestCase;
import app.RIES.lib.Platform;
import app.RIES.lib.ui.RIES.AuthPageObject;
import app.RIES.lib.ui.RIES.MainPageObject;
import app.RIES.lib.ui.factories.AuthPageObjectFactory;
import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

public class AuthTests extends CoreTestCase {

    private static final String
            login = "130522",
            password = "99679218Aa";

    @Test
    @Features(value = {@Feature(value = "Auth")})
    @DisplayName("ID 7950 Authorization with active 130522 account")
    @Description("Logging in with the 130522 account using login and password")
    @Step("Starting test 'testActiveAccount'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testActiveAccount() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);

        Auth.waitForLoginButton();
        Auth.enterLoginData(login, password);
        Auth.clickLOGINButton();
        Auth.waitForLoaderToDisappear();
        Auth.assertIfBlockIsThere();
    }

    @Test
    @DisplayName("ID 7952 Authorization with the incorrect login")
    @Description("Logging in using the incorrect login and correct password")
    @Step("Starting test 'testIncorrectLogin'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testIncorrectLogin() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);

        Auth.waitForLoginButton();
        Auth.enterLoginData("130522incorrect", password);
        Auth.clickLOGINButton();
        Auth.waitForLoaderToDisappear();
        Auth.assertIfSnackBarIsThere();
    }

    @Test
    @DisplayName("ID 7953 Authorization with the incorrect password")
    @Description("Logging in using the correct login and incorrect password")
    @Step("Starting test 'testIncorrectPassword'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testIncorrectPassword() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);

        Auth.waitForLoginButton();
        Auth.enterLoginData(login, "99679218incorrect");
        Auth.clickLOGINButton();
        //Нужно убрать clickable слой с экрана авторизации в айос
        Auth.assertIfSnackBarIsThere();
    }

    @Test
    @DisplayName("ID 7954 Entering an incorrect password three times")
    @Description("Attempting to log in three times using the correct login and an incorrect password")
    @Step("Starting test 'testIncorrectPasswordThreeTimes'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testIncorrectPasswordThreeTimes() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);

        Auth.waitForLoginButton();
        Auth.enterLoginData(login, "99679218incorrect");
        Auth.clickLOGINButton();
        if(Platform.getInstance().isAndroid()){Thread.sleep(2000);}
        Auth.clickLOGINButton();
        if(Platform.getInstance().isAndroid()){Thread.sleep(2000);}
        Auth.clickLOGINButton();
        Auth.waitForLoaderToDisappear();
        Auth.assertIfUserBlocked();
    }

    @Test
    @DisplayName("ID 7951 Authorization with the blocked account")
    @Description("Logging in using the blocked account's login and password")
    @Step("Starting test 'testBlockedAccount'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testBlockedAccount() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);

        Auth.waitForLoginButton();
        Auth.enterLoginData(login, password);
        Auth.clickLOGINButton();
        Auth.waitForLoaderToDisappear();
        Auth.assertIfUserBlocked();
        //Добавить запрос на разблокировку
    }

    @Test
    @DisplayName("ID 7955 Blocking the application while authorization")
    @Description("Blocking the application after entering login and password information")
    @Step("Starting test 'testBackgroundAfterFillingFields'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testBackgroundAfterFillingFields() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);

        Auth.waitForLoginButton();
        Auth.enterLoginData(login, password);
        Auth.setAppToBackground(3);
        Auth.clickLOGINButton();
        Auth.waitForLoaderToDisappear();
        Auth.assertIfBlockIsThere();
    }

    @Test
    @DisplayName("ID 7956 Losing signal during the authorization process")
    @Description("Losing signal after entering login and password information")
    @Step("Starting test 'testNoSignalAfterFillingFields'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testNoSignalAfterFillingFields() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);

        Auth.waitForLoginButton();
        Auth.enterLoginData(login, password);
        // Turn on the internet connection
        Main.disableWifi();
        System.out.println("Internet turned off.");
        // Wait for 5 seconds to see the effect of lost internet
        Thread.sleep(5000);
        // Turn on the internet connection
        Main.enableWifi();
        System.out.println("Internet turned on.");
        // Wait for 5 seconds until the connection is restored
        Thread.sleep(5000);
        Auth.clickLOGINButton();
        Auth.waitForLoaderToDisappear();
        Auth.assertIfBlockIsThere();
    }

    @Test
    @DisplayName("ID 7957 Authorization with space in login")
    @Description("Logging in with space in login and correct password")
    @Step("Starting test 'testSpaceInLogin'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testSpaceInLogin() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);

        Auth.waitForLoginButton();
        Auth.enterLoginData("13 0522", password);
        Auth.clickLOGINButton();
        Auth.waitForLoaderToDisappear();
        Auth.assertIfBlockIsThere();
    }

    @Test
    @DisplayName("ID 7959 Authorization with Cyrillic in the login")
    @Description("Logging in using a login that contains Cyrillic characters and the correct password")
    @Step("Starting test 'testCyrillicInLogin'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCyrillicInLogin() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);

        Auth.waitForLoginButton();
        Auth.enterLoginData("130522ы", password);
        Auth.clickLOGINButton();
        Auth.waitForLoaderToDisappear();
        Auth.assertIfBlockIsThere();
    }

//    Пока не придумал как
//    @Test
//    @DisplayName("ID 7958 Entering the password from the clipboard")
//    @Description("Logging in using the correct login and password copied from the clipboard.")
//    @Step("Starting test 'testInsertPasswordFromClipboard'")
//    @Severity(value = SeverityLevel.CRITICAL)
//    public void testInsertPasswordFromClipboard() {
//        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
//
//        Auth.waitForLoginButton();
//        Auth.enterLoginData(login, password);
//        Auth.clickLOGINButton();
//        Auth.waitForLoaderToDisappear();
//        Auth.assertIfBlockIsThere();
//    }

}
