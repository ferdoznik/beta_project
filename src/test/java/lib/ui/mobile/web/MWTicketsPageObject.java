package lib.ui.mobile.web;

import lib.ui.RIES.TicketsPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MWTicketsPageObject extends TicketsPageObject {

    public MWTicketsPageObject(RemoteWebDriver driver) {super(driver);}

    static {
        OBJECTS_TAB = "xpath://*[contains(@text,'Объекты')]";
        TICKETS_TAB = "xpath://*[contains(@text,'Заявки')]";
        CREATE_NEW_TICKET_BUTTON = "id:com.riesapp:id/ticketsListCreateTicketButton";
        SAVE_TICKET_BUTTON = "id:com.riesapp:id/saveButton";
        PHONE_NUMBER_FIELD = "xpath://*[contains(@text,'Телефон')]";
        EDIT_PHONE_NUMBER_FIELD = "xpath://*[contains(@text,'Телефон')]/preceding-sibling::*";
        CLIENT_NAME_FOR_TICKET_FIELD = "xpath://*[contains(@text,'Имя')]";
        EDIT_CLIENT_NAME_FOR_TICKET_FIELD = "xpath://*[contains(@text,'Имя')]/preceding-sibling::*";
        CREATE_TICKET_COMMENTARY_FIELD = "xpath://*[@text='Комментарий']";
        TICKETS_TYPE_MODAL = "id:com.riesapp:id/cellTextSecondV2";
        BUY_GARAGE_TICKET_TYPE = "xpath://*[@text='Покупка гаражи']";
        SELL_FLATS_TYPE = "xpath://*[@text='Продажа вторичная']";
        CLIENTS_FIO_ON_TICKET_CARD_TPL = "xpath://*[@text='{first_name}']";
        CLOSE_CROSS_BUTTON = "id:com.riesapp:id/topBarNavigationIcon";
        CREATE_OBJECT_BUTTON = "id:com.riesapp:id/createObject";
        TYPE_OF_ESTATE = "xpath://*[@text='Тип недвижимости *']";
        CITY_FILTER = "xpath://*[@text='Город *']";
        CITY_IS_TYUMEN = "id:com.riesapp:id/topBarSearchEditText";
        APPROVE_CITY_IS_TYUMEN = "xpath://*[@text='Тюмень']";
        TYPE_OF_ESTATE_IS_FLAT = "xpath://*[@text='Квартира']";
        REGION_FILTER_FOR_ADDRESS = "xpath://*[@text='Район *']";
        REGION_IS_2MCR = "xpath://*[@text='2 мкр']";
        STREET_FILTER_FOR_ADDRESS = "xpath://*[@text='Улица *']";
        STREET_IS_1MCR = "xpath://*[@text='1 мкр.']";
        HOUSE_NUMBER_FILED = "xpath://*[@text='Номер дома *']";
        HOUSE_NUMBER_FILED_EDIT = "xpath://*[@text='Номер дома *']/preceding-sibling::*";
        FLAT_NUMBER_FILED = "xpath://*[@text='Квартира *']";
        FLAT_NUMBER_FILED_EDIT = "xpath://*[@text='Квартира *']/preceding-sibling::*";
        ENTRANCE_SECTION_FILED = "xpath://*[@text='Подъезд/Блок-секция *']";
        ENTRANCE_SECTION_FILED_EDIT = "xpath://*[@text='Подъезд/Блок-секция *']/preceding-sibling::*";
        CONTINUE_BUTTON = "id:com.riesapp:id/saveButtonV2";
        WALLS_MATERIAL_FILTER = "xpath://*[@text='Материал стен *']";
        TYPE_OF_WALL_IS_BLOCKS = "xpath://*[@text='Блочные']";
        SERIES_FILTER = "xpath://*[@text='Серия *']";
        SERIES_TYPE_IS_121 = "xpath://*[@text='121']";
        FLOORS_COUNT_FIELD = "xpath://*[@text='Этажность *']";
        FLOORS_COUNT_FIELD_EDIT = "xpath://*[@text='Этажность *']/preceding-sibling::*";
        PRICE_FIELD = "xpath://*[@text='Цена, тыс. ₽ *']";
        PRICE_FIELD_EDIT = "xpath://*[@text='Цена, тыс. ₽ *']/preceding-sibling::*";
        ROOMS_COUNT_FIELD = "xpath://*[@text='Количество комнат *']";
        ROOMS_COUNT_FIELD_EDIT = "xpath://*[@text='Количество комнат *']/preceding-sibling::*";
        PLAN_TYPE = "xpath://*[@text='Планировка *']";
        PLAN_TYPE_IS_TYPICAL = "xpath://*[@text='Обычная планировка']";
        LOADER = "id:com.riesapp:id/ticketsListLoader";
        SQUARE_OF_ESTATE_FIELD = "xpath://*[@text='Площадь, м² *']";
        SQUARE_OF_ESTATE_FIELD_EDIT = "xpath://*[@text='Площадь, м² *']/preceding-sibling::*";
        SQUARE_OF_KITCHEN_FIELD = "xpath://*[@text='Площадь кухни *']";
        SQUARE_OF_KITCHEN_FIELD_EDIT = "xpath://*[@text='Площадь кухни *']/preceding-sibling::*";
        FLOORS_NUMBER_FIELD = "xpath://*[@text='Этаж *']";
        FLOORS_NUMBER_FIELD_EDIT = "xpath://*[@text='Этаж *']/preceding-sibling::*";
        DESIGN_TYPE = "xpath://*[@text='Отделка *']";
        DESIGN_TYPE_IS_MODERN = "xpath://*[@text='Современный ремонт']";
        DESCRIPTION_FIELD = "xpath://*[@text='Описание']";
        DESCRIPTION_FIELD_EDIT = "xpath://*[@text='Описание']/preceding-sibling::*";
        NOTE_FOR_MYSELF = "xpath://*[@text='Примечание для себя']";
        NOTE_FOR_MYSELF_EDIT = "xpath://*[@text='Примечание для себя']/preceding-sibling::*";
        NOTE_FOR_REALTOR = "xpath://*[@text='Примечание для риелтора']";
        NOTE_FOR_REALTOR_EDIT = "xpath://*[@text='Примечание для риелтора']/preceding-sibling::*";
        SAVE_CREATED_OBJECT_BUTTON = "id:com.riesapp:id/saveButtonV2";
        OBJECT_STATUS_N_ID_IN_TICKET = "xpath://*[contains(@text,'Объект')]";
        OBJECT_ADDRESS_IN_TICKET = "xpath://*[contains(@text,'1 мкр., 11')]";
        TICKET_NAME_AT1 = "xpath://*[@text='Autotest#1']";
        TICKETS_TOP_BAR = "id:com.riesapp:id/topBarTitle";
    }
}