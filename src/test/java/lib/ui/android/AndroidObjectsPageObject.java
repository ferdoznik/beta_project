package lib.ui.android;

import lib.ui.RIES.ObjectsPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidObjectsPageObject extends ObjectsPageObject {

    static {
        OBJECTS_TAB = "xpath://*[contains(@text,'Объекты')]";
        SEARCH_HISTORY_BUTTON = "xpath://*[contains(@text,'История поиска')]";
        OBJECT_CODE_FIELD = "xpath://*[contains(@text,'Коды объектов')]";
        OBJECT_CODE_INPUT_FIELD = "xpath://*[contains(@text,'Коды объектов')]/preceding-sibling::*";
        SHOW_OBJECTS_BUTTON = "id:com.riesapp.debug:id/searchButton";
        HISTORY_SEARCH_OBJECTS_BUTTON = "id:com.riesapp:id/detailedSearchHistoryObjectsButton";
        MAP_LIST_FILTER = "xpath://*[contains(@text,'Фильтр')]";
        OBJECT_PRICE_TPL = "xpath://*[contains(@text,'{price} ₽')]";
        MY_OBJECTS_BUTTON = "xpath://*[contains(@text,'Мои объекты')]";
        SEARCH_HISTORY_OBJECT_CODE_TPL = "xpath://*[contains(@text,'Код объекта: {object_code}')]";
        ACCEPT_BUTTON = "id:com.riesapp.debug:id/trainingSubmit";
        UPPER_PARAM_FIELD = "xpath://*[contains(@text,'Квартира, Продажа, Активный, Создан сегодня в 17:01')]";
//        UPPER_PARAM_FIELD = "xpath://*[contains(@text,'Квартира, Продажа, Активный, Создан 04 июня 2023')]";
        LOWER_PARAM_FIELD = "xpath://*[contains(@text,'Тюмень, Севастопольская улица, 11а, под. 1, кв. 123 ')]";
    }
    public AndroidObjectsPageObject(RemoteWebDriver driver) {super(driver);}
}
