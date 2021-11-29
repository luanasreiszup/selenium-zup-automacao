package core.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		if(driver == null) {
			switch (Propriedades.browsers) {
			case FIREFOX:
				System.setProperty("webdriver.chrome.driver", "src/test/resources/geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				break;
			case CHROME:
				System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				break;
			case HEADLESS:
				ChromeOptions options = new ChromeOptions();
				options.setHeadless(true);
				options.addArguments("--disable-gpu");
				options.addArguments("--windows-size=1400,800");
				driver = new ChromeDriver(options);
				driver.manage().window().maximize();
				break;
			}
		}
		return driver;
	}
	
	public static void KillDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
