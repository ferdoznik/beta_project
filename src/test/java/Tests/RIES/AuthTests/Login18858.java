package Tests.RIES.AuthTests;

import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import lib.CoreTestCase;
import lib.ui.RIES.AuthPageObject;
import org.junit.Test;
import lib.ui.factories.AuthPageObjectFactory;

public class Login18858 extends CoreTestCase
{
    @Test
    @Features(value = {@Feature(value = "Auth")})
    @DisplayName("Authorization with 18858 account")
    @Description("Logging in with Login and password 18858 account")
    @Step("Starting test 'testLogin18858'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testLogin18858()
    {
        AuthPageObject Login = AuthPageObjectFactory.get(driver);
        Login.waitForLoginButton();
        Login.enterRIESLogin();
        Login.enterRIESPassword();
        Login.clickLOGINButton();
        Login.waitForLoaderToDisappear();
        Login.assertIfBlockIsThere();
    }
}
