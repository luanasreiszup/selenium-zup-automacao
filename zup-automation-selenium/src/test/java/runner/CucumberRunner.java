package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import core.setup.DriverFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		features = "src/test/java/features/",
		plugin = {"pretty", "html:src/test/java/report/html/report.html"},
		tags = "@home", 
		glue = ""
		)
public class CucumberRunner {
	
	@AfterClass
	public static void finalizarRunner() {
		DriverFactory.KillDriver();
	}

}
