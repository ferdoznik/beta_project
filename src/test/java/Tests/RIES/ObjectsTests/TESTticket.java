package Tests.RIES.ObjectsTests;

import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import lib.CoreTestCase;
import lib.ui.RIES.AuthPageObject;
import lib.ui.RIES.TicketsPageObject;
import org.junit.Test;
import lib.ui.factories.AuthPageObjectFactory;
import lib.ui.factories.TicketsPageObjectFactory;

public class TESTticket extends CoreTestCase {

    private static final String
            login = "",
            password = "";

    @Test
    @Features(value = {@Feature(value = "Auth"), @Feature(value = "Tickets")})
    @DisplayName("Making new Buy Garage ticket")
    @Description("Logging, changing to Tickets tab and making new Buy Garage ticket")
    @Step("Starting test 'testMakeTicketBuyGarage'")
    @Severity(value = SeverityLevel.NORMAL)
    public void testTicket() {
        AuthPageObject Login = AuthPageObjectFactory.get(driver);
        Login.waitForLoginButton();
        Login.enterLoginData(login, password);
        Login.clickLOGINButton();
        Login.waitForLoaderToDisappear();

        TicketsPageObject Tickets = TicketsPageObjectFactory.get(driver);
        Tickets.clickTicketsTab();
        Tickets.openTicketByName("Autotest#1");
        Tickets.createFlatObjectFirstStep();
        Tickets.createFlatObjectSecondStep();
        Tickets.createFlatObjectThirdStep();
        Tickets.checkCreatedObjectParameters();
    }
}
