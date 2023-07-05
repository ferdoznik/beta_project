package Tests.RIES.ObjectsTests;

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
            login = "",
            password = "",
            price = "",
            object_code = "9333317";

    @Test
    @Features(value = {@Feature(value = "Auth"), @Feature(value = "Objects")})
    @DisplayName("Check if Object's parameters are correct")
    @Description("Searching object by Code, opening Object card and checking if parameters are visible and correct")
    @Step("Starting test 'testCheckObjectsParams'")
    @Severity(value = SeverityLevel.NORMAL)
    public void testCheckObjectsParams() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        Auth.waitForLoginButton();
        Auth.enterLoginData(login, password);
        Auth.clickLOGINButton();
        Auth.waitForLoaderToDisappear();
        Auth.assertIfBlockIsThere();

        ObjectsPageObject Objets = ObjectsPageObjectFactory.get(driver);
        Objets.enterObjectCode(object_code);
        MainPageObject Main = new MainPageObject(driver);
        Main.hideKeyboard();
        if (Platform.getInstance().isIOS()){Objets.tapMyObjects();}
        Objets.clickSearchObjects();
        if (Platform.getInstance().isAndroid()){
        Objets.clickPopupAccept();
        Objets.openObjectCardByPrice(price);
        Main.waitForFreeSecond();
        }else{Objets.tapFirstObjectInTheList();}
        Objets.assertIfAllParametersPresent();
        Objets.backToSearchHistory();
        if (Platform.getInstance().isAndroid()){
        Objets.openHistoryStoryByObjectCode(object_code);
        }else{Objets.tapFirstHistorySearchObjectInTheList();}
        Objets.clickShowHistorySearchObjects();
        if (Platform.getInstance().isAndroid()){
        Objets.openObjectCardByPrice(price);
        }else{Objets.tapFirstObjectInTheList();}
        Objets.assertIfAllParametersPresent();
    }
}
