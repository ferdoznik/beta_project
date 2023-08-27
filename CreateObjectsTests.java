package Tests;

import app.lib.CoreTestCase;
import app.lib.ui.RIES.AuthPageObject;
import app.lib.helpers.RandomGenerator;
import app.lib.ui.RIES.TicketsPageObject;
import app.lib.ui.factories.AuthPageObjectFactory;
import app.lib.ui.factories.TicketsPageObjectFactory;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CreateObjectsTests extends CoreTestCase {

    private static final String
            login = "",
            password = "",
            ticket_title = RandomGenerator.generateRandomTicketName();

    @Test
    @Features(value = {@Feature(value = "Tickets and Objects")})
    @DisplayName("Create Flat object for sale")
    @Description("Creating the Flat object in the Sale ticket")
    @Step("Starting test 'ID 7981 testCreateObjectSellFlat'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellFlat() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Квартира",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Pension object for sale")
    @Description("Creating the Pension object in the Sale ticket")
    @Step("Starting test 'ID 7982 testCreateObjectSellPension'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellPension() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Пансионат",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create SmallFamily object for sale")
    @Description("Creating the SmallFamily object in the Sale ticket")
    @Step("Starting test 'ID 7983 testCreateObjectSellSmallFamily'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellSmallFamily() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать", RandomGenerator.generateRandomPhoneNumber(), ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Малосемейка",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Dormitory object for sale")
    @Description("Creating the Dormitory object in the Sale ticket")
    @Step("Starting test 'ID 7984 testCreateObjectSellDormitory'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellDormitory() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Общежитие",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Room object for sale")
    @Description("Creating the Room object in the Sale ticket")
    @Step("Starting test 'ID 7985 testCreateObjectSellRoom'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellRoom() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Комната",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Hostel object for sale")
    @Description("Creating the Hostel object in the Sale ticket")
    @Step("Starting test 'ID 7986 testCreateObjectSellHostel'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellHostel() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Гостинка",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create HotelRoom object for sale")
    @Description("Creating the HotelRoom object in the Sale ticket")
    @Step("Starting test 'ID 7987 testCreateObjectSellHotelRoom'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellHotelRoom() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Номер",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Apartments object for sale")
    @Description("Creating the Apartments object in the Sale ticket")
    @Step("Starting test 'ID 7988 testCreateObjectSellApartments'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellApartments() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Апартаменты",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Garage object for sale")
    @Description("Creating the Garage object in the Sale ticket")
    @Step("Starting test 'ID 7989 testCreateObjectSellGarage'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellGarage() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Гараж",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "Стоянка",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Parking object for sale")
    @Description("Creating the Parking object in the Sale ticket")
    @Step("Starting test 'ID 7990 testCreateObjectSellParking'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellParking() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Машино-место",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "Парковка",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Land object for sale")
    @Description("Creating the Land object in the Sale ticket")
    @Step("Starting test 'ID 7991 testCreateObjectSellLand'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellLand() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Земельный участок",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();

    }

    @Test
    @DisplayName("Create House object for sale")
    @Description("Creating the House object in the Sale ticket")
    @Step("Starting test 'ID 7992 testCreateObjectSellHouse'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellHouse() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Дом",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Dacha object for sale")
    @Description("Creating the Dacha object in the Sale ticket")
    @Step("Starting test 'ID 8154 testCreateObjectSellDacha'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellDacha() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Дача",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Townhouse object for sale")
    @Description("Creating the Townhouse object in the Sale ticket")
    @Step("Starting test 'ID 8155 testCreateObjectSellTownhouse'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellTownhouse() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Таунхаус",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Duplex object for sale")
    @Description("Creating the Duplex object in the Sale ticket")
    @Step("Starting test 'ID 8156 testCreateObjectSellDuplex'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellDuplex() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Дуплекс(1/2 дома)",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create object Commerce land for sale")
    @Description("Creating the Commerce land object in the Sale ticket")
    @Step("Starting test 'ID 8161 testCreateObjectSellCommerceLand'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellCommerceLand() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Коммерческий участок",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create object Office Estate for sale")
    @Description("Creating the Office Estate object in the Sale ticket")
    @Step("Starting test 'ID 8157 testCreateObjectSellOfficeEstate'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellOfficeEstate() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Офисное помещение",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Trading estate object for sale")
    @Description("Creating the Trading estate object in the Sale ticket")
    @Step("Starting test 'ID 8162 testCreateObjectSellTradingEstate'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellTradingEstate() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Торговое помещение",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Production estate for sale")
    @Description("Creating the Production estate object in the Sale ticket")
    @Step("Starting test 'ID 8163 testCreateObjectSellProductionEstate'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellProductionEstate() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Производственное помещение",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Common estate object for sale")
    @Description("Creating the Common estate object in the Sale ticket")
    @Step("Starting test 'ID 8164 testCreateObjectSellCommonEstate'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellCommonEstate() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Свободного назначения",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Business Shop object for sale")
    @Description("Creating the Business Shop object in the Sale ticket")
    @Step("Starting test 'ID 8158 testCreateObjectSellBusinessShop'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellBusinessShop () throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Готовый бизнес",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Business Shop object for sale")
    @Description("Creating the Business Hotel object in the Sale ticket")
    @Step("Starting test 'ID 8165 testCreateObjectSellBusinessHotel'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellBusinessHotel() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Готовый бизнес",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Гостиница",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Business Restaurant object for sale")
    @Description("Creating the Business Restaurant object in the Sale ticket")
    @Step("Starting test 'ID 8166 testCreateObjectSellBusinessRestaurant'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellBusinessRestaurant() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Готовый бизнес",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Ресторанный бизнес",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Business BeautySalon object for sale")
    @Description("Creating the Business BeautySalon object in the Sale ticket")
    @Step("Starting test 'ID 8167 testCreateObjectSellBusinessBeautySalon'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellBusinessBeautySalon() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Готовый бизнес",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Салон красоты",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Business Auto object for sale")
    @Description("Creating the Business Auto object in the Sale ticket")
    @Step("Starting test 'ID 8168 testCreateObjectSellBusinessAuto'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellBusinessAuto() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Готовый бизнес",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Автобизнес",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Business Fitness Club object for sale")
    @Description("Creating the Business Fitness Club object in the Sale ticket")
    @Step("Starting test 'ID 8169 testCreateObjectSellBusinessFitnessClub'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellBusinessFitnessClub() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Готовый бизнес",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Фитнес клуб",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Business Production object for sale")
    @Description("Creating the Business Production object in the Sale ticket")
    @Step("Starting test 'ID 8170 testCreateObjectSellBusinessProduction'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellBusinessProduction() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Готовый бизнес",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Производство",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Business Other object for sale")
    @Description("Creating the Business Other object in the Sale ticket")
    @Step("Starting test 'ID 8171 testCreateObjectSellBusinessOther'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectSellBusinessOther() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Продать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Продать",
                "Готовый бизнес",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Другое",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepQuick();
        Ticket.assertCreatedObjectParameters();
    }

    //LEASE DEAL TYPE TESTS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    @Test
    @DisplayName("Create Flat object for Lease")
    @Description("Creating the Flat object in the Lease ticket")
    @Step("Starting test 'ID 7981 testCreateObjectLeaseFlat'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseFlat() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Квартира",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Pension object for Lease")
    @Description("Creating the Pension object in the Lease ticket")
    @Step("Starting test 'ID 7982 testCreateObjectLeasePension'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeasePension() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",
                RandomGenerator.generateRandomPhoneNumber(), //Generating a phone number
                ticket_title);//Generating a title's name
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Пансионат",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create SmallFamily object for Lease")
    @Description("Creating the SmallFamily object in the Lease ticket")
    @Step("Starting test 'ID 7983 testCreateObjectLeaseSmallFamily'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseSmallFamily() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Малосемейка",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Dormitory object for Lease")
    @Description("Creating the Dormitory object in the Lease ticket")
    @Step("Starting test 'ID 7984 testCreateObjectLeaseDormitory'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseDormitory() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Общежитие",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Room object for Lease")
    @Description("Creating the Room object in the Lease ticket")
    @Step("Starting test 'ID 7985 testCreateObjectLeaseRoom'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseRoom() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Комната",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Hostel object for Lease")
    @Description("Creating the Hostel object in the Lease ticket")
    @Step("Starting test 'ID 7986 testCreateObjectLeaseHostel'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseHostel() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Гостинка",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create HotelRoom object for Lease")
    @Description("Creating the HotelRoom object in the Lease ticket")
    @Step("Starting test 'ID 7987 testCreateObjectLeaseHotelRoom'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseHotelRoom() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Номер",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Apartments object for Lease")
    @Description("Creating the Apartments object in the Lease ticket")
    @Step("Starting test 'ID 7988 testCreateObjectLeaseApartments'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseApartments() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Апартаменты",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "109764,3",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Garage object for Lease")
    @Description("Creating the Garage object in the Lease ticket")
    @Step("Starting test 'ID 7989 testCreateObjectLeaseGarage'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseGarage() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        //Продать Гараж, набор полей
        // 1й этап
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Гараж",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "Стоянка",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Parking object for Lease")
    @Description("Creating the Parking object in the Lease ticket")
    @Step("Starting test 'ID 7990 testCreateObjectLeaseParking'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseParking() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Машино-место",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "Стоянка",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Land object for Lease")
    @Description("Creating the Land object in the Lease ticket")
    @Step("Starting test 'ID 7991 testCreateObjectLeaseLand'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseLand() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Земельный участок",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();

    }

    @Test
    @DisplayName("Create House object for Lease")
    @Description("Creating the House object in the Lease ticket")
    @Step("Starting test 'ID 7992 testCreateObjectLeaseHouse'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseHouse() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Дом",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Dacha object for Lease")
    @Description("Creating the Dacha object in the Lease ticket")
    @Step("Starting test 'ID 8154 testCreateObjectLeaseDacha'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseDacha() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Дача",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }


    @Test
    @DisplayName("Create Townhouse object for Lease")
    @Description("Creating the Townhouse object in the Lease ticket")
    @Step("Starting test 'ID 8155 testCreateObjectLeaseTownhouse'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseTownhouse() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Таунхаус",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Duplex object for Lease")
    @Description("Creating the Duplex object in the Lease ticket")
    @Step("Starting test 'ID 8156 testCreateObjectLeaseDuplex'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseDuplex() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Дуплекс(1/2 дома)",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create object Commerce land for Lease")
    @Description("Creating the Commerce land object in the Lease ticket")
    @Step("Starting test 'ID 8161 testCreateObjectLeaseCommerceLand'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseCommerceLand() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Коммерческий участок",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create object Office Estate for Lease")
    @Description("Creating the Office Estate object in the Lease ticket")
    @Step("Starting test 'ID 8157 testCreateObjectLeaseOfficeEstate'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseOfficeEstate() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Офисное помещение",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Trading estate object for Lease")
    @Description("Creating the Trading estate object in the Lease ticket")
    @Step("Starting test 'ID 8162 testCreateObjectLeaseTradingEstate'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseTradingEstate() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Торговое помещение",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Production estate for Lease")
    @Description("Creating the Production estate object in the Lease ticket")
    @Step("Starting test 'ID 8163 testCreateObjectLeaseProductionEstate'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseProductionEstate() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Производственное помещение",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Common estate object for Lease")
    @Description("Creating the Common estate object in the Sale Lease")
    @Step("Starting test 'ID 8164 testCreateObjectLeaseCommonEstate'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseCommonEstate() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Свободного назначения",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Business Shop object for Lease")
    @Description("Creating the Business Shop object in the Lease ticket")
    @Step("Starting test 'ID 8158 testCreateObjectSellBusinessShop'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseBusinessShop () throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Готовый бизнес",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Магазин",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Business Hotel object for Lease")
    @Description("Creating the Business Hotel object in the Lease ticket")
    @Step("Starting test 'ID 8165 testCreateObjectLeaseBusinessHotel'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseBusinessHotel() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Готовый бизнес",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Гостиница",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Business Restaurant object for Lease")
    @Description("Creating the Business Restaurant object in the Lease ticket")
    @Step("Starting test 'ID 8166 testCreateObjectLeaseBusinessRestaurant'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseBusinessRestaurant() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Готовый бизнес",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Ресторанный бизнес",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Business BeautySalon object for Lease")
    @Description("Creating the Business BeautySalon object in the Lease ticket")
    @Step("Starting test 'ID 8167 testCreateObjectLeaseBusinessBeautySalon'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseBusinessBeautySalon() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Готовый бизнес",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Салон красоты",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Business Auto object for Lease")
    @Description("Creating the Business Auto object in the Lease ticket")
    @Step("Starting test 'ID 8168 testCreateObjectLeaseBusinessAuto'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseBusinessAuto() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Готовый бизнес",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Автобизнес",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Business Fitness Club object for Lease")
    @Description("Creating the Business Fitness Club object in the Lease ticket")
    @Step("Starting test 'ID 8169 testCreateObjectLeaseBusinessFitnessClub'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseBusinessFitnessClub() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Готовый бизнес",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Фитнес клуб",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Business Production object for Lease")
    @Description("Creating the Business Production object in the Lease ticket")
    @Step("Starting test 'ID 8170 testCreateObjectLeaseBusinessProduction'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseBusinessProduction() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Готовый бизнес",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Производство",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }

    @Test
    @DisplayName("Create Business Other object for Lease")
    @Description("Creating the Business Other object in the Lease ticket")
    @Step("Starting test 'ID 8171 testCreateObjectLeaseBusinessOther'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateObjectLeaseBusinessOther() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);
//Authorisation
        Auth.authLogin130522(login, password);
//Create a basic ticket with params
        Ticket.createTicketByCertainParams("Сдать",RandomGenerator.generateRandomPhoneNumber(),ticket_title);
//Create object
        Ticket.pressCreateObjectButton();
        Ticket.createObjectByDealAndEstateType(
                "Сдать",
                "Готовый бизнес",
                "Свобод",
                "1а кор3",
                "123",
                "2",
                "16 000 000",
                "4",
                "50.5",
                "Кухня-гостиная",
                "Черновая отделка",
                "144",
                "Другое",
                "Бетонные",
                "Шлагбаум",
                "На стадии оформления",
                "Заведен",
                "Столб возле участка",
                "Печное",
                "Центральная",
                "Вторая линия",
                "БЦ",
                "Плитка",
                "Подвесной",
                "Санузел один на этаж",
                "Лоджия",
                "Пустая",
                "Холодильник",
                "Интернет");
        Ticket.createObjectThirdStepLease();
        Ticket.assertCreatedObjectParameters();
    }
}
