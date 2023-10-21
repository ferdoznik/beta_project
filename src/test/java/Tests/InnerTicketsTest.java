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

import static app.lib.api.ApiMethods_v2.ticket.TicketsMethods.ticketIdBue;


@Features(value = {@Feature(value = "Inner tickets")})
public class InnerTicketsTest extends CoreTestCase {

    private static final String
            login = "130522",
            password = "99679218Aa";

    @Test
    @DisplayName("Creating a mortgage ticket")
    @Description("Creating a mortgage inner ticket from a buy")
    @Step("Starting test 'ID 7995 testCreateMortgageTicketForBuy'")
    @Severity(value = SeverityLevel.NORMAL)
    public void testCreateMortgageTicketForBuy() throws JsonProcessingException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        InnerTicketsPageObject Inner = InnerTicketsPageObjectFactory.get(driver);

        //Authorization
        Auth.authorizationRIES(login, password);
        //Create ticket via API method and open its card
        Inner.createNewTicketByNameAndType("TestMortgageBuy","Купить");
        Inner.findAndOpenTicketByID(ticketIdBue);
        Inner.clickInnerTicket();
        Inner.clickInnerTicketButton();
        Inner.chooseInnerTicketByType("Ипотека");
        Inner.fillingOwnMoney("9876543210");
        Inner.fillingEstatePrice("10234567890");
        Inner.chooseUrgencyReason("Да, покупатель участвует в цепочке сделок");
        if (Platform.getInstance().isIOS()) {
            Inner.chooseMortgageBroker("Дубовая Виктория Андреевна");
        }
        Inner.fillingCommentField("Мой комментарий к заявке на ипотеку");
        Inner.clickCreateInnerTicketButton();
        Inner.assertIfCreateMortgageTicketForBuy("Дубовая Виктория Андреевна");
    }

    @Test
    @DisplayName("Creating a mortgage ticket")
    @Description("Creating a mortgage inner ticket from a sell")
    @Step("Starting test 'ID 7996 testCreateMortgageTicketForSell'")
    @Severity(value = SeverityLevel.NORMAL)
    public void testCreateMortgageTicketForSell() throws JsonProcessingException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        InnerTicketsPageObject Inner = InnerTicketsPageObjectFactory.get(driver);

        //Authorization
        Auth.authorizationRIES(login, password);
        //Create ticket via API method and open its card
        Inner.createNewTicketByNameAndType("TestMortgageSell","Продать");
        Inner.findAndOpenTicketByID(ticketIdBue);
        Inner.clickInnerTicket();
        Inner.clickInnerTicketButton();
        Inner.assertMortgageTicketForSell("Ипотека");
    }

    @Test
    @DisplayName("Creating a mortgage ticket")
    @Description("Creating a mortgage inner ticket double")
    @Step("Starting test 'ID 7997 testCreateMortgageTicketDouble'")
    @Severity(value = SeverityLevel.NORMAL)
    public void testCreatedMortgageTicketDouble() throws JsonProcessingException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        InnerTicketsPageObject Inner = InnerTicketsPageObjectFactory.get(driver);

        //Authorization
        Auth.authorizationRIES(login, password);
        //Create ticket via API method and open its card
        Inner.createNewTicketByNameAndType("TestMortgageBuyDouble","Купить");
        Inner.findAndOpenTicketByID(ticketIdBue);
        Inner.clickInnerTicket();
        Inner.clickInnerTicketButton();
        Inner.chooseInnerTicketByType("Ипотека");
        Inner.fillingOwnMoney("9876543210");
        Inner.fillingEstatePrice("10234567890");
        Inner.chooseUrgencyReason("Да, покупатель участвует в цепочке сделок");
        if (Platform.getInstance().isIOS()) {
            Inner.chooseMortgageBroker("Дубовая Виктория Андреевна");
        }
        Inner.fillingCommentField("Мой комментарий к заявке на ипотеку");
        Inner.clickCreateInnerTicketButton();
        Inner.waitSnack();
        Inner.clickInnerTicketButton();
        Inner.assertIfTicketCreated("У клиента уже есть открытая заявка на ипотеку");
    }

    @Test
    @DisplayName("Creating a mortgage ticket")
    @Description("Creating a mortgage inner ticket from a lease")
    @Step("Starting test 'ID 7998 testCreateMortgageTicketForLease'")
    @Severity(value = SeverityLevel.NORMAL)
    public void testCreateMortgageTicketForLease() throws JsonProcessingException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        InnerTicketsPageObject Inner = InnerTicketsPageObjectFactory.get(driver);

        //Authorization
        Auth.authorizationRIES(login, password);
        //Create ticket via API method and open its card
        Inner.createNewTicketByNameAndType("TestMortgageLease","Сдать");
        Inner.findAndOpenTicketByID(ticketIdBue);
        Inner.clickInnerTicket();
        Inner.assertIfInnerTicketButtonNotPresent();
    }

    @Test
    @DisplayName("Creating a mortgage ticket")
    @Description("Creating a mortgage inner ticket from a rent")
    @Step("Starting test 'ID 7999 testCreateMortgageTicketForRent'")
    @Severity(value = SeverityLevel.NORMAL)
    public void testCreateMortgageTicketForRent() throws JsonProcessingException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        InnerTicketsPageObject Inner = InnerTicketsPageObjectFactory.get(driver);

        //Authorization
        Auth.authorizationRIES(login, password);
        //Create ticket via API method and open its card
        Inner.createNewTicketByNameAndType("TestMortgageRent","Снять");
        Inner.findAndOpenTicketByID(ticketIdBue);
        Inner.clickInnerTicket();
        Inner.assertIfInnerTicketButtonNotPresent();
    }

    @Test
    @DisplayName("Creating a mortgage ticket")
    @Description("Creating a mortgage inner ticket from a buy and add comment")
    @Step("Starting test 'ID 8000 testCreateMortgageTicketForBuyAndAddComment'")
    @Severity(value = SeverityLevel.NORMAL)
    public void testCreateMortgageTicketAndAddComment() throws JsonProcessingException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        InnerTicketsPageObject Inner = InnerTicketsPageObjectFactory.get(driver);

        //Authorization
        Auth.authorizationRIES(login, password);
        //Create ticket via API method and open its card
        Inner.createNewTicketByNameAndType("TestMortgageBuy","Купить");
        Inner.findAndOpenTicketByID(ticketIdBue);
        Inner.clickInnerTicket();
        Inner.clickInnerTicketButton();
        Inner.chooseInnerTicketByType("Ипотека");
        Inner.fillingOwnMoney("9876543210");
        Inner.fillingEstatePrice("10234567890");
        Inner.chooseUrgencyReason("Да, покупатель участвует в цепочке сделок");
        if (Platform.getInstance().isIOS()) {
            Inner.chooseMortgageBroker("Дубовая Виктория Андреевна");
        }
        Inner.fillingCommentField("Мой комментарий к заявке на ипотеку");
        Inner.clickCreateInnerTicketButton();
        Inner.assertIfCreateMortgageTicketForBuy("Дубовая Виктория Андреевна");
        Inner.openMortgageInnerTicket();
        Inner.openMortgageTicketComments();
        Inner.fillingMortgageTicketComment("Мой тестовый комментарии номер три");
        Inner.fillingMortgageTicketComment("Мой тестовый комментарии номер четыре");
        Inner.closeMortgageTicketComments();
        Inner.assertIfInnerMortgageTicketCommentsCounter();
    }
}