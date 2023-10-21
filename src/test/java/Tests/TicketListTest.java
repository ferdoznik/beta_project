package Tests;

import app.lib.api.ApiMethods.ticket.TicketsMethods;
import app.lib.CoreTestCase;
import app.lib.ui.RIES.AuthPageObject;
import app.lib.ui.RIES.TicketsPageObject;
import app.lib.ui.factories.AuthPageObjectFactory;
import app.lib.ui.factories.TicketsPageObjectFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Features(value = {@Feature(value = "Tickets list")})
public class TicketListTest extends CoreTestCase {

    private static final String
            login = "130522",
            password = "99679218Aa";

    @Test
    @DisplayName("Find ticket by ticket ID")
    @Description("Finding ticket via tickets tab search bar by ID")
    @Step("Starting test ID 9408 'testSearchTicketById'")
    @Severity(value = SeverityLevel.NORMAL)
    public void testSearchTicketById(){
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
        String ticketID = TicketsMethods.CreateTicket();

        Auth.authorizationRIES(login, password);

        Ticket.clickTicketsTab();
        Ticket.findTicketByID(ticketID);
        Ticket.openTicketByID(ticketID);
        Ticket.assertIfTicketTitleVisible();
    }

    @Test
    @DisplayName("Find ticket by client name")
    @Description("Finding ticket via tickets tab search bar by client name")
    @Step("Starting test ID 9409 'testSearchTicketByName'")
    @Severity(value = SeverityLevel.NORMAL)
    public void testSearchTicketByName(){
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
        String ticketID = TicketsMethods.CreateTicket();

        Auth.authorizationRIES(login, password);

        Ticket.clickTicketsTab();
        Ticket.findTicketByClientName("UI Tests");
        Ticket.openTicketByName("UI Tests");
        Ticket.assertIfTicketTitleVisible();
    }

    @Test
    @DisplayName("Find ticket by client phone number")
    @Description("Finding ticket via tickets tab search bar by phone number")
    @Step("Starting test ID 9410 'testSearchTicketByPhoneNumber'")
    @Severity(value = SeverityLevel.NORMAL)
    public void testSearchTicketByPhoneNumber(){
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
        String ticketID = TicketsMethods.CreateTicket();

        Auth.authorizationRIES(login, password);

        Ticket.clickTicketsTab();
        Ticket.findTicketByClientPhoneNumber("+7 961 213-33-83");
        Ticket.openTicketByName("UI Tests");
        Ticket.clickClientContactsMenu();
        Ticket.assertIfContactsPresent();
    }

    @Test
    @Story("Работает только на Андройд")
    @DisplayName("Ticket list pagination")
    @Description("Checking if ticket list is updating via pagination")
    @Step("Starting test ID 9558 'testTicketListPagination'")
    @Severity(value = SeverityLevel.NORMAL)
    public void testTicketListPagination() throws JsonProcessingException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);

        Ticket.create51Tickets();
        Ticket.clickTicketsTab();
        Ticket.checkTicketWithNamePresent("UI50");
        Ticket.swipeToFirstTicketName("UI0");
        Ticket.assertIfTicketWithNamePresent("UI0");
    }

    @Test
    @DisplayName("Check if new ticket present after refresh")
    @Description("Checking if new ticket present after refreshing ticket list")
    @Step("Starting test ID 9560 'testTicketListRefresh'")
    @Severity(value = SeverityLevel.NORMAL)
    public void testTicketListRefresh() throws JsonProcessingException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);

        Ticket.createTicketByNameAndType("UIFirst","Продать");
        Ticket.clickTicketsTab();
        Ticket.checkTicketWithNamePresent("UIFirst");
        Ticket.createTicketByNameAndType("UISecond","Продать");
        Ticket.swipeForPagination();
        Ticket.checkTicketWithNamePresent("UISecond");
        Ticket.assertIfTicketWithNamePresent("UISecond");
    }

    @Test
    @DisplayName("Check tickets filtered by type Sell")
    @Description("Checking if ticket with type Sell present in tab Sell")
    @Step("Starting test ID 9554 'testCheckTicketByTicketTypeSell'")
    @Severity(value = SeverityLevel.NORMAL)
    public void testCheckTicketByTicketTypeSell() throws JsonProcessingException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);

        Ticket.createTicketByNameAndType("UISell","Продать");
        Ticket.clickTicketsTab();
        Ticket.checkTicketWithNamePresent("UISell");
        Ticket.assertIfTicketWithNameAndTypePresent("UISell","Продать");
    }

    @Test
    @DisplayName("Check tickets filtered by type Buy")
    @Description("Checking if ticket with type Buy present in tab Buy")
    @Step("Starting test ID 9767 'testCheckTicketByTicketTypeBuy'")
    @Severity(value = SeverityLevel.NORMAL)
    public void testCheckTicketByTicketTypeBuy() throws JsonProcessingException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);

        Ticket.createTicketByNameAndType("UIBuy","Купить");
        Ticket.clickTicketsTab();
        Ticket.checkTicketWithNamePresent("UIBuy");
        Ticket.assertIfTicketWithNameAndTypePresent("UIBuy","Купить");
    }

    @Test
    @DisplayName("Check tickets filtered by type Lease")
    @Description("Checking if ticket with type Lease present in tab Lease")
    @Step("Starting test ID 9768 'testCheckTicketByTicketTypeLease'")
    @Severity(value = SeverityLevel.NORMAL)
    public void testCheckTicketByTicketTypeLease() throws JsonProcessingException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);

        Ticket.createTicketByNameAndType("UILease","Сдать");
        Ticket.clickTicketsTab();
        Ticket.checkTicketWithNamePresent("UILease");
        Ticket.assertIfTicketWithNameAndTypePresent("UILease","Сдать");
    }

    @Test
    @DisplayName("Check tickets filtered by type Rent")
    @Description("Checking if ticket with type Rent present in tab Rent")
    @Step("Starting test ID 9769 'testCheckTicketByTicketTypeRent'")
    @Severity(value = SeverityLevel.NORMAL)
    public void testCheckTicketByTicketTypeRent() throws JsonProcessingException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);

        Ticket.createTicketByNameAndType("UIRent","Снять");
        Ticket.clickTicketsTab();
        Ticket.checkTicketWithNamePresent("UIRent");
        Ticket.assertIfTicketWithNameAndTypePresent("UIRent","Снять");
    }

//    @Test
//    @DisplayName("Find ticket by ticket ID")
//    @Description("Finding ticket via tickets tab search bar by ID")
//    @Step("Starting test ID 9408 'testSearchTicketById'")
//    @Severity(value = SeverityLevel.NORMAL)
//    public void testSearchTicketById(){
//        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
//        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//
//        Auth.authorizationRIES(login, password);
//        String ticketID = TicketsMethods.CreateTicket();
//        Ticket.createAndFindTicketByID(ticketID);
//        Ticket.assertTicketTitleVisible();
//    }
//
//    @Test
//    @DisplayName("Find ticket by ticket ID")
//    @Description("Finding ticket via tickets tab search bar by ID")
//    @Step("Starting test ID 9408 'testSearchTicketById'")
//    @Severity(value = SeverityLevel.NORMAL)
//    public void testSearchTicketById(){
//        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
//        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//
//        Auth.authorizationRIES(login, password);
//        String ticketID = TicketsMethods.CreateTicket();
//        Ticket.createAndFindTicketByID(ticketID);
//        Ticket.assertTicketTitleVisible();
//    }
}
