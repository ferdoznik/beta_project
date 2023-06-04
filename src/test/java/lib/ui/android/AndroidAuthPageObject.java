package lib.ui.android;

import lib.ui.RIES.AuthPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidAuthPageObject extends AuthPageObject
{
    static {
        LOGIN_FIELD = "xpath://*[contains(@text,'Логин')]";
        PASSWORD_FILED = "xpath://*[contains(@text,'Пароль')]";
        RIES_LOGO = "id:com.riesapp.debug:id/logo_view";
        EDIT_LOGIN_FIELD = "xpath://*[@resource-id='com.riesapp.debug:id/loginTextInput']//*[@resource-id='com.riesapp.debug:id/textFieldEditText']";
        EDIT_PASSWORD_FIELD = "xpath://*[@resource-id='com.riesapp.debug:id/passwordTextInput']//*[@resource-id='com.riesapp.debug:id/textFieldEditText']";
        MY_OBJECTS_SWITCHER = "xpath://*[contains(@text,'Мои объекты')]";
        LOADER = "id:com.riesapp.debug:id/loader";
        LOGIN_BUTTON = "id:com.riesapp.debug:id/authButton";
    }
    public AndroidAuthPageObject(RemoteWebDriver driver) {super(driver);}
}
