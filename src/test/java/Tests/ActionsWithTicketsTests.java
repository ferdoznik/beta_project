package Tests;

import app.lib.CoreTestCase;
import app.lib.Platform;
import app.lib.api.ApiMethods.ticket.TicketsMethods;
import app.lib.helpers.DatePickerFormatter;
import app.lib.ui.RIES.AuthPageObject;
import app.lib.ui.RIES.TicketsPageObject;
import app.lib.ui.factories.AuthPageObjectFactory;
import app.lib.ui.factories.TicketsPageObjectFactory;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Features(value = {@Feature(value = "Actions with tickets")})
public class ActionsWithTicketsTests extends CoreTestCase {

    private static final String
            login = "130522",
            password = "99679218Aa",
            targetDate = DatePickerFormatter.formatTomorrowDate();

    @Test
    @DisplayName("Postpone active ticket")
    @Description("Postponing active ticket via ticket action menu")
    @Step("Starting test ID 9411 'testPostponeActiveTicket'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testPostponeActiveTicket() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);

        Ticket.waitForTicketCard();
        Ticket.openTicketActionMenu();
        Ticket.clickPostponeActionTicketButton();
        Ticket.clickPostponeToDateFiled();
        Ticket.setPostponeToDate(targetDate);
        Ticket.choosePostponeReason();
        Ticket.clickPostponeButton();
        Ticket.assertIfTicketIsPostponed();
    }

    @Test
    @DisplayName("Restore Postponed ticket")
    @Description("Restoring the postponed ticket via ticket action menu")
    @Step("Starting test ID 9417 'restorePostponedTicket'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testRestorePostponedTicket() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);

        Ticket.waitForTicketCard();
        Ticket.openTicketActionMenu();
        Ticket.clickPostponeActionTicketButton();
        Ticket.clickPostponeToDateFiled();
        Ticket.setPostponeToDate(targetDate);
        Ticket.choosePostponeReason();
        Ticket.clickPostponeButton();
        Ticket.clickInWorkButton();
        Ticket.assertIfTicketIsRestored();
    }

    @Test
    @DisplayName("Cancel active ticket")
    @Description("Canceling active ticket via ticket action menu")
    @Step("Starting test ID 9427 'cancelActiveTicket'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCancelActiveTicket() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);

        Ticket.waitForTicketCard();
        Ticket.openTicketActionMenu();
        Ticket.clickCancelActionTicketButton();
        Ticket.chooseCancelReason("Дубль");
        Ticket.clickCancelButton();
        Ticket.assertIfTicketIsCanceled();
    }

    @Test
    @DisplayName("Restoring canceled ticket")
    @Description("Restoring canceled ticket via ticket action menu")
    @Step("Starting test ID 9434 'restoreCanceledTicket'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testRestoreCanceledTicket() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);



        Ticket.waitForTicketCard();
        Ticket.openTicketActionMenu();
        Ticket.clickCancelActionTicketButton();
        Ticket.chooseCancelReason("Дубль");
        Ticket.clickCancelButton();
        Ticket.findCanceledTicket(ticketID);
        Ticket.openCanceledTicket(ticketID);
        Ticket.restoreCanceledTicket();
        Ticket.assertIfTicketIsRestored();
    }

    @Test
    @DisplayName("Check ticket contacts ")
    @Description("Checking ticket contacts via ticket Contacts menu")
    @Step("Starting test ID 9432 'testCheckTicketParameters'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCheckTicketParameters() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);

        Ticket.waitForTicketCard();
        Ticket.clickClientContactsMenu();
        Ticket.assertIfContactsPresent();
    }

    @Test
    @DisplayName("Change ticket source")
    @Description("Checking ticket source via Ticket source filter")
    @Step("Starting test ID 9432 'testChangeTicketSource'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testChangeTicketSource() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);

        Ticket.waitForTicketCard();
        Ticket.clickTicketSourceFilter();
        Ticket.changeTicketSource("vk.com");
        if (Platform.getInstance().isAndroid()){
            Ticket.checkSourceChangedSnackBar();}
        Ticket.assertIfTicketSourceChanged("vk.com");
    }

    @Test
    @DisplayName("Transfer the ticket")
    @Description("Updating the ticket's assignee via Ticket action menu")
    @Step("Starting test ID 9418 'testTransferTicket'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testTransferTicket() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);

        Ticket.waitForTicketCard();
        Ticket.openTicketActionMenu();
        Ticket.clickTransferTicketButton();
        Ticket.changeTransferTicketType(
                "Изменить ответственного",
                "1",
                "По договоренности");
        Ticket.chooseNewAssignee("Рагозин Антон");
        Ticket.clickTransferButton();
        Ticket.checkTicketTransferredSnackBar();
        Ticket.assertIfTicketTransferred(ticketID);
    }

    @Test
    @DisplayName("Transfer the ticket changing assignee")
    @Description("Updating the ticket's assignee with percentage via Ticket action menu")
    @Step("Starting test ID 9424 'testUpdatingAssigneeWithInterest'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testUpdatingAssigneeWithPercentage() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);

        Ticket.waitForTicketCard();
        Ticket.openTicketActionMenu();
        Ticket.clickTransferTicketButton();
        if (Platform.getInstance().isIOS()){
            Ticket.changeTransferTicketType(
                    "Другому риэлтору под процент",
                    "50",
                    "Сложная заявка");
        } else {
            Ticket.changeTransferTicketType(
                    "Другому риелтору под процент",
                    "50",
                    "Сложная заявка");
        }
        Ticket.chooseNewAssignee("Рагозин Антон");
        Ticket.clickTransferButton();
        Ticket.checkTicketTransferredSnackBar();
        Ticket.assertIfTicketTransferred(ticketID);
    }

    @Test
    @DisplayName("Transfer the ticket due to vacation")
    @Description("Updating the ticket's assignee during the vacation period via the Ticket action menu.")
    @Step("Starting test ID 9426 'testTransferTicketForVacation'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testTransferTicketForVacation() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);

        Ticket.waitForTicketCard();
        Ticket.openTicketActionMenu();
        Ticket.clickTransferTicketButton();
        Ticket.changeTransferTicketType(
                "На время отпуска/больничного",
                "1",
                "По желанию реилтора");
        Ticket.chooseNewAssignee("Рагозин Антон");
        Ticket.clickTransferButton();
        Ticket.checkTicketTransferredSnackBar();
        Ticket.assertIfTicketTransferred(ticketID);
    }

    @Test
    @DisplayName("Transfer the ticket due to vacation")
    @Description("Updating the ticket's assignee with 0 percentage via Ticket action menu")
    @Step("Starting test ID 9708 'testTransferTicket'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testUpdatingAssigneeWithZeroPercentage() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);

        Ticket.waitForTicketCard();
        Ticket.openTicketActionMenu();
        Ticket.clickTransferTicketButton();
        Ticket.changeTransferTicketType(
                "На время отпуска/больничного",
                "0",
                "Сложная заявка");
        Ticket.chooseNewAssignee("Рагозин Антон");
        Ticket.clickTransferButton();
        Ticket.checkTicketTransferredSnackBar();
        Ticket.assertIfTicketTransferred(ticketID);
    }
}
