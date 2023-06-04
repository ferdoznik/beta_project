package lib.ui.factories;

import lib.Platform;
import lib.ui.RIES.ObjectsPageObject;
import lib.ui.android.AndroidObjectsPageObject;
import lib.ui.ios.IOSObjectsPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ObjectsPageObjectFactory
{
    public static ObjectsPageObject get(RemoteWebDriver driver)
    {
        if (Platform.getInstance().isAndroid()){
            return new AndroidObjectsPageObject(driver);
        } else {
            return new IOSObjectsPageObject(driver);
        }
    }
}