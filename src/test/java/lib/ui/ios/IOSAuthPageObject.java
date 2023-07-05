package lib.ui.ios;

import lib.ui.RIES.AuthPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class IOSAuthPageObject extends AuthPageObject
{
        static {
                LOGIN_FIELD = "xpath:(//XCUIElementTypeOther[@name='Логин'])[2]";
                PASSWORD_FILED = "xpath:(//XCUIElementTypeOther[@name='Пароль'])[2]";
                RIES_LOGO = "id:com.riesapp:id/logo_view";
                EDIT_LOGIN_FIELD = "xpath:(//XCUIElementTypeOther[@name='Логин'])[2]";
                EDIT_PASSWORD_FIELD = "xpath:(//XCUIElementTypeOther[@name='Пароль'])[2]";
                MY_OBJECTS_SWITCHER = "xpath://*[contains(@text,'Рекомендации')]";
                LOADER = "id:com.riesapp:id/loader";
                LOGIN_BUTTON = "id:Войти";
                NOTIFICATION_DIALOGUE_ALLOW = "id:Разрешить";
                NOTIFICATION_DIALOGUE_FOLLOW_ACTIVITY_ACCEPT = "id:Разрешить";
                TITLE_SEARCH_IN_TOPBAR = "id:Поиск";
                SYNC_CATALOGS_SCREEN = "id:Cинхронизация каталогов";
    }
    public IOSAuthPageObject(RemoteWebDriver driver){
        super(driver);
    }

}
