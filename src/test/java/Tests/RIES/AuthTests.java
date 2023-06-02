package Tests.RIES;

import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import lib.CoreTestCase;
import lib.ui.RIES.AuthPageObject;
import org.junit.Test;
import lib.ui.factories.AuthPageObjectFactory;

public class AuthTests extends CoreTestCase {

    private static final String
            login = "130522",
            password = "99679218Aa";
    @Test
    @Features(value = {@Feature(value = "Auth")})
    @DisplayName("Authorization with 130522 account")
    @Description("Logging in with the 130522 account using login and password")
    @Step("Starting test 'testLogin18858'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testAuth130522() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);

        Auth.waitForLoginButton();
        Auth.enterLoginData(login, password);
        Auth.clickLOGINButton();
        Auth.waitForLoaderToDisappear();
        Auth.assertIfBlockIsThere();
    }
}
