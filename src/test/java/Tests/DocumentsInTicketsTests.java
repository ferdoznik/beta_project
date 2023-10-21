package Tests;

import app.lib.CoreTestCase;
import app.lib.api.ApiMethods.ticket.TicketsMethods;
import app.lib.ui.RIES.AuthPageObject;
import app.lib.ui.RIES.TicketsPageObject;
import app.lib.ui.factories.AuthPageObjectFactory;
import app.lib.ui.factories.TicketsPageObjectFactory;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Features(value = {@Feature(value = "Documents in tickets")})
public class DocumentsInTicketsTests extends CoreTestCase {

    private static final String
            login = "",
            password = "";

    @Test
    @DisplayName("Check if the preloaded documents are uploaded")
    @Description("Checking if clients Preloaded documents uploaded in the ticket")
    @Step("Starting test ID 9495 'testPreloadedDocumentsUploaded'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testPreloadedDocumentsUploaded(){
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);

        Ticket.waitForTicketCard();
        Ticket.clickDocumentsInTicket();
        Ticket.assertIfPreloadedDocumentsUploaded();
    }

    @Test
    @DisplayName("Search documents by type")
    @Description("Checking if documents by type are available")
    @Step("Starting test ID 9496 'testSearchDocumentsByType'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testSearchDocumentsByType() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);
        //Provide document type here
        String documentType = "задатке";

        Ticket.waitForTicketCard();
        Ticket.clickDocumentsInTicket();
        Ticket.clickUploadButton();
        Ticket.searchDocumentByType(documentType);
        Ticket.assertIfProvidedDocumentTypeAvailable(documentType);
    }

    @Test
    @DisplayName("Upload documents by type Agent Contact")
    @Description("Uploading documents by provided type Agent Contact")
    @Step("Starting test ID 9502 'testUploadDocumentAgentContact'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testUploadDocumentAgentContact() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);
        //Provide document type here
        String documentType = "Агентский договор";

        Ticket.waitForTicketCard();
        Ticket.clickDocumentsInTicket();
        Ticket.clickUploadButton();
        Ticket.searchDocumentType(documentType);
        Ticket.chooseDocumentType(documentType);
        Ticket.clickAddAttachmentButton();
        Ticket.addAttachmentFromGallery();
        Ticket.clickUploadAttachedFiles();
//        Ticket.assertIfDocumentTypeChangedSnackBarPresent();
        Ticket.assertIfProvidedDocumentUploaded(documentType);
    }

    @Test
    @DisplayName("Upload documents by type Land Documents")
    @Description("Uploading documents by provided type Land Documents")
    @Step("Starting test ID 9508 'testUploadDocumentRentEstateAct'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testUploadDocumentLandDocuments() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);
        //Provide document type here
        String documentType = "Документы на землю";

        Ticket.waitForTicketCard();
        Ticket.clickDocumentsInTicket();
        Ticket.clickUploadButton();
        Ticket.searchDocumentType(documentType);
        Ticket.chooseDocumentType(documentType);
        Ticket.clickAddAttachmentButton();
        Ticket.addAttachmentFromGallery();
        Ticket.clickUploadAttachedFiles();
        Ticket.assertIfProvidedDocumentUploaded(documentType);
    }

    @Test
    @DisplayName("Upload documents by type Sell Buy Contract")
    @Description("Uploading documents by provided type Sell Buy Contract")
    @Step("Starting test ID 9509 'testUploadDocumentSellBuyContract'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testUploadDocumentSellBuyContract() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);
        //Provide document type here
        String documentType = "Договор купли-продажи";

        Ticket.waitForTicketCard();
        Ticket.clickDocumentsInTicket();
        Ticket.clickUploadButton();
        Ticket.searchDocumentType(documentType);
        Ticket.chooseDocumentType(documentType);
        Ticket.clickAddAttachmentButton();
        Ticket.addAttachmentFromGallery();
        Ticket.clickUploadAttachedFiles();
        Ticket.assertIfProvidedDocumentUploaded(documentType);
    }

    @Test
    @DisplayName("Upload documents by type Agreement To Agent Contract")
    @Description("Uploading documents by provided type Agreement To Agent Contract")
    @Step("Starting test ID 9510 'testUploadDocumentAgreementToAgentContract'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testUploadDocumentAgreementToAgentContract() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);
        //Provide document type here
        String documentType = "Дополнительное соглашение к Агентскому договору";

        Ticket.waitForTicketCard();
        Ticket.clickDocumentsInTicket();
        Ticket.clickUploadButton();
        Ticket.searchDocumentType(documentType);
        Ticket.chooseDocumentType(documentType);
        Ticket.clickAddAttachmentButton();
        Ticket.addAttachmentFromGallery();
        Ticket.clickUploadAttachedFiles();
        Ticket.assertIfProvidedDocumentUploaded(documentType);
    }

    @Test
    @DisplayName("Upload documents by type Passport Copy")
    @Description("Uploading documents by provided type Passport Copy")
    @Step("Starting test ID 9511 'testUploadDocumentPassportCopy'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testUploadDocumentPassportCopy() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);
        //Provide document type here
        String documentType = "Паспорт (копия)";

        Ticket.waitForTicketCard();
        Ticket.clickDocumentsInTicket();
        Ticket.clickUploadButton();
        Ticket.searchDocumentType(documentType);
        Ticket.chooseDocumentType(documentType);
        Ticket.clickAddAttachmentButton();
        Ticket.addAttachmentFromGallery();
        Ticket.clickUploadAttachedFiles();
        Ticket.assertIfProvidedDocumentUploaded(documentType);
    }

    @Test
    @DisplayName("Upload documents by type Discount Approvement")
    @Description("Uploading documents by provided type Discount Approvement")
    @Step("Starting test ID 9512 'testUploadDocumentDiscountApprovement'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testUploadDocumentDiscountApprovement() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);
        //Provide document type here
        String documentType = "Документ, подтверждающий скидку";

        Ticket.waitForTicketCard();
        Ticket.clickDocumentsInTicket();
        Ticket.clickUploadButton();
        Ticket.searchDocumentType(documentType);
        Ticket.chooseDocumentType(documentType);
        Ticket.clickAddAttachmentButton();
        Ticket.addAttachmentFromGallery();
        Ticket.clickUploadAttachedFiles();
        Ticket.assertIfProvidedDocumentUploaded(documentType);
    }

    @Test
    @DisplayName("Upload documents by type Deal Approvement Protocol")
    @Description("Uploading documents by provided type Deal Approvement Protocol")
    @Step("Starting test ID 9513 'testUploadDocumentDealApprovementProtocol'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testUploadDocumentDealApprovementProtocol() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);
        //Provide document type here
        String documentType = "Протокол согласования условий сделки";

        Ticket.waitForTicketCard();
        Ticket.clickDocumentsInTicket();
        Ticket.clickUploadButton();
        Ticket.searchDocumentType(documentType);
        Ticket.chooseDocumentType(documentType);
        Ticket.clickAddAttachmentButton();
        Ticket.addAttachmentFromGallery();
        Ticket.clickUploadAttachedFiles();
        Ticket.assertIfProvidedDocumentUploaded(documentType);
    }

    @Test
    @DisplayName("Upload documents by type Received Funds Protocol")
    @Description("Uploading documents by provided type Received Funds Protocol")
    @Step("Starting test ID 9514 'testUploadDocumentReceivedFundsProtocol'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testUploadDocumentReceivedFundsProtocol() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);
        //Provide document type here
        String documentType = "Расписка о получение денежных средств";

        Ticket.waitForTicketCard();
        Ticket.clickDocumentsInTicket();
        Ticket.clickUploadButton();
        Ticket.searchDocumentType(documentType);
        Ticket.chooseDocumentType(documentType);
        Ticket.clickAddAttachmentButton();
        Ticket.addAttachmentFromGallery();
        Ticket.clickUploadAttachedFiles();
        Ticket.assertIfProvidedDocumentUploaded(documentType);
    }

    @Test
    @DisplayName("Upload documents by type Registration Chamber Document Submitted")
    @Description("Uploading documents by provided type Registration Chamber Document Submitted")
    @Step("Starting test ID 9515 'testUploadDocumentRegistrationChamberDocumentSubmitted'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testUploadDocumentRegistrationChamberDocumentSubmitted() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);
        //Provide document type here
        String documentType = "Расписка с регистрационной палаты о сдаче документов";

        Ticket.waitForTicketCard();
        Ticket.clickDocumentsInTicket();
        Ticket.clickUploadButton();
        Ticket.searchDocumentType(documentType);
        Ticket.chooseDocumentType(documentType);
        Ticket.clickAddAttachmentButton();
        Ticket.addAttachmentFromGallery();
        Ticket.clickUploadAttachedFiles();
        Ticket.assertIfProvidedDocumentUploaded(documentType);
    }

    @Test
    @DisplayName("Upload documents by type Deposit Agreement")
    @Description("Uploading documents by provided type Deposit Agreement")
    @Step("Starting test ID 9516 'testUploadDocumentDepositAgreement'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testUploadDocumentDepositAgreement() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);
        //Provide document type here
        String documentType = "Соглашение о задатке";

        Ticket.waitForTicketCard();
        Ticket.clickDocumentsInTicket();
        Ticket.clickUploadButton();
        Ticket.searchDocumentType(documentType);
        Ticket.chooseDocumentType(documentType);
        Ticket.clickAddAttachmentButton();
        Ticket.addAttachmentFromGallery();
        Ticket.clickUploadAttachedFiles();
        Ticket.assertIfProvidedDocumentUploaded(documentType);
    }

    @Test
    @DisplayName("Upload documents by type Joint Deal Agreement")
    @Description("Uploading documents by provided type Joint Deal Agreement")
    @Step("Starting test ID 9517 'testUploadDocumentJointDealAgreement'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testUploadDocumentJointDealAgreement() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);
        //Provide document type here
        String documentType = "Соглашение о совместной сделке";

        Ticket.waitForTicketCard();
        Ticket.clickDocumentsInTicket();
        Ticket.clickUploadButton();
        Ticket.searchDocumentType(documentType);
        Ticket.chooseDocumentType(documentType);
        Ticket.clickAddAttachmentButton();
        Ticket.addAttachmentFromGallery();
        Ticket.clickUploadAttachedFiles();
        Ticket.assertIfProvidedDocumentUploaded(documentType);
    }

    @Test
    @DisplayName("Upload documents by type Mortgage Balance Statement")
    @Description("Uploading documents by provided type Mortgage Balance Statement")
    @Step("Starting test ID 9518 'testUploadDocumentMortgageBalanceStatement'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testUploadDocumentMortgageBalanceStatement() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);
        //Provide document type here
        String documentType = "Справка об остатке(размере) задолженности по ипотеке";

        Ticket.waitForTicketCard();
        Ticket.clickDocumentsInTicket();
        Ticket.clickUploadButton();
        Ticket.searchDocumentType(documentType);
        Ticket.chooseDocumentType(documentType);
        Ticket.clickAddAttachmentButton();
        Ticket.addAttachmentFromGallery();
        Ticket.clickUploadAttachedFiles();
        Ticket.assertIfProvidedDocumentUploaded(documentType);
    }

    //------------------------------------------------------------------------------------------
    //Change documents type tests
    //------------------------------------------------------------------------------------------

    @Test
    @DisplayName("Change document type to Online Document")
    @Description("Changing document type to Online Document")
    @Step("Starting test ID 9519 'testChangeDocumentTypeToOnlineDocument'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testChangeDocumentTypeToOnlineDocument() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);
        //Provide document type here
        String documentType = "Онлайн документ";

        Ticket.waitForTicketCard();
        Ticket.clickDocumentsInTicket();
        Ticket.clickUploadButton();
        Ticket.searchDocumentType("Паспорт (копия)");
        Ticket.chooseDocumentType("Паспорт (копия)");
        Ticket.clickAddAttachmentButton();
        Ticket.addAttachmentFromGallery();
        Ticket.clickUploadAttachedFiles();
        Ticket.clickPassportDocumentMiniature();
        Ticket.clickFullScreenModeMenuButton();
        Ticket.clickChangeDocumentTypeButton();
        Ticket.searchDocumentType(documentType);
        Ticket.chooseDocumentType(documentType);
        Ticket.assertIfDocumentTypeChangedSnackBarPresent();
    }

    @Test
    @DisplayName("Change document type to Sell Buy Contract")
    @Description("Changing document type to Sell Buy Contract")
    @Step("Starting test ID 9520 'testChangeDocumentTypeToSellBuyContract'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testChangeDocumentTypeToSellBuyContract() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);
        //Provide document type here
        String documentType = "Договор купли-продажи";

        Ticket.waitForTicketCard();
        Ticket.clickDocumentsInTicket();
        Ticket.clickUploadButton();
        Ticket.searchDocumentType("Паспорт (копия)");
        Ticket.chooseDocumentType("Паспорт (копия)");
        Ticket.clickAddAttachmentButton();
        Ticket.addAttachmentFromGallery();
        Ticket.clickUploadAttachedFiles();
        Ticket.clickPassportDocumentMiniature();
        Ticket.clickFullScreenModeMenuButton();
        Ticket.clickChangeDocumentTypeButton();
        Ticket.searchDocumentType(documentType);
        Ticket.chooseDocumentType(documentType);
        Ticket.assertIfDocumentTypeChangedSnackBarPresent();
    }

    @Test
    @DisplayName("Change document type to Agreement To Agent Contract")
    @Description("Changing document type to Agreement To Agent Contract")
    @Step("Starting test ID 9521 'testChangeDocumentTypeToAgreementToAgentContract'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testChangeDocumentTypeToAgreementToAgentContract() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);
        //Provide document type here
        String documentType = "Дополнительное соглашение к Агентскому договору";

        Ticket.waitForTicketCard();
        Ticket.clickDocumentsInTicket();
        Ticket.clickUploadButton();
        Ticket.searchDocumentType("Паспорт (копия)");
        Ticket.chooseDocumentType("Паспорт (копия)");
        Ticket.clickAddAttachmentButton();
        Ticket.addAttachmentFromGallery();
        Ticket.clickUploadAttachedFiles();
        Ticket.clickPassportDocumentMiniature();
        Ticket.clickFullScreenModeMenuButton();
        Ticket.clickChangeDocumentTypeButton();
        Ticket.searchDocumentType(documentType);
        Ticket.chooseDocumentType(documentType);
        Ticket.assertIfDocumentTypeChangedSnackBarPresent();
    }

    @Test
    @DisplayName("Change document type to Discount Approvement")
    @Description("Changing document type to a Discount Approvement")
    @Step("Starting test ID 9522 'testChangeDocumentTypeToDiscountApprovement'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testChangeDocumentTypeToDiscountApprovement() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);
        //Provide document type here
        String documentType = "Документ, подтверждающий скидку";

        Ticket.waitForTicketCard();
        Ticket.clickDocumentsInTicket();
        Ticket.clickUploadButton();
        Ticket.searchDocumentType("Паспорт (копия)");
        Ticket.chooseDocumentType("Паспорт (копия)");
        Ticket.clickAddAttachmentButton();
        Ticket.addAttachmentFromGallery();
        Ticket.clickUploadAttachedFiles();
        Ticket.clickPassportDocumentMiniature();
        Ticket.clickFullScreenModeMenuButton();
        Ticket.clickChangeDocumentTypeButton();
        Ticket.searchDocumentType(documentType);
        Ticket.chooseDocumentType(documentType);
        Ticket.assertIfDocumentTypeChangedSnackBarPresent();
    }

    @Test
    @DisplayName("Change document type to Deal Approvement Protocol")
    @Description("Changing document type to Deal Approvement Protocol")
    @Step("Starting test ID 9523 'testChangeDocumentTypeToDealApprovementProtocol'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testChangeDocumentTypeToDealApprovementProtocol() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);
        //Provide document type here
        String documentType = "Протокол согласования условий сделки";

        Ticket.waitForTicketCard();
        Ticket.clickDocumentsInTicket();
        Ticket.clickUploadButton();
        Ticket.searchDocumentType("Паспорт (копия)");
        Ticket.chooseDocumentType("Паспорт (копия)");
        Ticket.clickAddAttachmentButton();
        Ticket.addAttachmentFromGallery();
        Ticket.clickUploadAttachedFiles();
        Ticket.clickPassportDocumentMiniature();
        Ticket.clickFullScreenModeMenuButton();
        Ticket.clickChangeDocumentTypeButton();
        Ticket.searchDocumentType(documentType);
        Ticket.chooseDocumentType(documentType);
        Ticket.assertIfDocumentTypeChangedSnackBarPresent();
    }

    @Test
    @DisplayName("Change document type to Received Funds Protocol")
    @Description("Changing document type to Received Funds Protocol")
    @Step("Starting test ID 9524 'testChangeDocumentTypeToReceivedFundsProtocol'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testChangeDocumentTypeToReceivedFundsProtocol() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);
        //Provide document type here
        String documentType = "Расписка о получение денежных средств";

        Ticket.waitForTicketCard();
        Ticket.clickDocumentsInTicket();
        Ticket.clickUploadButton();
        Ticket.searchDocumentType("Паспорт (копия)");
        Ticket.chooseDocumentType("Паспорт (копия)");
        Ticket.clickAddAttachmentButton();
        Ticket.addAttachmentFromGallery();
        Ticket.clickUploadAttachedFiles();
        Ticket.clickPassportDocumentMiniature();
        Ticket.clickFullScreenModeMenuButton();
        Ticket.clickChangeDocumentTypeButton();
        Ticket.searchDocumentType(documentType);
        Ticket.chooseDocumentType(documentType);
        Ticket.assertIfDocumentTypeChangedSnackBarPresent();
    }

    @Test
    @DisplayName("Change document type to Registration Chamber Document Submitted")
    @Description("Changing document type to Registration Chamber Document Submitted")
    @Step("Starting test ID 9525 'testChangeDocumentTypeToRegistrationChamberDocumentSubmitted'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testChangeDocumentTypeToRegistrationChamberDocumentSubmitted() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);
        //Provide document type here
        String documentType = "Расписка с регистрационной палаты о сдаче документов";

        Ticket.waitForTicketCard();
        Ticket.clickDocumentsInTicket();
        Ticket.clickUploadButton();
        Ticket.searchDocumentType("Паспорт (копия)");
        Ticket.chooseDocumentType("Паспорт (копия)");
        Ticket.clickAddAttachmentButton();
        Ticket.addAttachmentFromGallery();
        Ticket.clickUploadAttachedFiles();
        Ticket.clickPassportDocumentMiniature();
        Ticket.clickFullScreenModeMenuButton();
        Ticket.clickChangeDocumentTypeButton();
        Ticket.searchDocumentType(documentType);
        Ticket.chooseDocumentType(documentType);
        Ticket.assertIfDocumentTypeChangedSnackBarPresent();
    }

    @Test
    @DisplayName("Change document type to Deposit Agreement")
    @Description("Changing document type to Deposit Agreement")
    @Step("Starting test ID 9526 'testChangeDocumentTypeToDepositAgreement'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testChangeDocumentTypeToDepositAgreement() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);
        //Provide document type here
        String documentType = "Соглашение о задатке";

        Ticket.waitForTicketCard();
        Ticket.clickDocumentsInTicket();
        Ticket.clickPassportDocumentMiniature();
        Ticket.clickFullScreenModeMenuButton();
        Ticket.clickChangeDocumentTypeButton();
        Ticket.searchDocumentType(documentType);
        Ticket.chooseDocumentType(documentType);
    }

    @Test
    @DisplayName("Change document type to Joint Deal Agreement")
    @Description("Changing document type to Joint Deal Agreement")
    @Step("Starting test ID 9527 'testChangeDocumentTypeToJointDealAgreement'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testChangeDocumentTypeToJointDealAgreement() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);
        //Provide document type here
        String documentType = "Соглашение о совместной сделке";

        Ticket.waitForTicketCard();
        Ticket.clickDocumentsInTicket();
        Ticket.clickUploadButton();
        Ticket.searchDocumentType("Паспорт (копия)");
        Ticket.chooseDocumentType("Паспорт (копия)");
        Ticket.clickAddAttachmentButton();
        Ticket.addAttachmentFromGallery();
        Ticket.clickUploadAttachedFiles();
        Ticket.clickPassportDocumentMiniature();
        Ticket.clickFullScreenModeMenuButton();
        Ticket.clickChangeDocumentTypeButton();
        Ticket.searchDocumentType(documentType);
        Ticket.chooseDocumentType(documentType);
        Ticket.assertIfDocumentTypeChangedSnackBarPresent();
    }

    @Test
    @DisplayName("Change document type to Mortgage Balance Statement")
    @Description("Changing document type to Mortgage Balance Statement")
    @Step("Starting test ID 9528 'testChangeDocumentTypeToMortgageBalanceStatement'")
    @Severity(value = SeverityLevel.CRITICAL)
    public void testChangeDocumentTypeToMortgageBalanceStatement() {
        AuthPageObject Auth = AuthPageObjectFactory.get(driver);
        TicketsPageObject Ticket = TicketsPageObjectFactory.get(driver);

        Auth.authorizationRIES(login, password);
        String ticketID = TicketsMethods.CreateTicket();
        Ticket.createAndFindTicketByID(ticketID);
        //Provide document type here
        String documentType = "Справка об остатке(размере) задолженности по ипотеке";

        Ticket.waitForTicketCard();
        Ticket.clickDocumentsInTicket();
        Ticket.clickUploadButton();
        Ticket.searchDocumentType("Паспорт (копия)");
        Ticket.chooseDocumentType("Паспорт (копия)");
        Ticket.clickAddAttachmentButton();
        Ticket.addAttachmentFromGallery();
        Ticket.clickUploadAttachedFiles();
        Ticket.clickPassportDocumentMiniature();
        Ticket.clickFullScreenModeMenuButton();
        Ticket.clickChangeDocumentTypeButton();
        Ticket.searchDocumentType(documentType);
        Ticket.chooseDocumentType(documentType);
        Ticket.assertIfDocumentTypeChangedSnackBarPresent();
    }
}
