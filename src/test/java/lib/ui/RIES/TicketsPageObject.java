package lib.ui.RIES;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;
import lib.Platform;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TicketsPageObject extends MainPageObject {

    public TicketsPageObject(RemoteWebDriver driver) {super(driver);}

    protected static String
            OBJECTS_TAB,
            TICKETS_TAB,
            CREATE_NEW_TICKET_BUTTON,
            INNER_TICKETS_BUTTON,
            MORTGAGE_INNER_TICKET_TYPE,
            MORTGAGE_ARGUMENTS_TYPES,
            MORTGAGE_ARGUMENTS_NOTHINGOFTHESE,
            CONTACT_WAYS_BS,
            CONTACT_WAY_PHONE,
            CONTACT_WAY_EMAIL,
            CONTACT_WAY_TELEGRAM,
            CONTACT_WAY_VIBER,
            CONTACT_WAY_WHATSAPP,
            CONTACT_WAY_DONE,
            CREATE_MORTGAGE_TICKET_BUTTON,
            MORTGAGE_TICKET_IN_INNER_TICKETS_LIST,
            MORTGAGE_AVAILABLE_MONEY_AMOUNT,
            MORTGAGE_AVAILABLE_MONEY_AMOUNT_TEXT_FIELD,
            MORTGAGE_ESTATE_PRICE_AMOUNT,
            MORTGAGE_ESTATE_PRICE_AMOUNT_TEXT_FIELD,
            MORTGAGE_CREATE_COMMENTARY_FIELD,
            MORTGAGE_CREATE_COMMENTARY_FIELD_TEXT_FIELD,
            CREATE_INNER_TICKET_BUTTON,
            SAVE_TICKET_BUTTON,
            TOPBAR_BACK_BUTTON,
            PHONE_NUMBER_FIELD,
            EDIT_PHONE_NUMBER_FIELD,
            TICKETS_CLIENT_NAME,
            CONTINUE_BUTTON_CREATE_TICKET,
            DEAL_TYPE_TICKET_BUTTON,
            DEAL_TYPE_BUY,
            TICKET_TITLE_FIELD,
            EDIT_TICKET_TITLE_FIELD,
            CLIENT_NAME_FOR_TICKET_FIELD,
            EDIT_CLIENT_NAME_FOR_TICKET_FIELD,
            CREATE_TICKET_COMMENTARY_FIELD,
            EDIT_CREATE_TICKET_COMMENTARY_FIELD,
            TICKETS_TYPE_MODAL,
            BUY_GARAGE_TICKET_TYPE,
            SELL_FLATS_TYPE,
            CLIENTS_FIO_ON_TICKET_CARD_TPL,
            CLOSE_CROSS_BUTTON,
            CREATE_OBJECT_BUTTON,
            TYPE_OF_ESTATE_BS,
            TYPE_OF_ESTATE_GARAGE,
            CITY_FILTER,
            CITY_IS_TYUMEN,
            APPROVE_CITY_IS_TYUMEN,
            TYPE_OF_ESTATE_IS_FLAT,
            REGION_FILTER_FOR_ADDRESS,
            REGION_IS_2MCR,
            STREET_FILTER_FOR_ADDRESS,
            STREET_IS_1MCR,
            HOUSE_NUMBER_FILED,
            HOUSE_NUMBER_FILED_EDIT,
            FLAT_NUMBER_FILED,
            FLAT_NUMBER_FILED_EDIT,
            ENTRANCE_SECTION_FILED,
            ENTRANCE_SECTION_FILED_EDIT,
            CONTINUE_BUTTON,
            WALLS_MATERIAL_FILTER,
            TYPE_OF_WALL_IS_BLOCKS,
            SERIES_FILTER,
            SERIES_TYPE_IS_121,
            FLOORS_COUNT_FIELD,
            FLOORS_COUNT_FIELD_EDIT,
            PRICE_FIELD,
            PRICE_FIELD_EDIT,
            ROOMS_COUNT_FIELD,
            ROOMS_COUNT_FIELD_EDIT,
            PLAN_TYPE,
            PLAN_TYPE_IS_TYPICAL,
            LOADER,
            SQUARE_OF_ESTATE_FIELD,
            SQUARE_OF_ESTATE_FIELD_EDIT,
            SQUARE_OF_KITCHEN_FIELD,
            SQUARE_OF_KITCHEN_FIELD_EDIT,
            FLOORS_NUMBER_FIELD,
            FLOORS_NUMBER_FIELD_EDIT,
            DESIGN_TYPE,
            DESIGN_TYPE_IS_MODERN,
            DESCRIPTION_FIELD,
            DESCRIPTION_FIELD_EDIT,
            NOTE_FOR_MYSELF,
            NOTE_FOR_MYSELF_EDIT,
            NOTE_FOR_REALTOR,
            NOTE_FOR_REALTOR_EDIT,
            SAVE_CREATED_OBJECT_BUTTON,
            OBJECT_STATUS_N_ID_IN_TICKET,
            OBJECT_ADDRESS_IN_TICKET,
            TICKET_NAME_AT1,
            CANCEL_DOUBLE_CHECK_BUTTON,
            BUY_FLAT_TICKET_TYPE,
            TICKETS_TOP_BAR;

    @Step("Clicking Tickets tab")
    public void clickTicketsTab() {
        this.waitForElementPresent(TICKETS_TAB,"Cannot see Tickets tab",5);
        this.waitForElementAndClick(TICKETS_TAB,
                "Cannot see and click Tickets tab",
                5);
    }

    @Step("Clicking Create new ticket button")
    public void clickCreateNewTicketButton(){
        this.waitForElementPresent(CREATE_NEW_TICKET_BUTTON,
                "This is not Tickets Tab",
                5);
        this.waitForElementAndClick(CREATE_NEW_TICKET_BUTTON,
                "Cannot find and click Create ticket button",
                3);
    }

    @Step("Entering clients name and phone number by string")
    public void createNewTicket(String phone_number, String first_name){
        this.waitForElementPresent(PHONE_NUMBER_FIELD, "Cannot see phone number field",3);
        this.waitForElementAndClick(PHONE_NUMBER_FIELD, "Cannot find and click search init element", 2);
        this.waitForElementAndSendKeys(EDIT_PHONE_NUMBER_FIELD, phone_number, "Cannot send phone number", 3);
        this.waitForElementPresent(CLIENT_NAME_FOR_TICKET_FIELD, "Cannot see phone number field",3);
        this.waitForElementAndClick(CLIENT_NAME_FOR_TICKET_FIELD, "Cannot find and click search init element", 2);
        this.waitForElementAndSendKeys(EDIT_CLIENT_NAME_FOR_TICKET_FIELD, first_name, "Cannot send client name number", 3);
        this.tapByCoordinates(1,100);
    }

    @Step("Entering clients phone number by string")
    public void firstStepCreatingTicket(String phone_number){
        this.waitForElementPresent(PHONE_NUMBER_FIELD, "Cannot see phone number field",3);
        this.waitForElementAndClick(PHONE_NUMBER_FIELD, "Cannot find and click search init element", 2);
        this.waitForElementAndSendKeys(EDIT_PHONE_NUMBER_FIELD, phone_number, "Cannot send phone number", 3);
        this.waitForElementPresent(TICKETS_CLIENT_NAME,"Cannot find ticket by client's name",3);
        this.waitForElementAndClick(CONTINUE_BUTTON_CREATE_TICKET,"Cannot find and click Continue button",3);
    }

    @Step("Entering clients name, tickets title and commentary")
    public void secondStepCreatingTicket(String ticket_title, String commentary){
        this.waitForElementPresent(DEAL_TYPE_TICKET_BUTTON, "Cannot see deal type button",3);
        this.waitForElementAndClick(TICKET_TITLE_FIELD,"Cannot find and click ticket's title filed",3);
        this.waitForElementAndSendKeys(EDIT_TICKET_TITLE_FIELD,ticket_title,"Cannot find and send keys in ticket's title filed",3);
        this.waitForElementAndClick(DEAL_TYPE_TICKET_BUTTON,"Cannot find and click ticket type button",3);
        this.waitForElementPresent(DEAL_TYPE_BUY,"Cannot see deal type Buy button",3);
        this.waitForElementAndClick(DEAL_TYPE_BUY,"Cannot find and click Buy button",3);
        this.waitForElementPresent(SAVE_TICKET_BUTTON, "Cannot see deal type button",3);
        this.waitForElementAndClick(TYPE_OF_ESTATE_BS,"Cannot find and open type of state bottom-sheet",3);
        this.waitForElementPresent(TYPE_OF_ESTATE_GARAGE,"Cannot see Garage type of the estate",3);
        this.waitForElementAndClick(TYPE_OF_ESTATE_GARAGE,"Cannot find and click Garage type of the estate",3);
        this.waitForElementPresent(CREATE_TICKET_COMMENTARY_FIELD,"Cannot see commentary field",3);
        this.waitForElementAndClick(CREATE_TICKET_COMMENTARY_FIELD,"Cannot find and click commentary field",3);
        this.waitForElementAndSendKeys(EDIT_CREATE_TICKET_COMMENTARY_FIELD,commentary,"Cannot find and send keys in commentary filed",3);
    }

    @Step("Entering clients name and phone number by string")
    public void swipeTillCommentsField(){
        if (Platform.getInstance().isAndroid()){
        this.swipeUpToFindElement(CREATE_TICKET_COMMENTARY_FIELD, "Cannot swipe and find commentary field", 2);
        this.waitForElementPresent(CREATE_TICKET_COMMENTARY_FIELD, "Cannot find commentary field", 2);}
    }

    @Step("Opening Ticket type modal in the Ticket")
    public void openTicketTypeModal(){
        this.waitForElementPresent(BUY_FLAT_TICKET_TYPE,"Cannot see Tickets type button",5);
        this.waitForElementAndClick(BUY_FLAT_TICKET_TYPE,"Cannot see and click Buy Flat ticket type",4);
    }
    @Step("Taping first object in the Objects list")
    public void tapTicketTypeModal() {
        this.tapByCoordinates(186,520);
    }

    @Step("Changing Ticket type to Buy garage")
    public void changeTicketTypeToBuyGarage(){
        this.swipeUpToFindElement(BUY_GARAGE_TICKET_TYPE,"Cannot find garage type by swiping", 3);
        this.waitForElementAndClick(BUY_GARAGE_TICKET_TYPE, "Cannot see Sell Garage ticket type", 3);
    }
    public void swipeTillReach(){
        if (Platform.getInstance().isAndroid()) {
            this.swipeUpToFindElement(
                    BUY_GARAGE_TICKET_TYPE,
                    "Cannot find the end of the article",
                    5
            );
        } else if (Platform.getInstance().isIOS()) {
            this.swipeUpTillElementAppear(BUY_GARAGE_TICKET_TYPE,
                    "Cannot find the end of the article",
                    40);
        } else {
            this.scrollWebPageTillElementNotVisible(
                    BUY_GARAGE_TICKET_TYPE,
                    "Cannot find the end of the article",
                    40
            );
        }
    }

    @Step("Clicking Save ticket and closing Doubles check screen")
    public void createCurrentTicket(){
        this.waitForElementPresent(SAVE_TICKET_BUTTON, "Cannot see Save button on the screen",3);
        this.waitForElementAndClick(SAVE_TICKET_BUTTON, "Cannot see Save button on the screen",3);
    }

    @Step("Clicking Back button")
    public void pressBack(){
        this.waitForElementPresent(TOPBAR_BACK_BUTTON,"Cannot see Back button",3);
        this.waitForElementAndClick(TOPBAR_BACK_BUTTON,"Cannot find and click Back button",3);
    }

    @Step("Going to Inner Tickets screen")
    public void goToInnerTicketsScreen(){
        this.waitForElementPresent(INNER_TICKETS_BUTTON, "Cannot see Save button on the screen",3);
        this.waitForElementAndClick(INNER_TICKETS_BUTTON, "Cannot see Save button on the screen",3);
    }

    @Step("Pressing Create Inner Tickets button")
    public void pressCreateInnerTicketButton(){
        this.waitForElementPresent(CREATE_INNER_TICKET_BUTTON, "Cannot see Save button on the screen",3);
        this.waitForElementAndClick(CREATE_INNER_TICKET_BUTTON, "Cannot see Save button on the screen",3);
    }

    @Step("Choosing Mortgage as Inner ticket's type")
    public void chooseMortgageType(){
        this.waitForElementPresent(MORTGAGE_INNER_TICKET_TYPE, "Cannot see Save button on the screen",3);
        this.waitForElementAndClick(MORTGAGE_INNER_TICKET_TYPE, "Cannot see Save button on the screen",3);
    }

    @Step("Filling in Mortgage parameters")
    public void fillInMortgageParameters(){
        this.waitForElementPresent(MORTGAGE_ARGUMENTS_TYPES, "Cannot see Mortgage arguments types button",3);
        this.waitForElementAndClick(MORTGAGE_ARGUMENTS_TYPES, "Cannot see and press Mortgage arguments types button",3);
        if(Platform.getInstance().isIOS()){this.tapByCoordinates(200,770);}else{
        this.waitForElementAndClick(MORTGAGE_ARGUMENTS_NOTHINGOFTHESE,"Cannot see and click the argument",3);}//Choose the mortgage argument
        if (Platform.getInstance().isAndroid()){this.waitForElementAndClick(MORTGAGE_AVAILABLE_MONEY_AMOUNT, "Cannot see and click available money amount",3);
        this.waitForElementAndSendKeys(MORTGAGE_AVAILABLE_MONEY_AMOUNT_TEXT_FIELD, "2350000","Cannot find and send available money amount",3);}
        this.waitForElementAndSendKeys(MORTGAGE_AVAILABLE_MONEY_AMOUNT, "2350000","Cannot find and send available money amount",3);
        if (Platform.getInstance().isAndroid()){this.waitForElementAndClick(MORTGAGE_ESTATE_PRICE_AMOUNT, "Cannot see and click estate price amount",3);
        this.waitForElementAndSendKeys(MORTGAGE_ESTATE_PRICE_AMOUNT_TEXT_FIELD, "5125000","Cannot find and send estate price amount",3);}
        this.waitForElementAndSendKeys(MORTGAGE_ESTATE_PRICE_AMOUNT, "5125000","Cannot find and send estate price amount",3);
        if (Platform.getInstance().isIOS()){this.tapByCoordinates(1,140);}
//        else {this.hideKeyboard();}//Hide keyboard
        //Checking four contact ways and press Done
        this.waitForElementPresent(CONTACT_WAYS_BS, "Cannot see Contact ways BS button",3);
        this.waitForElementAndClick(CONTACT_WAYS_BS, "Cannot see and open Contact ways BS button", 3);
        if(Platform.getInstance().isIOS()){this.tapByCoordinates(200,530);//Tick contact via phone
        this.tapByCoordinates(200,570);//Tick contact via e-mail
        this.tapByCoordinates(200,690);//Tick contact via Telegram
        this.tapByCoordinates(200,740);//Tick contact via Viber
        this.tapByCoordinates(200,780);//Tick contact via Whatsapp
        this.tapByCoordinates(355,440);}//Press Done
        else {
            this.waitForElementAndClick(CONTACT_WAY_PHONE,"Cannot see and click Phone",3);
            this.waitForElementAndClick(CONTACT_WAY_EMAIL,"Cannot see and click e-mail",3);
            this.waitForElementAndClick(CONTACT_WAY_TELEGRAM,"Cannot see and click Telegram",3);
            this.waitForElementAndClick(CONTACT_WAY_VIBER,"Cannot see and click Viber",3);
            this.waitForElementAndClick(CONTACT_WAY_WHATSAPP,"Cannot see and click Whatsapp",3);
            this.waitForElementAndClick(CONTACT_WAY_DONE,"Cannot see and click Done",3);
        }
        //Making comment and hiding keyboard
        this.waitForElementPresent(MORTGAGE_CREATE_COMMENTARY_FIELD, "Cannot see Save button on the screen",3);
        if (Platform.getInstance().isAndroid()){this.waitForElementAndClick(MORTGAGE_CREATE_COMMENTARY_FIELD, "Cannot see and click a commentary creating mortgage ticket",3);
        this.waitForElementAndSendKeys(MORTGAGE_CREATE_COMMENTARY_FIELD_TEXT_FIELD, "Тестовая заявка на ипотеку","Cannot find and send a commentary creating mortgage ticket",3);}
        this.waitForElementAndSendKeys(MORTGAGE_CREATE_COMMENTARY_FIELD, "Тестовая заявка на ипотеку","Cannot find and send a commentary creating mortgage ticket",3);
        if (Platform.getInstance().isIOS()){this.tapByCoordinates(1,140);}
        else {this.tapByCoordinates(1000,1700);}
    }

    @Step("Pressing Create button to create a Mortgage ticket")
    public void pressCreateMortgageTicketButton(){
        this.waitForElementNotPresent(LOADER, "Can see Loader", 5);
        this.waitForElementPresent(CREATE_MORTGAGE_TICKET_BUTTON, "Cannot see Save button on the screen",3);
        this.waitForElementAndClick(CREATE_MORTGAGE_TICKET_BUTTON, "Cannot see Save button on the screen",3);
    }

    @Step("Checking is Ticket is created")
    public void assertIfMortgageTicketCreated(){
        this.waitForElementPresent(MORTGAGE_TICKET_IN_INNER_TICKETS_LIST, "Cannot find created Mortgage ticket", 5);
    }

    @Step("Getting Ticket xpath by client name")
    private static String getTicketXpathByClientName(String first_name)
    {
        return CLIENTS_FIO_ON_TICKET_CARD_TPL.replace("{first_name}", first_name);
    }

    @Step("Opening ticket by client name")
    public void openTicketByName(String first_name) {
        String folder_name_xpath = getTicketXpathByClientName(first_name);
        this.waitForElementAndClick(
                folder_name_xpath,
                "Cannot find created folder" + first_name,
                10);
    }

    @Step("Checking if Ticket is created")
    public void assertIfTicketIsCreated(String first_name){
        String folder_name_xpath = getTicketXpathByClientName(first_name);
        this.waitForElementAndClick(
                folder_name_xpath,
                "Cannot find created folder" + first_name,
                10
        );
    }

    @Step("First step of creating a certain Flat object")
    public void createFlatObjectFirstStep() {
        this.waitForElementNotPresent(LOADER, "Still can see the loader", 4);
        this.waitForElementPresent(CREATE_OBJECT_BUTTON, "Cannot find and click Create object button", 3);
        this.waitForElementAndClick(CREATE_OBJECT_BUTTON, "Cannot find and click Create object button", 4);
        this.waitForElementAndClick(TYPE_OF_ESTATE_BS, "Cannot find and click Type of estate button", 5);

        if (Platform.getInstance().isIOS()) {
            this.tapByCoordinates(150, 550);
        } else {
            this.waitForElementAndClick(TYPE_OF_ESTATE_IS_FLAT, "Cannot find and click Flat", 3);
        }

        this.waitForElementAndClick(CITY_FILTER, "Cannot find and click City filter button", 3);
        this.waitForElementAndSendKeys(CITY_IS_TYUMEN, "Тюме", "Cannot find and click Tyumen city", 3);
        this.waitForElementAndClick(APPROVE_CITY_IS_TYUMEN, "Cannot find and click Tyumen city", 3);
        this.waitForElementAndClick(REGION_FILTER_FOR_ADDRESS, "Cannot find and click Region filter", 3);
        this.waitForElementAndClick(REGION_IS_2MCR, "Cannot find and click 2MCR region", 3);
        this.waitForElementAndClick(STREET_FILTER_FOR_ADDRESS, "Cannot find and click Street filter", 3);
        this.waitForElementAndClick(STREET_IS_1MCR, "Cannot find and click 1MCR Street", 3);
        this.waitForElementAndClick(HOUSE_NUMBER_FILED, "Cannot find and click House number filed", 3);
        this.waitForElementAndSendKeys(HOUSE_NUMBER_FILED_EDIT, "11", "Cannot find and send House number", 3);

        if (Platform.getInstance().isIOS()) {
            this.tapByCoordinates(1, 150);
        } else {
            this.hideKeyboard();
        }

        this.waitForElementAndClick(FLAT_NUMBER_FILED, "Cannot find and click Flat number field", 3);
        this.waitForElementAndSendKeys(FLAT_NUMBER_FILED_EDIT, "2", "Cannot find and send Flat number", 3);

        if (Platform.getInstance().isIOS()) {
            this.tapByCoordinates(1, 150);
        } else {
            this.tapByCoordinates(950, 1700);
        }

        this.waitForElementAndClick(ENTRANCE_SECTION_FILED, "Cannot find and click Entrance field", 3);
        this.waitForElementAndSendKeys(ENTRANCE_SECTION_FILED_EDIT, "3", "Cannot find and click Entrance field", 3);

        if (Platform.getInstance().isIOS()) {
            this.tapByCoordinates(1, 150);
        } else {
            this.tapByCoordinates(950, 1700);
        }

        this.waitForElementPresent(CONTINUE_BUTTON, "Cannot find Continue button", 4);
        this.waitForElementAndClick(CONTINUE_BUTTON, "Cannot find and click Continue button", 3);
    }

    @Step("First step of creating certain Flat object")
    public void createFlatObjectSecondStep()
    {
        this.waitForElementAndClick(WALLS_MATERIAL_FILTER,"Cannot find and click Walls material filter",3);
        this.waitForElementAndClick(TYPE_OF_WALL_IS_BLOCKS,"Cannot find and set Wall materials as Blocks",3);
        this.waitForElementAndClick(SERIES_FILTER,"Cannot find and click Series filter",3);
        this.waitForElementAndClick(SERIES_TYPE_IS_121,"Cannot find and set Series type as 121",3);
        this.waitForElementAndClick(FLOORS_COUNT_FIELD,"Cannot find and click Floors count field",3);
        this.waitForElementAndSendKeys(FLOORS_COUNT_FIELD_EDIT,"4","Cannot find and click Floors count field",3);

        if (Platform.getInstance().isIOS()) {
            this.tapByCoordinates(1, 150);
        } else {
            this.tapByCoordinates(950, 1700);
        }
        this.waitForElementAndClick(PRICE_FIELD,"Cannot find and click Price field",3);
        this.waitForElementAndSendKeys(PRICE_FIELD_EDIT,"2000","Cannot find and click Price field",3);

        if (Platform.getInstance().isIOS()) {
            this.tapByCoordinates(1, 150);
        } else {
            this.tapByCoordinates(950, 1700);
        }

        this.waitForElementAndClick(ROOMS_COUNT_FIELD, "Cannot see and clik Room count field",3);
        this.waitForElementAndSendKeys(ROOMS_COUNT_FIELD_EDIT,"5", "Cannot see and clik Room count field",3);

        if (Platform.getInstance().isIOS()) {
            this.tapByCoordinates(1, 150);
        } else {
            this.tapByCoordinates(950, 1700);
        }
        this.waitForElementAndClick(PLAN_TYPE,"Cannot find and click Plan type filter",3);

        if (Platform.getInstance().isAndroid()) {
            this.waitForElementAndClick(PLAN_TYPE_IS_TYPICAL, "Cannot see and set Typical plan", 3);
        }else {
            this.tapByCoordinates(200,700);
        }

        this.waitForElementAndClick(SQUARE_OF_ESTATE_FIELD,"Cannot see and click Estate square field",3);
        this.waitForElementAndSendKeys(SQUARE_OF_ESTATE_FIELD_EDIT,"100","Cannot see and send Estate square",3);

        if (Platform.getInstance().isIOS()) {
            this.tapByCoordinates(1, 150);
        } else {
            this.tapByCoordinates(950, 1700);
        }
        this.waitForElementAndClick(SQUARE_OF_KITCHEN_FIELD,"Cannot see and click Kitchen square field",3);
        this.waitForElementAndSendKeys(SQUARE_OF_KITCHEN_FIELD_EDIT,"10","Cannot see and send Kitchen square",3);

        if (Platform.getInstance().isIOS()) {
            this.tapByCoordinates(1, 150);
        } else {
            this.tapByCoordinates(950, 1700);
        }
        this.waitForElementAndClick(FLOORS_NUMBER_FIELD,"Cannot see and click Floor number field",3);
        this.waitForElementAndSendKeys(FLOORS_NUMBER_FIELD_EDIT,"6","Cannot see and send Kitchen square",3);

        if (Platform.getInstance().isIOS()) {
            this.tapByCoordinates(1, 150);
        } else {
            this.tapByCoordinates(950, 1700);
        }
        this.waitForElementAndClick(DESIGN_TYPE,"Cannot see and click Design type filter",3);

        if (Platform.getInstance().isAndroid()) {this.waitForElementAndClick(DESIGN_TYPE_IS_MODERN,"Cannot see and click Modern design type",3);}
        else {
            this.tapByCoordinates(200, 700);
        }

        this.waitForElementAndClick(CONTINUE_BUTTON,"Cannot find and click Continue button",3);
    }

    @Step("First step of creating certain Flat object")
    public void createFlatObjectThirdStep(){
        this.waitForElementAndClick(DESCRIPTION_FIELD, "Cannot see Description field", 3);
        this.waitForElementAndSendKeys(DESCRIPTION_FIELD_EDIT, "Мое описание объекта","Cannot see and send Description", 3);

        if (Platform.getInstance().isIOS()) {
            this.tapByCoordinates(1, 150);
        } else {
            this.tapByCoordinates(950, 1700);
        }
        this.waitForElementAndClick(NOTE_FOR_MYSELF, "Cannot see Note for myself field", 3);
        this.waitForElementAndSendKeys(NOTE_FOR_MYSELF_EDIT, "Мое описание для себя","Cannot see and send Note for myself", 3);
        this.waitForElementAndClick(NOTE_FOR_REALTOR,"Cannot see Note for realtor field", 3);
        this.waitForElementAndSendKeys(NOTE_FOR_REALTOR_EDIT,"Мое описание для риелтора", "Cannot see and send Note for realtor", 3);

        if (Platform.getInstance().isIOS()) {
            this.tapByCoordinates(1, 150);
        } else {
            this.tapByCoordinates(950, 1700);
        }
        this.waitForElementPresent(SAVE_CREATED_OBJECT_BUTTON,"Cannot see Create object button", 3);
        this.waitForElementAndClick(SAVE_CREATED_OBJECT_BUTTON,"Cannot see and click Create object button", 3);
        this.waitForElementNotPresent(LOADER, "Still can see loader",4);
    }

    @Step("Checking if created object parameters are correct")
    public void checkCreatedObjectParameters() {
        this.waitForElementPresent(OBJECT_ADDRESS_IN_TICKET, "Cannot see object address in the ticket", 3);
        if (this.isElementPresent(OBJECT_STATUS_N_ID_IN_TICKET)) {
            this.isElementPresent(OBJECT_ADDRESS_IN_TICKET);
        }
        this.waitForElementPresent(
                OBJECT_STATUS_N_ID_IN_TICKET,
                "Cannot see some of object parameters",
                3
        );
    }

    @Step("Tap element by coordinates to close the keyboard")
    public void tapElementByCoordinates(){
            TouchAction action = new TouchAction((PerformsTouchActions) driver);
            action.press(PointOption.point(950, 2050))
                    .release()
                    .perform();
    }
}