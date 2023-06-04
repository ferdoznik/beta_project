package lib.ui.ios;

import lib.ui.RIES.TicketsPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class IOSTicketsPageObject extends TicketsPageObject {

    public IOSTicketsPageObject(RemoteWebDriver driver) {super(driver);}

    static {
        OBJECTS_TAB = "xpath://XCUIElementTypeButton[@name='Объекты']";
        TICKETS_TAB = "xpath://XCUIElementTypeButton[@name='Заявки']";
        CREATE_NEW_TICKET_BUTTON = "xpath://XCUIElementTypeOther[@name='Создать заявку']";
        INNER_TICKETS_BUTTON = "xpath://XCUIElementTypeOther[@name='Внутренние заявки 0 \uECC1']";
        MORTGAGE_INNER_TICKET_TYPE = "xpath:(//XCUIElementTypeOther[@name='Ипотека \uE902'])[2]";
        MORTGAGE_ESTATE_PRICE_AMOUNT = "xpath:(//XCUIElementTypeOther[@name='Стоимость недвижимости, ₽'])[2]";
        MORTGAGE_CREATE_COMMENTARY_FIELD = "xpath:(//XCUIElementTypeOther[@name='Комментарий'])[3]";
        MORTGAGE_ARGUMENTS_TYPES = "id:Утверждение к заявке * \uECC1";
        CONTACT_WAYS_BS = "id:Способ связи с клиентом \uECC1";
        MORTGAGE_TICKET_IN_INNER_TICKETS_LIST = "xpath:xpath://*[contains(@name,'Ипотека')]\"";
        CREATE_MORTGAGE_TICKET_BUTTON = "xpath:(//XCUIElementTypeOther[@name='Создать'])[2]";
        MORTGAGE_AVAILABLE_MONEY_AMOUNT = "xpath:(//XCUIElementTypeOther[@name='Собственные средства, ₽'])[2]";
        CREATE_INNER_TICKET_BUTTON = "id:Создать заявку";
        SAVE_TICKET_BUTTON = "id:Создать";
        PHONE_NUMBER_FIELD = "xpath:(//XCUIElementTypeOther[@name='Телефон *'])[2]";
        EDIT_PHONE_NUMBER_FIELD = "xpath:(//XCUIElementTypeOther[@name='Телефон *'])[2]";
        CLIENT_NAME_FOR_TICKET_FIELD = "xpath:(//XCUIElementTypeOther[@name='Имя *'])[2]";
        EDIT_CLIENT_NAME_FOR_TICKET_FIELD = "xpath:(//XCUIElementTypeOther[@name='Имя *'])[2]";
        CREATE_TICKET_COMMENTARY_FIELD = "xpath:(//XCUIElementTypeOther[@name='Комментарий *'])[2]";
        TICKETS_TYPE_MODAL = "xpath://*[@name='Межрегиональная']/preceding-sibling::*";
        BUY_FLAT_TICKET_TYPE="xpath:(//XCUIElementTypeOther[@name='Покупка вторичной \uE902'])[2]";
        BUY_GARAGE_TICKET_TYPE = "xpath:(//XCUIElementTypeOther[@name='Покупка гаражи \uE902'])[2]";
        SELL_FLATS_TYPE = "xpath://*[@name='Продажа вторичная']";
        CLIENTS_FIO_ON_TICKET_CARD_TPL = "xpath:(//XCUIElementTypeOther[@name='\uEB8C Клиент {first_name}'])[2]";
        CLOSE_CROSS_BUTTON = "xpath:(//XCUIElementTypeOther[@name='Отмена'])[3]";
        CREATE_OBJECT_BUTTON = "xpath:(//XCUIElementTypeOther[@name='Создать объект'])[2]";
        TYPE_OF_ESTATE_BS = "id:Тип недвижимости * \uECC1";
        CITY_FILTER = "id:Город * Тюмень \uECC1";
        CITY_IS_TYUMEN = "id:Поиск";
        APPROVE_CITY_IS_TYUMEN = "xpath:(//XCUIElementTypeOther[@name='Тюмень \uE901'])[2]";
        TYPE_OF_ESTATE_IS_FLAT = "xpath://*[@name='Квартира']";
        REGION_FILTER_FOR_ADDRESS = "id:Район * \uECC1";
        REGION_IS_2MCR = "xpath:(//XCUIElementTypeOther[@name='2 мкр \uE902'])[3]";
        STREET_FILTER_FOR_ADDRESS = "id:Улица * \uECC1";
        STREET_IS_1MCR = "xpath:(//XCUIElementTypeOther[@name='1 мкр. \uE902'])[3]";
        HOUSE_NUMBER_FILED = "id:Номер дома *";
        HOUSE_NUMBER_FILED_EDIT = "id:Номер дома *";
        FLAT_NUMBER_FILED = "xpath:(//XCUIElementTypeOther[@name='Квартира *'])[2]";
        FLAT_NUMBER_FILED_EDIT = "xpath:(//XCUIElementTypeOther[@name='Квартира *'])[2]";
        ENTRANCE_SECTION_FILED = "xpath:(//XCUIElementTypeOther[@name='Подъезд/Блок-секция *'])[2]";
        ENTRANCE_SECTION_FILED_EDIT = "xpath:(//XCUIElementTypeOther[@name='Подъезд/Блок-секция *'])[2]";
        CONTINUE_BUTTON = "xpath:(//XCUIElementTypeOther[@name='Продолжить'])[2]";
        WALLS_MATERIAL_FILTER = "id:Материал стен * \uECC1";
        TYPE_OF_WALL_IS_BLOCKS = "xpath:(//XCUIElementTypeOther[@name='Блочные \uE902'])[2]";
        SERIES_FILTER = "id:Серия * \uECC1";
        SERIES_TYPE_IS_121 = "xpath:(//XCUIElementTypeOther[@name='121 \uE902'])[3]";
        FLOORS_COUNT_FIELD = "xpath:(//XCUIElementTypeOther[@name='Этажность *'])[3]";
        FLOORS_COUNT_FIELD_EDIT = "xpath:(//XCUIElementTypeOther[@name='Этажность *'])[3]";
        PRICE_FIELD = "xpath:(//XCUIElementTypeOther[@name='Цена, тыс. ₽ *'])[2]";
        PRICE_FIELD_EDIT = "xpath:(//XCUIElementTypeOther[@name='Цена, тыс. ₽ *'])[2]";
        ROOMS_COUNT_FIELD = "xpath:(//XCUIElementTypeOther[@name='Количество комнат *'])[2]";
        ROOMS_COUNT_FIELD_EDIT = "xpath:(//XCUIElementTypeOther[@name='Количество комнат *'])[2]";
        PLAN_TYPE = "id:Планировка * Обычная планировка \uECC1";
        PLAN_TYPE_IS_TYPICAL = "xpath://*[@name='Обычная планировка']";
        LOADER = "id:com.riesapp:id/ticketsListLoader";
        SQUARE_OF_ESTATE_FIELD = "xpath:(//XCUIElementTypeOther[@name='Площадь, м² *'])[2]";
        SQUARE_OF_ESTATE_FIELD_EDIT = "xpath:(//XCUIElementTypeOther[@name='Площадь, м² *'])[2]";
        SQUARE_OF_KITCHEN_FIELD = "xpath:(//XCUIElementTypeOther[@name='Площадь кухни *'])[2]";
        SQUARE_OF_KITCHEN_FIELD_EDIT = "xpath:(//XCUIElementTypeOther[@name='Площадь кухни *'])[2]";
        FLOORS_NUMBER_FIELD = "xpath:(//XCUIElementTypeOther[@name='Этаж *'])[2]";
        FLOORS_NUMBER_FIELD_EDIT = "xpath:(//XCUIElementTypeOther[@name='Этаж *'])[2]";
        DESIGN_TYPE = "id:Отделка * \uECC1";
        DESIGN_TYPE_IS_MODERN = "xpath://*[@name='Современный ремонт']";
        DESCRIPTION_FIELD = "id:Описание";
        DESCRIPTION_FIELD_EDIT = "id:Описание";
        NOTE_FOR_MYSELF = "id:Примечание для себя";
        NOTE_FOR_MYSELF_EDIT = "id:Примечание для себя";
        NOTE_FOR_REALTOR = "id:Примечание для риелтора";
        NOTE_FOR_REALTOR_EDIT = "id:Примечание для риелтора";
        SAVE_CREATED_OBJECT_BUTTON = "xpath:(//XCUIElementTypeOther[@name='Создать'])[2]";
        OBJECT_STATUS_N_ID_IN_TICKET = "xpath://*[contains(@name,'Объект')]";
        OBJECT_ADDRESS_IN_TICKET = "xpath://*[contains(@name,'1 мкр., 11')]";
        TICKET_NAME_AT1 = "xpath://*[@name='Autotest#1']";
        CANCEL_DOUBLE_CHECK_BUTTON = "xpath:(//XCUIElementTypeOther[@name='Отмена'])[2]";
        TICKETS_TOP_BAR = "id:com.riesapp:id/topBarTitle";
    }
}