package lib.ui.factories;

import lib.Platform;
import lib.ui.RIES.TicketsPageObject;
import lib.ui.android.AndroidTicketsPageObject;
import lib.ui.ios.IOSTicketsPageObject;
import lib.ui.mobile.web.MWTicketsPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TicketsPageObjectFactory
{
    public static TicketsPageObject get(RemoteWebDriver driver)
    {
        if (Platform.getInstance().isAndroid()){
            return new AndroidTicketsPageObject(driver);
        } else if (Platform.getInstance().isIOS()) {
            return new IOSTicketsPageObject(driver);
        } else {
            return new MWTicketsPageObject(driver);
        }
    }
}