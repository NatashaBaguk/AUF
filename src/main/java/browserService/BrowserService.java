package browserService;

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

    public BrowserService() {
        String browserName = new ReadProperties().getBrowserName();

        switch (browserName.toLowerCase()) {
            case "chrome" :
                classLoader("drivers/chromedriver.exe","webdriver.chrome.driver");

                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--disable-gpu");
                chromeOptions.addArguments("--star-maximized");
                chromeOptions.setHeadless(new ReadProperties().isHeadless());

                driver = new ChromeDriver(chromeOptions);
                driver.manage().window().maximize();
                break;

            case "firefox":
                classLoader("drivers/geckodriver.exe","webdriver.gecko.driver");

                driver = new FirefoxDriver();
                break;
            case "ie":
                break;
            case "edge":
                classLoader("drivers/msedgedriver.exe","webdriver.edge.driver");

                driver = new EdgeDriver();
                driver.manage().window().maximize();

                break;
            default:
                System.out.println("Browser is not supported.");
                break;
        }
    }

    private void classLoader (String path, String webdriver){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(path).getFile());
        String absolutePath = file.getAbsolutePath();
        System.setProperty(webdriver, absolutePath);
    }

    public WebDriver getDriver() {
        return driver;
    }
    
}
