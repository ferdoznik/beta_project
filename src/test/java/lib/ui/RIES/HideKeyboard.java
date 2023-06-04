package lib.ui.RIES;

import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;
import static io.appium.java_client.MobileCommand.hideKeyboardCommand;

public class HideKeyboard extends MainPageObject {

    public HideKeyboard(AndroidDriver driver) {
        super(driver);
    }

    public static AndroidDriver driver;

    public static void closeKeyBoard(){
        if(driver.isKeyboardShown()){
            driver.hideKeyboard();
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
