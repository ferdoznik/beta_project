package app.RIES.Tests;

import app.RIES.lib.CoreTestCase;
import app.RIES.lib.Platform;
import app.RIES.lib.ui.RIES.AuthPageObject;
import app.RIES.lib.ui.RIES.MainPageObject;
import app.RIES.lib.ui.RIES.RandomGenerator;
import app.RIES.lib.ui.RIES.TicketsPageObject;
import app.RIES.lib.ui.factories.AuthPageObjectFactory;
import app.RIES.lib.ui.factories.TicketsPageObjectFactory;
import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

public class CreateTicket extends CoreTestCase {

    private static final String
            login = "130522",
            password = "99679218Aa",
            ununique_phone_number = "89612133383",
            phone_number = RandomGenerator.generateRandomPhoneNumber(),
            long_phone_number = RandomGenerator.generateLongRandomPhoneNumber(),
            short_phone_number = RandomGenerator.generateShortRandomPhoneNumber(),
            ticket_title = RandomGenerator.generateRandomTicketName(),
            commentary = "Test commentary for autotest";

    @Test
    @Features(value = {@Feature(value = "Tickets")})
    @DisplayName("Clearing the fields")
    @Description("Clearing all the fields during the ticket creation process")
    @Step("Starting test 'ID 7960 testClearFields'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testClearFields() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.fillingCreatingTicketFields(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressClear();
        Ticket.assertAllFieldsCleared();
    }

    @Test
    @DisplayName("Ununique phone number")
    @Description("Checking if double's alert appears while entering ununique phone number")
    @Step("Starting test 'ID 7961 testUnuniquePhoneNumberTicket'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testUnuniquePhoneNumberTicket() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.enteringPhoneNumber(ununique_phone_number);
        Thread.sleep(2000);
        Ticket.assertDoublesFound();
    }

    @Test
    @DisplayName("Using a too long phone number")
    @Description("Creating a ticket using a too long phone number")
    @Step("Starting test 'ID 7962 testLongPhoneNumber'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testLongPhoneNumber() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(long_phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.assertIfBadNumberAlertAppears();
    }

    @Test
    @DisplayName("Using a too short phone number")
    @Description("Creating a ticket using a too short phone number")
    @Step("Starting test 'ID 7963 testShortPhoneNumber'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testShortPhoneNumber() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(short_phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.assertIfBadNumberAlertAppears();
    }

    @Test
    @DisplayName("No name while creating ticket")
    @Description("Creating a ticket without the name field filled")
    @Step("Starting test 'ID 7964 testShortPhoneNumber'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testNoClientNameTicket() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, "");
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.assertIfContinueButtonPresent();
    }

    @Test
    @DisplayName("Creating a Buy Flat ticket")
    @Description("Creating a ticket deal Buy, type Flat")
    @Step("Starting test 'ID 7965 testCreateTicketBuyFlat'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketBuyFlat() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        if (Platform.getInstance().isAndroid()){
        Ticket.changeTicketDealAndType("Купить", "Квартиры");}
        Ticket.changeTicketDealAndType("Купить", "Вторичная");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Buy Country ticket")
    @Description("Creating a ticket deal Buy, type Country")
    @Step("Starting test 'ID 7966 testCreateTicketBuyCountry'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketBuyCountry() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Купить", "Загородная");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Buy Commercial ticket")
    @Description("Creating a ticket deal Buy, type Commercial")
    @Step("Starting test 'ID 7967 testCreateTicketBuyCommercial'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketBuyCommercial() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Купить", "Коммерческая");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Buy Garage ticket")
    @Description("Creating a ticket deal Buy, type Garage")
    @Step("Starting test 'ID 7968 testCreateTicketBuyGarage'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketBuyGarage() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Купить", "Гаражи");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Rent Flat ticket")
    @Description("Creating a ticket deal Rent, type Flat")
    @Step("Starting test 'ID 7969 testCreateTicketRentFlat'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketRentFlat() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        if (Platform.getInstance().isAndroid()){
            Ticket.changeTicketDealAndType("Снять", "Квартиры");}
        Ticket.changeTicketDealAndType("Снять", "Вторичная");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Rent Country ticket")
    @Description("Creating a ticket deal Rent, type Country")
    @Step("Starting test 'ID 7970 testCreateTicketRentCountry'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateRentCountry() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Снять", "Загородная");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Rent Commercial ticket")
    @Description("Creating a ticket deal Rent, type Commercial")
    @Step("Starting test 'ID 7971 testCreateTicketRentCommercial'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketRentCommercial() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Снять", "Коммерческая");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Rent Garage ticket")
    @Description("Creating a ticket deal Rent, type Garage")
    @Step("Starting test 'ID 7972 testCreateTicketRentGarage'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketRentGarage() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Снять", "Гаражи");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Lease Flat ticket")
    @Description("Creating a ticket deal Lease, type Flat")
    @Step("Starting test 'ID 7973 testCreateTicketLeaseFlat'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketLeaseFlat() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Сдать", "Квартира");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Lease Pension ticket")
    @Description("Creating a ticket deal Lease, type Pension")
    @Step("Starting test 'ID 7974 testCreateTicketLeasePension'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketLeasePension() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Сдать", "Пансионат");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Lease Smallfamily ticket")
    @Description("Creating a ticket deal Lease, type Smallfamily")
    @Step("Starting test 'ID 7975 testCreateTicketLeaseSmallfamily'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketLeaseSmallfamily() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Сдать", "Малосемейка");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Lease Dormitory ticket")
    @Description("Creating a ticket deal Lease, type Dormitory")
    @Step("Starting test 'ID 7976 testCreateTicketLeaseDormitory'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketLeaseDormitory() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Сдать", "Общежитие");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Lease Room ticket")
    @Description("Creating a ticket deal Lease, type Room")
    @Step("Starting test 'ID 7977 testCreateTicketLeaseRoom'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketLeaseRoom() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Сдать", "Комната");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Lease Hostel ticket")
    @Description("Creating a ticket deal Lease, type Hostel")
    @Step("Starting test 'ID 7978 testCreateTicketLeaseHostel'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketLeaseHostel() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Сдать", "Гостинка");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Lease Hotelroom ticket")
    @Description("Creating a ticket deal Lease, type Hotelroom")
    @Step("Starting test 'ID 7979 testCreateTicketLeaseHotelroom'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketLeaseHotelroom() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Сдать", "Номер");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Lease Apartment ticket")
    @Description("Creating a ticket deal Lease, type Apartment")
    @Step("Starting test 'ID 7980 testCreateTicketLeaseApartment'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketLeaseApartment() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Сдать", "Аппартаменты");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Lease Garage ticket")
    @Description("Creating a ticket deal Lease, type Garage")
    @Step("Starting test 'ID 8758 testCreateTicketLeaseGarage'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketLeaseGarage() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Сдать", "Гараж");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Lease Parking ticket")
    @Description("Creating a ticket deal Lease, type Parking")
    @Step("Starting test 'ID 8759 testCreateTicketLeaseParking'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketLeaseParking() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Сдать", "Машино-место");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Lease Land ticket")
    @Description("Creating a ticket deal Lease, type Land")
    @Step("Starting test 'ID 8760 testCreateTicketLeaseLand'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketLeaseLand() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Сдать", "Земельный участок");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Lease House ticket")
    @Description("Creating a ticket deal Lease, type House")
    @Step("Starting test 'ID 8761 testCreateTicketLeaseHouse")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketLeaseHouse() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Сдать", "Дом");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Lease Dacha ticket")
    @Description("Creating a ticket deal Lease, type Dacha")
    @Step("Starting test 'ID 8766 testCreateTicketLeaseDacha")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketLeaseDacha() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Сдать", "Дача");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Lease Townhouse ticket")
    @Description("Creating a ticket deal Lease, type Townhouse")
    @Step("Starting test 'ID 8767 testCreateTicketLeaseTownhouse")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketLeaseTownhouse() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Сдать", "Таунхаус");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Lease Duplex ticket")
    @Description("Creating a ticket deal Lease, type Duplex")
    @Step("Starting test 'ID 8768 Duplex")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketLeaseDuplex() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Сдать", "Дуплекс");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Lease CommLand ticket")
    @Description("Creating a ticket deal Lease, type CommLand")
    @Step("Starting test 'ID 8769 testCreateTicketLeaseCommLand")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketLeaseCommLand() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Сдать", "Коммерческий участок");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Lease Office estate ticket")
    @Description("Creating a ticket deal Lease, type Office estate")
    @Step("Starting test 'ID 8770 testCreateTicketLeaseOfficeEstate")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketLeaseOfficeEstate() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Сдать", "Офисное помещение");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Lease Trading estate ticket")
    @Description("Creating a ticket deal Lease, type Trading estate")
    @Step("Starting test 'ID 8771 testCreateTicketLeaseTradingEstate")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketLeaseTradingEstate() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Сдать", "Торговое помещение");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Lease Production estate ticket")
    @Description("Creating a ticket deal Lease, type Production estate")
    @Step("Starting test 'ID 8772 testCreateTicketLeaseProductionEstate")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketLeaseProductionEstate() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Сдать", "Производственное помещение");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Lease Business ticket")
    @Description("Creating a ticket deal Lease, type Business")
    @Step("Starting test 'ID 8773 testCreateTicketLeaseBusiness")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketLeaseBusiness() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Сдать", "Готовый бизнес");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Lease Common Estate ticket")
    @Description("Creating a ticket deal Lease, type Common Estate")
    @Step("Starting test 'ID 8774 testCreateTicketLeaseCommonEstate")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketLeaseCommonEstate() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Сдать", "Свободного назначения");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Sell Flat ticket")
    @Description("Creating a ticket deal Sell, type Flat")
    @Step("Starting test 'ID 8775 testCreateTicketSellFlat'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketSellFlat() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Продать", "Квартира");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Sell Pension ticket")
    @Description("Creating a ticket deal Sell, type Pension")
    @Step("Starting test 'ID 8776 testCreateTicketSellPension'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketSellPension() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Продать", "Пансионат");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Sell Smallfamily ticket")
    @Description("Creating a ticket deal Sell, type Smallfamily")
    @Step("Starting test 'ID 8777 testCreateTicketSellSmallfamily'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketLeaseSellfamily() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Продать", "Малосемейка");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Sell Dormitory ticket")
    @Description("Creating a ticket deal Sell, type Dormitory")
    @Step("Starting test 'ID 8778 testCreateTicketSellDormitory'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketSellDormitory() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Продать", "Общежитие");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Sell Room ticket")
    @Description("Creating a ticket deal Sell, type Room")
    @Step("Starting test 'ID 8779 testCreateTicketSellRoom'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketSellRoom() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Продать", "Комната");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Sell Hostel ticket")
    @Description("Creating a ticket deal Sell, type Hostel")
    @Step("Starting test 'ID 8780 testCreateTicketSellHostel'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketSellHostel() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Продать", "Гостинка");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Sell Hotelroom ticket")
    @Description("Creating a ticket deal Sell, type Hotelroom")
    @Step("Starting test 'ID 8781 testCreateTicketSellHotelroom'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketSellHotelroom() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Продать", "Номер");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Sell Apartment ticket")
    @Description("Creating a ticket deal Sell, type Apartment")
    @Step("Starting test 'ID 8782 testCreateTicketSellApartment'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketSellApartment() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Продать", "Аппартаменты");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Sell Garage ticket")
    @Description("Creating a ticket deal Sell, type Garage")
    @Step("Starting test 'ID 8783 testCreateTicketSellGarage'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketSellGarage() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Продать", "Гараж");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Sell Parking ticket")
    @Description("Creating a ticket deal Sell, type Parking")
    @Step("Starting test 'ID 8784 testCreateTicketSellParking'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketSellParking() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Продать", "Машино-место");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Sell Land ticket")
    @Description("Creating a ticket deal Sell, type Land")
    @Step("Starting test 'ID 8785 testCreateTicketSellLand'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketSellLand() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Продать", "Земельный участок");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Sell House ticket")
    @Description("Creating a ticket deal Sell, type House")
    @Step("Starting test 'ID 8786 testCreateTicketSellHouse")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketSellHouse() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Продать", "Дом");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Sell Dacha ticket")
    @Description("Creating a ticket deal Sell, type Dacha")
    @Step("Starting test 'ID 8787 testCreateTicketSellDacha")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketSellDacha() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Продать", "Дача");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Sell Townhouse ticket")
    @Description("Creating a ticket deal Sell, type Townhouse")
    @Step("Starting test 'ID 8788 testCreateTicketSellTownhouse")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketSellTownhouse() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Продать", "Таунхаус");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Sell Duplex ticket")
    @Description("Creating a ticket deal Sell, type Duplex")
    @Step("Starting test 'ID 8789 testCreateTicketSellDuplex")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketSellDuplex() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Продать", "Дуплекс");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Sell CommLand ticket")
    @Description("Creating a ticket deal Sell, type CommLand")
    @Step("Starting test 'ID 8790 testCreateTicketSellCommLand")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketSellCommLand() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Продать", "Коммерческий участок");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Sell Office estate ticket")
    @Description("Creating a ticket deal Sell, type Office estate")
    @Step("Starting test 'ID 8791 testCreateTicketSellOfficeEstate")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketSellOfficeEstate() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Продать", "Офисное помещение");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Sell Trading estate ticket")
    @Description("Creating a ticket deal Sell, type Trading estate")
    @Step("Starting test 'ID 8792 testCreateTicketSellradingEstate")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketSellTradingEstate() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Продать", "Торговое помещение");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Sell Production estate ticket")
    @Description("Creating a ticket deal Sell, type Production estate")
    @Step("Starting test 'ID 8793 testCreateTicketSellProductionEstate")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketSellProductionEstate() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Продать", "Производственное помещение");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Sell Business ticket")
    @Description("Creating a ticket deal Sell, type Business")
    @Step("Starting test 'ID 8794 testCreateTicketSellBusiness")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketSellBusiness() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Продать", "Готовый бизнес");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }

    @Test
    @DisplayName("Creating a Sell Common Estate ticket")
    @Description("Creating a ticket deal Sell, type Common Estate")
    @Step("Starting test 'ID 8795 testCreateTicketSellCommonEstate")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testCreateTicketSellCommonEstate() throws InterruptedException {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        MainPageObject Main = new MainPageObject(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authLogin130522(login, password);

        Ticket.clickTicketsTab();
        Ticket.clickCreateNewTicketButton();
        Ticket.firstStepCreatingTicket(phone_number, ticket_title);
        Main.hideKeyboard();
        Ticket.pressContinueButton();
        Ticket.changeTicketDealAndType("Продать", "Свободного назначения");
        Ticket.secondStepCreatingTicket(ticket_title, commentary);
        Main.hideKeyboard();
        Ticket.pressCreateTicketButton();
        Ticket.assertIfItTicketsTab();
    }
}