package lib.ui.ios;

import lib.ui.RIES.TicketsPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class IOSTicketsPageObject extends TicketsPageObject {

    public IOSTicketsPageObject(RemoteWebDriver driver) {super(driver);}

    static {
        OBJECTS_TAB = "xpath://XCUIElementTypeButton[@name='Объекты']";
        TICKETS_TAB = "xpath://XCUIElementTypeButton[@name='Заявки']";
        CREATE_NEW_TICKET_BUTTON = "xpath://XCUIElementTypeOther[@name='Создать заявку']";
        SAVE_TICKET_BUTTON = "id:Создать";
        PHONE_NUMBER_FIELD = "xpath:(//XCUIElementTypeOther[@name='Телефон *'])[2]";
        EDIT_PHONE_NUMBER_FIELD = "xpath:(//XCUIElementTypeOther[@name='Телефон *'])[2]";
        CLIENT_NAME_FOR_TICKET_FIELD = "xpath:(//XCUIElementTypeOther[@name='Имя *'])[2]";
        EDIT_CLIENT_NAME_FOR_TICKET_FIELD = "xpath:(//XCUIElementTypeOther[@name='Имя *'])[2]";
        CREATE_TICKET_COMMENTARY_FIELD = "xpath:(//XCUIElementTypeOther[@name='Комментарий *'])[2]";
        TICKETS_TYPE_MODAL = "id:Тип заявки Продажа вторичная \uECC1";
        BUY_FLAT_TICKET_TYPE="xpath:(//XCUIElementTypeOther[@name='Покупка вторичной \uE902'])[2]";
        BUY_GARAGE_TICKET_TYPE = "xpath:(//XCUIElementTypeOther[@name='Продажа гаражи \uE902'])[2]";
        SELL_FLATS_TYPE = "xpath://*[@name='Продажа вторичная']";
        CLIENTS_FIO_ON_TICKET_CARD_TPL = "xpath:(//XCUIElementTypeOther[@name='\uEB8C Клиент {first_name}'])[2]";
        CLOSE_CROSS_BUTTON = "xpath:(//XCUIElementTypeOther[@name='Отмена'])[3]";
        CREATE_OBJECT_BUTTON = "xpath:(//XCUIElementTypeOther[@name='Создать объект'])[2]";
        TYPE_OF_ESTATE = "xpath://*[@name='Тип недвижимости *']";
        CITY_FILTER = "xpath://*[@name='Город *']";
        CITY_IS_TYUMEN = "id:com.riesapp:id/topBarSearchEditname";
        APPROVE_CITY_IS_TYUMEN = "xpath://*[@name='Тюмень']";
        TYPE_OF_ESTATE_IS_FLAT = "xpath://*[@name='Квартира']";
        REGION_FILTER_FOR_ADDRESS = "xpath://*[@name='Район *']";
        REGION_IS_2MCR = "xpath://*[@name='2 мкр']";
        STREET_FILTER_FOR_ADDRESS = "xpath://*[@name='Улица *']";
        STREET_IS_1MCR = "xpath://*[@name='1 мкр.']";
        HOUSE_NUMBER_FILED = "xpath://*[@name='Номер дома *']";
        HOUSE_NUMBER_FILED_EDIT = "xpath://*[@name='Номер дома *']/preceding-sibling::*";
        FLAT_NUMBER_FILED = "xpath://*[@name='Квартира *']";
        FLAT_NUMBER_FILED_EDIT = "xpath://*[@name='Квартира *']/preceding-sibling::*";
        ENTRANCE_SECTION_FILED = "xpath://*[@name='Подъезд/Блок-секция *']";
        ENTRANCE_SECTION_FILED_EDIT = "xpath://*[@name='Подъезд/Блок-секция *']/preceding-sibling::*";
        CONTINUE_BUTTON = "id:com.riesapp:id/saveButtonV2";
        WALLS_MATERIAL_FILTER = "xpath://*[@name='Материал стен *']";
        TYPE_OF_WALL_IS_BLOCKS = "xpath://*[@name='Блочные']";
        SERIES_FILTER = "xpath://*[@name='Серия *']";
        SERIES_TYPE_IS_121 = "xpath://*[@name='121']";
        FLOORS_COUNT_FIELD = "xpath://*[@name='Этажность *']";
        FLOORS_COUNT_FIELD_EDIT = "xpath://*[@name='Этажность *']/preceding-sibling::*";
        PRICE_FIELD = "xpath://*[@name='Цена, тыс. ₽ *']";
        PRICE_FIELD_EDIT = "xpath://*[@name='Цена, тыс. ₽ *']/preceding-sibling::*";
        ROOMS_COUNT_FIELD = "xpath://*[@name='Количество комнат *']";
        ROOMS_COUNT_FIELD_EDIT = "xpath://*[@name='Количество комнат *']/preceding-sibling::*";
        PLAN_TYPE = "xpath://*[@name='Планировка *']";
        PLAN_TYPE_IS_TYPICAL = "xpath://*[@name='Обычная планировка']";
        LOADER = "id:com.riesapp:id/ticketsListLoader";
        SQUARE_OF_ESTATE_FIELD = "xpath://*[@name='Площадь, м² *']";
        SQUARE_OF_ESTATE_FIELD_EDIT = "xpath://*[@name='Площадь, м² *']/preceding-sibling::*";
        SQUARE_OF_KITCHEN_FIELD = "xpath://*[@name='Площадь кухни *']";
        SQUARE_OF_KITCHEN_FIELD_EDIT = "xpath://*[@name='Площадь кухни *']/preceding-sibling::*";
        FLOORS_NUMBER_FIELD = "xpath://*[@name='Этаж *']";
        FLOORS_NUMBER_FIELD_EDIT = "xpath://*[@name='Этаж *']/preceding-sibling::*";
        DESIGN_TYPE = "xpath://*[@name='Отделка *']";
        DESIGN_TYPE_IS_MODERN = "xpath://*[@name='Современный ремонт']";
        DESCRIPTION_FIELD = "xpath://*[@name='Описание']";
        DESCRIPTION_FIELD_EDIT = "xpath://*[@name='Описание']/preceding-sibling::*";
        NOTE_FOR_MYSELF = "xpath://*[@name='Примечание для себя']";
        NOTE_FOR_MYSELF_EDIT = "xpath://*[@name='Примечание для себя']/preceding-sibling::*";
        NOTE_FOR_REALTOR = "xpath://*[@name='Примечание для риелтора']";
        NOTE_FOR_REALTOR_EDIT = "xpath://*[@name='Примечание для риелтора']/preceding-sibling::*";
        SAVE_CREATED_OBJECT_BUTTON = "id:com.riesapp:id/saveButtonV2";
        OBJECT_STATUS_N_ID_IN_TICKET = "xpath://*[contains(@name,'Объект')]";
        OBJECT_ADDRESS_IN_TICKET = "xpath://*[contains(@name,'1 мкр., 11')]";
        TICKET_NAME_AT1 = "xpath://*[@name='Autotest#1']";
        RETURN_BUTTON = "id:Return";
        TICKETS_TOP_BAR = "id:com.riesapp:id/topBarTitle";
    }
}