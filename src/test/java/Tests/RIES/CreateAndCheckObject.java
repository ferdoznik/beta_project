package Tests.RIES;

import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import lib.CoreTestCase;
import lib.Platform;
import lib.ui.RIES.AuthPageObject;
import lib.ui.RIES.MainPageObject;
import lib.ui.RIES.RandomGenerator;
import lib.ui.RIES.TicketsPageObject;
import org.junit.Test;
import lib.ui.factories.AuthPageObjectFactory;
import lib.ui.factories.TicketsPageObjectFactory;

public class CreateAndCheckObject extends CoreTestCase {
    private static final String
            login = "130522",
            password = "99679218Aa",
            phone_number = "89612133383";

    @Test
    @Features(value = {@Feature(value = "Auth"), @Feature(value = "Tickets")})
    @DisplayName("Creating and checking an object")
    @Description("Logging in, navigating to Tickets tab, creating a new ticket, and checking the created object")
    @Step("Starting test 'testCreateAndCheckObject'")
    @Severity(value = SeverityLevel.NORMAL)
    public void testCreateAndCheckObject() {
        String first_name = RandomGenerator.generateRandomTicketName();
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
        Ticket.createNewTicket(phone_number, first_name);

        if (Platform.getInstance().isAndroid()) {
            Main.hideKeyboard();}

        Ticket.createCurrentTicket();
        Ticket.createFlatObjectFirstStep();
        Ticket.createFlatObjectSecondStep();
        Ticket.createFlatObjectThirdStep();
        Ticket.checkCreatedObjectParameters();
    }
}
