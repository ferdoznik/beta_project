package Tests.RIES.TicketsTests;

import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import lib.CoreTestCase;
import lib.Platform;
import lib.ui.RIES.*;
import org.junit.Test;
import lib.ui.factories.AuthPageObjectFactory;
import lib.ui.factories.TicketsPageObjectFactory;
import org.openqa.selenium.Capabilities;

public class MakeBuyGarageTicket extends CoreTestCase
{
    private static final String
            login = "",
            password = "",
            phone_number = "";


    @Test
    @Features(value = {@Feature(value = "Auth"), @Feature(value = "Tickets")})
    @DisplayName("Making new Buy Garage ticket")
    @Description("Logging, changing to Tickets tab and making new Buy Garage ticket")
    @Step("Starting test 'testMakeTicketBuyGarage'")
    @Severity(value = SeverityLevel.NORMAL)
    public void testMakeTicketBuyGarage(){
        RandomGenerator randomTicket = new RandomGenerator();
        String first_name = randomTicket.generateRandomTicketName(); // Generate the random ticket name
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        Auth.waitForLoginButton();
        Auth.enterLoginData(login, password);
        Auth.clickLOGINButton();
        Auth.waitForLoaderToDisappear();
        Auth.assertIfBlockIsThere();

        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.initializeCreatingNewTicket(phone_number, first_name);
        MainPageObject Main = new MainPageObject(driver);
        Main.hideKeyboard();
        if (Platform.getInstance().isAndroid()){Ticket.swipeTillCommentsField();}
        Ticket.openTicketTypeModal();
        Main.hideKeyboard();
        Ticket.changeTicketTypeToBuyGarage();
        Ticket.createCurrentTicket();
        Ticket.assertIfTicketIsCreated(first_name);
    }
}
