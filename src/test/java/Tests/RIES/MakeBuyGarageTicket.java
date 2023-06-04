package Tests.RIES;

import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import lib.CoreTestCase;
import lib.ui.RIES.*;
import org.junit.Test;
import lib.ui.factories.AuthPageObjectFactory;
import lib.ui.factories.TicketsPageObjectFactory;

public class MakeBuyGarageTicket extends CoreTestCase {
    private static final String
            login = "130522",
            password = "99679218Aa",
            commentary = "Test commentary for autotest",
            phone_number = "89211111111";


    @Test
    @Features(value = {@Feature(value = "Auth"), @Feature(value = "Tickets")})
    @DisplayName("Making new Buy Garage ticket")
    @Description("Logging, changing to Tickets tab and making new Buy Garage ticket")
    @Step("Starting test 'testMakeTicketBuyGarage'")
    @Severity(value = SeverityLevel.NORMAL)
    public void testMakeTicketBuyGarage() {
        String ticket_title = RandomGenerator.generateRandomTicketName(); // Generate the random ticket name
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.waitForLoginButton();
        Auth.enterLoginData(login, password);
        Auth.clickLOGINButton();
        Auth.waitForLoaderToDisappear();
        Auth.assertIfBlockIsThere();

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number);
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.createCurrentTicket();
        Ticket.pressBack();
        Ticket.assertIfTicketIsCreated(ticket_title);
    }
}