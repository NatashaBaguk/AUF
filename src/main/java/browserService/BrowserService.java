package browserService;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;

public class BrowserService {
    private WebDriver driver = null;
    private DriverManagerType driverManagerType = null;

    public BrowserService() {
        String browserName = new ReadProperties().getBrowserName();

        switch (browserName.toLowerCase()) {
            case "chrome" :
                driverManagerType = DriverManagerType.CHROME;
                WebDriverManager.getInstance(driverManagerType).setup();

                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--disable-gpu");
                chromeOptions.addArguments("--star-maximized");
                chromeOptions.setHeadless(new ReadProperties().isHeadless());

                driver = new ChromeDriver(chromeOptions);
                driver.manage().window().maximize();
                break;

            case "firefox":
                driverManagerType = DriverManagerType.FIREFOX;
                WebDriverManager.getInstance(driverManagerType).setup();

                driver = new FirefoxDriver();
                break;
            case "ie":
                driverManagerType = DriverManagerType.IEXPLORER;
                WebDriverManager.getInstance(driverManagerType).setup();
                break;
            case "edge":
                driverManagerType = DriverManagerType.EDGE;
                WebDriverManager.getInstance(driverManagerType).setup();

                driver = new EdgeDriver();
                driver.manage().window().maximize();

                break;
            default:
                System.out.println("Browser is not supported.");
                break;
        }
    }
    public WebDriver getDriver() {
        return driver;
    }
    
}
