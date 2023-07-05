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
            SAVE_TICKET_BUTTON,
            PHONE_NUMBER_FIELD,
            EDIT_PHONE_NUMBER_FIELD,
            CLIENT_NAME_FOR_TICKET_FIELD,
            EDIT_CLIENT_NAME_FOR_TICKET_FIELD,
            CREATE_TICKET_COMMENTARY_FIELD,
            TICKETS_TYPE_MODAL,
            BUY_GARAGE_TICKET_TYPE,
            SELL_FLATS_TYPE,
            CLIENTS_FIO_ON_TICKET_CARD_TPL,
            CLOSE_CROSS_BUTTON,
            CREATE_OBJECT_BUTTON,
            TYPE_OF_ESTATE,
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
            RETURN_BUTTON,
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
                7);
    }

    @Step("Entering clients name and phone number by string")
    public void createNewTicket(String phone_number, String first_name){
        this.waitForElementPresent(PHONE_NUMBER_FIELD, "Cannot see phone number field",3);
        this.waitForElementAndClick(PHONE_NUMBER_FIELD, "Cannot find and click search init element", 2);
        this.waitForElementAndSendKeys(EDIT_PHONE_NUMBER_FIELD, phone_number, "Cannot send phone number", 3);
        this.waitForElementPresent(CLIENT_NAME_FOR_TICKET_FIELD, "Cannot see phone number field",3);
        this.waitForElementAndClick(CLIENT_NAME_FOR_TICKET_FIELD, "Cannot find and click search init element", 2);
        this.waitForElementAndSendKeys(EDIT_CLIENT_NAME_FOR_TICKET_FIELD, first_name, "Cannot send client name number", 3);
        if(Platform.getInstance().isIOS()){
            this.waitForElementPresent(RETURN_BUTTON,"Cannot see Return",2);
            this.waitForElementAndClick(RETURN_BUTTON,"Cannot find and click Return",3);
        }
    }

    @Step("Entering clients name and phone number by string")
    public void initializeCreatingNewTicket(String phone_number, String first_name){
        this.waitForElementPresent(PHONE_NUMBER_FIELD, "Cannot see phone number field",3);
        this.waitForElementAndClick(PHONE_NUMBER_FIELD, "Cannot find and click search init element", 2);
        this.waitForElementAndSendKeys(EDIT_PHONE_NUMBER_FIELD, phone_number, "Cannot send phone number", 3);
        this.waitForElementAndClick(CLIENT_NAME_FOR_TICKET_FIELD, "Cannot find and click search init element", 2);
        this.waitForElementAndSendKeys(EDIT_CLIENT_NAME_FOR_TICKET_FIELD, first_name, "Cannot send client name number", 3);
//        if (Platform.getInstance().isIOS()){this.tapOutside();}
    }

    @Step("Entering clients name and phone number by string")
    public void swipeTillCommentsField(){
        if (Platform.getInstance().isAndroid()){
        this.swipeUpToFindElement(CREATE_TICKET_COMMENTARY_FIELD, "Cannot swipe and find commentary field", 2);
        this.waitForElementPresent(CREATE_TICKET_COMMENTARY_FIELD, "Cannot find commentary field", 2);}
    }

    @Step("Opening Ticket type modal in the Ticket")
    public void openTicketTypeModal(){
        this.waitForElementPresent(TICKETS_TYPE_MODAL,"Cannot see Tickets type button",5);
        this.waitForElementAndClick(TICKETS_TYPE_MODAL, "Cannot see Tickets type button",4);
        this.waitForElementPresent(BUY_FLAT_TICKET_TYPE,"Cannot see Buy Flat ticket type",4);
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
        this.waitForElementPresent(CLOSE_CROSS_BUTTON, "Cannot see Close button on doubles check screen",3);
        this.waitForElementAndClick(CLOSE_CROSS_BUTTON, "Cannot see Close button on doubles check screen",3);
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

    @Step("Checking is Ticket is created")
    public void assertIfTicketIsCreated(String first_name){
        String folder_name_xpath = getTicketXpathByClientName(first_name);
        this.waitForElementAndClick(
                folder_name_xpath,
                "Cannot find created folder" + first_name,
                10
        );
    }

    @Step("First step of creating certain Flat object")
    public void createFlatObjectFirstStep(){
        this.waitForElementNotPresent(LOADER,"Still can see the loader", 4);
        this.waitForElementPresent(CREATE_OBJECT_BUTTON, "Cannot find and click Create object button",3);
        this.waitForElementAndClick(CREATE_OBJECT_BUTTON, "Cannot find and click Create object button",4);
        this.waitForElementAndClick(TYPE_OF_ESTATE, "Cannot find and click Type of estate button", 5);
        this.waitForElementAndClick(TYPE_OF_ESTATE_IS_FLAT, "Cannot find and click Flat", 3);
        this.waitForElementAndClick(CITY_FILTER, "Cannot find and click City filter button", 3);
        this.waitForElementAndSendKeys(CITY_IS_TYUMEN,"Тюме","Cannot find and click Tyumen city", 3);
        this.waitForElementAndClick(APPROVE_CITY_IS_TYUMEN,"Cannot find and click Tyumen city", 3);
        this.waitForElementAndClick(REGION_FILTER_FOR_ADDRESS,"Cannot find and click Region filter",3);
        this.waitForElementAndClick(REGION_IS_2MCR,"Cannot find and click 2MCR region",3);
        this.waitForElementAndClick(STREET_FILTER_FOR_ADDRESS,"Cannot find and click Street filter",3);
        this.waitForElementAndClick(STREET_IS_1MCR,"Cannot find and click 1MCR Street",3);
        this.waitForElementAndClick(HOUSE_NUMBER_FILED,"Cannot find and click House number filed",3);
        this.waitForElementAndSendKeys(HOUSE_NUMBER_FILED_EDIT,"11","Cannot find and send House number",3);
        this.waitForElementAndClick(FLAT_NUMBER_FILED,"Cannot find and click Flat number field",3);
        this.waitForElementAndSendKeys(FLAT_NUMBER_FILED_EDIT,"2","Cannot find and send Flat number",3);
        this.tapElementByCoordinates();
        this.waitForElementAndClick(ENTRANCE_SECTION_FILED,"Cannot find and click Entrance field",3);
        this.waitForElementAndSendKeys(ENTRANCE_SECTION_FILED_EDIT,"3","Cannot find and click Entrance field",3);
        this.tapElementByCoordinates();
        this.waitForElementPresent(CONTINUE_BUTTON,"Cannot find Continue button",4);
        this.waitForElementAndClick(CONTINUE_BUTTON,"Cannot find and click Continue button",3);
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
        this.tapElementByCoordinates();
        this.waitForElementAndClick(PRICE_FIELD,"Cannot find and click Price field",3);
        this.waitForElementAndSendKeys(PRICE_FIELD_EDIT,"2000","Cannot find and click Price field",3);
        this.tapElementByCoordinates();
        this.waitForElementAndClick(ROOMS_COUNT_FIELD, "Cannot see and clik Room count field",3);
        this.waitForElementAndSendKeys(ROOMS_COUNT_FIELD_EDIT,"5", "Cannot see and clik Room count field",3);
        this.tapElementByCoordinates();
        this.waitForElementAndClick(PLAN_TYPE,"Cannot find and click Plan type filter",3);
        this.waitForElementAndClick(PLAN_TYPE_IS_TYPICAL, "Cannot see and set Typical plan", 3);
        this.waitForElementAndClick(SQUARE_OF_ESTATE_FIELD,"Cannot see and click Estate square field",3);
        this.waitForElementAndSendKeys(SQUARE_OF_ESTATE_FIELD_EDIT,"100","Cannot see and send Estate square",3);
        this.tapElementByCoordinates();
        this.waitForElementAndClick(SQUARE_OF_KITCHEN_FIELD,"Cannot see and click Kitchen square field",3);
        this.waitForElementAndSendKeys(SQUARE_OF_KITCHEN_FIELD_EDIT,"10","Cannot see and send Kitchen square",3);
        this.tapElementByCoordinates();
        this.waitForElementAndClick(FLOORS_NUMBER_FIELD,"Cannot see and click Floor number field",3);
        this.waitForElementAndSendKeys(FLOORS_NUMBER_FIELD_EDIT,"6","Cannot see and send Kitchen square",3);
        this.tapElementByCoordinates();
        this.waitForElementAndClick(DESIGN_TYPE,"Cannot see and click Design type filter",3);
        this.waitForElementAndClick(DESIGN_TYPE_IS_MODERN,"Cannot see and click Modern design type",3);
        this.waitForElementAndClick(CONTINUE_BUTTON,"Cannot find and click Continue button",3);
    }

    @Step("First step of creating certain Flat object")
    public void createFlatObjectThirdStep(){
        this.waitForElementAndClick(DESCRIPTION_FIELD, "Cannot see Description field", 3);
        this.waitForElementAndSendKeys(DESCRIPTION_FIELD_EDIT, "Мое описание объекта","Cannot see and send Description", 3);
        this.tapElementByCoordinates();
        this.waitForElementAndClick(NOTE_FOR_MYSELF, "Cannot see Note for myself field", 3);
        this.waitForElementAndSendKeys(NOTE_FOR_MYSELF_EDIT, "Мое описание для себя","Cannot see and send Note for myself", 3);
        this.waitForElementAndClick(NOTE_FOR_REALTOR,"Cannot see Note for realtor field", 3);
        this.waitForElementAndSendKeys(NOTE_FOR_REALTOR_EDIT,"Мое описание для риелтора", "Cannot see and send Note for realtor", 3);
        this.tapElementByCoordinates();
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

    @Step("Tap element by coordinates to close the keyboard")
    public void tapTicketTypeModal(){
        TouchAction action = new TouchAction((PerformsTouchActions) driver);
        action.press(PointOption.point(150, 520))
                .release()
                .perform();
    }
    public void generateRandomTicketName(){
    RandomGenerator randomTicket = new RandomGenerator();
        randomTicket.generateRandomTicketName();}
}