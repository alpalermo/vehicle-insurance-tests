package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {

	private static String OS = System.getProperty("os.name").toLowerCase();
	
	private static boolean isWindows() {

		return (OS.indexOf("win") >= 0);

	}

	private static boolean isLinux() {

		return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 );
	}
	
	private static String obterDriver() {
		String dir = System.getProperty("user.dir").replace("automacao",  "") + "/webdrivers/";
		
		if(isWindows())
			dir += "windows/chromedriver.exe";
		else if(isLinux())
			dir += "linux/chromedriver";
		
		return dir;
	}
	
    public static WebDriver createWebDriver (String browserType) throws Exception {

        WebDriver webDriver;

        if (browserType.toLowerCase().equals("chrome")){
            System.setProperty("webdriver.chrome.driver", obterDriver());

            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--incognito");
            chromeOptions.addArguments("--start-maximized");
            chromeOptions.addArguments("--ignore-certificate-errors");

            webDriver = new ChromeDriver(chromeOptions);
            webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            return webDriver;
        } else {
            throw new Exception("Navegador não suportado: " + browserType);
        }
    }
}
