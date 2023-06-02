package lib.ui.RIES;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;
import org.openqa.selenium.remote.RemoteWebDriver;


public class ObjectsPageObject extends MainPageObject {

    public ObjectsPageObject(RemoteWebDriver driver) {super(driver);}
    protected static String
            OBJECTS_TAB,
            SEARCH_HISTORY_BUTTON,
            OBJECT_CODE_FIELD,
            OBJECT_CODE_INPUT_FIELD,
            SHOW_OBJECTS_BUTTON,
            HISTORY_SEARCH_OBJECTS_BUTTON,
            MAP_LIST_FILTER,
            OBJECT_PRICE_TPL,
            SEARCH_HISTORY_OBJECT_CODE_TPL,
            ACCEPT_BUTTON,
            SEARCH_TOPBAR_TITLE,
            HISTORY_SEARCH_TOPBAR_TITLE,
            UPPER_PARAM_FIELD,
            OBJECTS_ID,
            READY_NUMBERKEYBOARD_BUTTON,
            MY_OBJECTS_BUTTON,
            LOWER_PARAM_FIELD;

    @Step("Clicking Objects tab")
    public void enterObjectCode(String object_code){
        this.waitForElementPresent(OBJECT_CODE_FIELD, "Cannot see code input field",3);
        this.waitForElementAndClick(OBJECT_CODE_FIELD, "Cannot see code input field", 3);
        this.waitForElementPresent(OBJECT_CODE_INPUT_FIELD,"Cannot find code field");
        this.waitForElementAndSendKeys(OBJECT_CODE_INPUT_FIELD, object_code, "Cannot find and send code field", 3);
    }

    @Step("Clicking Show objects button")
    public void clickSearchObjects(){
        this.waitForElementPresent(SHOW_OBJECTS_BUTTON,"Cannot see Search objects button", 3);
        this.waitForElementAndClick(SHOW_OBJECTS_BUTTON, "Cannot find and click Search objects button", 3);
        this.waitForElementPresent(MAP_LIST_FILTER, "Cannot see map-list filter", 3);
    }

    @Step("Clicking Search history button")
    public void clickShowHistorySearchObjects(){
        this.waitForElementPresent(HISTORY_SEARCH_OBJECTS_BUTTON, "Cannot see Search objects button", 3);
        this.waitForElementAndClick(HISTORY_SEARCH_OBJECTS_BUTTON, "Cannot find and click Search objects button", 3);
        this.waitForElementPresent(MAP_LIST_FILTER, "Cannot see map-list filter", 3);
    }

    @Step("Clicking Accept button in Tip pop-up")
    public void clickPopupAccept(){
        this.waitForElementAndClick(ACCEPT_BUTTON, "Cannot find and click Accept button", 3);
    }

    @Step("Finding object by Price and opening its card")
    private static String getTicketXpathByPrice(String price){
        return OBJECT_PRICE_TPL.replace("{price}", price);
    }
    public void openObjectCardByPrice(String price){
        String object_price_xpath = getTicketXpathByPrice(price);
        this.waitForElementAndClick(
                object_price_xpath,
                "Cannot find Object by price",
                5
        );
    }

    @Step("Asserting if all parameters are present")
    public void assertIfAllParametersPresent(){
//        if (Platform.getInstance().isIOS()){this.waitForElementPresent(OBJECTS_ID,"Cannot see objects id",4);}
        if (this.isElementPresent(UPPER_PARAM_FIELD))
        {
            this.isElementPresent(LOWER_PARAM_FIELD);
        }
            this.waitForElementPresent(
                    UPPER_PARAM_FIELD,
                    "Cannot see some of object parameters",
                    3
            );
    }

    @Step("Clicking Objects tab and Search history button")
    public void backToSearchHistory(){
        this.waitForElementAndClick(OBJECTS_TAB,
                "Cannot find and click Objects tab",
                3);
        this.waitForElementAndClick(SEARCH_HISTORY_BUTTON,
                "Cannot find and click Search history button",
                3);
    }

    @Step("Finding Search history card by Object code")
    private static String getObjectXpathByCode(String object_code){
        return SEARCH_HISTORY_OBJECT_CODE_TPL.replace("{object_code}", object_code);
    }

    @Step("Opening Search history card by Object code")
    public void openHistoryStoryByObjectCode(String object_code){
        String object_code_xpath = getObjectXpathByCode(object_code);
        this.waitForElementAndClick(
                object_code_xpath,
                "Cannot find Object by code",
                5
        );
    }
    @Step("Tap element by coordinates to close the keyboard")
    public void tapElementByCoordinates(){
        TouchAction action = new TouchAction((PerformsTouchActions) driver);
        action.press(PointOption.point(950, 2050))
                .release()
                .perform();
    }

    @Step("Taping first object in the Objects list")
    public void tapFirstObjectInTheList(){
        TouchAction action = new TouchAction((PerformsTouchActions) driver);
        action.tap(PointOption.point(200, 300))
                .release()
                .perform();
    }

    @Step("Taping first object in the Objects list")
    public void tapFirstHistorySearchObjectInTheList() {
        this.waitForElementPresent(HISTORY_SEARCH_TOPBAR_TITLE, "Cannot see Search topbar", 5);
        this.tapByCoordinates(360,140);
    }
    @Step("Tap element by coordinates to close number keyboard")
    public void tapMyObjects(){
        this.waitForElementAndClick(MY_OBJECTS_BUTTON,"Cannot find and click Objects button",4);
    }

    public void tapDoneOnKeyboard(){
        this.waitForElementAndClick(READY_NUMBERKEYBOARD_BUTTON, "Cannot find and click Done keyboards button",3);
    }
}
