package Tests.RIES.ObjectsTests;

import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import lib.CoreTestCase;
import lib.Platform;
import lib.ui.RIES.AuthPageObject;
import lib.ui.RIES.MainPageObject;
import lib.ui.RIES.TicketsPageObject;
import org.junit.Test;
import lib.ui.factories.AuthPageObjectFactory;
import lib.ui.factories.TicketsPageObjectFactory;

public class CreateAndCheckObject extends CoreTestCase {
    private static final String
            login = "",
            password = "",
            phone_number = "",
            first_name = "Autotest#1";

    @Test
    @Features(value = {@Feature(value = "Auth"), @Feature(value = "Tickets")})
    @DisplayName("Making new Buy Garage ticket")
    @Description("Logging, changing to Tickets tab and making new Buy Garage ticket")
    @Step("Starting test 'testMakeTicketBuyGarage'")
    @Severity(value = SeverityLevel.NORMAL)
    public void testCreateAndCheckObject(){
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        Auth.waitForLoginButton();
        Auth.enterLoginData(login, password);
        Auth.clickLOGINButton();
        Auth.waitForLoaderToDisappear();
        Auth.assertIfBlockIsThere();

        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.createNewTicket(phone_number, first_name);
        if (Platform.getInstance().isAndroid()){
        MainPageObject Main = new MainPageObject(driver);
        Main.hideKeyboard();}
        Ticket.createCurrentTicket();
        Ticket.createFlatObjectFirstStep();
        Ticket.createFlatObjectSecondStep();
        Ticket.createFlatObjectThirdStep();
        Ticket.checkCreatedObjectParameters();
    }
}
