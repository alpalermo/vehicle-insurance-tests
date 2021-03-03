package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {

    private static WebDriver webDriver;

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static void openBrowser(String browserType) throws Exception {
        webDriver = WebDriverFactory.createWebDriver("chrome");
    }


}
