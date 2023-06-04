package Tests.RIES;

import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import lib.CoreTestCase;
import lib.Platform;
import lib.ui.RIES.AuthPageObject;
import lib.ui.RIES.MainPageObject;
import lib.ui.RIES.RandomGenerator;
import lib.ui.RIES.TicketsPageObject;
import lib.ui.factories.AuthPageObjectFactory;
import lib.ui.factories.TicketsPageObjectFactory;
import org.junit.Test;

public class CreateMortgageTicket extends CoreTestCase {
    private static final String
            login = "130522",
            password = "99679218Aa",
            phone_number = "89612133383";
    @Test
    @Features(value = {@Feature(value = "Auth"), @Feature(value = "Tickets")})
    @DisplayName("Making new Mortgage ticket")
    @Description("Logging, changing to Tickets tab, making new ticker and making new Mortgage ticket inside")
    @Step("Starting test 'testCreateMortgageTicket'")
    @Severity(value = SeverityLevel.NORMAL)
    public void testCreateMortgageTicket() {
        String first_name = RandomGenerator.generateRandomTicketName(); // Generate the random ticket name by current date and time
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
        if (Platform.getInstance().isAndroid()) {
            Main.hideKeyboard();
        } else {
            Main.tapByCoordinates(1, 150);
        }
        if (Platform.getInstance().isAndroid()) {
            Ticket.swipeTillCommentsField();
            Ticket.openTicketTypeModal();
            Main.hideKeyboard();
        } else {
            Ticket.tapTicketTypeModal();
        }
        Main.hideKeyboard();
        Ticket.changeTicketTypeToBuyGarage();
        Ticket.createCurrentTicket();

        Ticket.goToInnerTicketsScreen();
        Ticket.pressCreateInnerTicketButton();
        Ticket.chooseMortgageType();
        Ticket.fillInMortgageParameters();
        Ticket.pressCreateMortgageTicketButton();
        if(Platform.getInstance().isAndroid())
            {Ticket.assertIfMortgageTicketCreated();}
    }
}
