package Tests;

import app.lib.CoreTestCase;
import app.lib.Platform;
import app.lib.ui.RIES.AuthPageObject;
import app.lib.ui.RIES.InnerTicketsPageObject;
import app.lib.ui.factories.AuthPageObjectFactory;
import app.lib.ui.factories.InnerTicketsPageObjectFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import static app.lib.api.ApiMethods_v2.ticket.TicketsMethods.ticketIdBue;

public class OutTkTests extends CoreTestCase{

    private static final String
            login = "",
            password = "";

    @Step("Creating refinance inner ticket")
    @Test
    public void testCreateRefinanceInnerTicket() throws JsonProcessingException, InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        InnerTicketsPageObject Inner = InnerTicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);

        Inner.createNewTicketByNameAndType("TestMortgageBuy","Купить");
        Inner.findAndOpenTicketByID(ticketIdBue);

        Inner.clickInnerTicket();
        Inner.clickInnerTicketButton();
        Inner.chooseInnerTicketByType("Ипотека");
        Inner.fillingOwnMoney("2 500 000");
        Inner.fillingEstatePrice("5 500 001");
//        Inner.chooseUrgencyReason("Да, другая причина");
        Inner.clickInnerTicketButton();
        Inner.assertIfMortgageInnerTicketCreated();
    }
}
