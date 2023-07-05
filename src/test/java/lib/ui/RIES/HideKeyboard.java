package lib.ui.RIES;

import io.appium.java_client.*;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;
import static io.appium.java_client.MobileCommand.hideKeyboardCommand;

public class HideKeyboard extends MainPageObject {

    public HideKeyboard(RemoteWebDriver driver) {
        super(driver);
    }

    public interface HidesKeyboardWithKeyName extends HidesKeyboard {
        default void hideKeyboard(String keyName) {
            CommandExecutionHelper.execute(this, hideKeyboardCommand(keyName));
        }
    }

    public void swipeDown() throws InterruptedException
    {
        Thread.sleep(3000);

        Dimension dimension = driver.manage().window().getSize();
        int end_x = (int)(dimension.width*.5);
        int end_y = (int)(dimension.height*.96);

        int start_x = (int)(dimension.width*.5);
        int start_y = (int)(dimension.height*.35);


        TouchAction action =new TouchAction((PerformsTouchActions) driver);
        action.press(PointOption.point(start_x, start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2200)))
                .moveTo(PointOption.point(end_x, end_y))
                .release()
                .perform();
    }
}
