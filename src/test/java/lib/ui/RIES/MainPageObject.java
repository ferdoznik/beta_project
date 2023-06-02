package lib.ui.RIES;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Attachment;
import lib.Platform;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriverException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;
import java.util.regex.Pattern;

public class MainPageObject {

    protected RemoteWebDriver driver;

    public MainPageObject(RemoteWebDriver driver) {
        this.driver = driver;
    }

    public WebElement waitForElementPresent(String locator, String error_message, long timeoutInSeconds) {
        By by = this.getLocatorByString(locator);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.withMessage(error_message + "\n");
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(by)
        );
    }

    public WebElement waitForElementPresent(String locator, String error_message) {
        return waitForElementPresent(locator, error_message, 5);
    }

    public WebElement waitForElementAndClick(String locator, String error_message, long TimeoutInSeconds) {
        WebElement element = waitForElementPresent(locator, error_message, TimeoutInSeconds);
        element.click();
        return element;
    }

    public void tapByCoordinates(int by_x, int by_y){
    RemoteWebDriver remoteDriver = (RemoteWebDriver) driver;
    PerformsTouchActions performsTouchActions = (PerformsTouchActions) remoteDriver;

    int x = by_x; // Specify the x-coordinate where you want to tap
    int y = by_y; // Specify the y-coordinate where you want to tap

            try {
        Thread.sleep(500); // Add a 2-second delay
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    TouchAction touchAction = new TouchAction(performsTouchActions);
            touchAction.tap(PointOption.point(x, y)).perform();
    }

    public WebElement waitForElementAndSendKeys(String locator, String value, String error_message, long timeoutInSeconds) {
        WebElement element = waitForElementPresent(locator, error_message, timeoutInSeconds);
        element.sendKeys(value);
        return element;
    }

    public boolean waitForElementNotPresent(String locator, String error_message, long timeoutInSeconds) {
        By by = getLocatorByString(locator);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.withMessage(error_message + "\n");
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public WebElement waitForElementAndClear(String locator, String error_message, long timeoutInSeconds) {
        WebElement element = waitForElementPresent(locator, error_message, timeoutInSeconds);
        element.clear();
        return element;
    }

    //        public void swipeUp(int timeOfSwipe)
//    {
//        TouchAction action = new TouchAction(driver);
//        Dimension size = driver.manage().window().getSize();
//        int x = size.width / 2;
//        int start_y = (int) (size.height * 0.8);
//        int end_y = (int) (size.height * 0.2);
//
//        action.press(x, start_y).waitAction(timeOfSwipe).moveTo(x, end_y).release().perform();
//    }
    public void swipeUp(int timeOfSwipe) {
        if(driver instanceof AppiumDriver) {
            TouchAction action = new TouchAction((PerformsTouchActions)driver);
            Dimension size = driver.manage().window().getSize();
            int x = size.width / 2;
            int start_y = (int) (size.height * 0.8);
            int end_y = (int) (size.height * 0.2);
            action.press(PointOption.point(x, start_y))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(timeOfSwipe)))
                    .moveTo(PointOption.point(x, end_y)).release().perform();
        } else {
            System.out.println("Method swipeUp does nothing for platform" + Platform.getInstance().getPlatformVar());
        }
    }

    public void swipeUpQuick() {
        swipeUp(200);
    }

    public void swipeUpToFindElement(String locator, String error_message, int max_swipes) {
        By by = this.getLocatorByString(locator);
        int already_swiped = 0;
        while (driver.findElements(by).size() == 0) {

            if (already_swiped > max_swipes) {
                waitForElementPresent(locator, "Cannot find element by swiping up. \n" + error_message, 0);
                return;
            }
            swipeUpQuick();
            ++already_swiped;
        }
    }

    public void swipeElementToLeft(String locator, String error_message) {
        if (driver instanceof AppiumDriver) {
            WebElement element = waitForElementPresent(
                    locator,
                    error_message,
                    10);
            int left_x = element.getLocation().getX();
            int right_x = left_x + element.getSize().getWidth();
            int upper_y = element.getLocation().getY();
            int lower_y = upper_y + element.getSize().getHeight();
            int middle_y = (upper_y + lower_y) / 2;

            TouchAction action = new TouchAction((PerformsTouchActions) driver);
            action.press(PointOption.point(right_x, middle_y));
            action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(150)))
                    .moveTo(PointOption.point(left_x, middle_y));

            if (Platform.getInstance().isAndroid()) {
                action.moveTo(PointOption.point(left_x, middle_y));
            } else {
                int offset_x = (-1 * element.getSize().getWidth());
                action.moveTo(PointOption.point(offset_x, 0));
            }
            action.release();
            action.perform();
        } else {
            System.out.println("Method swipeElementToLeft does nothing for platform" + Platform.getInstance().getPlatformVar());
        }
    }

    public int getAmountOfElements(String locator) {
        By by = this.getLocatorByString(locator);
        List elements = driver.findElements(by);
        return elements.size();
    }

    public String waitForElementAndGetAttribute(String locator, String attribute, String error_message, long timeoutInSeconds) {
        WebElement element = waitForElementPresent(locator, error_message, timeoutInSeconds);
        return element.getAttribute(attribute);
    }

    public void assertElementNotPresent(String locator, String error_message) {
        int amount_of_elements = getAmountOfElements(locator);
        if (amount_of_elements < 1) {
            String default_message = "An element '" + locator + "' is not there";
            throw new AssertionError(default_message + "" + error_message);
        }
    }

    public void assertElementIsPresent(String locator, String error_message) {
        int amount_of_elements = getAmountOfElements(locator);
        if (amount_of_elements < 1) {
            String default_message = "An element '" + locator + "' is not there";
            throw new AssertionError(default_message + "" + error_message);
        }
    }

    private By getLocatorByString(String locator_with_type) {
        String[] exploded_locator = locator_with_type.split(Pattern.quote(":"), 2);
        String by_type = exploded_locator[0];
        String locator = exploded_locator[1];

        if (by_type.equals("xpath")) {
            return By.xpath(locator);
        } else if (by_type.equals("id")) {
            return By.id(locator);
        } else if (by_type.equals("css")) {
            return By.cssSelector(locator);
        } else {
            throw new IllegalArgumentException("Cannot get type of locator" + "" + locator_with_type);
        }
    }

    public void swipeUpTillElementAppear(String locator, String error_message, int max_swipes) {
        int already_swiped = 0;
        while (!this.isElementLocatedOnTheScreen(locator)) {
            if (already_swiped > max_swipes) {
                Assert.assertTrue(error_message, this.isElementLocatedOnTheScreen(locator));
            }
            swipeUpQuick();
            ++already_swiped;
        }
    }

    public boolean isElementLocatedOnTheScreen(String locator) {
        int element_locator_by_y = this.waitForElementPresent(locator, "Cannot find the element by locator", 5).getLocation().getY();
//        if (Platform.getInstance().isMW()) {
//            JavascriptExecutor JSExecutor = (JavascriptExecutor) driver;
//            Object js_result = JSExecutor.executeScript("return window.pageYOffset");
//            element_locator_by_y -= Integer.parseInt(js_result.toString());
//        }
        int screen_size_by_y = driver.manage().window().getSize().getHeight();
        return element_locator_by_y < screen_size_by_y;
    }

    public void tapElementAndHold(int hold_msec) {
//        int left_x = element.getLocation().getX();
//        int right_x = left_x + element.getSize().getWidth();
//        int upper_y = element.getLocation().getY();
//        int lower_y = upper_y + element.getSize().getHeight();
//        int middle_y = (upper_y + lower_y) / 2;

        TouchAction action = new TouchAction((PerformsTouchActions) driver);
        action.press(PointOption.point(40, 740))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(hold_msec)))
                .release()
                .perform();
    }

    public void clickElementToTheRightUpperCorner(String locator, String error_message) {
        if (driver instanceof AppiumDriver) {
            WebElement element = this.waitForElementPresent(locator, error_message);
            int right_x = element.getLocation().getX();
            int upper_y = element.getLocation().getY();
            int lower_y = upper_y + element.getSize().getWidth();
            int middle_y = (upper_y + lower_y) / 2;
            int width = element.getSize().getWidth();

            int point_to_click_x = (right_x + width) - 3;
            int point_to_click_y = middle_y;

            TouchAction action = new TouchAction((PerformsTouchActions) driver);
            action.tap(PointOption.point(point_to_click_x, point_to_click_y)).perform();
        } else {
            System.out.println("Method clickElementToTheRightUpperCorner does nothing for platform" + Platform.getInstance().getPlatformVar());
        }
    }

    public void scrollWebPageUp() {
        if (Platform.getInstance().isMW()) {
            JavascriptExecutor JSExecutor = (JavascriptExecutor) driver;
            JSExecutor.executeScript("window.ScrollBy(0,250)");
        } else {
            System.out.println("Method scrollWebPageUp does nothing for platform" + Platform.getInstance().getPlatformVar());
        }
    }

    public void scrollWebPageTillElementNotVisible(String locator, String error_message, int max_swipes) {
        int already_swiped = 0;

        WebElement element = this.waitForElementPresent(locator, error_message);

        while (!this.isElementLocatedOnTheScreen(locator)) {
            scrollWebPageUp();
            ++already_swiped;
            if (already_swiped > max_swipes) {
                Assert.assertTrue(error_message, element.isDisplayed());
            }
        }
    }

    public boolean isElementPresent(String locator) {
        return getAmountOfElements(locator) > 0;
    }

    public void tryClickElementWithSeveralAttempts(String locator, String error_message, int amount_of_attempts) {
        int current_attempts = 0;
        boolean need_more_attempts = true;

        while (need_more_attempts) {
            try {
                this.waitForElementAndClick(locator, error_message, 1);
                need_more_attempts = false;
            } catch (Exception e) {
                if (current_attempts > amount_of_attempts) {
                    this.waitForElementAndClick(locator, error_message, 1);
                }
            }
            ++current_attempts;
        }
    }
    public void hideKeyboard() {
                if (driver instanceof AndroidDriver) {
                    try {
                        ((AndroidDriver) driver).hideKeyboard();
                    } catch (WebDriverException e) {
                        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
                    }
                } else if (driver instanceof IOSDriver) {
                    WebElement activeElement = null;
                    try {
                        activeElement = driver.switchTo().activeElement();
                    } catch (NoSuchElementException e) {
                        // Handle the case when there is no active element
                    }
                    if (activeElement != null) {
                        activeElement.sendKeys(Keys.RETURN);}
                }
    }

//    public void tapByCoordinatesWE(int x, int y) {
//        WebDriver webDriver = (WebDriver) driver;
//
//        try {
//            Thread.sleep(2000); // Add a 2-second delay
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        Actions actions = new Actions(webDriver);
//        WebElement body = webDriver.findElement(By.cssSelector("body")); // Find the <body> element using CSS selector
//        actions.moveToElement(body, x, y).click().perform(); // Perform the tap action at the specified coordinates
//    }

    public String takeScreenshot(String name) {
        TakesScreenshot ts = this.driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir") + "\\target\\" + name + "_screenshot.png";
        try {
            FileUtils.copyFile(source, new File(path));
            System.out.printf("Screenshot was made: %s%n", path);
        } catch (Exception e) {
            System.out.printf("Error! Cannot make a screenshot due to error: %s%n", e.getMessage());
        }
        return path;
    }

    @Attachment
    public static byte[] screenshot(String path) {
        byte[] bytes = new byte[0];
        try {
            bytes = Files.readAllBytes(Paths.get(path));
        } catch (IOException e) {
            System.out.printf("Error! Cannot get bytes from the screenshot due to error: %s%n", e.getMessage());
        }
        return bytes;
    }

    public void tapOutsideKeyboard() {
        if (driver instanceof PerformsTouchActions) {
            PerformsTouchActions touchDriver = (PerformsTouchActions) driver;
            try {
                WebElement activeElement = driver.switchTo().activeElement();
                int x = activeElement.getLocation().getX();
                int y = activeElement.getLocation().getY();
                TouchAction touchAction = new TouchAction(touchDriver);
                touchAction.tap(PointOption.point(x, y)).perform();
            } catch (NoSuchElementException e) {
                // Handle the case when there is no active element
            }
        }
    }
    public void clickToSystemBack(){
        driver.navigate().back();
    }

    public void tapOutside(){
    TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
    int topY = driver.manage().window().getSize().height / 9;
    int pressX = driver.manage().window().getSize().width / 2;
        touchAction.tap(new PointOption().withCoordinates(pressX, topY)).perform();}

    public void waitForTwoSecond() throws InterruptedException
    {
        Thread.sleep(1300);}
}