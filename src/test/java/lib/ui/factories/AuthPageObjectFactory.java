package lib.ui.factories;

import lib.Platform;
import lib.ui.RIES.AuthPageObject;
import lib.ui.android.AndroidAuthPageObject;
import lib.ui.ios.IOSAuthPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AuthPageObjectFactory
{
    public static AuthPageObject get(RemoteWebDriver driver)
    {
        if (Platform.getInstance().isAndroid()){
            return new AndroidAuthPageObject(driver);
        } else {
            return new IOSAuthPageObject(driver);
        }
    }
}