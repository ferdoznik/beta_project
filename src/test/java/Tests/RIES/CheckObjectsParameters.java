package Tests.RIES;

import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import lib.CoreTestCase;
import lib.Platform;
import lib.ui.RIES.AuthPageObject;
import lib.ui.RIES.MainPageObject;
import lib.ui.RIES.ObjectsPageObject;
import org.junit.Test;
import lib.ui.factories.AuthPageObjectFactory;
import lib.ui.factories.ObjectsPageObjectFactory;

public class CheckObjectsParameters extends CoreTestCase {
    private static final String
            login = "130522",
            password = "99679218Aa",
            price = "2 000",
            object_code = "10046705",
            object_code_prod = "9333317";

    @Test
    @Features(value = {@Feature(value = "Auth"), @Feature(value = "Objects")})
    @DisplayName("Checking if Object's parameters are correct")
    @Description("Searching for an object by Code, opening the Object card, and checking if the parameters are visible and correct")
    @Step("Starting test 'testCheckObjectsParams'")
    @Severity(value = SeverityLevel.NORMAL)
    public void testCheckObjectsParams() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        ObjectsPageObject Objects = ObjectsPageObjectFactory.get(driver);

        Auth.waitForLoginButton();
        Auth.enterLoginData(login, password);
        Auth.clickLOGINButton();
        Auth.waitForLoaderToDisappear();
        Auth.assertIfBlockIsThere();

        if (Platform.getInstance().isAndroid()) {
            Objects.enterObjectCode(object_code_prod);
        } else {
            Objects.enterObjectCode(object_code);
        }
        Main.hideKeyboard();
        if (Platform.getInstance().isIOS()) {
            Objects.tapMyObjects();
        }
        Objects.clickSearchObjects();
        if (Platform.getInstance().isAndroid()) {
            Objects.clickPopupAccept();
            Objects.openObjectCardByPrice(price);
        } else {
            Main.waitForTwoSecond();
            Objects.tapFirstObjectInTheList();
        }
        Objects.assertIfAllParametersPresent();
        Objects.backToSearchHistory();
        Objects.openHistoryStoryByObjectCode(object_code);
        Objects.clickShowHistorySearchObjects();
        if (Platform.getInstance().isAndroid()) {
            Objects.openObjectCardByPrice(price);
        } else {
            Main.waitForTwoSecond();
            Objects.tapFirstObjectInTheList();
        }
        Objects.assertIfAllParametersPresent();
    }
}
