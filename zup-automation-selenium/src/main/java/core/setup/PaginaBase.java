package core.setup;

import static core.setup.DriverFactory.getDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginaBase {
	
	public static WebDriverWait wait = new WebDriverWait(getDriver(), 30);
	
	public PaginaBase(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
