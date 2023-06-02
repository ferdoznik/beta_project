package lib.ui.android;

import lib.ui.RIES.ObjectsPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidObjectsPageObject extends ObjectsPageObject {

    static {
        OBJECTS_TAB = "xpath://*[contains(@text,'Объекты')]";
        SEARCH_HISTORY_BUTTON = "xpath://*[contains(@text,'История поиска')]";
        OBJECT_CODE_FIELD = "xpath://*[contains(@text,'Коды объектов')]";
        OBJECT_CODE_INPUT_FIELD = "xpath://*[contains(@text,'Коды объектов')]/preceding-sibling::*";
        SHOW_OBJECTS_BUTTON = "id:com.riesapp:id/searchButton";
        HISTORY_SEARCH_OBJECTS_BUTTON = "id:com.riesapp:id/detailedSearchHistoryObjectsButton";
        MAP_LIST_FILTER = "xpath://*[contains(@text,'Фильтр')]";
        OBJECT_PRICE_TPL = "xpath://*[contains(@text,'{price} тыс. ₽')]";
        MY_OBJECTS_BUTTON = "xpath://*[contains(@text,'Мои объекты')]";
        SEARCH_HISTORY_OBJECT_CODE_TPL = "xpath://*[contains(@text,'Код объекта: {object_code}')]";
        ACCEPT_BUTTON = "id:com.riesapp:id/trainingSubmit";
        UPPER_PARAM_FIELD = "xpath://*[contains(@text,'Квартира, Продажа, Удаленные, Создан 3 мая 2023')]";
        LOWER_PARAM_FIELD = "xpath://*[contains(@text,'Тюмень, 2 мкр, ул.1 мкрю, 11, под. 3, кв. 2 (в черте города)')]";
    }
    public AndroidObjectsPageObject(RemoteWebDriver driver) {super(driver);}
}
