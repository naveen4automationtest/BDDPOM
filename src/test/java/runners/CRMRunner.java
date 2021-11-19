package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		publish = true,
		features ="src//test//resources//features//",
		glue = {"POMstepdefs"},
		monochrome = true,
		dryRun = false,
		plugin = {"pretty",
				"html:target/reports/HtmlReport.html",
				"rerun:target/failed_scenarios.txt"
		}
		)
public class CRMRunner extends AbstractTestNGCucumberTests{

		
}
