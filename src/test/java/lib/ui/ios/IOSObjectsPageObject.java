package lib.ui.ios;

import lib.ui.RIES.ObjectsPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class IOSObjectsPageObject extends ObjectsPageObject {

    public IOSObjectsPageObject(RemoteWebDriver driver) {super(driver);}
    static {
        OBJECTS_TAB = "xpath://XCUIElementTypeButton[@name='Объекты']";
        SEARCH_HISTORY_BUTTON = "id:\uEE4A История поиска";
        OBJECT_CODE_FIELD = "xpath:(//XCUIElementTypeOther[@name='Код объекта'])[2]";
        OBJECT_CODE_INPUT_FIELD = "xpath:(//XCUIElementTypeOther[@name='Код объекта'])[2]";
        SHOW_OBJECTS_BUTTON = "xpath://XCUIElementTypeOther[@name='Показать 1 объект']";
        HISTORY_SEARCH_OBJECTS_BUTTON = "xpath://XCUIElementTypeOther[@name='Показать 1 объект']";
        MAP_LIST_FILTER = "xpath:(//XCUIElementTypeOther[@name='\uEAFD Карта'])[2]";
        OBJECT_PRICE_TPL = "xpath:(//XCUIElementTypeOther[contains(@name,'{price} тыс. ₽')]";
        SEARCH_HISTORY_OBJECT_CODE_TPL = "xpath://*[contains(@text,'Код объекта: {object_code}')]";
        ACCEPT_BUTTON = "id:com.riesapp:id/trainingSubmit";
        SEARCH_TOPBAR_TITLE = "id:Поиск";
        HISTORY_SEARCH_TOPBAR_TITLE = "id:История поиска";
        OBJECTS_ID = "id=#{object_code}";
        UPPER_PARAM_FIELD = "id:\uEAB1 Квартира, Продажа, Удаленные, Создан 3 мая 2023";
        LOWER_PARAM_FIELD = "xpath://XCUIElementTypeStaticText[@name='Тюмень, 2 мкр, ул.1 мкрю, 11, под. 3, кв. 2']";
        READY_NUMBERKEYBOARD_BUTTON = "id:Готово";
        MY_OBJECTS_BUTTON = "id:Мои объекты";

    }
    public void enterObjectCode(String object_code){
        this.waitForElementAndClick(OBJECT_CODE_FIELD, "Cannot see code input field", 3);
        this.waitForElementAndSendKeys(OBJECT_CODE_INPUT_FIELD, object_code, "Cannot find and send code", 3);
    }

    public void clickSearchObjects(){
        this.waitForElementAndClick(SHOW_OBJECTS_BUTTON, "Cannot find and click Search objects button", 3);
        this.waitForElementPresent(MAP_LIST_FILTER, "Cannot see map-list filter", 3);
    }

    public void clickShowHistorySearchObjects(){
        this.waitForElementAndClick(HISTORY_SEARCH_OBJECTS_BUTTON, "Cannot find and click Search objects button", 3);
        this.waitForElementPresent(MAP_LIST_FILTER, "Cannot see map-list filter", 3);
    }

    public void clickPopupAccept(){
        this.waitForElementAndClick(ACCEPT_BUTTON, "Cannot find and click Accept button", 3);
    }
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
    public void assertIfAllParametersPresent(){
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
    public void backToSearchHistory(){
        this.waitForElementAndClick(OBJECTS_TAB,
                "Cannot find and click Objects tab",
                3);
        this.waitForElementAndClick(SEARCH_HISTORY_BUTTON,
                "Cannot find and click Search history button",
                3);
    }

    private static String getObjectXpathByCode(String object_code){
        return SEARCH_HISTORY_OBJECT_CODE_TPL.replace("{object_code}", object_code);
    }
    public void openHistoryStoryByObjectCode(String object_code){
        String object_code_xpath = getObjectXpathByCode(object_code);
        this.waitForElementAndClick(
                object_code_xpath,
                "Cannot find Object by code",
                5
        );
    }
}
