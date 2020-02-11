package core.driver;

import core.exceptions.ConfigurationException;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@Slf4j
public class DriverFactory {

    private static final String DRIVER_NAME_PROPERTY = "driver.name";

    public static WebDriver createNewWebDriverInstance() {
        String driverName = System.getProperty(DRIVER_NAME_PROPERTY).toUpperCase();
        log.debug("Create WebDriver Instance for {}", driverName);
        switch (driverName) {
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            default:
                log.error("Browser '{}' is not supported", driverName);
                throw new ConfigurationException("Browser '" + driverName + "' is not supported");
        }
    }
}
